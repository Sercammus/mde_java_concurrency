/**
 */
package umlad2javacc.basicmodel.BasicModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlad2javacc.basicmodel.BasicModel.Activity;
import umlad2javacc.basicmodel.BasicModel.BasicModelPackage;
import umlad2javacc.basicmodel.BasicModel.Fork;
import umlad2javacc.basicmodel.BasicModel.ForkedThread;
import umlad2javacc.basicmodel.BasicModel.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.ForkImpl#getMaxThreadCount <em>Max Thread Count</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.ForkImpl#getForkedThreads <em>Forked Threads</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.impl.ForkImpl#getCorrespondingJoin <em>Corresponding Join</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkImpl extends ActivityImpl implements Fork {
	/**
	 * The default value of the '{@link #getMaxThreadCount() <em>Max Thread Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreadCount()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_THREAD_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxThreadCount() <em>Max Thread Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreadCount()
	 * @generated
	 * @ordered
	 */
	protected int maxThreadCount = MAX_THREAD_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForkedThreads() <em>Forked Threads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedThreads()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedThread> forkedThreads;

	/**
	 * The cached setting delegate for the '{@link #getCorrespondingJoin() <em>Corresponding Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingJoin()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CORRESPONDING_JOIN__ESETTING_DELEGATE = ((EStructuralFeature.Internal)BasicModelPackage.Literals.FORK__CORRESPONDING_JOIN).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicModelPackage.Literals.FORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxThreadCount() {
		return maxThreadCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxThreadCount(int newMaxThreadCount) {
		int oldMaxThreadCount = maxThreadCount;
		maxThreadCount = newMaxThreadCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicModelPackage.FORK__MAX_THREAD_COUNT, oldMaxThreadCount, maxThreadCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedThread> getForkedThreads() {
		if (forkedThreads == null) {
			forkedThreads = new EObjectContainmentEList<ForkedThread>(ForkedThread.class, this, BasicModelPackage.FORK__FORKED_THREADS);
		}
		return forkedThreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getCorrespondingJoin() {
		return (Activity)CORRESPONDING_JOIN__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetCorrespondingJoin() {
		return (Activity)CORRESPONDING_JOIN__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingJoin(Activity newCorrespondingJoin) {
		CORRESPONDING_JOIN__ESETTING_DELEGATE.dynamicSet(this, null, 0, newCorrespondingJoin);
	}

	/**
	 * The cached invocation delegate for the '{@link #GetReachableActivities(org.eclipse.emf.common.util.EList) <em>Get Reachable Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GetReachableActivities(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_REACHABLE_ACTIVITIES_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.FORK___GET_REACHABLE_ACTIVITIES__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Activity> GetReachableActivities(EList<Activity> soFar) {
		try {
			return (EList<Activity>)GET_REACHABLE_ACTIVITIES_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{soFar}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SUCCESSOR_REFERENCES_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.FORK___GET_SUCCESSOR_REFERENCES__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Reference> GetSuccessorReferences(EList<Reference> soFar, EList<Activity> beenHere) {
		try {
			return (EList<Reference>)GET_SUCCESSOR_REFERENCES_ELIST_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{soFar, beenHere}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #SearchForJoin(java.math.BigInteger, org.eclipse.emf.common.util.EList) <em>Search For Join</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SearchForJoin(java.math.BigInteger, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SEARCH_FOR_JOIN_BIG_INTEGER_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.FORK___SEARCH_FOR_JOIN__BIGINTEGER_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity SearchForJoin(BigInteger searchDepth, EList<Activity> beenHere) {
		try {
			return (Activity)SEARCH_FOR_JOIN_BIG_INTEGER_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{searchDepth, beenHere}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #GetActivitiesByStateId(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Activities By State Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GetActivitiesByStateId(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ACTIVITIES_BY_STATE_ID_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.FORK___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Activity> GetActivitiesByStateId(EList<Activity> soFar, EList<Activity> beenHere) {
		try {
			return (EList<Activity>)GET_ACTIVITIES_BY_STATE_ID_ELIST_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{soFar, beenHere}));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicModelPackage.FORK__FORKED_THREADS:
				return ((InternalEList<?>)getForkedThreads()).basicRemove(otherEnd, msgs);
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
			case BasicModelPackage.FORK__MAX_THREAD_COUNT:
				return getMaxThreadCount();
			case BasicModelPackage.FORK__FORKED_THREADS:
				return getForkedThreads();
			case BasicModelPackage.FORK__CORRESPONDING_JOIN:
				if (resolve) return getCorrespondingJoin();
				return basicGetCorrespondingJoin();
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
			case BasicModelPackage.FORK__MAX_THREAD_COUNT:
				setMaxThreadCount((Integer)newValue);
				return;
			case BasicModelPackage.FORK__FORKED_THREADS:
				getForkedThreads().clear();
				getForkedThreads().addAll((Collection<? extends ForkedThread>)newValue);
				return;
			case BasicModelPackage.FORK__CORRESPONDING_JOIN:
				setCorrespondingJoin((Activity)newValue);
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
			case BasicModelPackage.FORK__MAX_THREAD_COUNT:
				setMaxThreadCount(MAX_THREAD_COUNT_EDEFAULT);
				return;
			case BasicModelPackage.FORK__FORKED_THREADS:
				getForkedThreads().clear();
				return;
			case BasicModelPackage.FORK__CORRESPONDING_JOIN:
				setCorrespondingJoin((Activity)null);
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
			case BasicModelPackage.FORK__MAX_THREAD_COUNT:
				return maxThreadCount != MAX_THREAD_COUNT_EDEFAULT;
			case BasicModelPackage.FORK__FORKED_THREADS:
				return forkedThreads != null && !forkedThreads.isEmpty();
			case BasicModelPackage.FORK__CORRESPONDING_JOIN:
				return CORRESPONDING_JOIN__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Activity.class) {
			switch (baseOperationID) {
				case BasicModelPackage.ACTIVITY___SEARCH_FOR_JOIN__BIGINTEGER_ELIST: return BasicModelPackage.FORK___SEARCH_FOR_JOIN__BIGINTEGER_ELIST;
				case BasicModelPackage.ACTIVITY___GET_REACHABLE_ACTIVITIES__ELIST: return BasicModelPackage.FORK___GET_REACHABLE_ACTIVITIES__ELIST;
				case BasicModelPackage.ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST: return BasicModelPackage.FORK___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;
				case BasicModelPackage.ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST: return BasicModelPackage.FORK___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case BasicModelPackage.FORK___GET_REACHABLE_ACTIVITIES__ELIST:
				return GetReachableActivities((EList<Activity>)arguments.get(0));
			case BasicModelPackage.FORK___GET_SUCCESSOR_REFERENCES__ELIST_ELIST:
				return GetSuccessorReferences((EList<Reference>)arguments.get(0), (EList<Activity>)arguments.get(1));
			case BasicModelPackage.FORK___SEARCH_FOR_JOIN__BIGINTEGER_ELIST:
				return SearchForJoin((BigInteger)arguments.get(0), (EList<Activity>)arguments.get(1));
			case BasicModelPackage.FORK___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST:
				return GetActivitiesByStateId((EList<Activity>)arguments.get(0), (EList<Activity>)arguments.get(1));
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
		result.append(" (maxThreadCount: ");
		result.append(maxThreadCount);
		result.append(')');
		return result.toString();
	}

} //ForkImpl
