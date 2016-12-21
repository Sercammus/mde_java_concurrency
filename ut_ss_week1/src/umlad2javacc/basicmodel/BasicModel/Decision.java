/**
 */
package umlad2javacc.basicmodel.BasicModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Decision#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getDecision()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ThreadIndependence'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ThreadIndependence='branches->forAll(b | self.UsesSameThread(b.nextActivity))'"
 * @generated
 */
public interface Decision extends LinearActivity {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.BasicModel.Branch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getDecision_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" threadStackUnique="false" threadStackMany="true"
	 *        threadStackAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then beenHere\n\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t               nextActivity.JoinsCorrectly(threadStack, bh)->union(branches->iterate(b; result: Set(Activity) = Set{} | result->union(b.nextActivity.JoinsCorrectly(threadStack, bh)))) -- Check all branches\n\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> JoinsCorrectly(EList<umlad2javacc.basicmodel.BasicModel.Thread> threadStack, EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" soFarMany="true" soFarOrdered="false"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t      let elseResult: Set(Reference) = nextActivity.GetAccessedReferences(soFar, beenHere->including(self)) in\n\t\t\t      let branchesResult: Set(Reference) = branches->iterate(b; result: Set(Reference) = Set{} | result->union(b.nextActivity.GetAccessedReferences(soFar, bh))) in\n\t\t\t          elseResult->union(branchesResult)'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Reference> GetSuccessorReferences(EList<Reference> soFar, EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model soFarMany="true"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then soFar\n\t\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t\t           let temp: OrderedSet(Activity) = branches->iterate(e; result: OrderedSet(Activity) = soFar->append(self) | e.nextActivity.GetActivitiesByStateId(result, bh)) in\n\t\t\t\t               nextActivity.GetActivitiesByStateId(temp, bh)\n\t\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> GetActivitiesByStateId(EList<Activity> soFar, EList<Activity> beenHere);

} // Decision
