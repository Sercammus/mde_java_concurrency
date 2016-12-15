/**
 */
package ActivityDiagram;

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
 *   <li>{@link ActivityDiagram.NestedActivity#getNestedThread <em>Nested Thread</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getNestedActivity()
 * @model
 * @generated
 */
public interface NestedActivity extends NamedActivity {
	/**
	 * Returns the value of the '<em><b>Nested Thread</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Thread</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Thread</em>' containment reference.
	 * @see #setNestedThread(ActivityDiagram.Thread)
	 * @see ActivityDiagram.ActivityDiagramPackage#getNestedActivity_NestedThread()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ActivityDiagram.Thread getNestedThread();

	/**
	 * Sets the value of the '{@link ActivityDiagram.NestedActivity#getNestedThread <em>Nested Thread</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Thread</em>' containment reference.
	 * @see #getNestedThread()
	 * @generated
	 */
	void setNestedThread(ActivityDiagram.Thread value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" forkUnique="false" forkMany="true"
	 *        forkAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then beenHere\n\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t           let internalActivities: Set(Activity) = nestedThread.startActivity.JoinsCorrectly(bh) in -- Check internal activities\n\t\t\t           let nextActivities: Set(Activity) = nextActivity.JoinsCorrectly(fork, bh) in -- Check successor\n\t\t\t               internalActivities->union(nextActivities)\n\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> JoinsCorrectly(EList<Fork> fork, EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" soFarMany="true" soFarOrdered="false"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then soFar\n\t\t\t      else nestedThread.startActivity.GetAccessedReferences(soFar, beenHere->including(self))\n\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Reference> GetAccessedReferences(EList<Reference> soFar, EList<Activity> beenHere);

} // NestedActivity
