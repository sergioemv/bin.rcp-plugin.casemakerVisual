package biz.bi.vbr.gef.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRActionConnectElementValue;
import biz.bi.vbr.vbrvm.VBRActionView;
import biz.bi.vbr.vbrvm.VBRElementConnectElementValue;
import biz.bi.vbr.vbrvm.VBRElementValueConnectAction;
import biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue;
import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRElementView;
import biz.bi.vbr.vbrvm.VBRTreeConnectElementValue;
import biz.bi.vbr.vbrvm.VBRTreeView;


public class VBREditPartFactory implements EditPartFactory{
	 
	
	public EditPart createEditPart(EditPart context, Object model) {
	
		 EditPart part = null;
		 
		 if (model instanceof MainDiagram)
		 {
			  part = createMainDiagramEditPart(model);
     	 }
		 else if (model instanceof VBRTreeView)
		 {
			  part = createVBRTreeViewEditPart(model);
     	 }
		 else if (model instanceof VBRElementView)
		 {
			  part = createVBRElementViewEditPart(model);
     	 }
		 else if (model instanceof VBRElementValueView)
		 {
			  part = createVBRElementValueViewEditPart(model);
     	 }		 
		 
		 else if (model instanceof VBRActionView)
		 {
			  part = createVBRActionViewEditPart(model);
     	 }	
		 
//svonborries 09102005 begin
		 else if (model instanceof VBRActionConnectElementValue){
			 part = createVBRActionConnectElementValueEditPart(model);
		 }
		 //svonborries 09102005 begin		 
		 else if (model instanceof VBRElementConnectElementValue){
			 part = createVBRElementConnectElementValueEditPart(model);
		 }
		 
		 else if (model instanceof VBRElementValueConnectAction){
			 part = createVBRElementValueConnectActionEditPart(model);
		 }
		 //svonborries 09102005 begin		 
		 else if (model instanceof VBRElementValueConnectElementValue){
			 part = createVBRElementValueConnectElementValueEditPart(model);
		 }
		 //svonborries 09102005 begin		 
		 else if (model instanceof VBRTreeConnectElementValue){
			 part = createVBRTreeConnectElementValueEditPart(model);
		 }
		return part;
		
	}
	/**
	 * @param p_model
	 * @return
	 */
	public EditPart createVBRElementValueConnectActionEditPart(Object p_model) {
		
		return new VBRLinkConnectionElementValueToBusinessActionEditPart(p_model);
	}
	 /**
	 * @param p_model
	 * @return
	 */
	public EditPart createVBRTreeConnectElementValueEditPart(Object p_model) {
		return new VBRLinkConnectionBusinessRuleTreeToElementValueEditPart(p_model);
	}
//svonborries 09102005 end
	 /**
	 * @param p_model
	 * @return
	 */
	public EditPart createVBRElementConnectElementValueEditPart(Object p_model) {
		
		return new VBRLinkConnectionElementToElementValue(p_model);
	}
//	svonborries 09102005 end
	 /**
	 * @param p_model
	 * @return
	 */
	public EditPart createVBRElementValueConnectElementValueEditPart(Object p_model) {
		return new VBRLinkConnectionElementValueToElementValueEditPart(p_model);
	}
//	svonborries 09102005 end
	 /**
	 * @param p_model
	 * @return
	 */
	public EditPart createVBRActionConnectElementValueEditPart(Object p_model) {
		// TODO Auto-generated method stub
		return new VBRLinkConnectionBusinessActionToElementValueEditPart(p_model);
	}
//	svonborries 09102005 end
	
	public EditPart createMainDiagramEditPart(Object model) 
	 {	
		return new MainDiagramEditPart(model);
	 }
	 public EditPart createVBRTreeViewEditPart(Object model)
	 {
		    return new VBRTreeViewEditPart(model);
	 }
	 public EditPart createVBRElementValueViewEditPart(Object model)
	 {
		    return new VBRElementValueViewEditPart(model);
	 }
	 public EditPart createVBRElementViewEditPart(Object model)
	 {
		    return new VBRElementViewEditPart(model);
	 }
	 public EditPart createVBRActionViewEditPart(Object model)
	 {
		    return new VBRActionViewEditPart(model);
	 }	
	
}
