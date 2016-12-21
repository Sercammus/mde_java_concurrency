/**
 */
package umlad2javacc.basicmodel.BasicModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.BasicModel#getResources <em>Resources</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.BasicModel#getInstances <em>Instances</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.BasicModel#getInstanceTypes <em>Instance Types</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.BasicModel#getNestedThreads <em>Nested Threads</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.BasicModel.BasicModel#getForkedThreads <em>Forked Threads</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getBasicModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MatchingForkForEveryJoin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MatchingForkForEveryJoin='\n\t\t\tlet forkThreads: Bag(Thread) = Fork.allInstances()->collect(thread)->asBag() in\n\t\t\tlet joinThreads: Bag(Thread) = Join.allInstances()->collect(thread)->asBag() in\n\t\t\t\tforkThreads->intersection(joinThreads) = joinThreads'"
 * @generated
 */
public interface BasicModel extends InterruptableThread {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.BasicModel.SharedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getBasicModel_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<SharedResource> getResources();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.BasicModel.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getBasicModel_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Instance Types</b></em>' containment reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.BasicModel.InstanceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Types</em>' containment reference list.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getBasicModel_InstanceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceType> getInstanceTypes();

	/**
	 * Returns the value of the '<em><b>Nested Threads</b></em>' containment reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.BasicModel.NestedThread}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Threads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Threads</em>' containment reference list.
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getBasicModel_NestedThreads()
	 * @model containment="true"
	 * @generated
	 */
	EList<NestedThread> getNestedThreads();

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
	 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getBasicModel_ForkedThreads()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Fork.allInstances()->select(e|e.instanceType=null)->iterate(e; result: Set(ForkedThread) = Set{}|result->union(e.forkedThreads))'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<ForkedThread> getForkedThreads();

} // BasicModel
