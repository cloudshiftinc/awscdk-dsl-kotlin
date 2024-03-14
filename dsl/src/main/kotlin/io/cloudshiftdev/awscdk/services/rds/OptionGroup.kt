package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.ec2.Connections
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class OptionGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.OptionGroup,
) : Resource(cdkObject), IOptionGroup {
  public override fun addConfiguration(configuration: OptionConfiguration): Boolean =
      unwrap(this).addConfiguration(configuration.let(OptionConfiguration::unwrap))

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12b43bc5b68d5862bb4430eddcc0fef9fc36fe009a38b9e972fbd6e89f47a190")
  public override fun addConfiguration(configuration: OptionConfiguration.Builder.() -> Unit):
      Boolean = addConfiguration(OptionConfiguration(configuration))

  public open fun optionConnections(): Map<String, Connections> =
      unwrap(this).getOptionConnections().mapValues{Connections.wrap(it.value)} ?: emptyMap()

  public override fun optionGroupName(): String = unwrap(this).getOptionGroupName()

  public interface Builder {
    public fun configurations(configurations: List<OptionConfiguration>)

    public fun description(description: String)

    public fun engine(engine: IInstanceEngine)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.OptionGroup.Builder =
        software.amazon.awscdk.services.rds.OptionGroup.Builder.create(scope, id)

    override fun configurations(configurations: List<OptionConfiguration>) {
      cdkBuilder.configurations(configurations.map(OptionConfiguration::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engine(engine: IInstanceEngine) {
      cdkBuilder.engine(engine.let(IInstanceEngine::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OptionGroup = cdkBuilder.build()
  }

  public companion object {
    public open fun fromOptionGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      optionGroupName: String,
    ): IOptionGroup =
        software.amazon.awscdk.services.rds.OptionGroup.fromOptionGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, optionGroupName).let(IOptionGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): OptionGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return OptionGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.OptionGroup): OptionGroup =
        OptionGroup(cdkObject)

    internal fun unwrap(wrapped: OptionGroup): software.amazon.awscdk.services.rds.OptionGroup =
        wrapped.cdkObject
  }
}
