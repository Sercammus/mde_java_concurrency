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
import umlad2javacc.basicmodel.BasicModel.Interrupt;
import umlad2javacc.basicmodel.BasicModel.InterruptableThread;
import umlad2javacc.basicmodel.BasicModel.LinearActivity;
import umlad2javacc.basicmodel.BasicModel.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interrupt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.InterruptImpl#getInterruptedThread <em>Interrupted Thread</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterruptImpl extends LinearActivityImpl implements Interrupt {
	/**
	 * The cached value of the '{@link #getInterruptedThread() <em>Interrupted Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptedThread()
	 * @generated
	 * @ordered
	 */
	protected InterruptableThread interruptedThread;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicModelPackage.Literals.INTERRUPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptableThread getInterruptedThread() {
		if (interruptedThread != null && interruptedThread.eIsProxy()) {
			InternalEObject oldInterruptedThread = (InternalEObject)interruptedThread;
			interruptedThread = (InterruptableThread)eResolveProxy(oldInterruptedThread);
			if (interruptedThread != oldInterruptedThread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicModelPackage.INTERRUPT__INTERRUPTED_THREAD, oldInterruptedThread, interruptedThread));
			}
		}
		return interruptedThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptableThread basicGetInterruptedThread() {
		return interruptedThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterruptedThread(InterruptableThread newInterruptedThread) {
		InterruptableThread oldInterruptedThread = interruptedThread;
		interruptedThread = newInterruptedThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicModelPackage.INTERRUPT__INTERRUPTED_THREAD, oldInterruptedThread, interruptedThread));
	}

	/**
	 * The cached invocation delegate for the '{@link #GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SUCCESSOR_REFERENCES_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.INTERRUPT___GET_SUCCESSOR_REFERENCES__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Reference> GetSuccessorReferences(EList<Reference> soFar, EList<Activity> beenHere) {
		try {
			return (EList<Reference>)GET_SUCCESSOR_REFERENCES_ELIST_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{soFar, beenHere}));
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
			case BasicModelPackage.INTERRUPT__INTERRUPTED_THREAD:
				if (resolve) return getInterruptedThread();
				return basicGetInterruptedThread();
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
			case BasicModelPackage.INTERRUPT__INTERRUPTED_THREAD:
				setInterruptedThread((InterruptableThread)newValue);
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
			case BasicModelPackage.INTERRUPT__INTERRUPTED_THREAD:
				setInterruptedThread((InterruptableThread)null);
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
			case BasicModelPackage.INTERRUPT__INTERRUPTED_THREAD:
				return interruptedThread != null;
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
				case BasicModelPackage.ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST: return BasicModelPackage.INTERRUPT___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == LinearActivity.class) {
			switch (baseOperationID) {
				case BasicModelPackage.LINEAR_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST: return BasicModelPackage.INTERRUPT___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;
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
			case BasicModelPackage.INTERRUPT___GET_SUCCESSOR_REFERENCES__ELIST_ELIST:
				return GetSuccessorReferences((EList<Reference>)arguments.get(0), (EList<Activity>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InterruptImpl
