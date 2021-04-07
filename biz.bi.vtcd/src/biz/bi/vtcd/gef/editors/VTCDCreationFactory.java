package biz.bi.vtcd.gef.editors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.requests.CreationFactory;

import biz.bi.vtcd.model.VTCDPackage;

/**
 * @author Harold Canedo Lopez
 * @since 08/06/2005
 * @version 1.0
 * 
 */
public class VTCDCreationFactory implements CreationFactory {

	private EClass m_Instance;
	public VTCDCreationFactory(EClass p_Instance) {
		m_Instance=p_Instance;
	}

	public Object getNewObject() {
		try
		{
			return VTCDPackage.eINSTANCE.getVTCDFactory().create(m_Instance);
		}
		catch (Exception e)
		{
			return null;
		}
	}

	public Object getObjectType() {
		return m_Instance;
	}

}
