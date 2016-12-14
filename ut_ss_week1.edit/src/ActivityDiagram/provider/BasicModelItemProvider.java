/**
 */
package ActivityDiagram.provider;


import ActivityDiagram.ActivityDiagramFactory;
import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.BasicModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ActivityDiagram.BasicModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStartActivityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Start Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BasicModel_startActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicModel_startActivity_feature", "_UI_BasicModel_type"),
				 ActivityDiagramPackage.Literals.BASIC_MODEL__START_ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ActivityDiagramPackage.Literals.BASIC_MODEL__RESOURCES);
			childrenFeatures.add(ActivityDiagramPackage.Literals.BASIC_MODEL__INSTANCES);
			childrenFeatures.add(ActivityDiagramPackage.Literals.BASIC_MODEL__INSTANCE_TYPES);
			childrenFeatures.add(ActivityDiagramPackage.Literals.BASIC_MODEL__ACTIVITIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BasicModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BasicModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BasicModel_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BasicModel.class)) {
			case ActivityDiagramPackage.BASIC_MODEL__RESOURCES:
			case ActivityDiagramPackage.BASIC_MODEL__INSTANCES:
			case ActivityDiagramPackage.BASIC_MODEL__INSTANCE_TYPES:
			case ActivityDiagramPackage.BASIC_MODEL__ACTIVITIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.BASIC_MODEL__RESOURCES,
				 ActivityDiagramFactory.eINSTANCE.createSharedResource()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.BASIC_MODEL__INSTANCES,
				 ActivityDiagramFactory.eINSTANCE.createInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.BASIC_MODEL__INSTANCE_TYPES,
				 ActivityDiagramFactory.eINSTANCE.createInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.BASIC_MODEL__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.BASIC_MODEL__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createFork()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.BASIC_MODEL__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createDecision()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.BASIC_MODEL__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.BASIC_MODEL__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createInterrupt()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.BASIC_MODEL__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createSleep()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.BASIC_MODEL__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createYield()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.BASIC_MODEL__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createSimpleActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.BASIC_MODEL__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createNestedActivity()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ActivityDiagramEditPlugin.INSTANCE;
	}

}
