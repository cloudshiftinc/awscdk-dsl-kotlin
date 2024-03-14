package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.kinesisfirehose.CfnDeliveryStream as CloudshiftdevAwscdkServicesKinesisfirehoseCfnDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream as AmazonAwscdkServicesKinesisfirehoseCfnDeliveryStream

public open class KinesisFirehoseStream internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.events.targets.KinesisFirehoseStream,
) : CdkObject(cdkObject), IRuleTarget {
  /**
   * Returns a RuleTarget that can be used to trigger this Firehose Stream as a result from a Event
   * Bridge event.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(_rule: IRule): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger this Firehose Stream as a result from a Event
   * Bridge event.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(_rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.KinesisFirehoseStream].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire Event Bridge event
     *
     * @param message The message to send to the stream. 
     */
    public fun message(message: RuleTargetInput)
  }

  private class BuilderImpl(
    stream: AmazonAwscdkServicesKinesisfirehoseCfnDeliveryStream,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStream.Builder =
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStream.Builder.create(stream)

    /**
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire Event Bridge event
     *
     * @param message The message to send to the stream. 
     */
    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.KinesisFirehoseStream =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(stream: CloudshiftdevAwscdkServicesKinesisfirehoseCfnDeliveryStream,
        block: Builder.() -> Unit = {}): KinesisFirehoseStream {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesKinesisfirehoseCfnDeliveryStream.unwrap(stream))
      return KinesisFirehoseStream(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.KinesisFirehoseStream):
        KinesisFirehoseStream = KinesisFirehoseStream(cdkObject)

    internal fun unwrap(wrapped: KinesisFirehoseStream):
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStream = wrapped.cdkObject
  }
}
