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
import umlad2javacc.basicmodel.BasicModel.LinearActivity;
import umlad2javacc.basicmodel.BasicModel.Reference;
import umlad2javacc.basicmodel.BasicModel.SimpleActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SimpleActivityImpl extends NamedActivityImpl implements SimpleActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicModelPackage.Literals.SIMPLE_ACTIVITY;
	}

	/**
	 * The cached invocation delegate for the '{@link #GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Successor References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GetSuccessorReferences(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SUCCESSOR_REFERENCES_ELIST_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)BasicModelPackage.Literals.SIMPLE_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST).getInvocationDelegate();

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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Activity.class) {
			switch (baseOperationID) {
				case BasicModelPackage.ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST: return BasicModelPackage.SIMPLE_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == LinearActivity.class) {
			switch (baseOperationID) {
				case BasicModelPackage.LINEAR_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST: return BasicModelPackage.SIMPLE_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST;
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
			case BasicModelPackage.SIMPLE_ACTIVITY___GET_SUCCESSOR_REFERENCES__ELIST_ELIST:
				return GetSuccessorReferences((EList<Reference>)arguments.get(0), (EList<Activity>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SimpleActivityImpl
