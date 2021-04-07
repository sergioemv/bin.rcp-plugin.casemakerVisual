/**
 * 
 */
package biz.bi.vtcd.model.properties;

import org.eclipse.ui.views.properties.IPropertySource;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;

/**
 * @author hcanedo
 *
 */
public class VTCDPropertySourceFactory {

	public static final String CATEGORY_VIEWMOLDEL = "View";
	public static final String CATEGORY_BUSINESSMODEL = "Model";
	/**
	 * 
	 */
	public VTCDPropertySourceFactory() {
		super();
		
	}

	/**
	 * @param p_model
	 * @return
	 */
	public static IPropertySource getPropertySource(Object p_model) {
		if(p_model instanceof VTCDFigureElement){
			return new VTCDCompoundPropertySource(
					new VTCDFigureElementPropertySource(CATEGORY_VIEWMOLDEL, p_model),
					getPropertySource(((VTCDFigureElement)p_model).getM_Element()), 
					null);
		}
		if(p_model instanceof CMProxyElement) {	
			return new VTCDElementPropertySource(CATEGORY_BUSINESSMODEL,p_model);
		}
		if(p_model instanceof VTCDFigureDependency){
			return new VTCDCompoundPropertySource(
					new VTCDFigureDependencyPropertySource(CATEGORY_VIEWMOLDEL, p_model),
					getPropertySource(((VTCDFigureDependency)p_model).getM_Dependency()), 
					null);
		}
		if(p_model instanceof CMProxyDependency){
			return new VTCDDependencyPropertySource(CATEGORY_BUSINESSMODEL,p_model);
		}
		if(p_model instanceof VTCDFigureEquivalenceClass){
			return new VTCDEquivalenceClassPropertySource(CATEGORY_BUSINESSMODEL,p_model);
		}
		if(p_model instanceof VTCDFigureCombination){
			return new VTCDCompoundPropertySource(
					new VTCDFigureCombinationPropertySource(CATEGORY_VIEWMOLDEL, p_model),
					getPropertySource(((VTCDFigureCombination)p_model).getM_Combination()), 
					null);
		}
		if(p_model instanceof CMProxyCombination) {	
			return new VTCDCombinationPropertySource(CATEGORY_BUSINESSMODEL,p_model);
		}
		return null;
	}

}
