/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDTests.java,v 1.2 2005/06/29 20:45:06 smoreno Exp $
 */
package biz.bi.vtcd.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>vtcd</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class VTCDTests extends TestSuite {
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
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new VTCDTests("vtcd Tests"); //$NON-NLS-1$
		suite.addTestSuite(VTCDDiagramCombinationTest.class);
		suite.addTestSuite(VTCDDiagramMainTest.class);
		suite.addTestSuite(VTCDFigureCombinationTest.class);
		suite.addTestSuite(VTCDFigureElementTest.class);
		suite.addTestSuite(VTCDFigureDependencyTest.class);
		suite.addTestSuite(VTCDFigureEquivalenceClassTest.class);
		suite.addTestSuite(VTCDLinkDependencyElementTest.class);
		suite.addTestSuite(VTCDLinkCombinationEClassTest.class);
		suite.addTestSuite(VTCDNoteTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDTests(String name) {
		super(name);
	}

} //VTCDTests
