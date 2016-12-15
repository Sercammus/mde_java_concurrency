/**
 */
package ActivityDiagram.provider;


import ActivityDiagram.ActivityDiagramFactory;
import ActivityDiagram.ActivityDiagramPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ActivityDiagram.Thread} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreadItemProvider extends ReferenceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_Thread_startActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Thread_startActivity_feature", "_UI_Thread_type"),
				 ActivityDiagramPackage.Literals.THREAD__START_ACTIVITY,
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
			childrenFeatures.add(ActivityDiagramPackage.Literals.THREAD__ACTIVITIES);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActivityDiagram.Thread)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Thread_type") :
			getString("_UI_Thread_type") + " " + label;
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

		switch (notification.getFeatureID(ActivityDiagram.Thread.class)) {
			case ActivityDiagramPackage.THREAD__ACTIVITIES:
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
				(ActivityDiagramPackage.Literals.THREAD__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.THREAD__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createFork()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.THREAD__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createDecision()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.THREAD__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.THREAD__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createInterrupt()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.THREAD__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createSleep()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.THREAD__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createYield()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.THREAD__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createSimpleActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityDiagramPackage.Literals.THREAD__ACTIVITIES,
				 ActivityDiagramFactory.eINSTANCE.createNestedActivity()));
	}

}
