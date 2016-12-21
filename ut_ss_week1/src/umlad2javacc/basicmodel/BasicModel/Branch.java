/**
 */
package umlad2javacc.basicmodel.BasicModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Branch#getNextActivity <em>Next Activity</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Branch#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getBranch()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidBranchCondition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidBranchCondition='true'"
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Activity</em>' reference.
	 * @see #setNextActivity(Activity)
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getBranch_NextActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getNextActivity();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.Branch#getNextActivity <em>Next Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Activity</em>' reference.
	 * @see #getNextActivity()
	 * @generated
	 */
	void setNextActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getBranch_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.Branch#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // Branch
