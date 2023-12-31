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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of the timecode in the output.
 *
 * The parent of this entity is EncoderSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * TimecodeConfigProperty timecodeConfigProperty = TimecodeConfigProperty.builder()
 * .source("source")
 * .syncThreshold(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-timecodeconfig.html)
 */
@CdkDslMarker
public class CfnChannelTimecodeConfigPropertyDsl {
    private val cdkBuilder: CfnChannel.TimecodeConfigProperty.Builder =
        CfnChannel.TimecodeConfigProperty.builder()

    /**
     * @param source Identifies the source for the timecode that will be associated with the channel
     *   outputs. Embedded (embedded): Initialize the output timecode with timecode from the source.
     *   If no embedded timecode is detected in the source, the system falls back to using "Start at
     *   0" (zerobased). System Clock (systemclock): Use the UTC time. Start at 0 (zerobased): The
     *   time of the first frame of the channel will be 00:00:00:00.
     */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    /**
     * @param syncThreshold The threshold in frames beyond which output timecode is resynchronized
     *   to the input timecode. Discrepancies below this threshold are permitted to avoid
     *   unnecessary discontinuities in the output timecode. There is no timecode sync when this is
     *   not specified.
     */
    public fun syncThreshold(syncThreshold: Number) {
        cdkBuilder.syncThreshold(syncThreshold)
    }

    public fun build(): CfnChannel.TimecodeConfigProperty = cdkBuilder.build()
}
