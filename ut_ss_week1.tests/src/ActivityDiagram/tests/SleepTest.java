/**
 */
package ActivityDiagram.tests;

import ActivityDiagram.ActivityDiagramFactory;
import ActivityDiagram.Sleep;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sleep</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SleepTest extends LinearActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SleepTest.class);
	}

	/**
	 * Constructs a new Sleep test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SleepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sleep test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sleep getFixture() {
		return (Sleep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ActivityDiagramFactory.eINSTANCE.createSleep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SleepTest
