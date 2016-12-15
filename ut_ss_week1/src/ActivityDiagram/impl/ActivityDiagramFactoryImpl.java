/**
 */
package ActivityDiagram.impl;

import ActivityDiagram.ActivityDiagramFactory;
import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.BasicModel;
import ActivityDiagram.Branch;
import ActivityDiagram.Decision;
import ActivityDiagram.End;
import ActivityDiagram.Fork;
import ActivityDiagram.ForkedThread;
import ActivityDiagram.Instance;
import ActivityDiagram.InstanceType;
import ActivityDiagram.Interrupt;
import ActivityDiagram.Join;
import ActivityDiagram.NestedActivity;
import ActivityDiagram.SharedResource;
import ActivityDiagram.SimpleActivity;
import ActivityDiagram.Sleep;
import ActivityDiagram.Yield;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityDiagramFactoryImpl extends EFactoryImpl implements ActivityDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityDiagramFactory init() {
		try {
			ActivityDiagramFactory theActivityDiagramFactory = (ActivityDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(ActivityDiagramPackage.eNS_URI);
			if (theActivityDiagramFactory != null) {
				return theActivityDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivityDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ActivityDiagramPackage.THREAD: return createThread();
			case ActivityDiagramPackage.BASIC_MODEL: return createBasicModel();
			case ActivityDiagramPackage.END: return createEnd();
			case ActivityDiagramPackage.FORK: return createFork();
			case ActivityDiagramPackage.DECISION: return createDecision();
			case ActivityDiagramPackage.BRANCH: return createBranch();
			case ActivityDiagramPackage.JOIN: return createJoin();
			case ActivityDiagramPackage.SHARED_RESOURCE: return createSharedResource();
			case ActivityDiagramPackage.INTERRUPT: return createInterrupt();
			case ActivityDiagramPackage.INSTANCE: return createInstance();
			case ActivityDiagramPackage.INSTANCE_TYPE: return createInstanceType();
			case ActivityDiagramPackage.SLEEP: return createSleep();
			case ActivityDiagramPackage.YIELD: return createYield();
			case ActivityDiagramPackage.SIMPLE_ACTIVITY: return createSimpleActivity();
			case ActivityDiagramPackage.NESTED_ACTIVITY: return createNestedActivity();
			case ActivityDiagramPackage.FORKED_THREAD: return createForkedThread();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagram.Thread createThread() {
		ThreadImpl thread = new ThreadImpl();
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicModel createBasicModel() {
		BasicModelImpl basicModel = new BasicModelImpl();
		return basicModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fork createFork() {
		ForkImpl fork = new ForkImpl();
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedResource createSharedResource() {
		SharedResourceImpl sharedResource = new SharedResourceImpl();
		return sharedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interrupt createInterrupt() {
		InterruptImpl interrupt = new InterruptImpl();
		return interrupt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceType createInstanceType() {
		InstanceTypeImpl instanceType = new InstanceTypeImpl();
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sleep createSleep() {
		SleepImpl sleep = new SleepImpl();
		return sleep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Yield createYield() {
		YieldImpl yield = new YieldImpl();
		return yield;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleActivity createSimpleActivity() {
		SimpleActivityImpl simpleActivity = new SimpleActivityImpl();
		return simpleActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedActivity createNestedActivity() {
		NestedActivityImpl nestedActivity = new NestedActivityImpl();
		return nestedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedThread createForkedThread() {
		ForkedThreadImpl forkedThread = new ForkedThreadImpl();
		return forkedThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramPackage getActivityDiagramPackage() {
		return (ActivityDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivityDiagramPackage getPackage() {
		return ActivityDiagramPackage.eINSTANCE;
	}

} //ActivityDiagramFactoryImpl
