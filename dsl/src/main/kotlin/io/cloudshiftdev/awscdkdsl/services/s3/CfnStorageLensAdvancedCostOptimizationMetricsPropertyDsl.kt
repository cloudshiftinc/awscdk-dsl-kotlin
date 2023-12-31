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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource enables Amazon S3 Storage Lens advanced cost optimization metrics.
 *
 * Advanced cost optimization metrics provide insights that you can use to manage and optimize your
 * storage costs, for example, lifecycle rule counts for transitions, expirations, and incomplete
 * multipart uploads.
 *
 * For more information, see
 * [Assessing your storage activity and usage with S3 Storage Lens](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens.html)
 * in the *Amazon S3 User Guide* . For a complete list of metrics, see
 * [S3 Storage Lens metrics glossary](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html)
 * in the *Amazon S3 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * AdvancedCostOptimizationMetricsProperty advancedCostOptimizationMetricsProperty =
 * AdvancedCostOptimizationMetricsProperty.builder()
 * .isEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-advancedcostoptimizationmetrics.html)
 */
@CdkDslMarker
public class CfnStorageLensAdvancedCostOptimizationMetricsPropertyDsl {
    private val cdkBuilder: CfnStorageLens.AdvancedCostOptimizationMetricsProperty.Builder =
        CfnStorageLens.AdvancedCostOptimizationMetricsProperty.builder()

    /** @param isEnabled Indicates whether advanced cost optimization metrics are enabled. */
    public fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
    }

    /** @param isEnabled Indicates whether advanced cost optimization metrics are enabled. */
    public fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled)
    }

    public fun build(): CfnStorageLens.AdvancedCostOptimizationMetricsProperty = cdkBuilder.build()
}
