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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnRouteProps

/**
 * Properties for defining a `CfnRoute`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object requestModels;
 * Object requestParameters;
 * CfnRouteProps cfnRouteProps = CfnRouteProps.builder()
 * .apiId("apiId")
 * .routeKey("routeKey")
 * // the properties below are optional
 * .apiKeyRequired(false)
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizationType("authorizationType")
 * .authorizerId("authorizerId")
 * .modelSelectionExpression("modelSelectionExpression")
 * .operationName("operationName")
 * .requestModels(requestModels)
 * .requestParameters(requestParameters)
 * .routeResponseSelectionExpression("routeResponseSelectionExpression")
 * .target("target")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html)
 */
@CdkDslMarker
public class CfnRoutePropsDsl {
    private val cdkBuilder: CfnRouteProps.Builder = CfnRouteProps.builder()

    private val _authorizationScopes: MutableList<String> = mutableListOf()

    /** @param apiId The API identifier. */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * @param apiKeyRequired Specifies whether an API key is required for the route. Supported only
     *   for WebSocket APIs.
     */
    public fun apiKeyRequired(apiKeyRequired: Boolean) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * @param apiKeyRequired Specifies whether an API key is required for the route. Supported only
     *   for WebSocket APIs.
     */
    public fun apiKeyRequired(apiKeyRequired: IResolvable) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /** @param authorizationScopes The authorization scopes supported by this route. */
    public fun authorizationScopes(vararg authorizationScopes: String) {
        _authorizationScopes.addAll(listOf(*authorizationScopes))
    }

    /** @param authorizationScopes The authorization scopes supported by this route. */
    public fun authorizationScopes(authorizationScopes: Collection<String>) {
        _authorizationScopes.addAll(authorizationScopes)
    }

    /**
     * @param authorizationType The authorization type for the route. For WebSocket APIs, valid
     *   values are `NONE` for open access, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM`
     *   for using a Lambda authorizer. For HTTP APIs, valid values are `NONE` for open access,
     *   `JWT` for using JSON Web Tokens, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for
     *   using a Lambda authorizer.
     */
    public fun authorizationType(authorizationType: String) {
        cdkBuilder.authorizationType(authorizationType)
    }

    /**
     * @param authorizerId The identifier of the `Authorizer` resource to be associated with this
     *   route. The authorizer identifier is generated by API Gateway when you created the
     *   authorizer.
     */
    public fun authorizerId(authorizerId: String) {
        cdkBuilder.authorizerId(authorizerId)
    }

    /**
     * @param modelSelectionExpression The model selection expression for the route. Supported only
     *   for WebSocket APIs.
     */
    public fun modelSelectionExpression(modelSelectionExpression: String) {
        cdkBuilder.modelSelectionExpression(modelSelectionExpression)
    }

    /** @param operationName The operation name for the route. */
    public fun operationName(operationName: String) {
        cdkBuilder.operationName(operationName)
    }

    /** @param requestModels The request models for the route. Supported only for WebSocket APIs. */
    public fun requestModels(requestModels: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(requestModels)
        cdkBuilder.requestModels(builder.map)
    }

    /** @param requestModels The request models for the route. Supported only for WebSocket APIs. */
    public fun requestModels(requestModels: Any) {
        cdkBuilder.requestModels(requestModels)
    }

    /**
     * @param requestParameters The request parameters for the route. Supported only for WebSocket
     *   APIs.
     */
    public fun requestParameters(requestParameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(requestParameters)
        cdkBuilder.requestParameters(builder.map)
    }

    /**
     * @param requestParameters The request parameters for the route. Supported only for WebSocket
     *   APIs.
     */
    public fun requestParameters(requestParameters: Any) {
        cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * @param routeKey The route key for the route. For HTTP APIs, the route key can be either
     *   `$default` , or a combination of an HTTP method and resource path, for example, `GET /pets`
     *   .
     */
    public fun routeKey(routeKey: String) {
        cdkBuilder.routeKey(routeKey)
    }

    /**
     * @param routeResponseSelectionExpression The route response selection expression for the
     *   route. Supported only for WebSocket APIs.
     */
    public fun routeResponseSelectionExpression(routeResponseSelectionExpression: String) {
        cdkBuilder.routeResponseSelectionExpression(routeResponseSelectionExpression)
    }

    /** @param target The target for the route. */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnRouteProps {
        if (_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
        return cdkBuilder.build()
    }
}
