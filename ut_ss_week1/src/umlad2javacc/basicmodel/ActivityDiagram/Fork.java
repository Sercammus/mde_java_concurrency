/**
 */
package umlad2javacc.basicmodel.ActivityDiagram;

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
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.Fork#getMaxThreadCount <em>Max Thread Count</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.Fork#getForkedThreads <em>Forked Threads</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getFork()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonNegativeMaxThreadCount ThreadIndependence'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NonNegativeMaxThreadCount='maxThreadCount >= 0' ThreadIndependence='forkedThreads->forAll(t | self.UsesDifferentThread(t.startActivity))'"
 * @generated
 */
public interface Fork extends Activity {
	/**
	 * Returns the value of the '<em><b>Max Thread Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Thread Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Thread Count</em>' attribute.
	 * @see #setMaxThreadCount(int)
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getFork_MaxThreadCount()
	 * @model
	 * @generated
	 */
	int getMaxThreadCount();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.ActivityDiagram.Fork#getMaxThreadCount <em>Max Thread Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Thread Count</em>' attribute.
	 * @see #getMaxThreadCount()
	 * @generated
	 */
	void setMaxThreadCount(int value);

	/**
	 * Returns the value of the '<em><b>Forked Threads</b></em>' containment reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.ActivityDiagram.ForkedThread}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forked Threads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked Threads</em>' containment reference list.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getFork_ForkedThreads()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ForkedThread> getForkedThreads();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='JoinsCorrectly(Sequence{self.thread}, Set{})'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> JoinsCorrectly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" threadStackUnique="false" threadStackMany="true"
	 *        threadStackAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Fork has already been checked\n\t\t\t      then beenHere\n\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t           forkedThreads->iterate(t; result: Set(Activity) = Set{} | result->union(t.startActivity.JoinsCorrectly(threadStack->append(t), bh)))\n\t\t\t      endif'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t      let successorRefs: Set(Reference) = forkedThreads->iterate(t; result: Set(Reference) = Set{} | result->union(t.startActivity.GetAccessedReferences(soFar, bh))) in\n\t\t\t          successorRefs - forkedThreads'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Reference> GetSuccessorReferences(EList<Reference> soFar, EList<Activity> beenHere);

} // Fork
