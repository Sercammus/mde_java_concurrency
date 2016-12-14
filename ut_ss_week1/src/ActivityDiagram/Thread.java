/**
 */
package ActivityDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.Thread#isDaemon <em>Daemon</em>}</li>
 *   <li>{@link ActivityDiagram.Thread#getActivity <em>Activity</em>}</li>
 *   <li>{@link ActivityDiagram.Thread#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getThread()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ThreadIndependence'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ThreadIndependence='activity.thread = self'"
 * @generated
 */
public interface Thread extends EObject {
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
	 * @see ActivityDiagram.ActivityDiagramPackage#getThread_Daemon()
	 * @model
	 * @generated
	 */
	boolean isDaemon();

	/**
	 * Sets the value of the '{@link ActivityDiagram.Thread#isDaemon <em>Daemon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daemon</em>' attribute.
	 * @see #isDaemon()
	 * @generated
	 */
	void setDaemon(boolean value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see ActivityDiagram.ActivityDiagramPackage#getThread_Activity()
	 * @model required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link ActivityDiagram.Thread#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

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
	 * @see ActivityDiagram.ActivityDiagramPackage#getThread_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ActivityDiagram.Thread#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Thread
