/**
 */
package umlad2javacc.basicmodel.BasicModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sleep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.Sleep#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getSleep()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositiveSleepDuration'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PositiveSleepDuration='duration >= 1'"
 * @generated
 */
public interface Sleep extends LinearActivity {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getSleep_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.Sleep#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // Sleep
