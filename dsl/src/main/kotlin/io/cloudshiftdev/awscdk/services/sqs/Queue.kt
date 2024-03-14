package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Queue internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sqs.Queue,
) : QueueBase(cdkObject) {
  public open fun deadLetterQueue(): DeadLetterQueue? =
      unwrap(this).getDeadLetterQueue()?.let(DeadLetterQueue::wrap)

  public override fun encryptionMasterKey(): IKey? =
      unwrap(this).getEncryptionMasterKey()?.let(IKey::wrap)

  public override fun encryptionType(): QueueEncryption? =
      unwrap(this).getEncryptionType()?.let(QueueEncryption::wrap)

  public override fun fifo(): Boolean = unwrap(this).getFifo()

  public override fun queueArn(): String = unwrap(this).getQueueArn()

  public override fun queueName(): String = unwrap(this).getQueueName()

  public override fun queueUrl(): String = unwrap(this).getQueueUrl()

  public interface Builder {
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
    }

    public fun dataKeyReuse(dataKeyReuse: Duration) {
    }

    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueue) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97f5b14d7b02b73465dced58cc2d1f94d5c49dda8daae774bd8488adcfac5df2")
    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueue.Builder.() -> Unit) {
    }

    public fun deduplicationScope(deduplicationScope: DeduplicationScope) {
    }

    public fun deliveryDelay(deliveryDelay: Duration) {
    }

    public fun encryption(encryption: QueueEncryption) {
    }

    public fun encryptionMasterKey(encryptionMasterKey: IKey) {
    }

    public fun enforceSsl(enforceSsl: Boolean) {
    }

    public fun fifo(fifo: Boolean) {
    }

    public fun fifoThroughputLimit(fifoThroughputLimit: FifoThroughputLimit) {
    }

    public fun maxMessageSizeBytes(maxMessageSizeBytes: Number) {
    }

    public fun queueName(queueName: String) {
    }

    public fun receiveMessageWaitTime(receiveMessageWaitTime: Duration) {
    }

    public fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bda4096d045a478f2b31ab46f72925fb4078b6516e4a5c1eef3f25da474a121")
    public fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy.Builder.() -> Unit) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }

    public fun retentionPeriod(retentionPeriod: Duration) {
    }

    public fun visibilityTimeout(visibilityTimeout: Duration) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.Queue.Builder =
        software.amazon.awscdk.services.sqs.Queue.Builder.create(scope, id)

    public override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    public override fun dataKeyReuse(dataKeyReuse: Duration) {
      cdkBuilder.dataKeyReuse(dataKeyReuse.let(Duration::unwrap))
    }

    public override fun deadLetterQueue(deadLetterQueue: DeadLetterQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(DeadLetterQueue::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97f5b14d7b02b73465dced58cc2d1f94d5c49dda8daae774bd8488adcfac5df2")
    public override fun deadLetterQueue(deadLetterQueue: DeadLetterQueue.Builder.() -> Unit): Unit =
        deadLetterQueue(DeadLetterQueue(deadLetterQueue))

    public override fun deduplicationScope(deduplicationScope: DeduplicationScope) {
      cdkBuilder.deduplicationScope(deduplicationScope.let(DeduplicationScope::unwrap))
    }

    public override fun deliveryDelay(deliveryDelay: Duration) {
      cdkBuilder.deliveryDelay(deliveryDelay.let(Duration::unwrap))
    }

    public override fun encryption(encryption: QueueEncryption) {
      cdkBuilder.encryption(encryption.let(QueueEncryption::unwrap))
    }

    public override fun encryptionMasterKey(encryptionMasterKey: IKey) {
      cdkBuilder.encryptionMasterKey(encryptionMasterKey.let(IKey::unwrap))
    }

    public override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    public override fun fifo(fifo: Boolean) {
      cdkBuilder.fifo(fifo)
    }

    public override fun fifoThroughputLimit(fifoThroughputLimit: FifoThroughputLimit) {
      cdkBuilder.fifoThroughputLimit(fifoThroughputLimit.let(FifoThroughputLimit::unwrap))
    }

    public override fun maxMessageSizeBytes(maxMessageSizeBytes: Number) {
      cdkBuilder.maxMessageSizeBytes(maxMessageSizeBytes)
    }

    public override fun queueName(queueName: String) {
      cdkBuilder.queueName(queueName)
    }

    public override fun receiveMessageWaitTime(receiveMessageWaitTime: Duration) {
      cdkBuilder.receiveMessageWaitTime(receiveMessageWaitTime.let(Duration::unwrap))
    }

    public override fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy) {
      cdkBuilder.redriveAllowPolicy(redriveAllowPolicy.let(RedriveAllowPolicy::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bda4096d045a478f2b31ab46f72925fb4078b6516e4a5c1eef3f25da474a121")
    public override
        fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy.Builder.() -> Unit): Unit =
        redriveAllowPolicy(RedriveAllowPolicy(redriveAllowPolicy))

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun retentionPeriod(retentionPeriod: Duration) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(Duration::unwrap))
    }

    public override fun visibilityTimeout(visibilityTimeout: Duration) {
      cdkBuilder.visibilityTimeout(visibilityTimeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sqs.Queue = cdkBuilder.build()
  }

  public companion object {
    public open fun fromQueueArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      queueArn: String,
    ): IQueue =
        software.amazon.awscdk.services.sqs.Queue.fromQueueArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, queueArn).let(IQueue::wrap)

    public open fun fromQueueAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: QueueAttributes,
    ): IQueue =
        software.amazon.awscdk.services.sqs.Queue.fromQueueAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(QueueAttributes::unwrap)).let(IQueue::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e7908d25798651fbd0c90d97212232d58887dfc0aa75b4d5f4c6e87ff68d1bd")
    public open fun fromQueueAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: QueueAttributes.Builder.() -> Unit,
    ): IQueue = fromQueueAttributes(scope, id, QueueAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Queue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Queue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.Queue): Queue =
        Queue(cdkObject)

    internal fun unwrap(wrapped: Queue): software.amazon.awscdk.services.sqs.Queue =
        wrapped.cdkObject
  }
}
