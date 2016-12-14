/**
 */
package ActivityDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.NestedActivity#getStartActivity <em>Start Activity</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getNestedActivity()
 * @model
 * @generated
 */
public interface NestedActivity extends DescribedActivity {
	/**
	 * Returns the value of the '<em><b>Start Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Activity</em>' reference.
	 * @see #setStartActivity(Activity)
	 * @see ActivityDiagram.ActivityDiagramPackage#getNestedActivity_StartActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getStartActivity();

	/**
	 * Sets the value of the '{@link ActivityDiagram.NestedActivity#getStartActivity <em>Start Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Activity</em>' reference.
	 * @see #getStartActivity()
	 * @generated
	 */
	void setStartActivity(Activity value);

} // NestedActivity
