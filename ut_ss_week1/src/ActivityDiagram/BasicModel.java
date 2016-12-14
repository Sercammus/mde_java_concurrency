/**
 */
package ActivityDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link ActivityDiagram.BasicModel#getStartActivity <em>Start Activity</em>}</li>
 *   <li>{@link ActivityDiagram.BasicModel#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getBasicModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueNames1 UniqueNames2 ValidForkJoinUsage1 ValidForkJoinUsage2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueNames1='activities->collect(a | a.name)->isUnique(n | n)' UniqueNames2='\n\t\t\tlet resourceNames: Bag(String) = SharedResource.allInstances()->collect(r | r.name) in\n\t\t\tlet instanceNames: Bag(String) = Instance.allInstances()->collect(i | i.name) in\n\t\t\tlet instanceTypeNames: Bag(String) = InstanceType.allInstances()->collect(t | t.name) in\n\t\t\tlet activityDescriptions: Bag(String) = DescribedActivity.allInstances()->collect(a | a.description) in\n\t\t\t    resourceNames->union(instanceNames->union(instanceTypeNames->union(activityDescriptions->asSet()->asBag())))->isUnique(n | n)' ValidForkJoinUsage1='startActivity.JoinsCorrectly()->includesAll(Activity.allInstances())' ValidForkJoinUsage2='\n\t\t\tlet forkThreads: Bag(Thread) = Fork.allInstances()->collect(thread)->asBag() in\n\t\t\tlet joinThreads: Bag(Thread) = Join.allInstances()->collect(thread)->asBag() in\n\t\t\t\tforkThreads->intersection(joinThreads) = joinThreads'"
 * @generated
 */
public interface BasicModel extends EObject {
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
	 * Returns the value of the '<em><b>Start Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Activity</em>' reference.
	 * @see #setStartActivity(Activity)
	 * @see ActivityDiagram.ActivityDiagramPackage#getBasicModel_StartActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getStartActivity();

	/**
	 * Sets the value of the '{@link ActivityDiagram.BasicModel#getStartActivity <em>Start Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Activity</em>' reference.
	 * @see #getStartActivity()
	 * @generated
	 */
	void setStartActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagram.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see ActivityDiagram.ActivityDiagramPackage#getBasicModel_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

} // BasicModel
