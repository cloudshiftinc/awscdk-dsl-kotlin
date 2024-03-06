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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnGraphQLApi
import software.amazon.awscdk.services.appsync.CfnGraphQLApiProps

/**
 * Properties for defining a `CfnGraphQLApi`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * Object environmentVariables;
 * CfnGraphQLApiProps cfnGraphQLApiProps = CfnGraphQLApiProps.builder()
 * .authenticationType("authenticationType")
 * .name("name")
 * // the properties below are optional
 * .additionalAuthenticationProviders(List.of(AdditionalAuthenticationProviderProperty.builder()
 * .authenticationType("authenticationType")
 * // the properties below are optional
 * .lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty.builder()
 * .authorizerResultTtlInSeconds(123)
 * .authorizerUri("authorizerUri")
 * .identityValidationExpression("identityValidationExpression")
 * .build())
 * .openIdConnectConfig(OpenIDConnectConfigProperty.builder()
 * .authTtl(123)
 * .clientId("clientId")
 * .iatTtl(123)
 * .issuer("issuer")
 * .build())
 * .userPoolConfig(CognitoUserPoolConfigProperty.builder()
 * .appIdClientRegex("appIdClientRegex")
 * .awsRegion("awsRegion")
 * .userPoolId("userPoolId")
 * .build())
 * .build()))
 * .apiType("apiType")
 * .enhancedMetricsConfig(EnhancedMetricsConfigProperty.builder()
 * .dataSourceLevelMetricsBehavior("dataSourceLevelMetricsBehavior")
 * .operationLevelMetricsConfig("operationLevelMetricsConfig")
 * .resolverLevelMetricsBehavior("resolverLevelMetricsBehavior")
 * .build())
 * .environmentVariables(environmentVariables)
 * .introspectionConfig("introspectionConfig")
 * .lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty.builder()
 * .authorizerResultTtlInSeconds(123)
 * .authorizerUri("authorizerUri")
 * .identityValidationExpression("identityValidationExpression")
 * .build())
 * .logConfig(LogConfigProperty.builder()
 * .cloudWatchLogsRoleArn("cloudWatchLogsRoleArn")
 * .excludeVerboseContent(false)
 * .fieldLogLevel("fieldLogLevel")
 * .build())
 * .mergedApiExecutionRoleArn("mergedApiExecutionRoleArn")
 * .openIdConnectConfig(OpenIDConnectConfigProperty.builder()
 * .authTtl(123)
 * .clientId("clientId")
 * .iatTtl(123)
 * .issuer("issuer")
 * .build())
 * .ownerContact("ownerContact")
 * .queryDepthLimit(123)
 * .resolverCountLimit(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userPoolConfig(UserPoolConfigProperty.builder()
 * .appIdClientRegex("appIdClientRegex")
 * .awsRegion("awsRegion")
 * .defaultAction("defaultAction")
 * .userPoolId("userPoolId")
 * .build())
 * .visibility("visibility")
 * .xrayEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html)
 */
@CdkDslMarker
public class CfnGraphQLApiPropsDsl {
    private val cdkBuilder: CfnGraphQLApiProps.Builder = CfnGraphQLApiProps.builder()

    private val _additionalAuthenticationProviders: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     *   the `GraphqlApi` API.
     */
    public fun additionalAuthenticationProviders(vararg additionalAuthenticationProviders: Any) {
        _additionalAuthenticationProviders.addAll(listOf(*additionalAuthenticationProviders))
    }

    /**
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     *   the `GraphqlApi` API.
     */
    public fun additionalAuthenticationProviders(
        additionalAuthenticationProviders: Collection<Any>
    ) {
        _additionalAuthenticationProviders.addAll(additionalAuthenticationProviders)
    }

    /**
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     *   the `GraphqlApi` API.
     */
    public fun additionalAuthenticationProviders(additionalAuthenticationProviders: IResolvable) {
        cdkBuilder.additionalAuthenticationProviders(additionalAuthenticationProviders)
    }

    /**
     * @param apiType The value that indicates whether the GraphQL API is a standard API ( `GRAPHQL`
     *   ) or merged API ( `MERGED` ). *WARNING* : If the `ApiType` has not been defined,
     *   *explicitly* setting it to `GRAPHQL` in a template/stack update will result in an API
     *   replacement and new DNS values.
     *
     * The following values are valid:
     *
     * `GRAPHQL | MERGED`
     */
    public fun apiType(apiType: String) {
        cdkBuilder.apiType(apiType)
    }

    /**
     * @param authenticationType Security configuration for your GraphQL API. For allowed values
     *   (such as `API_KEY` , `AWS_IAM` , `AMAZON_COGNITO_USER_POOLS` , `OPENID_CONNECT` , or
     *   `AWS_LAMBDA` ), see
     *   [Security](https://docs.aws.amazon.com/appsync/latest/devguide/security.html) in the *AWS
     *   AppSync Developer Guide* .
     */
    public fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature. Enhanced
     *   metrics emit granular data on API usage and performance such as AppSync request and error
     *   counts, latency, and cache hits/misses. All enhanced metric data is sent to your CloudWatch
     *   account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see
     * [Monitoring and logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics)
     * in the *AWS AppSync User Guide* .
     */
    public fun enhancedMetricsConfig(enhancedMetricsConfig: IResolvable) {
        cdkBuilder.enhancedMetricsConfig(enhancedMetricsConfig)
    }

    /**
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature. Enhanced
     *   metrics emit granular data on API usage and performance such as AppSync request and error
     *   counts, latency, and cache hits/misses. All enhanced metric data is sent to your CloudWatch
     *   account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see
     * [Monitoring and logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics)
     * in the *AWS AppSync User Guide* .
     */
    public fun enhancedMetricsConfig(
        enhancedMetricsConfig: CfnGraphQLApi.EnhancedMetricsConfigProperty
    ) {
        cdkBuilder.enhancedMetricsConfig(enhancedMetricsConfig)
    }

    /**
     * @param environmentVariables A map containing the list of resources with their properties and
     *   environment variables. For more information, see
     *   [Environmental variables](https://docs.aws.amazon.com/appsync/latest/devguide/environmental-variables.html)
     *   .
     *
     * *Pattern* : `^[A-Za-z]+\\w*$\\`
     *
     * *Minimum* : 2
     *
     * *Maximum* : 64
     */
    public fun environmentVariables(environmentVariables: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(environmentVariables)
        cdkBuilder.environmentVariables(builder.map)
    }

    /**
     * @param environmentVariables A map containing the list of resources with their properties and
     *   environment variables. For more information, see
     *   [Environmental variables](https://docs.aws.amazon.com/appsync/latest/devguide/environmental-variables.html)
     *   .
     *
     * *Pattern* : `^[A-Za-z]+\\w*$\\`
     *
     * *Minimum* : 2
     *
     * *Maximum* : 64
     */
    public fun environmentVariables(environmentVariables: Any) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param introspectionConfig Sets the value of the GraphQL API to enable ( `ENABLED` ) or
     *   disable ( `DISABLED` ) introspection. If no value is provided, the introspection
     *   configuration will be set to `ENABLED` by default. This field will produce an error if the
     *   operation attempts to use the introspection feature while this field is disabled.
     *
     * For more information about introspection, see
     * [GraphQL introspection](https://docs.aws.amazon.com/https://graphql.org/learn/introspection/)
     * .
     */
    public fun introspectionConfig(introspectionConfig: String) {
        cdkBuilder.introspectionConfig(introspectionConfig)
    }

    /**
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     *   authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode. Be aware that
     *   an AWS AppSync API may have only one Lambda authorizer configured at a time.
     */
    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig)
    }

    /**
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     *   authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode. Be aware that
     *   an AWS AppSync API may have only one Lambda authorizer configured at a time.
     */
    public fun lambdaAuthorizerConfig(
        lambdaAuthorizerConfig: CfnGraphQLApi.LambdaAuthorizerConfigProperty
    ) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig)
    }

    /** @param logConfig The Amazon CloudWatch Logs configuration. */
    public fun logConfig(logConfig: IResolvable) {
        cdkBuilder.logConfig(logConfig)
    }

    /** @param logConfig The Amazon CloudWatch Logs configuration. */
    public fun logConfig(logConfig: CfnGraphQLApi.LogConfigProperty) {
        cdkBuilder.logConfig(logConfig)
    }

    /**
     * @param mergedApiExecutionRoleArn The AWS Identity and Access Management service role ARN for
     *   a merged API. The AppSync service assumes this role on behalf of the Merged API to validate
     *   access to source APIs at runtime and to prompt the `AUTO_MERGE` to update the merged API
     *   endpoint with the source API changes automatically.
     */
    public fun mergedApiExecutionRoleArn(mergedApiExecutionRoleArn: String) {
        cdkBuilder.mergedApiExecutionRoleArn(mergedApiExecutionRoleArn)
    }

    /** @param name The API name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param openIdConnectConfig The OpenID Connect configuration. */
    public fun openIdConnectConfig(openIdConnectConfig: IResolvable) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig)
    }

    /** @param openIdConnectConfig The OpenID Connect configuration. */
    public fun openIdConnectConfig(openIdConnectConfig: CfnGraphQLApi.OpenIDConnectConfigProperty) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig)
    }

    /**
     * @param ownerContact The owner contact information for an API resource. This field accepts any
     *   string input with a length of 0 - 256 characters.
     */
    public fun ownerContact(ownerContact: String) {
        cdkBuilder.ownerContact(ownerContact)
    }

    /**
     * @param queryDepthLimit The maximum depth a query can have in a single request. Depth refers
     *   to the amount of nested levels allowed in the body of query. The default value is `0` (or
     *   unspecified), which indicates there's no depth limit. If you set a limit, it can be between
     *   `1` and `75` nested levels. This field will produce a limit error if the operation falls
     *   out of bounds. Note that fields can still be set to nullable or non-nullable. If a
     *   non-nullable field produces an error, the error will be thrown upwards to the first
     *   nullable field available.
     */
    public fun queryDepthLimit(queryDepthLimit: Number) {
        cdkBuilder.queryDepthLimit(queryDepthLimit)
    }

    /**
     * @param resolverCountLimit The maximum number of resolvers that can be invoked in a single
     *   request. The default value is `0` (or unspecified), which will set the limit to `10000` .
     *   When specified, the limit value can be between `1` and `10000` . This field will produce a
     *   limit error if the operation falls out of bounds.
     */
    public fun resolverCountLimit(resolverCountLimit: Number) {
        cdkBuilder.resolverCountLimit(resolverCountLimit)
    }

    /** @param tags An arbitrary set of tags (key-value pairs) for this GraphQL API. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An arbitrary set of tags (key-value pairs) for this GraphQL API. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     *   pools with your GraphQL endpoint.
     */
    public fun userPoolConfig(userPoolConfig: IResolvable) {
        cdkBuilder.userPoolConfig(userPoolConfig)
    }

    /**
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     *   pools with your GraphQL endpoint.
     */
    public fun userPoolConfig(userPoolConfig: CfnGraphQLApi.UserPoolConfigProperty) {
        cdkBuilder.userPoolConfig(userPoolConfig)
    }

    /**
     * @param visibility Sets the scope of the GraphQL API to public ( `GLOBAL` ) or private (
     *   `PRIVATE` ). By default, the scope is set to `Global` if no value is provided.
     *
     * *WARNING* : If `Visibility` has not been defined, *explicitly* setting it to `GLOBAL` in a
     * template/stack update will result in an API replacement and new DNS values.
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    /**
     * @param xrayEnabled A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     */
    public fun xrayEnabled(xrayEnabled: Boolean) {
        cdkBuilder.xrayEnabled(xrayEnabled)
    }

    /**
     * @param xrayEnabled A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     */
    public fun xrayEnabled(xrayEnabled: IResolvable) {
        cdkBuilder.xrayEnabled(xrayEnabled)
    }

    public fun build(): CfnGraphQLApiProps {
        if (_additionalAuthenticationProviders.isNotEmpty())
            cdkBuilder.additionalAuthenticationProviders(_additionalAuthenticationProviders)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
