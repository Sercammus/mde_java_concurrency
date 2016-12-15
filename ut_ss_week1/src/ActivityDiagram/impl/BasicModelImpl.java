/**
 */
package ActivityDiagram.impl;

import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.BasicModel;
import ActivityDiagram.Instance;
import ActivityDiagram.InstanceType;
import ActivityDiagram.SharedResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link ActivityDiagram.impl.BasicModelImpl#getThreads <em>Threads</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicModelImpl extends ThreadImpl implements BasicModel {
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
	 * The cached value of the '{@link #getThreads() <em>Threads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityDiagram.Thread> threads;

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
	public EList<ActivityDiagram.Thread> getThreads() {
		if (threads == null) {
			threads = new EObjectContainmentEList<ActivityDiagram.Thread>(ActivityDiagram.Thread.class, this, ActivityDiagramPackage.BASIC_MODEL__THREADS);
		}
		return threads;
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
			case ActivityDiagramPackage.BASIC_MODEL__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
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
			case ActivityDiagramPackage.BASIC_MODEL__THREADS:
				return getThreads();
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
			case ActivityDiagramPackage.BASIC_MODEL__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ActivityDiagram.Thread>)newValue);
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
			case ActivityDiagramPackage.BASIC_MODEL__THREADS:
				getThreads().clear();
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
			case ActivityDiagramPackage.BASIC_MODEL__THREADS:
				return threads != null && !threads.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicModelImpl
