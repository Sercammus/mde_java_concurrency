/**
 */
package umlad2javacc.basicmodel.BasicModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import umlad2javacc.basicmodel.BasicModel.Activity;
import umlad2javacc.basicmodel.BasicModel.BasicModel;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage
 * @generated
 */
public class BasicModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BasicModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicModelSwitch<Adapter> modelSwitch =
		new BasicModelSwitch<Adapter>() {
			@Override
			public Adapter caseThread(umlad2javacc.basicmodel.BasicModel.Thread object) {
				return createThreadAdapter();
			}
			@Override
			public Adapter caseBasicModel(BasicModel object) {
				return createBasicModelAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseEnd(End object) {
				return createEndAdapter();
			}
			@Override
			public Adapter caseFinalActivity(FinalActivity object) {
				return createFinalActivityAdapter();
			}
			@Override
			public Adapter caseLinearActivity(LinearActivity object) {
				return createLinearActivityAdapter();
			}
			@Override
			public Adapter caseFork(Fork object) {
				return createForkAdapter();
			}
			@Override
			public Adapter caseDecision(Decision object) {
				return createDecisionAdapter();
			}
			@Override
			public Adapter caseBranch(Branch object) {
				return createBranchAdapter();
			}
			@Override
			public Adapter caseJoin(Join object) {
				return createJoinAdapter();
			}
			@Override
			public Adapter caseSharedResource(SharedResource object) {
				return createSharedResourceAdapter();
			}
			@Override
			public Adapter caseInterrupt(Interrupt object) {
				return createInterruptAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseInstanceType(InstanceType object) {
				return createInstanceTypeAdapter();
			}
			@Override
			public Adapter caseSleep(Sleep object) {
				return createSleepAdapter();
			}
			@Override
			public Adapter caseYield(Yield object) {
				return createYieldAdapter();
			}
			@Override
			public Adapter caseSimpleActivity(SimpleActivity object) {
				return createSimpleActivityAdapter();
			}
			@Override
			public Adapter caseNestedActivity(NestedActivity object) {
				return createNestedActivityAdapter();
			}
			@Override
			public Adapter caseForkedThread(ForkedThread object) {
				return createForkedThreadAdapter();
			}
			@Override
			public Adapter caseNamedActivity(NamedActivity object) {
				return createNamedActivityAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseNestedThread(NestedThread object) {
				return createNestedThreadAdapter();
			}
			@Override
			public Adapter caseInterruptableThread(InterruptableThread object) {
				return createInterruptableThreadAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.Thread
	 * @generated
	 */
	public Adapter createThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.BasicModel <em>Basic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModel
	 * @generated
	 */
	public Adapter createBasicModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.FinalActivity <em>Final Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.FinalActivity
	 * @generated
	 */
	public Adapter createFinalActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.LinearActivity <em>Linear Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.LinearActivity
	 * @generated
	 */
	public Adapter createLinearActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.Fork
	 * @generated
	 */
	public Adapter createForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.SharedResource <em>Shared Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.SharedResource
	 * @generated
	 */
	public Adapter createSharedResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.Interrupt <em>Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.Interrupt
	 * @generated
	 */
	public Adapter createInterruptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.InstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.InstanceType
	 * @generated
	 */
	public Adapter createInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.Sleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.Sleep
	 * @generated
	 */
	public Adapter createSleepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.Yield <em>Yield</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.Yield
	 * @generated
	 */
	public Adapter createYieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.SimpleActivity <em>Simple Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.SimpleActivity
	 * @generated
	 */
	public Adapter createSimpleActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.NestedActivity <em>Nested Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.NestedActivity
	 * @generated
	 */
	public Adapter createNestedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.ForkedThread <em>Forked Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.ForkedThread
	 * @generated
	 */
	public Adapter createForkedThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.NamedActivity <em>Named Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.NamedActivity
	 * @generated
	 */
	public Adapter createNamedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.NestedThread <em>Nested Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.NestedThread
	 * @generated
	 */
	public Adapter createNestedThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.BasicModel.InterruptableThread <em>Interruptable Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.BasicModel.InterruptableThread
	 * @generated
	 */
	public Adapter createInterruptableThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BasicModelAdapterFactory
