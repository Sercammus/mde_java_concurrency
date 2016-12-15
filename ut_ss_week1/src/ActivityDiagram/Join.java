/**
 */
package ActivityDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends LinearActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" forkUnique="false" forkMany="true"
	 *        forkAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then beenHere\n\t\t\t      else if fork->notEmpty() -- There have been forks in the past\n\t\t\t           then if fork->last().thread = thread -- This join completes the most recent fork\n\t\t\t                -- I would rather use subSequence(1, size()-1) here, but that results in an error for some reason \n\t\t\t                then nextActivity.JoinsCorrectly(fork->excluding(thread), beenHere->including(self)) -- Check successor\n\t\t\t                else Set{}\n\t\t\t                endif\n\t\t\t           else Set{}\n\t\t\t           endif\n\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> JoinsCorrectly(EList<Fork> fork, EList<Activity> beenHere);

} // Join
