package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnChannelPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannelPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun channelName(): String = unwrap(this).getChannelName()

  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policy(): Any = unwrap(this).getPolicy()

  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  public interface Builder {
    public fun channelName(channelName: String) {
    }

    public fun policy(policy: Any) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnChannelPolicy.Builder =
        software.amazon.awscdk.services.mediatailor.CfnChannelPolicy.Builder.create(scope, id)

    public override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    public override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnChannelPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannelPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannelPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannelPolicy):
        CfnChannelPolicy = CfnChannelPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnChannelPolicy):
        software.amazon.awscdk.services.mediatailor.CfnChannelPolicy = wrapped.cdkObject
  }
}
