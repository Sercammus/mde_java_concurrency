/**
 */
package ActivityDiagram.impl;

import ActivityDiagram.Activity;
import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.Fork;
import ActivityDiagram.Instance;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.impl.ActivityImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link ActivityDiagram.impl.ActivityImpl#getThread <em>Thread</em>}</li>
 *   <li>{@link ActivityDiagram.impl.ActivityImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected Instance instance;

	/**
	 * The cached value of the '{@link #getThread() <em>Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread()
	 * @generated
	 * @ordered
	 */
	protected ActivityDiagram.Thread thread;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityDiagramPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = (Instance)eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityDiagramPackage.ACTIVITY__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(Instance newInstance) {
		Instance oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramPackage.ACTIVITY__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagram.Thread getThread() {
		if (thread != null && thread.eIsProxy()) {
			InternalEObject oldThread = (InternalEObject)thread;
			thread = (ActivityDiagram.Thread)eResolveProxy(oldThread);
			if (thread != oldThread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityDiagramPackage.ACTIVITY__THREAD, oldThread, thread));
			}
		}
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagram.Thread basicGetThread() {
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThread(ActivityDiagram.Thread newThread) {
		ActivityDiagram.Thread oldThread = thread;
		thread = newThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramPackage.ACTIVITY__THREAD, oldThread, thread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * The cached invocation delegate for the '{@link #JoinsCorrectly() <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JoinsCorrectly()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate JOINS_CORRECTLY__EINVOCATION_DELEGATE = ((EOperation.Internal)ActivityDiagramPackage.Literals.ACTIVITY___JOINS_CORRECTLY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Activity> JoinsCorrectly() {
		try {
			return (EList<Activity>)JOINS_CORRECTLY__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public EList<Activity> JoinsCorrectly(EList<Fork> fork, EList<Activity> beenHere) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #UsesDifferentThread(ActivityDiagram.Activity) <em>Uses Different Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UsesDifferentThread(ActivityDiagram.Activity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate USES_DIFFERENT_THREAD_ACTIVITY__EINVOCATION_DELEGATE = ((EOperation.Internal)ActivityDiagramPackage.Literals.ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UsesDifferentThread(Activity a) {
		try {
			return (Boolean)USES_DIFFERENT_THREAD_ACTIVITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{a}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #UsesSameThread(ActivityDiagram.Activity) <em>Uses Same Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UsesSameThread(ActivityDiagram.Activity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate USES_SAME_THREAD_ACTIVITY__EINVOCATION_DELEGATE = ((EOperation.Internal)ActivityDiagramPackage.Literals.ACTIVITY___USES_SAME_THREAD__ACTIVITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UsesSameThread(Activity a) {
		try {
			return (Boolean)USES_SAME_THREAD_ACTIVITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{a}));
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
			case ActivityDiagramPackage.ACTIVITY__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
			case ActivityDiagramPackage.ACTIVITY__THREAD:
				if (resolve) return getThread();
				return basicGetThread();
			case ActivityDiagramPackage.ACTIVITY__NAME:
				return getName();
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
			case ActivityDiagramPackage.ACTIVITY__INSTANCE:
				setInstance((Instance)newValue);
				return;
			case ActivityDiagramPackage.ACTIVITY__THREAD:
				setThread((ActivityDiagram.Thread)newValue);
				return;
			case ActivityDiagramPackage.ACTIVITY__NAME:
				setName((String)newValue);
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
			case ActivityDiagramPackage.ACTIVITY__INSTANCE:
				setInstance((Instance)null);
				return;
			case ActivityDiagramPackage.ACTIVITY__THREAD:
				setThread((ActivityDiagram.Thread)null);
				return;
			case ActivityDiagramPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
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
			case ActivityDiagramPackage.ACTIVITY__INSTANCE:
				return instance != null;
			case ActivityDiagramPackage.ACTIVITY__THREAD:
				return thread != null;
			case ActivityDiagramPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
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
			case ActivityDiagramPackage.ACTIVITY___JOINS_CORRECTLY:
				return JoinsCorrectly();
			case ActivityDiagramPackage.ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST:
				return JoinsCorrectly((EList<Fork>)arguments.get(0), (EList<Activity>)arguments.get(1));
			case ActivityDiagramPackage.ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY:
				return UsesDifferentThread((Activity)arguments.get(0));
			case ActivityDiagramPackage.ACTIVITY___USES_SAME_THREAD__ACTIVITY:
				return UsesSameThread((Activity)arguments.get(0));
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
