/**
 */
package umlad2javacc.basicmodel.ActivityDiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage;
import umlad2javacc.basicmodel.ActivityDiagram.Instance;
import umlad2javacc.basicmodel.ActivityDiagram.InstanceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.impl.InstanceImpl#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends ReferenceImpl implements Instance {
	/**
	 * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected InstanceType instanceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicModelPackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceType getInstanceType() {
		if (instanceType != null && instanceType.eIsProxy()) {
			InternalEObject oldInstanceType = (InternalEObject)instanceType;
			instanceType = (InstanceType)eResolveProxy(oldInstanceType);
			if (instanceType != oldInstanceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicModelPackage.INSTANCE__INSTANCE_TYPE, oldInstanceType, instanceType));
			}
		}
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceType basicGetInstanceType() {
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(InstanceType newInstanceType) {
		InstanceType oldInstanceType = instanceType;
		instanceType = newInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicModelPackage.INSTANCE__INSTANCE_TYPE, oldInstanceType, instanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicModelPackage.INSTANCE__INSTANCE_TYPE:
				if (resolve) return getInstanceType();
				return basicGetInstanceType();
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
			case BasicModelPackage.INSTANCE__INSTANCE_TYPE:
				setInstanceType((InstanceType)newValue);
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
			case BasicModelPackage.INSTANCE__INSTANCE_TYPE:
				setInstanceType((InstanceType)null);
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
			case BasicModelPackage.INSTANCE__INSTANCE_TYPE:
				return instanceType != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceImpl
