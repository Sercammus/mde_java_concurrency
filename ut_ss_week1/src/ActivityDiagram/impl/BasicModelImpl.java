/**
 */
package ActivityDiagram.impl;

import ActivityDiagram.Activity;
import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.BasicModel;
import ActivityDiagram.Instance;
import ActivityDiagram.InstanceType;
import ActivityDiagram.SharedResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.impl.BasicModelImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link ActivityDiagram.impl.BasicModelImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link ActivityDiagram.impl.BasicModelImpl#getInstanceTypes <em>Instance Types</em>}</li>
 *   <li>{@link ActivityDiagram.impl.BasicModelImpl#getStartActivity <em>Start Activity</em>}</li>
 *   <li>{@link ActivityDiagram.impl.BasicModelImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicModelImpl extends MinimalEObjectImpl.Container implements BasicModel {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedResource> resources;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instances;

	/**
	 * The cached value of the '{@link #getInstanceTypes() <em>Instance Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceType> instanceTypes;

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
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityDiagramPackage.Literals.BASIC_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<SharedResource>(SharedResource.class, this, ActivityDiagramPackage.BASIC_MODEL__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<Instance>(Instance.class, this, ActivityDiagramPackage.BASIC_MODEL__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceType> getInstanceTypes() {
		if (instanceTypes == null) {
			instanceTypes = new EObjectContainmentEList<InstanceType>(InstanceType.class, this, ActivityDiagramPackage.BASIC_MODEL__INSTANCE_TYPES);
		}
		return instanceTypes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityDiagramPackage.BASIC_MODEL__START_ACTIVITY, oldStartActivity, startActivity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramPackage.BASIC_MODEL__START_ACTIVITY, oldStartActivity, startActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, ActivityDiagramPackage.BASIC_MODEL__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityDiagramPackage.BASIC_MODEL__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case ActivityDiagramPackage.BASIC_MODEL__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case ActivityDiagramPackage.BASIC_MODEL__INSTANCE_TYPES:
				return ((InternalEList<?>)getInstanceTypes()).basicRemove(otherEnd, msgs);
			case ActivityDiagramPackage.BASIC_MODEL__ACTIVITIES:
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
			case ActivityDiagramPackage.BASIC_MODEL__RESOURCES:
				return getResources();
			case ActivityDiagramPackage.BASIC_MODEL__INSTANCES:
				return getInstances();
			case ActivityDiagramPackage.BASIC_MODEL__INSTANCE_TYPES:
				return getInstanceTypes();
			case ActivityDiagramPackage.BASIC_MODEL__START_ACTIVITY:
				if (resolve) return getStartActivity();
				return basicGetStartActivity();
			case ActivityDiagramPackage.BASIC_MODEL__ACTIVITIES:
				return getActivities();
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
			case ActivityDiagramPackage.BASIC_MODEL__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends SharedResource>)newValue);
				return;
			case ActivityDiagramPackage.BASIC_MODEL__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends Instance>)newValue);
				return;
			case ActivityDiagramPackage.BASIC_MODEL__INSTANCE_TYPES:
				getInstanceTypes().clear();
				getInstanceTypes().addAll((Collection<? extends InstanceType>)newValue);
				return;
			case ActivityDiagramPackage.BASIC_MODEL__START_ACTIVITY:
				setStartActivity((Activity)newValue);
				return;
			case ActivityDiagramPackage.BASIC_MODEL__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
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
			case ActivityDiagramPackage.BASIC_MODEL__RESOURCES:
				getResources().clear();
				return;
			case ActivityDiagramPackage.BASIC_MODEL__INSTANCES:
				getInstances().clear();
				return;
			case ActivityDiagramPackage.BASIC_MODEL__INSTANCE_TYPES:
				getInstanceTypes().clear();
				return;
			case ActivityDiagramPackage.BASIC_MODEL__START_ACTIVITY:
				setStartActivity((Activity)null);
				return;
			case ActivityDiagramPackage.BASIC_MODEL__ACTIVITIES:
				getActivities().clear();
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
			case ActivityDiagramPackage.BASIC_MODEL__RESOURCES:
				return resources != null && !resources.isEmpty();
			case ActivityDiagramPackage.BASIC_MODEL__INSTANCES:
				return instances != null && !instances.isEmpty();
			case ActivityDiagramPackage.BASIC_MODEL__INSTANCE_TYPES:
				return instanceTypes != null && !instanceTypes.isEmpty();
			case ActivityDiagramPackage.BASIC_MODEL__START_ACTIVITY:
				return startActivity != null;
			case ActivityDiagramPackage.BASIC_MODEL__ACTIVITIES:
				return activities != null && !activities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicModelImpl
