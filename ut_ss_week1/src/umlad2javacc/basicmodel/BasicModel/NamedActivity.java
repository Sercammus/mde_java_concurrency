/**
 */
package umlad2javacc.basicmodel.BasicModel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.NamedActivity#getActivityName <em>Activity Name</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.NamedActivity#getSharedResources <em>Shared Resources</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getNamedActivity()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProperNamedActivityName UniqueNamedActivityName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProperNamedActivityName='activityName.matches(\'[A-Za-z_$][A-Za-z0-9_$]*\')' UniqueNamedActivityName='Reference.allInstances()->select(r | r.name = activityName and not r.oclIsKindOf(NestedThread))->isEmpty()'"
 * @generated
 */
public interface NamedActivity extends LinearActivity {
	/**
	 * Returns the value of the '<em><b>Activity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Name</em>' attribute.
	 * @see #setActivityName(String)
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getNamedActivity_ActivityName()
	 * @model
	 * @generated
	 */
	String getActivityName();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.NamedActivity#getActivityName <em>Activity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Name</em>' attribute.
	 * @see #getActivityName()
	 * @generated
	 */
	void setActivityName(String value);

	/**
	 * Returns the value of the '<em><b>Shared Resources</b></em>' reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.BasicModel.SharedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Resources</em>' reference list.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getNamedActivity_SharedResources()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SharedResource> getSharedResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='other.activityName = self.activityName and other.instanceType = self.instanceType'"
	 * @generated
	 */
	boolean IsSameReference(NamedActivity other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let basicModel: BasicModel = BasicModel.allInstances()->asSequence()->first() in\n\t                  let reachableActivities: OrderedSet(Activity) = basicModel.startActivity.GetReachableActivities(OrderedSet{}) in\n\t                  let otherMethodUsers: OrderedSet(Activity) = reachableActivities->select(e | e.oclIsKindOf(NamedActivity)) - NamedActivity.allInstances()->select(e | not e.IsSameReference(self)) in\n\t                         otherMethodUsers->first()'"
	 * @generated
	 */
	Activity GetMethodCreator();

} // NamedActivity
