/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDLinkCombinationEClassTest.java,v 1.2 2005/06/29 20:45:06 smoreno Exp $
 */
package biz.bi.vtcd.tests;

import junit.textui.TestRunner;
import biz.bi.vtcd.model.VTCDFactory;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link Combination EClass</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VTCDLinkCombinationEClassTest extends VTCDAbstractLinkTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VTCDLinkCombinationEClassTest.class);
	}

	/**
	 * Constructs a new Link Combination EClass test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDLinkCombinationEClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link Combination EClass test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VTCDLinkCombinationEClass getFixture() {
		return (VTCDLinkCombinationEClass) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(VTCDFactory.eINSTANCE.createVTCDLinkCombinationEClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VTCDLinkCombinationEClassTest
