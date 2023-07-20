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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.DestinationOptions
import software.amazon.awscdk.services.ec2.FlowLogFileFormat
import kotlin.Boolean

@CdkDslMarker
public class DestinationOptionsDsl {
    private val cdkBuilder: DestinationOptions.Builder = DestinationOptions.builder()

    public fun fileFormat(fileFormat: FlowLogFileFormat) {
        cdkBuilder.fileFormat(fileFormat)
    }

    public fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean) {
        cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions)
    }

    public fun perHourPartition(perHourPartition: Boolean) {
        cdkBuilder.perHourPartition(perHourPartition)
    }

    public fun build(): DestinationOptions = cdkBuilder.build()
}
