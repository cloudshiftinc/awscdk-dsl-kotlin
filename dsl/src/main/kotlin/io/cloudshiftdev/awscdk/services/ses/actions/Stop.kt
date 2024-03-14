package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ses.IReceiptRule
import io.cloudshiftdev.awscdk.services.ses.IReceiptRuleAction
import io.cloudshiftdev.awscdk.services.ses.ReceiptRuleActionConfig
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

public open class Stop internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.actions.Stop,
) : CdkObject(cdkObject), IReceiptRuleAction {
  /**
   * Returns the receipt rule action specification.
   *
   * @param _rule 
   */
  public override fun bind(_rule: IReceiptRule): ReceiptRuleActionConfig =
      unwrap(this).bind(_rule.let(IReceiptRule::unwrap)).let(ReceiptRuleActionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.actions.Stop].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The SNS topic to notify when the stop action is taken.
     *
     * @param topic The SNS topic to notify when the stop action is taken. 
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.Stop.Builder =
        software.amazon.awscdk.services.ses.actions.Stop.Builder.create()

    /**
     * The SNS topic to notify when the stop action is taken.
     *
     * @param topic The SNS topic to notify when the stop action is taken. 
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.Stop = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Stop {
      val builderImpl = BuilderImpl()
      return Stop(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.Stop): Stop =
        Stop(cdkObject)

    internal fun unwrap(wrapped: Stop): software.amazon.awscdk.services.ses.actions.Stop =
        wrapped.cdkObject
  }
}
