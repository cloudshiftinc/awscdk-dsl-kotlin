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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

/**
 * Input object for the endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ConstraintsResourceProperty constraintsResourceProperty = ConstraintsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-constraintsresource.html)
 */
@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionConstraintsResourcePropertyDsl {
    private val cdkBuilder:
        CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty.Builder =
        CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty.builder()

    /** @param s3Uri The Amazon S3 URI for the constraints resource. */
    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty =
        cdkBuilder.build()
}
