/**
 */
package umlad2javacc.basicmodel.BasicModel.impl;

import java.lang.reflect.InvocationTargetException;

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
	 * The cached invocation delegate for the '{@link #JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Joins Correctly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JoinsCorrectly(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate JOINS_CORRECTLY_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.JOIN___JOINS_CORRECTLY__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Activity> JoinsCorrectly(EList<umlad2javacc.basicmodel.BasicModel.Thread> threadStack, EList<Activity> beenHere) {
		try {
			return (EList<Activity>)JOINS_CORRECTLY_ELIST_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{threadStack, beenHere}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #SearchForJoin(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Search For Join</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SearchForJoin(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SEARCH_FOR_JOIN_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.JOIN___SEARCH_FOR_JOIN__ELIST_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity SearchForJoin(EList<umlad2javacc.basicmodel.BasicModel.Thread> threadStack, EList<Activity> beenHere) {
		try {
			return (Activity)SEARCH_FOR_JOIN_ELIST_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{threadStack, beenHere}));
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
				case BasicModelPackage.ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST: return BasicModelPackage.JOIN___JOINS_CORRECTLY__ELIST_ELIST;
				case BasicModelPackage.ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST: return BasicModelPackage.JOIN___SEARCH_FOR_JOIN__ELIST_ELIST;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == LinearActivity.class) {
			switch (baseOperationID) {
				case BasicModelPackage.LINEAR_ACTIVITY___JOINS_CORRECTLY__ELIST_ELIST: return BasicModelPackage.JOIN___JOINS_CORRECTLY__ELIST_ELIST;
				case BasicModelPackage.LINEAR_ACTIVITY___SEARCH_FOR_JOIN__ELIST_ELIST: return BasicModelPackage.JOIN___SEARCH_FOR_JOIN__ELIST_ELIST;
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
			case BasicModelPackage.JOIN___JOINS_CORRECTLY__ELIST_ELIST:
				return JoinsCorrectly((EList<umlad2javacc.basicmodel.BasicModel.Thread>)arguments.get(0), (EList<Activity>)arguments.get(1));
			case BasicModelPackage.JOIN___SEARCH_FOR_JOIN__ELIST_ELIST:
				return SearchForJoin((EList<umlad2javacc.basicmodel.BasicModel.Thread>)arguments.get(0), (EList<Activity>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //JoinImpl
