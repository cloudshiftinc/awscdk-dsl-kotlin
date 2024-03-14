package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIntegration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun connectionId(): String? = unwrap(this).getConnectionId()

  public open fun connectionId(`value`: String) {
    unwrap(this).setConnectionId(`value`)
  }

  public open fun connectionType(): String? = unwrap(this).getConnectionType()

  public open fun connectionType(`value`: String) {
    unwrap(this).setConnectionType(`value`)
  }

  public open fun contentHandlingStrategy(): String? = unwrap(this).getContentHandlingStrategy()

  public open fun contentHandlingStrategy(`value`: String) {
    unwrap(this).setContentHandlingStrategy(`value`)
  }

  public open fun credentialsArn(): String? = unwrap(this).getCredentialsArn()

  public open fun credentialsArn(`value`: String) {
    unwrap(this).setCredentialsArn(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun integrationMethod(): String? = unwrap(this).getIntegrationMethod()

  public open fun integrationMethod(`value`: String) {
    unwrap(this).setIntegrationMethod(`value`)
  }

  public open fun integrationSubtype(): String? = unwrap(this).getIntegrationSubtype()

  public open fun integrationSubtype(`value`: String) {
    unwrap(this).setIntegrationSubtype(`value`)
  }

  public open fun integrationType(): String = unwrap(this).getIntegrationType()

  public open fun integrationType(`value`: String) {
    unwrap(this).setIntegrationType(`value`)
  }

  public open fun integrationUri(): String? = unwrap(this).getIntegrationUri()

  public open fun integrationUri(`value`: String) {
    unwrap(this).setIntegrationUri(`value`)
  }

  public open fun passthroughBehavior(): String? = unwrap(this).getPassthroughBehavior()

  public open fun passthroughBehavior(`value`: String) {
    unwrap(this).setPassthroughBehavior(`value`)
  }

  public open fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

  public open fun payloadFormatVersion(`value`: String) {
    unwrap(this).setPayloadFormatVersion(`value`)
  }

  public open fun requestParameters(): Any? = unwrap(this).getRequestParameters()

  public open fun requestParameters(`value`: Any) {
    unwrap(this).setRequestParameters(`value`)
  }

  public open fun requestTemplates(): Any? = unwrap(this).getRequestTemplates()

  public open fun requestTemplates(`value`: Any) {
    unwrap(this).setRequestTemplates(`value`)
  }

  public open fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  public open fun responseParameters(`value`: Any) {
    unwrap(this).setResponseParameters(`value`)
  }

  public open fun templateSelectionExpression(): String? =
      unwrap(this).getTemplateSelectionExpression()

  public open fun templateSelectionExpression(`value`: String) {
    unwrap(this).setTemplateSelectionExpression(`value`)
  }

  public open fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

  public open fun timeoutInMillis(`value`: Number) {
    unwrap(this).setTimeoutInMillis(`value`)
  }

  public open fun tlsConfig(): Any? = unwrap(this).getTlsConfig()

  public open fun tlsConfig(`value`: IResolvable) {
    unwrap(this).setTlsConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun tlsConfig(`value`: TlsConfigProperty) {
    unwrap(this).setTlsConfig(`value`.let(TlsConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5bb30134710e91df085e46611248cf4051ad72fd14a810d99ed73bb57fcf8bc4")
  public open fun tlsConfig(`value`: TlsConfigProperty.Builder.() -> Unit): Unit =
      tlsConfig(TlsConfigProperty(`value`))

  public interface Builder {
    public fun apiId(apiId: String) {
    }

    public fun connectionId(connectionId: String) {
    }

    public fun connectionType(connectionType: String) {
    }

    public fun contentHandlingStrategy(contentHandlingStrategy: String) {
    }

    public fun credentialsArn(credentialsArn: String) {
    }

    public fun description(description: String) {
    }

    public fun integrationMethod(integrationMethod: String) {
    }

    public fun integrationSubtype(integrationSubtype: String) {
    }

    public fun integrationType(integrationType: String) {
    }

    public fun integrationUri(integrationUri: String) {
    }

    public fun passthroughBehavior(passthroughBehavior: String) {
    }

    public fun payloadFormatVersion(payloadFormatVersion: String) {
    }

    public fun requestParameters(requestParameters: Any) {
    }

    public fun requestTemplates(requestTemplates: Any) {
    }

    public fun responseParameters(responseParameters: Any) {
    }

    public fun templateSelectionExpression(templateSelectionExpression: String) {
    }

    public fun timeoutInMillis(timeoutInMillis: Number) {
    }

    public fun tlsConfig(tlsConfig: IResolvable) {
    }

    public fun tlsConfig(tlsConfig: TlsConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25e11854d1d00980109f25cf64cb2b1fd7f9d27ae16bb1d5624827f41e207b41")
    public fun tlsConfig(tlsConfig: TlsConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnIntegration.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnIntegration.Builder.create(scope, id)

    public override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    public override fun connectionId(connectionId: String) {
      cdkBuilder.connectionId(connectionId)
    }

    public override fun connectionType(connectionType: String) {
      cdkBuilder.connectionType(connectionType)
    }

    public override fun contentHandlingStrategy(contentHandlingStrategy: String) {
      cdkBuilder.contentHandlingStrategy(contentHandlingStrategy)
    }

    public override fun credentialsArn(credentialsArn: String) {
      cdkBuilder.credentialsArn(credentialsArn)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun integrationMethod(integrationMethod: String) {
      cdkBuilder.integrationMethod(integrationMethod)
    }

    public override fun integrationSubtype(integrationSubtype: String) {
      cdkBuilder.integrationSubtype(integrationSubtype)
    }

    public override fun integrationType(integrationType: String) {
      cdkBuilder.integrationType(integrationType)
    }

    public override fun integrationUri(integrationUri: String) {
      cdkBuilder.integrationUri(integrationUri)
    }

    public override fun passthroughBehavior(passthroughBehavior: String) {
      cdkBuilder.passthroughBehavior(passthroughBehavior)
    }

    public override fun payloadFormatVersion(payloadFormatVersion: String) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

    public override fun requestParameters(requestParameters: Any) {
      cdkBuilder.requestParameters(requestParameters)
    }

    public override fun requestTemplates(requestTemplates: Any) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    public override fun responseParameters(responseParameters: Any) {
      cdkBuilder.responseParameters(responseParameters)
    }

    public override fun templateSelectionExpression(templateSelectionExpression: String) {
      cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    public override fun timeoutInMillis(timeoutInMillis: Number) {
      cdkBuilder.timeoutInMillis(timeoutInMillis)
    }

    public override fun tlsConfig(tlsConfig: IResolvable) {
      cdkBuilder.tlsConfig(tlsConfig.let(IResolvable::unwrap))
    }

    public override fun tlsConfig(tlsConfig: TlsConfigProperty) {
      cdkBuilder.tlsConfig(tlsConfig.let(TlsConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25e11854d1d00980109f25cf64cb2b1fd7f9d27ae16bb1d5624827f41e207b41")
    public override fun tlsConfig(tlsConfig: TlsConfigProperty.Builder.() -> Unit): Unit =
        tlsConfig(TlsConfigProperty(tlsConfig))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnIntegration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration):
        CfnIntegration = CfnIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnIntegration):
        software.amazon.awscdk.services.apigatewayv2.CfnIntegration = wrapped.cdkObject
  }

  public interface ResponseParameterListProperty {
    public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    public interface Builder {
      public fun responseParameters(responseParameters: IResolvable) {
      }

      public fun responseParameters(responseParameters: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty.builder()

      public override fun responseParameters(responseParameters: IResolvable) {
        cdkBuilder.responseParameters(responseParameters.let(IResolvable::unwrap))
      }

      public override fun responseParameters(responseParameters: List<Any>) {
        cdkBuilder.responseParameters(responseParameters)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty,
    ) : ResponseParameterListProperty {
      public override fun responseParameters(): Any? = unwrap(this).getResponseParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResponseParameterListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty):
          ResponseParameterListProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseParameterListProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterListProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TlsConfigProperty {
    public fun serverNameToVerify(): String? = unwrap(this).getServerNameToVerify()

    public interface Builder {
      public fun serverNameToVerify(serverNameToVerify: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty.builder()

      public override fun serverNameToVerify(serverNameToVerify: String) {
        cdkBuilder.serverNameToVerify(serverNameToVerify)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty,
    ) : TlsConfigProperty {
      public override fun serverNameToVerify(): String? = unwrap(this).getServerNameToVerify()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TlsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty):
          TlsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsConfigProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ResponseParameterProperty {
    public fun destination(): String

    public fun source(): String

    public interface Builder {
      public fun destination(destination: String) {
      }

      public fun source(source: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty.builder()

      public override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      public override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty,
    ) : ResponseParameterProperty {
      public override fun destination(): String = unwrap(this).getDestination()

      public override fun source(): String = unwrap(this).getSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResponseParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty):
          ResponseParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseParameterProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
