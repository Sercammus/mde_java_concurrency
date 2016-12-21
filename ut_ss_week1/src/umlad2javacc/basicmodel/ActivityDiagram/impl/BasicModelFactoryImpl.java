/**
 */
package umlad2javacc.basicmodel.ActivityDiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import umlad2javacc.basicmodel.ActivityDiagram.BasicModel;
import umlad2javacc.basicmodel.ActivityDiagram.BasicModelFactory;
import umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage;
import umlad2javacc.basicmodel.ActivityDiagram.Branch;
import umlad2javacc.basicmodel.ActivityDiagram.Decision;
import umlad2javacc.basicmodel.ActivityDiagram.End;
import umlad2javacc.basicmodel.ActivityDiagram.Fork;
import umlad2javacc.basicmodel.ActivityDiagram.ForkedThread;
import umlad2javacc.basicmodel.ActivityDiagram.Instance;
import umlad2javacc.basicmodel.ActivityDiagram.InstanceType;
import umlad2javacc.basicmodel.ActivityDiagram.Interrupt;
import umlad2javacc.basicmodel.ActivityDiagram.Join;
import umlad2javacc.basicmodel.ActivityDiagram.NestedActivity;
import umlad2javacc.basicmodel.ActivityDiagram.NestedThread;
import umlad2javacc.basicmodel.ActivityDiagram.SharedResource;
import umlad2javacc.basicmodel.ActivityDiagram.SimpleActivity;
import umlad2javacc.basicmodel.ActivityDiagram.Sleep;
import umlad2javacc.basicmodel.ActivityDiagram.Yield;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicModelFactoryImpl extends EFactoryImpl implements BasicModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicModelFactory init() {
		try {
			BasicModelFactory theBasicModelFactory = (BasicModelFactory)EPackage.Registry.INSTANCE.getEFactory(BasicModelPackage.eNS_URI);
			if (theBasicModelFactory != null) {
				return theBasicModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicModelFactoryImpl() {
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
			case BasicModelPackage.BASIC_MODEL: return createBasicModel();
			case BasicModelPackage.END: return createEnd();
			case BasicModelPackage.FORK: return createFork();
			case BasicModelPackage.DECISION: return createDecision();
			case BasicModelPackage.BRANCH: return createBranch();
			case BasicModelPackage.JOIN: return createJoin();
			case BasicModelPackage.SHARED_RESOURCE: return createSharedResource();
			case BasicModelPackage.INTERRUPT: return createInterrupt();
			case BasicModelPackage.INSTANCE: return createInstance();
			case BasicModelPackage.INSTANCE_TYPE: return createInstanceType();
			case BasicModelPackage.SLEEP: return createSleep();
			case BasicModelPackage.YIELD: return createYield();
			case BasicModelPackage.SIMPLE_ACTIVITY: return createSimpleActivity();
			case BasicModelPackage.NESTED_ACTIVITY: return createNestedActivity();
			case BasicModelPackage.FORKED_THREAD: return createForkedThread();
			case BasicModelPackage.NESTED_THREAD: return createNestedThread();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public NestedThread createNestedThread() {
		NestedThreadImpl nestedThread = new NestedThreadImpl();
		return nestedThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicModelPackage getBasicModelPackage() {
		return (BasicModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicModelPackage getPackage() {
		return BasicModelPackage.eINSTANCE;
	}

} //BasicModelFactoryImpl
