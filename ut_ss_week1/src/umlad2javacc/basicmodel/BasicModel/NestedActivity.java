/**
 */
package umlad2javacc.basicmodel.BasicModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.NestedActivity#getNestedThread <em>Nested Thread</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getNestedActivity()
 * @model
 * @generated
 */
public interface NestedActivity extends NamedActivity {
	/**
	 * Returns the value of the '<em><b>Nested Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Thread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Thread</em>' reference.
	 * @see #setNestedThread(NestedThread)
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getNestedActivity_NestedThread()
	 * @model required="true"
	 * @generated
	 */
	NestedThread getNestedThread();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.NestedActivity#getNestedThread <em>Nested Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Thread</em>' reference.
	 * @see #getNestedThread()
	 * @generated
	 */
	void setNestedThread(NestedThread value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" soFarMany="true" soFarOrdered="false"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if soFar->exists(e | e = self) -- Activity has already been checked\n\t\t\t          then soFar\n\t\t\t          else let sf: Set(Activity) = soFar->including(self) in\n\t\t\t               let internalActivities: Set(Activity) = nestedThread.startActivity.GetReachableActivities(sf) in -- Check internal activities\n\t\t\t                   nextActivity.GetReachableActivities(internalActivities) -- Check successor\n\t\t\t          endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> GetReachableActivities(EList<Activity> soFar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" soFarMany="true" soFarOrdered="false"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='nestedThread.startActivity.GetAccessedReferences(soFar, beenHere->including(self))'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Reference> GetAccessedReferences(EList<Reference> soFar, EList<Activity> beenHere);

} // NestedActivity
