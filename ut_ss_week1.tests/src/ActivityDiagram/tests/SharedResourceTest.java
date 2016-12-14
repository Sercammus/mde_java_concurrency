/**
 */
package ActivityDiagram.tests;

import ActivityDiagram.ActivityDiagramFactory;
import ActivityDiagram.SharedResource;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shared Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharedResourceTest extends TestCase {

	/**
	 * The fixture for this Shared Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedResource fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SharedResourceTest.class);
	}

	/**
	 * Constructs a new Shared Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedResourceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Shared Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SharedResource fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Shared Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedResource getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ActivityDiagramFactory.eINSTANCE.createSharedResource());
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

} //SharedResourceTest
