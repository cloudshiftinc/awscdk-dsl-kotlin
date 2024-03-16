@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * An abstract target for EventRules.
 */
public interface IRuleTarget {
  /**
   * Returns the rule target specification.
   *
   * NOTE: Do not use the various `inputXxx` options. They can be set in a call to `addTarget`.
   *
   * @param rule The EventBridge Rule that would trigger this target. 
   * @param id The id of the target that will be attached to the rule.
   */
  public fun bind(rule: IRule): RuleTargetConfig

  /**
   * Returns the rule target specification.
   *
   * NOTE: Do not use the various `inputXxx` options. They can be set in a call to `addTarget`.
   *
   * @param rule The EventBridge Rule that would trigger this target. 
   * @param id The id of the target that will be attached to the rule.
   */
  public fun bind(rule: IRule, id: String): RuleTargetConfig

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IRuleTarget): IRuleTarget =
        CdkObjectWrappers.wrap(cdkObject) as IRuleTarget

    internal fun unwrap(wrapped: IRuleTarget): software.amazon.awscdk.services.events.IRuleTarget =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.events.IRuleTarget
  }
}
