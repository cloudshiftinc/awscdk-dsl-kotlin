package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.events.RuleTargetInputProperties
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class LogGroupTargetInput internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.events.targets.LogGroupTargetInput,
) : CdkObject(cdkObject) {
  /**
   * Return the input properties for this input object.
   *
   * @param rule 
   */
  public open fun bind(rule: IRule): RuleTargetInputProperties =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetInputProperties::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.LogGroupTargetInput,
  ) : LogGroupTargetInput(cdkObject)

  public companion object {
    public fun fromObject(): RuleTargetInput =
        software.amazon.awscdk.services.events.targets.LogGroupTargetInput.fromObject().let(RuleTargetInput::wrap)

    public fun fromObject(options: LogGroupTargetInputOptions): RuleTargetInput =
        software.amazon.awscdk.services.events.targets.LogGroupTargetInput.fromObject(options.let(LogGroupTargetInputOptions::unwrap)).let(RuleTargetInput::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("898b6d05b662d8870ea1382acc3991a186e6104ddb70b26df0483ceecd8265c6")
    public fun fromObject(options: LogGroupTargetInputOptions.Builder.() -> Unit): RuleTargetInput =
        fromObject(LogGroupTargetInputOptions(options))

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.LogGroupTargetInput):
        LogGroupTargetInput = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogGroupTargetInput):
        software.amazon.awscdk.services.events.targets.LogGroupTargetInput = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.LogGroupTargetInput
  }
}
