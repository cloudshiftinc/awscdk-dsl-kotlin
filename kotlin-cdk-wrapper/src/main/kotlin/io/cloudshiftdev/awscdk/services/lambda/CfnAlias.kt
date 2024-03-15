@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAlias internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.CfnAlias,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun functionName(): String = unwrap(this).getFunctionName()

  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  public open fun functionVersion(): String = unwrap(this).getFunctionVersion()

  public open fun functionVersion(`value`: String) {
    unwrap(this).setFunctionVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun provisionedConcurrencyConfig(): Any? =
      unwrap(this).getProvisionedConcurrencyConfig()

  public open fun provisionedConcurrencyConfig(`value`: IResolvable) {
    unwrap(this).setProvisionedConcurrencyConfig(`value`.let(IResolvable::unwrap))
  }

  public open
      fun provisionedConcurrencyConfig(`value`: ProvisionedConcurrencyConfigurationProperty) {
    unwrap(this).setProvisionedConcurrencyConfig(`value`.let(ProvisionedConcurrencyConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("16f8bd48899efb2fe864e6fefae1a4309339af9ad13219141095afda0ee979da")
  public open
      fun provisionedConcurrencyConfig(`value`: ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit):
      Unit = provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty(`value`))

  public open fun routingConfig(): Any? = unwrap(this).getRoutingConfig()

  public open fun routingConfig(`value`: IResolvable) {
    unwrap(this).setRoutingConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun routingConfig(`value`: AliasRoutingConfigurationProperty) {
    unwrap(this).setRoutingConfig(`value`.let(AliasRoutingConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("810fe5b519e2ec14e97f1b865992691b644a141d614646aecd85378f970aabf7")
  public open fun routingConfig(`value`: AliasRoutingConfigurationProperty.Builder.() -> Unit): Unit
      = routingConfig(AliasRoutingConfigurationProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun functionName(functionName: String)

    public fun functionVersion(functionVersion: String)

    public fun name(name: String)

    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable)

    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da7ae274a617e7e7981478d5147e65d07a97ce375e8f41da28dabb437d23a30e")
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit)

    public fun routingConfig(routingConfig: IResolvable)

    public fun routingConfig(routingConfig: AliasRoutingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("817345b2ea650b8bd76d585e4f3a58e86ece9f79b45e385598defd773387870e")
    public fun routingConfig(routingConfig: AliasRoutingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnAlias.Builder =
        software.amazon.awscdk.services.lambda.CfnAlias.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun functionVersion(functionVersion: String) {
      cdkBuilder.functionVersion(functionVersion)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(IResolvable::unwrap))
    }

    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(ProvisionedConcurrencyConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da7ae274a617e7e7981478d5147e65d07a97ce375e8f41da28dabb437d23a30e")
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit):
        Unit =
        provisionedConcurrencyConfig(ProvisionedConcurrencyConfigurationProperty(provisionedConcurrencyConfig))

    override fun routingConfig(routingConfig: IResolvable) {
      cdkBuilder.routingConfig(routingConfig.let(IResolvable::unwrap))
    }

    override fun routingConfig(routingConfig: AliasRoutingConfigurationProperty) {
      cdkBuilder.routingConfig(routingConfig.let(AliasRoutingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("817345b2ea650b8bd76d585e4f3a58e86ece9f79b45e385598defd773387870e")
    override fun routingConfig(routingConfig: AliasRoutingConfigurationProperty.Builder.() -> Unit):
        Unit = routingConfig(AliasRoutingConfigurationProperty(routingConfig))

    public fun build(): software.amazon.awscdk.services.lambda.CfnAlias = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lambda.CfnAlias.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnAlias): CfnAlias =
        CfnAlias(cdkObject)

    internal fun unwrap(wrapped: CfnAlias): software.amazon.awscdk.services.lambda.CfnAlias =
        wrapped.cdkObject
  }

  public interface AliasRoutingConfigurationProperty {
    public fun additionalVersionWeights(): Any

    @CdkDslMarker
    public interface Builder {
      public fun additionalVersionWeights(additionalVersionWeights: IResolvable)

      public fun additionalVersionWeights(additionalVersionWeights: List<Any>)

      public fun additionalVersionWeights(vararg additionalVersionWeights: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty.builder()

      override fun additionalVersionWeights(additionalVersionWeights: IResolvable) {
        cdkBuilder.additionalVersionWeights(additionalVersionWeights.let(IResolvable::unwrap))
      }

      override fun additionalVersionWeights(additionalVersionWeights: List<Any>) {
        cdkBuilder.additionalVersionWeights(additionalVersionWeights)
      }

      override fun additionalVersionWeights(vararg additionalVersionWeights: Any): Unit =
          additionalVersionWeights(additionalVersionWeights.toList())

      public fun build():
          software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty,
    ) : CdkObject(cdkObject), AliasRoutingConfigurationProperty {
      override fun additionalVersionWeights(): Any = unwrap(this).getAdditionalVersionWeights()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AliasRoutingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty):
          AliasRoutingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AliasRoutingConfigurationProperty):
          software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty
    }
  }

  public interface ProvisionedConcurrencyConfigurationProperty {
    public fun provisionedConcurrentExecutions(): Number

    @CdkDslMarker
    public interface Builder {
      public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty.builder()

      override fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
        cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty,
    ) : CdkObject(cdkObject), ProvisionedConcurrencyConfigurationProperty {
      override fun provisionedConcurrentExecutions(): Number =
          unwrap(this).getProvisionedConcurrentExecutions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProvisionedConcurrencyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty):
          ProvisionedConcurrencyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedConcurrencyConfigurationProperty):
          software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnAlias.ProvisionedConcurrencyConfigurationProperty
    }
  }

  public interface VersionWeightProperty {
    public fun functionVersion(): String

    public fun functionWeight(): Number

    @CdkDslMarker
    public interface Builder {
      public fun functionVersion(functionVersion: String)

      public fun functionWeight(functionWeight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.builder()

      override fun functionVersion(functionVersion: String) {
        cdkBuilder.functionVersion(functionVersion)
      }

      override fun functionWeight(functionWeight: Number) {
        cdkBuilder.functionWeight(functionWeight)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty,
    ) : CdkObject(cdkObject), VersionWeightProperty {
      override fun functionVersion(): String = unwrap(this).getFunctionVersion()

      override fun functionWeight(): Number = unwrap(this).getFunctionWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VersionWeightProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty):
          VersionWeightProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VersionWeightProperty):
          software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty
    }
  }
}