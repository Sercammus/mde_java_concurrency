/**
 */
package ActivityDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Described Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.DescribedActivity#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getDescribedActivity()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProperActivityDescription'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProperActivityDescription='description.matches(\'[A-Za-z_$][A-Za-z0-9_$]*\')'"
 * @generated
 */
public interface DescribedActivity extends LinearActivity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ActivityDiagram.ActivityDiagramPackage#getDescribedActivity_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ActivityDiagram.DescribedActivity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // DescribedActivity
