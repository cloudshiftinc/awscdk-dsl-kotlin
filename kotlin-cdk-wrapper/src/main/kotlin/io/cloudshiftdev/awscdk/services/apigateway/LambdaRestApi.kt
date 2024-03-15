@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LambdaRestApi internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.LambdaRestApi,
) : RestApi(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun apiKeySourceType(apiKeySourceType: ApiKeySourceType)

    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    public fun cloneFrom(cloneFrom: IRestApi)

    public fun cloudWatchRole(cloudWatchRole: Boolean)

    public fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy)

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a27be96cd76c9b2cc809dca0b5e9ccd2e04b6eb584eb2fe800866576d0d509ae")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: Integration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c386ea4a429a59cad5724e236a27e696281bfd607b021cf29e5e34114b05b510")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3e9595dd5c08c6566ac36f480f97013b7ece186ddee4d9e3a97e97b33379a38")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    public fun deploy(deploy: Boolean)

    public fun deployOptions(deployOptions: StageOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53eea0ddcf94cf7fc38b52e3b3df9851d68448098a9e500171a896ae42c7bd26")
    public fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun domainName(domainName: DomainNameOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecf95157037f9e294833f394ebf4c6de82df3e4720d7090874364729db822bb2")
    public fun domainName(domainName: DomainNameOptions.Builder.() -> Unit)

    public fun endpointConfiguration(endpointConfiguration: EndpointConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab11b4da9ac36e3c776a5d2e0e4ae98070206bdd6b44ec2f93567cf1145ee821")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit)

    public fun endpointExportName(endpointExportName: String)

    public fun endpointTypes(endpointTypes: List<EndpointType>)

    public fun endpointTypes(vararg endpointTypes: EndpointType)

    public fun failOnWarnings(failOnWarnings: Boolean)

    public fun handler(handler: IFunction)

    public fun integrationOptions(integrationOptions: LambdaIntegrationOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5d005eee577d04fb09645063da611f6916e9ccda71b6a2b253ca75188890de3")
    public fun integrationOptions(integrationOptions: LambdaIntegrationOptions.Builder.() -> Unit)

    public fun minCompressionSize(minCompressionSize: Size)

    @Deprecated(message = "deprecated in CDK")
    public fun minimumCompressionSize(minimumCompressionSize: Number)

    public fun parameters(parameters: Map<String, String>)

    public fun policy(policy: PolicyDocument)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23bbf781aa777cf6e16e96907341ab6b217585c03e9d275f7d7202644cb9b01c")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    public fun proxy(proxy: Boolean)

    public fun restApiName(restApiName: String)

    public fun retainDeployments(retainDeployments: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.LambdaRestApi.Builder =
        software.amazon.awscdk.services.apigateway.LambdaRestApi.Builder.create(scope, id)

    override fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
      cdkBuilder.apiKeySourceType(apiKeySourceType.let(ApiKeySourceType::unwrap))
    }

    override fun binaryMediaTypes(binaryMediaTypes: List<String>) {
      cdkBuilder.binaryMediaTypes(binaryMediaTypes)
    }

    override fun binaryMediaTypes(vararg binaryMediaTypes: String): Unit =
        binaryMediaTypes(binaryMediaTypes.toList())

    override fun cloneFrom(cloneFrom: IRestApi) {
      cdkBuilder.cloneFrom(cloneFrom.let(IRestApi::unwrap))
    }

    override fun cloudWatchRole(cloudWatchRole: Boolean) {
      cdkBuilder.cloudWatchRole(cloudWatchRole)
    }

    override fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy) {
      cdkBuilder.cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a27be96cd76c9b2cc809dca0b5e9ccd2e04b6eb584eb2fe800866576d0d509ae")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c386ea4a429a59cad5724e236a27e696281bfd607b021cf29e5e34114b05b510")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3e9595dd5c08c6566ac36f480f97013b7ece186ddee4d9e3a97e97b33379a38")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    override fun deploy(deploy: Boolean) {
      cdkBuilder.deploy(deploy)
    }

    override fun deployOptions(deployOptions: StageOptions) {
      cdkBuilder.deployOptions(deployOptions.let(StageOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53eea0ddcf94cf7fc38b52e3b3df9851d68448098a9e500171a896ae42c7bd26")
    override fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit): Unit =
        deployOptions(StageOptions(deployOptions))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    override fun domainName(domainName: DomainNameOptions) {
      cdkBuilder.domainName(domainName.let(DomainNameOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecf95157037f9e294833f394ebf4c6de82df3e4720d7090874364729db822bb2")
    override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

    override fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab11b4da9ac36e3c776a5d2e0e4ae98070206bdd6b44ec2f93567cf1145ee821")
    override
        fun endpointConfiguration(endpointConfiguration: EndpointConfiguration.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfiguration(endpointConfiguration))

    override fun endpointExportName(endpointExportName: String) {
      cdkBuilder.endpointExportName(endpointExportName)
    }

    override fun endpointTypes(endpointTypes: List<EndpointType>) {
      cdkBuilder.endpointTypes(endpointTypes.map(EndpointType::unwrap))
    }

    override fun endpointTypes(vararg endpointTypes: EndpointType): Unit =
        endpointTypes(endpointTypes.toList())

    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction::unwrap))
    }

    override fun integrationOptions(integrationOptions: LambdaIntegrationOptions) {
      cdkBuilder.integrationOptions(integrationOptions.let(LambdaIntegrationOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5d005eee577d04fb09645063da611f6916e9ccda71b6a2b253ca75188890de3")
    override
        fun integrationOptions(integrationOptions: LambdaIntegrationOptions.Builder.() -> Unit):
        Unit = integrationOptions(LambdaIntegrationOptions(integrationOptions))

    override fun minCompressionSize(minCompressionSize: Size) {
      cdkBuilder.minCompressionSize(minCompressionSize.let(Size::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun minimumCompressionSize(minimumCompressionSize: Number) {
      cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23bbf781aa777cf6e16e96907341ab6b217585c03e9d275f7d7202644cb9b01c")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.LambdaRestApi =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LambdaRestApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LambdaRestApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.LambdaRestApi):
        LambdaRestApi = LambdaRestApi(cdkObject)

    internal fun unwrap(wrapped: LambdaRestApi):
        software.amazon.awscdk.services.apigateway.LambdaRestApi = wrapped.cdkObject
  }
}
