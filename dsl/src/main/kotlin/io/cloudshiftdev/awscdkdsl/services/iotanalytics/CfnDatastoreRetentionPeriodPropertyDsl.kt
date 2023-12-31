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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

/**
 * How long, in days, message data is kept.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * RetentionPeriodProperty retentionPeriodProperty = RetentionPeriodProperty.builder()
 * .numberOfDays(123)
 * .unlimited(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-retentionperiod.html)
 */
@CdkDslMarker
public class CfnDatastoreRetentionPeriodPropertyDsl {
    private val cdkBuilder: CfnDatastore.RetentionPeriodProperty.Builder =
        CfnDatastore.RetentionPeriodProperty.builder()

    /**
     * @param numberOfDays The number of days that message data is kept. The `unlimited` parameter
     *   must be false.
     */
    public fun numberOfDays(numberOfDays: Number) {
        cdkBuilder.numberOfDays(numberOfDays)
    }

    /** @param unlimited If true, message data is kept indefinitely. */
    public fun unlimited(unlimited: Boolean) {
        cdkBuilder.unlimited(unlimited)
    }

    /** @param unlimited If true, message data is kept indefinitely. */
    public fun unlimited(unlimited: IResolvable) {
        cdkBuilder.unlimited(unlimited)
    }

    public fun build(): CfnDatastore.RetentionPeriodProperty = cdkBuilder.build()
}
