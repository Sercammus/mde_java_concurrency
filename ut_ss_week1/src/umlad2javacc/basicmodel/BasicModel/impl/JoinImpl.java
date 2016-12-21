/**
 */
package umlad2javacc.basicmodel.BasicModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import umlad2javacc.basicmodel.BasicModel.Activity;
import umlad2javacc.basicmodel.BasicModel.BasicModelPackage;
import umlad2javacc.basicmodel.BasicModel.Join;
import umlad2javacc.basicmodel.BasicModel.LinearActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JoinImpl extends LinearActivityImpl implements Join {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicModelPackage.Literals.JOIN;
	}

	/**
	 * The cached invocation delegate for the '{@link #SearchForJoin(java.math.BigInteger, org.eclipse.emf.common.util.EList) <em>Search For Join</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SearchForJoin(java.math.BigInteger, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SEARCH_FOR_JOIN_BIG_INTEGER_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.JOIN___SEARCH_FOR_JOIN__BIGINTEGER_ELIST).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate GET_ACTIVITIES_BY_STATE_ID_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.JOIN___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST).getInvocationDelegate();

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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Activity.class) {
			switch (baseOperationID) {
				case BasicModelPackage.ACTIVITY___SEARCH_FOR_JOIN__BIGINTEGER_ELIST: return BasicModelPackage.JOIN___SEARCH_FOR_JOIN__BIGINTEGER_ELIST;
				case BasicModelPackage.ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST: return BasicModelPackage.JOIN___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == LinearActivity.class) {
			switch (baseOperationID) {
				case BasicModelPackage.LINEAR_ACTIVITY___SEARCH_FOR_JOIN__BIGINTEGER_ELIST: return BasicModelPackage.JOIN___SEARCH_FOR_JOIN__BIGINTEGER_ELIST;
				case BasicModelPackage.LINEAR_ACTIVITY___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST: return BasicModelPackage.JOIN___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST;
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
			case BasicModelPackage.JOIN___SEARCH_FOR_JOIN__BIGINTEGER_ELIST:
				return SearchForJoin((BigInteger)arguments.get(0), (EList<Activity>)arguments.get(1));
			case BasicModelPackage.JOIN___GET_ACTIVITIES_BY_STATE_ID__ELIST_ELIST:
				return GetActivitiesByStateId((EList<Activity>)arguments.get(0), (EList<Activity>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //JoinImpl
