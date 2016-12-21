/**
 */
package umlad2javacc.basicmodel.ActivityDiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage;
import umlad2javacc.basicmodel.ActivityDiagram.NamedActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.impl.NamedActivityImpl#getActivityName <em>Activity Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedActivityImpl extends LinearActivityImpl implements NamedActivity {
	/**
	 * The default value of the '{@link #getActivityName() <em>Activity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityName() <em>Activity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityName()
	 * @generated
	 * @ordered
	 */
	protected String activityName = ACTIVITY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicModelPackage.Literals.NAMED_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityName() {
		return activityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityName(String newActivityName) {
		String oldActivityName = activityName;
		activityName = newActivityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicModelPackage.NAMED_ACTIVITY__ACTIVITY_NAME, oldActivityName, activityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicModelPackage.NAMED_ACTIVITY__ACTIVITY_NAME:
				return getActivityName();
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
			case BasicModelPackage.NAMED_ACTIVITY__ACTIVITY_NAME:
				setActivityName((String)newValue);
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
			case BasicModelPackage.NAMED_ACTIVITY__ACTIVITY_NAME:
				setActivityName(ACTIVITY_NAME_EDEFAULT);
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
			case BasicModelPackage.NAMED_ACTIVITY__ACTIVITY_NAME:
				return ACTIVITY_NAME_EDEFAULT == null ? activityName != null : !ACTIVITY_NAME_EDEFAULT.equals(activityName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (activityName: ");
		result.append(activityName);
		result.append(')');
		return result.toString();
	}

} //NamedActivityImpl
