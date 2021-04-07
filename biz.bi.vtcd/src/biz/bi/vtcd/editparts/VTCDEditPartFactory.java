package biz.bi.vtcd.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;


public class VTCDEditPartFactory implements EditPartFactory {

  public EditPart createVTCDLinkDependencyElementEditPart(Object model)
	 {
	    return new VTCDLinkDependencyElementEditPart(model);
	 }
  public EditPart createVTCDLinkCombinationEClassEditPart(Object model)
	 {
	    return new VTCDLinkCombinationEClassEditPart(model);
	 }
  public EditPart createVTCDDiagramCombinationEditPart(Object model)
  {
    return new VTCDDiagramCombinationEditPart(model);
  }
  
  public EditPart createVTCDDiagramMainEditPart(Object model)
  {
    return new VTCDDiagramMainEditPart(model);
  }
  
  public EditPart createVTCDFigureCombinationEditPart(Object model)
  {
    return new VTCDFigureCombinationEditPart(model);
  }
  
  public EditPart createVTCDFigureElementEditPart(Object model)
  {
    return new VTCDFigureElementEditPart(model);
  }
  
  public EditPart createVTCDFigureDependencyEditPart(Object model)
  {
    return new VTCDFigureDependencyEditPart(model);
  }
  
  public EditPart createVTCDFigureEquivalenceClassEditPart(Object model)
  {
    return new VTCDFigureEquivalenceClassEditPart(model);
  }

  public EditPart createEditPart(EditPart context, Object model) {
    EditPart part = null;
    if(model instanceof VTCDDiagramMain){
		part = createVTCDDiagramMainEditPart(model);
    }
    else if (model instanceof VTCDDiagramCombination) {
		part = createVTCDDiagramCombinationEditPart(model);		
	}
    else if (model instanceof VTCDFigureElement) {
		part =createVTCDFigureElementEditPart(model);
	}
    else if (model instanceof VTCDFigureCombination) {
		part =createVTCDFigureCombinationEditPart(model);
	}
    else if (model instanceof VTCDFigureDependency) {
		part =createVTCDFigureDependencyEditPart(model);
	}
    else if (model instanceof VTCDFigureEquivalenceClass) {
		part =createVTCDFigureEquivalenceClassEditPart(model);
	}
    else if (model instanceof VTCDLinkDependencyElement) {
		part =createVTCDLinkDependencyElementEditPart(model);
	}
    
    else if (model instanceof VTCDLinkCombinationEClass) {
		part =createVTCDLinkCombinationEClassEditPart(model);
	}
    return part;
  }	
}