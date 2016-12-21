/**
 */
package umlad2javacc.basicmodel.ActivityDiagram.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlad2javacc.basicmodel.ActivityDiagram.Activity;
import umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage;
import umlad2javacc.basicmodel.ActivityDiagram.Fork;
import umlad2javacc.basicmodel.ActivityDiagram.ForkedThread;
import umlad2javacc.basicmodel.ActivityDiagram.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ForkImpl#getMaxThreadCount <em>Max Thread Count</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.impl.ForkImpl#getForkedThreads <em>Forked Threads</em>}</li>
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
	 * The cached invocation delegate for the '{@link #JoinsCorrectly() <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JoinsCorrectly()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate JOINS_CORRECTLY__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.FORK___JOINS_CORRECTLY).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate JOINS_CORRECTLY_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.FORK___JOINS_CORRECTLY__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Activity> JoinsCorrectly(EList<umlad2javacc.basicmodel.ActivityDiagram.Thread> threadStack, EList<Activity> beenHere) {
		try {
			return (EList<Activity>)JOINS_CORRECTLY_ELIST_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{threadStack, beenHere}));
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
			case BasicModelPackage.FORK___JOINS_CORRECTLY:
				return JoinsCorrectly();
			case BasicModelPackage.FORK___JOINS_CORRECTLY__ELIST_ELIST:
				return JoinsCorrectly((EList<umlad2javacc.basicmodel.ActivityDiagram.Thread>)arguments.get(0), (EList<Activity>)arguments.get(1));
			case BasicModelPackage.FORK___GET_SUCCESSOR_REFERENCES__ELIST_ELIST:
				return GetSuccessorReferences((EList<Reference>)arguments.get(0), (EList<Activity>)arguments.get(1));
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
