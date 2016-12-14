/**
 */
package ActivityDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.Fork#getThreads <em>Threads</em>}</li>
 *   <li>{@link ActivityDiagram.Fork#getThreadCount <em>Thread Count</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getFork()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonNegativeThreadCount ThreadIndependence'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NonNegativeThreadCount='threadCount >= 0' ThreadIndependence='threads->forAll(t | self.UsesDifferentThread(t.activity))'"
 * @generated
 */
public interface Fork extends Activity {
	/**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagram.Thread}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference list.
	 * @see ActivityDiagram.ActivityDiagramPackage#getFork_Threads()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActivityDiagram.Thread> getThreads();

	/**
	 * Returns the value of the '<em><b>Thread Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Count</em>' attribute.
	 * @see #setThreadCount(int)
	 * @see ActivityDiagram.ActivityDiagramPackage#getFork_ThreadCount()
	 * @model
	 * @generated
	 */
	int getThreadCount();

	/**
	 * Sets the value of the '{@link ActivityDiagram.Fork#getThreadCount <em>Thread Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Count</em>' attribute.
	 * @see #getThreadCount()
	 * @generated
	 */
	void setThreadCount(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='JoinsCorrectly(Sequence{self}, Set{})'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> JoinsCorrectly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" forkUnique="false" forkMany="true"
	 *        forkAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Fork has already been checked\n\t\t\t      then beenHere\n\t\t\t      else threads->iterate(t; result: Set(Activity) = Set{} | result->union(t.activity.JoinsCorrectly(fork->append(self), beenHere->including(self))))\n\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> JoinsCorrectly(EList<Fork> fork, EList<Activity> beenHere);

} // Fork
