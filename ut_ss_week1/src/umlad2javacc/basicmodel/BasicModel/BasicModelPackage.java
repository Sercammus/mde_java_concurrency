/**
 */
package umlad2javacc.basicmodel.BasicModel;

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
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelFactory
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
	String eNAME = "BasicModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.example.org/basicModel";

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
	BasicModelPackage eINSTANCE = umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.ReferenceImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getReference()
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
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.ThreadImpl <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.ThreadImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getThread()
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
	 * The feature id for the '<em><b>Activities By State Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ACTIVITIES_BY_STATE_ID = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__START_ACTIVITY = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.InterruptableThreadImpl <em>Interruptable Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.InterruptableThreadImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getInterruptableThread()
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
	 * The feature id for the '<em><b>Activities By State Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTABLE_THREAD__ACTIVITIES_BY_STATE_ID = THREAD__ACTIVITIES_BY_STATE_ID;

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
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.BasicModelImpl <em>Basic Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getBasicModel()
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
	 * The feature id for the '<em><b>Activities By State Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__ACTIVITIES_BY_STATE_ID = INTERRUPTABLE_THREAD__ACTIVITIES_BY_STATE_ID;

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
	 * The feature id for the '<em><b>Forked Threads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__FORKED_THREADS = INTERRUPTABLE_THREAD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Basic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL_FEATURE_COUNT = INTERRUPTABLE_THREAD_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Basic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL_OPERATION_COUNT = INTERRUPTABLE_THREAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.ActivityImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getActivity()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STATE_ID = 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INSTANCE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__THREAD = 4;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACCESSED_REFERENCES = 5;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 6;

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
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST = 4;

	/**
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = 5;

	/**
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = 6;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.FinalActivityImpl <em>Final Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.FinalActivityImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getFinalActivity()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY__STATE_ID = ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY__INSTANCE = ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY__INSTANCE_TYPE = ACTIVITY__INSTANCE_TYPE;

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
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST = ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST;

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
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.EndImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getEnd()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__STATE_ID = FINAL_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__INSTANCE = FINAL_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__INSTANCE_TYPE = FINAL_ACTIVITY__INSTANCE_TYPE;

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
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___SEARCH_FOR_JOIN__ELIST_ELIST = FINAL_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = FINAL_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST;

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
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.LinearActivityImpl <em>Linear Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.LinearActivityImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getLinearActivity()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY__STATE_ID = ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY__INSTANCE = ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY__INSTANCE_TYPE = ACTIVITY__INSTANCE_TYPE;

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
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Linear Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.ForkImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getFork()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__STATE_ID = ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__INSTANCE = ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__INSTANCE_TYPE = ACTIVITY__INSTANCE_TYPE;

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
	 * The feature id for the '<em><b>Join</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__JOIN = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

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
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___SEARCH_FOR_JOIN__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.DecisionImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getDecision()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__STATE_ID = LINEAR_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__INSTANCE = LINEAR_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__INSTANCE_TYPE = LINEAR_ACTIVITY__INSTANCE_TYPE;

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
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___SEARCH_FOR_JOIN__ELIST_ELIST = LINEAR_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST;

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
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = LINEAR_ACTIVITY_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BranchImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getBranch()
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
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.JoinImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getJoin()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__STATE_ID = LINEAR_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__INSTANCE = LINEAR_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__INSTANCE_TYPE = LINEAR_ACTIVITY__INSTANCE_TYPE;

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
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___SEARCH_FOR_JOIN__ELIST_ELIST = LINEAR_ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.SharedResourceImpl <em>Shared Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.SharedResourceImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getSharedResource()
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
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.InterruptImpl <em>Interrupt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.InterruptImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getInterrupt()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__STATE_ID = LINEAR_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__INSTANCE = LINEAR_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT__INSTANCE_TYPE = LINEAR_ACTIVITY__INSTANCE_TYPE;

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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___SEARCH_FOR_JOIN__ELIST_ELIST = LINEAR_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST;

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
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.InstanceImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getInstance()
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
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.InstanceTypeImpl <em>Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.InstanceTypeImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getInstanceType()
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
	 * The feature id for the '<em><b>Forked Threads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TYPE__FORKED_THREADS = 1;

	/**
	 * The number of structural features of the '<em>Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.SleepImpl <em>Sleep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.SleepImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getSleep()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__STATE_ID = LINEAR_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__INSTANCE = LINEAR_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__INSTANCE_TYPE = LINEAR_ACTIVITY__INSTANCE_TYPE;

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
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___SEARCH_FOR_JOIN__ELIST_ELIST = LINEAR_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Sleep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.YieldImpl <em>Yield</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.YieldImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getYield()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__STATE_ID = LINEAR_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__INSTANCE = LINEAR_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD__INSTANCE_TYPE = LINEAR_ACTIVITY__INSTANCE_TYPE;

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
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___SEARCH_FOR_JOIN__ELIST_ELIST = LINEAR_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Yield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.NamedActivityImpl <em>Named Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.NamedActivityImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getNamedActivity()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY__STATE_ID = LINEAR_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY__INSTANCE = LINEAR_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY__INSTANCE_TYPE = LINEAR_ACTIVITY__INSTANCE_TYPE;

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
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST = LINEAR_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Named Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.SimpleActivityImpl <em>Simple Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.SimpleActivityImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getSimpleActivity()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__STATE_ID = NAMED_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__INSTANCE = NAMED_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY__INSTANCE_TYPE = NAMED_ACTIVITY__INSTANCE_TYPE;

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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = NAMED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST = NAMED_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = NAMED_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST;

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
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.NestedActivityImpl <em>Nested Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.NestedActivityImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getNestedActivity()
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
	 * The feature id for the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__STATE_ID = NAMED_ACTIVITY__STATE_ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__INSTANCE = NAMED_ACTIVITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY__INSTANCE_TYPE = NAMED_ACTIVITY__INSTANCE_TYPE;

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
	 * The operation id for the '<em>Get Successor References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = NAMED_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Search For Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST = NAMED_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Activities By State Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = NAMED_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST;

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
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.ForkedThreadImpl <em>Forked Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.ForkedThreadImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getForkedThread()
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
	 * The feature id for the '<em><b>Activities By State Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_THREAD__ACTIVITIES_BY_STATE_ID = INTERRUPTABLE_THREAD__ACTIVITIES_BY_STATE_ID;

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
	 * The meta object id for the '{@link umlad2javacc.basicmodel.BasicModel.impl.NestedThreadImpl <em>Nested Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlad2javacc.basicmodel.BasicModel.impl.NestedThreadImpl
	 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getNestedThread()
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
	 * The feature id for the '<em><b>Activities By State Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_THREAD__ACTIVITIES_BY_STATE_ID = THREAD__ACTIVITIES_BY_STATE_ID;

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
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Thread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.BasicModel.Thread#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Thread#getActivities()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Activities();

	/**
	 * Returns the meta object for the reference list '{@link umlad2javacc.basicmodel.BasicModel.Thread#getActivitiesByStateId <em>Activities By State Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities By State Id</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Thread#getActivitiesByStateId()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_ActivitiesByStateId();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.BasicModel.Thread#getStartActivity <em>Start Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Activity</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Thread#getStartActivity()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_StartActivity();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.BasicModel <em>Basic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Model</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModel
	 * @generated
	 */
	EClass getBasicModel();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.BasicModel.BasicModel#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModel#getResources()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.BasicModel.BasicModel#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModel#getInstances()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.BasicModel.BasicModel#getInstanceTypes <em>Instance Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Types</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModel#getInstanceTypes()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_InstanceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.BasicModel.BasicModel#getNestedThreads <em>Nested Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Threads</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModel#getNestedThreads()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_NestedThreads();

	/**
	 * Returns the meta object for the reference list '{@link umlad2javacc.basicmodel.BasicModel.BasicModel#getForkedThreads <em>Forked Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forked Threads</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModel#getForkedThreads()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_ForkedThreads();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.BasicModel.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.BasicModel.Activity#getStateId <em>State Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Id</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#getStateId()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_StateId();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.BasicModel.Activity#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#getInstance()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Instance();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.BasicModel.Activity#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Type</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#getInstanceType()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_InstanceType();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.BasicModel.Activity#getThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thread</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#getThread()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Thread();

	/**
	 * Returns the meta object for the reference list '{@link umlad2javacc.basicmodel.BasicModel.Activity#getAccessedReferences <em>Accessed References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessed References</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#getAccessedReferences()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_AccessedReferences();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Activity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Activity#UsesDifferentThread(umlad2javacc.basicmodel.BasicModel.Activity) <em>Uses Different Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Uses Different Thread</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#UsesDifferentThread(umlad2javacc.basicmodel.BasicModel.Activity)
	 * @generated
	 */
	EOperation getActivity__UsesDifferentThread__Activity();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Activity#UsesSameThread(umlad2javacc.basicmodel.BasicModel.Activity) <em>Uses Same Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Uses Same Thread</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#UsesSameThread(umlad2javacc.basicmodel.BasicModel.Activity)
	 * @generated
	 */
	EOperation getActivity__UsesSameThread__Activity();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Activity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accessed References</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__GetAccessedReferences__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Activity#SearchForJoin(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Search For Join</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Join</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#SearchForJoin(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__SearchForJoin__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Activity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Activity#GetActivitiesByStateId(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Activities By State Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Activities By State Id</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity#GetActivitiesByStateId(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__GetActivitiesByStateId__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.FinalActivity <em>Final Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Activity</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.FinalActivity
	 * @generated
	 */
	EClass getFinalActivity();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.FinalActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.FinalActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFinalActivity__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.FinalActivity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.FinalActivity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFinalActivity__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.LinearActivity <em>Linear Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Activity</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.LinearActivity
	 * @generated
	 */
	EClass getLinearActivity();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.BasicModel.LinearActivity#getNextActivity <em>Next Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Activity</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.LinearActivity#getNextActivity()
	 * @see #getLinearActivity()
	 * @generated
	 */
	EReference getLinearActivity_NextActivity();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.LinearActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.LinearActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getLinearActivity__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.LinearActivity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.LinearActivity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getLinearActivity__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.LinearActivity#SearchForJoin(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Search For Join</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Join</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.LinearActivity#SearchForJoin(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getLinearActivity__SearchForJoin__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.LinearActivity#GetActivitiesByStateId(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Activities By State Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Activities By State Id</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.LinearActivity#GetActivitiesByStateId(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getLinearActivity__GetActivitiesByStateId__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.BasicModel.Fork#getMaxThreadCount <em>Max Thread Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Thread Count</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Fork#getMaxThreadCount()
	 * @see #getFork()
	 * @generated
	 */
	EAttribute getFork_MaxThreadCount();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.BasicModel.Fork#getForkedThreads <em>Forked Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forked Threads</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Fork#getForkedThreads()
	 * @see #getFork()
	 * @generated
	 */
	EReference getFork_ForkedThreads();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.BasicModel.Fork#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Join</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Fork#getJoin()
	 * @see #getFork()
	 * @generated
	 */
	EReference getFork_Join();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Fork#JoinsCorrectly() <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Fork#JoinsCorrectly()
	 * @generated
	 */
	EOperation getFork__JoinsCorrectly();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Fork#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Fork#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFork__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Fork#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Fork#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFork__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Fork#SearchForJoin(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Search For Join</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Join</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Fork#SearchForJoin(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFork__SearchForJoin__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Fork#GetActivitiesByStateId(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Activities By State Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Activities By State Id</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Fork#GetActivitiesByStateId(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFork__GetActivitiesByStateId__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the containment reference list '{@link umlad2javacc.basicmodel.BasicModel.Decision#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Decision#getBranches()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Branches();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Decision#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Decision#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDecision__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Decision#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Decision#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDecision__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Decision#GetActivitiesByStateId(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Activities By State Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Activities By State Id</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Decision#GetActivitiesByStateId(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDecision__GetActivitiesByStateId__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.BasicModel.Branch#getNextActivity <em>Next Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Activity</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Branch#getNextActivity()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_NextActivity();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.BasicModel.Branch#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Branch#getCondition()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Condition();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Join#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Join#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getJoin__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Join#SearchForJoin(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Search For Join</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Join</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Join#SearchForJoin(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getJoin__SearchForJoin__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.SharedResource <em>Shared Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Resource</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.SharedResource
	 * @generated
	 */
	EClass getSharedResource();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.Interrupt <em>Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Interrupt
	 * @generated
	 */
	EClass getInterrupt();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.BasicModel.Interrupt#getInterruptedThread <em>Interrupted Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interrupted Thread</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Interrupt#getInterruptedThread()
	 * @see #getInterrupt()
	 * @generated
	 */
	EReference getInterrupt_InterruptedThread();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.Interrupt#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.Interrupt#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getInterrupt__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.BasicModel.Instance#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Type</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Instance#getInstanceType()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_InstanceType();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.InstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Type</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.InstanceType
	 * @generated
	 */
	EClass getInstanceType();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.BasicModel.InstanceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.InstanceType#getName()
	 * @see #getInstanceType()
	 * @generated
	 */
	EAttribute getInstanceType_Name();

	/**
	 * Returns the meta object for the reference list '{@link umlad2javacc.basicmodel.BasicModel.InstanceType#getForkedThreads <em>Forked Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forked Threads</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.InstanceType#getForkedThreads()
	 * @see #getInstanceType()
	 * @generated
	 */
	EReference getInstanceType_ForkedThreads();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.Sleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sleep</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Sleep
	 * @generated
	 */
	EClass getSleep();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.BasicModel.Sleep#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Sleep#getDuration()
	 * @see #getSleep()
	 * @generated
	 */
	EAttribute getSleep_Duration();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.Yield <em>Yield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yield</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Yield
	 * @generated
	 */
	EClass getYield();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.SimpleActivity <em>Simple Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Activity</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.SimpleActivity
	 * @generated
	 */
	EClass getSimpleActivity();

	/**
	 * Returns the meta object for the reference list '{@link umlad2javacc.basicmodel.BasicModel.SimpleActivity#getSharedResources <em>Shared Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shared Resources</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.SimpleActivity#getSharedResources()
	 * @see #getSimpleActivity()
	 * @generated
	 */
	EReference getSimpleActivity_SharedResources();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.SimpleActivity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Successor References</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.SimpleActivity#GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSimpleActivity__GetSuccessorReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.NestedActivity <em>Nested Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Activity</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.NestedActivity
	 * @generated
	 */
	EClass getNestedActivity();

	/**
	 * Returns the meta object for the reference '{@link umlad2javacc.basicmodel.BasicModel.NestedActivity#getNestedThread <em>Nested Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nested Thread</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.NestedActivity#getNestedThread()
	 * @see #getNestedActivity()
	 * @generated
	 */
	EReference getNestedActivity_NestedThread();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.NestedActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.NestedActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getNestedActivity__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link umlad2javacc.basicmodel.BasicModel.NestedActivity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accessed References</em>' operation.
	 * @see umlad2javacc.basicmodel.BasicModel.NestedActivity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getNestedActivity__GetAccessedReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.ForkedThread <em>Forked Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Thread</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.ForkedThread
	 * @generated
	 */
	EClass getForkedThread();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.BasicModel.ForkedThread#isDaemon <em>Daemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daemon</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.ForkedThread#isDaemon()
	 * @see #getForkedThread()
	 * @generated
	 */
	EAttribute getForkedThread_Daemon();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.NamedActivity <em>Named Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Activity</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.NamedActivity
	 * @generated
	 */
	EClass getNamedActivity();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.BasicModel.NamedActivity#getActivityName <em>Activity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Name</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.NamedActivity#getActivityName()
	 * @see #getNamedActivity()
	 * @generated
	 */
	EAttribute getNamedActivity_ActivityName();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link umlad2javacc.basicmodel.BasicModel.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.NestedThread <em>Nested Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Thread</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.NestedThread
	 * @generated
	 */
	EClass getNestedThread();

	/**
	 * Returns the meta object for class '{@link umlad2javacc.basicmodel.BasicModel.InterruptableThread <em>Interruptable Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interruptable Thread</em>'.
	 * @see umlad2javacc.basicmodel.BasicModel.InterruptableThread
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
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.ThreadImpl <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.ThreadImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getThread()
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
		 * The meta object literal for the '<em><b>Activities By State Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__ACTIVITIES_BY_STATE_ID = eINSTANCE.getThread_ActivitiesByStateId();

		/**
		 * The meta object literal for the '<em><b>Start Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__START_ACTIVITY = eINSTANCE.getThread_StartActivity();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.BasicModelImpl <em>Basic Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getBasicModel()
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
		 * The meta object literal for the '<em><b>Forked Threads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_MODEL__FORKED_THREADS = eINSTANCE.getBasicModel_ForkedThreads();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.ActivityImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getActivity()
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
		 * The meta object literal for the '<em><b>State Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__STATE_ID = eINSTANCE.getActivity_StateId();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INSTANCE = eINSTANCE.getActivity_Instance();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INSTANCE_TYPE = eINSTANCE.getActivity_InstanceType();

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
		 * The meta object literal for the '<em><b>Search For Join</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST = eINSTANCE.getActivity__SearchForJoin__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Successor References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST = eINSTANCE.getActivity__GetSuccessorReferences__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Activities By State Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = eINSTANCE.getActivity__GetActivitiesByStateId__EList_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.EndImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.FinalActivityImpl <em>Final Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.FinalActivityImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getFinalActivity()
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
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.LinearActivityImpl <em>Linear Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.LinearActivityImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getLinearActivity()
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
		 * The meta object literal for the '<em><b>Search For Join</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINEAR_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST = eINSTANCE.getLinearActivity__SearchForJoin__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Activities By State Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINEAR_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = eINSTANCE.getLinearActivity__GetActivitiesByStateId__EList_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.ForkImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getFork()
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
		 * The meta object literal for the '<em><b>Join</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK__JOIN = eINSTANCE.getFork_Join();

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
		 * The meta object literal for the '<em><b>Search For Join</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORK___SEARCH_FOR_JOIN__ELIST_ELIST = eINSTANCE.getFork__SearchForJoin__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Activities By State Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORK___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = eINSTANCE.getFork__GetActivitiesByStateId__EList_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.DecisionImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getDecision()
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
		 * The meta object literal for the '<em><b>Get Activities By State Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST = eINSTANCE.getDecision__GetActivitiesByStateId__EList_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BranchImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getBranch()
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
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.JoinImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getJoin()
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
		 * The meta object literal for the '<em><b>Search For Join</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOIN___SEARCH_FOR_JOIN__ELIST_ELIST = eINSTANCE.getJoin__SearchForJoin__EList_EList();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.SharedResourceImpl <em>Shared Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.SharedResourceImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getSharedResource()
		 * @generated
		 */
		EClass SHARED_RESOURCE = eINSTANCE.getSharedResource();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.InterruptImpl <em>Interrupt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.InterruptImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getInterrupt()
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
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.InstanceImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getInstance()
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
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.InstanceTypeImpl <em>Instance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.InstanceTypeImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getInstanceType()
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
		 * The meta object literal for the '<em><b>Forked Threads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_TYPE__FORKED_THREADS = eINSTANCE.getInstanceType_ForkedThreads();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.SleepImpl <em>Sleep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.SleepImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getSleep()
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
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.YieldImpl <em>Yield</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.YieldImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getYield()
		 * @generated
		 */
		EClass YIELD = eINSTANCE.getYield();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.SimpleActivityImpl <em>Simple Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.SimpleActivityImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getSimpleActivity()
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
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.NestedActivityImpl <em>Nested Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.NestedActivityImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getNestedActivity()
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
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.ForkedThreadImpl <em>Forked Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.ForkedThreadImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getForkedThread()
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
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.NamedActivityImpl <em>Named Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.NamedActivityImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getNamedActivity()
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
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.ReferenceImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getReference()
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
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.NestedThreadImpl <em>Nested Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.NestedThreadImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getNestedThread()
		 * @generated
		 */
		EClass NESTED_THREAD = eINSTANCE.getNestedThread();

		/**
		 * The meta object literal for the '{@link umlad2javacc.basicmodel.BasicModel.impl.InterruptableThreadImpl <em>Interruptable Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlad2javacc.basicmodel.BasicModel.impl.InterruptableThreadImpl
		 * @see umlad2javacc.basicmodel.BasicModel.impl.BasicModelPackageImpl#getInterruptableThread()
		 * @generated
		 */
		EClass INTERRUPTABLE_THREAD = eINSTANCE.getInterruptableThread();

	}

} //BasicModelPackage
