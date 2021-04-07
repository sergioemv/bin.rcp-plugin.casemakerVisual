/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDNoteTest.java,v 1.2 2005/06/29 20:45:06 smoreno Exp $
 */
package biz.bi.vtcd.tests;

import junit.textui.TestRunner;
import biz.bi.vtcd.model.VTCDFactory;
import biz.bi.vtcd.model.VTCDNote;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VTCDNoteTest extends VTCDAbstractFigureTest {
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
		TestRunner.run(VTCDNoteTest.class);
	}

	/**
	 * Constructs a new Note test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDNoteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Note test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VTCDNote getFixture() {
		return (VTCDNote) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(VTCDFactory.eINSTANCE.createVTCDNote());
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

} //VTCDNoteTest
