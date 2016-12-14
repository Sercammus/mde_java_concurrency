/**
 */
package ActivityDiagram.tests;

import ActivityDiagram.ActivityDiagramFactory;
import ActivityDiagram.NestedActivity;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nested Activity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NestedActivityTest extends DescribedActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NestedActivityTest.class);
	}

	/**
	 * Constructs a new Nested Activity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedActivityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Nested Activity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NestedActivity getFixture() {
		return (NestedActivity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ActivityDiagramFactory.eINSTANCE.createNestedActivity());
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

} //NestedActivityTest
