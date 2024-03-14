package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.Unit

public interface CfnAutoScalingScheduledAction {
  public fun ignoreUnmodifiedGroupSizeProperties(): Boolean? =
      unwrap(this).getIgnoreUnmodifiedGroupSizeProperties()

  public interface Builder {
    public fun ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnAutoScalingScheduledAction.Builder =
        software.amazon.awscdk.CfnAutoScalingScheduledAction.builder()

    override fun ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties: Boolean) {
      cdkBuilder.ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties)
    }

    public fun build(): software.amazon.awscdk.CfnAutoScalingScheduledAction = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnAutoScalingScheduledAction,
  ) : CfnAutoScalingScheduledAction {
    override fun ignoreUnmodifiedGroupSizeProperties(): Boolean? =
        unwrap(this).getIgnoreUnmodifiedGroupSizeProperties()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutoScalingScheduledAction {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnAutoScalingScheduledAction):
        CfnAutoScalingScheduledAction = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingScheduledAction):
        software.amazon.awscdk.CfnAutoScalingScheduledAction = (wrapped as Wrapper).cdkObject
  }
}
