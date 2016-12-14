/**
 */
package ActivityDiagram.util;

import ActivityDiagram.Activity;
import ActivityDiagram.ActivityDiagramPackage;
import ActivityDiagram.BasicModel;
import ActivityDiagram.Branch;
import ActivityDiagram.Decision;
import ActivityDiagram.DescribedActivity;
import ActivityDiagram.End;
import ActivityDiagram.FinalActivity;
import ActivityDiagram.Fork;
import ActivityDiagram.Instance;
import ActivityDiagram.InstanceType;
import ActivityDiagram.Interrupt;
import ActivityDiagram.Join;
import ActivityDiagram.LinearActivity;
import ActivityDiagram.NestedActivity;
import ActivityDiagram.SharedResource;
import ActivityDiagram.SimpleActivity;
import ActivityDiagram.Sleep;
import ActivityDiagram.Yield;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ActivityDiagram.ActivityDiagramPackage
 * @generated
 */
public class ActivityDiagramValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ActivityDiagramValidator INSTANCE = new ActivityDiagramValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ActivityDiagram";

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
	public ActivityDiagramValidator() {
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
	  return ActivityDiagramPackage.eINSTANCE;
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
			case ActivityDiagramPackage.BASIC_MODEL:
				return validateBasicModel((BasicModel)value, diagnostics, context);
			case ActivityDiagramPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case ActivityDiagramPackage.END:
				return validateEnd((End)value, diagnostics, context);
			case ActivityDiagramPackage.FINAL_ACTIVITY:
				return validateFinalActivity((FinalActivity)value, diagnostics, context);
			case ActivityDiagramPackage.LINEAR_ACTIVITY:
				return validateLinearActivity((LinearActivity)value, diagnostics, context);
			case ActivityDiagramPackage.FORK:
				return validateFork((Fork)value, diagnostics, context);
			case ActivityDiagramPackage.DECISION:
				return validateDecision((Decision)value, diagnostics, context);
			case ActivityDiagramPackage.BRANCH:
				return validateBranch((Branch)value, diagnostics, context);
			case ActivityDiagramPackage.JOIN:
				return validateJoin((Join)value, diagnostics, context);
			case ActivityDiagramPackage.SHARED_RESOURCE:
				return validateSharedResource((SharedResource)value, diagnostics, context);
			case ActivityDiagramPackage.INTERRUPT:
				return validateInterrupt((Interrupt)value, diagnostics, context);
			case ActivityDiagramPackage.INSTANCE:
				return validateInstance((Instance)value, diagnostics, context);
			case ActivityDiagramPackage.INSTANCE_TYPE:
				return validateInstanceType((InstanceType)value, diagnostics, context);
			case ActivityDiagramPackage.SLEEP:
				return validateSleep((Sleep)value, diagnostics, context);
			case ActivityDiagramPackage.THREAD:
				return validateThread((ActivityDiagram.Thread)value, diagnostics, context);
			case ActivityDiagramPackage.YIELD:
				return validateYield((Yield)value, diagnostics, context);
			case ActivityDiagramPackage.SIMPLE_ACTIVITY:
				return validateSimpleActivity((SimpleActivity)value, diagnostics, context);
			case ActivityDiagramPackage.NESTED_ACTIVITY:
				return validateNestedActivity((NestedActivity)value, diagnostics, context);
			case ActivityDiagramPackage.DESCRIBED_ACTIVITY:
				return validateDescribedActivity((DescribedActivity)value, diagnostics, context);
			default:
				return true;
		}
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
		if (result || diagnostics != null) result &= validateBasicModel_UniqueNames1(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicModel_UniqueNames2(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicModel_ValidForkJoinUsage1(basicModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicModel_ValidForkJoinUsage2(basicModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueNames1 constraint of '<em>Basic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASIC_MODEL__UNIQUE_NAMES1__EEXPRESSION = "activities->collect(a | a.name)->isUnique(n | n)";

	/**
	 * Validates the UniqueNames1 constraint of '<em>Basic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicModel_UniqueNames1(BasicModel basicModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivityDiagramPackage.Literals.BASIC_MODEL,
				 basicModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueNames1",
				 BASIC_MODEL__UNIQUE_NAMES1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueNames2 constraint of '<em>Basic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASIC_MODEL__UNIQUE_NAMES2__EEXPRESSION = "\n" +
		"\t\t\tlet resourceNames: Bag(String) = SharedResource.allInstances()->collect(r | r.name) in\n" +
		"\t\t\tlet instanceNames: Bag(String) = Instance.allInstances()->collect(i | i.name) in\n" +
		"\t\t\tlet instanceTypeNames: Bag(String) = InstanceType.allInstances()->collect(t | t.name) in\n" +
		"\t\t\tlet activityDescriptions: Bag(String) = DescribedActivity.allInstances()->collect(a | a.description) in\n" +
		"\t\t\t    resourceNames->union(instanceNames->union(instanceTypeNames->union(activityDescriptions->asSet()->asBag())))->isUnique(n | n)";

	/**
	 * Validates the UniqueNames2 constraint of '<em>Basic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicModel_UniqueNames2(BasicModel basicModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivityDiagramPackage.Literals.BASIC_MODEL,
				 basicModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueNames2",
				 BASIC_MODEL__UNIQUE_NAMES2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidForkJoinUsage1 constraint of '<em>Basic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASIC_MODEL__VALID_FORK_JOIN_USAGE1__EEXPRESSION = "startActivity.JoinsCorrectly()->includesAll(Activity.allInstances())";

	/**
	 * Validates the ValidForkJoinUsage1 constraint of '<em>Basic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicModel_ValidForkJoinUsage1(BasicModel basicModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivityDiagramPackage.Literals.BASIC_MODEL,
				 basicModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ValidForkJoinUsage1",
				 BASIC_MODEL__VALID_FORK_JOIN_USAGE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidForkJoinUsage2 constraint of '<em>Basic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASIC_MODEL__VALID_FORK_JOIN_USAGE2__EEXPRESSION = "\n" +
		"\t\t\tlet forkThreads: Bag(Thread) = Fork.allInstances()->collect(thread)->asBag() in\n" +
		"\t\t\tlet joinThreads: Bag(Thread) = Join.allInstances()->collect(thread)->asBag() in\n" +
		"\t\t\t\tforkThreads->intersection(joinThreads) = joinThreads";

	/**
	 * Validates the ValidForkJoinUsage2 constraint of '<em>Basic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicModel_ValidForkJoinUsage2(BasicModel basicModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivityDiagramPackage.Literals.BASIC_MODEL,
				 basicModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ValidForkJoinUsage2",
				 BASIC_MODEL__VALID_FORK_JOIN_USAGE2__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(activity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProperActivityName constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY__PROPER_ACTIVITY_NAME__EEXPRESSION = "name.matches('[A-Za-z_$][A-Za-z0-9_$]*')";

	/**
	 * Validates the ProperActivityName constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_ProperActivityName(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivityDiagramPackage.Literals.ACTIVITY,
				 activity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProperActivityName",
				 ACTIVITY__PROPER_ACTIVITY_NAME__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(end, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(finalActivity, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(linearActivity, diagnostics, context);
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
				(ActivityDiagramPackage.Literals.LINEAR_ACTIVITY,
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
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateFork_NonNegativeThreadCount(fork, diagnostics, context);
		if (result || diagnostics != null) result &= validateFork_ThreadIndependence(fork, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NonNegativeThreadCount constraint of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORK__NON_NEGATIVE_THREAD_COUNT__EEXPRESSION = "threadCount >= 0";

	/**
	 * Validates the NonNegativeThreadCount constraint of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFork_NonNegativeThreadCount(Fork fork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivityDiagramPackage.Literals.FORK,
				 fork,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NonNegativeThreadCount",
				 FORK__NON_NEGATIVE_THREAD_COUNT__EEXPRESSION,
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
	protected static final String FORK__THREAD_INDEPENDENCE__EEXPRESSION = "threads->forAll(t | self.UsesDifferentThread(t.activity))";

	/**
	 * Validates the ThreadIndependence constraint of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFork_ThreadIndependence(Fork fork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivityDiagramPackage.Literals.FORK,
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
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecision_ThreadIndependence(decision, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ThreadIndependence constraint of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECISION__THREAD_INDEPENDENCE__EEXPRESSION = "branches->forAll(b | self.UsesSameThread(b.activity))";

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
				(ActivityDiagramPackage.Literals.BRANCH,
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
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(join, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateSharedResource_ValidSharedResourceName(sharedResource, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidSharedResourceName constraint of '<em>Shared Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHARED_RESOURCE__VALID_SHARED_RESOURCE_NAME__EEXPRESSION = "name.matches('[A-Za-z_$][A-Za-z0-9_$]*')";

	/**
	 * Validates the ValidSharedResourceName constraint of '<em>Shared Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedResource_ValidSharedResourceName(SharedResource sharedResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivityDiagramPackage.Literals.SHARED_RESOURCE,
				 sharedResource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ValidSharedResourceName",
				 SHARED_RESOURCE__VALID_SHARED_RESOURCE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(interrupt, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateInstance_ProperInstanceName(instance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProperInstanceName constraint of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANCE__PROPER_INSTANCE_NAME__EEXPRESSION = "name.matches('[A-Za-z_$][A-Za-z0-9_$]*')";

	/**
	 * Validates the ProperInstanceName constraint of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstance_ProperInstanceName(Instance instance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivityDiagramPackage.Literals.INSTANCE,
				 instance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProperInstanceName",
				 INSTANCE__PROPER_INSTANCE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceType(InstanceType instanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceType, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceType_ProperInstanceTypeName(instanceType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProperInstanceTypeName constraint of '<em>Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANCE_TYPE__PROPER_INSTANCE_TYPE_NAME__EEXPRESSION = "name.matches('[A-Za-z_$][A-Za-z0-9_$]*')";

	/**
	 * Validates the ProperInstanceTypeName constraint of '<em>Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceType_ProperInstanceTypeName(InstanceType instanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivityDiagramPackage.Literals.INSTANCE_TYPE,
				 instanceType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProperInstanceTypeName",
				 INSTANCE_TYPE__PROPER_INSTANCE_TYPE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(sleep, diagnostics, context);
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
				(ActivityDiagramPackage.Literals.SLEEP,
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
	public boolean validateThread(ActivityDiagram.Thread thread, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(thread, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validateThread_ThreadIndependence(thread, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ThreadIndependence constraint of '<em>Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String THREAD__THREAD_INDEPENDENCE__EEXPRESSION = "activity.thread = self";

	/**
	 * Validates the ThreadIndependence constraint of '<em>Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThread_ThreadIndependence(ActivityDiagram.Thread thread, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivityDiagramPackage.Literals.THREAD,
				 thread,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ThreadIndependence",
				 THREAD__THREAD_INDEPENDENCE__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(yield, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearActivity_ThreadIndependence(simpleActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescribedActivity_ProperActivityDescription(simpleActivity, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearActivity_ThreadIndependence(nestedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescribedActivity_ProperActivityDescription(nestedActivity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescribedActivity(DescribedActivity describedActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(describedActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(describedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(describedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(describedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(describedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(describedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(describedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(describedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(describedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_ProperActivityName(describedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinearActivity_ThreadIndependence(describedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescribedActivity_ProperActivityDescription(describedActivity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProperActivityDescription constraint of '<em>Described Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESCRIBED_ACTIVITY__PROPER_ACTIVITY_DESCRIPTION__EEXPRESSION = "description.matches('[A-Za-z_$][A-Za-z0-9_$]*')";

	/**
	 * Validates the ProperActivityDescription constraint of '<em>Described Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescribedActivity_ProperActivityDescription(DescribedActivity describedActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivityDiagramPackage.Literals.DESCRIBED_ACTIVITY,
				 describedActivity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProperActivityDescription",
				 DESCRIBED_ACTIVITY__PROPER_ACTIVITY_DESCRIPTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //ActivityDiagramValidator
