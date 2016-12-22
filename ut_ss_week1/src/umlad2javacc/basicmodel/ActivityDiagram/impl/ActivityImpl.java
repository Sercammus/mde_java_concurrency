/**
 */
package umlad2javacc.basicmodel.ActivityDiagram.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import umlad2javacc.basicmodel.ActivityDiagram.Activity;
import umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage;
import umlad2javacc.basicmodel.ActivityDiagram.Instance;
import umlad2javacc.basicmodel.ActivityDiagram.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ActivityImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ActivityImpl#getStateId <em>State Id</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ActivityImpl#getRootActivity <em>Root Activity</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ActivityImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ActivityImpl#getThread <em>Thread</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ActivityImpl#getAccessedReferences <em>Accessed References</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
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
	 * The cached setting delegate for the '{@link #getPredecessor() <em>Predecessor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PREDECESSOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)BasicModelPackage.Literals.ACTIVITY__PREDECESSOR).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getStateId() <em>State Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateId()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate STATE_ID__ESETTING_DELEGATE = ((EStructuralFeature.Internal)BasicModelPackage.Literals.ACTIVITY__STATE_ID).getSettingDelegate();

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
	 * The cached setting delegate for the '{@link #getThread() <em>Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate THREAD__ESETTING_DELEGATE = ((EStructuralFeature.Internal)BasicModelPackage.Literals.ACTIVITY__THREAD).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAccessedReferences() <em>Accessed References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessedReferences()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ACCESSED_REFERENCES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)BasicModelPackage.Literals.ACTIVITY__ACCESSED_REFERENCES).getSettingDelegate();

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
		return BasicModelPackage.Literals.ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicModelPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Activity> getPredecessor() {
		return (EList<Activity>)PREDECESSOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStateId() {
		return (BigInteger)STATE_ID__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateId(BigInteger newStateId) {
		STATE_ID__ESETTING_DELEGATE.dynamicSet(this, null, 0, newStateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getRootActivity() {
		Activity rootActivity = basicGetRootActivity();
		return rootActivity != null && rootActivity.eIsProxy() ? (Activity)eResolveProxy((InternalEObject)rootActivity) : rootActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetRootActivity() {
		// TODO: implement this method to return the 'Root Activity' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootActivity(Activity newRootActivity) {
		// TODO: implement this method to set the 'Root Activity' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicModelPackage.ACTIVITY__INSTANCE, oldInstance, instance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicModelPackage.ACTIVITY__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlad2javacc.basicmodel.ActivityDiagram.Thread getThread() {
		return (umlad2javacc.basicmodel.ActivityDiagram.Thread)THREAD__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlad2javacc.basicmodel.ActivityDiagram.Thread basicGetThread() {
		return (umlad2javacc.basicmodel.ActivityDiagram.Thread)THREAD__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThread(umlad2javacc.basicmodel.ActivityDiagram.Thread newThread) {
		THREAD__ESETTING_DELEGATE.dynamicSet(this, null, 0, newThread);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Reference> getAccessedReferences() {
		return (EList<Reference>)ACCESSED_REFERENCES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> JoinsCorrectly(EList<umlad2javacc.basicmodel.ActivityDiagram.Thread> threadStack, EList<Activity> beenHere) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #UsesDifferentThread(umlad2javacc.basicmodel.ActivityDiagram.Activity) <em>Uses Different Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UsesDifferentThread(umlad2javacc.basicmodel.ActivityDiagram.Activity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate USES_DIFFERENT_THREAD_ACTIVITY__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #UsesSameThread(umlad2javacc.basicmodel.ActivityDiagram.Activity) <em>Uses Same Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UsesSameThread(umlad2javacc.basicmodel.ActivityDiagram.Activity)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate USES_SAME_THREAD_ACTIVITY__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.ACTIVITY___USES_SAME_THREAD__ACTIVITY).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Accessed References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GetAccessedReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ACCESSED_REFERENCES_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Reference> GetAccessedReferences(EList<Reference> soFar, EList<Activity> beenHere) {
		try {
			return (EList<Reference>)GET_ACCESSED_REFERENCES_ELIST_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{soFar, beenHere}));
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
	public EList<Reference> GetSuccessorReferences(EList<Reference> soFar, EList<Activity> beenHere) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #GetPredecessors(org.eclipse.emf.common.util.EList) <em>Get Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GetPredecessors(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_PREDECESSORS_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.ACTIVITY___GET_PREDECESSORS__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Activity> GetPredecessors(EList<Activity> beenHere) {
		try {
			return (EList<Activity>)GET_PREDECESSORS_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{beenHere}));
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
	public BigInteger AssignStateId(Activity target, BigInteger reachedId, EList<Activity> beenHere) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicModelPackage.ACTIVITY__NAME:
				return getName();
			case BasicModelPackage.ACTIVITY__PREDECESSOR:
				return getPredecessor();
			case BasicModelPackage.ACTIVITY__STATE_ID:
				return getStateId();
			case BasicModelPackage.ACTIVITY__ROOT_ACTIVITY:
				if (resolve) return getRootActivity();
				return basicGetRootActivity();
			case BasicModelPackage.ACTIVITY__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
			case BasicModelPackage.ACTIVITY__THREAD:
				if (resolve) return getThread();
				return basicGetThread();
			case BasicModelPackage.ACTIVITY__ACCESSED_REFERENCES:
				return getAccessedReferences();
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
			case BasicModelPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case BasicModelPackage.ACTIVITY__PREDECESSOR:
				getPredecessor().clear();
				getPredecessor().addAll((Collection<? extends Activity>)newValue);
				return;
			case BasicModelPackage.ACTIVITY__STATE_ID:
				setStateId((BigInteger)newValue);
				return;
			case BasicModelPackage.ACTIVITY__ROOT_ACTIVITY:
				setRootActivity((Activity)newValue);
				return;
			case BasicModelPackage.ACTIVITY__INSTANCE:
				setInstance((Instance)newValue);
				return;
			case BasicModelPackage.ACTIVITY__THREAD:
				setThread((umlad2javacc.basicmodel.ActivityDiagram.Thread)newValue);
				return;
			case BasicModelPackage.ACTIVITY__ACCESSED_REFERENCES:
				getAccessedReferences().clear();
				getAccessedReferences().addAll((Collection<? extends Reference>)newValue);
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
			case BasicModelPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BasicModelPackage.ACTIVITY__PREDECESSOR:
				getPredecessor().clear();
				return;
			case BasicModelPackage.ACTIVITY__STATE_ID:
				STATE_ID__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case BasicModelPackage.ACTIVITY__ROOT_ACTIVITY:
				setRootActivity((Activity)null);
				return;
			case BasicModelPackage.ACTIVITY__INSTANCE:
				setInstance((Instance)null);
				return;
			case BasicModelPackage.ACTIVITY__THREAD:
				setThread((umlad2javacc.basicmodel.ActivityDiagram.Thread)null);
				return;
			case BasicModelPackage.ACTIVITY__ACCESSED_REFERENCES:
				getAccessedReferences().clear();
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
			case BasicModelPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BasicModelPackage.ACTIVITY__PREDECESSOR:
				return PREDECESSOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case BasicModelPackage.ACTIVITY__STATE_ID:
				return STATE_ID__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case BasicModelPackage.ACTIVITY__ROOT_ACTIVITY:
				return basicGetRootActivity() != null;
			case BasicModelPackage.ACTIVITY__INSTANCE:
				return instance != null;
			case BasicModelPackage.ACTIVITY__THREAD:
				return THREAD__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case BasicModelPackage.ACTIVITY__ACCESSED_REFERENCES:
				return ACCESSED_REFERENCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case BasicModelPackage.ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST:
				return JoinsCorrectly((EList<umlad2javacc.basicmodel.ActivityDiagram.Thread>)arguments.get(0), (EList<Activity>)arguments.get(1));
			case BasicModelPackage.ACTIVITY___USES_DIFFERENT_THREAD__ACTIVITY:
				return UsesDifferentThread((Activity)arguments.get(0));
			case BasicModelPackage.ACTIVITY___USES_SAME_THREAD__ACTIVITY:
				return UsesSameThread((Activity)arguments.get(0));
			case BasicModelPackage.ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST:
				return GetAccessedReferences((EList<Reference>)arguments.get(0), (EList<Activity>)arguments.get(1));
			case BasicModelPackage.ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST:
				return GetSuccessorReferences((EList<Reference>)arguments.get(0), (EList<Activity>)arguments.get(1));
			case BasicModelPackage.ACTIVITY___GET_PREDECESSORS__ELIST:
				return GetPredecessors((EList<Activity>)arguments.get(0));
			case BasicModelPackage.ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST:
				return AssignStateId((Activity)arguments.get(0), (BigInteger)arguments.get(1), (EList<Activity>)arguments.get(2));
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