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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionUrl
import software.amazon.awscdk.services.lambda.FunctionUrlAuthType
import software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.InvokeMode
import software.constructs.Construct

/**
 * Defines a Lambda function url.
 *
 * Example:
 * ```
 * // Can be a Function or an Alias
 * Function fn;
 * Role myRole;
 * FunctionUrl fnUrl = fn.addFunctionUrl();
 * fnUrl.grantInvokeUrl(myRole);
 * CfnOutput.Builder.create(this, "TheUrl")
 * // The .url attributes will return the unique Function URL
 * .value(fnUrl.getUrl())
 * .build();
 * ```
 */
@CdkDslMarker
public class FunctionUrlDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: FunctionUrl.Builder = FunctionUrl.Builder.create(scope, id)

    /**
     * The type of authentication that your function URL uses.
     *
     * Default: FunctionUrlAuthType.AWS_IAM
     *
     * @param authType The type of authentication that your function URL uses.
     */
    public fun authType(authType: FunctionUrlAuthType) {
        cdkBuilder.authType(authType)
    }

    /**
     * The cross-origin resource sharing (CORS) settings for your function URL.
     *
     * Default: - No CORS configuration.
     *
     * @param cors The cross-origin resource sharing (CORS) settings for your function URL.
     */
    public fun cors(cors: FunctionUrlCorsOptionsDsl.() -> Unit = {}) {
        val builder = FunctionUrlCorsOptionsDsl()
        builder.apply(cors)
        cdkBuilder.cors(builder.build())
    }

    /**
     * The cross-origin resource sharing (CORS) settings for your function URL.
     *
     * Default: - No CORS configuration.
     *
     * @param cors The cross-origin resource sharing (CORS) settings for your function URL.
     */
    public fun cors(cors: FunctionUrlCorsOptions) {
        cdkBuilder.cors(cors)
    }

    /**
     * The function to which this url refers.
     *
     * It can also be an `Alias` but not a `Version`.
     *
     * @param function The function to which this url refers.
     */
    public fun function(function: IFunction) {
        cdkBuilder.function(function)
    }

    /**
     * The type of invocation mode that your Lambda function uses.
     *
     * Default: InvokeMode.BUFFERED
     *
     * @param invokeMode The type of invocation mode that your Lambda function uses.
     */
    public fun invokeMode(invokeMode: InvokeMode) {
        cdkBuilder.invokeMode(invokeMode)
    }

    public fun build(): FunctionUrl = cdkBuilder.build()
}
