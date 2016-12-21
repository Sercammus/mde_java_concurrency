/**
 */
package umlad2javacc.basicmodel.BasicModel;

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
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Fork#getMaxThreadCount <em>Max Thread Count</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Fork#getForkedThreads <em>Forked Threads</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Fork#getJoin <em>Join</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getFork()
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
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getFork_MaxThreadCount()
	 * @model
	 * @generated
	 */
	int getMaxThreadCount();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.Fork#getMaxThreadCount <em>Max Thread Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Thread Count</em>' attribute.
	 * @see #getMaxThreadCount()
	 * @generated
	 */
	void setMaxThreadCount(int value);

	/**
	 * Returns the value of the '<em><b>Forked Threads</b></em>' containment reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.BasicModel.ForkedThread}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forked Threads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked Threads</em>' containment reference list.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getFork_ForkedThreads()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ForkedThread> getForkedThreads();

	/**
	 * Returns the value of the '<em><b>Join</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' reference.
	 * @see #setJoin(Activity)
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getFork_Join()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.SearchForJoin(Sequence{}, Set{})'"
	 * @generated
	 */
	Activity getJoin();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.Fork#getJoin <em>Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' reference.
	 * @see #getJoin()
	 * @generated
	 */
	void setJoin(Activity value);

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
	EList<Activity> JoinsCorrectly(EList<umlad2javacc.basicmodel.BasicModel.Thread> threadStack, EList<Activity> beenHere);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadStackUnique="false" threadStackMany="true"
	 *        threadStackAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then null\n\t\t\t\t      else let bh: Set(Activity) = beenHere->including(self) in\n\t\t\t\t           let joins: Sequence(Activity) = forkedThreads->collect(e | e.startActivity.SearchForJoin(threadStack->append(e.startActivity.thread), bh))->select(e | e <> null) in\n\t\t\t\t               if (joins->isEmpty())\n\t\t\t\t               then self\n\t\t\t\t               else joins->first()\n\t\t\t\t               endif\n\t\t\t\t      endif'"
	 * @generated
	 */
	Activity SearchForJoin(EList<umlad2javacc.basicmodel.BasicModel.Thread> threadStack, EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model soFarMany="true"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t\t      then soFar\n\t\t\t\t      else Join.allInstances()->select(e | e.thread = thread)->asSequence()->first().GetActivitiesByStateId(soFar->append(self), beenHere->including(self))\n\t\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> GetActivitiesByStateId(EList<Activity> soFar, EList<Activity> beenHere);

} // Fork
