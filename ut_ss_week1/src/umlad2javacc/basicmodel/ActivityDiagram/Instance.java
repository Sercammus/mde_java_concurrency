/**
 */
package umlad2javacc.basicmodel.ActivityDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.Instance#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends Reference {
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
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getInstance_InstanceType()
	 * @model required="true"
	 * @generated
	 */
	InstanceType getInstanceType();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.ActivityDiagram.Instance#getInstanceType <em>Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' reference.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(InstanceType value);

} // Instance
