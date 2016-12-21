/**
 */
package umlad2javacc.basicmodel.ActivityDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface BasicModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ActivityDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.example.org/activityDiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ad";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicModelPackage eINSTANCE = umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.ReferenceImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ThreadImpl <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.ThreadImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__NAME = REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ACTIVITIES = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__START_ACTIVITY = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.InterruptableThreadImpl <em>Interruptable Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.InterruptableThreadImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getInterruptableThread()
	 * @generated
	 */
	int INTERRUPTABLE_THREAD = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTABLE_THREAD__NAME = THREAD__NAME;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTABLE_THREAD__ACTIVITIES = THREAD__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Start Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTABLE_THREAD__START_ACTIVITY = THREAD__START_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Interruptable Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTABLE_THREAD_FEATURE_COUNT = THREAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interruptable Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTABLE_THREAD_OPERATION_COUNT = THREAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelImpl <em>Basic Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getBasicModel()
	 * @generated
	 */
	int BASIC_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__NAME = INTERRUPTABLE_THREAD__NAME;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__ACTIVITIES = INTERRUPTABLE_THREAD__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Start Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__START_ACTIVITY = INTERRUPTABLE_THREAD__START_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__RESOURCES = INTERRUPTABLE_THREAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__INSTANCES = INTERRUPTABLE_THREAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__INSTANCE_TYPES = INTERRUPTABLE_THREAD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nested Threads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__NESTED_THREADS = INTERRUPTABLE_THREAD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Basic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL_FEATURE_COUNT = INTERRUPTABLE_THREAD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Basic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL_OPERATION_COUNT = INTERRUPTABLE_THREAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.ActivityImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PREDECESSOR = 1;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STATE_ID = 2;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ROOT_ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__THREAD = 5;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACCESSED_REFERENCES = 6;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = 0;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY = 1;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___USES_SAME_THREAD__ACTIVITY = 2;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = 3;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = 4;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_PREDECESSORS__ELIST = 5;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = 6;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.FinalActivityImpl <em>Final Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.FinalActivityImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getFinalActivity()
	 * @generated
	 */
	int FINAL_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY__STATE_ID = ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY__ROOT_ACTIVITY = ACTIVITY__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY__INSTANCE = ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY__THREAD = ACTIVITY__THREAD;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY__ACCESSED_REFERENCES = ACTIVITY__ACCESSED_REFERENCES;

	/**
	 * The number of structural features of the '<em>Final Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY = ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___USES_SAME_THREAD__ACTIVITY = ACTIVITY___USES_SAME_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___GET_PREDECESSORS__ELIST = ACTIVITY___GET_PREDECESSORS__ELIST;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Final Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.EndImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getEnd()
	 * @generated
	 */
	int END = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = FINAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__PREDECESSOR = FINAL_ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__STATE_ID = FINAL_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ROOT_ACTIVITY = FINAL_ACTIVITY__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__INSTANCE = FINAL_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__THREAD = FINAL_ACTIVITY__THREAD;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ACCESSED_REFERENCES = FINAL_ACTIVITY__ACCESSED_REFERENCES;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = FINAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___USES_DIFFERENT_THREAD__ACTIVITY = FINAL_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___USES_SAME_THREAD__ACTIVITY = FINAL_ACTIVITY___USES_SAME_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___GET_ACCESSED_REFERENCES__ELIST_ELIST = FINAL_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___GET_PREDECESSORS__ELIST = FINAL_ACTIVITY___GET_PREDECESSORS__ELIST;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = FINAL_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___JOINS_CORRECTLY__ELIST_ELIST = FINAL_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = FINAL_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = FINAL_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.LinearActivityImpl <em>Linear Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.LinearActivityImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getLinearActivity()
	 * @generated
	 */
	int LINEAR_ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY__STATE_ID = ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY__ROOT_ACTIVITY = ACTIVITY__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY__INSTANCE = ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY__THREAD = ACTIVITY__THREAD;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY__ACCESSED_REFERENCES = ACTIVITY__ACCESSED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Next Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY__NEXT_ACTIVITY = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linear Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY = ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___USES_SAME_THREAD__ACTIVITY = ACTIVITY___USES_SAME_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___GET_PREDECESSORS__ELIST = ACTIVITY___GET_PREDECESSORS__ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = ACTIVITY_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Linear Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.ForkImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getFork()
	 * @generated
	 */
	int FORK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__STATE_ID = ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__ROOT_ACTIVITY = ACTIVITY__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__INSTANCE = ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__THREAD = ACTIVITY__THREAD;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__ACCESSED_REFERENCES = ACTIVITY__ACCESSED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Max Thread Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__MAX_THREAD_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Forked Threads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__FORKED_THREADS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___USES_DIFFERENT_THREAD__ACTIVITY = ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___USES_SAME_THREAD__ACTIVITY = ACTIVITY___USES_SAME_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___GET_ACCESSED_REFERENCES__ELIST_ELIST = ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___GET_PREDECESSORS__ELIST = ACTIVITY___GET_PREDECESSORS__ELIST;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___JOINS_CORRECTLY = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___JOINS_CORRECTLY__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.DecisionImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NAME = LINEAR_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__PREDECESSOR = LINEAR_ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__STATE_ID = LINEAR_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ROOT_ACTIVITY = LINEAR_ACTIVITY__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__INSTANCE = LINEAR_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__THREAD = LINEAR_ACTIVITY__THREAD;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ACCESSED_REFERENCES = LINEAR_ACTIVITY__ACCESSED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Next Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NEXT_ACTIVITY = LINEAR_ACTIVITY__NEXT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__BRANCHES = LINEAR_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = LINEAR_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___USES_DIFFERENT_THREAD__ACTIVITY = LINEAR_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___USES_SAME_THREAD__ACTIVITY = LINEAR_ACTIVITY___USES_SAME_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___GET_ACCESSED_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___GET_PREDECESSORS__ELIST = LINEAR_ACTIVITY___GET_PREDECESSORS__ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = LINEAR_ACTIVITY_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BranchImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 8;

	/**
	 * The feature id for the '<em><b>Next Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NEXT_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.JoinImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = LINEAR_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__PREDECESSOR = LINEAR_ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__STATE_ID = LINEAR_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ROOT_ACTIVITY = LINEAR_ACTIVITY__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__INSTANCE = LINEAR_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__THREAD = LINEAR_ACTIVITY__THREAD;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ACCESSED_REFERENCES = LINEAR_ACTIVITY__ACCESSED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Next Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NEXT_ACTIVITY = LINEAR_ACTIVITY__NEXT_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = LINEAR_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___USES_DIFFERENT_THREAD__ACTIVITY = LINEAR_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___USES_SAME_THREAD__ACTIVITY = LINEAR_ACTIVITY___USES_SAME_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___GET_ACCESSED_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___GET_PREDECESSORS__ELIST = LINEAR_ACTIVITY___GET_PREDECESSORS__ELIST;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = LINEAR_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.SharedResourceImpl <em>Shared Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.SharedResourceImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getSharedResource()
	 * @generated
	 */
	int SHARED_RESOURCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE__NAME = REFERENCE__NAME;

	/**
	 * The number of structural features of the '<em>Shared Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shared Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.InterruptImpl <em>Interrupt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.InterruptImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getInterrupt()
	 * @generated
	 */
	int INTERRUPT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__NAME = LINEAR_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__PREDECESSOR = LINEAR_ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__STATE_ID = LINEAR_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__ROOT_ACTIVITY = LINEAR_ACTIVITY__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__INSTANCE = LINEAR_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__THREAD = LINEAR_ACTIVITY__THREAD;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__ACCESSED_REFERENCES = LINEAR_ACTIVITY__ACCESSED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Next Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__NEXT_ACTIVITY = LINEAR_ACTIVITY__NEXT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Interrupted Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__INTERRUPTED_THREAD = LINEAR_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interrupt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_FEATURE_COUNT = LINEAR_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___USES_DIFFERENT_THREAD__ACTIVITY = LINEAR_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___USES_SAME_THREAD__ACTIVITY = LINEAR_ACTIVITY___USES_SAME_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___GET_ACCESSED_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___GET_PREDECESSORS__ELIST = LINEAR_ACTIVITY___GET_PREDECESSORS__ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = LINEAR_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interrupt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.InstanceImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__INSTANCE_TYPE = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.InstanceTypeImpl <em>Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.InstanceTypeImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getInstanceType()
	 * @generated
	 */
	int INSTANCE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.SleepImpl <em>Sleep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.SleepImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getSleep()
	 * @generated
	 */
	int SLEEP = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__NAME = LINEAR_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__PREDECESSOR = LINEAR_ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__STATE_ID = LINEAR_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__ROOT_ACTIVITY = LINEAR_ACTIVITY__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__INSTANCE = LINEAR_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__THREAD = LINEAR_ACTIVITY__THREAD;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__ACCESSED_REFERENCES = LINEAR_ACTIVITY__ACCESSED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Next Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__NEXT_ACTIVITY = LINEAR_ACTIVITY__NEXT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__DURATION = LINEAR_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sleep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_FEATURE_COUNT = LINEAR_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___USES_DIFFERENT_THREAD__ACTIVITY = LINEAR_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___USES_SAME_THREAD__ACTIVITY = LINEAR_ACTIVITY___USES_SAME_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___GET_ACCESSED_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___GET_PREDECESSORS__ELIST = LINEAR_ACTIVITY___GET_PREDECESSORS__ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = LINEAR_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST;

	/**
	 * The number of operations of the '<em>Sleep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.YieldImpl <em>Yield</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.YieldImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getYield()
	 * @generated
	 */
	int YIELD = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__NAME = LINEAR_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__PREDECESSOR = LINEAR_ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__STATE_ID = LINEAR_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__ROOT_ACTIVITY = LINEAR_ACTIVITY__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__INSTANCE = LINEAR_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__THREAD = LINEAR_ACTIVITY__THREAD;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__ACCESSED_REFERENCES = LINEAR_ACTIVITY__ACCESSED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Next Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__NEXT_ACTIVITY = LINEAR_ACTIVITY__NEXT_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Yield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_FEATURE_COUNT = LINEAR_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___USES_DIFFERENT_THREAD__ACTIVITY = LINEAR_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___USES_SAME_THREAD__ACTIVITY = LINEAR_ACTIVITY___USES_SAME_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___GET_ACCESSED_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___GET_PREDECESSORS__ELIST = LINEAR_ACTIVITY___GET_PREDECESSORS__ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = LINEAR_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST;

	/**
	 * The number of operations of the '<em>Yield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.NamedActivityImpl <em>Named Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.NamedActivityImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getNamedActivity()
	 * @generated
	 */
	int NAMED_ACTIVITY = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY__NAME = LINEAR_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY__PREDECESSOR = LINEAR_ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY__STATE_ID = LINEAR_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY__ROOT_ACTIVITY = LINEAR_ACTIVITY__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY__INSTANCE = LINEAR_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY__THREAD = LINEAR_ACTIVITY__THREAD;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY__ACCESSED_REFERENCES = LINEAR_ACTIVITY__ACCESSED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Next Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY__NEXT_ACTIVITY = LINEAR_ACTIVITY__NEXT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Activity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY__ACTIVITY_NAME = LINEAR_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY_FEATURE_COUNT = LINEAR_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY = LINEAR_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___USES_SAME_THREAD__ACTIVITY = LINEAR_ACTIVITY___USES_SAME_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___GET_PREDECESSORS__ELIST = LINEAR_ACTIVITY___GET_PREDECESSORS__ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = LINEAR_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST;

	/**
	 * The number of operations of the '<em>Named Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.SimpleActivityImpl <em>Simple Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.SimpleActivityImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getSimpleActivity()
	 * @generated
	 */
	int SIMPLE_ACTIVITY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__NAME = NAMED_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__PREDECESSOR = NAMED_ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__STATE_ID = NAMED_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__ROOT_ACTIVITY = NAMED_ACTIVITY__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__INSTANCE = NAMED_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__THREAD = NAMED_ACTIVITY__THREAD;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__ACCESSED_REFERENCES = NAMED_ACTIVITY__ACCESSED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Next Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__NEXT_ACTIVITY = NAMED_ACTIVITY__NEXT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Activity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__ACTIVITY_NAME = NAMED_ACTIVITY__ACTIVITY_NAME;

	/**
	 * The feature id for the '<em><b>Shared Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__SHARED_RESOURCES = NAMED_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY_FEATURE_COUNT = NAMED_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY = NAMED_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___USES_SAME_THREAD__ACTIVITY = NAMED_ACTIVITY___USES_SAME_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = NAMED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___GET_PREDECESSORS__ELIST = NAMED_ACTIVITY___GET_PREDECESSORS__ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = NAMED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = NAMED_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = NAMED_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY_OPERATION_COUNT = NAMED_ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.NestedActivityImpl <em>Nested Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.NestedActivityImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getNestedActivity()
	 * @generated
	 */
	int NESTED_ACTIVITY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__NAME = NAMED_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__PREDECESSOR = NAMED_ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__STATE_ID = NAMED_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__ROOT_ACTIVITY = NAMED_ACTIVITY__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__INSTANCE = NAMED_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__THREAD = NAMED_ACTIVITY__THREAD;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__ACCESSED_REFERENCES = NAMED_ACTIVITY__ACCESSED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Next Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__NEXT_ACTIVITY = NAMED_ACTIVITY__NEXT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Activity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__ACTIVITY_NAME = NAMED_ACTIVITY__ACTIVITY_NAME;

	/**
	 * The feature id for the '<em><b>Nested Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__NESTED_THREAD = NAMED_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nested Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY_FEATURE_COUNT = NAMED_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY = NAMED_ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY___USES_SAME_THREAD__ACTIVITY = NAMED_ACTIVITY___USES_SAME_THREAD__ACTIVITY;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY___GET_PREDECESSORS__ELIST = NAMED_ACTIVITY___GET_PREDECESSORS__ELIST;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = NAMED_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Assign State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = NAMED_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = NAMED_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = NAMED_ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nested Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY_OPERATION_COUNT = NAMED_ACTIVITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ForkedThreadImpl <em>Forked Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.ForkedThreadImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getForkedThread()
	 * @generated
	 */
	int FORKED_THREAD = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_THREAD__NAME = INTERRUPTABLE_THREAD__NAME;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_THREAD__ACTIVITIES = INTERRUPTABLE_THREAD__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Start Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_THREAD__START_ACTIVITY = INTERRUPTABLE_THREAD__START_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Daemon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_THREAD__DAEMON = INTERRUPTABLE_THREAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forked Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_THREAD_FEATURE_COUNT = INTERRUPTABLE_THREAD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Forked Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_THREAD_OPERATION_COUNT = INTERRUPTABLE_THREAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.NestedThreadImpl <em>Nested Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.NestedThreadImpl
	 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getNestedThread()
	 * @generated
	 */
	int NESTED_THREAD = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_THREAD__NAME = THREAD__NAME;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_THREAD__ACTIVITIES = THREAD__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Start Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_THREAD__START_ACTIVITY = THREAD__START_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Nested Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_THREAD_FEATURE_COUNT = THREAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nested Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_THREAD_OPERATION_COUNT = THREAD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Thread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.ActivityDiagram.Thread#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Thread#getActivities()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Activities();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.ActivityDiagram.Thread#getStartActivity <em>Start Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Activity</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Thread#getStartActivity()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_StartActivity();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.BasicModel <em>Basic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Model</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModel
	 * @generated
	 */
	EClass getBasicModel();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.ActivityDiagram.BasicModel#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModel#getResources()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.ActivityDiagram.BasicModel#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModel#getInstances()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.ActivityDiagram.BasicModel#getInstanceTypes <em>Instance Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Types</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModel#getInstanceTypes()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_InstanceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.ActivityDiagram.BasicModel#getNestedThreads <em>Nested Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Threads</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModel#getNestedThreads()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_NestedThreads();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the reference list '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessor</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#getPredecessor()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Predecessor();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getStateId <em>State Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Id</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#getStateId()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_StateId();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getRootActivity <em>Root Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Activity</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#getRootActivity()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_RootActivity();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#getInstance()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Instance();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thread</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#getThread()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Thread();

	/**
	 * Returns the meta object for the reference list '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getAccessedReferences <em>Accessed References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessed References</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#getAccessedReferences()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_AccessedReferences();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#UsesDifferentThread(umlad2javacc.basicmodel.ActivityDiagram.Activity) <em>Uses Different Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Uses Different Thread</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#UsesDifferentThread(umlad2javacc.basicmodel.ActivityDiagram.Activity)
	 * @generated
	 */
	EOperation getActivity__UsesDifferentThread__Activity();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#UsesSameThread(umlad2javacc.basicmodel.ActivityDiagram.Activity) <em>Uses Same Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Uses Same Thread</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#UsesSameThread(umlad2javacc.basicmodel.ActivityDiagram.Activity)
	 * @generated
	 */
	EOperation getActivity__UsesSameThread__Activity();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accessed References</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__GetAccessedReferences__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#GetPredecessors(org.eclipse.emf.common.util.EList) <em>Get Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Predecessors</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#GetPredecessors(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__GetPredecessors__EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#AssignStateId(umlad2javacc.basicmodel.ActivityDiagram.Activity, java.math.BigInteger, org.eclipse.emf.common.util.EList) <em>Assign State Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign State Id</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity#AssignStateId(umlad2javacc.basicmodel.ActivityDiagram.Activity, java.math.BigInteger, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__AssignStateId__Activity_BigInteger_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.FinalActivity <em>Final Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Activity</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.FinalActivity
	 * @generated
	 */
	EClass getFinalActivity();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.FinalActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.FinalActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFinalActivity__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.FinalActivity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.FinalActivity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFinalActivity__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.LinearActivity <em>Linear Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Activity</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.LinearActivity
	 * @generated
	 */
	EClass getLinearActivity();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.ActivityDiagram.LinearActivity#getNextActivity <em>Next Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Activity</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.LinearActivity#getNextActivity()
	 * @see #getLinearActivity()
	 * @generated
	 */
	EReference getLinearActivity_NextActivity();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.LinearActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.LinearActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getLinearActivity__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.LinearActivity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.LinearActivity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getLinearActivity__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.LinearActivity#AssignStateId(umlad2javacc.basicmodel.ActivityDiagram.Activity, java.math.BigInteger, org.eclipse.emf.common.util.EList) <em>Assign State Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign State Id</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.LinearActivity#AssignStateId(umlad2javacc.basicmodel.ActivityDiagram.Activity, java.math.BigInteger, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getLinearActivity__AssignStateId__Activity_BigInteger_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.ActivityDiagram.Fork#getMaxThreadCount <em>Max Thread Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Thread Count</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Fork#getMaxThreadCount()
	 * @see #getFork()
	 * @generated
	 */
	EAttribute getFork_MaxThreadCount();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.ActivityDiagram.Fork#getForkedThreads <em>Forked Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forked Threads</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Fork#getForkedThreads()
	 * @see #getFork()
	 * @generated
	 */
	EReference getFork_ForkedThreads();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Fork#JoinsCorrectly() <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Fork#JoinsCorrectly()
	 * @generated
	 */
	EOperation getFork__JoinsCorrectly();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Fork#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Fork#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFork__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Fork#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Fork#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFork__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.ActivityDiagram.Decision#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Decision#getBranches()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Branches();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Decision#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Decision#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDecision__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Decision#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Decision#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDecision__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Decision#AssignStateId(umlad2javacc.basicmodel.ActivityDiagram.Activity, java.math.BigInteger, org.eclipse.emf.common.util.EList) <em>Assign State Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign State Id</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Decision#AssignStateId(umlad2javacc.basicmodel.ActivityDiagram.Activity, java.math.BigInteger, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDecision__AssignStateId__Activity_BigInteger_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.ActivityDiagram.Branch#getNextActivity <em>Next Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Activity</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Branch#getNextActivity()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_NextActivity();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.ActivityDiagram.Branch#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Branch#getCondition()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Condition();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Join#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Join#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getJoin__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.SharedResource <em>Shared Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Resource</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.SharedResource
	 * @generated
	 */
	EClass getSharedResource();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.Interrupt <em>Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Interrupt
	 * @generated
	 */
	EClass getInterrupt();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.ActivityDiagram.Interrupt#getInterruptedThread <em>Interrupted Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interrupted Thread</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Interrupt#getInterruptedThread()
	 * @see #getInterrupt()
	 * @generated
	 */
	EReference getInterrupt_InterruptedThread();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.Interrupt#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Interrupt#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getInterrupt__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.ActivityDiagram.Instance#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Type</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Instance#getInstanceType()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_InstanceType();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.InstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Type</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.InstanceType
	 * @generated
	 */
	EClass getInstanceType();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.ActivityDiagram.InstanceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.InstanceType#getName()
	 * @see #getInstanceType()
	 * @generated
	 */
	EAttribute getInstanceType_Name();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.Sleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sleep</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Sleep
	 * @generated
	 */
	EClass getSleep();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.ActivityDiagram.Sleep#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Sleep#getDuration()
	 * @see #getSleep()
	 * @generated
	 */
	EAttribute getSleep_Duration();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.Yield <em>Yield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yield</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Yield
	 * @generated
	 */
	EClass getYield();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.SimpleActivity <em>Simple Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Activity</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.SimpleActivity
	 * @generated
	 */
	EClass getSimpleActivity();

	/**
	 * Returns the meta object for the reference list '{@link umlad2javacc.basicmodel.ActivityDiagram.SimpleActivity#getSharedResources <em>Shared Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shared Resources</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.SimpleActivity#getSharedResources()
	 * @see #getSimpleActivity()
	 * @generated
	 */
	EReference getSimpleActivity_SharedResources();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.SimpleActivity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.SimpleActivity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSimpleActivity__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.NestedActivity <em>Nested Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Activity</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.NestedActivity
	 * @generated
	 */
	EClass getNestedActivity();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.ActivityDiagram.NestedActivity#getNestedThread <em>Nested Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nested Thread</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.NestedActivity#getNestedThread()
	 * @see #getNestedActivity()
	 * @generated
	 */
	EReference getNestedActivity_NestedThread();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.NestedActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.NestedActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getNestedActivity__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.ActivityDiagram.NestedActivity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accessed References</em>' operation.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.NestedActivity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getNestedActivity__GetAccessedReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.ForkedThread <em>Forked Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Thread</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.ForkedThread
	 * @generated
	 */
	EClass getForkedThread();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.ActivityDiagram.ForkedThread#isDaemon <em>Daemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daemon</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.ForkedThread#isDaemon()
	 * @see #getForkedThread()
	 * @generated
	 */
	EAttribute getForkedThread_Daemon();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.NamedActivity <em>Named Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Activity</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.NamedActivity
	 * @generated
	 */
	EClass getNamedActivity();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.ActivityDiagram.NamedActivity#getActivityName <em>Activity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Name</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.NamedActivity#getActivityName()
	 * @see #getNamedActivity()
	 * @generated
	 */
	EAttribute getNamedActivity_ActivityName();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.ActivityDiagram.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.NestedThread <em>Nested Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Thread</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.NestedThread
	 * @generated
	 */
	EClass getNestedThread();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.ActivityDiagram.InterruptableThread <em>Interruptable Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interruptable Thread</em>'.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.InterruptableThread
	 * @generated
	 */
	EClass getInterruptableThread();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicModelFactory getBasicModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ThreadImpl <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.ThreadImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getThread()
		 * @generated
		 */
		EClass THREAD = eINSTANCE.getThread();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__ACTIVITIES = eINSTANCE.getThread_Activities();

		/**
		 * The meta object literal for the '<em><b>Start Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__START_ACTIVITY = eINSTANCE.getThread_StartActivity();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelImpl <em>Basic Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getBasicModel()
		 * @generated
		 */
		EClass BASIC_MODEL = eINSTANCE.getBasicModel();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_MODEL__RESOURCES = eINSTANCE.getBasicModel_Resources();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_MODEL__INSTANCES = eINSTANCE.getBasicModel_Instances();

		/**
		 * The meta object literal for the '<em><b>Instance Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_MODEL__INSTANCE_TYPES = eINSTANCE.getBasicModel_InstanceTypes();

		/**
		 * The meta object literal for the '<em><b>Nested Threads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_MODEL__NESTED_THREADS = eINSTANCE.getBasicModel_NestedThreads();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.ActivityImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PREDECESSOR = eINSTANCE.getActivity_Predecessor();

		/**
		 * The meta object literal for the '<em><b>State Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__STATE_ID = eINSTANCE.getActivity_StateId();

		/**
		 * The meta object literal for the '<em><b>Root Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ROOT_ACTIVITY = eINSTANCE.getActivity_RootActivity();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INSTANCE = eINSTANCE.getActivity_Instance();

		/**
		 * The meta object literal for the '<em><b>Thread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__THREAD = eINSTANCE.getActivity_Thread();

		/**
		 * The meta object literal for the '<em><b>Accessed References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ACCESSED_REFERENCES = eINSTANCE.getActivity_AccessedReferences();

		/**
		 * The meta object literal for the '<em><b>Joins Correctly</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = eINSTANCE.getActivity__JoinsCorrectly__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Uses Different Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY = eINSTANCE.getActivity__UsesDifferentThread__Activity();

		/**
		 * The meta object literal for the '<em><b>Uses Same Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY___USES_SAME_THREAD__ACTIVITY = eINSTANCE.getActivity__UsesSameThread__Activity();

		/**
		 * The meta object literal for the '<em><b>Get Accessed References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = eINSTANCE.getActivity__GetAccessedReferences__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Successor References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = eINSTANCE.getActivity__GetSuccessorReferences__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY___GET_PREDECESSORS__ELIST = eINSTANCE.getActivity__GetPredecessors__EList();

		/**
		 * The meta object literal for the '<em><b>Assign State Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = eINSTANCE.getActivity__AssignStateId__Activity_BigInteger_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.EndImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.FinalActivityImpl <em>Final Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.FinalActivityImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getFinalActivity()
		 * @generated
		 */
		EClass FINAL_ACTIVITY = eINSTANCE.getFinalActivity();

		/**
		 * The meta object literal for the '<em><b>Joins Correctly</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FINAL_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = eINSTANCE.getFinalActivity__JoinsCorrectly__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Successor References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FINAL_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = eINSTANCE.getFinalActivity__GetSuccessorReferences__EList_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.LinearActivityImpl <em>Linear Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.LinearActivityImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getLinearActivity()
		 * @generated
		 */
		EClass LINEAR_ACTIVITY = eINSTANCE.getLinearActivity();

		/**
		 * The meta object literal for the '<em><b>Next Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEAR_ACTIVITY__NEXT_ACTIVITY = eINSTANCE.getLinearActivity_NextActivity();

		/**
		 * The meta object literal for the '<em><b>Joins Correctly</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = eINSTANCE.getLinearActivity__JoinsCorrectly__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Successor References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINEAR_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = eINSTANCE.getLinearActivity__GetSuccessorReferences__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Assign State Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINEAR_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = eINSTANCE.getLinearActivity__AssignStateId__Activity_BigInteger_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.ForkImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '<em><b>Max Thread Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORK__MAX_THREAD_COUNT = eINSTANCE.getFork_MaxThreadCount();

		/**
		 * The meta object literal for the '<em><b>Forked Threads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK__FORKED_THREADS = eINSTANCE.getFork_ForkedThreads();

		/**
		 * The meta object literal for the '<em><b>Joins Correctly</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORK___JOINS_CORRECTLY = eINSTANCE.getFork__JoinsCorrectly();

		/**
		 * The meta object literal for the '<em><b>Joins Correctly</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORK___JOINS_CORRECTLY__ELIST_ELIST = eINSTANCE.getFork__JoinsCorrectly__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Successor References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORK___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = eINSTANCE.getFork__GetSuccessorReferences__EList_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.DecisionImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__BRANCHES = eINSTANCE.getDecision_Branches();

		/**
		 * The meta object literal for the '<em><b>Joins Correctly</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION___JOINS_CORRECTLY__ELIST_ELIST = eINSTANCE.getDecision__JoinsCorrectly__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Successor References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = eINSTANCE.getDecision__GetSuccessorReferences__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Assign State Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST = eINSTANCE.getDecision__AssignStateId__Activity_BigInteger_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BranchImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Next Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__NEXT_ACTIVITY = eINSTANCE.getBranch_NextActivity();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__CONDITION = eINSTANCE.getBranch_Condition();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.JoinImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Joins Correctly</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOIN___JOINS_CORRECTLY__ELIST_ELIST = eINSTANCE.getJoin__JoinsCorrectly__EList_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.SharedResourceImpl <em>Shared Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.SharedResourceImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getSharedResource()
		 * @generated
		 */
		EClass SHARED_RESOURCE = eINSTANCE.getSharedResource();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.InterruptImpl <em>Interrupt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.InterruptImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getInterrupt()
		 * @generated
		 */
		EClass INTERRUPT = eINSTANCE.getInterrupt();

		/**
		 * The meta object literal for the '<em><b>Interrupted Thread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERRUPT__INTERRUPTED_THREAD = eINSTANCE.getInterrupt_InterruptedThread();

		/**
		 * The meta object literal for the '<em><b>Get Successor References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERRUPT___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = eINSTANCE.getInterrupt__GetSuccessorReferences__EList_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.InstanceImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__INSTANCE_TYPE = eINSTANCE.getInstance_InstanceType();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.InstanceTypeImpl <em>Instance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.InstanceTypeImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getInstanceType()
		 * @generated
		 */
		EClass INSTANCE_TYPE = eINSTANCE.getInstanceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_TYPE__NAME = eINSTANCE.getInstanceType_Name();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.SleepImpl <em>Sleep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.SleepImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getSleep()
		 * @generated
		 */
		EClass SLEEP = eINSTANCE.getSleep();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLEEP__DURATION = eINSTANCE.getSleep_Duration();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.YieldImpl <em>Yield</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.YieldImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getYield()
		 * @generated
		 */
		EClass YIELD = eINSTANCE.getYield();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.SimpleActivityImpl <em>Simple Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.SimpleActivityImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getSimpleActivity()
		 * @generated
		 */
		EClass SIMPLE_ACTIVITY = eINSTANCE.getSimpleActivity();

		/**
		 * The meta object literal for the '<em><b>Shared Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ACTIVITY__SHARED_RESOURCES = eINSTANCE.getSimpleActivity_SharedResources();

		/**
		 * The meta object literal for the '<em><b>Get Successor References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = eINSTANCE.getSimpleActivity__GetSuccessorReferences__EList_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.NestedActivityImpl <em>Nested Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.NestedActivityImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getNestedActivity()
		 * @generated
		 */
		EClass NESTED_ACTIVITY = eINSTANCE.getNestedActivity();

		/**
		 * The meta object literal for the '<em><b>Nested Thread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_ACTIVITY__NESTED_THREAD = eINSTANCE.getNestedActivity_NestedThread();

		/**
		 * The meta object literal for the '<em><b>Joins Correctly</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NESTED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = eINSTANCE.getNestedActivity__JoinsCorrectly__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Accessed References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NESTED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = eINSTANCE.getNestedActivity__GetAccessedReferences__EList_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ForkedThreadImpl <em>Forked Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.ForkedThreadImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getForkedThread()
		 * @generated
		 */
		EClass FORKED_THREAD = eINSTANCE.getForkedThread();

		/**
		 * The meta object literal for the '<em><b>Daemon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORKED_THREAD__DAEMON = eINSTANCE.getForkedThread_Daemon();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.NamedActivityImpl <em>Named Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.NamedActivityImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getNamedActivity()
		 * @generated
		 */
		EClass NAMED_ACTIVITY = eINSTANCE.getNamedActivity();

		/**
		 * The meta object literal for the '<em><b>Activity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ACTIVITY__ACTIVITY_NAME = eINSTANCE.getNamedActivity_ActivityName();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.ReferenceImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.NestedThreadImpl <em>Nested Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.NestedThreadImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getNestedThread()
		 * @generated
		 */
		EClass NESTED_THREAD = eINSTANCE.getNestedThread();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.ActivityDiagram.impl.InterruptableThreadImpl <em>Interruptable Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.InterruptableThreadImpl
		 * @see umlad2javacc.basicmodel.ActivityDiagram.impl.BasicModelPackageImpl#getInterruptableThread()
		 * @generated
		 */
		EClass INTERRUPTABLE_THREAD = eINSTANCE.getInterruptableThread();

	}

} //BasicModelPackage
