/**
 */
package ActivityDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.SharedResource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getSharedResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidSharedResourceName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidSharedResourceName='name.matches(\'[A-Za-z_$][A-Za-z0-9_$]*\')'"
 * @generated
 */
public interface SharedResource extends EObject {
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
	 * @see ActivityDiagram.ActivityDiagramPackage#getSharedResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ActivityDiagram.SharedResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SharedResource
