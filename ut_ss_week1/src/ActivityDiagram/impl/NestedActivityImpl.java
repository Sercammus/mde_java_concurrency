/**
 */
package ActivityDiagram.impl;

import ActivityDiagram.Activity;
import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.NestedActivity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link ActivityDiagram.impl.NestedActivityImpl#getStartActivity <em>Start Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedActivityImpl extends DescribedActivityImpl implements NestedActivity {
	/**
	 * The cached value of the '{@link #getStartActivity() <em>Start Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity startActivity;

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
	public Activity getStartActivity() {
		if (startActivity != null && startActivity.eIsProxy()) {
			InternalEObject oldStartActivity = (InternalEObject)startActivity;
			startActivity = (Activity)eResolveProxy(oldStartActivity);
			if (startActivity != oldStartActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityDiagramPackage.NESTED_ACTIVITY__START_ACTIVITY, oldStartActivity, startActivity));
			}
		}
		return startActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetStartActivity() {
		return startActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartActivity(Activity newStartActivity) {
		Activity oldStartActivity = startActivity;
		startActivity = newStartActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramPackage.NESTED_ACTIVITY__START_ACTIVITY, oldStartActivity, startActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityDiagramPackage.NESTED_ACTIVITY__START_ACTIVITY:
				if (resolve) return getStartActivity();
				return basicGetStartActivity();
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
			case ActivityDiagramPackage.NESTED_ACTIVITY__START_ACTIVITY:
				setStartActivity((Activity)newValue);
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
			case ActivityDiagramPackage.NESTED_ACTIVITY__START_ACTIVITY:
				setStartActivity((Activity)null);
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
			case ActivityDiagramPackage.NESTED_ACTIVITY__START_ACTIVITY:
				return startActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //NestedActivityImpl
