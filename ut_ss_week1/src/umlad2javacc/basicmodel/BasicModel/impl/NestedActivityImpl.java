/**
 */
package umlad2javacc.basicmodel.BasicModel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import umlad2javacc.basicmodel.BasicModel.Activity;
import umlad2javacc.basicmodel.BasicModel.BasicModelPackage;
import umlad2javacc.basicmodel.BasicModel.LinearActivity;
import umlad2javacc.basicmodel.BasicModel.NestedActivity;
import umlad2javacc.basicmodel.BasicModel.NestedThread;
import umlad2javacc.basicmodel.BasicModel.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.NestedActivityImpl#getNestedThread <em>Nested Thread</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedActivityImpl extends NamedActivityImpl implements NestedActivity {
	/**
	 * The cached value of the '{@link #getNestedThread() <em>Nested Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedThread()
	 * @generated
	 * @ordered
	 */
	protected NestedThread nestedThread;

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
		return BasicModelPackage.Literals.NESTED_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedThread getNestedThread() {
		if (nestedThread != null && nestedThread.eIsProxy()) {
			InternalEObject oldNestedThread = (InternalEObject)nestedThread;
			nestedThread = (NestedThread)eResolveProxy(oldNestedThread);
			if (nestedThread != oldNestedThread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicModelPackage.NESTED_ACTIVITY__NESTED_THREAD, oldNestedThread, nestedThread));
			}
		}
		return nestedThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedThread basicGetNestedThread() {
		return nestedThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestedThread(NestedThread newNestedThread) {
		NestedThread oldNestedThread = nestedThread;
		nestedThread = newNestedThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicModelPackage.NESTED_ACTIVITY__NESTED_THREAD, oldNestedThread, nestedThread));
	}

	/**
	 * The cached invocation delegate for the '{@link #JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate JOINS_CORRECTLY_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.NESTED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Activity> JoinsCorrectly(EList<umlad2javacc.basicmodel.BasicModel.Thread> threadStack, EList<Activity> beenHere) {
		try {
			return (EList<Activity>)JOINS_CORRECTLY_ELIST_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{threadStack, beenHere}));
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
	protected static final EOperation.Internal.InvocationDelegate GET_ACCESSED_REFERENCES_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.NESTED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Reference> GetAccessedReferences(EList<Reference> soFar, EList<Activity> beenHere) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicModelPackage.NESTED_ACTIVITY__NESTED_THREAD:
				if (resolve) return getNestedThread();
				return basicGetNestedThread();
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
			case BasicModelPackage.NESTED_ACTIVITY__NESTED_THREAD:
				setNestedThread((NestedThread)newValue);
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
			case BasicModelPackage.NESTED_ACTIVITY__NESTED_THREAD:
				setNestedThread((NestedThread)null);
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
			case BasicModelPackage.NESTED_ACTIVITY__NESTED_THREAD:
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
				case BasicModelPackage.ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST: return BasicModelPackage.NESTED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;
				case BasicModelPackage.ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST: return BasicModelPackage.NESTED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == LinearActivity.class) {
			switch (baseOperationID) {
				case BasicModelPackage.LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST: return BasicModelPackage.NESTED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST;
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
			case BasicModelPackage.NESTED_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST:
				return JoinsCorrectly((EList<umlad2javacc.basicmodel.BasicModel.Thread>)arguments.get(0), (EList<Activity>)arguments.get(1));
			case BasicModelPackage.NESTED_ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST:
				return GetAccessedReferences((EList<Reference>)arguments.get(0), (EList<Activity>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NestedActivityImpl
