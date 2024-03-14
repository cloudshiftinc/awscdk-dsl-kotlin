package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EventSourceMapping internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.EventSourceMapping,
) : Resource(cdkObject), IEventSourceMapping {
  public override fun eventSourceMappingArn(): String = unwrap(this).getEventSourceMappingArn()

  public override fun eventSourceMappingId(): String = unwrap(this).getEventSourceMappingId()

  public interface Builder {
    public fun batchSize(batchSize: Number) {
    }

    public fun bisectBatchOnError(bisectBatchOnError: Boolean) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun eventSourceArn(eventSourceArn: String) {
    }

    public fun filters(filters: List<Map<String, Any>>) {
    }

    public fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>) {
    }

    public fun kafkaConsumerGroupId(kafkaConsumerGroupId: String) {
    }

    public fun kafkaTopic(kafkaTopic: String) {
    }

    public fun maxBatchingWindow(maxBatchingWindow: Duration) {
    }

    public fun maxConcurrency(maxConcurrency: Number) {
    }

    public fun maxRecordAge(maxRecordAge: Duration) {
    }

    public fun onFailure(onFailure: IEventSourceDlq) {
    }

    public fun parallelizationFactor(parallelizationFactor: Number) {
    }

    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
    }

    public fun retryAttempts(retryAttempts: Number) {
    }

    public
        fun sourceAccessConfigurations(sourceAccessConfigurations: List<SourceAccessConfiguration>) {
    }

    public fun startingPosition(startingPosition: StartingPosition) {
    }

    public fun startingPositionTimestamp(startingPositionTimestamp: Number) {
    }

    public fun supportS3OnFailureDestination(supportS3OnFailureDestination: Boolean) {
    }

    public fun target(target: IFunction) {
    }

    public fun tumblingWindow(tumblingWindow: Duration) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EventSourceMapping.Builder =
        software.amazon.awscdk.services.lambda.EventSourceMapping.Builder.create(scope, id)

    public override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    public override fun bisectBatchOnError(bisectBatchOnError: Boolean) {
      cdkBuilder.bisectBatchOnError(bisectBatchOnError)
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun eventSourceArn(eventSourceArn: String) {
      cdkBuilder.eventSourceArn(eventSourceArn)
    }

    public override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    public override fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>) {
      cdkBuilder.kafkaBootstrapServers(kafkaBootstrapServers)
    }

    public override fun kafkaConsumerGroupId(kafkaConsumerGroupId: String) {
      cdkBuilder.kafkaConsumerGroupId(kafkaConsumerGroupId)
    }

    public override fun kafkaTopic(kafkaTopic: String) {
      cdkBuilder.kafkaTopic(kafkaTopic)
    }

    public override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration::unwrap))
    }

    public override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    public override fun maxRecordAge(maxRecordAge: Duration) {
      cdkBuilder.maxRecordAge(maxRecordAge.let(Duration::unwrap))
    }

    public override fun onFailure(onFailure: IEventSourceDlq) {
      cdkBuilder.onFailure(onFailure.let(IEventSourceDlq::unwrap))
    }

    public override fun parallelizationFactor(parallelizationFactor: Number) {
      cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    public override fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
      cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
    }

    public override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public override
        fun sourceAccessConfigurations(sourceAccessConfigurations: List<SourceAccessConfiguration>) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.map(SourceAccessConfiguration::unwrap))
    }

    public override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition::unwrap))
    }

    public override fun startingPositionTimestamp(startingPositionTimestamp: Number) {
      cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    public override fun supportS3OnFailureDestination(supportS3OnFailureDestination: Boolean) {
      cdkBuilder.supportS3OnFailureDestination(supportS3OnFailureDestination)
    }

    public override fun target(target: IFunction) {
      cdkBuilder.target(target.let(IFunction::unwrap))
    }

    public override fun tumblingWindow(tumblingWindow: Duration) {
      cdkBuilder.tumblingWindow(tumblingWindow.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.EventSourceMapping =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromEventSourceMappingId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      eventSourceMappingId: String,
    ): IEventSourceMapping =
        software.amazon.awscdk.services.lambda.EventSourceMapping.fromEventSourceMappingId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, eventSourceMappingId).let(IEventSourceMapping::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EventSourceMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EventSourceMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EventSourceMapping):
        EventSourceMapping = EventSourceMapping(cdkObject)

    internal fun unwrap(wrapped: EventSourceMapping):
        software.amazon.awscdk.services.lambda.EventSourceMapping = wrapped.cdkObject
  }
}
