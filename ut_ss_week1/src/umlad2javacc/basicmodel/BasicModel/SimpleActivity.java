/**
 */
package umlad2javacc.basicmodel.BasicModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage#getSimpleActivity()
 * @model
 * @generated
 */
public interface SimpleActivity extends NamedActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" soFarMany="true" soFarOrdered="false"
	 *        soFarAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'" beenHereMany="true" beenHereOrdered="false"
	 *        beenHereAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='nextActivity.GetAccessedReferences(soFar->union(sharedResources), beenHere->including(self))'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Reference> GetSuccessorReferences(EList<Reference> soFar, EList<Activity> beenHere);

} // SimpleActivity
