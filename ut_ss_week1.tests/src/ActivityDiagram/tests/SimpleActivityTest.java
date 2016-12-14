/**
 */
package ActivityDiagram.tests;

import ActivityDiagram.ActivityDiagramFactory;
import ActivityDiagram.SimpleActivity;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Activity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleActivityTest extends DescribedActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleActivityTest.class);
	}

	/**
	 * Constructs a new Simple Activity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleActivityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Activity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleActivity getFixture() {
		return (SimpleActivity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ActivityDiagramFactory.eINSTANCE.createSimpleActivity());
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

} //SimpleActivityTest
