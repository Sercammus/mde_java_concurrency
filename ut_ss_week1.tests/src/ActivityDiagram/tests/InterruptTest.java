/**
 */
package ActivityDiagram.tests;

import ActivityDiagram.ActivityDiagramFactory;
import ActivityDiagram.Interrupt;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interrupt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterruptTest extends LinearActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterruptTest.class);
	}

	/**
	 * Constructs a new Interrupt test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interrupt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Interrupt getFixture() {
		return (Interrupt)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ActivityDiagramFactory.eINSTANCE.createInterrupt());
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

} //InterruptTest
