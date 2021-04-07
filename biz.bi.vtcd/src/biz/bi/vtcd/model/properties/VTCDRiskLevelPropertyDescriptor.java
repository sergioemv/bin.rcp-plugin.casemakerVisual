/**
 * 
 */
package biz.bi.vtcd.model.properties;

import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;

/**
 * @author hcanedo
 *
 */
public class VTCDRiskLevelPropertyDescriptor extends ComboBoxPropertyDescriptor {

	public static final String[] m_RiskLevelValues={"0","1","2","3","4","5","6","7","8","9","10"};
	public static final int[] m_RiskLevelIntValues={0,1,2,3,4,5,6,7,8,9,10};
	/**
	 * @param p_id
	 * @param p_displayName
	 * @param p_valuesArray
	 */
	public VTCDRiskLevelPropertyDescriptor(VTCDPropertyId propertyId) {
		super(propertyId, propertyId.getDisplayName(), m_RiskLevelValues);
		setCategory(propertyId.getCategoryName());
		
	}

	/**
	 * @param p_riskLevel
	 * @return
	 */
	public static Integer fromModel(int p_state) {
		for(int i=0; i < m_RiskLevelIntValues.length;i++)
			if(p_state == m_RiskLevelIntValues[i])
				return new Integer(i);
		return new Integer(0);
	}

	public static int toModel(Object integer) {
		int posValue=((Integer)integer).intValue();
		return m_RiskLevelIntValues[posValue];
	}

}
