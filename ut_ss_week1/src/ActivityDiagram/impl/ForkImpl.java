/**
 */
package ActivityDiagram.impl;

import ActivityDiagram.Activity;
import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.Fork;
import ActivityDiagram.ForkedThread;
import ActivityDiagram.Reference;
import ActivityDiagram.SharedResource;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.impl.ForkImpl#getMaxThreadCount <em>Max Thread Count</em>}</li>
 *   <li>{@link ActivityDiagram.impl.ForkImpl#getForkedThreads <em>Forked Threads</em>}</li>
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
	 * The cached value of the '{@link #getForkedThreads() <em>Forked Threads</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkedThreads()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkedThread> forkedThreads;

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
		return ActivityDiagramPackage.Literals.FORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramPackage.FORK__MAX_THREAD_COUNT, oldMaxThreadCount, maxThreadCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkedThread> getForkedThreads() {
		if (forkedThreads == null) {
			forkedThreads = new EObjectResolvingEList<ForkedThread>(ForkedThread.class, this, ActivityDiagramPackage.FORK__FORKED_THREADS);
		}
		return forkedThreads;
	}

	/**
	 * The cached invocation delegate for the '{@link #JoinsCorrectly() <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JoinsCorrectly()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate JOINS_CORRECTLY__EINVOCATION_DELEGATE = ((EOperation.Internal)ActivityDiagramPackage.Literals.FORK___JOINS_CORRECTLY).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #JoinsCorrectly(org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JoinsCorrectly(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate JOINS_CORRECTLY_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)ActivityDiagramPackage.Literals.FORK___JOINS_CORRECTLY__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Activity> JoinsCorrectly(EList<Activity> beenHere) {
		try {
			return (EList<Activity>)JOINS_CORRECTLY_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{beenHere}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate JOINS_CORRECTLY_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)ActivityDiagramPackage.Literals.FORK___JOINS_CORRECTLY__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Activity> JoinsCorrectly(EList<Fork> fork, EList<Activity> beenHere) {
		try {
			return (EList<Activity>)JOINS_CORRECTLY_ELIST_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{fork, beenHere}));
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
	protected static final EOperation.Internal.InvocationDelegate GET_ACCESSED_REFERENCES_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)ActivityDiagramPackage.Literals.FORK___GET_ACCESSED_REFERENCES__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Reference> GetAccessedReferences(EList<SharedResource> soFar, EList<Activity> beenHere) {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityDiagramPackage.FORK__MAX_THREAD_COUNT:
				return getMaxThreadCount();
			case ActivityDiagramPackage.FORK__FORKED_THREADS:
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
			case ActivityDiagramPackage.FORK__MAX_THREAD_COUNT:
				setMaxThreadCount((Integer)newValue);
				return;
			case ActivityDiagramPackage.FORK__FORKED_THREADS:
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
			case ActivityDiagramPackage.FORK__MAX_THREAD_COUNT:
				setMaxThreadCount(MAX_THREAD_COUNT_EDEFAULT);
				return;
			case ActivityDiagramPackage.FORK__FORKED_THREADS:
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
			case ActivityDiagramPackage.FORK__MAX_THREAD_COUNT:
				return maxThreadCount != MAX_THREAD_COUNT_EDEFAULT;
			case ActivityDiagramPackage.FORK__FORKED_THREADS:
				return forkedThreads != null && !forkedThreads.isEmpty();
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
				case ActivityDiagramPackage.ACTIVITY___JOINS_CORRECTLY: return ActivityDiagramPackage.FORK___JOINS_CORRECTLY;
				case ActivityDiagramPackage.ACTIVITY___JOINS_CORRECTLY__ELIST: return ActivityDiagramPackage.FORK___JOINS_CORRECTLY__ELIST;
				case ActivityDiagramPackage.ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST: return ActivityDiagramPackage.FORK___JOINS_CORRECTLY__ELIST_ELIST;
				case ActivityDiagramPackage.ACTIVITY___GET_ACCESSED_REFERENCES__ELIST_ELIST: return ActivityDiagramPackage.FORK___GET_ACCESSED_REFERENCES__ELIST_ELIST;
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
			case ActivityDiagramPackage.FORK___JOINS_CORRECTLY:
				return JoinsCorrectly();
			case ActivityDiagramPackage.FORK___JOINS_CORRECTLY__ELIST:
				return JoinsCorrectly((EList<Activity>)arguments.get(0));
			case ActivityDiagramPackage.FORK___JOINS_CORRECTLY__ELIST_ELIST:
				return JoinsCorrectly((EList<Fork>)arguments.get(0), (EList<Activity>)arguments.get(1));
			case ActivityDiagramPackage.FORK___GET_ACCESSED_REFERENCES__ELIST_ELIST:
				return GetAccessedReferences((EList<SharedResource>)arguments.get(0), (EList<Activity>)arguments.get(1));
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
