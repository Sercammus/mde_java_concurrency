/**
 */
package ActivityDiagram;

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
 * @see ActivityDiagram.ActivityDiagramFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ActivityDiagramPackage extends EPackage {
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
	ActivityDiagramPackage eINSTANCE = ActivityDiagram.impl.ActivityDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.ReferenceImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getReference()
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
	 * The meta object id for the '{@link ActivityDiagram.impl.ThreadImpl <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.ThreadImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getThread()
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
	 * The meta object id for the '{@link ActivityDiagram.impl.BasicModelImpl <em>Basic Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.BasicModelImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getBasicModel()
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
	int BASIC_MODEL__NAME = THREAD__NAME;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__ACTIVITIES = THREAD__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Start Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__START_ACTIVITY = THREAD__START_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__RESOURCES = THREAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__INSTANCES = THREAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__INSTANCE_TYPES = THREAD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL__THREADS = THREAD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Basic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL_FEATURE_COUNT = THREAD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Basic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MODEL_OPERATION_COUNT = THREAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.ActivityImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getActivity()
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
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__THREAD = 2;

	/**
	 * The feature id for the '<em><b>Accessed References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACCESSED_REFERENCES = 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___JOINS_CORRECTLY = 0;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___JOINS_CORRECTLY__ELIST = 1;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = 2;

	/**
	 * The operation id for the '<em>Uses Different Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY = 3;

	/**
	 * The operation id for the '<em>Uses Same Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___USES_SAME_THREAD__ACTIVITY = 4;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = 5;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.FinalActivityImpl <em>Final Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.FinalActivityImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getFinalActivity()
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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___JOINS_CORRECTLY = ACTIVITY___JOINS_CORRECTLY;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___JOINS_CORRECTLY__ELIST = ACTIVITY___JOINS_CORRECTLY__ELIST;

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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Final Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.EndImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getEnd()
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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___JOINS_CORRECTLY = FINAL_ACTIVITY___JOINS_CORRECTLY;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___JOINS_CORRECTLY__ELIST = FINAL_ACTIVITY___JOINS_CORRECTLY__ELIST;

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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___JOINS_CORRECTLY__ELIST_ELIST = FINAL_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___GET_ACCESSED_REFERENCES__ELIST_ELIST = FINAL_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = FINAL_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.LinearActivityImpl <em>Linear Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.LinearActivityImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getLinearActivity()
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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___JOINS_CORRECTLY = ACTIVITY___JOINS_CORRECTLY;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST = ACTIVITY___JOINS_CORRECTLY__ELIST;

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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Linear Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.ForkImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getFork()
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
	 * The feature id for the '<em><b>Forked Threads</b></em>' reference list.
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
	int FORK___JOINS_CORRECTLY__ELIST = ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___JOINS_CORRECTLY__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK___GET_ACCESSED_REFERENCES__ELIST_ELIST = ACTIVITY_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.DecisionImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getDecision()
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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___JOINS_CORRECTLY = LINEAR_ACTIVITY___JOINS_CORRECTLY;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___JOINS_CORRECTLY__ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST;

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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION___GET_ACCESSED_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.BranchImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getBranch()
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
	 * The meta object id for the '{@link ActivityDiagram.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.JoinImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getJoin()
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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___JOINS_CORRECTLY = LINEAR_ACTIVITY___JOINS_CORRECTLY;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___JOINS_CORRECTLY__ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST;

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
	 * The meta object id for the '{@link ActivityDiagram.impl.SharedResourceImpl <em>Shared Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.SharedResourceImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getSharedResource()
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
	 * The meta object id for the '{@link ActivityDiagram.impl.InterruptImpl <em>Interrupt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.InterruptImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getInterrupt()
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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___JOINS_CORRECTLY = LINEAR_ACTIVITY___JOINS_CORRECTLY;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___JOINS_CORRECTLY__ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST;

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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT___GET_ACCESSED_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Interrupt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.InstanceImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getInstance()
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
	 * The meta object id for the '{@link ActivityDiagram.impl.InstanceTypeImpl <em>Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.InstanceTypeImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getInstanceType()
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
	 * The meta object id for the '{@link ActivityDiagram.impl.SleepImpl <em>Sleep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.SleepImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getSleep()
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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___JOINS_CORRECTLY = LINEAR_ACTIVITY___JOINS_CORRECTLY;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___JOINS_CORRECTLY__ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST;

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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP___GET_ACCESSED_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Sleep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.YieldImpl <em>Yield</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.YieldImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getYield()
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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___JOINS_CORRECTLY = LINEAR_ACTIVITY___JOINS_CORRECTLY;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___JOINS_CORRECTLY__ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST;

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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD___GET_ACCESSED_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Yield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.NamedActivityImpl <em>Named Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.NamedActivityImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getNamedActivity()
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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___JOINS_CORRECTLY = LINEAR_ACTIVITY___JOINS_CORRECTLY;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___JOINS_CORRECTLY__ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST;

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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Named Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACTIVITY_OPERATION_COUNT = LINEAR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.SimpleActivityImpl <em>Simple Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.SimpleActivityImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getSimpleActivity()
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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___JOINS_CORRECTLY = NAMED_ACTIVITY___JOINS_CORRECTLY;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___JOINS_CORRECTLY__ELIST = NAMED_ACTIVITY___JOINS_CORRECTLY__ELIST;

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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST = NAMED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Accessed References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = NAMED_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTIVITY_OPERATION_COUNT = NAMED_ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ActivityDiagram.impl.NestedActivityImpl <em>Nested Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.NestedActivityImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getNestedActivity()
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
	 * The feature id for the '<em><b>Nested Thread</b></em>' containment reference.
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
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY___JOINS_CORRECTLY = NAMED_ACTIVITY___JOINS_CORRECTLY;

	/**
	 * The operation id for the '<em>Joins Correctly</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ACTIVITY___JOINS_CORRECTLY__ELIST = NAMED_ACTIVITY___JOINS_CORRECTLY__ELIST;

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
	 * The meta object id for the '{@link ActivityDiagram.impl.ForkedThreadImpl <em>Forked Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagram.impl.ForkedThreadImpl
	 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getForkedThread()
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
	int FORKED_THREAD__NAME = THREAD__NAME;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_THREAD__ACTIVITIES = THREAD__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Start Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_THREAD__START_ACTIVITY = THREAD__START_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Daemon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_THREAD__DAEMON = THREAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forked Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_THREAD_FEATURE_COUNT = THREAD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Forked Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_THREAD_OPERATION_COUNT = THREAD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ActivityDiagram.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see ActivityDiagram.Thread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagram.Thread#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see ActivityDiagram.Thread#getActivities()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Activities();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagram.Thread#getStartActivity <em>Start Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Activity</em>'.
	 * @see ActivityDiagram.Thread#getStartActivity()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_StartActivity();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.BasicModel <em>Basic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Model</em>'.
	 * @see ActivityDiagram.BasicModel
	 * @generated
	 */
	EClass getBasicModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagram.BasicModel#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see ActivityDiagram.BasicModel#getResources()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagram.BasicModel#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see ActivityDiagram.BasicModel#getInstances()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagram.BasicModel#getInstanceTypes <em>Instance Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Types</em>'.
	 * @see ActivityDiagram.BasicModel#getInstanceTypes()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_InstanceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagram.BasicModel#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threads</em>'.
	 * @see ActivityDiagram.BasicModel#getThreads()
	 * @see #getBasicModel()
	 * @generated
	 */
	EReference getBasicModel_Threads();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see ActivityDiagram.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagram.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityDiagram.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagram.Activity#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see ActivityDiagram.Activity#getInstance()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Instance();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagram.Activity#getThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thread</em>'.
	 * @see ActivityDiagram.Activity#getThread()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Thread();

	/**
	 * Returns the meta object for the reference list '{@link ActivityDiagram.Activity#getAccessedReferences <em>Accessed References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessed References</em>'.
	 * @see ActivityDiagram.Activity#getAccessedReferences()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_AccessedReferences();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Activity#JoinsCorrectly() <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see ActivityDiagram.Activity#JoinsCorrectly()
	 * @generated
	 */
	EOperation getActivity__JoinsCorrectly();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Activity#JoinsCorrectly(org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see ActivityDiagram.Activity#JoinsCorrectly(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__JoinsCorrectly__EList();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Activity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see ActivityDiagram.Activity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Activity#UsesDifferentThread(ActivityDiagram.Activity) <em>Uses Different Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Uses Different Thread</em>' operation.
	 * @see ActivityDiagram.Activity#UsesDifferentThread(ActivityDiagram.Activity)
	 * @generated
	 */
	EOperation getActivity__UsesDifferentThread__Activity();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Activity#UsesSameThread(ActivityDiagram.Activity) <em>Uses Same Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Uses Same Thread</em>' operation.
	 * @see ActivityDiagram.Activity#UsesSameThread(ActivityDiagram.Activity)
	 * @generated
	 */
	EOperation getActivity__UsesSameThread__Activity();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Activity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accessed References</em>' operation.
	 * @see ActivityDiagram.Activity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActivity__GetAccessedReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see ActivityDiagram.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.FinalActivity <em>Final Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Activity</em>'.
	 * @see ActivityDiagram.FinalActivity
	 * @generated
	 */
	EClass getFinalActivity();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.FinalActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see ActivityDiagram.FinalActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFinalActivity__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.FinalActivity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accessed References</em>' operation.
	 * @see ActivityDiagram.FinalActivity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFinalActivity__GetAccessedReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.LinearActivity <em>Linear Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Activity</em>'.
	 * @see ActivityDiagram.LinearActivity
	 * @generated
	 */
	EClass getLinearActivity();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagram.LinearActivity#getNextActivity <em>Next Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Activity</em>'.
	 * @see ActivityDiagram.LinearActivity#getNextActivity()
	 * @see #getLinearActivity()
	 * @generated
	 */
	EReference getLinearActivity_NextActivity();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.LinearActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see ActivityDiagram.LinearActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getLinearActivity__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.LinearActivity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accessed References</em>' operation.
	 * @see ActivityDiagram.LinearActivity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getLinearActivity__GetAccessedReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see ActivityDiagram.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagram.Fork#getMaxThreadCount <em>Max Thread Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Thread Count</em>'.
	 * @see ActivityDiagram.Fork#getMaxThreadCount()
	 * @see #getFork()
	 * @generated
	 */
	EAttribute getFork_MaxThreadCount();

	/**
	 * Returns the meta object for the reference list '{@link ActivityDiagram.Fork#getForkedThreads <em>Forked Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forked Threads</em>'.
	 * @see ActivityDiagram.Fork#getForkedThreads()
	 * @see #getFork()
	 * @generated
	 */
	EReference getFork_ForkedThreads();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Fork#JoinsCorrectly() <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see ActivityDiagram.Fork#JoinsCorrectly()
	 * @generated
	 */
	EOperation getFork__JoinsCorrectly();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Fork#JoinsCorrectly(org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see ActivityDiagram.Fork#JoinsCorrectly(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFork__JoinsCorrectly__EList();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Fork#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see ActivityDiagram.Fork#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFork__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Fork#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accessed References</em>' operation.
	 * @see ActivityDiagram.Fork#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getFork__GetAccessedReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see ActivityDiagram.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagram.Decision#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see ActivityDiagram.Decision#getBranches()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Branches();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Decision#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see ActivityDiagram.Decision#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDecision__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Decision#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accessed References</em>' operation.
	 * @see ActivityDiagram.Decision#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDecision__GetAccessedReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see ActivityDiagram.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagram.Branch#getNextActivity <em>Next Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Activity</em>'.
	 * @see ActivityDiagram.Branch#getNextActivity()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_NextActivity();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagram.Branch#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see ActivityDiagram.Branch#getCondition()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Condition();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see ActivityDiagram.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.Join#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see ActivityDiagram.Join#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getJoin__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.SharedResource <em>Shared Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Resource</em>'.
	 * @see ActivityDiagram.SharedResource
	 * @generated
	 */
	EClass getSharedResource();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.Interrupt <em>Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt</em>'.
	 * @see ActivityDiagram.Interrupt
	 * @generated
	 */
	EClass getInterrupt();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagram.Interrupt#getInterruptedThread <em>Interrupted Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interrupted Thread</em>'.
	 * @see ActivityDiagram.Interrupt#getInterruptedThread()
	 * @see #getInterrupt()
	 * @generated
	 */
	EReference getInterrupt_InterruptedThread();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see ActivityDiagram.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagram.Instance#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Type</em>'.
	 * @see ActivityDiagram.Instance#getInstanceType()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_InstanceType();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.InstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Type</em>'.
	 * @see ActivityDiagram.InstanceType
	 * @generated
	 */
	EClass getInstanceType();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagram.InstanceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityDiagram.InstanceType#getName()
	 * @see #getInstanceType()
	 * @generated
	 */
	EAttribute getInstanceType_Name();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.Sleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sleep</em>'.
	 * @see ActivityDiagram.Sleep
	 * @generated
	 */
	EClass getSleep();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagram.Sleep#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see ActivityDiagram.Sleep#getDuration()
	 * @see #getSleep()
	 * @generated
	 */
	EAttribute getSleep_Duration();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.Yield <em>Yield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yield</em>'.
	 * @see ActivityDiagram.Yield
	 * @generated
	 */
	EClass getYield();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.SimpleActivity <em>Simple Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Activity</em>'.
	 * @see ActivityDiagram.SimpleActivity
	 * @generated
	 */
	EClass getSimpleActivity();

	/**
	 * Returns the meta object for the reference list '{@link ActivityDiagram.SimpleActivity#getSharedResources <em>Shared Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shared Resources</em>'.
	 * @see ActivityDiagram.SimpleActivity#getSharedResources()
	 * @see #getSimpleActivity()
	 * @generated
	 */
	EReference getSimpleActivity_SharedResources();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.SimpleActivity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accessed References</em>' operation.
	 * @see ActivityDiagram.SimpleActivity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSimpleActivity__GetAccessedReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.NestedActivity <em>Nested Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Activity</em>'.
	 * @see ActivityDiagram.NestedActivity
	 * @generated
	 */
	EClass getNestedActivity();

	/**
	 * Returns the meta object for the containment reference '{@link ActivityDiagram.NestedActivity#getNestedThread <em>Nested Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nested Thread</em>'.
	 * @see ActivityDiagram.NestedActivity#getNestedThread()
	 * @see #getNestedActivity()
	 * @generated
	 */
	EReference getNestedActivity_NestedThread();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.NestedActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Joins Correctly</em>' operation.
	 * @see ActivityDiagram.NestedActivity#JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getNestedActivity__JoinsCorrectly__EList_EList();

	/**
	 * Returns the meta object for the '{@link ActivityDiagram.NestedActivity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accessed References</em>' operation.
	 * @see ActivityDiagram.NestedActivity#GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getNestedActivity__GetAccessedReferences__EList_EList();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.ForkedThread <em>Forked Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Thread</em>'.
	 * @see ActivityDiagram.ForkedThread
	 * @generated
	 */
	EClass getForkedThread();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagram.ForkedThread#isDaemon <em>Daemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daemon</em>'.
	 * @see ActivityDiagram.ForkedThread#isDaemon()
	 * @see #getForkedThread()
	 * @generated
	 */
	EAttribute getForkedThread_Daemon();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.NamedActivity <em>Named Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Activity</em>'.
	 * @see ActivityDiagram.NamedActivity
	 * @generated
	 */
	EClass getNamedActivity();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagram.NamedActivity#getActivityName <em>Activity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Name</em>'.
	 * @see ActivityDiagram.NamedActivity#getActivityName()
	 * @see #getNamedActivity()
	 * @generated
	 */
	EAttribute getNamedActivity_ActivityName();

	/**
	 * Returns the meta object for class '{@link ActivityDiagram.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see ActivityDiagram.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagram.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityDiagram.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivityDiagramFactory getActivityDiagramFactory();

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
		 * The meta object literal for the '{@link ActivityDiagram.impl.ThreadImpl <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.ThreadImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getThread()
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
		 * The meta object literal for the '{@link ActivityDiagram.impl.BasicModelImpl <em>Basic Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.BasicModelImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getBasicModel()
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
		 * The meta object literal for the '<em><b>Threads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_MODEL__THREADS = eINSTANCE.getBasicModel_Threads();

		/**
		 * The meta object literal for the '{@link ActivityDiagram.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.ActivityImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getActivity()
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
		EOperation ACTIVITY___JOINS_CORRECTLY = eINSTANCE.getActivity__JoinsCorrectly();

		/**
		 * The meta object literal for the '<em><b>Joins Correctly</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY___JOINS_CORRECTLY__ELIST = eINSTANCE.getActivity__JoinsCorrectly__EList();

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
		 * The meta object literal for the '{@link ActivityDiagram.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.EndImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link ActivityDiagram.impl.FinalActivityImpl <em>Final Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.FinalActivityImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getFinalActivity()
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
		 * The meta object literal for the '<em><b>Get Accessed References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FINAL_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = eINSTANCE.getFinalActivity__GetAccessedReferences__EList_EList();

		/**
		 * The meta object literal for the '{@link ActivityDiagram.impl.LinearActivityImpl <em>Linear Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.LinearActivityImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getLinearActivity()
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
		 * The meta object literal for the '<em><b>Get Accessed References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = eINSTANCE.getLinearActivity__GetAccessedReferences__EList_EList();

		/**
		 * The meta object literal for the '{@link ActivityDiagram.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.ForkImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getFork()
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
		 * The meta object literal for the '<em><b>Forked Threads</b></em>' reference list feature.
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
		EOperation FORK___JOINS_CORRECTLY__ELIST = eINSTANCE.getFork__JoinsCorrectly__EList();

		/**
		 * The meta object literal for the '<em><b>Joins Correctly</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORK___JOINS_CORRECTLY__ELIST_ELIST = eINSTANCE.getFork__JoinsCorrectly__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Get Accessed References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORK___GET_ACCESSED_REFERENCES__ELIST_ELIST = eINSTANCE.getFork__GetAccessedReferences__EList_EList();

		/**
		 * The meta object literal for the '{@link ActivityDiagram.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.DecisionImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getDecision()
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
		 * The meta object literal for the '<em><b>Get Accessed References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION___GET_ACCESSED_REFERENCES__ELIST_ELIST = eINSTANCE.getDecision__GetAccessedReferences__EList_EList();

		/**
		 * The meta object literal for the '{@link ActivityDiagram.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.BranchImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getBranch()
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
		 * The meta object literal for the '{@link ActivityDiagram.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.JoinImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getJoin()
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
		 * The meta object literal for the '{@link ActivityDiagram.impl.SharedResourceImpl <em>Shared Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.SharedResourceImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getSharedResource()
		 * @generated
		 */
		EClass SHARED_RESOURCE = eINSTANCE.getSharedResource();

		/**
		 * The meta object literal for the '{@link ActivityDiagram.impl.InterruptImpl <em>Interrupt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.InterruptImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getInterrupt()
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
		 * The meta object literal for the '{@link ActivityDiagram.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.InstanceImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getInstance()
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
		 * The meta object literal for the '{@link ActivityDiagram.impl.InstanceTypeImpl <em>Instance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.InstanceTypeImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getInstanceType()
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
		 * The meta object literal for the '{@link ActivityDiagram.impl.SleepImpl <em>Sleep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.SleepImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getSleep()
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
		 * The meta object literal for the '{@link ActivityDiagram.impl.YieldImpl <em>Yield</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.YieldImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getYield()
		 * @generated
		 */
		EClass YIELD = eINSTANCE.getYield();

		/**
		 * The meta object literal for the '{@link ActivityDiagram.impl.SimpleActivityImpl <em>Simple Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.SimpleActivityImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getSimpleActivity()
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
		 * The meta object literal for the '<em><b>Get Accessed References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST = eINSTANCE.getSimpleActivity__GetAccessedReferences__EList_EList();

		/**
		 * The meta object literal for the '{@link ActivityDiagram.impl.NestedActivityImpl <em>Nested Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.NestedActivityImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getNestedActivity()
		 * @generated
		 */
		EClass NESTED_ACTIVITY = eINSTANCE.getNestedActivity();

		/**
		 * The meta object literal for the '<em><b>Nested Thread</b></em>' containment reference feature.
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
		 * The meta object literal for the '{@link ActivityDiagram.impl.ForkedThreadImpl <em>Forked Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.ForkedThreadImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getForkedThread()
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
		 * The meta object literal for the '{@link ActivityDiagram.impl.NamedActivityImpl <em>Named Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.NamedActivityImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getNamedActivity()
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
		 * The meta object literal for the '{@link ActivityDiagram.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagram.impl.ReferenceImpl
		 * @see ActivityDiagram.impl.ActivityDiagramPackageImpl#getReference()
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

	}

} //ActivityDiagramPackage
