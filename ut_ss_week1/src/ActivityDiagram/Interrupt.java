/**
 */
package ActivityDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.Interrupt#getInterruptedThread <em>Interrupted Thread</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getInterrupt()
 * @model
 * @generated
 */
public interface Interrupt extends LinearActivity {
	/**
	 * Returns the value of the '<em><b>Interrupted Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupted Thread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupted Thread</em>' reference.
	 * @see #setInterruptedThread(ActivityDiagram.Thread)
	 * @see ActivityDiagram.ActivityDiagramPackage#getInterrupt_InterruptedThread()
	 * @model required="true"
	 * @generated
	 */
	ActivityDiagram.Thread getInterruptedThread();

	/**
	 * Sets the value of the '{@link ActivityDiagram.Interrupt#getInterruptedThread <em>Interrupted Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupted Thread</em>' reference.
	 * @see #getInterruptedThread()
	 * @generated
	 */
	void setInterruptedThread(ActivityDiagram.Thread value);

} // Interrupt
