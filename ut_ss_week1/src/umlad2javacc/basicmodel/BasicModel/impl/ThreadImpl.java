/**
 */
package umlad2javacc.basicmodel.BasicModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlad2javacc.basicmodel.BasicModel.Activity;
import umlad2javacc.basicmodel.BasicModel.BasicModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.ThreadImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.ThreadImpl#getActivitiesByStateId <em>Activities By State Id</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.ThreadImpl#getStartActivity <em>Start Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ThreadImpl extends ReferenceImpl implements umlad2javacc.basicmodel.BasicModel.Thread {
	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

	/**
	 * The cached setting delegate for the '{@link #getActivitiesByStateId() <em>Activities By State Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitiesByStateId()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ACTIVITIES_BY_STATE_ID__ESETTING_DELEGATE = ((EStructuralFeature.Internal)BasicModelPackage.Literals.THREAD__ACTIVITIES_BY_STATE_ID).getSettingDelegate();

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
	protected ThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicModelPackage.Literals.THREAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, BasicModelPackage.THREAD__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Activity> getActivitiesByStateId() {
		return (EList<Activity>)ACTIVITIES_BY_STATE_ID__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicModelPackage.THREAD__START_ACTIVITY, oldStartActivity, startActivity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicModelPackage.THREAD__START_ACTIVITY, oldStartActivity, startActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicModelPackage.THREAD__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
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
			case BasicModelPackage.THREAD__ACTIVITIES:
				return getActivities();
			case BasicModelPackage.THREAD__ACTIVITIES_BY_STATE_ID:
				return getActivitiesByStateId();
			case BasicModelPackage.THREAD__START_ACTIVITY:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicModelPackage.THREAD__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case BasicModelPackage.THREAD__ACTIVITIES_BY_STATE_ID:
				getActivitiesByStateId().clear();
				getActivitiesByStateId().addAll((Collection<? extends Activity>)newValue);
				return;
			case BasicModelPackage.THREAD__START_ACTIVITY:
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
			case BasicModelPackage.THREAD__ACTIVITIES:
				getActivities().clear();
				return;
			case BasicModelPackage.THREAD__ACTIVITIES_BY_STATE_ID:
				getActivitiesByStateId().clear();
				return;
			case BasicModelPackage.THREAD__START_ACTIVITY:
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
			case BasicModelPackage.THREAD__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case BasicModelPackage.THREAD__ACTIVITIES_BY_STATE_ID:
				return ACTIVITIES_BY_STATE_ID__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case BasicModelPackage.THREAD__START_ACTIVITY:
				return startActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //ThreadImpl
