/**
 */
package ActivityDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.NamedActivity#getActivityName <em>Activity Name</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getNamedActivity()
 * @model abstract="true"
 * @generated
 */
public interface NamedActivity extends LinearActivity {
	/**
	 * Returns the value of the '<em><b>Activity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Name</em>' attribute.
	 * @see #setActivityName(String)
	 * @see ActivityDiagram.ActivityDiagramPackage#getNamedActivity_ActivityName()
	 * @model
	 * @generated
	 */
	String getActivityName();

	/**
	 * Sets the value of the '{@link ActivityDiagram.NamedActivity#getActivityName <em>Activity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Name</em>' attribute.
	 * @see #getActivityName()
	 * @generated
	 */
	void setActivityName(String value);

} // NamedActivity
