/**
 */
package ActivityDiagram.impl;

import ActivityDiagram.Activity;
import ActivityDiagram.ActivityDiagramFactory;
import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.BasicModel;
import ActivityDiagram.Branch;
import ActivityDiagram.Decision;
import ActivityDiagram.End;
import ActivityDiagram.FinalActivity;
import ActivityDiagram.Fork;
import ActivityDiagram.ForkedThread;
import ActivityDiagram.Instance;
import ActivityDiagram.InstanceType;
import ActivityDiagram.Interrupt;
import ActivityDiagram.Join;
import ActivityDiagram.LinearActivity;
import ActivityDiagram.NamedActivity;
import ActivityDiagram.NestedActivity;
import ActivityDiagram.Reference;
import ActivityDiagram.SharedResource;
import ActivityDiagram.SimpleActivity;
import ActivityDiagram.Sleep;
import ActivityDiagram.Yield;

import ActivityDiagram.util.ActivityDiagramValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityDiagramPackageImpl extends EPackageImpl implements ActivityDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sleepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkedThreadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ActivityDiagram.ActivityDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivityDiagramPackageImpl() {
		super(eNS_URI, ActivityDiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ActivityDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivityDiagramPackage init() {
		if (isInited) return (ActivityDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivityDiagramPackage.eNS_URI);

		// Obtain or create and register package
		ActivityDiagramPackageImpl theActivityDiagramPackage = (ActivityDiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivityDiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivityDiagramPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theActivityDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theActivityDiagramPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theActivityDiagramPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ActivityDiagramValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theActivityDiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivityDiagramPackage.eNS_URI, theActivityDiagramPackage);
		return theActivityDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThread() {
		return threadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_Activities() {
		return (EReference)threadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_StartActivity() {
		return (EReference)threadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicModel() {
		return basicModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicModel_Resources() {
		return (EReference)basicModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicModel_Instances() {
		return (EReference)basicModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicModel_InstanceTypes() {
		return (EReference)basicModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicModel_Threads() {
		return (EReference)basicModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Name() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Instance() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Thread() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_AccessedReferences() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__JoinsCorrectly() {
		return activityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__JoinsCorrectly__EList() {
		return activityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__JoinsCorrectly__EList_EList() {
		return activityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__UsesDifferentThread__Activity() {
		return activityEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__UsesSameThread__Activity() {
		return activityEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__GetAccessedReferences__EList_EList() {
		return activityEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalActivity() {
		return finalActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFinalActivity__JoinsCorrectly__EList_EList() {
		return finalActivityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFinalActivity__GetAccessedReferences__EList_EList() {
		return finalActivityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearActivity() {
		return linearActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearActivity_NextActivity() {
		return (EReference)linearActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinearActivity__JoinsCorrectly__EList_EList() {
		return linearActivityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinearActivity__GetAccessedReferences__EList_EList() {
		return linearActivityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFork() {
		return forkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFork_MaxThreadCount() {
		return (EAttribute)forkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFork_ForkedThreads() {
		return (EReference)forkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFork__JoinsCorrectly() {
		return forkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFork__JoinsCorrectly__EList() {
		return forkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFork__JoinsCorrectly__EList_EList() {
		return forkEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFork__GetAccessedReferences__EList_EList() {
		return forkEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_Branches() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecision__JoinsCorrectly__EList_EList() {
		return decisionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecision__GetAccessedReferences__EList_EList() {
		return decisionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_NextActivity() {
		return (EReference)branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_Condition() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJoin__JoinsCorrectly__EList_EList() {
		return joinEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedResource() {
		return sharedResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterrupt() {
		return interruptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterrupt_InterruptedThread() {
		return (EReference)interruptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_InstanceType() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceType() {
		return instanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceType_Name() {
		return (EAttribute)instanceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSleep() {
		return sleepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSleep_Duration() {
		return (EAttribute)sleepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYield() {
		return yieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleActivity() {
		return simpleActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleActivity_SharedResources() {
		return (EReference)simpleActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimpleActivity__GetAccessedReferences__EList_EList() {
		return simpleActivityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedActivity() {
		return nestedActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedActivity_NestedThread() {
		return (EReference)nestedActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedActivity__JoinsCorrectly__EList_EList() {
		return nestedActivityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNestedActivity__GetAccessedReferences__EList_EList() {
		return nestedActivityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedThread() {
		return forkedThreadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForkedThread_Daemon() {
		return (EAttribute)forkedThreadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedActivity() {
		return namedActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedActivity_ActivityName() {
		return (EAttribute)namedActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Name() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramFactory getActivityDiagramFactory() {
		return (ActivityDiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		threadEClass = createEClass(THREAD);
		createEReference(threadEClass, THREAD__ACTIVITIES);
		createEReference(threadEClass, THREAD__START_ACTIVITY);

		basicModelEClass = createEClass(BASIC_MODEL);
		createEReference(basicModelEClass, BASIC_MODEL__RESOURCES);
		createEReference(basicModelEClass, BASIC_MODEL__INSTANCES);
		createEReference(basicModelEClass, BASIC_MODEL__INSTANCE_TYPES);
		createEReference(basicModelEClass, BASIC_MODEL__THREADS);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__NAME);
		createEReference(activityEClass, ACTIVITY__INSTANCE);
		createEReference(activityEClass, ACTIVITY__THREAD);
		createEReference(activityEClass, ACTIVITY__ACCESSED_REFERENCES);
		createEOperation(activityEClass, ACTIVITY___JOINS_CORRECTLY);
		createEOperation(activityEClass, ACTIVITY___JOINS_CORRECTLY__ELIST);
		createEOperation(activityEClass, ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST);
		createEOperation(activityEClass, ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY);
		createEOperation(activityEClass, ACTIVITY___USES_SAME_THREAD__ACTIVITY);
		createEOperation(activityEClass, ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST);

		endEClass = createEClass(END);

		finalActivityEClass = createEClass(FINAL_ACTIVITY);
		createEOperation(finalActivityEClass, FINAL_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST);
		createEOperation(finalActivityEClass, FINAL_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST);

		linearActivityEClass = createEClass(LINEAR_ACTIVITY);
		createEReference(linearActivityEClass, LINEAR_ACTIVITY__NEXT_ACTIVITY);
		createEOperation(linearActivityEClass, LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST);
		createEOperation(linearActivityEClass, LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST);

		forkEClass = createEClass(FORK);
		createEAttribute(forkEClass, FORK__MAX_THREAD_COUNT);
		createEReference(forkEClass, FORK__FORKED_THREADS);
		createEOperation(forkEClass, FORK___JOINS_CORRECTLY);
		createEOperation(forkEClass, FORK___JOINS_CORRECTLY__ELIST);
		createEOperation(forkEClass, FORK___JOINS_CORRECTLY__ELIST_ELIST);
		createEOperation(forkEClass, FORK___GET_ACCESSED_REFERENCES__ELIST_ELIST);

		decisionEClass = createEClass(DECISION);
		createEReference(decisionEClass, DECISION__BRANCHES);
		createEOperation(decisionEClass, DECISION___JOINS_CORRECTLY__ELIST_ELIST);
		createEOperation(decisionEClass, DECISION___GET_ACCESSED_REFERENCES__ELIST_ELIST);

		branchEClass = createEClass(BRANCH);
		createEReference(branchEClass, BRANCH__NEXT_ACTIVITY);
		createEAttribute(branchEClass, BRANCH__CONDITION);

		joinEClass = createEClass(JOIN);
		createEOperation(joinEClass, JOIN___JOINS_CORRECTLY__ELIST_ELIST);

		sharedResourceEClass = createEClass(SHARED_RESOURCE);

		interruptEClass = createEClass(INTERRUPT);
		createEReference(interruptEClass, INTERRUPT__INTERRUPTED_THREAD);

		instanceEClass = createEClass(INSTANCE);
		createEReference(instanceEClass, INSTANCE__INSTANCE_TYPE);

		instanceTypeEClass = createEClass(INSTANCE_TYPE);
		createEAttribute(instanceTypeEClass, INSTANCE_TYPE__NAME);

		sleepEClass = createEClass(SLEEP);
		createEAttribute(sleepEClass, SLEEP__DURATION);

		yieldEClass = createEClass(YIELD);

		simpleActivityEClass = createEClass(SIMPLE_ACTIVITY);
		createEReference(simpleActivityEClass, SIMPLE_ACTIVITY__SHARED_RESOURCES);
		createEOperation(simpleActivityEClass, SIMPLE_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST);

		nestedActivityEClass = createEClass(NESTED_ACTIVITY);
		createEReference(nestedActivityEClass, NESTED_ACTIVITY__NESTED_THREAD);
		createEOperation(nestedActivityEClass, NESTED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST);
		createEOperation(nestedActivityEClass, NESTED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST);

		forkedThreadEClass = createEClass(FORKED_THREAD);
		createEAttribute(forkedThreadEClass, FORKED_THREAD__DAEMON);

		namedActivityEClass = createEClass(NAMED_ACTIVITY);
		createEAttribute(namedActivityEClass, NAMED_ACTIVITY__ACTIVITY_NAME);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		threadEClass.getESuperTypes().add(this.getReference());
		basicModelEClass.getESuperTypes().add(this.getThread());
		endEClass.getESuperTypes().add(this.getFinalActivity());
		finalActivityEClass.getESuperTypes().add(this.getActivity());
		linearActivityEClass.getESuperTypes().add(this.getActivity());
		forkEClass.getESuperTypes().add(this.getActivity());
		decisionEClass.getESuperTypes().add(this.getLinearActivity());
		joinEClass.getESuperTypes().add(this.getLinearActivity());
		sharedResourceEClass.getESuperTypes().add(this.getReference());
		interruptEClass.getESuperTypes().add(this.getLinearActivity());
		instanceEClass.getESuperTypes().add(this.getReference());
		sleepEClass.getESuperTypes().add(this.getLinearActivity());
		yieldEClass.getESuperTypes().add(this.getLinearActivity());
		simpleActivityEClass.getESuperTypes().add(this.getNamedActivity());
		nestedActivityEClass.getESuperTypes().add(this.getNamedActivity());
		forkedThreadEClass.getESuperTypes().add(this.getThread());
		namedActivityEClass.getESuperTypes().add(this.getLinearActivity());

		// Initialize classes, features, and operations; add parameters
		initEClass(threadEClass, ActivityDiagram.Thread.class, "Thread", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThread_Activities(), this.getActivity(), null, "activities", null, 0, -1, ActivityDiagram.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThread_StartActivity(), this.getActivity(), null, "startActivity", null, 1, 1, ActivityDiagram.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicModelEClass, BasicModel.class, "BasicModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicModel_Resources(), this.getSharedResource(), null, "resources", null, 0, -1, BasicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicModel_Instances(), this.getInstance(), null, "instances", null, 0, -1, BasicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicModel_InstanceTypes(), this.getInstanceType(), null, "instanceTypes", null, 0, -1, BasicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicModel_Threads(), this.getThread(), null, "threads", null, 0, -1, BasicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Instance(), this.getInstance(), null, "instance", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Thread(), this.getThread(), null, "thread", null, 0, 1, Activity.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_AccessedReferences(), this.getReference(), null, "accessedReferences", null, 0, -1, Activity.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getActivity__JoinsCorrectly(), this.getActivity(), "JoinsCorrectly", 0, -1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getActivity__JoinsCorrectly__EList(), this.getActivity(), "JoinsCorrectly", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getActivity__JoinsCorrectly__EList_EList(), this.getActivity(), "JoinsCorrectly", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFork(), "fork", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getActivity__UsesDifferentThread__Activity(), ecorePackage.getEBoolean(), "UsesDifferentThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivity__UsesSameThread__Activity(), ecorePackage.getEBoolean(), "UsesSameThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivity__GetAccessedReferences__EList_EList(), this.getReference(), "GetAccessedReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getSharedResource(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalActivityEClass, FinalActivity.class, "FinalActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFinalActivity__JoinsCorrectly__EList_EList(), this.getActivity(), "JoinsCorrectly", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFork(), "fork", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFinalActivity__GetAccessedReferences__EList_EList(), this.getReference(), "GetAccessedReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getSharedResource(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(linearActivityEClass, LinearActivity.class, "LinearActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinearActivity_NextActivity(), this.getActivity(), null, "nextActivity", null, 1, 1, LinearActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLinearActivity__JoinsCorrectly__EList_EList(), this.getActivity(), "JoinsCorrectly", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFork(), "fork", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLinearActivity__GetAccessedReferences__EList_EList(), this.getReference(), "GetAccessedReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getSharedResource(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(forkEClass, Fork.class, "Fork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFork_MaxThreadCount(), ecorePackage.getEInt(), "maxThreadCount", null, 0, 1, Fork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFork_ForkedThreads(), this.getForkedThread(), null, "forkedThreads", null, 1, -1, Fork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFork__JoinsCorrectly(), this.getActivity(), "JoinsCorrectly", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFork__JoinsCorrectly__EList(), this.getActivity(), "JoinsCorrectly", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFork__JoinsCorrectly__EList_EList(), this.getActivity(), "JoinsCorrectly", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFork(), "fork", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFork__GetAccessedReferences__EList_EList(), this.getReference(), "GetAccessedReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getSharedResource(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecision_Branches(), this.getBranch(), null, "branches", null, 0, -1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDecision__JoinsCorrectly__EList_EList(), this.getActivity(), "JoinsCorrectly", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFork(), "fork", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDecision__GetAccessedReferences__EList_EList(), this.getReference(), "GetAccessedReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getSharedResource(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranch_NextActivity(), this.getActivity(), null, "nextActivity", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getJoin__JoinsCorrectly__EList_EList(), this.getActivity(), "JoinsCorrectly", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFork(), "fork", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(sharedResourceEClass, SharedResource.class, "SharedResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interruptEClass, Interrupt.class, "Interrupt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterrupt_InterruptedThread(), this.getThread(), null, "interruptedThread", null, 1, 1, Interrupt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstance_InstanceType(), this.getInstanceType(), null, "instanceType", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceTypeEClass, InstanceType.class, "InstanceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, InstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sleepEClass, Sleep.class, "Sleep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSleep_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Sleep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yieldEClass, Yield.class, "Yield", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleActivityEClass, SimpleActivity.class, "SimpleActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleActivity_SharedResources(), this.getSharedResource(), null, "sharedResources", null, 0, -1, SimpleActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSimpleActivity__GetAccessedReferences__EList_EList(), this.getReference(), "GetAccessedReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getSharedResource(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(nestedActivityEClass, NestedActivity.class, "NestedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNestedActivity_NestedThread(), this.getThread(), null, "nestedThread", null, 1, 1, NestedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNestedActivity__JoinsCorrectly__EList_EList(), this.getActivity(), "JoinsCorrectly", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFork(), "fork", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNestedActivity__GetAccessedReferences__EList_EList(), this.getReference(), "GetAccessedReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getSharedResource(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(forkedThreadEClass, ForkedThread.class, "ForkedThread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForkedThread_Daemon(), ecorePackage.getEBoolean(), "daemon", null, 0, 1, ForkedThread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedActivityEClass, NamedActivity.class, "NamedActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedActivity_ActivityName(), ecorePackage.getEString(), "activityName", null, 0, 1, NamedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (threadEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidStartActivityThread"
		   });	
		addAnnotation
		  (basicModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueNames ValidForkJoinNesting MatchingForkForEveryJoin"
		   });	
		addAnnotation
		  (linearActivityEClass, 
		   source, 
		   new String[] {
			 "constraints", "ThreadIndependence"
		   });	
		addAnnotation
		  (forkEClass, 
		   source, 
		   new String[] {
			 "constraints", "NonNegativeMaxThreadCount ThreadIndependence"
		   });	
		addAnnotation
		  (decisionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ThreadIndependence"
		   });	
		addAnnotation
		  (branchEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidBranchCondition"
		   });	
		addAnnotation
		  (sleepEClass, 
		   source, 
		   new String[] {
			 "constraints", "PositiveSleepDuration"
		   });	
		addAnnotation
		  (referenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProperReferenceName"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (threadEClass, 
		   source, 
		   new String[] {
			 "ValidStartActivityThread", "startActivity.thread = self or startActivity.oclIsKindOf(Join) or startActivity.oclIsKindOf(FinalActivity)"
		   });	
		addAnnotation
		  (basicModelEClass, 
		   source, 
		   new String[] {
			 "UniqueNames", "\n\t\t\tlet referenceNames: Bag(String) = Reference.allInstances()->collect(r | r.name) in\n\t\t\tlet activityNames: Bag(String) = NamedActivity.allInstances()->collect(a | a.activityName) in\n\t\t\t    referenceNames->union(activityNames->asSet()->asBag())->isUnique(n | n)",
			 "ValidForkJoinNesting", "startActivity.JoinsCorrectly()->includesAll(Activity.allInstances()->asSet())",
			 "MatchingForkForEveryJoin", "\n\t\t\tlet forkThreads: Bag(Thread) = Fork.allInstances()->collect(thread)->asBag() in\n\t\t\tlet joinThreads: Bag(Thread) = Join.allInstances()->collect(thread)->asBag() in\n\t\t\t\tforkThreads->intersection(joinThreads) = joinThreads"
		   });	
		addAnnotation
		  (getActivity__JoinsCorrectly(), 
		   source, 
		   new String[] {
			 "body", "JoinsCorrectly(Sequence{}, Set{})"
		   });	
		addAnnotation
		  (getActivity__JoinsCorrectly__EList(), 
		   source, 
		   new String[] {
			 "body", "JoinsCorrectly(Sequence{}, beenHere)"
		   });	
		addAnnotation
		  (getActivity__UsesDifferentThread__Activity(), 
		   source, 
		   new String[] {
			 "body", "((thread = a.thread) = a.oclIsTypeOf(Join)) or a.oclIsKindOf(FinalActivity)"
		   });	
		addAnnotation
		  (getActivity__UsesSameThread__Activity(), 
		   source, 
		   new String[] {
			 "body", "((thread = a.thread) <> a.oclIsTypeOf(Join)) or a.oclIsKindOf(FinalActivity)"
		   });	
		addAnnotation
		  (getActivity_Thread(), 
		   source, 
		   new String[] {
			 "derivation", "let temp: Set(Thread) = Thread.allInstances()->select(t | t.activities->exists(a | a = self))\n\t\t\t            in if temp->size() = 1 then temp->asOrderedSet()->first() else null endif"
		   });	
		addAnnotation
		  (getActivity_AccessedReferences(), 
		   source, 
		   new String[] {
			 "derivation", "GetAccessedReferences(Set{}, Set{})"
		   });	
		addAnnotation
		  (getFinalActivity__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "beenHere->including(self)"
		   });	
		addAnnotation
		  (getFinalActivity__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "soFar"
		   });	
		addAnnotation
		  (linearActivityEClass, 
		   source, 
		   new String[] {
			 "ThreadIndependence", "self.UsesSameThread(nextActivity)"
		   });	
		addAnnotation
		  (getLinearActivity__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then beenHere\n\t\t\t      else nextActivity.JoinsCorrectly(fork, beenHere->including(self)) -- Check successor\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getLinearActivity__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then soFar\n\t\t\t      else nextActivity.GetAccessedReferences(soFar, beenHere->including(self))\n\t\t\t      endif"
		   });	
		addAnnotation
		  (forkEClass, 
		   source, 
		   new String[] {
			 "NonNegativeMaxThreadCount", "maxThreadCount >= 0",
			 "ThreadIndependence", "forkedThreads->forAll(t | self.UsesDifferentThread(t.startActivity))"
		   });	
		addAnnotation
		  (getFork__JoinsCorrectly(), 
		   source, 
		   new String[] {
			 "body", "JoinsCorrectly(Sequence{self}, Set{})"
		   });	
		addAnnotation
		  (getFork__JoinsCorrectly__EList(), 
		   source, 
		   new String[] {
			 "body", "JoinsCorrectly(Sequence{self}, beenHere)"
		   });	
		addAnnotation
		  (getFork__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Fork has already been checked\n\t\t\t      then beenHere\n\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t           let f: Sequence(Fork) = fork->append(self) in\n\t\t\t           forkedThreads->iterate(t; result: Set(Activity) = Set{} | result->union(t.startActivity.JoinsCorrectly(f, bh)))\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getFork__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then soFar\n\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t           forkedThreads->iterate(t; result: Set(Reference) = Set{} | result->union(t.startActivity.GetAccessedReferences(soFar, bh)))\n\t\t\t      endif"
		   });	
		addAnnotation
		  (decisionEClass, 
		   source, 
		   new String[] {
			 "ThreadIndependence", "branches->forAll(b | self.UsesSameThread(b.nextActivity))"
		   });	
		addAnnotation
		  (getDecision__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then beenHere\n\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t               nextActivity.JoinsCorrectly(fork, bh)->union(branches->iterate(b; result: Set(Activity) = Set{} | result->union(b.nextActivity.JoinsCorrectly(fork, bh)))) -- Check all branches\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getDecision__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then soFar\n\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t           let elseResult: Set(Reference) = nextActivity.GetAccessedReferences(soFar, beenHere->including(self)) in\n\t\t\t           let branchesResult: Set(Reference) = branches->iterate(b; result: Set(Reference) = Set{} | result->union(b.nextActivity.GetAccessedReferences(soFar, bh))) in\n\t\t\t               elseResult->union(branchesResult)\n\t\t\t      endif"
		   });	
		addAnnotation
		  (branchEClass, 
		   source, 
		   new String[] {
			 "ValidBranchCondition", "true"
		   });	
		addAnnotation
		  (getJoin__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then beenHere\n\t\t\t      else if fork->notEmpty() -- There have been forks in the past\n\t\t\t           then if fork->last().thread = thread -- This join completes the most recent fork\n\t\t\t                -- I would rather use subSequence(1, size()-1) here, but that results in an error for some reason \n\t\t\t                then nextActivity.JoinsCorrectly(fork->excluding(thread), beenHere->including(self)) -- Check successor\n\t\t\t                else Set{}\n\t\t\t                endif\n\t\t\t           else Set{}\n\t\t\t           endif\n\t\t\t      endif"
		   });	
		addAnnotation
		  (sleepEClass, 
		   source, 
		   new String[] {
			 "PositiveSleepDuration", "duration >= 1"
		   });	
		addAnnotation
		  (getSimpleActivity__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then soFar\n\t\t\t      else nextActivity.GetAccessedReferences(soFar->union(sharedResources), beenHere->including(self))\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getNestedActivity__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then beenHere\n\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t           let internalActivities: Set(Activity) = nestedThread.startActivity.JoinsCorrectly(bh) in -- Check internal activities\n\t\t\t           let nextActivities: Set(Activity) = nextActivity.JoinsCorrectly(fork, bh) in -- Check successor\n\t\t\t               internalActivities->union(nextActivities)\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getNestedActivity__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then soFar\n\t\t\t      else nestedThread.startActivity.GetAccessedReferences(soFar, beenHere->including(self))\n\t\t\t      endif"
		   });	
		addAnnotation
		  (referenceEClass, 
		   source, 
		   new String[] {
			 "ProperReferenceName", "name.matches(\'[A-Za-z_$][A-Za-z0-9_$]*\')"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";	
		addAnnotation
		  (getActivity__JoinsCorrectly(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getActivity__JoinsCorrectly__EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getActivity__JoinsCorrectly__EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getActivity__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getActivity__JoinsCorrectly__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getActivity__JoinsCorrectly__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getActivity__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getActivity__GetAccessedReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getActivity__GetAccessedReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getActivity_AccessedReferences(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getFinalActivity__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFinalActivity__JoinsCorrectly__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFinalActivity__JoinsCorrectly__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getFinalActivity__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFinalActivity__GetAccessedReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFinalActivity__GetAccessedReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getLinearActivity__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getLinearActivity__JoinsCorrectly__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getLinearActivity__JoinsCorrectly__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getLinearActivity__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getLinearActivity__GetAccessedReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getLinearActivity__GetAccessedReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getFork__JoinsCorrectly(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getFork__JoinsCorrectly__EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFork__JoinsCorrectly__EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getFork__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFork__JoinsCorrectly__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFork__JoinsCorrectly__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getFork__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFork__GetAccessedReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFork__GetAccessedReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getDecision__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getDecision__JoinsCorrectly__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getDecision__JoinsCorrectly__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getDecision__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getDecision__GetAccessedReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getDecision__GetAccessedReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getJoin__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getJoin__JoinsCorrectly__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getJoin__JoinsCorrectly__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getSimpleActivity__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getSimpleActivity__GetAccessedReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getSimpleActivity__GetAccessedReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getNestedActivity__JoinsCorrectly__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getNestedActivity__JoinsCorrectly__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getNestedActivity__JoinsCorrectly__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getNestedActivity__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getNestedActivity__GetAccessedReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getNestedActivity__GetAccessedReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });
	}

} //ActivityDiagramPackageImpl
