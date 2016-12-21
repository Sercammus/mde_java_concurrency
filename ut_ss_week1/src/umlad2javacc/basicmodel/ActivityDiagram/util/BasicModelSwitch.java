/**
 */
package umlad2javacc.basicmodel.ActivityDiagram.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage
 * @generated
 */
public class BasicModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicModelSwitch() {
		if (modelPackage == null) {
			modelPackage = BasicModelPackage.eINSTANCE;
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
			case BasicModelPackage.THREAD: {
				umlad2javacc.basicmodel.ActivityDiagram.Thread thread = (umlad2javacc.basicmodel.ActivityDiagram.Thread)theEObject;
				T result = caseThread(thread);
				if (result == null) result = caseReference(thread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.BASIC_MODEL: {
				BasicModel basicModel = (BasicModel)theEObject;
				T result = caseBasicModel(basicModel);
				if (result == null) result = caseInterruptableThread(basicModel);
				if (result == null) result = caseThread(basicModel);
				if (result == null) result = caseReference(basicModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = caseFinalActivity(end);
				if (result == null) result = caseActivity(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.FINAL_ACTIVITY: {
				FinalActivity finalActivity = (FinalActivity)theEObject;
				T result = caseFinalActivity(finalActivity);
				if (result == null) result = caseActivity(finalActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.LINEAR_ACTIVITY: {
				LinearActivity linearActivity = (LinearActivity)theEObject;
				T result = caseLinearActivity(linearActivity);
				if (result == null) result = caseActivity(linearActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.FORK: {
				Fork fork = (Fork)theEObject;
				T result = caseFork(fork);
				if (result == null) result = caseActivity(fork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = caseLinearActivity(decision);
				if (result == null) result = caseActivity(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.BRANCH: {
				Branch branch = (Branch)theEObject;
				T result = caseBranch(branch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseLinearActivity(join);
				if (result == null) result = caseActivity(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.SHARED_RESOURCE: {
				SharedResource sharedResource = (SharedResource)theEObject;
				T result = caseSharedResource(sharedResource);
				if (result == null) result = caseReference(sharedResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.INTERRUPT: {
				Interrupt interrupt = (Interrupt)theEObject;
				T result = caseInterrupt(interrupt);
				if (result == null) result = caseLinearActivity(interrupt);
				if (result == null) result = caseActivity(interrupt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = caseReference(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.INSTANCE_TYPE: {
				InstanceType instanceType = (InstanceType)theEObject;
				T result = caseInstanceType(instanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.SLEEP: {
				Sleep sleep = (Sleep)theEObject;
				T result = caseSleep(sleep);
				if (result == null) result = caseLinearActivity(sleep);
				if (result == null) result = caseActivity(sleep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.YIELD: {
				Yield yield = (Yield)theEObject;
				T result = caseYield(yield);
				if (result == null) result = caseLinearActivity(yield);
				if (result == null) result = caseActivity(yield);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.SIMPLE_ACTIVITY: {
				SimpleActivity simpleActivity = (SimpleActivity)theEObject;
				T result = caseSimpleActivity(simpleActivity);
				if (result == null) result = caseNamedActivity(simpleActivity);
				if (result == null) result = caseLinearActivity(simpleActivity);
				if (result == null) result = caseActivity(simpleActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.NESTED_ACTIVITY: {
				NestedActivity nestedActivity = (NestedActivity)theEObject;
				T result = caseNestedActivity(nestedActivity);
				if (result == null) result = caseNamedActivity(nestedActivity);
				if (result == null) result = caseLinearActivity(nestedActivity);
				if (result == null) result = caseActivity(nestedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.FORKED_THREAD: {
				ForkedThread forkedThread = (ForkedThread)theEObject;
				T result = caseForkedThread(forkedThread);
				if (result == null) result = caseInterruptableThread(forkedThread);
				if (result == null) result = caseThread(forkedThread);
				if (result == null) result = caseReference(forkedThread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.NAMED_ACTIVITY: {
				NamedActivity namedActivity = (NamedActivity)theEObject;
				T result = caseNamedActivity(namedActivity);
				if (result == null) result = caseLinearActivity(namedActivity);
				if (result == null) result = caseActivity(namedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.NESTED_THREAD: {
				NestedThread nestedThread = (NestedThread)theEObject;
				T result = caseNestedThread(nestedThread);
				if (result == null) result = caseThread(nestedThread);
				if (result == null) result = caseReference(nestedThread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicModelPackage.INTERRUPTABLE_THREAD: {
				InterruptableThread interruptableThread = (InterruptableThread)theEObject;
				T result = caseInterruptableThread(interruptableThread);
				if (result == null) result = caseThread(interruptableThread);
				if (result == null) result = caseReference(interruptableThread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseThread(umlad2javacc.basicmodel.ActivityDiagram.Thread object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Forked Thread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkedThread(ForkedThread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedActivity(NamedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Thread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedThread(NestedThread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interruptable Thread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interruptable Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptableThread(InterruptableThread object) {
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

} //BasicModelSwitch
