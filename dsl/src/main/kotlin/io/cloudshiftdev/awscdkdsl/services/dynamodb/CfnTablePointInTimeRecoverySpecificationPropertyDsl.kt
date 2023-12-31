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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable

/**
 * The settings used to enable point in time recovery.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * PointInTimeRecoverySpecificationProperty pointInTimeRecoverySpecificationProperty =
 * PointInTimeRecoverySpecificationProperty.builder()
 * .pointInTimeRecoveryEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html)
 */
@CdkDslMarker
public class CfnTablePointInTimeRecoverySpecificationPropertyDsl {
    private val cdkBuilder: CfnTable.PointInTimeRecoverySpecificationProperty.Builder =
        CfnTable.PointInTimeRecoverySpecificationProperty.builder()

    /**
     * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled (true)
     *   or disabled (false) on the table.
     */
    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
    }

    /**
     * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled (true)
     *   or disabled (false) on the table.
     */
    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
    }

    public fun build(): CfnTable.PointInTimeRecoverySpecificationProperty = cdkBuilder.build()
}
