/**
 * 
 */
package biz.bi.vtcd.model.properties;

import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;

import biz.bi.cmcore.model.CMCorePackage;

/**
 * @author hcanedo
 *
 */
public class VTCDStatePropertyDescriptor extends ComboBoxPropertyDescriptor {

	public static final String[] m_StateValues=CMCorePackage.eINSTANCE.getEquivalenceClassState();
	public static final int[] m_StateIntValues=CMCorePackage.eINSTANCE.getEquivalenceClassStateIntValue();

	/**
	 * @param p_id
	 * @param p_displayName
	 * @param p_valuesArray
	 */
	public VTCDStatePropertyDescriptor(VTCDPropertyId propertyId) {
		super(propertyId, propertyId.getDisplayName(), m_StateValues);
		setCategory(propertyId.getCategoryName());
	}

	/**
	 * @param p_state
	 * @return
	 */
	public static Integer fromModel(int p_state) {
		for(int i=0; i < m_StateIntValues.length;i++)
			if(p_state == m_StateIntValues[i])
				return new Integer(i);
		return new Integer(0);
	}

	public static int toModel(Object integer) {
		int posValue=((Integer)integer).intValue();
		return m_StateIntValues[posValue];
	}

}
