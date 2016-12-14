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
public interface SimpleActivity extends DescribedActivity {
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
	 * @model
	 * @generated
	 */
	EList<SharedResource> getSharedResources();

} // SimpleActivity
