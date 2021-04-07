/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.policies;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.vtcd.model.VTCDAbstractFigure;
import biz.bi.vtcd.model.VTCDAbstractLink;
import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;

/**
 * @author smoreno
 * @09-08-2005
 * @smoreno
 */
public interface VTCDPolicyFactory {
	
	
	public static final VTCDPolicyFactory INSTANCE = new VTCDPolicyFactoryImpl();
	
	Command createFigureEquivalenceClassesPolicy(CMProxyEquivalenceClass p_proxyEquivalence,VTCDFigureElement p_Element);

	Command createDeleteAllCombinationsPolicy(VTCDDiagramCombination diagram);

	/**
	 * @param p_diagram
	 * @param p_element
	 * @return
	 */
	Command createAddFigureElementtoDiagramPolicy(VTCDDiagram p_diagram, CMProxyElement p_element) ;

	Command createDeleteLinkPolicy(VTCDAbstractLink link);
	
    Command createDeleteFigureAndLinksPolicy(VTCDAbstractFigure p_figure);

    Command createDeleteFigureEquivalenceClassPolicy(VTCDFigureEquivalenceClass equivalence);
    
    Command createDeleteFigureEquivalenceClassFromAllDiagramsClassPolicy(VTCDDiagramMain main,CMProxyEquivalenceClass equivalence);

    Command createReloadDiagramMainPolicy(VTCDDiagramMain diagram);
}
