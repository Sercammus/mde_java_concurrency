/**
 */
package umlad2javacc.basicmodel.BasicModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import umlad2javacc.basicmodel.BasicModel.Activity;
import umlad2javacc.basicmodel.BasicModel.BasicModelPackage;
import umlad2javacc.basicmodel.BasicModel.NamedActivity;
import umlad2javacc.basicmodel.BasicModel.SharedResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.NamedActivityImpl#getActivityName <em>Activity Name</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.NamedActivityImpl#getSharedResources <em>Shared Resources</em>}</li>
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
	 * The cached value of the '{@link #getSharedResources() <em>Shared Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedResource> sharedResources;

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
	public EList<SharedResource> getSharedResources() {
		if (sharedResources == null) {
			sharedResources = new EObjectResolvingEList<SharedResource>(SharedResource.class, this, BasicModelPackage.NAMED_ACTIVITY__SHARED_RESOURCES);
		}
		return sharedResources;
	}

	/**
	 * The cached invocation delegate for the '{@link #IsSameReference(umlad2javacc.basicmodel.BasicModel.NamedActivity) <em>Is Same Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IsSameReference(umlad2javacc.basicmodel.BasicModel.NamedActivity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SAME_REFERENCE_NAMED_ACTIVITY__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.NAMED_ACTIVITY___IS_SAME_REFERENCE__NAMEDACTIVITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsSameReference(NamedActivity other) {
		try {
			return (Boolean)IS_SAME_REFERENCE_NAMED_ACTIVITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{other}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #GetMethodCreator() <em>Get Method Creator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GetMethodCreator()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_METHOD_CREATOR__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.NAMED_ACTIVITY___GET_METHOD_CREATOR).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity GetMethodCreator() {
		try {
			return (Activity)GET_METHOD_CREATOR__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case BasicModelPackage.NAMED_ACTIVITY__ACTIVITY_NAME:
				return getActivityName();
			case BasicModelPackage.NAMED_ACTIVITY__SHARED_RESOURCES:
				return getSharedResources();
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
			case BasicModelPackage.NAMED_ACTIVITY__ACTIVITY_NAME:
				setActivityName((String)newValue);
				return;
			case BasicModelPackage.NAMED_ACTIVITY__SHARED_RESOURCES:
				getSharedResources().clear();
				getSharedResources().addAll((Collection<? extends SharedResource>)newValue);
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
			case BasicModelPackage.NAMED_ACTIVITY__SHARED_RESOURCES:
				getSharedResources().clear();
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
			case BasicModelPackage.NAMED_ACTIVITY__SHARED_RESOURCES:
				return sharedResources != null && !sharedResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicModelPackage.NAMED_ACTIVITY___IS_SAME_REFERENCE__NAMEDACTIVITY:
				return IsSameReference((NamedActivity)arguments.get(0));
			case BasicModelPackage.NAMED_ACTIVITY___GET_METHOD_CREATOR:
				return GetMethodCreator();
		}
		return super.eInvoke(operationID, arguments);
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
