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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

/**
 * Indicates whether client connect options are enabled.
 *
 * The default is `false` (not enabled).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ClientConnectOptionsProperty clientConnectOptionsProperty =
 * ClientConnectOptionsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .lambdaFunctionArn("lambdaFunctionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientconnectoptions.html)
 */
@CdkDslMarker
public class CfnClientVpnEndpointClientConnectOptionsPropertyDsl {
    private val cdkBuilder: CfnClientVpnEndpoint.ClientConnectOptionsProperty.Builder =
        CfnClientVpnEndpoint.ClientConnectOptionsProperty.builder()

    /**
     * @param enabled Indicates whether client connect options are enabled. The default is `false`
     *   (not enabled).
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Indicates whether client connect options are enabled. The default is `false`
     *   (not enabled).
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param lambdaFunctionArn The Amazon Resource Name (ARN) of the AWS Lambda function used for
     *   connection authorization.
     */
    public fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
    }

    public fun build(): CfnClientVpnEndpoint.ClientConnectOptionsProperty = cdkBuilder.build()
}
