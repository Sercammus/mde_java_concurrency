/**
 */
package ActivityDiagram.impl;

import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.Interrupt;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interrupt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.impl.InterruptImpl#getInterruptedThread <em>Interrupted Thread</em>}</li>
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
	protected ActivityDiagram.Thread interruptedThread;

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
		return ActivityDiagramPackage.Literals.INTERRUPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagram.Thread getInterruptedThread() {
		if (interruptedThread != null && interruptedThread.eIsProxy()) {
			InternalEObject oldInterruptedThread = (InternalEObject)interruptedThread;
			interruptedThread = (ActivityDiagram.Thread)eResolveProxy(oldInterruptedThread);
			if (interruptedThread != oldInterruptedThread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityDiagramPackage.INTERRUPT__INTERRUPTED_THREAD, oldInterruptedThread, interruptedThread));
			}
		}
		return interruptedThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagram.Thread basicGetInterruptedThread() {
		return interruptedThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterruptedThread(ActivityDiagram.Thread newInterruptedThread) {
		ActivityDiagram.Thread oldInterruptedThread = interruptedThread;
		interruptedThread = newInterruptedThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramPackage.INTERRUPT__INTERRUPTED_THREAD, oldInterruptedThread, interruptedThread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityDiagramPackage.INTERRUPT__INTERRUPTED_THREAD:
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
			case ActivityDiagramPackage.INTERRUPT__INTERRUPTED_THREAD:
				setInterruptedThread((ActivityDiagram.Thread)newValue);
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
			case ActivityDiagramPackage.INTERRUPT__INTERRUPTED_THREAD:
				setInterruptedThread((ActivityDiagram.Thread)null);
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
			case ActivityDiagramPackage.INTERRUPT__INTERRUPTED_THREAD:
				return interruptedThread != null;
		}
		return super.eIsSet(featureID);
	}

} //InterruptImpl
