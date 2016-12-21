/**
 */
package umlad2javacc.basicmodel.ActivityDiagram;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getName <em>Name</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getStateId <em>State Id</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getRootActivity <em>Root Activity</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getInstance <em>Instance</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getThread <em>Thread</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getAccessedReferences <em>Accessed References</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getActivity()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Reachability'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot Reachability='let basicModel: BasicModel = BasicModel.allInstances()->asSequence()->first() in\n\t                        let reachableActivities: Set(Activity) = basicModel.startActivity.JoinsCorrectly(Sequence{basicModel}, Set{}) in\n\t                            reachableActivities->exists(a | a = self)'"
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.ActivityDiagram.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference list.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getActivity_Predecessor()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='GetPredecessors(Set{})'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> getPredecessor();

	/**
	 * Returns the value of the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Id</em>' attribute.
	 * @see #setStateId(BigInteger)
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getActivity_StateId()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='GetPredecessors(Set{})->asSequence()->first().AssignStateId(self, 0, Set{})'"
	 * @generated
	 */
	BigInteger getStateId();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getStateId <em>State Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Id</em>' attribute.
	 * @see #getStateId()
	 * @generated
	 */
	void setStateId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Root Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Activity</em>' reference.
	 * @see #setRootActivity(Activity)
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getActivity_RootActivity()
	 * @model volatile="true" derived="true"
	 * @generated
	 */
	Activity getRootActivity();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getRootActivity <em>Root Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Activity</em>' reference.
	 * @see #getRootActivity()
	 * @generated
	 */
	void setRootActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(Instance)
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getActivity_Instance()
	 * @model
	 * @generated
	 */
	Instance getInstance();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Instance value);

	/**
	 * Returns the value of the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' reference.
	 * @see #setThread(umlad2javacc.basicmodel.ActivityDiagram.Thread)
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getActivity_Thread()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='let temp: Set(Thread) = Thread.allInstances()->select(t | t.activities->exists(a | a = self))\n\t\t            in if temp->size() = 1 then temp->asOrderedSet()->first() else null endif'"
	 * @generated
	 */
	umlad2javacc.basicmodel.ActivityDiagram.Thread getThread();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.ActivityDiagram.Activity#getThread <em>Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' reference.
	 * @see #getThread()
	 * @generated
	 */
	void setThread(umlad2javacc.basicmodel.ActivityDiagram.Thread value);

	/**
	 * Returns the value of the '<em><b>Accessed References</b></em>' reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.ActivityDiagram.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessed References</em>' reference list.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getActivity_AccessedReferences()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='GetAccessedReferences(Set{}, Set{})'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Reference> getAccessedReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" threadStackUnique="false" threadStackMany="true"
	 *        threadStackAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> JoinsCorrectly(EList<umlad2javacc.basicmodel.ActivityDiagram.Thread> threadStack, EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='((thread = a.thread) = a.oclIsTypeOf(Join)) or a.oclIsKindOf(FinalActivity)'"
	 * @generated
	 */
	boolean UsesDifferentThread(Activity a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='((thread = a.thread) <> a.oclIsTypeOf(Join)) or a.oclIsKindOf(FinalActivity)'"
	 * @generated
	 */
	boolean UsesSameThread(Activity a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" soFarMany="true" soFarOrdered="false"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then soFar\n\t\t\t      else if instance <> null\n\t\t\t           then GetSuccessorReferences(soFar->including(instance), beenHere)\n\t\t\t           else GetSuccessorReferences(soFar, beenHere)\n\t\t\t           endif\n\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Reference> GetAccessedReferences(EList<Reference> soFar, EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" soFarMany="true" soFarOrdered="false"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Reference> GetSuccessorReferences(EList<Reference> soFar, EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then Set{}\n\t\t\t      else let linearPredecessors: Set(Activity) = LinearActivity.allInstances()->select(e | e.nextActivity = self) in\n\t\t\t           let decisionPredecessors: Set(Activity) = Decision.allInstances()->select(e | e.branches->exists(b | b.nextActivity = self)) in\n\t\t\t           let predecessors: Set(Activity) = linearPredecessors->union(decisionPredecessors) in\n\t\t\t               if predecessors->isEmpty() -- Activity has no predecessor\n\t\t\t               then Set{self}\n\t\t\t               else let bh: Set(Activity) = beenHere->including(self) in predecessors->collect(e | GetPredecessors(bh))->asSet()\n\t\t\t               endif\n\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> GetPredecessors(EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	BigInteger AssignStateId(Activity target, BigInteger reachedId, EList<Activity> beenHere);

} // Activity
