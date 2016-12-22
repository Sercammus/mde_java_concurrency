/**
 */
package umlad2javacc.basicmodel.BasicModel;

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
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Activity#getName <em>Name</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Activity#getStateId <em>State Id</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Activity#getInstance <em>Instance</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Activity#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Activity#getThread <em>Thread</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Activity#getAccessedReferences <em>Accessed References</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getActivity()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Reachability'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot Reachability='let basicModel: BasicModel = BasicModel.allInstances()->asSequence()->first() in\n\t                        let reachableActivities: OrderedSet(Activity) = basicModel.startActivity.GetReachableActivities(OrderedSet{}) in\n\t                            reachableActivities->exists(a | a = self)'"
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
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Id</em>' attribute.
	 * @see #setStateId(int)
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getActivity_StateId()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='let activitiesByStateId: OrderedSet(Activity) = thread.GetActivitiesByStateId() in\n\t\t\t         let numbers: Sequence(ecore::EInt) = Sequence{1..activitiesByStateId->size()}->select(nr | activitiesByStateId->at(nr) = self) in\n\t\t\t             if numbers->isEmpty()\n\t\t\t             then -1\n\t\t\t             else numbers->first()\n\t\t\t             endif'"
	 * @generated
	 */
	int getStateId();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.Activity#getStateId <em>State Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Id</em>' attribute.
	 * @see #getStateId()
	 * @generated
	 */
	void setStateId(int value);

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
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getActivity_Instance()
	 * @model
	 * @generated
	 */
	Instance getInstance();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.Activity#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Instance value);

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' reference.
	 * @see #setInstanceType(InstanceType)
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getActivity_InstanceType()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if instance <> null then instance.instanceType else null endif'"
	 * @generated
	 */
	InstanceType getInstanceType();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.Activity#getInstanceType <em>Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' reference.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(InstanceType value);

	/**
	 * Returns the value of the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' reference.
	 * @see #setThread(umlad2javacc.basicmodel.BasicModel.Thread)
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getActivity_Thread()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='let temp: Set(Thread) = Thread.allInstances()->select(t | t.activities->exists(a | a = self))\n\t\t            in if temp->size() = 1 then temp->asOrderedSet()->first() else null endif'"
	 * @generated
	 */
	umlad2javacc.basicmodel.BasicModel.Thread getThread();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.Activity#getThread <em>Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' reference.
	 * @see #getThread()
	 * @generated
	 */
	void setThread(umlad2javacc.basicmodel.BasicModel.Thread value);

	/**
	 * Returns the value of the '<em><b>Accessed References</b></em>' reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.BasicModel.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessed References</em>' reference list.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getActivity_AccessedReferences()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='GetAccessedReferences(Set{}, Set{})'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Reference> getAccessedReferences();

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
	 * @model beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='null'"
	 * @generated
	 */
	Activity SearchForJoin(BigInteger searchDepth, EList<Activity> beenHere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model soFarMany="true"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='soFar->including(self)'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> GetReachableActivities(EList<Activity> soFar);

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
	 * @model soFarMany="true"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='soFar'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> GetActivitiesByStateId(EList<Activity> soFar, EList<Activity> beenHere);

} // Activity
