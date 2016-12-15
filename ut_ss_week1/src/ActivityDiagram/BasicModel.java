/**
 */
package ActivityDiagram;

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
 *   <li>{@link ActivityDiagram.BasicModel#getResources <em>Resources</em>}</li>
 *   <li>{@link ActivityDiagram.BasicModel#getInstances <em>Instances</em>}</li>
 *   <li>{@link ActivityDiagram.BasicModel#getInstanceTypes <em>Instance Types</em>}</li>
 *   <li>{@link ActivityDiagram.BasicModel#getThreads <em>Threads</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getBasicModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueNames ValidForkJoinNesting MatchingForkForEveryJoin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueNames='\n\t\t\tlet referenceNames: Bag(String) = Reference.allInstances()->collect(r | r.name) in\n\t\t\tlet activityNames: Bag(String) = NamedActivity.allInstances()->collect(a | a.activityName) in\n\t\t\t    referenceNames->union(activityNames->asSet()->asBag())->isUnique(n | n)' ValidForkJoinNesting='startActivity.JoinsCorrectly()->includesAll(Activity.allInstances()->asSet())' MatchingForkForEveryJoin='\n\t\t\tlet forkThreads: Bag(Thread) = Fork.allInstances()->collect(thread)->asBag() in\n\t\t\tlet joinThreads: Bag(Thread) = Join.allInstances()->collect(thread)->asBag() in\n\t\t\t\tforkThreads->intersection(joinThreads) = joinThreads'"
 * @generated
 */
public interface BasicModel extends ActivityDiagram.Thread {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagram.SharedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see ActivityDiagram.ActivityDiagramPackage#getBasicModel_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<SharedResource> getResources();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagram.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see ActivityDiagram.ActivityDiagramPackage#getBasicModel_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Instance Types</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagram.InstanceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Types</em>' containment reference list.
	 * @see ActivityDiagram.ActivityDiagramPackage#getBasicModel_InstanceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceType> getInstanceTypes();

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagram.Thread}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference list.
	 * @see ActivityDiagram.ActivityDiagramPackage#getBasicModel_Threads()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityDiagram.Thread> getThreads();

} // BasicModel
