/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.outline;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * @author hcanedo
 * @18-08-2005
 * @hcanedo
 */
public class VTCDTreeEditPartFactory implements EditPartFactory {

	private static VTCDTreeEditPartFactory factory;
	/**
	 * 
	 */
	private VTCDTreeEditPartFactory() {
		super();
	}

	public static final VTCDTreeEditPartFactory getInstance() {
		if (factory == null)
			factory = new VTCDTreeEditPartFactory();
		return factory;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	public EditPart createEditPart(EditPart p_context, Object p_model) {
		if (p_model instanceof CMProxyTestObject) {
			return new VTCDTestObjectTreeEditPart(p_model);
		}
		if(p_model instanceof CMProxyEffect){
			return new VTCDEffectTreeEditPart(p_model);
		}
		if(p_model instanceof CMProxyElement){
			return new VTCDElementTreeEditPart(p_model);
		}
		if(p_model instanceof CMProxyDependency){
			return new VTCDDependencyTreeEditPart(p_model);
		}
		if(p_model instanceof CMProxyCombination){
			return new VTCDCombinationTreeEditPart(p_model);
		}
		if(p_model instanceof CMProxyEquivalenceClass){
			return new VTCDEquivalenceClassTreeEditPart(p_model);
		}
		return null;
	}

}
