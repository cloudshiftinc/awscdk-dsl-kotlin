package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApprovedOrigin internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnApprovedOrigin,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceId(): String = unwrap(this).getInstanceId()

  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  public open fun origin(): String = unwrap(this).getOrigin()

  public open fun origin(`value`: String) {
    unwrap(this).setOrigin(`value`)
  }

  public interface Builder {
    public fun instanceId(instanceId: String) {
    }

    public fun origin(origin: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnApprovedOrigin.Builder =
        software.amazon.awscdk.services.connect.CfnApprovedOrigin.Builder.create(scope, id)

    public override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    public override fun origin(origin: String) {
      cdkBuilder.origin(origin)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnApprovedOrigin =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApprovedOrigin {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApprovedOrigin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnApprovedOrigin):
        CfnApprovedOrigin = CfnApprovedOrigin(cdkObject)

    internal fun unwrap(wrapped: CfnApprovedOrigin):
        software.amazon.awscdk.services.connect.CfnApprovedOrigin = wrapped.cdkObject
  }
}
