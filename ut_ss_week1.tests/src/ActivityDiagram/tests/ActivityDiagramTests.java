/**
 */
package ActivityDiagram.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ActivityDiagram</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityDiagramTests extends TestSuite {

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
		TestSuite suite = new ActivityDiagramTests("ActivityDiagram Tests");
		suite.addTestSuite(EndTest.class);
		suite.addTestSuite(ForkTest.class);
		suite.addTestSuite(DecisionTest.class);
		suite.addTestSuite(JoinTest.class);
		suite.addTestSuite(InterruptTest.class);
		suite.addTestSuite(SleepTest.class);
		suite.addTestSuite(YieldTest.class);
		suite.addTestSuite(SimpleActivityTest.class);
		suite.addTestSuite(NestedActivityTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramTests(String name) {
		super(name);
	}

} //ActivityDiagramTests
