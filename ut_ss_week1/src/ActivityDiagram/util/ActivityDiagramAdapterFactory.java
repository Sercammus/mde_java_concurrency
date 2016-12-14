/**
 */
package ActivityDiagram.util;

import ActivityDiagram.Activity;
import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.BasicModel;
import ActivityDiagram.Branch;
import ActivityDiagram.Decision;
import ActivityDiagram.DescribedActivity;
import ActivityDiagram.End;
import ActivityDiagram.FinalActivity;
import ActivityDiagram.Fork;
import ActivityDiagram.Instance;
import ActivityDiagram.InstanceType;
import ActivityDiagram.Interrupt;
import ActivityDiagram.Join;
import ActivityDiagram.LinearActivity;
import ActivityDiagram.NestedActivity;
import ActivityDiagram.SharedResource;
import ActivityDiagram.SimpleActivity;
import ActivityDiagram.Sleep;
import ActivityDiagram.Yield;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ActivityDiagram.ActivityDiagramPackage
 * @generated
 */
public class ActivityDiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivityDiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActivityDiagramPackage.eINSTANCE;
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
	protected ActivityDiagramSwitch<Adapter> modelSwitch =
		new ActivityDiagramSwitch<Adapter>() {
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
			public Adapter caseThread(ActivityDiagram.Thread object) {
				return createThreadAdapter();
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
			public Adapter caseDescribedActivity(DescribedActivity object) {
				return createDescribedActivityAdapter();
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
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.BasicModel <em>Basic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.BasicModel
	 * @generated
	 */
	public Adapter createBasicModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.FinalActivity <em>Final Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.FinalActivity
	 * @generated
	 */
	public Adapter createFinalActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.LinearActivity <em>Linear Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.LinearActivity
	 * @generated
	 */
	public Adapter createLinearActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.Fork
	 * @generated
	 */
	public Adapter createForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.SharedResource <em>Shared Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.SharedResource
	 * @generated
	 */
	public Adapter createSharedResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.Interrupt <em>Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.Interrupt
	 * @generated
	 */
	public Adapter createInterruptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.InstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.InstanceType
	 * @generated
	 */
	public Adapter createInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.Sleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.Sleep
	 * @generated
	 */
	public Adapter createSleepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.Thread
	 * @generated
	 */
	public Adapter createThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.Yield <em>Yield</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.Yield
	 * @generated
	 */
	public Adapter createYieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.SimpleActivity <em>Simple Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.SimpleActivity
	 * @generated
	 */
	public Adapter createSimpleActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.NestedActivity <em>Nested Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.NestedActivity
	 * @generated
	 */
	public Adapter createNestedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ActivityDiagram.DescribedActivity <em>Described Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ActivityDiagram.DescribedActivity
	 * @generated
	 */
	public Adapter createDescribedActivityAdapter() {
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

} //ActivityDiagramAdapterFactory
