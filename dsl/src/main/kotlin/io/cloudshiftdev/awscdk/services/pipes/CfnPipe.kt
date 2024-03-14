package io.cloudshiftdev.awscdk.services.pipes

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPipe internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pipes.CfnPipe,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrCurrentState(): String = unwrap(this).getAttrCurrentState()

  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  public open fun attrStateReason(): String = unwrap(this).getAttrStateReason()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun desiredState(): String? = unwrap(this).getDesiredState()

  public open fun desiredState(`value`: String) {
    unwrap(this).setDesiredState(`value`)
  }

  public open fun enrichment(): String? = unwrap(this).getEnrichment()

  public open fun enrichment(`value`: String) {
    unwrap(this).setEnrichment(`value`)
  }

  public open fun enrichmentParameters(): Any? = unwrap(this).getEnrichmentParameters()

  public open fun enrichmentParameters(`value`: IResolvable) {
    unwrap(this).setEnrichmentParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun enrichmentParameters(`value`: PipeEnrichmentParametersProperty) {
    unwrap(this).setEnrichmentParameters(`value`.let(PipeEnrichmentParametersProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("734f2d779d00918203f2c55a79edee77318ed044d7396502fe53959af0029d5a")
  public open
      fun enrichmentParameters(`value`: PipeEnrichmentParametersProperty.Builder.() -> Unit): Unit =
      enrichmentParameters(PipeEnrichmentParametersProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  public open fun logConfiguration(`value`: IResolvable) {
    unwrap(this).setLogConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun logConfiguration(`value`: PipeLogConfigurationProperty) {
    unwrap(this).setLogConfiguration(`value`.let(PipeLogConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1917a1cb44ecb163b5d615a1a88558970ecee80240cfde3ef73fe7582bf07b5f")
  public open fun logConfiguration(`value`: PipeLogConfigurationProperty.Builder.() -> Unit): Unit =
      logConfiguration(PipeLogConfigurationProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun source(): String = unwrap(this).getSource()

  public open fun source(`value`: String) {
    unwrap(this).setSource(`value`)
  }

  public open fun sourceParameters(): Any? = unwrap(this).getSourceParameters()

  public open fun sourceParameters(`value`: IResolvable) {
    unwrap(this).setSourceParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceParameters(`value`: PipeSourceParametersProperty) {
    unwrap(this).setSourceParameters(`value`.let(PipeSourceParametersProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4c64beee58f4a4b4598a6e838d69e46a3b019cf579766f5736c8a98ad4a88007")
  public open fun sourceParameters(`value`: PipeSourceParametersProperty.Builder.() -> Unit): Unit =
      sourceParameters(PipeSourceParametersProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun target(): String = unwrap(this).getTarget()

  public open fun target(`value`: String) {
    unwrap(this).setTarget(`value`)
  }

  public open fun targetParameters(): Any? = unwrap(this).getTargetParameters()

  public open fun targetParameters(`value`: IResolvable) {
    unwrap(this).setTargetParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun targetParameters(`value`: PipeTargetParametersProperty) {
    unwrap(this).setTargetParameters(`value`.let(PipeTargetParametersProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd31aaec916ec2a451df6cf82781920abdbca84fbce71ac90881d8e4f203a070")
  public open fun targetParameters(`value`: PipeTargetParametersProperty.Builder.() -> Unit): Unit =
      targetParameters(PipeTargetParametersProperty(`value`))

  public interface Builder {
    public fun description(description: String) {
    }

    public fun desiredState(desiredState: String) {
    }

    public fun enrichment(enrichment: String) {
    }

    public fun enrichmentParameters(enrichmentParameters: IResolvable) {
    }

    public fun enrichmentParameters(enrichmentParameters: PipeEnrichmentParametersProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("546dbe1fb8a400361d0f6133bfb986f88c805c8430e31adaea92a36edaf521b5")
    public
        fun enrichmentParameters(enrichmentParameters: PipeEnrichmentParametersProperty.Builder.() -> Unit) {
    }

    public fun logConfiguration(logConfiguration: IResolvable) {
    }

    public fun logConfiguration(logConfiguration: PipeLogConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("590ad1af47372201c74eb48366b821269e5557cfc4568fc97080194ec64a18b1")
    public fun logConfiguration(logConfiguration: PipeLogConfigurationProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun source(source: String) {
    }

    public fun sourceParameters(sourceParameters: IResolvable) {
    }

    public fun sourceParameters(sourceParameters: PipeSourceParametersProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a633e6cccf93692744ba1c51540c9986d1b346863598da59ac6c6466aab48e67")
    public fun sourceParameters(sourceParameters: PipeSourceParametersProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun target(target: String) {
    }

    public fun targetParameters(targetParameters: IResolvable) {
    }

    public fun targetParameters(targetParameters: PipeTargetParametersProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("253a95462466d0fa986923ebda44eb7148c210e5f2c08fa64fb41c53501e0f5b")
    public fun targetParameters(targetParameters: PipeTargetParametersProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pipes.CfnPipe.Builder =
        software.amazon.awscdk.services.pipes.CfnPipe.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun desiredState(desiredState: String) {
      cdkBuilder.desiredState(desiredState)
    }

    public override fun enrichment(enrichment: String) {
      cdkBuilder.enrichment(enrichment)
    }

    public override fun enrichmentParameters(enrichmentParameters: IResolvable) {
      cdkBuilder.enrichmentParameters(enrichmentParameters.let(IResolvable::unwrap))
    }

    public override
        fun enrichmentParameters(enrichmentParameters: PipeEnrichmentParametersProperty) {
      cdkBuilder.enrichmentParameters(enrichmentParameters.let(PipeEnrichmentParametersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("546dbe1fb8a400361d0f6133bfb986f88c805c8430e31adaea92a36edaf521b5")
    public override
        fun enrichmentParameters(enrichmentParameters: PipeEnrichmentParametersProperty.Builder.() -> Unit):
        Unit = enrichmentParameters(PipeEnrichmentParametersProperty(enrichmentParameters))

    public override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
    }

    public override fun logConfiguration(logConfiguration: PipeLogConfigurationProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(PipeLogConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("590ad1af47372201c74eb48366b821269e5557cfc4568fc97080194ec64a18b1")
    public override
        fun logConfiguration(logConfiguration: PipeLogConfigurationProperty.Builder.() -> Unit):
        Unit = logConfiguration(PipeLogConfigurationProperty(logConfiguration))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public override fun sourceParameters(sourceParameters: IResolvable) {
      cdkBuilder.sourceParameters(sourceParameters.let(IResolvable::unwrap))
    }

    public override fun sourceParameters(sourceParameters: PipeSourceParametersProperty) {
      cdkBuilder.sourceParameters(sourceParameters.let(PipeSourceParametersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a633e6cccf93692744ba1c51540c9986d1b346863598da59ac6c6466aab48e67")
    public override
        fun sourceParameters(sourceParameters: PipeSourceParametersProperty.Builder.() -> Unit):
        Unit = sourceParameters(PipeSourceParametersProperty(sourceParameters))

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun target(target: String) {
      cdkBuilder.target(target)
    }

    public override fun targetParameters(targetParameters: IResolvable) {
      cdkBuilder.targetParameters(targetParameters.let(IResolvable::unwrap))
    }

    public override fun targetParameters(targetParameters: PipeTargetParametersProperty) {
      cdkBuilder.targetParameters(targetParameters.let(PipeTargetParametersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("253a95462466d0fa986923ebda44eb7148c210e5f2c08fa64fb41c53501e0f5b")
    public override
        fun targetParameters(targetParameters: PipeTargetParametersProperty.Builder.() -> Unit):
        Unit = targetParameters(PipeTargetParametersProperty(targetParameters))

    public fun build(): software.amazon.awscdk.services.pipes.CfnPipe = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipe {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipe(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe): CfnPipe =
        CfnPipe(cdkObject)

    internal fun unwrap(wrapped: CfnPipe): software.amazon.awscdk.services.pipes.CfnPipe =
        wrapped.cdkObject
  }

  public interface PipeSourceRabbitMQBrokerParametersProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun credentials(): Any

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun queueName(): String

    public fun virtualHost(): String? = unwrap(this).getVirtualHost()

    public interface Builder {
      public fun batchSize(batchSize: Number) {
      }

      public fun credentials(credentials: IResolvable) {
      }

      public fun credentials(credentials: MQBrokerAccessCredentialsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5e829a47a553ec3c8f5dd7a09804d3df855ba545cf7cf8720327f22314cea4")
      public fun credentials(credentials: MQBrokerAccessCredentialsProperty.Builder.() -> Unit) {
      }

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      }

      public fun queueName(queueName: String) {
      }

      public fun virtualHost(virtualHost: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty.builder()

      public override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      public override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
      }

      public override fun credentials(credentials: MQBrokerAccessCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(MQBrokerAccessCredentialsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb5e829a47a553ec3c8f5dd7a09804d3df855ba545cf7cf8720327f22314cea4")
      public override
          fun credentials(credentials: MQBrokerAccessCredentialsProperty.Builder.() -> Unit): Unit =
          credentials(MQBrokerAccessCredentialsProperty(credentials))

      public override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      public override fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
      }

      public override fun virtualHost(virtualHost: String) {
        cdkBuilder.virtualHost(virtualHost)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty,
    ) : PipeSourceRabbitMQBrokerParametersProperty {
      public override fun batchSize(): Number? = unwrap(this).getBatchSize()

      public override fun credentials(): Any = unwrap(this).getCredentials()

      public override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      public override fun queueName(): String = unwrap(this).getQueueName()

      public override fun virtualHost(): String? = unwrap(this).getVirtualHost()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceRabbitMQBrokerParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty):
          PipeSourceRabbitMQBrokerParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceRabbitMQBrokerParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceRabbitMQBrokerParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PipeTargetSageMakerPipelineParametersProperty {
    public fun pipelineParameterList(): Any? = unwrap(this).getPipelineParameterList()

    public interface Builder {
      public fun pipelineParameterList(pipelineParameterList: IResolvable) {
      }

      public fun pipelineParameterList(pipelineParameterList: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty.builder()

      public override fun pipelineParameterList(pipelineParameterList: IResolvable) {
        cdkBuilder.pipelineParameterList(pipelineParameterList.let(IResolvable::unwrap))
      }

      public override fun pipelineParameterList(pipelineParameterList: List<Any>) {
        cdkBuilder.pipelineParameterList(pipelineParameterList)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty,
    ) : PipeTargetSageMakerPipelineParametersProperty {
      public override fun pipelineParameterList(): Any? = unwrap(this).getPipelineParameterList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetSageMakerPipelineParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty):
          PipeTargetSageMakerPipelineParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetSageMakerPipelineParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSageMakerPipelineParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AwsVpcConfigurationProperty {
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public fun subnets(): List<String>

    public interface Builder {
      public fun assignPublicIp(assignPublicIp: String) {
      }

      public fun securityGroups(securityGroups: List<String>) {
      }

      public fun subnets(subnets: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty.builder()

      public override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      public override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      public override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty,
    ) : AwsVpcConfigurationProperty {
      public override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

      public override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?:
          emptyList()

      public override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AwsVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty):
          AwsVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.AwsVpcConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PipeSourceSqsQueueParametersProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public interface Builder {
      public fun batchSize(batchSize: Number) {
      }

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty.builder()

      public override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      public override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty,
    ) : PipeSourceSqsQueueParametersProperty {
      public override fun batchSize(): Number? = unwrap(this).getBatchSize()

      public override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceSqsQueueParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty):
          PipeSourceSqsQueueParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceSqsQueueParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSqsQueueParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PipeTargetSqsQueueParametersProperty {
    public fun messageDeduplicationId(): String? = unwrap(this).getMessageDeduplicationId()

    public fun messageGroupId(): String? = unwrap(this).getMessageGroupId()

    public interface Builder {
      public fun messageDeduplicationId(messageDeduplicationId: String) {
      }

      public fun messageGroupId(messageGroupId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty.builder()

      public override fun messageDeduplicationId(messageDeduplicationId: String) {
        cdkBuilder.messageDeduplicationId(messageDeduplicationId)
      }

      public override fun messageGroupId(messageGroupId: String) {
        cdkBuilder.messageGroupId(messageGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty,
    ) : PipeTargetSqsQueueParametersProperty {
      public override fun messageDeduplicationId(): String? =
          unwrap(this).getMessageDeduplicationId()

      public override fun messageGroupId(): String? = unwrap(this).getMessageGroupId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetSqsQueueParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty):
          PipeTargetSqsQueueParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetSqsQueueParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetSqsQueueParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EcsEnvironmentFileProperty {
    public fun type(): String

    public fun `value`(): String

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty,
    ) : EcsEnvironmentFileProperty {
      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EcsEnvironmentFileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty):
          EcsEnvironmentFileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsEnvironmentFileProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentFileProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SelfManagedKafkaAccessConfigurationCredentialsProperty {
    public fun basicAuth(): String? = unwrap(this).getBasicAuth()

    public fun clientCertificateTlsAuth(): String? = unwrap(this).getClientCertificateTlsAuth()

    public fun saslScram256Auth(): String? = unwrap(this).getSaslScram256Auth()

    public fun saslScram512Auth(): String? = unwrap(this).getSaslScram512Auth()

    public interface Builder {
      public fun basicAuth(basicAuth: String) {
      }

      public fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
      }

      public fun saslScram256Auth(saslScram256Auth: String) {
      }

      public fun saslScram512Auth(saslScram512Auth: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty.builder()

      public override fun basicAuth(basicAuth: String) {
        cdkBuilder.basicAuth(basicAuth)
      }

      public override fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
        cdkBuilder.clientCertificateTlsAuth(clientCertificateTlsAuth)
      }

      public override fun saslScram256Auth(saslScram256Auth: String) {
        cdkBuilder.saslScram256Auth(saslScram256Auth)
      }

      public override fun saslScram512Auth(saslScram512Auth: String) {
        cdkBuilder.saslScram512Auth(saslScram512Auth)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty,
    ) : SelfManagedKafkaAccessConfigurationCredentialsProperty {
      public override fun basicAuth(): String? = unwrap(this).getBasicAuth()

      public override fun clientCertificateTlsAuth(): String? =
          unwrap(this).getClientCertificateTlsAuth()

      public override fun saslScram256Auth(): String? = unwrap(this).getSaslScram256Auth()

      public override fun saslScram512Auth(): String? = unwrap(this).getSaslScram512Auth()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SelfManagedKafkaAccessConfigurationCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty):
          SelfManagedKafkaAccessConfigurationCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedKafkaAccessConfigurationCredentialsProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationCredentialsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3LogDestinationProperty {
    public fun bucketName(): String? = unwrap(this).getBucketName()

    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    public fun outputFormat(): String? = unwrap(this).getOutputFormat()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun bucketOwner(bucketOwner: String) {
      }

      public fun outputFormat(outputFormat: String) {
      }

      public fun prefix(prefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      public override fun outputFormat(outputFormat: String) {
        cdkBuilder.outputFormat(outputFormat)
      }

      public override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty,
    ) : S3LogDestinationProperty {
      public override fun bucketName(): String? = unwrap(this).getBucketName()

      public override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

      public override fun outputFormat(): String? = unwrap(this).getOutputFormat()

      public override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty):
          S3LogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LogDestinationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.S3LogDestinationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EcsInferenceAcceleratorOverrideProperty {
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    public fun deviceType(): String? = unwrap(this).getDeviceType()

    public interface Builder {
      public fun deviceName(deviceName: String) {
      }

      public fun deviceType(deviceType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty.builder()

      public override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      public override fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty,
    ) : EcsInferenceAcceleratorOverrideProperty {
      public override fun deviceName(): String? = unwrap(this).getDeviceName()

      public override fun deviceType(): String? = unwrap(this).getDeviceType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EcsInferenceAcceleratorOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty):
          EcsInferenceAcceleratorOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsInferenceAcceleratorOverrideProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsInferenceAcceleratorOverrideProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BatchEnvironmentVariableProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty,
    ) : BatchEnvironmentVariableProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchEnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty):
          BatchEnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchEnvironmentVariableProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchEnvironmentVariableProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FilterCriteriaProperty {
    public fun filters(): Any? = unwrap(this).getFilters()

    public interface Builder {
      public fun filters(filters: IResolvable) {
      }

      public fun filters(filters: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty.builder()

      public override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      public override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty,
    ) : FilterCriteriaProperty {
      public override fun filters(): Any? = unwrap(this).getFilters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty):
          FilterCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterCriteriaProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.FilterCriteriaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PlacementConstraintProperty {
    public fun expression(): String? = unwrap(this).getExpression()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun expression(expression: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty.builder()

      public override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty,
    ) : PlacementConstraintProperty {
      public override fun expression(): String? = unwrap(this).getExpression()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty):
          PlacementConstraintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementConstraintProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementConstraintProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CapacityProviderStrategyItemProperty {
    public fun base(): Number? = unwrap(this).getBase()

    public fun capacityProvider(): String

    public fun weight(): Number? = unwrap(this).getWeight()

    public interface Builder {
      public fun base(base: Number) {
      }

      public fun capacityProvider(capacityProvider: String) {
      }

      public fun weight(weight: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty.builder()

      public override fun base(base: Number) {
        cdkBuilder.base(base)
      }

      public override fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
      }

      public override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty,
    ) : CapacityProviderStrategyItemProperty {
      public override fun base(): Number? = unwrap(this).getBase()

      public override fun capacityProvider(): String = unwrap(this).getCapacityProvider()

      public override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityProviderStrategyItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty):
          CapacityProviderStrategyItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyItemProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.CapacityProviderStrategyItemProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PipeSourceManagedStreamingKafkaParametersProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    public fun credentials(): Any? = unwrap(this).getCredentials()

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun startingPosition(): String? = unwrap(this).getStartingPosition()

    public fun topicName(): String

    public interface Builder {
      public fun batchSize(batchSize: Number) {
      }

      public fun consumerGroupId(consumerGroupId: String) {
      }

      public fun credentials(credentials: IResolvable) {
      }

      public fun credentials(credentials: MSKAccessCredentialsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9869d90c906b4a00a9be57c1d1dba3bdfa996a43c7c7bfcae332cf976b6543ce")
      public fun credentials(credentials: MSKAccessCredentialsProperty.Builder.() -> Unit) {
      }

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      }

      public fun startingPosition(startingPosition: String) {
      }

      public fun topicName(topicName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty.builder()

      public override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      public override fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
      }

      public override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
      }

      public override fun credentials(credentials: MSKAccessCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(MSKAccessCredentialsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9869d90c906b4a00a9be57c1d1dba3bdfa996a43c7c7bfcae332cf976b6543ce")
      public override fun credentials(credentials: MSKAccessCredentialsProperty.Builder.() -> Unit):
          Unit = credentials(MSKAccessCredentialsProperty(credentials))

      public override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      public override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      public override fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty,
    ) : PipeSourceManagedStreamingKafkaParametersProperty {
      public override fun batchSize(): Number? = unwrap(this).getBatchSize()

      public override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

      public override fun credentials(): Any? = unwrap(this).getCredentials()

      public override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      public override fun startingPosition(): String? = unwrap(this).getStartingPosition()

      public override fun topicName(): String = unwrap(this).getTopicName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceManagedStreamingKafkaParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty):
          PipeSourceManagedStreamingKafkaParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceManagedStreamingKafkaParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PipeSourceActiveMQBrokerParametersProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun credentials(): Any

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun queueName(): String

    public interface Builder {
      public fun batchSize(batchSize: Number) {
      }

      public fun credentials(credentials: IResolvable) {
      }

      public fun credentials(credentials: MQBrokerAccessCredentialsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ed7192250dd5f48c54611a1f27265b98db44c6219ef349b3c746e7f64c51307")
      public fun credentials(credentials: MQBrokerAccessCredentialsProperty.Builder.() -> Unit) {
      }

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      }

      public fun queueName(queueName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty.builder()

      public override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      public override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
      }

      public override fun credentials(credentials: MQBrokerAccessCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(MQBrokerAccessCredentialsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ed7192250dd5f48c54611a1f27265b98db44c6219ef349b3c746e7f64c51307")
      public override
          fun credentials(credentials: MQBrokerAccessCredentialsProperty.Builder.() -> Unit): Unit =
          credentials(MQBrokerAccessCredentialsProperty(credentials))

      public override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      public override fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty,
    ) : PipeSourceActiveMQBrokerParametersProperty {
      public override fun batchSize(): Number? = unwrap(this).getBatchSize()

      public override fun credentials(): Any = unwrap(this).getCredentials()

      public override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      public override fun queueName(): String = unwrap(this).getQueueName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceActiveMQBrokerParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty):
          PipeSourceActiveMQBrokerParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceActiveMQBrokerParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceActiveMQBrokerParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PipeEnrichmentParametersProperty {
    public fun httpParameters(): Any? = unwrap(this).getHttpParameters()

    public fun inputTemplate(): String? = unwrap(this).getInputTemplate()

    public interface Builder {
      public fun httpParameters(httpParameters: IResolvable) {
      }

      public fun httpParameters(httpParameters: PipeEnrichmentHttpParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3858678e5145b0aae91d534a55e459c2de77b8b2b05104433d661e992776db25")
      public
          fun httpParameters(httpParameters: PipeEnrichmentHttpParametersProperty.Builder.() -> Unit) {
      }

      public fun inputTemplate(inputTemplate: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty.builder()

      public override fun httpParameters(httpParameters: IResolvable) {
        cdkBuilder.httpParameters(httpParameters.let(IResolvable::unwrap))
      }

      public override fun httpParameters(httpParameters: PipeEnrichmentHttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters.let(PipeEnrichmentHttpParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3858678e5145b0aae91d534a55e459c2de77b8b2b05104433d661e992776db25")
      public override
          fun httpParameters(httpParameters: PipeEnrichmentHttpParametersProperty.Builder.() -> Unit):
          Unit = httpParameters(PipeEnrichmentHttpParametersProperty(httpParameters))

      public override fun inputTemplate(inputTemplate: String) {
        cdkBuilder.inputTemplate(inputTemplate)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty,
    ) : PipeEnrichmentParametersProperty {
      public override fun httpParameters(): Any? = unwrap(this).getHttpParameters()

      public override fun inputTemplate(): String? = unwrap(this).getInputTemplate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PipeEnrichmentParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty):
          PipeEnrichmentParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeEnrichmentParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentParametersProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EcsContainerOverrideProperty {
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public fun cpu(): Number? = unwrap(this).getCpu()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun environmentFiles(): Any? = unwrap(this).getEnvironmentFiles()

    public fun memory(): Number? = unwrap(this).getMemory()

    public fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

    public fun name(): String? = unwrap(this).getName()

    public fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

    public interface Builder {
      public fun command(command: List<String>) {
      }

      public fun cpu(cpu: Number) {
      }

      public fun environment(environment: IResolvable) {
      }

      public fun environment(environment: List<Any>) {
      }

      public fun environmentFiles(environmentFiles: IResolvable) {
      }

      public fun environmentFiles(environmentFiles: List<Any>) {
      }

      public fun memory(memory: Number) {
      }

      public fun memoryReservation(memoryReservation: Number) {
      }

      public fun name(name: String) {
      }

      public fun resourceRequirements(resourceRequirements: IResolvable) {
      }

      public fun resourceRequirements(resourceRequirements: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty.builder()

      public override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      public override fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
      }

      public override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      public override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      public override fun environmentFiles(environmentFiles: IResolvable) {
        cdkBuilder.environmentFiles(environmentFiles.let(IResolvable::unwrap))
      }

      public override fun environmentFiles(environmentFiles: List<Any>) {
        cdkBuilder.environmentFiles(environmentFiles)
      }

      public override fun memory(memory: Number) {
        cdkBuilder.memory(memory)
      }

      public override fun memoryReservation(memoryReservation: Number) {
        cdkBuilder.memoryReservation(memoryReservation)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements.let(IResolvable::unwrap))
      }

      public override fun resourceRequirements(resourceRequirements: List<Any>) {
        cdkBuilder.resourceRequirements(resourceRequirements)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty,
    ) : EcsContainerOverrideProperty {
      public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      public override fun cpu(): Number? = unwrap(this).getCpu()

      public override fun environment(): Any? = unwrap(this).getEnvironment()

      public override fun environmentFiles(): Any? = unwrap(this).getEnvironmentFiles()

      public override fun memory(): Number? = unwrap(this).getMemory()

      public override fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

      public override fun name(): String? = unwrap(this).getName()

      public override fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EcsContainerOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty):
          EcsContainerOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsContainerOverrideProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsContainerOverrideProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BatchRetryStrategyProperty {
    public fun attempts(): Number? = unwrap(this).getAttempts()

    public interface Builder {
      public fun attempts(attempts: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty.builder()

      public override fun attempts(attempts: Number) {
        cdkBuilder.attempts(attempts)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty,
    ) : BatchRetryStrategyProperty {
      public override fun attempts(): Number? = unwrap(this).getAttempts()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchRetryStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty):
          BatchRetryStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchRetryStrategyProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchRetryStrategyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PipeTargetKinesisStreamParametersProperty {
    public fun partitionKey(): String

    public interface Builder {
      public fun partitionKey(partitionKey: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty.builder()

      public override fun partitionKey(partitionKey: String) {
        cdkBuilder.partitionKey(partitionKey)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty,
    ) : PipeTargetKinesisStreamParametersProperty {
      public override fun partitionKey(): String = unwrap(this).getPartitionKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetKinesisStreamParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty):
          PipeTargetKinesisStreamParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetKinesisStreamParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetKinesisStreamParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EcsEphemeralStorageProperty {
    public fun sizeInGiB(): Number

    public interface Builder {
      public fun sizeInGiB(sizeInGiB: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty.builder()

      public override fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty,
    ) : EcsEphemeralStorageProperty {
      public override fun sizeInGiB(): Number = unwrap(this).getSizeInGiB()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EcsEphemeralStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty):
          EcsEphemeralStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsEphemeralStorageProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEphemeralStorageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PipeTargetEventBridgeEventBusParametersProperty {
    public fun detailType(): String? = unwrap(this).getDetailType()

    public fun endpointId(): String? = unwrap(this).getEndpointId()

    public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    public fun source(): String? = unwrap(this).getSource()

    public fun time(): String? = unwrap(this).getTime()

    public interface Builder {
      public fun detailType(detailType: String) {
      }

      public fun endpointId(endpointId: String) {
      }

      public fun resources(resources: List<String>) {
      }

      public fun source(source: String) {
      }

      public fun time(time: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty.builder()

      public override fun detailType(detailType: String) {
        cdkBuilder.detailType(detailType)
      }

      public override fun endpointId(endpointId: String) {
        cdkBuilder.endpointId(endpointId)
      }

      public override fun resources(resources: List<String>) {
        cdkBuilder.resources(resources)
      }

      public override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public override fun time(time: String) {
        cdkBuilder.time(time)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty,
    ) : PipeTargetEventBridgeEventBusParametersProperty {
      public override fun detailType(): String? = unwrap(this).getDetailType()

      public override fun endpointId(): String? = unwrap(this).getEndpointId()

      public override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

      public override fun source(): String? = unwrap(this).getSource()

      public override fun time(): String? = unwrap(this).getTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetEventBridgeEventBusParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty):
          PipeTargetEventBridgeEventBusParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetEventBridgeEventBusParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEventBridgeEventBusParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PipeTargetLambdaFunctionParametersProperty {
    public fun invocationType(): String? = unwrap(this).getInvocationType()

    public interface Builder {
      public fun invocationType(invocationType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty.builder()

      public override fun invocationType(invocationType: String) {
        cdkBuilder.invocationType(invocationType)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty,
    ) : PipeTargetLambdaFunctionParametersProperty {
      public override fun invocationType(): String? = unwrap(this).getInvocationType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetLambdaFunctionParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty):
          PipeTargetLambdaFunctionParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetLambdaFunctionParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetLambdaFunctionParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BatchContainerOverridesProperty {
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

    public interface Builder {
      public fun command(command: List<String>) {
      }

      public fun environment(environment: IResolvable) {
      }

      public fun environment(environment: List<Any>) {
      }

      public fun instanceType(instanceType: String) {
      }

      public fun resourceRequirements(resourceRequirements: IResolvable) {
      }

      public fun resourceRequirements(resourceRequirements: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty.builder()

      public override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      public override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      public override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      public override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public override fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements.let(IResolvable::unwrap))
      }

      public override fun resourceRequirements(resourceRequirements: List<Any>) {
        cdkBuilder.resourceRequirements(resourceRequirements)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty,
    ) : BatchContainerOverridesProperty {
      public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      public override fun environment(): Any? = unwrap(this).getEnvironment()

      public override fun instanceType(): String? = unwrap(this).getInstanceType()

      public override fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchContainerOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty):
          BatchContainerOverridesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchContainerOverridesProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchContainerOverridesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface MQBrokerAccessCredentialsProperty {
    public fun basicAuth(): String

    public interface Builder {
      public fun basicAuth(basicAuth: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty.builder()

      public override fun basicAuth(basicAuth: String) {
        cdkBuilder.basicAuth(basicAuth)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty,
    ) : MQBrokerAccessCredentialsProperty {
      public override fun basicAuth(): String = unwrap(this).getBasicAuth()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MQBrokerAccessCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty):
          MQBrokerAccessCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MQBrokerAccessCredentialsProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.MQBrokerAccessCredentialsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EcsEnvironmentVariableProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty,
    ) : EcsEnvironmentVariableProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EcsEnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty):
          EcsEnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsEnvironmentVariableProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsEnvironmentVariableProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DeadLetterConfigProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public interface Builder {
      public fun arn(arn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty,
    ) : DeadLetterConfigProperty {
      public override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty):
          DeadLetterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeadLetterConfigProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.DeadLetterConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BatchResourceRequirementProperty {
    public fun type(): String

    public fun `value`(): String

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty,
    ) : BatchResourceRequirementProperty {
      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchResourceRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty):
          BatchResourceRequirementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchResourceRequirementProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchResourceRequirementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PipeSourceParametersProperty {
    public fun activeMqBrokerParameters(): Any? = unwrap(this).getActiveMqBrokerParameters()

    public fun dynamoDbStreamParameters(): Any? = unwrap(this).getDynamoDbStreamParameters()

    public fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

    public fun kinesisStreamParameters(): Any? = unwrap(this).getKinesisStreamParameters()

    public fun managedStreamingKafkaParameters(): Any? =
        unwrap(this).getManagedStreamingKafkaParameters()

    public fun rabbitMqBrokerParameters(): Any? = unwrap(this).getRabbitMqBrokerParameters()

    public fun selfManagedKafkaParameters(): Any? = unwrap(this).getSelfManagedKafkaParameters()

    public fun sqsQueueParameters(): Any? = unwrap(this).getSqsQueueParameters()

    public interface Builder {
      public fun activeMqBrokerParameters(activeMqBrokerParameters: IResolvable) {
      }

      public
          fun activeMqBrokerParameters(activeMqBrokerParameters: PipeSourceActiveMQBrokerParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8287546ecb6620e76ceb93abb8a4ea23122e522c333d115ea3bbffc26c64d85")
      public
          fun activeMqBrokerParameters(activeMqBrokerParameters: PipeSourceActiveMQBrokerParametersProperty.Builder.() -> Unit) {
      }

      public fun dynamoDbStreamParameters(dynamoDbStreamParameters: IResolvable) {
      }

      public
          fun dynamoDbStreamParameters(dynamoDbStreamParameters: PipeSourceDynamoDBStreamParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97099f3124232ec6d7f1787f80bd6720daf9805f529c6b1339e187c01206f326")
      public
          fun dynamoDbStreamParameters(dynamoDbStreamParameters: PipeSourceDynamoDBStreamParametersProperty.Builder.() -> Unit) {
      }

      public fun filterCriteria(filterCriteria: IResolvable) {
      }

      public fun filterCriteria(filterCriteria: FilterCriteriaProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("088445f312dece32ace69952411dd034cb1bf64c579ebde89c4d02363c742852")
      public fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit) {
      }

      public fun kinesisStreamParameters(kinesisStreamParameters: IResolvable) {
      }

      public
          fun kinesisStreamParameters(kinesisStreamParameters: PipeSourceKinesisStreamParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfd4620d80d86ac5b93462071d780d967286984fada2a1d258c3e2fe91399bd9")
      public
          fun kinesisStreamParameters(kinesisStreamParameters: PipeSourceKinesisStreamParametersProperty.Builder.() -> Unit) {
      }

      public fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: IResolvable) {
      }

      public
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: PipeSourceManagedStreamingKafkaParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d039ae200df9f5fc50d6fe42b14ed33f45dc091ba4903b72758bd3789964dfe")
      public
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: PipeSourceManagedStreamingKafkaParametersProperty.Builder.() -> Unit) {
      }

      public fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: IResolvable) {
      }

      public
          fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: PipeSourceRabbitMQBrokerParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59665e351317af0417d24881a7683600b5ea7d08d8efaaf705e55ef7e8d62139")
      public
          fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: PipeSourceRabbitMQBrokerParametersProperty.Builder.() -> Unit) {
      }

      public fun selfManagedKafkaParameters(selfManagedKafkaParameters: IResolvable) {
      }

      public
          fun selfManagedKafkaParameters(selfManagedKafkaParameters: PipeSourceSelfManagedKafkaParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc7c2eb898cf64ad061c5d11e2ae61bf1e56548d691fa7599e2d78c81aa8bdf6")
      public
          fun selfManagedKafkaParameters(selfManagedKafkaParameters: PipeSourceSelfManagedKafkaParametersProperty.Builder.() -> Unit) {
      }

      public fun sqsQueueParameters(sqsQueueParameters: IResolvable) {
      }

      public fun sqsQueueParameters(sqsQueueParameters: PipeSourceSqsQueueParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("362cd4d1875965ad5a3b782fb1bc7e3cece0fefbac02273cb81d124996eb25e5")
      public
          fun sqsQueueParameters(sqsQueueParameters: PipeSourceSqsQueueParametersProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty.builder()

      public override fun activeMqBrokerParameters(activeMqBrokerParameters: IResolvable) {
        cdkBuilder.activeMqBrokerParameters(activeMqBrokerParameters.let(IResolvable::unwrap))
      }

      public override
          fun activeMqBrokerParameters(activeMqBrokerParameters: PipeSourceActiveMQBrokerParametersProperty) {
        cdkBuilder.activeMqBrokerParameters(activeMqBrokerParameters.let(PipeSourceActiveMQBrokerParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8287546ecb6620e76ceb93abb8a4ea23122e522c333d115ea3bbffc26c64d85")
      public override
          fun activeMqBrokerParameters(activeMqBrokerParameters: PipeSourceActiveMQBrokerParametersProperty.Builder.() -> Unit):
          Unit =
          activeMqBrokerParameters(PipeSourceActiveMQBrokerParametersProperty(activeMqBrokerParameters))

      public override fun dynamoDbStreamParameters(dynamoDbStreamParameters: IResolvable) {
        cdkBuilder.dynamoDbStreamParameters(dynamoDbStreamParameters.let(IResolvable::unwrap))
      }

      public override
          fun dynamoDbStreamParameters(dynamoDbStreamParameters: PipeSourceDynamoDBStreamParametersProperty) {
        cdkBuilder.dynamoDbStreamParameters(dynamoDbStreamParameters.let(PipeSourceDynamoDBStreamParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97099f3124232ec6d7f1787f80bd6720daf9805f529c6b1339e187c01206f326")
      public override
          fun dynamoDbStreamParameters(dynamoDbStreamParameters: PipeSourceDynamoDBStreamParametersProperty.Builder.() -> Unit):
          Unit =
          dynamoDbStreamParameters(PipeSourceDynamoDBStreamParametersProperty(dynamoDbStreamParameters))

      public override fun filterCriteria(filterCriteria: IResolvable) {
        cdkBuilder.filterCriteria(filterCriteria.let(IResolvable::unwrap))
      }

      public override fun filterCriteria(filterCriteria: FilterCriteriaProperty) {
        cdkBuilder.filterCriteria(filterCriteria.let(FilterCriteriaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("088445f312dece32ace69952411dd034cb1bf64c579ebde89c4d02363c742852")
      public override fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit):
          Unit = filterCriteria(FilterCriteriaProperty(filterCriteria))

      public override fun kinesisStreamParameters(kinesisStreamParameters: IResolvable) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters.let(IResolvable::unwrap))
      }

      public override
          fun kinesisStreamParameters(kinesisStreamParameters: PipeSourceKinesisStreamParametersProperty) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters.let(PipeSourceKinesisStreamParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dfd4620d80d86ac5b93462071d780d967286984fada2a1d258c3e2fe91399bd9")
      public override
          fun kinesisStreamParameters(kinesisStreamParameters: PipeSourceKinesisStreamParametersProperty.Builder.() -> Unit):
          Unit =
          kinesisStreamParameters(PipeSourceKinesisStreamParametersProperty(kinesisStreamParameters))

      public override
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: IResolvable) {
        cdkBuilder.managedStreamingKafkaParameters(managedStreamingKafkaParameters.let(IResolvable::unwrap))
      }

      public override
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: PipeSourceManagedStreamingKafkaParametersProperty) {
        cdkBuilder.managedStreamingKafkaParameters(managedStreamingKafkaParameters.let(PipeSourceManagedStreamingKafkaParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d039ae200df9f5fc50d6fe42b14ed33f45dc091ba4903b72758bd3789964dfe")
      public override
          fun managedStreamingKafkaParameters(managedStreamingKafkaParameters: PipeSourceManagedStreamingKafkaParametersProperty.Builder.() -> Unit):
          Unit =
          managedStreamingKafkaParameters(PipeSourceManagedStreamingKafkaParametersProperty(managedStreamingKafkaParameters))

      public override fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: IResolvable) {
        cdkBuilder.rabbitMqBrokerParameters(rabbitMqBrokerParameters.let(IResolvable::unwrap))
      }

      public override
          fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: PipeSourceRabbitMQBrokerParametersProperty) {
        cdkBuilder.rabbitMqBrokerParameters(rabbitMqBrokerParameters.let(PipeSourceRabbitMQBrokerParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59665e351317af0417d24881a7683600b5ea7d08d8efaaf705e55ef7e8d62139")
      public override
          fun rabbitMqBrokerParameters(rabbitMqBrokerParameters: PipeSourceRabbitMQBrokerParametersProperty.Builder.() -> Unit):
          Unit =
          rabbitMqBrokerParameters(PipeSourceRabbitMQBrokerParametersProperty(rabbitMqBrokerParameters))

      public override fun selfManagedKafkaParameters(selfManagedKafkaParameters: IResolvable) {
        cdkBuilder.selfManagedKafkaParameters(selfManagedKafkaParameters.let(IResolvable::unwrap))
      }

      public override
          fun selfManagedKafkaParameters(selfManagedKafkaParameters: PipeSourceSelfManagedKafkaParametersProperty) {
        cdkBuilder.selfManagedKafkaParameters(selfManagedKafkaParameters.let(PipeSourceSelfManagedKafkaParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc7c2eb898cf64ad061c5d11e2ae61bf1e56548d691fa7599e2d78c81aa8bdf6")
      public override
          fun selfManagedKafkaParameters(selfManagedKafkaParameters: PipeSourceSelfManagedKafkaParametersProperty.Builder.() -> Unit):
          Unit =
          selfManagedKafkaParameters(PipeSourceSelfManagedKafkaParametersProperty(selfManagedKafkaParameters))

      public override fun sqsQueueParameters(sqsQueueParameters: IResolvable) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters.let(IResolvable::unwrap))
      }

      public override
          fun sqsQueueParameters(sqsQueueParameters: PipeSourceSqsQueueParametersProperty) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters.let(PipeSourceSqsQueueParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("362cd4d1875965ad5a3b782fb1bc7e3cece0fefbac02273cb81d124996eb25e5")
      public override
          fun sqsQueueParameters(sqsQueueParameters: PipeSourceSqsQueueParametersProperty.Builder.() -> Unit):
          Unit = sqsQueueParameters(PipeSourceSqsQueueParametersProperty(sqsQueueParameters))

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty,
    ) : PipeSourceParametersProperty {
      public override fun activeMqBrokerParameters(): Any? =
          unwrap(this).getActiveMqBrokerParameters()

      public override fun dynamoDbStreamParameters(): Any? =
          unwrap(this).getDynamoDbStreamParameters()

      public override fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

      public override fun kinesisStreamParameters(): Any? =
          unwrap(this).getKinesisStreamParameters()

      public override fun managedStreamingKafkaParameters(): Any? =
          unwrap(this).getManagedStreamingKafkaParameters()

      public override fun rabbitMqBrokerParameters(): Any? =
          unwrap(this).getRabbitMqBrokerParameters()

      public override fun selfManagedKafkaParameters(): Any? =
          unwrap(this).getSelfManagedKafkaParameters()

      public override fun sqsQueueParameters(): Any? = unwrap(this).getSqsQueueParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PipeSourceParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty):
          PipeSourceParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SageMakerPipelineParameterProperty {
    public fun name(): String

    public fun `value`(): String

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty,
    ) : SageMakerPipelineParameterProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SageMakerPipelineParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty):
          SageMakerPipelineParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerPipelineParameterProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.SageMakerPipelineParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SelfManagedKafkaAccessConfigurationVpcProperty {
    public fun securityGroup(): List<String> = unwrap(this).getSecurityGroup() ?: emptyList()

    public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    public interface Builder {
      public fun securityGroup(securityGroup: List<String>) {
      }

      public fun subnets(subnets: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty.builder()

      public override fun securityGroup(securityGroup: List<String>) {
        cdkBuilder.securityGroup(securityGroup)
      }

      public override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty,
    ) : SelfManagedKafkaAccessConfigurationVpcProperty {
      public override fun securityGroup(): List<String> = unwrap(this).getSecurityGroup() ?:
          emptyList()

      public override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SelfManagedKafkaAccessConfigurationVpcProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty):
          SelfManagedKafkaAccessConfigurationVpcProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedKafkaAccessConfigurationVpcProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PipeTargetBatchJobParametersProperty {
    public fun arrayProperties(): Any? = unwrap(this).getArrayProperties()

    public fun containerOverrides(): Any? = unwrap(this).getContainerOverrides()

    public fun dependsOn(): Any? = unwrap(this).getDependsOn()

    public fun jobDefinition(): String

    public fun jobName(): String

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()

    public interface Builder {
      public fun arrayProperties(arrayProperties: IResolvable) {
      }

      public fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee017bbeaa5a9ef21edffcbce56ca39aa77f6306f049c4bb9842786a7480d718")
      public fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty.Builder.() -> Unit) {
      }

      public fun containerOverrides(containerOverrides: IResolvable) {
      }

      public fun containerOverrides(containerOverrides: BatchContainerOverridesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33706522c31b6d00099ad806ab4ea4c3a0b2372b2b46f3f1782c1b59d78492d9")
      public
          fun containerOverrides(containerOverrides: BatchContainerOverridesProperty.Builder.() -> Unit) {
      }

      public fun dependsOn(dependsOn: IResolvable) {
      }

      public fun dependsOn(dependsOn: List<Any>) {
      }

      public fun jobDefinition(jobDefinition: String) {
      }

      public fun jobName(jobName: String) {
      }

      public fun parameters(parameters: IResolvable) {
      }

      public fun parameters(parameters: Map<String, String>) {
      }

      public fun retryStrategy(retryStrategy: IResolvable) {
      }

      public fun retryStrategy(retryStrategy: BatchRetryStrategyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98fc3a4d7335ae32d18386b6d01abb467445b94a9dfa4182e352180dde8135b")
      public fun retryStrategy(retryStrategy: BatchRetryStrategyProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty.builder()

      public override fun arrayProperties(arrayProperties: IResolvable) {
        cdkBuilder.arrayProperties(arrayProperties.let(IResolvable::unwrap))
      }

      public override fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty) {
        cdkBuilder.arrayProperties(arrayProperties.let(BatchArrayPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee017bbeaa5a9ef21edffcbce56ca39aa77f6306f049c4bb9842786a7480d718")
      public override
          fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty.Builder.() -> Unit):
          Unit = arrayProperties(BatchArrayPropertiesProperty(arrayProperties))

      public override fun containerOverrides(containerOverrides: IResolvable) {
        cdkBuilder.containerOverrides(containerOverrides.let(IResolvable::unwrap))
      }

      public override fun containerOverrides(containerOverrides: BatchContainerOverridesProperty) {
        cdkBuilder.containerOverrides(containerOverrides.let(BatchContainerOverridesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33706522c31b6d00099ad806ab4ea4c3a0b2372b2b46f3f1782c1b59d78492d9")
      public override
          fun containerOverrides(containerOverrides: BatchContainerOverridesProperty.Builder.() -> Unit):
          Unit = containerOverrides(BatchContainerOverridesProperty(containerOverrides))

      public override fun dependsOn(dependsOn: IResolvable) {
        cdkBuilder.dependsOn(dependsOn.let(IResolvable::unwrap))
      }

      public override fun dependsOn(dependsOn: List<Any>) {
        cdkBuilder.dependsOn(dependsOn)
      }

      public override fun jobDefinition(jobDefinition: String) {
        cdkBuilder.jobDefinition(jobDefinition)
      }

      public override fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
      }

      public override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      public override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      public override fun retryStrategy(retryStrategy: IResolvable) {
        cdkBuilder.retryStrategy(retryStrategy.let(IResolvable::unwrap))
      }

      public override fun retryStrategy(retryStrategy: BatchRetryStrategyProperty) {
        cdkBuilder.retryStrategy(retryStrategy.let(BatchRetryStrategyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98fc3a4d7335ae32d18386b6d01abb467445b94a9dfa4182e352180dde8135b")
      public override
          fun retryStrategy(retryStrategy: BatchRetryStrategyProperty.Builder.() -> Unit): Unit =
          retryStrategy(BatchRetryStrategyProperty(retryStrategy))

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty,
    ) : PipeTargetBatchJobParametersProperty {
      public override fun arrayProperties(): Any? = unwrap(this).getArrayProperties()

      public override fun containerOverrides(): Any? = unwrap(this).getContainerOverrides()

      public override fun dependsOn(): Any? = unwrap(this).getDependsOn()

      public override fun jobDefinition(): String = unwrap(this).getJobDefinition()

      public override fun jobName(): String = unwrap(this).getJobName()

      public override fun parameters(): Any? = unwrap(this).getParameters()

      public override fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetBatchJobParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty):
          PipeTargetBatchJobParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetBatchJobParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetBatchJobParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FirehoseLogDestinationProperty {
    public fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()

    public interface Builder {
      public fun deliveryStreamArn(deliveryStreamArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty.builder()

      public override fun deliveryStreamArn(deliveryStreamArn: String) {
        cdkBuilder.deliveryStreamArn(deliveryStreamArn)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty,
    ) : FirehoseLogDestinationProperty {
      public override fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty):
          FirehoseLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseLogDestinationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.FirehoseLogDestinationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PipeTargetParametersProperty {
    public fun batchJobParameters(): Any? = unwrap(this).getBatchJobParameters()

    public fun cloudWatchLogsParameters(): Any? = unwrap(this).getCloudWatchLogsParameters()

    public fun ecsTaskParameters(): Any? = unwrap(this).getEcsTaskParameters()

    public fun eventBridgeEventBusParameters(): Any? =
        unwrap(this).getEventBridgeEventBusParameters()

    public fun httpParameters(): Any? = unwrap(this).getHttpParameters()

    public fun inputTemplate(): String? = unwrap(this).getInputTemplate()

    public fun kinesisStreamParameters(): Any? = unwrap(this).getKinesisStreamParameters()

    public fun lambdaFunctionParameters(): Any? = unwrap(this).getLambdaFunctionParameters()

    public fun redshiftDataParameters(): Any? = unwrap(this).getRedshiftDataParameters()

    public fun sageMakerPipelineParameters(): Any? = unwrap(this).getSageMakerPipelineParameters()

    public fun sqsQueueParameters(): Any? = unwrap(this).getSqsQueueParameters()

    public fun stepFunctionStateMachineParameters(): Any? =
        unwrap(this).getStepFunctionStateMachineParameters()

    public interface Builder {
      public fun batchJobParameters(batchJobParameters: IResolvable) {
      }

      public fun batchJobParameters(batchJobParameters: PipeTargetBatchJobParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdaf15f5e96b52ffa23847a4ceac42195e4993caf7b5d539406df36ef64fd297")
      public
          fun batchJobParameters(batchJobParameters: PipeTargetBatchJobParametersProperty.Builder.() -> Unit) {
      }

      public fun cloudWatchLogsParameters(cloudWatchLogsParameters: IResolvable) {
      }

      public
          fun cloudWatchLogsParameters(cloudWatchLogsParameters: PipeTargetCloudWatchLogsParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d94b1dca2737581a33c6d8a82a05839a568009d24dea8855bac1f0a056356861")
      public
          fun cloudWatchLogsParameters(cloudWatchLogsParameters: PipeTargetCloudWatchLogsParametersProperty.Builder.() -> Unit) {
      }

      public fun ecsTaskParameters(ecsTaskParameters: IResolvable) {
      }

      public fun ecsTaskParameters(ecsTaskParameters: PipeTargetEcsTaskParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b56b9f235c7f227fdecbf99946f8a4d55051de254773c79eda188c4371f362d8")
      public
          fun ecsTaskParameters(ecsTaskParameters: PipeTargetEcsTaskParametersProperty.Builder.() -> Unit) {
      }

      public fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: IResolvable) {
      }

      public
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: PipeTargetEventBridgeEventBusParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5a979d38b6badf433e4697081dcf5ebaa01f03a54b50a27ec403d89398fda36")
      public
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: PipeTargetEventBridgeEventBusParametersProperty.Builder.() -> Unit) {
      }

      public fun httpParameters(httpParameters: IResolvable) {
      }

      public fun httpParameters(httpParameters: PipeTargetHttpParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60a10dc2e3a6d4149db45ceb008014cdb486663706bf2fc975bbb4dff2fdcdc0")
      public
          fun httpParameters(httpParameters: PipeTargetHttpParametersProperty.Builder.() -> Unit) {
      }

      public fun inputTemplate(inputTemplate: String) {
      }

      public fun kinesisStreamParameters(kinesisStreamParameters: IResolvable) {
      }

      public
          fun kinesisStreamParameters(kinesisStreamParameters: PipeTargetKinesisStreamParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7041253f54d2a8022b5edf392192de92458f27517c4b2fcd22920caf60d7f86")
      public
          fun kinesisStreamParameters(kinesisStreamParameters: PipeTargetKinesisStreamParametersProperty.Builder.() -> Unit) {
      }

      public fun lambdaFunctionParameters(lambdaFunctionParameters: IResolvable) {
      }

      public
          fun lambdaFunctionParameters(lambdaFunctionParameters: PipeTargetLambdaFunctionParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b22e1eff3837d34aa5bff40756eaeec651842e77f84128fd3688e7cbe3afe51")
      public
          fun lambdaFunctionParameters(lambdaFunctionParameters: PipeTargetLambdaFunctionParametersProperty.Builder.() -> Unit) {
      }

      public fun redshiftDataParameters(redshiftDataParameters: IResolvable) {
      }

      public
          fun redshiftDataParameters(redshiftDataParameters: PipeTargetRedshiftDataParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6683ea8aeb687b4449f257a8375f98b755ace2518160fcfb7749e987f381d6c3")
      public
          fun redshiftDataParameters(redshiftDataParameters: PipeTargetRedshiftDataParametersProperty.Builder.() -> Unit) {
      }

      public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
      }

      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: PipeTargetSageMakerPipelineParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09c82decebfa4d802c5bd64ec0a261aaee817f9f37480bd0fc326e0af8da78d7")
      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: PipeTargetSageMakerPipelineParametersProperty.Builder.() -> Unit) {
      }

      public fun sqsQueueParameters(sqsQueueParameters: IResolvable) {
      }

      public fun sqsQueueParameters(sqsQueueParameters: PipeTargetSqsQueueParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbe15509195fccf35855a8fbbc2b4a87d242b141ac82c4214512ebc00a21128d")
      public
          fun sqsQueueParameters(sqsQueueParameters: PipeTargetSqsQueueParametersProperty.Builder.() -> Unit) {
      }

      public
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: IResolvable) {
      }

      public
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: PipeTargetStateMachineParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c98c038add2c0bc4e1ab167709d03310995337108c405ec86f15195d3bfad285")
      public
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: PipeTargetStateMachineParametersProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty.builder()

      public override fun batchJobParameters(batchJobParameters: IResolvable) {
        cdkBuilder.batchJobParameters(batchJobParameters.let(IResolvable::unwrap))
      }

      public override
          fun batchJobParameters(batchJobParameters: PipeTargetBatchJobParametersProperty) {
        cdkBuilder.batchJobParameters(batchJobParameters.let(PipeTargetBatchJobParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdaf15f5e96b52ffa23847a4ceac42195e4993caf7b5d539406df36ef64fd297")
      public override
          fun batchJobParameters(batchJobParameters: PipeTargetBatchJobParametersProperty.Builder.() -> Unit):
          Unit = batchJobParameters(PipeTargetBatchJobParametersProperty(batchJobParameters))

      public override fun cloudWatchLogsParameters(cloudWatchLogsParameters: IResolvable) {
        cdkBuilder.cloudWatchLogsParameters(cloudWatchLogsParameters.let(IResolvable::unwrap))
      }

      public override
          fun cloudWatchLogsParameters(cloudWatchLogsParameters: PipeTargetCloudWatchLogsParametersProperty) {
        cdkBuilder.cloudWatchLogsParameters(cloudWatchLogsParameters.let(PipeTargetCloudWatchLogsParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d94b1dca2737581a33c6d8a82a05839a568009d24dea8855bac1f0a056356861")
      public override
          fun cloudWatchLogsParameters(cloudWatchLogsParameters: PipeTargetCloudWatchLogsParametersProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLogsParameters(PipeTargetCloudWatchLogsParametersProperty(cloudWatchLogsParameters))

      public override fun ecsTaskParameters(ecsTaskParameters: IResolvable) {
        cdkBuilder.ecsTaskParameters(ecsTaskParameters.let(IResolvable::unwrap))
      }

      public override
          fun ecsTaskParameters(ecsTaskParameters: PipeTargetEcsTaskParametersProperty) {
        cdkBuilder.ecsTaskParameters(ecsTaskParameters.let(PipeTargetEcsTaskParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b56b9f235c7f227fdecbf99946f8a4d55051de254773c79eda188c4371f362d8")
      public override
          fun ecsTaskParameters(ecsTaskParameters: PipeTargetEcsTaskParametersProperty.Builder.() -> Unit):
          Unit = ecsTaskParameters(PipeTargetEcsTaskParametersProperty(ecsTaskParameters))

      public override
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: IResolvable) {
        cdkBuilder.eventBridgeEventBusParameters(eventBridgeEventBusParameters.let(IResolvable::unwrap))
      }

      public override
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: PipeTargetEventBridgeEventBusParametersProperty) {
        cdkBuilder.eventBridgeEventBusParameters(eventBridgeEventBusParameters.let(PipeTargetEventBridgeEventBusParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5a979d38b6badf433e4697081dcf5ebaa01f03a54b50a27ec403d89398fda36")
      public override
          fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: PipeTargetEventBridgeEventBusParametersProperty.Builder.() -> Unit):
          Unit =
          eventBridgeEventBusParameters(PipeTargetEventBridgeEventBusParametersProperty(eventBridgeEventBusParameters))

      public override fun httpParameters(httpParameters: IResolvable) {
        cdkBuilder.httpParameters(httpParameters.let(IResolvable::unwrap))
      }

      public override fun httpParameters(httpParameters: PipeTargetHttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters.let(PipeTargetHttpParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60a10dc2e3a6d4149db45ceb008014cdb486663706bf2fc975bbb4dff2fdcdc0")
      public override
          fun httpParameters(httpParameters: PipeTargetHttpParametersProperty.Builder.() -> Unit):
          Unit = httpParameters(PipeTargetHttpParametersProperty(httpParameters))

      public override fun inputTemplate(inputTemplate: String) {
        cdkBuilder.inputTemplate(inputTemplate)
      }

      public override fun kinesisStreamParameters(kinesisStreamParameters: IResolvable) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters.let(IResolvable::unwrap))
      }

      public override
          fun kinesisStreamParameters(kinesisStreamParameters: PipeTargetKinesisStreamParametersProperty) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters.let(PipeTargetKinesisStreamParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7041253f54d2a8022b5edf392192de92458f27517c4b2fcd22920caf60d7f86")
      public override
          fun kinesisStreamParameters(kinesisStreamParameters: PipeTargetKinesisStreamParametersProperty.Builder.() -> Unit):
          Unit =
          kinesisStreamParameters(PipeTargetKinesisStreamParametersProperty(kinesisStreamParameters))

      public override fun lambdaFunctionParameters(lambdaFunctionParameters: IResolvable) {
        cdkBuilder.lambdaFunctionParameters(lambdaFunctionParameters.let(IResolvable::unwrap))
      }

      public override
          fun lambdaFunctionParameters(lambdaFunctionParameters: PipeTargetLambdaFunctionParametersProperty) {
        cdkBuilder.lambdaFunctionParameters(lambdaFunctionParameters.let(PipeTargetLambdaFunctionParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b22e1eff3837d34aa5bff40756eaeec651842e77f84128fd3688e7cbe3afe51")
      public override
          fun lambdaFunctionParameters(lambdaFunctionParameters: PipeTargetLambdaFunctionParametersProperty.Builder.() -> Unit):
          Unit =
          lambdaFunctionParameters(PipeTargetLambdaFunctionParametersProperty(lambdaFunctionParameters))

      public override fun redshiftDataParameters(redshiftDataParameters: IResolvable) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters.let(IResolvable::unwrap))
      }

      public override
          fun redshiftDataParameters(redshiftDataParameters: PipeTargetRedshiftDataParametersProperty) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters.let(PipeTargetRedshiftDataParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6683ea8aeb687b4449f257a8375f98b755ace2518160fcfb7749e987f381d6c3")
      public override
          fun redshiftDataParameters(redshiftDataParameters: PipeTargetRedshiftDataParametersProperty.Builder.() -> Unit):
          Unit =
          redshiftDataParameters(PipeTargetRedshiftDataParametersProperty(redshiftDataParameters))

      public override fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(IResolvable::unwrap))
      }

      public override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: PipeTargetSageMakerPipelineParametersProperty) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(PipeTargetSageMakerPipelineParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09c82decebfa4d802c5bd64ec0a261aaee817f9f37480bd0fc326e0af8da78d7")
      public override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: PipeTargetSageMakerPipelineParametersProperty.Builder.() -> Unit):
          Unit =
          sageMakerPipelineParameters(PipeTargetSageMakerPipelineParametersProperty(sageMakerPipelineParameters))

      public override fun sqsQueueParameters(sqsQueueParameters: IResolvable) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters.let(IResolvable::unwrap))
      }

      public override
          fun sqsQueueParameters(sqsQueueParameters: PipeTargetSqsQueueParametersProperty) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters.let(PipeTargetSqsQueueParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbe15509195fccf35855a8fbbc2b4a87d242b141ac82c4214512ebc00a21128d")
      public override
          fun sqsQueueParameters(sqsQueueParameters: PipeTargetSqsQueueParametersProperty.Builder.() -> Unit):
          Unit = sqsQueueParameters(PipeTargetSqsQueueParametersProperty(sqsQueueParameters))

      public override
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: IResolvable) {
        cdkBuilder.stepFunctionStateMachineParameters(stepFunctionStateMachineParameters.let(IResolvable::unwrap))
      }

      public override
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: PipeTargetStateMachineParametersProperty) {
        cdkBuilder.stepFunctionStateMachineParameters(stepFunctionStateMachineParameters.let(PipeTargetStateMachineParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c98c038add2c0bc4e1ab167709d03310995337108c405ec86f15195d3bfad285")
      public override
          fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: PipeTargetStateMachineParametersProperty.Builder.() -> Unit):
          Unit =
          stepFunctionStateMachineParameters(PipeTargetStateMachineParametersProperty(stepFunctionStateMachineParameters))

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty,
    ) : PipeTargetParametersProperty {
      public override fun batchJobParameters(): Any? = unwrap(this).getBatchJobParameters()

      public override fun cloudWatchLogsParameters(): Any? =
          unwrap(this).getCloudWatchLogsParameters()

      public override fun ecsTaskParameters(): Any? = unwrap(this).getEcsTaskParameters()

      public override fun eventBridgeEventBusParameters(): Any? =
          unwrap(this).getEventBridgeEventBusParameters()

      public override fun httpParameters(): Any? = unwrap(this).getHttpParameters()

      public override fun inputTemplate(): String? = unwrap(this).getInputTemplate()

      public override fun kinesisStreamParameters(): Any? =
          unwrap(this).getKinesisStreamParameters()

      public override fun lambdaFunctionParameters(): Any? =
          unwrap(this).getLambdaFunctionParameters()

      public override fun redshiftDataParameters(): Any? = unwrap(this).getRedshiftDataParameters()

      public override fun sageMakerPipelineParameters(): Any? =
          unwrap(this).getSageMakerPipelineParameters()

      public override fun sqsQueueParameters(): Any? = unwrap(this).getSqsQueueParameters()

      public override fun stepFunctionStateMachineParameters(): Any? =
          unwrap(this).getStepFunctionStateMachineParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PipeTargetParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty):
          PipeTargetParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PipeLogConfigurationProperty {
    public fun cloudwatchLogsLogDestination(): Any? = unwrap(this).getCloudwatchLogsLogDestination()

    public fun firehoseLogDestination(): Any? = unwrap(this).getFirehoseLogDestination()

    public fun includeExecutionData(): List<String> = unwrap(this).getIncludeExecutionData() ?:
        emptyList()

    public fun level(): String? = unwrap(this).getLevel()

    public fun s3LogDestination(): Any? = unwrap(this).getS3LogDestination()

    public interface Builder {
      public fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: IResolvable) {
      }

      public
          fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: CloudwatchLogsLogDestinationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2868d9599846bb0f80a69232e538e1e3f52d7a455e0dfbcbe2b41e0481de7f10")
      public
          fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: CloudwatchLogsLogDestinationProperty.Builder.() -> Unit) {
      }

      public fun firehoseLogDestination(firehoseLogDestination: IResolvable) {
      }

      public fun firehoseLogDestination(firehoseLogDestination: FirehoseLogDestinationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ccd62478289f6030d7ca6615926381df28db347b2571aae07bf10d0a25c0d64")
      public
          fun firehoseLogDestination(firehoseLogDestination: FirehoseLogDestinationProperty.Builder.() -> Unit) {
      }

      public fun includeExecutionData(includeExecutionData: List<String>) {
      }

      public fun level(level: String) {
      }

      public fun s3LogDestination(s3LogDestination: IResolvable) {
      }

      public fun s3LogDestination(s3LogDestination: S3LogDestinationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bc0940a20a9c9176130427adbc51573008b4daed153833bdef9e024cda4add7")
      public fun s3LogDestination(s3LogDestination: S3LogDestinationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty.builder()

      public override fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: IResolvable) {
        cdkBuilder.cloudwatchLogsLogDestination(cloudwatchLogsLogDestination.let(IResolvable::unwrap))
      }

      public override
          fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: CloudwatchLogsLogDestinationProperty) {
        cdkBuilder.cloudwatchLogsLogDestination(cloudwatchLogsLogDestination.let(CloudwatchLogsLogDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2868d9599846bb0f80a69232e538e1e3f52d7a455e0dfbcbe2b41e0481de7f10")
      public override
          fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: CloudwatchLogsLogDestinationProperty.Builder.() -> Unit):
          Unit =
          cloudwatchLogsLogDestination(CloudwatchLogsLogDestinationProperty(cloudwatchLogsLogDestination))

      public override fun firehoseLogDestination(firehoseLogDestination: IResolvable) {
        cdkBuilder.firehoseLogDestination(firehoseLogDestination.let(IResolvable::unwrap))
      }

      public override
          fun firehoseLogDestination(firehoseLogDestination: FirehoseLogDestinationProperty) {
        cdkBuilder.firehoseLogDestination(firehoseLogDestination.let(FirehoseLogDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ccd62478289f6030d7ca6615926381df28db347b2571aae07bf10d0a25c0d64")
      public override
          fun firehoseLogDestination(firehoseLogDestination: FirehoseLogDestinationProperty.Builder.() -> Unit):
          Unit = firehoseLogDestination(FirehoseLogDestinationProperty(firehoseLogDestination))

      public override fun includeExecutionData(includeExecutionData: List<String>) {
        cdkBuilder.includeExecutionData(includeExecutionData)
      }

      public override fun level(level: String) {
        cdkBuilder.level(level)
      }

      public override fun s3LogDestination(s3LogDestination: IResolvable) {
        cdkBuilder.s3LogDestination(s3LogDestination.let(IResolvable::unwrap))
      }

      public override fun s3LogDestination(s3LogDestination: S3LogDestinationProperty) {
        cdkBuilder.s3LogDestination(s3LogDestination.let(S3LogDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bc0940a20a9c9176130427adbc51573008b4daed153833bdef9e024cda4add7")
      public override
          fun s3LogDestination(s3LogDestination: S3LogDestinationProperty.Builder.() -> Unit): Unit
          = s3LogDestination(S3LogDestinationProperty(s3LogDestination))

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty,
    ) : PipeLogConfigurationProperty {
      public override fun cloudwatchLogsLogDestination(): Any? =
          unwrap(this).getCloudwatchLogsLogDestination()

      public override fun firehoseLogDestination(): Any? = unwrap(this).getFirehoseLogDestination()

      public override fun includeExecutionData(): List<String> =
          unwrap(this).getIncludeExecutionData() ?: emptyList()

      public override fun level(): String? = unwrap(this).getLevel()

      public override fun s3LogDestination(): Any? = unwrap(this).getS3LogDestination()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PipeLogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty):
          PipeLogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeLogConfigurationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeLogConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BatchJobDependencyProperty {
    public fun jobId(): String? = unwrap(this).getJobId()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun jobId(jobId: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty.builder()

      public override fun jobId(jobId: String) {
        cdkBuilder.jobId(jobId)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty,
    ) : BatchJobDependencyProperty {
      public override fun jobId(): String? = unwrap(this).getJobId()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchJobDependencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty):
          BatchJobDependencyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchJobDependencyProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchJobDependencyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PipeTargetHttpParametersProperty {
    public fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

    public fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
        emptyList()

    public fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()

    public interface Builder {
      public fun headerParameters(headerParameters: IResolvable) {
      }

      public fun headerParameters(headerParameters: Map<String, String>) {
      }

      public fun pathParameterValues(pathParameterValues: List<String>) {
      }

      public fun queryStringParameters(queryStringParameters: IResolvable) {
      }

      public fun queryStringParameters(queryStringParameters: Map<String, String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty.builder()

      public override fun headerParameters(headerParameters: IResolvable) {
        cdkBuilder.headerParameters(headerParameters.let(IResolvable::unwrap))
      }

      public override fun headerParameters(headerParameters: Map<String, String>) {
        cdkBuilder.headerParameters(headerParameters)
      }

      public override fun pathParameterValues(pathParameterValues: List<String>) {
        cdkBuilder.pathParameterValues(pathParameterValues)
      }

      public override fun queryStringParameters(queryStringParameters: IResolvable) {
        cdkBuilder.queryStringParameters(queryStringParameters.let(IResolvable::unwrap))
      }

      public override fun queryStringParameters(queryStringParameters: Map<String, String>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty,
    ) : PipeTargetHttpParametersProperty {
      public override fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

      public override fun pathParameterValues(): List<String> =
          unwrap(this).getPathParameterValues() ?: emptyList()

      public override fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PipeTargetHttpParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty):
          PipeTargetHttpParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetHttpParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetHttpParametersProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PipeTargetEcsTaskParametersProperty {
    public fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

    public fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

    public fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

    public fun group(): String? = unwrap(this).getGroup()

    public fun launchType(): String? = unwrap(this).getLaunchType()

    public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    public fun overrides(): Any? = unwrap(this).getOverrides()

    public fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

    public fun placementStrategy(): Any? = unwrap(this).getPlacementStrategy()

    public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    public fun propagateTags(): String? = unwrap(this).getPropagateTags()

    public fun referenceId(): String? = unwrap(this).getReferenceId()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public fun taskCount(): Number? = unwrap(this).getTaskCount()

    public fun taskDefinitionArn(): String

    public interface Builder {
      public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
      }

      public fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
      }

      public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      }

      public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
      }

      public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      }

      public fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
      }

      public fun group(group: String) {
      }

      public fun launchType(launchType: String) {
      }

      public fun networkConfiguration(networkConfiguration: IResolvable) {
      }

      public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c7e89dc9b6033d1ae9fbfb05a091dcfe0b1ddf5eabb920fc47493dc171114b0")
      public
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit) {
      }

      public fun overrides(overrides: IResolvable) {
      }

      public fun overrides(overrides: EcsTaskOverrideProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe7b5a319437fa5477d5c6c3f363bf105c7bae2e5d6013e31153919a513fb440")
      public fun overrides(overrides: EcsTaskOverrideProperty.Builder.() -> Unit) {
      }

      public fun placementConstraints(placementConstraints: IResolvable) {
      }

      public fun placementConstraints(placementConstraints: List<Any>) {
      }

      public fun placementStrategy(placementStrategy: IResolvable) {
      }

      public fun placementStrategy(placementStrategy: List<Any>) {
      }

      public fun platformVersion(platformVersion: String) {
      }

      public fun propagateTags(propagateTags: String) {
      }

      public fun referenceId(referenceId: String) {
      }

      public fun tags(tags: List<CfnTag>) {
      }

      public fun taskCount(taskCount: Number) {
      }

      public fun taskDefinitionArn(taskDefinitionArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty.builder()

      public override fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.let(IResolvable::unwrap))
      }

      public override fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
      }

      public override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
      }

      public override fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags.let(IResolvable::unwrap))
      }

      public override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
      }

      public override fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand.let(IResolvable::unwrap))
      }

      public override fun group(group: String) {
        cdkBuilder.group(group)
      }

      public override fun launchType(launchType: String) {
        cdkBuilder.launchType(launchType)
      }

      public override fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
      }

      public override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c7e89dc9b6033d1ae9fbfb05a091dcfe0b1ddf5eabb920fc47493dc171114b0")
      public override
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
          Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

      public override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
      }

      public override fun overrides(overrides: EcsTaskOverrideProperty) {
        cdkBuilder.overrides(overrides.let(EcsTaskOverrideProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe7b5a319437fa5477d5c6c3f363bf105c7bae2e5d6013e31153919a513fb440")
      public override fun overrides(overrides: EcsTaskOverrideProperty.Builder.() -> Unit): Unit =
          overrides(EcsTaskOverrideProperty(overrides))

      public override fun placementConstraints(placementConstraints: IResolvable) {
        cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
      }

      public override fun placementConstraints(placementConstraints: List<Any>) {
        cdkBuilder.placementConstraints(placementConstraints)
      }

      public override fun placementStrategy(placementStrategy: IResolvable) {
        cdkBuilder.placementStrategy(placementStrategy.let(IResolvable::unwrap))
      }

      public override fun placementStrategy(placementStrategy: List<Any>) {
        cdkBuilder.placementStrategy(placementStrategy)
      }

      public override fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
      }

      public override fun propagateTags(propagateTags: String) {
        cdkBuilder.propagateTags(propagateTags)
      }

      public override fun referenceId(referenceId: String) {
        cdkBuilder.referenceId(referenceId)
      }

      public override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public override fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
      }

      public override fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty,
    ) : PipeTargetEcsTaskParametersProperty {
      public override fun capacityProviderStrategy(): Any? =
          unwrap(this).getCapacityProviderStrategy()

      public override fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

      public override fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

      public override fun group(): String? = unwrap(this).getGroup()

      public override fun launchType(): String? = unwrap(this).getLaunchType()

      public override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

      public override fun overrides(): Any? = unwrap(this).getOverrides()

      public override fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

      public override fun placementStrategy(): Any? = unwrap(this).getPlacementStrategy()

      public override fun platformVersion(): String? = unwrap(this).getPlatformVersion()

      public override fun propagateTags(): String? = unwrap(this).getPropagateTags()

      public override fun referenceId(): String? = unwrap(this).getReferenceId()

      public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
          emptyList()

      public override fun taskCount(): Number? = unwrap(this).getTaskCount()

      public override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetEcsTaskParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty):
          PipeTargetEcsTaskParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetEcsTaskParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetEcsTaskParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudwatchLogsLogDestinationProperty {
    public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    public interface Builder {
      public fun logGroupArn(logGroupArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty.builder()

      public override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty,
    ) : CloudwatchLogsLogDestinationProperty {
      public override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudwatchLogsLogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty):
          CloudwatchLogsLogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchLogsLogDestinationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.CloudwatchLogsLogDestinationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PlacementStrategyProperty {
    public fun `field`(): String? = unwrap(this).getField()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun `field`(`field`: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty.builder()

      public override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty,
    ) : PlacementStrategyProperty {
      public override fun `field`(): String? = unwrap(this).getField()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty):
          PlacementStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementStrategyProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PlacementStrategyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PipeTargetRedshiftDataParametersProperty {
    public fun database(): String

    public fun dbUser(): String? = unwrap(this).getDbUser()

    public fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

    public fun sqls(): List<String>

    public fun statementName(): String? = unwrap(this).getStatementName()

    public fun withEvent(): Any? = unwrap(this).getWithEvent()

    public interface Builder {
      public fun database(database: String) {
      }

      public fun dbUser(dbUser: String) {
      }

      public fun secretManagerArn(secretManagerArn: String) {
      }

      public fun sqls(sqls: List<String>) {
      }

      public fun statementName(statementName: String) {
      }

      public fun withEvent(withEvent: Boolean) {
      }

      public fun withEvent(withEvent: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty.builder()

      public override fun database(database: String) {
        cdkBuilder.database(database)
      }

      public override fun dbUser(dbUser: String) {
        cdkBuilder.dbUser(dbUser)
      }

      public override fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
      }

      public override fun sqls(sqls: List<String>) {
        cdkBuilder.sqls(sqls)
      }

      public override fun statementName(statementName: String) {
        cdkBuilder.statementName(statementName)
      }

      public override fun withEvent(withEvent: Boolean) {
        cdkBuilder.withEvent(withEvent)
      }

      public override fun withEvent(withEvent: IResolvable) {
        cdkBuilder.withEvent(withEvent.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty,
    ) : PipeTargetRedshiftDataParametersProperty {
      public override fun database(): String = unwrap(this).getDatabase()

      public override fun dbUser(): String? = unwrap(this).getDbUser()

      public override fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

      public override fun sqls(): List<String> = unwrap(this).getSqls() ?: emptyList()

      public override fun statementName(): String? = unwrap(this).getStatementName()

      public override fun withEvent(): Any? = unwrap(this).getWithEvent()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetRedshiftDataParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty):
          PipeTargetRedshiftDataParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetRedshiftDataParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetRedshiftDataParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PipeSourceDynamoDBStreamParametersProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    public fun onPartialBatchItemFailure(): String? = unwrap(this).getOnPartialBatchItemFailure()

    public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    public fun startingPosition(): String

    public interface Builder {
      public fun batchSize(batchSize: Number) {
      }

      public fun deadLetterConfig(deadLetterConfig: IResolvable) {
      }

      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dacbe92b58839d5ce155c2659703438633ee0c027e107cab3c824896ba6d547e")
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit) {
      }

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      }

      public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
      }

      public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      }

      public fun onPartialBatchItemFailure(onPartialBatchItemFailure: String) {
      }

      public fun parallelizationFactor(parallelizationFactor: Number) {
      }

      public fun startingPosition(startingPosition: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty.builder()

      public override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      public override fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable::unwrap))
      }

      public override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dacbe92b58839d5ce155c2659703438633ee0c027e107cab3c824896ba6d547e")
      public override
          fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit): Unit
          = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

      public override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      public override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
      }

      public override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      public override fun onPartialBatchItemFailure(onPartialBatchItemFailure: String) {
        cdkBuilder.onPartialBatchItemFailure(onPartialBatchItemFailure)
      }

      public override fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
      }

      public override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty,
    ) : PipeSourceDynamoDBStreamParametersProperty {
      public override fun batchSize(): Number? = unwrap(this).getBatchSize()

      public override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

      public override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      public override fun maximumRecordAgeInSeconds(): Number? =
          unwrap(this).getMaximumRecordAgeInSeconds()

      public override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

      public override fun onPartialBatchItemFailure(): String? =
          unwrap(this).getOnPartialBatchItemFailure()

      public override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

      public override fun startingPosition(): String = unwrap(this).getStartingPosition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceDynamoDBStreamParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty):
          PipeSourceDynamoDBStreamParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceDynamoDBStreamParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceDynamoDBStreamParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PipeSourceSelfManagedKafkaParametersProperty {
    public fun additionalBootstrapServers(): List<String> =
        unwrap(this).getAdditionalBootstrapServers() ?: emptyList()

    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    public fun credentials(): Any? = unwrap(this).getCredentials()

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun serverRootCaCertificate(): String? = unwrap(this).getServerRootCaCertificate()

    public fun startingPosition(): String? = unwrap(this).getStartingPosition()

    public fun topicName(): String

    public fun vpc(): Any? = unwrap(this).getVpc()

    public interface Builder {
      public fun additionalBootstrapServers(additionalBootstrapServers: List<String>) {
      }

      public fun batchSize(batchSize: Number) {
      }

      public fun consumerGroupId(consumerGroupId: String) {
      }

      public fun credentials(credentials: IResolvable) {
      }

      public fun credentials(credentials: SelfManagedKafkaAccessConfigurationCredentialsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("608c4a62fa714f76e72b281f90139567a11defec495b6cac7eb485ac50212b54")
      public
          fun credentials(credentials: SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder.() -> Unit) {
      }

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      }

      public fun serverRootCaCertificate(serverRootCaCertificate: String) {
      }

      public fun startingPosition(startingPosition: String) {
      }

      public fun topicName(topicName: String) {
      }

      public fun vpc(vpc: IResolvable) {
      }

      public fun vpc(vpc: SelfManagedKafkaAccessConfigurationVpcProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3254ea480089933b424f01c7d30a3cfb1bafc805fd199f9254325c45c1a3b863")
      public fun vpc(vpc: SelfManagedKafkaAccessConfigurationVpcProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty.builder()

      public override fun additionalBootstrapServers(additionalBootstrapServers: List<String>) {
        cdkBuilder.additionalBootstrapServers(additionalBootstrapServers)
      }

      public override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      public override fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
      }

      public override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
      }

      public override
          fun credentials(credentials: SelfManagedKafkaAccessConfigurationCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(SelfManagedKafkaAccessConfigurationCredentialsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("608c4a62fa714f76e72b281f90139567a11defec495b6cac7eb485ac50212b54")
      public override
          fun credentials(credentials: SelfManagedKafkaAccessConfigurationCredentialsProperty.Builder.() -> Unit):
          Unit = credentials(SelfManagedKafkaAccessConfigurationCredentialsProperty(credentials))

      public override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      public override fun serverRootCaCertificate(serverRootCaCertificate: String) {
        cdkBuilder.serverRootCaCertificate(serverRootCaCertificate)
      }

      public override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      public override fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
      }

      public override fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc.let(IResolvable::unwrap))
      }

      public override fun vpc(vpc: SelfManagedKafkaAccessConfigurationVpcProperty) {
        cdkBuilder.vpc(vpc.let(SelfManagedKafkaAccessConfigurationVpcProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3254ea480089933b424f01c7d30a3cfb1bafc805fd199f9254325c45c1a3b863")
      public override
          fun vpc(vpc: SelfManagedKafkaAccessConfigurationVpcProperty.Builder.() -> Unit): Unit =
          vpc(SelfManagedKafkaAccessConfigurationVpcProperty(vpc))

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty,
    ) : PipeSourceSelfManagedKafkaParametersProperty {
      public override fun additionalBootstrapServers(): List<String> =
          unwrap(this).getAdditionalBootstrapServers() ?: emptyList()

      public override fun batchSize(): Number? = unwrap(this).getBatchSize()

      public override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

      public override fun credentials(): Any? = unwrap(this).getCredentials()

      public override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      public override fun serverRootCaCertificate(): String? =
          unwrap(this).getServerRootCaCertificate()

      public override fun startingPosition(): String? = unwrap(this).getStartingPosition()

      public override fun topicName(): String = unwrap(this).getTopicName()

      public override fun vpc(): Any? = unwrap(this).getVpc()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceSelfManagedKafkaParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty):
          PipeSourceSelfManagedKafkaParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceSelfManagedKafkaParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceSelfManagedKafkaParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PipeSourceKinesisStreamParametersProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    public fun onPartialBatchItemFailure(): String? = unwrap(this).getOnPartialBatchItemFailure()

    public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    public fun startingPosition(): String

    public fun startingPositionTimestamp(): String? = unwrap(this).getStartingPositionTimestamp()

    public interface Builder {
      public fun batchSize(batchSize: Number) {
      }

      public fun deadLetterConfig(deadLetterConfig: IResolvable) {
      }

      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("330804005739bdc46bcac3eab99716eee99837d9c978725c43669bb3a4b7adba")
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit) {
      }

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      }

      public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
      }

      public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      }

      public fun onPartialBatchItemFailure(onPartialBatchItemFailure: String) {
      }

      public fun parallelizationFactor(parallelizationFactor: Number) {
      }

      public fun startingPosition(startingPosition: String) {
      }

      public fun startingPositionTimestamp(startingPositionTimestamp: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty.builder()

      public override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      public override fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable::unwrap))
      }

      public override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("330804005739bdc46bcac3eab99716eee99837d9c978725c43669bb3a4b7adba")
      public override
          fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit): Unit
          = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

      public override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      public override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
      }

      public override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      public override fun onPartialBatchItemFailure(onPartialBatchItemFailure: String) {
        cdkBuilder.onPartialBatchItemFailure(onPartialBatchItemFailure)
      }

      public override fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
      }

      public override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      public override fun startingPositionTimestamp(startingPositionTimestamp: String) {
        cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty,
    ) : PipeSourceKinesisStreamParametersProperty {
      public override fun batchSize(): Number? = unwrap(this).getBatchSize()

      public override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

      public override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      public override fun maximumRecordAgeInSeconds(): Number? =
          unwrap(this).getMaximumRecordAgeInSeconds()

      public override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

      public override fun onPartialBatchItemFailure(): String? =
          unwrap(this).getOnPartialBatchItemFailure()

      public override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

      public override fun startingPosition(): String = unwrap(this).getStartingPosition()

      public override fun startingPositionTimestamp(): String? =
          unwrap(this).getStartingPositionTimestamp()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeSourceKinesisStreamParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty):
          PipeSourceKinesisStreamParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeSourceKinesisStreamParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeSourceKinesisStreamParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FilterProperty {
    public fun pattern(): String? = unwrap(this).getPattern()

    public interface Builder {
      public fun pattern(pattern: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty.builder()

      public override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty,
    ) : FilterProperty {
      public override fun pattern(): String? = unwrap(this).getPattern()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.FilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BatchArrayPropertiesProperty {
    public fun size(): Number? = unwrap(this).getSize()

    public interface Builder {
      public fun size(size: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty.builder()

      public override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty,
    ) : BatchArrayPropertiesProperty {
      public override fun size(): Number? = unwrap(this).getSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchArrayPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty):
          BatchArrayPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchArrayPropertiesProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.BatchArrayPropertiesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PipeTargetStateMachineParametersProperty {
    public fun invocationType(): String? = unwrap(this).getInvocationType()

    public interface Builder {
      public fun invocationType(invocationType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty.builder()

      public override fun invocationType(invocationType: String) {
        cdkBuilder.invocationType(invocationType)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty,
    ) : PipeTargetStateMachineParametersProperty {
      public override fun invocationType(): String? = unwrap(this).getInvocationType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetStateMachineParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty):
          PipeTargetStateMachineParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetStateMachineParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetStateMachineParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EcsTaskOverrideProperty {
    public fun containerOverrides(): Any? = unwrap(this).getContainerOverrides()

    public fun cpu(): String? = unwrap(this).getCpu()

    public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    public fun inferenceAcceleratorOverrides(): Any? =
        unwrap(this).getInferenceAcceleratorOverrides()

    public fun memory(): String? = unwrap(this).getMemory()

    public fun taskRoleArn(): String? = unwrap(this).getTaskRoleArn()

    public interface Builder {
      public fun containerOverrides(containerOverrides: IResolvable) {
      }

      public fun containerOverrides(containerOverrides: List<Any>) {
      }

      public fun cpu(cpu: String) {
      }

      public fun ephemeralStorage(ephemeralStorage: IResolvable) {
      }

      public fun ephemeralStorage(ephemeralStorage: EcsEphemeralStorageProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e66a1eef9e548aa48d8ef188ff03eefebd35f5fd3a521a9c9624ebde2ebe12b")
      public
          fun ephemeralStorage(ephemeralStorage: EcsEphemeralStorageProperty.Builder.() -> Unit) {
      }

      public fun executionRoleArn(executionRoleArn: String) {
      }

      public fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: IResolvable) {
      }

      public fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: List<Any>) {
      }

      public fun memory(memory: String) {
      }

      public fun taskRoleArn(taskRoleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty.builder()

      public override fun containerOverrides(containerOverrides: IResolvable) {
        cdkBuilder.containerOverrides(containerOverrides.let(IResolvable::unwrap))
      }

      public override fun containerOverrides(containerOverrides: List<Any>) {
        cdkBuilder.containerOverrides(containerOverrides)
      }

      public override fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
      }

      public override fun ephemeralStorage(ephemeralStorage: IResolvable) {
        cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
      }

      public override fun ephemeralStorage(ephemeralStorage: EcsEphemeralStorageProperty) {
        cdkBuilder.ephemeralStorage(ephemeralStorage.let(EcsEphemeralStorageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e66a1eef9e548aa48d8ef188ff03eefebd35f5fd3a521a9c9624ebde2ebe12b")
      public override
          fun ephemeralStorage(ephemeralStorage: EcsEphemeralStorageProperty.Builder.() -> Unit):
          Unit = ephemeralStorage(EcsEphemeralStorageProperty(ephemeralStorage))

      public override fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
      }

      public override
          fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: IResolvable) {
        cdkBuilder.inferenceAcceleratorOverrides(inferenceAcceleratorOverrides.let(IResolvable::unwrap))
      }

      public override fun inferenceAcceleratorOverrides(inferenceAcceleratorOverrides: List<Any>) {
        cdkBuilder.inferenceAcceleratorOverrides(inferenceAcceleratorOverrides)
      }

      public override fun memory(memory: String) {
        cdkBuilder.memory(memory)
      }

      public override fun taskRoleArn(taskRoleArn: String) {
        cdkBuilder.taskRoleArn(taskRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty,
    ) : EcsTaskOverrideProperty {
      public override fun containerOverrides(): Any? = unwrap(this).getContainerOverrides()

      public override fun cpu(): String? = unwrap(this).getCpu()

      public override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

      public override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

      public override fun inferenceAcceleratorOverrides(): Any? =
          unwrap(this).getInferenceAcceleratorOverrides()

      public override fun memory(): String? = unwrap(this).getMemory()

      public override fun taskRoleArn(): String? = unwrap(this).getTaskRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EcsTaskOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty):
          EcsTaskOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsTaskOverrideProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsTaskOverrideProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PipeEnrichmentHttpParametersProperty {
    public fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

    public fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
        emptyList()

    public fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()

    public interface Builder {
      public fun headerParameters(headerParameters: IResolvable) {
      }

      public fun headerParameters(headerParameters: Map<String, String>) {
      }

      public fun pathParameterValues(pathParameterValues: List<String>) {
      }

      public fun queryStringParameters(queryStringParameters: IResolvable) {
      }

      public fun queryStringParameters(queryStringParameters: Map<String, String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty.builder()

      public override fun headerParameters(headerParameters: IResolvable) {
        cdkBuilder.headerParameters(headerParameters.let(IResolvable::unwrap))
      }

      public override fun headerParameters(headerParameters: Map<String, String>) {
        cdkBuilder.headerParameters(headerParameters)
      }

      public override fun pathParameterValues(pathParameterValues: List<String>) {
        cdkBuilder.pathParameterValues(pathParameterValues)
      }

      public override fun queryStringParameters(queryStringParameters: IResolvable) {
        cdkBuilder.queryStringParameters(queryStringParameters.let(IResolvable::unwrap))
      }

      public override fun queryStringParameters(queryStringParameters: Map<String, String>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty,
    ) : PipeEnrichmentHttpParametersProperty {
      public override fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

      public override fun pathParameterValues(): List<String> =
          unwrap(this).getPathParameterValues() ?: emptyList()

      public override fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeEnrichmentHttpParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty):
          PipeEnrichmentHttpParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeEnrichmentHttpParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeEnrichmentHttpParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MSKAccessCredentialsProperty {
    public fun clientCertificateTlsAuth(): String? = unwrap(this).getClientCertificateTlsAuth()

    public fun saslScram512Auth(): String? = unwrap(this).getSaslScram512Auth()

    public interface Builder {
      public fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
      }

      public fun saslScram512Auth(saslScram512Auth: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty.builder()

      public override fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
        cdkBuilder.clientCertificateTlsAuth(clientCertificateTlsAuth)
      }

      public override fun saslScram512Auth(saslScram512Auth: String) {
        cdkBuilder.saslScram512Auth(saslScram512Auth)
      }

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty,
    ) : MSKAccessCredentialsProperty {
      public override fun clientCertificateTlsAuth(): String? =
          unwrap(this).getClientCertificateTlsAuth()

      public override fun saslScram512Auth(): String? = unwrap(this).getSaslScram512Auth()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MSKAccessCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty):
          MSKAccessCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MSKAccessCredentialsProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.MSKAccessCredentialsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EcsResourceRequirementProperty {
    public fun type(): String

    public fun `value`(): String

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty,
    ) : EcsResourceRequirementProperty {
      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EcsResourceRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty):
          EcsResourceRequirementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsResourceRequirementProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.EcsResourceRequirementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PipeTargetCloudWatchLogsParametersProperty {
    public fun logStreamName(): String? = unwrap(this).getLogStreamName()

    public fun timestamp(): String? = unwrap(this).getTimestamp()

    public interface Builder {
      public fun logStreamName(logStreamName: String) {
      }

      public fun timestamp(timestamp: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty.Builder
          =
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty.builder()

      public override fun logStreamName(logStreamName: String) {
        cdkBuilder.logStreamName(logStreamName)
      }

      public override fun timestamp(timestamp: String) {
        cdkBuilder.timestamp(timestamp)
      }

      public fun build():
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty,
    ) : PipeTargetCloudWatchLogsParametersProperty {
      public override fun logStreamName(): String? = unwrap(this).getLogStreamName()

      public override fun timestamp(): String? = unwrap(this).getTimestamp()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PipeTargetCloudWatchLogsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty):
          PipeTargetCloudWatchLogsParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PipeTargetCloudWatchLogsParametersProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.PipeTargetCloudWatchLogsParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkConfigurationProperty {
    public fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()

    public interface Builder {
      public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
      }

      public fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("015d29762bcaa3c4aa1b0e65a21e6f6ddf4c669c51cab4b6634878489eedb96f")
      public
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty.Builder =
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty.builder()

      public override fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(IResolvable::unwrap))
      }

      public override fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(AwsVpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("015d29762bcaa3c4aa1b0e65a21e6f6ddf4c669c51cab4b6634878489eedb96f")
      public override
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsvpcConfiguration(AwsVpcConfigurationProperty(awsvpcConfiguration))

      public fun build(): software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty,
    ) : NetworkConfigurationProperty {
      public override fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.pipes.CfnPipe.NetworkConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
