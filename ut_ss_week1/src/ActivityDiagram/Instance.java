/**
 */
package ActivityDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.Instance#getName <em>Name</em>}</li>
 *   <li>{@link ActivityDiagram.Instance#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProperInstanceName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProperInstanceName='name.matches(\'[A-Za-z_$][A-Za-z0-9_$]*\')'"
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ActivityDiagram.ActivityDiagramPackage#getInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ActivityDiagram.Instance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' reference.
	 * @see #setInstanceType(InstanceType)
	 * @see ActivityDiagram.ActivityDiagramPackage#getInstance_InstanceType()
	 * @model required="true"
	 * @generated
	 */
	InstanceType getInstanceType();

	/**
	 * Sets the value of the '{@link ActivityDiagram.Instance#getInstanceType <em>Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' reference.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(InstanceType value);

} // Instance
