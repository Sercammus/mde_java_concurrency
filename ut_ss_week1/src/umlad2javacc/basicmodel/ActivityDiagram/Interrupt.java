/**
 */
package umlad2javacc.basicmodel.ActivityDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.Interrupt#getInterruptedThread <em>Interrupted Thread</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getInterrupt()
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
	 * @see #setInterruptedThread(InterruptableThread)
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getInterrupt_InterruptedThread()
	 * @model required="true"
	 * @generated
	 */
	InterruptableThread getInterruptedThread();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.ActivityDiagram.Interrupt#getInterruptedThread <em>Interrupted Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupted Thread</em>' reference.
	 * @see #getInterruptedThread()
	 * @generated
	 */
	void setInterruptedThread(InterruptableThread value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" soFarMany="true" soFarOrdered="false"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='nextActivity.GetAccessedReferences(soFar->including(interruptedThread), beenHere->including(self))'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Reference> GetSuccessorReferences(EList<Reference> soFar, EList<Activity> beenHere);

} // Interrupt
