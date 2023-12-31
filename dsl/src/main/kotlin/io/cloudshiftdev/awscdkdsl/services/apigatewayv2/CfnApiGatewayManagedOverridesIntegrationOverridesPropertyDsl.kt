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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides

/**
 * The `IntegrationOverrides` property overrides the integration settings for an API Gateway-managed
 * integration.
 *
 * If you remove this property, API Gateway restores the default values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * IntegrationOverridesProperty integrationOverridesProperty =
 * IntegrationOverridesProperty.builder()
 * .description("description")
 * .integrationMethod("integrationMethod")
 * .payloadFormatVersion("payloadFormatVersion")
 * .timeoutInMillis(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides.html)
 */
@CdkDslMarker
public class CfnApiGatewayManagedOverridesIntegrationOverridesPropertyDsl {
    private val cdkBuilder: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.Builder =
        CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.builder()

    /** @param description The description of the integration. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param integrationMethod Specifies the integration's HTTP method type. */
    public fun integrationMethod(integrationMethod: String) {
        cdkBuilder.integrationMethod(integrationMethod)
    }

    /**
     * @param payloadFormatVersion Specifies the format of the payload sent to an integration.
     *   Required for HTTP APIs. For HTTP APIs, supported values for Lambda proxy integrations are
     *   `1.0` and `2.0` . For all other integrations, `1.0` is the only supported value. To learn
     *   more, see
     *   [Working with AWS Lambda proxy integrations for HTTP APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     *   .
     */
    public fun payloadFormatVersion(payloadFormatVersion: String) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

    /**
     * @param timeoutInMillis Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs
     *   and between 50 and 30,000 milliseconds for HTTP APIs. The default timeout is 29 seconds for
     *   WebSocket APIs and 30 seconds for HTTP APIs.
     */
    public fun timeoutInMillis(timeoutInMillis: Number) {
        cdkBuilder.timeoutInMillis(timeoutInMillis)
    }

    public fun build(): CfnApiGatewayManagedOverrides.IntegrationOverridesProperty =
        cdkBuilder.build()
}
