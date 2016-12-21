/**
 */
package umlad2javacc.basicmodel.ActivityDiagram.impl;

import org.eclipse.emf.ecore.EClass;

import umlad2javacc.basicmodel.ActivityDiagram.BasicModelPackage;
import umlad2javacc.basicmodel.ActivityDiagram.InterruptableThread;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interruptable Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class InterruptableThreadImpl extends ThreadImpl implements InterruptableThread {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptableThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicModelPackage.Literals.INTERRUPTABLE_THREAD;
	}

} //InterruptableThreadImpl
