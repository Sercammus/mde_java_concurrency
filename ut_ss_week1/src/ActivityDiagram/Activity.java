/**
 */
package ActivityDiagram;

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
 *   <li>{@link ActivityDiagram.Activity#getInstance <em>Instance</em>}</li>
 *   <li>{@link ActivityDiagram.Activity#getThread <em>Thread</em>}</li>
 *   <li>{@link ActivityDiagram.Activity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getActivity()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProperActivityName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProperActivityName='name.matches(\'[A-Za-z_$][A-Za-z0-9_$]*\')'"
 * @generated
 */
public interface Activity extends EObject {
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
	 * @see ActivityDiagram.ActivityDiagramPackage#getActivity_Instance()
	 * @model
	 * @generated
	 */
	Instance getInstance();

	/**
	 * Sets the value of the '{@link ActivityDiagram.Activity#getInstance <em>Instance</em>}' reference.
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
	 * @see #setThread(ActivityDiagram.Thread)
	 * @see ActivityDiagram.ActivityDiagramPackage#getActivity_Thread()
	 * @model
	 * @generated
	 */
	ActivityDiagram.Thread getThread();

	/**
	 * Sets the value of the '{@link ActivityDiagram.Activity#getThread <em>Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' reference.
	 * @see #getThread()
	 * @generated
	 */
	void setThread(ActivityDiagram.Thread value);

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
	 * @see ActivityDiagram.ActivityDiagramPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ActivityDiagram.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='JoinsCorrectly(Sequence{}, Set{})'"
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
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> JoinsCorrectly(EList<Fork> fork, EList<Activity> beenHere);

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

} // Activity
