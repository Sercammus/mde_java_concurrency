/**
 */
package umlad2javacc.basicmodel.ActivityDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.NamedActivity#getActivityName <em>Activity Name</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getNamedActivity()
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
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getNamedActivity_ActivityName()
	 * @model
	 * @generated
	 */
	String getActivityName();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.ActivityDiagram.NamedActivity#getActivityName <em>Activity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Name</em>' attribute.
	 * @see #getActivityName()
	 * @generated
	 */
	void setActivityName(String value);

} // NamedActivity
