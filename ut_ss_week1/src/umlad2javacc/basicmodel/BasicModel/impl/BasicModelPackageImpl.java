/**
 */
package umlad2javacc.basicmodel.BasicModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import umlad2javacc.basicmodel.BasicModel.Activity;
import umlad2javacc.basicmodel.BasicModel.BasicModel;
import umlad2javacc.basicmodel.BasicModel.BasicModelFactory;
import umlad2javacc.basicmodel.BasicModel.BasicModelPackage;
import umlad2javacc.basicmodel.BasicModel.Branch;
import umlad2javacc.basicmodel.BasicModel.Decision;
import umlad2javacc.basicmodel.BasicModel.End;
import umlad2javacc.basicmodel.BasicModel.FinalActivity;
import umlad2javacc.basicmodel.BasicModel.Fork;
import umlad2javacc.basicmodel.BasicModel.ForkedThread;
import umlad2javacc.basicmodel.BasicModel.Instance;
import umlad2javacc.basicmodel.BasicModel.InstanceType;
import umlad2javacc.basicmodel.BasicModel.Interrupt;
import umlad2javacc.basicmodel.BasicModel.InterruptableThread;
import umlad2javacc.basicmodel.BasicModel.Join;
import umlad2javacc.basicmodel.BasicModel.LinearActivity;
import umlad2javacc.basicmodel.BasicModel.NamedActivity;
import umlad2javacc.basicmodel.BasicModel.NestedActivity;
import umlad2javacc.basicmodel.BasicModel.NestedThread;
import umlad2javacc.basicmodel.BasicModel.Reference;
import umlad2javacc.basicmodel.BasicModel.SharedResource;
import umlad2javacc.basicmodel.BasicModel.SimpleActivity;
import umlad2javacc.basicmodel.BasicModel.Sleep;
import umlad2javacc.basicmodel.BasicModel.Yield;

import umlad2javacc.basicmodel.BasicModel.util.BasicModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicModelPackageImpl extends EPackageImpl implements BasicModelPackage {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedThreadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptableThreadEClass = null;

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
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicModelPackageImpl() {
		super(eNS_URI, BasicModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasicModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicModelPackage init() {
		if (isInited) return (BasicModelPackage)EPackage.Registry.INSTANCE.getEPackage(BasicModelPackage.eNS_URI);

		// Obtain or create and register package
		BasicModelPackageImpl theBasicModelPackage = (BasicModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBasicModelPackage.createPackageContents();

		// Initialize created meta-data
		theBasicModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBasicModelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return BasicModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBasicModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicModelPackage.eNS_URI, theBasicModelPackage);
		return theBasicModelPackage;
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
		return (EReference)threadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_ActivitiesByStateId() {
		return (EReference)threadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_StartActivity() {
		return (EReference)threadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getThread__GetActivitiesByStateId() {
		return threadEClass.getEOperations().get(0);
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
	public EReference getBasicModel_NestedThreads() {
		return (EReference)basicModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicModel_ForkedThreads() {
		return (EReference)basicModelEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getActivity_StateId() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Instance() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_InstanceType() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Thread() {
		return (EReference)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_AccessedReferences() {
		return (EReference)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__UsesDifferentThread__Activity() {
		return activityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__UsesSameThread__Activity() {
		return activityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__GetAccessedReferences__EList_EList() {
		return activityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__SearchForJoin__BigInteger_EList() {
		return activityEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__GetReachableActivities__EList() {
		return activityEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__GetSuccessorReferences__EList_EList() {
		return activityEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__GetActivitiesByStateId__EList_EList() {
		return activityEClass.getEOperations().get(6);
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
	public EOperation getFinalActivity__GetSuccessorReferences__EList_EList() {
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
	public EOperation getLinearActivity__GetReachableActivities__EList() {
		return linearActivityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinearActivity__GetSuccessorReferences__EList_EList() {
		return linearActivityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinearActivity__SearchForJoin__BigInteger_EList() {
		return linearActivityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinearActivity__GetActivitiesByStateId__EList_EList() {
		return linearActivityEClass.getEOperations().get(3);
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
	public EReference getFork_CorrespondingJoin() {
		return (EReference)forkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFork__GetReachableActivities__EList() {
		return forkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFork__GetSuccessorReferences__EList_EList() {
		return forkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFork__SearchForJoin__BigInteger_EList() {
		return forkEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFork__GetActivitiesByStateId__EList_EList() {
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
	public EOperation getDecision__GetReachableActivities__EList() {
		return decisionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecision__GetSuccessorReferences__EList_EList() {
		return decisionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecision__SearchForJoin__BigInteger_EList() {
		return decisionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecision__GetActivitiesByStateId__EList_EList() {
		return decisionEClass.getEOperations().get(3);
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
	public EOperation getJoin__SearchForJoin__BigInteger_EList() {
		return joinEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJoin__GetActivitiesByStateId__EList_EList() {
		return joinEClass.getEOperations().get(1);
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
	public EOperation getInterrupt__GetSuccessorReferences__EList_EList() {
		return interruptEClass.getEOperations().get(0);
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
	public EReference getInstanceType_ForkedThreads() {
		return (EReference)instanceTypeEClass.getEStructuralFeatures().get(1);
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
	public EOperation getSimpleActivity__GetSuccessorReferences__EList_EList() {
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
	public EOperation getNestedActivity__GetReachableActivities__EList() {
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
	public EClass getNestedThread() {
		return nestedThreadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptableThread() {
		return interruptableThreadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicModelFactory getBasicModelFactory() {
		return (BasicModelFactory)getEFactoryInstance();
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
		createEReference(threadEClass, THREAD__ACTIVITIES_BY_STATE_ID);
		createEReference(threadEClass, THREAD__ACTIVITIES);
		createEReference(threadEClass, THREAD__START_ACTIVITY);
		createEOperation(threadEClass, THREAD___GET_ACTIVITIES_BY_STATE_ID);

		basicModelEClass = createEClass(BASIC_MODEL);
		createEReference(basicModelEClass, BASIC_MODEL__RESOURCES);
		createEReference(basicModelEClass, BASIC_MODEL__INSTANCES);
		createEReference(basicModelEClass, BASIC_MODEL__INSTANCE_TYPES);
		createEReference(basicModelEClass, BASIC_MODEL__NESTED_THREADS);
		createEReference(basicModelEClass, BASIC_MODEL__FORKED_THREADS);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__NAME);
		createEAttribute(activityEClass, ACTIVITY__STATE_ID);
		createEReference(activityEClass, ACTIVITY__INSTANCE);
		createEReference(activityEClass, ACTIVITY__INSTANCE_TYPE);
		createEReference(activityEClass, ACTIVITY__THREAD);
		createEReference(activityEClass, ACTIVITY__ACCESSED_REFERENCES);
		createEOperation(activityEClass, ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY);
		createEOperation(activityEClass, ACTIVITY___USES_SAME_THREAD__ACTIVITY);
		createEOperation(activityEClass, ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST);
		createEOperation(activityEClass, ACTIVITY___SEARCH_FOR_JOIN__BIGINTEGER_ELIST);
		createEOperation(activityEClass, ACTIVITY___GET_REACHABLE_ACTIVITIES__ELIST);
		createEOperation(activityEClass, ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST);
		createEOperation(activityEClass, ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST);

		endEClass = createEClass(END);

		finalActivityEClass = createEClass(FINAL_ACTIVITY);
		createEOperation(finalActivityEClass, FINAL_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST);
		createEOperation(finalActivityEClass, FINAL_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST);

		linearActivityEClass = createEClass(LINEAR_ACTIVITY);
		createEReference(linearActivityEClass, LINEAR_ACTIVITY__NEXT_ACTIVITY);
		createEOperation(linearActivityEClass, LINEAR_ACTIVITY___GET_REACHABLE_ACTIVITIES__ELIST);
		createEOperation(linearActivityEClass, LINEAR_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST);
		createEOperation(linearActivityEClass, LINEAR_ACTIVITY___SEARCH_FOR_JOIN__BIGINTEGER_ELIST);
		createEOperation(linearActivityEClass, LINEAR_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST);

		forkEClass = createEClass(FORK);
		createEAttribute(forkEClass, FORK__MAX_THREAD_COUNT);
		createEReference(forkEClass, FORK__FORKED_THREADS);
		createEReference(forkEClass, FORK__CORRESPONDING_JOIN);
		createEOperation(forkEClass, FORK___GET_REACHABLE_ACTIVITIES__ELIST);
		createEOperation(forkEClass, FORK___GET_SUCCESSOR_REFERENCES__ELIST_ELIST);
		createEOperation(forkEClass, FORK___SEARCH_FOR_JOIN__BIGINTEGER_ELIST);
		createEOperation(forkEClass, FORK___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST);

		decisionEClass = createEClass(DECISION);
		createEReference(decisionEClass, DECISION__BRANCHES);
		createEOperation(decisionEClass, DECISION___GET_REACHABLE_ACTIVITIES__ELIST);
		createEOperation(decisionEClass, DECISION___GET_SUCCESSOR_REFERENCES__ELIST_ELIST);
		createEOperation(decisionEClass, DECISION___SEARCH_FOR_JOIN__BIGINTEGER_ELIST);
		createEOperation(decisionEClass, DECISION___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST);

		branchEClass = createEClass(BRANCH);
		createEReference(branchEClass, BRANCH__NEXT_ACTIVITY);
		createEAttribute(branchEClass, BRANCH__CONDITION);

		joinEClass = createEClass(JOIN);
		createEOperation(joinEClass, JOIN___SEARCH_FOR_JOIN__BIGINTEGER_ELIST);
		createEOperation(joinEClass, JOIN___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST);

		sharedResourceEClass = createEClass(SHARED_RESOURCE);

		interruptEClass = createEClass(INTERRUPT);
		createEReference(interruptEClass, INTERRUPT__INTERRUPTED_THREAD);
		createEOperation(interruptEClass, INTERRUPT___GET_SUCCESSOR_REFERENCES__ELIST_ELIST);

		instanceEClass = createEClass(INSTANCE);
		createEReference(instanceEClass, INSTANCE__INSTANCE_TYPE);

		instanceTypeEClass = createEClass(INSTANCE_TYPE);
		createEAttribute(instanceTypeEClass, INSTANCE_TYPE__NAME);
		createEReference(instanceTypeEClass, INSTANCE_TYPE__FORKED_THREADS);

		sleepEClass = createEClass(SLEEP);
		createEAttribute(sleepEClass, SLEEP__DURATION);

		yieldEClass = createEClass(YIELD);

		simpleActivityEClass = createEClass(SIMPLE_ACTIVITY);
		createEReference(simpleActivityEClass, SIMPLE_ACTIVITY__SHARED_RESOURCES);
		createEOperation(simpleActivityEClass, SIMPLE_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST);

		nestedActivityEClass = createEClass(NESTED_ACTIVITY);
		createEReference(nestedActivityEClass, NESTED_ACTIVITY__NESTED_THREAD);
		createEOperation(nestedActivityEClass, NESTED_ACTIVITY___GET_REACHABLE_ACTIVITIES__ELIST);
		createEOperation(nestedActivityEClass, NESTED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST);

		forkedThreadEClass = createEClass(FORKED_THREAD);
		createEAttribute(forkedThreadEClass, FORKED_THREAD__DAEMON);

		namedActivityEClass = createEClass(NAMED_ACTIVITY);
		createEAttribute(namedActivityEClass, NAMED_ACTIVITY__ACTIVITY_NAME);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__NAME);

		nestedThreadEClass = createEClass(NESTED_THREAD);

		interruptableThreadEClass = createEClass(INTERRUPTABLE_THREAD);
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
		basicModelEClass.getESuperTypes().add(this.getInterruptableThread());
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
		forkedThreadEClass.getESuperTypes().add(this.getInterruptableThread());
		namedActivityEClass.getESuperTypes().add(this.getLinearActivity());
		nestedThreadEClass.getESuperTypes().add(this.getThread());
		interruptableThreadEClass.getESuperTypes().add(this.getThread());

		// Initialize classes, features, and operations; add parameters
		initEClass(threadEClass, umlad2javacc.basicmodel.BasicModel.Thread.class, "Thread", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThread_ActivitiesByStateId(), this.getActivity(), null, "activitiesByStateId", null, 0, -1, umlad2javacc.basicmodel.BasicModel.Thread.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getThread_Activities(), this.getActivity(), null, "activities", null, 0, -1, umlad2javacc.basicmodel.BasicModel.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThread_StartActivity(), this.getActivity(), null, "startActivity", null, 1, 1, umlad2javacc.basicmodel.BasicModel.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getThread__GetActivitiesByStateId(), this.getActivity(), "GetActivitiesByStateId", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(basicModelEClass, BasicModel.class, "BasicModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicModel_Resources(), this.getSharedResource(), null, "resources", null, 0, -1, BasicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicModel_Instances(), this.getInstance(), null, "instances", null, 0, -1, BasicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicModel_InstanceTypes(), this.getInstanceType(), null, "instanceTypes", null, 0, -1, BasicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicModel_NestedThreads(), this.getNestedThread(), null, "nestedThreads", null, 0, -1, BasicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicModel_ForkedThreads(), this.getForkedThread(), null, "forkedThreads", null, 0, -1, BasicModel.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_StateId(), ecorePackage.getEInt(), "stateId", null, 0, 1, Activity.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Instance(), this.getInstance(), null, "instance", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_InstanceType(), this.getInstanceType(), null, "instanceType", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Thread(), this.getThread(), null, "thread", null, 0, 1, Activity.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_AccessedReferences(), this.getReference(), null, "accessedReferences", null, 0, -1, Activity.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getActivity__UsesDifferentThread__Activity(), ecorePackage.getEBoolean(), "UsesDifferentThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivity__UsesSameThread__Activity(), ecorePackage.getEBoolean(), "UsesSameThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivity__GetAccessedReferences__EList_EList(), this.getReference(), "GetAccessedReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReference(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getActivity__SearchForJoin__BigInteger_EList(), this.getActivity(), "SearchForJoin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "searchDepth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getActivity__GetReachableActivities__EList(), this.getActivity(), "GetReachableActivities", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getActivity__GetSuccessorReferences__EList_EList(), this.getReference(), "GetSuccessorReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReference(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getActivity__GetActivitiesByStateId__EList_EList(), this.getActivity(), "GetActivitiesByStateId", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "soFar", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalActivityEClass, FinalActivity.class, "FinalActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFinalActivity__JoinsCorrectly__EList_EList(), this.getActivity(), "JoinsCorrectly", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getThread(), "threadStack", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFinalActivity__GetSuccessorReferences__EList_EList(), this.getReference(), "GetSuccessorReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReference(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(linearActivityEClass, LinearActivity.class, "LinearActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinearActivity_NextActivity(), this.getActivity(), null, "nextActivity", null, 1, 1, LinearActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLinearActivity__GetReachableActivities__EList(), this.getActivity(), "GetReachableActivities", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLinearActivity__GetSuccessorReferences__EList_EList(), this.getReference(), "GetSuccessorReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReference(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLinearActivity__SearchForJoin__BigInteger_EList(), this.getActivity(), "SearchForJoin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "searchDepth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getLinearActivity__GetActivitiesByStateId__EList_EList(), this.getActivity(), "GetActivitiesByStateId", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "soFar", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(forkEClass, Fork.class, "Fork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFork_MaxThreadCount(), ecorePackage.getEInt(), "maxThreadCount", null, 0, 1, Fork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFork_ForkedThreads(), this.getForkedThread(), null, "forkedThreads", null, 1, -1, Fork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFork_CorrespondingJoin(), this.getActivity(), null, "correspondingJoin", null, 0, 1, Fork.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFork__GetReachableActivities__EList(), this.getActivity(), "GetReachableActivities", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFork__GetSuccessorReferences__EList_EList(), this.getReference(), "GetSuccessorReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReference(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFork__SearchForJoin__BigInteger_EList(), this.getActivity(), "SearchForJoin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "searchDepth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFork__GetActivitiesByStateId__EList_EList(), this.getActivity(), "GetActivitiesByStateId", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "soFar", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecision_Branches(), this.getBranch(), null, "branches", null, 0, -1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDecision__GetReachableActivities__EList(), this.getActivity(), "GetReachableActivities", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDecision__GetSuccessorReferences__EList_EList(), this.getReference(), "GetSuccessorReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReference(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDecision__SearchForJoin__BigInteger_EList(), this.getActivity(), "SearchForJoin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "searchDepth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDecision__GetActivitiesByStateId__EList_EList(), this.getActivity(), "GetActivitiesByStateId", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "soFar", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranch_NextActivity(), this.getActivity(), null, "nextActivity", null, 1, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getJoin__SearchForJoin__BigInteger_EList(), this.getActivity(), "SearchForJoin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "searchDepth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getJoin__GetActivitiesByStateId__EList_EList(), this.getActivity(), "GetActivitiesByStateId", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "soFar", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(sharedResourceEClass, SharedResource.class, "SharedResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interruptEClass, Interrupt.class, "Interrupt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterrupt_InterruptedThread(), this.getInterruptableThread(), null, "interruptedThread", null, 1, 1, Interrupt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getInterrupt__GetSuccessorReferences__EList_EList(), this.getReference(), "GetSuccessorReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReference(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstance_InstanceType(), this.getInstanceType(), null, "instanceType", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceTypeEClass, InstanceType.class, "InstanceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, InstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceType_ForkedThreads(), this.getForkedThread(), null, "forkedThreads", null, 0, -1, InstanceType.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(sleepEClass, Sleep.class, "Sleep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSleep_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Sleep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yieldEClass, Yield.class, "Yield", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleActivityEClass, SimpleActivity.class, "SimpleActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleActivity_SharedResources(), this.getSharedResource(), null, "sharedResources", null, 0, -1, SimpleActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSimpleActivity__GetSuccessorReferences__EList_EList(), this.getReference(), "GetSuccessorReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReference(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(nestedActivityEClass, NestedActivity.class, "NestedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNestedActivity_NestedThread(), this.getNestedThread(), null, "nestedThread", null, 1, 1, NestedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNestedActivity__GetReachableActivities__EList(), this.getActivity(), "GetReachableActivities", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNestedActivity__GetAccessedReferences__EList_EList(), this.getReference(), "GetAccessedReferences", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getReference(), "soFar", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getActivity(), "beenHere", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(forkedThreadEClass, ForkedThread.class, "ForkedThread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForkedThread_Daemon(), ecorePackage.getEBoolean(), "daemon", null, 0, 1, ForkedThread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedActivityEClass, NamedActivity.class, "NamedActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedActivity_ActivityName(), ecorePackage.getEString(), "activityName", null, 0, 1, NamedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nestedThreadEClass, NestedThread.class, "NestedThread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interruptableThreadEClass, InterruptableThread.class, "InterruptableThread", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			 "constraints", "MatchingForkForEveryJoin"
		   });	
		addAnnotation
		  (activityEClass, 
		   source, 
		   new String[] {
			 "constraints", "Reachability"
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
			 "constraints", "NonNegativeMaxThreadCount ThreadIndependence ValidCorrespondingJoin"
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
		  (namedActivityEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProperNamedActivityName UniqueNamedActivityName"
		   });	
		addAnnotation
		  (referenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProperReferenceName UniqueReferenceName"
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
		  (getThread__GetActivitiesByStateId(), 
		   source, 
		   new String[] {
			 "body", "startActivity.GetActivitiesByStateId(OrderedSet{}, Set{})"
		   });	
		addAnnotation
		  (getThread_ActivitiesByStateId(), 
		   source, 
		   new String[] {
			 "derivation", "GetActivitiesByStateId()"
		   });	
		addAnnotation
		  (basicModelEClass, 
		   source, 
		   new String[] {
			 "MatchingForkForEveryJoin", "\n\t\t\tlet forkThreads: Bag(Thread) = Fork.allInstances()->collect(thread)->asBag() in\n\t\t\tlet joinThreads: Bag(Thread) = Join.allInstances()->collect(thread)->asBag() in\n\t\t\t\tforkThreads->intersection(joinThreads) = joinThreads"
		   });	
		addAnnotation
		  (getBasicModel_ForkedThreads(), 
		   source, 
		   new String[] {
			 "derivation", "Fork.allInstances()->select(e|e.instanceType=null)->iterate(e; result: Set(ForkedThread) = Set{}|result->union(e.forkedThreads))"
		   });	
		addAnnotation
		  (activityEClass, 
		   source, 
		   new String[] {
			 "Reachability", "let basicModel: BasicModel = BasicModel.allInstances()->asSequence()->first() in\n\t                        let reachableActivities: Set(Activity) = basicModel.startActivity.GetReachableActivities(Set{}) in\n\t                            reachableActivities->exists(a | a = self)"
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
		  (getActivity__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then soFar\n\t\t\t      else if instance <> null\n\t\t\t           then GetSuccessorReferences(soFar->including(instance), beenHere)\n\t\t\t           else GetSuccessorReferences(soFar, beenHere)\n\t\t\t           endif\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getActivity__SearchForJoin__BigInteger_EList(), 
		   source, 
		   new String[] {
			 "body", "null"
		   });	
		addAnnotation
		  (getActivity__GetReachableActivities__EList(), 
		   source, 
		   new String[] {
			 "body", "soFar->including(self)"
		   });	
		addAnnotation
		  (getActivity__GetActivitiesByStateId__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "soFar"
		   });	
		addAnnotation
		  (getActivity_StateId(), 
		   source, 
		   new String[] {
			 "derivation", "let activitiesByStateId: OrderedSet(Activity) = thread.GetActivitiesByStateId() in\n\t\t\t         let numbers: Sequence(ecore::EInt) = Sequence{1..activitiesByStateId->size()}->select(nr | activitiesByStateId->at(nr) = self) in\n\t\t\t             if numbers->isEmpty()\n\t\t\t             then -1\n\t\t\t             else numbers->first()\n\t\t\t             endif"
		   });	
		addAnnotation
		  (getActivity_InstanceType(), 
		   source, 
		   new String[] {
			 "derivation", "if instance <> null then instance.instanceType else null endif"
		   });	
		addAnnotation
		  (getActivity_Thread(), 
		   source, 
		   new String[] {
			 "derivation", "let temp: Set(Thread) = Thread.allInstances()->select(t | t.activities->exists(a | a = self))\n\t\t            in if temp->size() = 1 then temp->asOrderedSet()->first() else null endif"
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
		  (getFinalActivity__GetSuccessorReferences__EList_EList(), 
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
		  (getLinearActivity__GetReachableActivities__EList(), 
		   source, 
		   new String[] {
			 "body", "if soFar->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then soFar\n\t\t\t      else nextActivity.GetReachableActivities(soFar->including(self)) -- Check successor\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getLinearActivity__GetSuccessorReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "nextActivity.GetAccessedReferences(soFar, beenHere->including(self))"
		   });	
		addAnnotation
		  (getLinearActivity__SearchForJoin__BigInteger_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then null\n\t\t\t\t      else nextActivity.SearchForJoin(searchDepth, beenHere->including(self))\n\t\t\t\t      endif"
		   });	
		addAnnotation
		  (getLinearActivity__GetActivitiesByStateId__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then soFar\n\t\t\t\t      else nextActivity.GetActivitiesByStateId(soFar->append(self), beenHere->including(self))\n\t\t\t\t      endif"
		   });	
		addAnnotation
		  (forkEClass, 
		   source, 
		   new String[] {
			 "NonNegativeMaxThreadCount", "maxThreadCount >= 0",
			 "ThreadIndependence", "forkedThreads->forAll(t | self.UsesDifferentThread(t.startActivity))",
			 "ValidCorrespondingJoin", "correspondingJoin = null or correspondingJoin.thread = thread"
		   });	
		addAnnotation
		  (getFork__GetReachableActivities__EList(), 
		   source, 
		   new String[] {
			 "body", "if soFar->exists(e | e = self) -- Fork has already been checked\n\t\t\t          then soFar\n\t\t\t          else let sf: Set(Activity) = soFar->including(self) in\n\t\t\t                   forkedThreads->iterate(t; result: Set(Activity) = Set{} | result->union(t.startActivity.GetReachableActivities(sf)))\n\t\t\t          endif"
		   });	
		addAnnotation
		  (getFork__GetSuccessorReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t      let successorRefs: Set(Reference) = forkedThreads->iterate(t; result: Set(Reference) = Set{} | result->union(t.startActivity.GetAccessedReferences(soFar, bh))) in\n\t\t\t          successorRefs - forkedThreads"
		   });	
		addAnnotation
		  (getFork__SearchForJoin__BigInteger_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then null\n\t\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t\t           let joins: Sequence(Activity) = forkedThreads->collect(e | e.startActivity.SearchForJoin(searchDepth + 1, bh))->select(e | e <> null) in\n\t\t\t\t               if (joins->isEmpty())\n\t\t\t\t               then null\n\t\t\t\t               else joins->first()\n\t\t\t\t               endif\n\t\t\t\t      endif"
		   });	
		addAnnotation
		  (getFork__GetActivitiesByStateId__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then soFar\n\t\t\t\t      else if correspondingJoin = null -- No corresponding join activity\n\t\t\t\t           then soFar->append(self)\n\t\t\t\t           else correspondingJoin.GetActivitiesByStateId(soFar->append(self), beenHere->including(self))\n\t\t\t\t           endif\n\t\t\t\t      endif"
		   });	
		addAnnotation
		  (getFork_CorrespondingJoin(), 
		   source, 
		   new String[] {
			 "derivation", "self.SearchForJoin(0, Set{})"
		   });	
		addAnnotation
		  (decisionEClass, 
		   source, 
		   new String[] {
			 "ThreadIndependence", "branches->forAll(b | self.UsesSameThread(b.nextActivity))"
		   });	
		addAnnotation
		  (getDecision__GetReachableActivities__EList(), 
		   source, 
		   new String[] {
			 "body", "if soFar->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then soFar\n\t\t\t      else let sf: Set(Activity) = soFar->including(self) in\n\t\t\t           let elseActivities: Set(Activity) = nextActivity.GetReachableActivities(sf) in\n\t\t\t               branches->iterate(b; result: Set(Activity) = elseActivities | b.nextActivity.GetReachableActivities(result)) -- Check all branches\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getDecision__GetSuccessorReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t      let elseResult: Set(Reference) = nextActivity.GetAccessedReferences(soFar, beenHere->including(self)) in\n\t\t\t      let branchesResult: Set(Reference) = branches->iterate(b; result: Set(Reference) = Set{} | result->union(b.nextActivity.GetAccessedReferences(soFar, bh))) in\n\t\t\t          elseResult->union(branchesResult)"
		   });	
		addAnnotation
		  (getDecision__SearchForJoin__BigInteger_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then null\n\t\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t\t           let joins: Sequence(Activity) = branches->collect(e | e.nextActivity.SearchForJoin(searchDepth, bh))->select(e | e <> null) in\n\t\t\t\t               if (joins->isEmpty())\n\t\t\t\t               then null\n\t\t\t\t               else joins->first()\n\t\t\t\t               endif\n\t\t\t\t      endif"
		   });	
		addAnnotation
		  (getDecision__GetActivitiesByStateId__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then soFar\n\t\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t\t           let temp: OrderedSet(Activity) = branches->iterate(e; result: OrderedSet(Activity) = soFar->append(self) | e.nextActivity.GetActivitiesByStateId(result, bh)) in\n\t\t\t\t               nextActivity.GetActivitiesByStateId(temp, bh)\n\t\t\t\t      endif"
		   });	
		addAnnotation
		  (branchEClass, 
		   source, 
		   new String[] {
			 "ValidBranchCondition", "true"
		   });	
		addAnnotation
		  (getJoin__SearchForJoin__BigInteger_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then null\n\t\t\t\t      else if searchDepth <= 1\n\t\t\t               then self\n\t\t\t               else nextActivity.SearchForJoin(searchDepth - 1, beenHere->including(self))\n\t\t\t               endif\n\t\t\t\t      endif"
		   });	
		addAnnotation
		  (getJoin__GetActivitiesByStateId__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then soFar\n\t\t\t\t      else nextActivity.GetActivitiesByStateId(soFar, beenHere->including(self)) \n\t\t\t\t      endif"
		   });	
		addAnnotation
		  (getInterrupt__GetSuccessorReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "nextActivity.GetAccessedReferences(soFar->including(interruptedThread), beenHere->including(self))"
		   });	
		addAnnotation
		  (getInstanceType_ForkedThreads(), 
		   source, 
		   new String[] {
			 "derivation", "Fork.allInstances()->select(e|e.instanceType=self)->iterate(e; result: Set(ForkedThread) = Set{}|result->union(e.forkedThreads))"
		   });	
		addAnnotation
		  (sleepEClass, 
		   source, 
		   new String[] {
			 "PositiveSleepDuration", "duration >= 1"
		   });	
		addAnnotation
		  (getSimpleActivity__GetSuccessorReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "nextActivity.GetAccessedReferences(soFar->union(sharedResources), beenHere->including(self))"
		   });	
		addAnnotation
		  (getNestedActivity__GetReachableActivities__EList(), 
		   source, 
		   new String[] {
			 "body", "if soFar->exists(e | e = self) -- Activity has already been checked\n\t\t\t          then soFar\n\t\t\t          else let sf: Set(Activity) = soFar->including(self) in\n\t\t\t               let internalActivities: Set(Activity) = nestedThread.startActivity.GetReachableActivities(sf) in -- Check internal activities\n\t\t\t                   nextActivity.GetReachableActivities(internalActivities) -- Check successor\n\t\t\t          endif"
		   });	
		addAnnotation
		  (getNestedActivity__GetAccessedReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "body", "nestedThread.startActivity.GetAccessedReferences(soFar, beenHere->including(self))"
		   });	
		addAnnotation
		  (namedActivityEClass, 
		   source, 
		   new String[] {
			 "ProperNamedActivityName", "activityName.matches(\'[A-Za-z_$][A-Za-z0-9_$]*\')",
			 "UniqueNamedActivityName", "Reference.allInstances()->select(r | r.name = activityName and not r.oclIsKindOf(NestedThread))->isEmpty()"
		   });	
		addAnnotation
		  (referenceEClass, 
		   source, 
		   new String[] {
			 "ProperReferenceName", "name.matches(\'[A-Za-z_$][A-Za-z0-9_$]*\')",
			 "UniqueReferenceName", "Reference.allInstances()->select(r | r.name = name and not r.oclIsKindOf(NestedThread))->size() <= 1"
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
		  (getThread__GetActivitiesByStateId(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getThread_ActivitiesByStateId(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getBasicModel_ForkedThreads(), 
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
		  ((getActivity__SearchForJoin__BigInteger_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getActivity__GetReachableActivities__EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getActivity__GetReachableActivities__EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getActivity__GetSuccessorReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getActivity__GetSuccessorReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getActivity__GetSuccessorReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getActivity__GetActivitiesByStateId__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getActivity__GetActivitiesByStateId__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getActivity__GetActivitiesByStateId__EList_EList()).getEParameters().get(1), 
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
		  (getFinalActivity__GetSuccessorReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFinalActivity__GetSuccessorReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFinalActivity__GetSuccessorReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getLinearActivity__GetReachableActivities__EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getLinearActivity__GetReachableActivities__EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getLinearActivity__GetSuccessorReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getLinearActivity__GetSuccessorReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getLinearActivity__GetSuccessorReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getLinearActivity__SearchForJoin__BigInteger_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getLinearActivity__GetActivitiesByStateId__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getLinearActivity__GetActivitiesByStateId__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getLinearActivity__GetActivitiesByStateId__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getFork__GetReachableActivities__EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFork__GetReachableActivities__EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getFork__GetSuccessorReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFork__GetSuccessorReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFork__GetSuccessorReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFork__SearchForJoin__BigInteger_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getFork__GetActivitiesByStateId__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFork__GetActivitiesByStateId__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getFork__GetActivitiesByStateId__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getDecision__GetReachableActivities__EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getDecision__GetReachableActivities__EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getDecision__GetSuccessorReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getDecision__GetSuccessorReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getDecision__GetSuccessorReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getDecision__SearchForJoin__BigInteger_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getDecision__GetActivitiesByStateId__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getDecision__GetActivitiesByStateId__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getDecision__GetActivitiesByStateId__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getJoin__SearchForJoin__BigInteger_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getJoin__GetActivitiesByStateId__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getJoin__GetActivitiesByStateId__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getJoin__GetActivitiesByStateId__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getInterrupt__GetSuccessorReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getInterrupt__GetSuccessorReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getInterrupt__GetSuccessorReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getInstanceType_ForkedThreads(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getSimpleActivity__GetSuccessorReferences__EList_EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getSimpleActivity__GetSuccessorReferences__EList_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getSimpleActivity__GetSuccessorReferences__EList_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getNestedActivity__GetReachableActivities__EList(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getNestedActivity__GetReachableActivities__EList()).getEParameters().get(0), 
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

} //BasicModelPackageImpl
