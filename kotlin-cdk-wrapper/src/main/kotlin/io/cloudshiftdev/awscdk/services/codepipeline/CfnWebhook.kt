@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWebhook internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.CfnWebhook,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  public open fun authentication(): String = unwrap(this).getAuthentication()

  public open fun authentication(`value`: String) {
    unwrap(this).setAuthentication(`value`)
  }

  public open fun authenticationConfiguration(): Any = unwrap(this).getAuthenticationConfiguration()

  public open fun authenticationConfiguration(`value`: IResolvable) {
    unwrap(this).setAuthenticationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun authenticationConfiguration(`value`: WebhookAuthConfigurationProperty) {
    unwrap(this).setAuthenticationConfiguration(`value`.let(WebhookAuthConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cd78bec4077abfccb48c6e5cb9bcb8d8fc0be3233ef7bf516b5b45c66e202253")
  public open
      fun authenticationConfiguration(`value`: WebhookAuthConfigurationProperty.Builder.() -> Unit):
      Unit = authenticationConfiguration(WebhookAuthConfigurationProperty(`value`))

  public open fun filters(): Any = unwrap(this).getFilters()

  public open fun filters(`value`: IResolvable) {
    unwrap(this).setFilters(`value`.let(IResolvable::unwrap))
  }

  public open fun filters(__idx_ac66f0: List<Any>) {
    unwrap(this).setFilters(__idx_ac66f0)
  }

  public open fun filters(vararg __idx_ac66f0: Any): Unit = filters(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun registerWithThirdParty(): Any? = unwrap(this).getRegisterWithThirdParty()

  public open fun registerWithThirdParty(`value`: Boolean) {
    unwrap(this).setRegisterWithThirdParty(`value`)
  }

  public open fun registerWithThirdParty(`value`: IResolvable) {
    unwrap(this).setRegisterWithThirdParty(`value`.let(IResolvable::unwrap))
  }

  public open fun targetAction(): String = unwrap(this).getTargetAction()

  public open fun targetAction(`value`: String) {
    unwrap(this).setTargetAction(`value`)
  }

  public open fun targetPipeline(): String = unwrap(this).getTargetPipeline()

  public open fun targetPipeline(`value`: String) {
    unwrap(this).setTargetPipeline(`value`)
  }

  public open fun targetPipelineVersion(): Number = unwrap(this).getTargetPipelineVersion()

  public open fun targetPipelineVersion(`value`: Number) {
    unwrap(this).setTargetPipelineVersion(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun authentication(authentication: String)

    public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

    public
        fun authenticationConfiguration(authenticationConfiguration: WebhookAuthConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fab646e614c021815fbcc2e077fc03ead501f79f293f303855a27d9f2a24795")
    public
        fun authenticationConfiguration(authenticationConfiguration: WebhookAuthConfigurationProperty.Builder.() -> Unit)

    public fun filters(filters: IResolvable)

    public fun filters(filters: List<Any>)

    public fun filters(vararg filters: Any)

    public fun name(name: String)

    public fun registerWithThirdParty(registerWithThirdParty: Boolean)

    public fun registerWithThirdParty(registerWithThirdParty: IResolvable)

    public fun targetAction(targetAction: String)

    public fun targetPipeline(targetPipeline: String)

    public fun targetPipelineVersion(targetPipelineVersion: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.CfnWebhook.Builder =
        software.amazon.awscdk.services.codepipeline.CfnWebhook.Builder.create(scope, id)

    override fun authentication(authentication: String) {
      cdkBuilder.authentication(authentication)
    }

    override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun authenticationConfiguration(authenticationConfiguration: WebhookAuthConfigurationProperty) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(WebhookAuthConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fab646e614c021815fbcc2e077fc03ead501f79f293f303855a27d9f2a24795")
    override
        fun authenticationConfiguration(authenticationConfiguration: WebhookAuthConfigurationProperty.Builder.() -> Unit):
        Unit =
        authenticationConfiguration(WebhookAuthConfigurationProperty(authenticationConfiguration))

    override fun filters(filters: IResolvable) {
      cdkBuilder.filters(filters.let(IResolvable::unwrap))
    }

    override fun filters(filters: List<Any>) {
      cdkBuilder.filters(filters)
    }

    override fun filters(vararg filters: Any): Unit = filters(filters.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun registerWithThirdParty(registerWithThirdParty: Boolean) {
      cdkBuilder.registerWithThirdParty(registerWithThirdParty)
    }

    override fun registerWithThirdParty(registerWithThirdParty: IResolvable) {
      cdkBuilder.registerWithThirdParty(registerWithThirdParty.let(IResolvable::unwrap))
    }

    override fun targetAction(targetAction: String) {
      cdkBuilder.targetAction(targetAction)
    }

    override fun targetPipeline(targetPipeline: String) {
      cdkBuilder.targetPipeline(targetPipeline)
    }

    override fun targetPipelineVersion(targetPipelineVersion: Number) {
      cdkBuilder.targetPipelineVersion(targetPipelineVersion)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CfnWebhook = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codepipeline.CfnWebhook.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebhook {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebhook(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnWebhook):
        CfnWebhook = CfnWebhook(cdkObject)

    internal fun unwrap(wrapped: CfnWebhook):
        software.amazon.awscdk.services.codepipeline.CfnWebhook = wrapped.cdkObject
  }

  public interface WebhookFilterRuleProperty {
    public fun jsonPath(): String

    public fun matchEquals(): String? = unwrap(this).getMatchEquals()

    @CdkDslMarker
    public interface Builder {
      public fun jsonPath(jsonPath: String)

      public fun matchEquals(matchEquals: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty.builder()

      override fun jsonPath(jsonPath: String) {
        cdkBuilder.jsonPath(jsonPath)
      }

      override fun matchEquals(matchEquals: String) {
        cdkBuilder.matchEquals(matchEquals)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty,
    ) : CdkObject(cdkObject), WebhookFilterRuleProperty {
      override fun jsonPath(): String = unwrap(this).getJsonPath()

      override fun matchEquals(): String? = unwrap(this).getMatchEquals()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebhookFilterRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty):
          WebhookFilterRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebhookFilterRuleProperty):
          software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty
    }
  }

  public interface WebhookAuthConfigurationProperty {
    public fun allowedIpRange(): String? = unwrap(this).getAllowedIpRange()

    public fun secretToken(): String? = unwrap(this).getSecretToken()

    @CdkDslMarker
    public interface Builder {
      public fun allowedIpRange(allowedIpRange: String)

      public fun secretToken(secretToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty.builder()

      override fun allowedIpRange(allowedIpRange: String) {
        cdkBuilder.allowedIpRange(allowedIpRange)
      }

      override fun secretToken(secretToken: String) {
        cdkBuilder.secretToken(secretToken)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty,
    ) : CdkObject(cdkObject), WebhookAuthConfigurationProperty {
      override fun allowedIpRange(): String? = unwrap(this).getAllowedIpRange()

      override fun secretToken(): String? = unwrap(this).getSecretToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebhookAuthConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty):
          WebhookAuthConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebhookAuthConfigurationProperty):
          software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty
    }
  }
}