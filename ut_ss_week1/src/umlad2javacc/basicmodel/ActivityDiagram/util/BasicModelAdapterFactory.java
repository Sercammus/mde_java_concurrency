/**
 */
package umlad2javacc.basicmodel.ActivityDiagram.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import umlad2javacc.basicmodel.ActivityDiagram.Activity;
import umlad2javacc.basicmodel.ActivityDiagram.BasicModel;
import umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage;
import umlad2javacc.basicmodel.ActivityDiagram.Branch;
import umlad2javacc.basicmodel.ActivityDiagram.Decision;
import umlad2javacc.basicmodel.ActivityDiagram.End;
import umlad2javacc.basicmodel.ActivityDiagram.FinalActivity;
import umlad2javacc.basicmodel.ActivityDiagram.Fork;
import umlad2javacc.basicmodel.ActivityDiagram.ForkedThread;
import umlad2javacc.basicmodel.ActivityDiagram.Instance;
import umlad2javacc.basicmodel.ActivityDiagram.InstanceType;
import umlad2javacc.basicmodel.ActivityDiagram.Interrupt;
import umlad2javacc.basicmodel.ActivityDiagram.InterruptableThread;
import umlad2javacc.basicmodel.ActivityDiagram.Join;
import umlad2javacc.basicmodel.ActivityDiagram.LinearActivity;
import umlad2javacc.basicmodel.ActivityDiagram.NamedActivity;
import umlad2javacc.basicmodel.ActivityDiagram.NestedActivity;
import umlad2javacc.basicmodel.ActivityDiagram.NestedThread;
import umlad2javacc.basicmodel.ActivityDiagram.Reference;
import umlad2javacc.basicmodel.ActivityDiagram.SharedResource;
import umlad2javacc.basicmodel.ActivityDiagram.SimpleActivity;
import umlad2javacc.basicmodel.ActivityDiagram.Sleep;
import umlad2javacc.basicmodel.ActivityDiagram.Yield;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage
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
			public Adapter caseThread(umlad2javacc.basicmodel.ActivityDiagram.Thread object) {
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
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Thread
	 * @generated
	 */
	public Adapter createThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.BasicModel <em>Basic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModel
	 * @generated
	 */
	public Adapter createBasicModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.FinalActivity <em>Final Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.FinalActivity
	 * @generated
	 */
	public Adapter createFinalActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.LinearActivity <em>Linear Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.LinearActivity
	 * @generated
	 */
	public Adapter createLinearActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Fork
	 * @generated
	 */
	public Adapter createForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.SharedResource <em>Shared Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.SharedResource
	 * @generated
	 */
	public Adapter createSharedResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.Interrupt <em>Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Interrupt
	 * @generated
	 */
	public Adapter createInterruptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.InstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.InstanceType
	 * @generated
	 */
	public Adapter createInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.Sleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Sleep
	 * @generated
	 */
	public Adapter createSleepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.Yield <em>Yield</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Yield
	 * @generated
	 */
	public Adapter createYieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.SimpleActivity <em>Simple Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.SimpleActivity
	 * @generated
	 */
	public Adapter createSimpleActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.NestedActivity <em>Nested Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.NestedActivity
	 * @generated
	 */
	public Adapter createNestedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.ForkedThread <em>Forked Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.ForkedThread
	 * @generated
	 */
	public Adapter createForkedThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.NamedActivity <em>Named Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.NamedActivity
	 * @generated
	 */
	public Adapter createNamedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.NestedThread <em>Nested Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.NestedThread
	 * @generated
	 */
	public Adapter createNestedThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link umlad2javacc.basicmodel.ActivityDiagram.InterruptableThread <em>Interruptable Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.InterruptableThread
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
