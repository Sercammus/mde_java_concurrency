/**
 */
package umlad2javacc.basicmodel.BasicModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlad2javacc.basicmodel.BasicModel.BasicModel;
import umlad2javacc.basicmodel.BasicModel.BasicModelPackage;
import umlad2javacc.basicmodel.BasicModel.ForkedThread;
import umlad2javacc.basicmodel.BasicModel.Instance;
import umlad2javacc.basicmodel.BasicModel.InstanceType;
import umlad2javacc.basicmodel.BasicModel.NestedThread;
import umlad2javacc.basicmodel.BasicModel.SharedResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.BasicModelImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.BasicModelImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.BasicModelImpl#getInstanceTypes <em>Instance Types</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.BasicModelImpl#getNestedThreads <em>Nested Threads</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.BasicModelImpl#getForkedThreads <em>Forked Threads</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicModelImpl extends InterruptableThreadImpl implements BasicModel {
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
	 * The cached value of the '{@link #getNestedThreads() <em>Nested Threads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedThreads()
	 * @generated
	 * @ordered
	 */
	protected EList<NestedThread> nestedThreads;

	/**
	 * The cached setting delegate for the '{@link #getForkedThreads() <em>Forked Threads</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedThreads()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FORKED_THREADS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)BasicModelPackage.Literals.BASIC_MODEL__FORKED_THREADS).getSettingDelegate();

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
		return BasicModelPackage.Literals.BASIC_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<SharedResource>(SharedResource.class, this, BasicModelPackage.BASIC_MODEL__RESOURCES);
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
			instances = new EObjectContainmentEList<Instance>(Instance.class, this, BasicModelPackage.BASIC_MODEL__INSTANCES);
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
			instanceTypes = new EObjectContainmentEList<InstanceType>(InstanceType.class, this, BasicModelPackage.BASIC_MODEL__INSTANCE_TYPES);
		}
		return instanceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NestedThread> getNestedThreads() {
		if (nestedThreads == null) {
			nestedThreads = new EObjectContainmentEList<NestedThread>(NestedThread.class, this, BasicModelPackage.BASIC_MODEL__NESTED_THREADS);
		}
		return nestedThreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ForkedThread> getForkedThreads() {
		return (EList<ForkedThread>)FORKED_THREADS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicModelPackage.BASIC_MODEL__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case BasicModelPackage.BASIC_MODEL__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case BasicModelPackage.BASIC_MODEL__INSTANCE_TYPES:
				return ((InternalEList<?>)getInstanceTypes()).basicRemove(otherEnd, msgs);
			case BasicModelPackage.BASIC_MODEL__NESTED_THREADS:
				return ((InternalEList<?>)getNestedThreads()).basicRemove(otherEnd, msgs);
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
			case BasicModelPackage.BASIC_MODEL__RESOURCES:
				return getResources();
			case BasicModelPackage.BASIC_MODEL__INSTANCES:
				return getInstances();
			case BasicModelPackage.BASIC_MODEL__INSTANCE_TYPES:
				return getInstanceTypes();
			case BasicModelPackage.BASIC_MODEL__NESTED_THREADS:
				return getNestedThreads();
			case BasicModelPackage.BASIC_MODEL__FORKED_THREADS:
				return getForkedThreads();
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
			case BasicModelPackage.BASIC_MODEL__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends SharedResource>)newValue);
				return;
			case BasicModelPackage.BASIC_MODEL__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends Instance>)newValue);
				return;
			case BasicModelPackage.BASIC_MODEL__INSTANCE_TYPES:
				getInstanceTypes().clear();
				getInstanceTypes().addAll((Collection<? extends InstanceType>)newValue);
				return;
			case BasicModelPackage.BASIC_MODEL__NESTED_THREADS:
				getNestedThreads().clear();
				getNestedThreads().addAll((Collection<? extends NestedThread>)newValue);
				return;
			case BasicModelPackage.BASIC_MODEL__FORKED_THREADS:
				getForkedThreads().clear();
				getForkedThreads().addAll((Collection<? extends ForkedThread>)newValue);
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
			case BasicModelPackage.BASIC_MODEL__RESOURCES:
				getResources().clear();
				return;
			case BasicModelPackage.BASIC_MODEL__INSTANCES:
				getInstances().clear();
				return;
			case BasicModelPackage.BASIC_MODEL__INSTANCE_TYPES:
				getInstanceTypes().clear();
				return;
			case BasicModelPackage.BASIC_MODEL__NESTED_THREADS:
				getNestedThreads().clear();
				return;
			case BasicModelPackage.BASIC_MODEL__FORKED_THREADS:
				getForkedThreads().clear();
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
			case BasicModelPackage.BASIC_MODEL__RESOURCES:
				return resources != null && !resources.isEmpty();
			case BasicModelPackage.BASIC_MODEL__INSTANCES:
				return instances != null && !instances.isEmpty();
			case BasicModelPackage.BASIC_MODEL__INSTANCE_TYPES:
				return instanceTypes != null && !instanceTypes.isEmpty();
			case BasicModelPackage.BASIC_MODEL__NESTED_THREADS:
				return nestedThreads != null && !nestedThreads.isEmpty();
			case BasicModelPackage.BASIC_MODEL__FORKED_THREADS:
				return FORKED_THREADS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //BasicModelImpl
