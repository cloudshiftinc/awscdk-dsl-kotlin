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
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * MediaLive will perform a failover if content is considered black for the specified period.
 *
 * The parent of this entity is FailoverConditionSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * VideoBlackFailoverSettingsProperty videoBlackFailoverSettingsProperty =
 * VideoBlackFailoverSettingsProperty.builder()
 * .blackDetectThreshold(123)
 * .videoBlackThresholdMsec(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoblackfailoversettings.html)
 */
@CdkDslMarker
public class CfnChannelVideoBlackFailoverSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.VideoBlackFailoverSettingsProperty.Builder =
        CfnChannel.VideoBlackFailoverSettingsProperty.builder()

    /**
     * @param blackDetectThreshold A value used in calculating the threshold below which MediaLive
     *   considers a pixel to be 'black'. For the input to be considered black, every pixel in a
     *   frame must be below this threshold. The threshold is calculated as a percentage (expressed
     *   as a decimal) of white. Therefore .1 means 10% white (or 90% black). Note how the formula
     *   works for any color depth. For example, if you set this field to 0.1 in 10-bit color depth:
     *   (1023*0.1=102.3), which means a pixel value of 102 or less is 'black'. If you set this
     *   field to .1 in an 8-bit color depth: (255*0.1=25.5), which means a pixel value of 25 or
     *   less is 'black'. The range is 0.0 to 1.0, with any number of decimal places.
     */
    public fun blackDetectThreshold(blackDetectThreshold: Number) {
        cdkBuilder.blackDetectThreshold(blackDetectThreshold)
    }

    /**
     * @param videoBlackThresholdMsec The amount of time (in milliseconds) that the active input
     *   must be black before automatic input failover occurs.
     */
    public fun videoBlackThresholdMsec(videoBlackThresholdMsec: Number) {
        cdkBuilder.videoBlackThresholdMsec(videoBlackThresholdMsec)
    }

    public fun build(): CfnChannel.VideoBlackFailoverSettingsProperty = cdkBuilder.build()
}
