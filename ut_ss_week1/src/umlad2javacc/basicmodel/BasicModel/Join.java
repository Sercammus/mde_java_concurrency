/**
 */
package umlad2javacc.basicmodel.BasicModel;

import java.math.BigInteger;
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
	 * @model beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then null\n\t\t\t\t      else if searchDepth <= 1\n\t\t\t               then self\n\t\t\t               else nextActivity.SearchForJoin(searchDepth - 1, beenHere->including(self))\n\t\t\t               endif\n\t\t\t\t      endif'"
	 * @generated
	 */
	Activity SearchForJoin(BigInteger searchDepth, EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model soFarMany="true"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then soFar\n\t\t\t\t      else nextActivity.GetActivitiesByStateId(soFar, beenHere->including(self)) \n\t\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> GetActivitiesByStateId(EList<Activity> soFar, EList<Activity> beenHere);

} // Join
