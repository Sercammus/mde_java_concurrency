/**
 */
package umlad2javacc.basicmodel.ActivityDiagram;

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
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.BasicModel#getResources <em>Resources</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.BasicModel#getInstances <em>Instances</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.BasicModel#getInstanceTypes <em>Instance Types</em>}</li>
 *   <li>{@link umlad2javacc.basicmodel.ActivityDiagram.BasicModel#getNestedThreads <em>Nested Threads</em>}</li>
 * </ul>
 *
 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getBasicModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidForkJoinNesting MatchingForkForEveryJoin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidForkJoinNesting='startActivity.JoinsCorrectly(Sequence{self}, Set{})->includesAll(Activity.allInstances()->asSet())' MatchingForkForEveryJoin='\n\t\t\tlet forkThreads: Bag(Thread) = Fork.allInstances()->collect(thread)->asBag() in\n\t\t\tlet joinThreads: Bag(Thread) = Join.allInstances()->collect(thread)->asBag() in\n\t\t\t\tforkThreads->intersection(joinThreads) = joinThreads'"
 * @generated
 */
public interface BasicModel extends InterruptableThread {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.ActivityDiagram.SharedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getBasicModel_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<SharedResource> getResources();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.ActivityDiagram.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getBasicModel_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Instance Types</b></em>' containment reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.ActivityDiagram.InstanceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Types</em>' containment reference list.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getBasicModel_InstanceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceType> getInstanceTypes();

	/**
	 * Returns the value of the '<em><b>Nested Threads</b></em>' containment reference list.
	 * The list contents are of type {@link umlad2javacc.basicmodel.ActivityDiagram.NestedThread}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Threads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Threads</em>' containment reference list.
	 * @see umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage#getBasicModel_NestedThreads()
	 * @model containment="true"
	 * @generated
	 */
	EList<NestedThread> getNestedThreads();

} // BasicModel
