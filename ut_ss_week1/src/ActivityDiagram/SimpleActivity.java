/**
 */
package ActivityDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.SimpleActivity#getSharedResources <em>Shared Resources</em>}</li>
 * </ul>
 *
 * @see ActivityDiagram.ActivityDiagramPackage#getSimpleActivity()
 * @model
 * @generated
 */
public interface SimpleActivity extends NamedActivity {
	/**
	 * Returns the value of the '<em><b>Shared Resources</b></em>' reference list.
	 * The list contents are of type {@link ActivityDiagram.SharedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Resources</em>' reference list.
	 * @see ActivityDiagram.ActivityDiagramPackage#getSimpleActivity_SharedResources()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SharedResource> getSharedResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" soFarMany="true" soFarOrdered="false"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if beenHere->exists(e | e = self) -- Activity has already been checked\n\t\t\t      then soFar\n\t\t\t      else nextActivity.GetAccessedReferences(soFar->union(sharedResources), beenHere->including(self))\n\t\t\t      endif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Reference> GetAccessedReferences(EList<SharedResource> soFar, EList<Activity> beenHere);

} // SimpleActivity
