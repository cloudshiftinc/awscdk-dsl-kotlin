@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyDocumentDsl
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.apigateway.ApiKeySourceType
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.DomainNameOptions
import software.amazon.awscdk.services.apigateway.EndpointConfiguration
import software.amazon.awscdk.services.apigateway.EndpointType
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.apigateway.StageOptions
import software.amazon.awscdk.services.iam.PolicyDocument
import software.constructs.Construct

/**
 * Represents a REST API in Amazon API Gateway.
 *
 * Use `addResource` and `addMethod` to configure the API model.
 *
 * By default, the API will automatically be deployed and accessible from a public endpoint.
 *
 * Example:
 * ```
 * StateMachine stateMachine = StateMachine.Builder.create(this, "MyStateMachine")
 * .stateMachineType(StateMachineType.EXPRESS)
 * .definition(Chain.start(new Pass(this, "Pass")))
 * .build();
 * RestApi api = RestApi.Builder.create(this, "Api")
 * .restApiName("MyApi")
 * .build();
 * api.root.addMethod("GET", StepFunctionsIntegration.startExecution(stateMachine));
 * ```
 */
@CdkDslMarker
public class RestApiDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: RestApi.Builder = RestApi.Builder.create(scope, id)

    private val _binaryMediaTypes: MutableList<String> = mutableListOf()

    private val _endpointTypes: MutableList<EndpointType> = mutableListOf()

    /**
     * The source of the API key for metering requests according to a usage plan.
     *
     * Default: - Metering is disabled.
     *
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     *   plan.
     */
    public fun apiKeySourceType(apiKeySourceType: ApiKeySourceType) {
        cdkBuilder.apiKeySourceType(apiKeySourceType)
    }

    /**
     * The list of binary media mime-types that are supported by the RestApi resource, such as
     * "image/png" or "application/octet-stream".
     *
     * Default: - RestApi supports only UTF-8-encoded text payloads.
     *
     * @param binaryMediaTypes The list of binary media mime-types that are supported by the RestApi
     *   resource, such as "image/png" or "application/octet-stream".
     */
    public fun binaryMediaTypes(vararg binaryMediaTypes: String) {
        _binaryMediaTypes.addAll(listOf(*binaryMediaTypes))
    }

    /**
     * The list of binary media mime-types that are supported by the RestApi resource, such as
     * "image/png" or "application/octet-stream".
     *
     * Default: - RestApi supports only UTF-8-encoded text payloads.
     *
     * @param binaryMediaTypes The list of binary media mime-types that are supported by the RestApi
     *   resource, such as "image/png" or "application/octet-stream".
     */
    public fun binaryMediaTypes(binaryMediaTypes: Collection<String>) {
        _binaryMediaTypes.addAll(binaryMediaTypes)
    }

    /**
     * The ID of the API Gateway RestApi resource that you want to clone.
     *
     * Default: - None.
     *
     * @param cloneFrom The ID of the API Gateway RestApi resource that you want to clone.
     */
    public fun cloneFrom(cloneFrom: IRestApi) {
        cdkBuilder.cloneFrom(cloneFrom)
    }

    /**
     * Automatically configure an AWS CloudWatch role for API Gateway.
     *
     * Default: - false if `@aws-cdk/aws-apigateway:disableCloudWatchRole` is enabled, true
     * otherwise
     *
     * @param cloudWatchRole Automatically configure an AWS CloudWatch role for API Gateway.
     */
    public fun cloudWatchRole(cloudWatchRole: Boolean) {
        cdkBuilder.cloudWatchRole(cloudWatchRole)
    }

    /**
     * The removal policy applied to the AWS CloudWatch role when this resource is removed from the
     * application.
     *
     * Requires `cloudWatchRole` to be enabled.
     *
     * Default: - RemovalPolicy.RETAIN
     *
     * @param cloudWatchRoleRemovalPolicy The removal policy applied to the AWS CloudWatch role when
     *   this resource is removed from the application.
     */
    public fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy) {
        cdkBuilder.cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy)
    }

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     *
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     *   all child resources.
     */
    public fun defaultCorsPreflightOptions(
        defaultCorsPreflightOptions: CorsOptionsDsl.() -> Unit = {}
    ) {
        val builder = CorsOptionsDsl()
        builder.apply(defaultCorsPreflightOptions)
        cdkBuilder.defaultCorsPreflightOptions(builder.build())
    }

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     *
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     *   all child resources.
     */
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
        cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions)
    }

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultIntegration An integration to use as a default for all methods created within
     *   this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: IntegrationDsl.() -> Unit = {}) {
        val builder = IntegrationDsl()
        builder.apply(defaultIntegration)
        cdkBuilder.defaultIntegration(builder.build())
    }

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultIntegration An integration to use as a default for all methods created within
     *   this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: Integration) {
        cdkBuilder.defaultIntegration(defaultIntegration)
    }

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     *   this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptionsDsl.() -> Unit = {}) {
        val builder = MethodOptionsDsl()
        builder.apply(defaultMethodOptions)
        cdkBuilder.defaultMethodOptions(builder.build())
    }

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     *   this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
        cdkBuilder.defaultMethodOptions(defaultMethodOptions)
    }

    /**
     * Indicates if a Deployment should be automatically created for this API, and recreated when
     * the API model (resources, methods) changes.
     *
     * Since API Gateway deployments are immutable, When this option is enabled (by default), an
     * AWS::ApiGateway::Deployment resource will automatically created with a logical ID that hashes
     * the API model (methods, resources and options). This means that when the model changes, the
     * logical ID of this CloudFormation resource will change, and a new deployment will be created.
     *
     * If this is set, `latestDeployment` will refer to the `Deployment` object and
     * `deploymentStage` will refer to a `Stage` that points to this deployment. To customize the
     * stage options, use the `deployOptions` property.
     *
     * A CloudFormation Output will also be defined with the root URL endpoint of this REST API.
     *
     * Default: true
     *
     * @param deploy Indicates if a Deployment should be automatically created for this API, and
     *   recreated when the API model (resources, methods) changes.
     */
    public fun deploy(deploy: Boolean) {
        cdkBuilder.deploy(deploy)
    }

    /**
     * Options for the API Gateway stage that will always point to the latest deployment when
     * `deploy` is enabled.
     *
     * If `deploy` is disabled, this value cannot be set.
     *
     * Default: - Based on defaults of `StageOptions`.
     *
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     *   deployment when `deploy` is enabled.
     */
    public fun deployOptions(deployOptions: StageOptionsDsl.() -> Unit = {}) {
        val builder = StageOptionsDsl()
        builder.apply(deployOptions)
        cdkBuilder.deployOptions(builder.build())
    }

    /**
     * Options for the API Gateway stage that will always point to the latest deployment when
     * `deploy` is enabled.
     *
     * If `deploy` is disabled, this value cannot be set.
     *
     * Default: - Based on defaults of `StageOptions`.
     *
     * @param deployOptions Options for the API Gateway stage that will always point to the latest
     *   deployment when `deploy` is enabled.
     */
    public fun deployOptions(deployOptions: StageOptions) {
        cdkBuilder.deployOptions(deployOptions)
    }

    /**
     * A description of the RestApi construct.
     *
     * Default: - 'Automatically created by the RestApi construct'
     *
     * @param description A description of the RestApi construct.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Specifies whether clients can invoke the API using the default execute-api endpoint.
     *
     * To require that clients use a custom domain name to invoke the API, disable the default
     * endpoint.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
     *
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke the API using the
     *   default execute-api endpoint.
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
        cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    /**
     * Configure a custom domain name and map it to this API.
     *
     * Default: - no domain name is defined, use `addDomainName` or directly define a `DomainName`.
     *
     * @param domainName Configure a custom domain name and map it to this API.
     */
    public fun domainName(domainName: DomainNameOptionsDsl.() -> Unit = {}) {
        val builder = DomainNameOptionsDsl()
        builder.apply(domainName)
        cdkBuilder.domainName(builder.build())
    }

    /**
     * Configure a custom domain name and map it to this API.
     *
     * Default: - no domain name is defined, use `addDomainName` or directly define a `DomainName`.
     *
     * @param domainName Configure a custom domain name and map it to this API.
     */
    public fun domainName(domainName: DomainNameOptions) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The EndpointConfiguration property type specifies the endpoint types of a REST API.
     *
     * Default: EndpointType.EDGE
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html)
     *
     * @param endpointConfiguration The EndpointConfiguration property type specifies the endpoint
     *   types of a REST API.
     */
    public fun endpointConfiguration(
        endpointConfiguration: EndpointConfigurationDsl.() -> Unit = {}
    ) {
        val builder = EndpointConfigurationDsl()
        builder.apply(endpointConfiguration)
        cdkBuilder.endpointConfiguration(builder.build())
    }

    /**
     * The EndpointConfiguration property type specifies the endpoint types of a REST API.
     *
     * Default: EndpointType.EDGE
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html)
     *
     * @param endpointConfiguration The EndpointConfiguration property type specifies the endpoint
     *   types of a REST API.
     */
    public fun endpointConfiguration(endpointConfiguration: EndpointConfiguration) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    /**
     * Export name for the CfnOutput containing the API endpoint.
     *
     * Default: - when no export name is given, output will be created without export
     *
     * @param endpointExportName Export name for the CfnOutput containing the API endpoint.
     */
    public fun endpointExportName(endpointExportName: String) {
        cdkBuilder.endpointExportName(endpointExportName)
    }

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating an API.
     *
     * Default: EndpointType.EDGE
     *
     * @param endpointTypes A list of the endpoint types of the API.
     */
    public fun endpointTypes(vararg endpointTypes: EndpointType) {
        _endpointTypes.addAll(listOf(*endpointTypes))
    }

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating an API.
     *
     * Default: EndpointType.EDGE
     *
     * @param endpointTypes A list of the endpoint types of the API.
     */
    public fun endpointTypes(endpointTypes: Collection<EndpointType>) {
        _endpointTypes.addAll(endpointTypes)
    }

    /**
     * Indicates whether to roll back the resource if a warning occurs while API Gateway is creating
     * the RestApi resource.
     *
     * Default: false
     *
     * @param failOnWarnings Indicates whether to roll back the resource if a warning occurs while
     *   API Gateway is creating the RestApi resource.
     */
    public fun failOnWarnings(failOnWarnings: Boolean) {
        cdkBuilder.failOnWarnings(failOnWarnings)
    }

    /**
     * A Size(in bytes, kibibytes, mebibytes etc) that is used to enable compression (with
     * non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (when
     * undefined) on an API.
     *
     * When compression is enabled, compression or decompression is not applied on the payload if
     * the payload size is smaller than this value. Setting it to zero allows compression for any
     * payload size.
     *
     * Default: - Compression is disabled.
     *
     * @param minCompressionSize A Size(in bytes, kibibytes, mebibytes etc) that is used to enable
     *   compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable
     *   compression (when undefined) on an API.
     */
    public fun minCompressionSize(minCompressionSize: Size) {
        cdkBuilder.minCompressionSize(minCompressionSize)
    }

    /**
     * (deprecated) A nullable integer that is used to enable compression (with non-negative between
     * 0 and 10485760 (10M) bytes, inclusive) or disable compression (when undefined) on an API.
     *
     * When compression is enabled, compression or decompression is not applied on the payload if
     * the payload size is smaller than this value. Setting it to zero allows compression for any
     * payload size.
     *
     * Default: - Compression is disabled.
     * * superseded by `minCompressionSize`
     *
     * @param minimumCompressionSize A nullable integer that is used to enable compression (with
     *   non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (when
     *   undefined) on an API.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun minimumCompressionSize(minimumCompressionSize: Number) {
        cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    /**
     * Custom header parameters for the request.
     *
     * Default: - No parameters.
     *
     * [Documentation](https://docs.aws.amazon.com/cli/latest/reference/apigateway/import-rest-api.html)
     *
     * @param parameters Custom header parameters for the request.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * A policy document that contains the permissions for this RestApi.
     *
     * Default: - No policy.
     *
     * @param policy A policy document that contains the permissions for this RestApi.
     */
    public fun policy(policy: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(policy)
        cdkBuilder.policy(builder.build())
    }

    /**
     * A policy document that contains the permissions for this RestApi.
     *
     * Default: - No policy.
     *
     * @param policy A policy document that contains the permissions for this RestApi.
     */
    public fun policy(policy: PolicyDocument) {
        cdkBuilder.policy(policy)
    }

    /**
     * A name for the API Gateway RestApi resource.
     *
     * Default: - ID of the RestApi construct.
     *
     * @param restApiName A name for the API Gateway RestApi resource.
     */
    public fun restApiName(restApiName: String) {
        cdkBuilder.restApiName(restApiName)
    }

    /**
     * Retains old deployment resources when the API changes.
     *
     * This allows manually reverting stages to point to old deployments via the AWS Console.
     *
     * Default: false
     *
     * @param retainDeployments Retains old deployment resources when the API changes.
     */
    public fun retainDeployments(retainDeployments: Boolean) {
        cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): RestApi {
        if (_binaryMediaTypes.isNotEmpty()) cdkBuilder.binaryMediaTypes(_binaryMediaTypes)
        if (_endpointTypes.isNotEmpty()) cdkBuilder.endpointTypes(_endpointTypes)
        return cdkBuilder.build()
    }
}
