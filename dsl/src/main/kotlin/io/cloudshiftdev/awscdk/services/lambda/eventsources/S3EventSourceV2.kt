package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.lambda.IEventSource
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.s3.EventType
import io.cloudshiftdev.awscdk.services.s3.NotificationKeyFilter
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.awscdk.services.s3.IBucket as CloudshiftdevAwscdkServicesS3IBucket
import software.amazon.awscdk.services.s3.IBucket as AmazonAwscdkServicesS3IBucket

public open class S3EventSourceV2 internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2,
) : CdkObject(cdkObject), IEventSource {
  /**
   * Called by `lambda.addEventSource` to allow the event source to bind to this function.
   *
   * @param target 
   */
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.eventsources.S3EventSourceV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The s3 event types that will trigger the notification.
     *
     * @param events The s3 event types that will trigger the notification. 
     */
    public fun events(events: List<EventType>)

    /**
     * The s3 event types that will trigger the notification.
     *
     * @param events The s3 event types that will trigger the notification. 
     */
    public fun events(vararg events: EventType)

    /**
     * S3 object key filter rules to determine which objects trigger this event.
     *
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     *
     * @param filters S3 object key filter rules to determine which objects trigger this event. 
     */
    public fun filters(filters: List<NotificationKeyFilter>)

    /**
     * S3 object key filter rules to determine which objects trigger this event.
     *
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     *
     * @param filters S3 object key filter rules to determine which objects trigger this event. 
     */
    public fun filters(vararg filters: NotificationKeyFilter)
  }

  private class BuilderImpl(
    bucket: AmazonAwscdkServicesS3IBucket,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2.Builder =
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2.Builder.create(bucket)

    /**
     * The s3 event types that will trigger the notification.
     *
     * @param events The s3 event types that will trigger the notification. 
     */
    override fun events(events: List<EventType>) {
      cdkBuilder.events(events.map(EventType::unwrap))
    }

    /**
     * The s3 event types that will trigger the notification.
     *
     * @param events The s3 event types that will trigger the notification. 
     */
    override fun events(vararg events: EventType): Unit = events(events.toList())

    /**
     * S3 object key filter rules to determine which objects trigger this event.
     *
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     *
     * @param filters S3 object key filter rules to determine which objects trigger this event. 
     */
    override fun filters(filters: List<NotificationKeyFilter>) {
      cdkBuilder.filters(filters.map(NotificationKeyFilter::unwrap))
    }

    /**
     * S3 object key filter rules to determine which objects trigger this event.
     *
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     *
     * @param filters S3 object key filter rules to determine which objects trigger this event. 
     */
    override fun filters(vararg filters: NotificationKeyFilter): Unit = filters(filters.toList())

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2 =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(bucket: CloudshiftdevAwscdkServicesS3IBucket,
        block: Builder.() -> Unit = {}): S3EventSourceV2 {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesS3IBucket.unwrap(bucket))
      return S3EventSourceV2(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2):
        S3EventSourceV2 = S3EventSourceV2(cdkObject)

    internal fun unwrap(wrapped: S3EventSourceV2):
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2 = wrapped.cdkObject
  }
}
