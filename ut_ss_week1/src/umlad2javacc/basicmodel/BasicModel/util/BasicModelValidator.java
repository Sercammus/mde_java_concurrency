/**
 */
package umlad2javacc.basicmodel.BasicModel.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import umlad2javacc.basicmodel.BasicModel.Activity;
import umlad2javacc.basicmodel.BasicModel.BasicModel;
import umlad2javacc.basicmodel.BasicModel.BasicModelPackage;
import umlad2javacc.basicmodel.BasicModel.Branch;
import umlad2javacc.basicmodel.BasicModel.Decision;
import umlad2javacc.basicmodel.BasicModel.End;
import umlad2javacc.basicmodel.BasicModel.FinalActivity;
import umlad2javacc.basicmodel.BasicModel.Fork;
import umlad2javacc.basicmodel.BasicModel.ForkedThread;
import umlad2javacc.basicmodel.BasicModel.Instance;
import umlad2javacc.basicmodel.BasicModel.InstanceType;
import umlad2javacc.basicmodel.BasicModel.Interrupt;
import umlad2javacc.basicmodel.BasicModel.InterruptableThread;
import umlad2javacc.basicmodel.BasicModel.Join;
import umlad2javacc.basicmodel.BasicModel.LinearActivity;
import umlad2javacc.basicmodel.BasicModel.NamedActivity;
import umlad2javacc.basicmodel.BasicModel.NestedActivity;
import umlad2javacc.basicmodel.BasicModel.NestedThread;
import umlad2javacc.basicmodel.BasicModel.Reference;
import umlad2javacc.basicmodel.BasicModel.SharedResource;
import umlad2javacc.basicmodel.BasicModel.SimpleActivity;
import umlad2javacc.basicmodel.BasicModel.Sleep;
import umlad2javacc.basicmodel.BasicModel.Yield;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see umlad2javacc.basicmodel.BasicModel.BasicModelPackage
 * @generated
 */
public class BasicModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BasicModelValidator INSTANCE = new BasicModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "umlad2javacc.basicmodel.BasicModel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BasicModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BasicModelPackage.THREAD:
				return validateThread((umlad2javacc.basicmodel.BasicModel.Thread)value, diagnostics, context);
			case BasicModelPackage.BASIC_MODEL:
				return validateBasicModel((BasicModel)value, diagnostics, context);
			case BasicModelPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case BasicModelPackage.END:
				return validateEnd((End)value, diagnostics, context);
			case BasicModelPackage.FINAL_ACTIVITY:
				return validateFinalActivity((FinalActivity)value, diagnostics, context);
			case BasicModelPackage.LINEAR_ACTIVITY:
				return validateLinearActivity((LinearActivity)value, diagnostics, context);
			case BasicModelPackage.FORK:
				return validateFork((Fork)value, diagnostics, context);
			case BasicModelPackage.DECISION:
				return validateDecision((Decision)value, diagnostics, context);
			case BasicModelPackage.BRANCH:
				return validateBranch((Branch)value, diagnostics, context);
			case BasicModelPackage.JOIN:
				return validateJoin((Join)value, diagnostics, context);
			case BasicModelPackage.SHARED_RESOURCE:
				return validateSharedResource((SharedResource)value, diagnostics, context);
			case BasicModelPackage.INTERRUPT:
				return validateInterrupt((Interrupt)value, diagnostics, context);
			case BasicModelPackage.INSTANCE:
				return validateInstance((Instance)value, diagnostics, context);
			case BasicModelPackage.INSTANCE_TYPE:
				return validateInstanceType((InstanceType)value, diagnostics, context);
			case BasicModelPackage.SLEEP:
				return validateSleep((Sleep)value, diagnostics, context);
			case BasicModelPackage.YIELD:
				return validateYield((Yield)value, diagnostics, context);
			case BasicModelPackage.SIMPLE_ACTIVITY:
				return validateSimpleActivity((SimpleActivity)value, diagnostics, context);
			case BasicModelPackage.NESTED_ACTIVITY:
				return validateNestedActivity((NestedActivity)value, diagnostics, context);
			case BasicModelPackage.FORKED_THREAD:
				return validateForkedThread((ForkedThread)value, diagnostics, context);
			case BasicModelPackage.NAMED_ACTIVITY:
				return validateNamedActivity((NamedActivity)value, diagnostics, context);
			case BasicModelPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case BasicModelPackage.NESTED_THREAD:
				return validateNestedThread((NestedThread)value, diagnostics, context);
			case BasicModelPackage.INTERRUPTABLE_THREAD:
				return validateInterruptableThread((InterruptableThread)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThread(umlad2javacc.basicmodel.BasicModel.Thread thread, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(thread, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_ProperReferenceName(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_UniqueReferenceName(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validateThread_ValidStartActivityThread(thread, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidStartActivityThread constraint of '<em>Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String THREAD__VALID_START_ACTIVITY_THREAD__EEXPRESSION = "startActivity.thread = self or startActivity.oclIsKindOf(Join) or startActivity.oclIsKindOf(FinalActivity)";

	/**
	 * Validates the ValidStartActivityThread constraint of '<em>Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThread_ValidStartActivityThread(umlad2javacc.basicmodel.BasicModel.Thread thread, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.THREAD,
				 thread,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ValidStartActivityThread",
				 THREAD__VALID_START_ACTIVITY_THREAD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicModel(BasicModel basicModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(basicModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_ProperReferenceName(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_UniqueReferenceName(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateThread_ValidStartActivityThread(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicModel_MatchingForkForEveryJoin(basicModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MatchingForkForEveryJoin constraint of '<em>Basic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASIC_MODEL__MATCHING_FORK_FOR_EVERY_JOIN__EEXPRESSION = "\n" +
		"\t\t\tlet forkThreads: Bag(Thread) = Fork.allInstances()->collect(thread)->asBag() in\n" +
		"\t\t\tlet joinThreads: Bag(Thread) = Join.allInstances()->collect(thread)->asBag() in\n" +
		"\t\t\t\tforkThreads->intersection(joinThreads) = joinThreads";

	/**
	 * Validates the MatchingForkForEveryJoin constraint of '<em>Basic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicModel_MatchingForkForEveryJoin(BasicModel basicModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.BASIC_MODEL,
				 basicModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MatchingForkForEveryJoin",
				 BASIC_MODEL__MATCHING_FORK_FOR_EVERY_JOIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(activity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Reachability constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY__REACHABILITY__EEXPRESSION = "let basicModel: BasicModel = BasicModel.allInstances()->asSequence()->first() in\n" +
		"\t                        let reachableActivities: Set(Activity) = basicModel.startActivity.GetReachableActivities(Set{}) in\n" +
		"\t                            reachableActivities->exists(a | a = self)";

	/**
	 * Validates the Reachability constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_Reachability(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.ACTIVITY,
				 activity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Reachability",
				 ACTIVITY__REACHABILITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnd(End end, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(end, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(end, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(end, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalActivity(FinalActivity finalActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(finalActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(finalActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(finalActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(finalActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(finalActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(finalActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(finalActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(finalActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(finalActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(finalActivity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearActivity(LinearActivity linearActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linearActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linearActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linearActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linearActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linearActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linearActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linearActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linearActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linearActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(linearActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearActivity_ThreadIndependence(linearActivity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ThreadIndependence constraint of '<em>Linear Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINEAR_ACTIVITY__THREAD_INDEPENDENCE__EEXPRESSION = "self.UsesSameThread(nextActivity)";

	/**
	 * Validates the ThreadIndependence constraint of '<em>Linear Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearActivity_ThreadIndependence(LinearActivity linearActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.LINEAR_ACTIVITY,
				 linearActivity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ThreadIndependence",
				 LINEAR_ACTIVITY__THREAD_INDEPENDENCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFork(Fork fork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fork, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateFork_NonNegativeMaxThreadCount(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateFork_ThreadIndependence(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateFork_ValidCorrespondingJoin(fork, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NonNegativeMaxThreadCount constraint of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORK__NON_NEGATIVE_MAX_THREAD_COUNT__EEXPRESSION = "maxThreadCount >= 0";

	/**
	 * Validates the NonNegativeMaxThreadCount constraint of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFork_NonNegativeMaxThreadCount(Fork fork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.FORK,
				 fork,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NonNegativeMaxThreadCount",
				 FORK__NON_NEGATIVE_MAX_THREAD_COUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ThreadIndependence constraint of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORK__THREAD_INDEPENDENCE__EEXPRESSION = "forkedThreads->forAll(t | self.UsesDifferentThread(t.startActivity))";

	/**
	 * Validates the ThreadIndependence constraint of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFork_ThreadIndependence(Fork fork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.FORK,
				 fork,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ThreadIndependence",
				 FORK__THREAD_INDEPENDENCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidCorrespondingJoin constraint of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORK__VALID_CORRESPONDING_JOIN__EEXPRESSION = "correspondingJoin = null or correspondingJoin.thread = thread";

	/**
	 * Validates the ValidCorrespondingJoin constraint of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFork_ValidCorrespondingJoin(Fork fork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.FORK,
				 fork,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ValidCorrespondingJoin",
				 FORK__VALID_CORRESPONDING_JOIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecision(Decision decision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(decision, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecision_ThreadIndependence(decision, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ThreadIndependence constraint of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECISION__THREAD_INDEPENDENCE__EEXPRESSION = "branches->forAll(b | self.UsesSameThread(b.nextActivity))";

	/**
	 * Validates the ThreadIndependence constraint of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecision_ThreadIndependence(Decision decision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ThreadIndependence", getObjectLabel(decision, context) },
						 new Object[] { decision },
						 context));
			}
			return false;
		}
		return validateLinearActivity_ThreadIndependence(decision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(branch, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validateBranch_ValidBranchCondition(branch, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidBranchCondition constraint of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BRANCH__VALID_BRANCH_CONDITION__EEXPRESSION = "true";

	/**
	 * Validates the ValidBranchCondition constraint of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch_ValidBranchCondition(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.BRANCH,
				 branch,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ValidBranchCondition",
				 BRANCH__VALID_BRANCH_CONDITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoin(Join join, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(join, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearActivity_ThreadIndependence(join, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedResource(SharedResource sharedResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sharedResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sharedResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sharedResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sharedResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sharedResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sharedResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sharedResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sharedResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sharedResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_ProperReferenceName(sharedResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_UniqueReferenceName(sharedResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterrupt(Interrupt interrupt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interrupt, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interrupt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interrupt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interrupt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interrupt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interrupt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interrupt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interrupt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interrupt, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(interrupt, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearActivity_ThreadIndependence(interrupt, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstance(Instance instance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_ProperReferenceName(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_UniqueReferenceName(instance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceType(InstanceType instanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSleep(Sleep sleep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sleep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearActivity_ThreadIndependence(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSleep_PositiveSleepDuration(sleep, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PositiveSleepDuration constraint of '<em>Sleep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLEEP__POSITIVE_SLEEP_DURATION__EEXPRESSION = "duration >= 1";

	/**
	 * Validates the PositiveSleepDuration constraint of '<em>Sleep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSleep_PositiveSleepDuration(Sleep sleep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.SLEEP,
				 sleep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PositiveSleepDuration",
				 SLEEP__POSITIVE_SLEEP_DURATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYield(Yield yield, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(yield, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(yield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(yield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(yield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(yield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(yield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(yield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(yield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(yield, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(yield, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearActivity_ThreadIndependence(yield, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleActivity(SimpleActivity simpleActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpleActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearActivity_ThreadIndependence(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedActivity_ProperNamedActivityName(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedActivity_UniqueNamedActivityName(simpleActivity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNestedActivity(NestedActivity nestedActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nestedActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearActivity_ThreadIndependence(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedActivity_ProperNamedActivityName(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedActivity_UniqueNamedActivityName(nestedActivity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkedThread(ForkedThread forkedThread, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(forkedThread, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(forkedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(forkedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(forkedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(forkedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(forkedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(forkedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(forkedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(forkedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_ProperReferenceName(forkedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_UniqueReferenceName(forkedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validateThread_ValidStartActivityThread(forkedThread, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedActivity(NamedActivity namedActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_Reachability(namedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearActivity_ThreadIndependence(namedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedActivity_ProperNamedActivityName(namedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedActivity_UniqueNamedActivityName(namedActivity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProperNamedActivityName constraint of '<em>Named Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMED_ACTIVITY__PROPER_NAMED_ACTIVITY_NAME__EEXPRESSION = "activityName.matches('[A-Za-z_$][A-Za-z0-9_$]*')";

	/**
	 * Validates the ProperNamedActivityName constraint of '<em>Named Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedActivity_ProperNamedActivityName(NamedActivity namedActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.NAMED_ACTIVITY,
				 namedActivity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProperNamedActivityName",
				 NAMED_ACTIVITY__PROPER_NAMED_ACTIVITY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueNamedActivityName constraint of '<em>Named Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMED_ACTIVITY__UNIQUE_NAMED_ACTIVITY_NAME__EEXPRESSION = "Reference.allInstances()->select(r | r.name = activityName and not r.oclIsKindOf(NestedThread))->isEmpty()";

	/**
	 * Validates the UniqueNamedActivityName constraint of '<em>Named Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedActivity_UniqueNamedActivityName(NamedActivity namedActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.NAMED_ACTIVITY,
				 namedActivity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueNamedActivityName",
				 NAMED_ACTIVITY__UNIQUE_NAMED_ACTIVITY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_ProperReferenceName(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_UniqueReferenceName(reference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProperReferenceName constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REFERENCE__PROPER_REFERENCE_NAME__EEXPRESSION = "name.matches('[A-Za-z_$][A-Za-z0-9_$]*')";

	/**
	 * Validates the ProperReferenceName constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_ProperReferenceName(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.REFERENCE,
				 reference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProperReferenceName",
				 REFERENCE__PROPER_REFERENCE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueReferenceName constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REFERENCE__UNIQUE_REFERENCE_NAME__EEXPRESSION = "Reference.allInstances()->select(r | r.name = name and not r.oclIsKindOf(NestedThread))->size() <= 1";

	/**
	 * Validates the UniqueReferenceName constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_UniqueReferenceName(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BasicModelPackage.Literals.REFERENCE,
				 reference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueReferenceName",
				 REFERENCE__UNIQUE_REFERENCE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNestedThread(NestedThread nestedThread, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nestedThread, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nestedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nestedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nestedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nestedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nestedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nestedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nestedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nestedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_ProperReferenceName(nestedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_UniqueReferenceName(nestedThread, diagnostics, context);
		if (result || diagnostics != null) result &= validateThread_ValidStartActivityThread(nestedThread, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptableThread(InterruptableThread interruptableThread, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interruptableThread, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interruptableThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interruptableThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interruptableThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interruptableThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interruptableThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interruptableThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interruptableThread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interruptableThread, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_ProperReferenceName(interruptableThread, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_UniqueReferenceName(interruptableThread, diagnostics, context);
		if (result || diagnostics != null) result &= validateThread_ValidStartActivityThread(interruptableThread, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BasicModelValidator
