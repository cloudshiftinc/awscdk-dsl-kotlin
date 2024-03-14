package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.services.codestarnotifications.DetailType
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface PipelineNotifyOnOptions : NotificationRuleOptions {
  public fun events(): List<PipelineNotificationEvents>

  public interface Builder {
    public fun detailType(detailType: DetailType) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun events(events: List<PipelineNotificationEvents>) {
    }

    public fun notificationRuleName(notificationRuleName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions.Builder =
        software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions.builder()

    public override fun detailType(detailType: DetailType) {
      cdkBuilder.detailType(detailType.let(DetailType::unwrap))
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun events(events: List<PipelineNotificationEvents>) {
      cdkBuilder.events(events.map(PipelineNotificationEvents::unwrap))
    }

    public override fun notificationRuleName(notificationRuleName: String) {
      cdkBuilder.notificationRuleName(notificationRuleName)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions,
  ) : PipelineNotifyOnOptions {
    public override fun detailType(): DetailType? =
        unwrap(this).getDetailType()?.let(DetailType::wrap)

    public override fun enabled(): Boolean? = unwrap(this).getEnabled()

    public override fun events(): List<PipelineNotificationEvents> =
        unwrap(this).getEvents().map(PipelineNotificationEvents::wrap)

    public override fun notificationRuleName(): String? = unwrap(this).getNotificationRuleName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PipelineNotifyOnOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions):
        PipelineNotifyOnOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PipelineNotifyOnOptions):
        software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions = (wrapped as
        Wrapper).cdkObject
  }
}
