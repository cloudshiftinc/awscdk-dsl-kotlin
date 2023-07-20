@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import kotlin.Boolean

@CdkDslMarker
public class CfnGlobalTablePointInTimeRecoverySpecificationPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.PointInTimeRecoverySpecificationProperty.Builder =
        CfnGlobalTable.PointInTimeRecoverySpecificationProperty.builder()

    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
    }

    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
    }

    public fun build(): CfnGlobalTable.PointInTimeRecoverySpecificationProperty = cdkBuilder.build()
}
