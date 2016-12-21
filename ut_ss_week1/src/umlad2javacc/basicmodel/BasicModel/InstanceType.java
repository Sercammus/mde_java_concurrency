/**
 */
package umlad2javacc.basicmodel.BasicModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.InstanceType#getName <em>Name</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.InstanceType#getForkedThreads <em>Forked Threads</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getInstanceType()
 * @model
 * @generated
 */
public interface InstanceType extends EObject {
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
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getInstanceType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link umlad2javacc.basicmodel.BasicModel.InstanceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Forked Threads</b></em>' reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.BasicModel.ForkedThread}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forked Threads</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked Threads</em>' reference list.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getInstanceType_ForkedThreads()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Fork.allInstances()->select(e|e.instanceType=self)->iterate(e; result: Set(ForkedThread) = Set{}|result->union(e.forkedThreads))'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<ForkedThread> getForkedThreads();

} // InstanceType
