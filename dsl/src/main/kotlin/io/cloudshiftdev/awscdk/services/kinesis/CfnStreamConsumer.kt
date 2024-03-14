package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStreamConsumer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamConsumer,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrConsumerArn(): String = unwrap(this).getAttrConsumerArn()

  public open fun attrConsumerCreationTimestamp(): String =
      unwrap(this).getAttrConsumerCreationTimestamp()

  public open fun attrConsumerName(): String = unwrap(this).getAttrConsumerName()

  public open fun attrConsumerStatus(): String = unwrap(this).getAttrConsumerStatus()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrStreamArn(): String = unwrap(this).getAttrStreamArn()

  public open fun consumerName(): String = unwrap(this).getConsumerName()

  public open fun consumerName(`value`: String) {
    unwrap(this).setConsumerName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun streamArn(): String = unwrap(this).getStreamArn()

  public open fun streamArn(`value`: String) {
    unwrap(this).setStreamArn(`value`)
  }

  public interface Builder {
    public fun consumerName(consumerName: String) {
    }

    public fun streamArn(streamArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.CfnStreamConsumer.Builder =
        software.amazon.awscdk.services.kinesis.CfnStreamConsumer.Builder.create(scope, id)

    public override fun consumerName(consumerName: String) {
      cdkBuilder.consumerName(consumerName)
    }

    public override fun streamArn(streamArn: String) {
      cdkBuilder.streamArn(streamArn)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.CfnStreamConsumer =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStreamConsumer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStreamConsumer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.CfnStreamConsumer):
        CfnStreamConsumer = CfnStreamConsumer(cdkObject)

    internal fun unwrap(wrapped: CfnStreamConsumer):
        software.amazon.awscdk.services.kinesis.CfnStreamConsumer = wrapped.cdkObject
  }
}
