package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface PolicyViolationBeta1 {
  public fun description(): String

  public fun fix(): String? = unwrap(this).getFix()

  public fun ruleMetadata(): Map<String, String> = unwrap(this).getRuleMetadata() ?: emptyMap()

  public fun ruleName(): String

  public fun severity(): String? = unwrap(this).getSeverity()

  public fun violatingResources(): List<PolicyViolatingResourceBeta1>

  public interface Builder {
    public fun description(description: String) {
    }

    public fun fix(fix: String) {
    }

    public fun ruleMetadata(ruleMetadata: Map<String, String>) {
    }

    public fun ruleName(ruleName: String) {
    }

    public fun severity(severity: String) {
    }

    public fun violatingResources(violatingResources: List<PolicyViolatingResourceBeta1>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.PolicyViolationBeta1.Builder =
        software.amazon.awscdk.PolicyViolationBeta1.builder()

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun fix(fix: String) {
      cdkBuilder.fix(fix)
    }

    public override fun ruleMetadata(ruleMetadata: Map<String, String>) {
      cdkBuilder.ruleMetadata(ruleMetadata)
    }

    public override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    public override fun severity(severity: String) {
      cdkBuilder.severity(severity)
    }

    public override fun violatingResources(violatingResources: List<PolicyViolatingResourceBeta1>) {
      cdkBuilder.violatingResources(violatingResources.map(PolicyViolatingResourceBeta1::unwrap))
    }

    public fun build(): software.amazon.awscdk.PolicyViolationBeta1 = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.PolicyViolationBeta1,
  ) : PolicyViolationBeta1 {
    public override fun description(): String = unwrap(this).getDescription()

    public override fun fix(): String? = unwrap(this).getFix()

    public override fun ruleMetadata(): Map<String, String> = unwrap(this).getRuleMetadata() ?:
        emptyMap()

    public override fun ruleName(): String = unwrap(this).getRuleName()

    public override fun severity(): String? = unwrap(this).getSeverity()

    public override fun violatingResources(): List<PolicyViolatingResourceBeta1> =
        unwrap(this).getViolatingResources().map(PolicyViolatingResourceBeta1::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyViolationBeta1 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.PolicyViolationBeta1): PolicyViolationBeta1
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyViolationBeta1): software.amazon.awscdk.PolicyViolationBeta1
        = (wrapped as Wrapper).cdkObject
  }
}
