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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.InstanceEngineFeatures

/**
 * Represents Database Engine features.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * InstanceEngineFeatures instanceEngineFeatures = InstanceEngineFeatures.builder()
 * .s3Export("s3Export")
 * .s3Import("s3Import")
 * .build();
 * ```
 */
@CdkDslMarker
public class InstanceEngineFeaturesDsl {
    private val cdkBuilder: InstanceEngineFeatures.Builder = InstanceEngineFeatures.builder()

    /**
     * @param s3Export Feature name for the DB instance that the IAM role to export to S3 bucket is
     *   to be associated with.
     */
    public fun s3Export(s3Export: String) {
        cdkBuilder.s3Export(s3Export)
    }

    /**
     * @param s3Import Feature name for the DB instance that the IAM role to access the S3 bucket
     *   for import is to be associated with.
     */
    public fun s3Import(s3Import: String) {
        cdkBuilder.s3Import(s3Import)
    }

    public fun build(): InstanceEngineFeatures = cdkBuilder.build()
}
