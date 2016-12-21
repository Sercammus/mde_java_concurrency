/**
 */
package umlad2javacc.basicmodel.ActivityDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.Reference#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getReference()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProperReferenceName UniqueReferenceName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProperReferenceName='name.matches(\'[A-Za-z_$][A-Za-z0-9_$]*\')' UniqueReferenceName='Reference.allInstances()->select(r | r.name = name and not r.oclIsKindOf(NestedThread))->size() <= 1'"
 * @generated
 */
public interface Reference extends EObject {
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
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.ActivityDiagram.Reference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Reference
