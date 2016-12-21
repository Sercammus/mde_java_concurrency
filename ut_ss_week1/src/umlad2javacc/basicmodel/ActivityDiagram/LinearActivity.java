/**
 */
package umlad2javacc.basicmodel.ActivityDiagram;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.LinearActivity#getNextActivity <em>Next Activity</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getLinearActivity()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ThreadIndependence'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ThreadIndependence='self.UsesSameThread(nextActivity)'"
 * @generated
 */
public interface LinearActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Next Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Activity</em>' reference.
	 * @see #setNextActivity(Activity)
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getLinearActivity_NextActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getNextActivity();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.ActivityDiagram.LinearActivity#getNextActivity <em>Next Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Activity</em>' reference.
	 * @see #getNextActivity()
	 * @generated
	 */
	void setNextActivity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" threadStackUnique="false" threadStackMany="true"
	 *        threadStackAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then beenHere\n\t\t\t      else nextActivity.JoinsCorrectly(threadStack, beenHere->including(self)) -- Check successor\n\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> JoinsCorrectly(EList<umlad2javacc.basicmodel.ActivityDiagram.Thread> threadStack, EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" soFarMany="true" soFarOrdered="false"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='nextActivity.GetAccessedReferences(soFar, beenHere->including(self))'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Reference> GetSuccessorReferences(EList<Reference> soFar, EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then -1\n\t\t\t\t      else if target = self -- Activity is the one we are looking for\n\t\t\t\t           then reachedId\n\t\t\t\t           else AssignStateId(target, reachedId + 1, beenHere->including(self))\n\t\t\t\t           endif\n\t\t\t\t      endif'"
	 * @generated
	 */
	BigInteger AssignStateId(Activity target, BigInteger reachedId, EList<Activity> beenHere);

} // LinearActivity
