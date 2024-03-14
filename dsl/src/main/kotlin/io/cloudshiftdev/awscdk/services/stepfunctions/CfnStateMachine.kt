package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStateMachine internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun attrStateMachineRevisionId(): String =
      unwrap(this).getAttrStateMachineRevisionId()

  public open fun definition(): Any? = unwrap(this).getDefinition()

  public open fun definition(`value`: Any) {
    unwrap(this).setDefinition(`value`)
  }

  public open fun definitionS3Location(): Any? = unwrap(this).getDefinitionS3Location()

  public open fun definitionS3Location(`value`: IResolvable) {
    unwrap(this).setDefinitionS3Location(`value`.let(IResolvable::unwrap))
  }

  public open fun definitionS3Location(`value`: S3LocationProperty) {
    unwrap(this).setDefinitionS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db59852a0ba408f15c9c85adff0afa12bb1e6a4ae08b50a6530421397112f1a1")
  public open fun definitionS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      definitionS3Location(S3LocationProperty(`value`))

  public open fun definitionString(): String? = unwrap(this).getDefinitionString()

  public open fun definitionString(`value`: String) {
    unwrap(this).setDefinitionString(`value`)
  }

  public open fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

  public open fun definitionSubstitutions(`value`: IResolvable) {
    unwrap(this).setDefinitionSubstitutions(`value`.let(IResolvable::unwrap))
  }

  public open fun definitionSubstitutions(`value`: Map<String, String>) {
    unwrap(this).setDefinitionSubstitutions(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  public open fun loggingConfiguration(`value`: IResolvable) {
    unwrap(this).setLoggingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLoggingConfiguration(`value`.let(LoggingConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("05de295561abe677725ef1b2055690cad1033da93c767642f2df8443812ccf8b")
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty.Builder.() -> Unit):
      Unit = loggingConfiguration(LoggingConfigurationProperty(`value`))

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun stateMachineName(): String? = unwrap(this).getStateMachineName()

  public open fun stateMachineName(`value`: String) {
    unwrap(this).setStateMachineName(`value`)
  }

  public open fun stateMachineType(): String? = unwrap(this).getStateMachineType()

  public open fun stateMachineType(`value`: String) {
    unwrap(this).setStateMachineType(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<TagsEntryProperty> =
      unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

  public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty::unwrap))
  }

  public open fun tracingConfiguration(): Any? = unwrap(this).getTracingConfiguration()

  public open fun tracingConfiguration(`value`: IResolvable) {
    unwrap(this).setTracingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun tracingConfiguration(`value`: TracingConfigurationProperty) {
    unwrap(this).setTracingConfiguration(`value`.let(TracingConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d1967000550ba1045aab18f6d825af60fc8cf0d7b79d2d8eee4f6b75583045c")
  public open fun tracingConfiguration(`value`: TracingConfigurationProperty.Builder.() -> Unit):
      Unit = tracingConfiguration(TracingConfigurationProperty(`value`))

  public interface Builder {
    public fun definition(definition: Any) {
    }

    public fun definitionS3Location(definitionS3Location: IResolvable) {
    }

    public fun definitionS3Location(definitionS3Location: S3LocationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb91d2880c08f8cce2cd0af04a2a3eecc09e8fd6582da5821f01a10d04625122")
    public fun definitionS3Location(definitionS3Location: S3LocationProperty.Builder.() -> Unit) {
    }

    public fun definitionString(definitionString: String) {
    }

    public fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
    }

    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
    }

    public fun loggingConfiguration(loggingConfiguration: IResolvable) {
    }

    public fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd444e26170c896e677096152567e3952b5e3918cdcb2b7b08247377e9040b7e")
    public
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun stateMachineName(stateMachineName: String) {
    }

    public fun stateMachineType(stateMachineType: String) {
    }

    public fun tags(tags: List<TagsEntryProperty>) {
    }

    public fun tracingConfiguration(tracingConfiguration: IResolvable) {
    }

    public fun tracingConfiguration(tracingConfiguration: TracingConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e5b2dbb55d6717ac848eee9a562bad6fe394f4ef85b956a0e7d0b7fc2f329f9")
    public
        fun tracingConfiguration(tracingConfiguration: TracingConfigurationProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachine.Builder.create(scope, id)

    public override fun definition(definition: Any) {
      cdkBuilder.definition(definition)
    }

    public override fun definitionS3Location(definitionS3Location: IResolvable) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(IResolvable::unwrap))
    }

    public override fun definitionS3Location(definitionS3Location: S3LocationProperty) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(S3LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb91d2880c08f8cce2cd0af04a2a3eecc09e8fd6582da5821f01a10d04625122")
    public override
        fun definitionS3Location(definitionS3Location: S3LocationProperty.Builder.() -> Unit): Unit
        = definitionS3Location(S3LocationProperty(definitionS3Location))

    public override fun definitionString(definitionString: String) {
      cdkBuilder.definitionString(definitionString)
    }

    public override fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions.let(IResolvable::unwrap))
    }

    public override fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    public override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    public override fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(LoggingConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd444e26170c896e677096152567e3952b5e3918cdcb2b7b08247377e9040b7e")
    public override
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(LoggingConfigurationProperty(loggingConfiguration))

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun stateMachineName(stateMachineName: String) {
      cdkBuilder.stateMachineName(stateMachineName)
    }

    public override fun stateMachineType(stateMachineType: String) {
      cdkBuilder.stateMachineType(stateMachineType)
    }

    public override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty::unwrap))
    }

    public override fun tracingConfiguration(tracingConfiguration: IResolvable) {
      cdkBuilder.tracingConfiguration(tracingConfiguration.let(IResolvable::unwrap))
    }

    public override fun tracingConfiguration(tracingConfiguration: TracingConfigurationProperty) {
      cdkBuilder.tracingConfiguration(tracingConfiguration.let(TracingConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e5b2dbb55d6717ac848eee9a562bad6fe394f4ef85b956a0e7d0b7fc2f329f9")
    public override
        fun tracingConfiguration(tracingConfiguration: TracingConfigurationProperty.Builder.() -> Unit):
        Unit = tracingConfiguration(TracingConfigurationProperty(tracingConfiguration))

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnStateMachine =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStateMachine {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStateMachine(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine):
        CfnStateMachine = CfnStateMachine(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachine):
        software.amazon.awscdk.services.stepfunctions.CfnStateMachine = wrapped.cdkObject
  }

  public interface LoggingConfigurationProperty {
    public fun destinations(): Any? = unwrap(this).getDestinations()

    public fun includeExecutionData(): Any? = unwrap(this).getIncludeExecutionData()

    public fun level(): String? = unwrap(this).getLevel()

    public interface Builder {
      public fun destinations(destinations: IResolvable) {
      }

      public fun destinations(destinations: List<Any>) {
      }

      public fun includeExecutionData(includeExecutionData: Boolean) {
      }

      public fun includeExecutionData(includeExecutionData: IResolvable) {
      }

      public fun level(level: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty.builder()

      public override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
      }

      public override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations)
      }

      public override fun includeExecutionData(includeExecutionData: Boolean) {
        cdkBuilder.includeExecutionData(includeExecutionData)
      }

      public override fun includeExecutionData(includeExecutionData: IResolvable) {
        cdkBuilder.includeExecutionData(includeExecutionData.let(IResolvable::unwrap))
      }

      public override fun level(level: String) {
        cdkBuilder.level(level)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty,
    ) : LoggingConfigurationProperty {
      public override fun destinations(): Any? = unwrap(this).getDestinations()

      public override fun includeExecutionData(): Any? = unwrap(this).getIncludeExecutionData()

      public override fun level(): String? = unwrap(this).getLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty):
          LoggingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3LocationProperty {
    public fun bucket(): String

    public fun key(): String

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun bucket(bucket: String) {
      }

      public fun key(key: String) {
      }

      public fun version(version: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty.Builder =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty.builder()

      public override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty,
    ) : S3LocationProperty {
      public override fun bucket(): String = unwrap(this).getBucket()

      public override fun key(): String = unwrap(this).getKey()

      public override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LogDestinationProperty {
    public fun cloudWatchLogsLogGroup(): Any? = unwrap(this).getCloudWatchLogsLogGroup()

    public interface Builder {
      public fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: IResolvable) {
      }

      public fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dd76848786f3d940ef85b178e7d7f8f3f3f96bb92885fa871fe9d82ef8dca13")
      public
          fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty.builder()

      public override fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: IResolvable) {
        cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup.let(IResolvable::unwrap))
      }

      public override
          fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty) {
        cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup.let(CloudWatchLogsLogGroupProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dd76848786f3d940ef85b178e7d7f8f3f3f96bb92885fa871fe9d82ef8dca13")
      public override
          fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty.Builder.() -> Unit):
          Unit = cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty(cloudWatchLogsLogGroup))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty,
    ) : LogDestinationProperty {
      public override fun cloudWatchLogsLogGroup(): Any? = unwrap(this).getCloudWatchLogsLogGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty):
          LogDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogDestinationProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudWatchLogsLogGroupProperty {
    public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    public interface Builder {
      public fun logGroupArn(logGroupArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty.builder()

      public override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty,
    ) : CloudWatchLogsLogGroupProperty {
      public override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogsLogGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty):
          CloudWatchLogsLogGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsLogGroupProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TagsEntryProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty,
    ) : TagsEntryProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty):
          TagsEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TracingConfigurationProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty,
    ) : TracingConfigurationProperty {
      public override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TracingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty):
          TracingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TracingConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
