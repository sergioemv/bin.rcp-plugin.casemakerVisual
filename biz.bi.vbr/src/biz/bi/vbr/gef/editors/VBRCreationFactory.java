package biz.bi.vbr.gef.editors;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.requests.CreationFactory;

import biz.bi.vbr.vbrvm.VBRVMPackage;

/**
 * @author Harold Canedo Lopez
 * @since 08/06/2005
 * @version 1.0
 * 
 */
public class VBRCreationFactory implements CreationFactory {

	private EClass m_Instance;
	public VBRCreationFactory(EClass p_Instance) {
		m_Instance=p_Instance;
	}

	public Object getNewObject() {
		try
		{
			return VBRVMPackage.eINSTANCE.getVBRVMFactory().create(m_Instance);
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
