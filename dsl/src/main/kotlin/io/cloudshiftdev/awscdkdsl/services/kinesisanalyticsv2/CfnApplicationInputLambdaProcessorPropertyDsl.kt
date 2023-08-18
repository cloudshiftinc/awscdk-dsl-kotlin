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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * An object that contains the Amazon Resource Name (ARN) of the Amazon Lambda function that is used
 * to preprocess records in the stream in a SQL-based Kinesis Data Analytics application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * InputLambdaProcessorProperty inputLambdaProcessorProperty =
 * InputLambdaProcessorProperty.builder()
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html)
 */
@CdkDslMarker
public class CfnApplicationInputLambdaProcessorPropertyDsl {
    private val cdkBuilder: CfnApplication.InputLambdaProcessorProperty.Builder =
        CfnApplication.InputLambdaProcessorProperty.builder()

    /**
     * @param resourceArn The ARN of the Amazon Lambda function that operates on records in the
     *   stream.
     *
     * To specify an earlier version of the Lambda function than the latest, include the Lambda
     * function version in the Lambda function ARN. For more information about Lambda ARNs, see
     * [Example ARNs: Amazon Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnApplication.InputLambdaProcessorProperty = cdkBuilder.build()
}
