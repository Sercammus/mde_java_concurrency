/**
 */
package umlad2javacc.basicmodel.BasicModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Thread#getActivitiesByStateId <em>Activities By State Id</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Thread#getActivities <em>Activities</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Thread#getStartActivity <em>Start Activity</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getThread()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidStartActivityThread'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidStartActivityThread='startActivity.thread = self or startActivity.oclIsKindOf(Join) or startActivity.oclIsKindOf(FinalActivity)'"
 * @generated
 */
public interface Thread extends Reference {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.BasicModel.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getThread_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Activities By State Id</b></em>' reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.BasicModel.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities By State Id</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities By State Id</em>' reference list.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getThread_ActivitiesByStateId()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='GetActivitiesByStateId()'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> getActivitiesByStateId();

	/**
	 * Returns the value of the '<em><b>Start Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Activity</em>' reference.
	 * @see #setStartActivity(Activity)
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getThread_StartActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getStartActivity();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.Thread#getStartActivity <em>Start Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Activity</em>' reference.
	 * @see #getStartActivity()
	 * @generated
	 */
	void setStartActivity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='startActivity.GetActivitiesByStateId(OrderedSet{}, Set{})'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Activity> GetActivitiesByStateId();

} // Thread
