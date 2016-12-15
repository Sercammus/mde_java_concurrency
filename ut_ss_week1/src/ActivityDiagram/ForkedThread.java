/**
 */
package ActivityDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forked Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.ForkedThread#isDaemon <em>Daemon</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getForkedThread()
 * @model
 * @generated
 */
public interface ForkedThread extends ActivityDiagram.Thread {
	/**
	 * Returns the value of the '<em><b>Daemon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daemon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daemon</em>' attribute.
	 * @see #setDaemon(boolean)
	 * @see ActivityDiagram.ActivityDiagramPackage#getForkedThread_Daemon()
	 * @model
	 * @generated
	 */
	boolean isDaemon();

	/**
	 * Sets the value of the '{@link ActivityDiagram.ForkedThread#isDaemon <em>Daemon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daemon</em>' attribute.
	 * @see #isDaemon()
	 * @generated
	 */
	void setDaemon(boolean value);

} // ForkedThread
