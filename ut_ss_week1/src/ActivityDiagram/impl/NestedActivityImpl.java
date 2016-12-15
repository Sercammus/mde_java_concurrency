/**
 */
package ActivityDiagram.impl;

import ActivityDiagram.Activity;
import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.Fork;
import ActivityDiagram.LinearActivity;
import ActivityDiagram.NestedActivity;
import ActivityDiagram.Reference;
import ActivityDiagram.SharedResource;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.impl.NestedActivityImpl#getNestedThread <em>Nested Thread</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedActivityImpl extends NamedActivityImpl implements NestedActivity {
	/**
	 * The cached value of the '{@link #getNestedThread() <em>Nested Thread</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedThread()
	 * @generated
	 * @ordered
	 */
	protected ActivityDiagram.Thread nestedThread;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityDiagramPackage.Literals.NESTED_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagram.Thread getNestedThread() {
		return nestedThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestedThread(ActivityDiagram.Thread newNestedThread, NotificationChain msgs) {
		ActivityDiagram.Thread oldNestedThread = nestedThread;
		nestedThread = newNestedThread;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityDiagramPackage.NESTED_ACTIVITY__NESTED_THREAD, oldNestedThread, newNestedThread);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestedThread(ActivityDiagram.Thread newNestedThread) {
		if (newNestedThread != nestedThread) {
			NotificationChain msgs = null;
			if (nestedThread != null)
				msgs = ((InternalEObject)nestedThread).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityDiagramPackage.NESTED_ACTIVITY__NESTED_THREAD, null, msgs);
			if (newNestedThread != null)
				msgs = ((InternalEObject)newNestedThread).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityDiagramPackage.NESTED_ACTIVITY__NESTED_THREAD, null, msgs);
			msgs = basicSetNestedThread(newNestedThread, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramPackage.NESTED_ACTIVITY__NESTED_THREAD, newNestedThread, newNestedThread));
	}

	/**
	 * The cached invocation delegate for the '{@link #JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate JOINS_CORRECTLY_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)ActivityDiagramPackage.Literals.NESTED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Activity> JoinsCorrectly(EList<Fork> fork, EList<Activity> beenHere) {
		try {
			return (EList<Activity>)JOINS_CORRECTLY_ELIST_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{fork, beenHere}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ACCESSED_REFERENCES_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)ActivityDiagramPackage.Literals.NESTED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Reference> GetAccessedReferences(EList<SharedResource> soFar, EList<Activity> beenHere) {
		try {
			return (EList<Reference>)GET_ACCESSED_REFERENCES_ELIST_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{soFar, beenHere}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityDiagramPackage.NESTED_ACTIVITY__NESTED_THREAD:
				return basicSetNestedThread(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityDiagramPackage.NESTED_ACTIVITY__NESTED_THREAD:
				return getNestedThread();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivityDiagramPackage.NESTED_ACTIVITY__NESTED_THREAD:
				setNestedThread((ActivityDiagram.Thread)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivityDiagramPackage.NESTED_ACTIVITY__NESTED_THREAD:
				setNestedThread((ActivityDiagram.Thread)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivityDiagramPackage.NESTED_ACTIVITY__NESTED_THREAD:
				return nestedThread != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Activity.class) {
			switch (baseOperationID) {
				case ActivityDiagramPackage.ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST: return ActivityDiagramPackage.NESTED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;
				case ActivityDiagramPackage.ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST: return ActivityDiagramPackage.NESTED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == LinearActivity.class) {
			switch (baseOperationID) {
				case ActivityDiagramPackage.LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST: return ActivityDiagramPackage.NESTED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;
				case ActivityDiagramPackage.LINEAR_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST: return ActivityDiagramPackage.NESTED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ActivityDiagramPackage.NESTED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST:
				return JoinsCorrectly((EList<Fork>)arguments.get(0), (EList<Activity>)arguments.get(1));
			case ActivityDiagramPackage.NESTED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST:
				return GetAccessedReferences((EList<SharedResource>)arguments.get(0), (EList<Activity>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NestedActivityImpl
