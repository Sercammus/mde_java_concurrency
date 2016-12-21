/**
 */
package umlad2javacc.basicmodel.BasicModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends LinearActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" threadStackUnique="false" threadStackMany="true"
	 *        threadStackAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then beenHere\n\t\t\t      else let newThreadStack: Sequence(Thread) = threadStack->subSequence(1, threadStack->size() - 1) in\n\t\t\t               if newThreadStack->last() = thread -- This join completes the most recent fork\n\t\t\t               then nextActivity.JoinsCorrectly(newThreadStack, beenHere->including(self)) -- Check successor\n\t\t\t               else Set{}\n\t\t\t               endif\n\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> JoinsCorrectly(EList<umlad2javacc.basicmodel.BasicModel.Thread> threadStack, EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadStackUnique="false" threadStackMany="true"
	 *        threadStackAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then null\n\t\t\t\t      else let ts: Sequence(Thread) = threadStack->subSequence(1, threadStack->size() - 1) in\n\t\t\t\t               if ts->isEmpty()\n\t\t\t\t               then self\n\t\t\t\t               else nextActivity.SearchForJoin(ts, beenHere->including(self))\n\t\t\t\t               endif\n\t\t\t\t      endif'"
	 * @generated
	 */
	Activity SearchForJoin(EList<umlad2javacc.basicmodel.BasicModel.Thread> threadStack, EList<Activity> beenHere);

} // Join
