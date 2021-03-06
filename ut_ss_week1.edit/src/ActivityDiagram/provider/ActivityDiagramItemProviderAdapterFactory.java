/**
 */
package ActivityDiagram.provider;

import ActivityDiagram.util.ActivityDiagramAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityDiagramItemProviderAdapterFactory extends ActivityDiagramAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.Thread} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadItemProvider threadItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.Thread}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThreadAdapter() {
		if (threadItemProvider == null) {
			threadItemProvider = new ThreadItemProvider(this);
		}

		return threadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.BasicModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicModelItemProvider basicModelItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.BasicModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBasicModelAdapter() {
		if (basicModelItemProvider == null) {
			basicModelItemProvider = new BasicModelItemProvider(this);
		}

		return basicModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.End} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndItemProvider endItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.End}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndAdapter() {
		if (endItemProvider == null) {
			endItemProvider = new EndItemProvider(this);
		}

		return endItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.Fork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkItemProvider forkItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.Fork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForkAdapter() {
		if (forkItemProvider == null) {
			forkItemProvider = new ForkItemProvider(this);
		}

		return forkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.Decision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionItemProvider decisionItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.Decision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecisionAdapter() {
		if (decisionItemProvider == null) {
			decisionItemProvider = new DecisionItemProvider(this);
		}

		return decisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.Branch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchItemProvider branchItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBranchAdapter() {
		if (branchItemProvider == null) {
			branchItemProvider = new BranchItemProvider(this);
		}

		return branchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.Join} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinItemProvider joinItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.Join}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoinAdapter() {
		if (joinItemProvider == null) {
			joinItemProvider = new JoinItemProvider(this);
		}

		return joinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.SharedResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedResourceItemProvider sharedResourceItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.SharedResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSharedResourceAdapter() {
		if (sharedResourceItemProvider == null) {
			sharedResourceItemProvider = new SharedResourceItemProvider(this);
		}

		return sharedResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.Interrupt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptItemProvider interruptItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.Interrupt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterruptAdapter() {
		if (interruptItemProvider == null) {
			interruptItemProvider = new InterruptItemProvider(this);
		}

		return interruptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.Instance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceItemProvider instanceItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.Instance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstanceAdapter() {
		if (instanceItemProvider == null) {
			instanceItemProvider = new InstanceItemProvider(this);
		}

		return instanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.InstanceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceTypeItemProvider instanceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.InstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstanceTypeAdapter() {
		if (instanceTypeItemProvider == null) {
			instanceTypeItemProvider = new InstanceTypeItemProvider(this);
		}

		return instanceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.Sleep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SleepItemProvider sleepItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.Sleep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSleepAdapter() {
		if (sleepItemProvider == null) {
			sleepItemProvider = new SleepItemProvider(this);
		}

		return sleepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.Yield} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YieldItemProvider yieldItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.Yield}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createYieldAdapter() {
		if (yieldItemProvider == null) {
			yieldItemProvider = new YieldItemProvider(this);
		}

		return yieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.SimpleActivity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleActivityItemProvider simpleActivityItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.SimpleActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleActivityAdapter() {
		if (simpleActivityItemProvider == null) {
			simpleActivityItemProvider = new SimpleActivityItemProvider(this);
		}

		return simpleActivityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.NestedActivity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedActivityItemProvider nestedActivityItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.NestedActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNestedActivityAdapter() {
		if (nestedActivityItemProvider == null) {
			nestedActivityItemProvider = new NestedActivityItemProvider(this);
		}

		return nestedActivityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityDiagram.ForkedThread} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkedThreadItemProvider forkedThreadItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityDiagram.ForkedThread}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForkedThreadAdapter() {
		if (forkedThreadItemProvider == null) {
			forkedThreadItemProvider = new ForkedThreadItemProvider(this);
		}

		return forkedThreadItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (threadItemProvider != null) threadItemProvider.dispose();
		if (basicModelItemProvider != null) basicModelItemProvider.dispose();
		if (endItemProvider != null) endItemProvider.dispose();
		if (forkItemProvider != null) forkItemProvider.dispose();
		if (decisionItemProvider != null) decisionItemProvider.dispose();
		if (branchItemProvider != null) branchItemProvider.dispose();
		if (joinItemProvider != null) joinItemProvider.dispose();
		if (sharedResourceItemProvider != null) sharedResourceItemProvider.dispose();
		if (interruptItemProvider != null) interruptItemProvider.dispose();
		if (instanceItemProvider != null) instanceItemProvider.dispose();
		if (instanceTypeItemProvider != null) instanceTypeItemProvider.dispose();
		if (sleepItemProvider != null) sleepItemProvider.dispose();
		if (yieldItemProvider != null) yieldItemProvider.dispose();
		if (simpleActivityItemProvider != null) simpleActivityItemProvider.dispose();
		if (nestedActivityItemProvider != null) nestedActivityItemProvider.dispose();
		if (forkedThreadItemProvider != null) forkedThreadItemProvider.dispose();
	}

}
