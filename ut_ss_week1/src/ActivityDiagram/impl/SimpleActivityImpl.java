/**
 */
package ActivityDiagram.impl;

import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.SharedResource;
import ActivityDiagram.SimpleActivity;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagram.impl.SimpleActivityImpl#getSharedResources <em>Shared Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleActivityImpl extends DescribedActivityImpl implements SimpleActivity {
	/**
	 * The cached value of the '{@link #getSharedResources() <em>Shared Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedResource> sharedResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityDiagramPackage.Literals.SIMPLE_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedResource> getSharedResources() {
		if (sharedResources == null) {
			sharedResources = new EObjectResolvingEList<SharedResource>(SharedResource.class, this, ActivityDiagramPackage.SIMPLE_ACTIVITY__SHARED_RESOURCES);
		}
		return sharedResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityDiagramPackage.SIMPLE_ACTIVITY__SHARED_RESOURCES:
				return getSharedResources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivityDiagramPackage.SIMPLE_ACTIVITY__SHARED_RESOURCES:
				getSharedResources().clear();
				getSharedResources().addAll((Collection<? extends SharedResource>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivityDiagramPackage.SIMPLE_ACTIVITY__SHARED_RESOURCES:
				getSharedResources().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivityDiagramPackage.SIMPLE_ACTIVITY__SHARED_RESOURCES:
				return sharedResources != null && !sharedResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleActivityImpl
