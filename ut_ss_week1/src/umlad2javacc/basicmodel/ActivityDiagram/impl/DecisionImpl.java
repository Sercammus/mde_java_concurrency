/**
 */
package umlad2javacc.basicmodel.ActivityDiagram.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlad2javacc.basicmodel.ActivityDiagram.Activity;
import umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage;
import umlad2javacc.basicmodel.ActivityDiagram.Branch;
import umlad2javacc.basicmodel.ActivityDiagram.Decision;
import umlad2javacc.basicmodel.ActivityDiagram.LinearActivity;
import umlad2javacc.basicmodel.ActivityDiagram.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.impl.DecisionImpl#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionImpl extends LinearActivityImpl implements Decision {
	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<Branch> branches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicModelPackage.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Branch> getBranches() {
		if (branches == null) {
			branches = new EObjectContainmentEList<Branch>(Branch.class, this, BasicModelPackage.DECISION__BRANCHES);
		}
		return branches;
	}

	/**
	 * The cached invocation delegate for the '{@link #JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate JOINS_CORRECTLY_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.DECISION___JOINS_CORRECTLY__ELIST_ELIST).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate GET_SUCCESSOR_REFERENCES_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.DECISION___GET_SUCCESSOR_REFERENCES__ELIST_ELIST).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #AssignStateId(umlad2javacc.basicmodel.ActivityDiagram.Activity, java.math.BigInteger, org.eclipse.emf.common.util.EList) <em>Assign State Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AssignStateId(umlad2javacc.basicmodel.ActivityDiagram.Activity, java.math.BigInteger, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ASSIGN_STATE_ID_ACTIVITY_BIG_INTEGER_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.DECISION___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger AssignStateId(Activity target, BigInteger reachedId, EList<Activity> beenHere) {
		try {
			return (BigInteger)ASSIGN_STATE_ID_ACTIVITY_BIG_INTEGER_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(3, new Object[]{target, reachedId, beenHere}));
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
			case BasicModelPackage.DECISION__BRANCHES:
				return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
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
			case BasicModelPackage.DECISION__BRANCHES:
				return getBranches();
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
			case BasicModelPackage.DECISION__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection<? extends Branch>)newValue);
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
			case BasicModelPackage.DECISION__BRANCHES:
				getBranches().clear();
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
			case BasicModelPackage.DECISION__BRANCHES:
				return branches != null && !branches.isEmpty();
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
				case BasicModelPackage.ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST: return BasicModelPackage.DECISION___JOINS_CORRECTLY__ELIST_ELIST;
				case BasicModelPackage.ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST: return BasicModelPackage.DECISION___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;
				case BasicModelPackage.ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST: return BasicModelPackage.DECISION___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == LinearActivity.class) {
			switch (baseOperationID) {
				case BasicModelPackage.LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST: return BasicModelPackage.DECISION___JOINS_CORRECTLY__ELIST_ELIST;
				case BasicModelPackage.LINEAR_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST: return BasicModelPackage.DECISION___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;
				case BasicModelPackage.LINEAR_ACTIVITY___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST: return BasicModelPackage.DECISION___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST;
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
			case BasicModelPackage.DECISION___JOINS_CORRECTLY__ELIST_ELIST:
				return JoinsCorrectly((EList<umlad2javacc.basicmodel.ActivityDiagram.Thread>)arguments.get(0), (EList<Activity>)arguments.get(1));
			case BasicModelPackage.DECISION___GET_SUCCESSOR_REFERENCES__ELIST_ELIST:
				return GetSuccessorReferences((EList<Reference>)arguments.get(0), (EList<Activity>)arguments.get(1));
			case BasicModelPackage.DECISION___ASSIGN_STATE_ID__ACTIVITY_BIGINTEGER_ELIST:
				return AssignStateId((Activity)arguments.get(0), (BigInteger)arguments.get(1), (EList<Activity>)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DecisionImpl
