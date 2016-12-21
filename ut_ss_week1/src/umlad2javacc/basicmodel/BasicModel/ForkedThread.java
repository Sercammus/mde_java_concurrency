/**
 */
package umlad2javacc.basicmodel.BasicModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forked Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.ForkedThread#isDaemon <em>Daemon</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getForkedThread()
 * @model
 * @generated
 */
public interface ForkedThread extends InterruptableThread {
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
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getForkedThread_Daemon()
	 * @model
	 * @generated
	 */
	boolean isDaemon();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.ForkedThread#isDaemon <em>Daemon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daemon</em>' attribute.
	 * @see #isDaemon()
	 * @generated
	 */
	void setDaemon(boolean value);

} // ForkedThread
