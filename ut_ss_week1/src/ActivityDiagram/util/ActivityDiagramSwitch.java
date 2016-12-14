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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ActivityDiagram.ActivityDiagramPackage
 * @generated
 */
public class ActivityDiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivityDiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = ActivityDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ActivityDiagramPackage.BASIC_MODEL: {
				BasicModel basicModel = (BasicModel)theEObject;
				T result = caseBasicModel(basicModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = caseFinalActivity(end);
				if (result == null) result = caseActivity(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.FINAL_ACTIVITY: {
				FinalActivity finalActivity = (FinalActivity)theEObject;
				T result = caseFinalActivity(finalActivity);
				if (result == null) result = caseActivity(finalActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.LINEAR_ACTIVITY: {
				LinearActivity linearActivity = (LinearActivity)theEObject;
				T result = caseLinearActivity(linearActivity);
				if (result == null) result = caseActivity(linearActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.FORK: {
				Fork fork = (Fork)theEObject;
				T result = caseFork(fork);
				if (result == null) result = caseActivity(fork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = caseLinearActivity(decision);
				if (result == null) result = caseActivity(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.BRANCH: {
				Branch branch = (Branch)theEObject;
				T result = caseBranch(branch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseLinearActivity(join);
				if (result == null) result = caseActivity(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.SHARED_RESOURCE: {
				SharedResource sharedResource = (SharedResource)theEObject;
				T result = caseSharedResource(sharedResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.INTERRUPT: {
				Interrupt interrupt = (Interrupt)theEObject;
				T result = caseInterrupt(interrupt);
				if (result == null) result = caseLinearActivity(interrupt);
				if (result == null) result = caseActivity(interrupt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.INSTANCE_TYPE: {
				InstanceType instanceType = (InstanceType)theEObject;
				T result = caseInstanceType(instanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.SLEEP: {
				Sleep sleep = (Sleep)theEObject;
				T result = caseSleep(sleep);
				if (result == null) result = caseLinearActivity(sleep);
				if (result == null) result = caseActivity(sleep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.THREAD: {
				ActivityDiagram.Thread thread = (ActivityDiagram.Thread)theEObject;
				T result = caseThread(thread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.YIELD: {
				Yield yield = (Yield)theEObject;
				T result = caseYield(yield);
				if (result == null) result = caseLinearActivity(yield);
				if (result == null) result = caseActivity(yield);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.SIMPLE_ACTIVITY: {
				SimpleActivity simpleActivity = (SimpleActivity)theEObject;
				T result = caseSimpleActivity(simpleActivity);
				if (result == null) result = caseDescribedActivity(simpleActivity);
				if (result == null) result = caseLinearActivity(simpleActivity);
				if (result == null) result = caseActivity(simpleActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.NESTED_ACTIVITY: {
				NestedActivity nestedActivity = (NestedActivity)theEObject;
				T result = caseNestedActivity(nestedActivity);
				if (result == null) result = caseDescribedActivity(nestedActivity);
				if (result == null) result = caseLinearActivity(nestedActivity);
				if (result == null) result = caseActivity(nestedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityDiagramPackage.DESCRIBED_ACTIVITY: {
				DescribedActivity describedActivity = (DescribedActivity)theEObject;
				T result = caseDescribedActivity(describedActivity);
				if (result == null) result = caseLinearActivity(describedActivity);
				if (result == null) result = caseActivity(describedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicModel(BasicModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalActivity(FinalActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearActivity(LinearActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFork(Fork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecision(Decision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranch(Branch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedResource(SharedResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interrupt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interrupt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterrupt(Interrupt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceType(InstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sleep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sleep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSleep(Sleep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThread(ActivityDiagram.Thread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yield</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yield</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYield(Yield object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleActivity(SimpleActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedActivity(NestedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribedActivity(DescribedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ActivityDiagramSwitch
