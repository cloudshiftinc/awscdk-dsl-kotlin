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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of an RTMP output group.
 *
 * The parent of this entity is OutputGroupSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * RtmpGroupSettingsProperty rtmpGroupSettingsProperty = RtmpGroupSettingsProperty.builder()
 * .adMarkers(List.of("adMarkers"))
 * .authenticationScheme("authenticationScheme")
 * .cacheFullBehavior("cacheFullBehavior")
 * .cacheLength(123)
 * .captionData("captionData")
 * .inputLossAction("inputLossAction")
 * .restartDelay(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-rtmpgroupsettings.html)
 */
@CdkDslMarker
public class CfnChannelRtmpGroupSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.RtmpGroupSettingsProperty.Builder =
        CfnChannel.RtmpGroupSettingsProperty.builder()

    private val _adMarkers: MutableList<String> = mutableListOf()

    /**
     * @param adMarkers Choose the ad marker type for this output group. MediaLive will create a
     *   message based on the content of each SCTE-35 message, format it for that marker type, and
     *   insert it in the datastream.
     */
    public fun adMarkers(vararg adMarkers: String) {
        _adMarkers.addAll(listOf(*adMarkers))
    }

    /**
     * @param adMarkers Choose the ad marker type for this output group. MediaLive will create a
     *   message based on the content of each SCTE-35 message, format it for that marker type, and
     *   insert it in the datastream.
     */
    public fun adMarkers(adMarkers: Collection<String>) {
        _adMarkers.addAll(adMarkers)
    }

    /** @param authenticationScheme An authentication scheme to use when connecting with a CDN. */
    public fun authenticationScheme(authenticationScheme: String) {
        cdkBuilder.authenticationScheme(authenticationScheme)
    }

    /**
     * @param cacheFullBehavior Controls behavior when the content cache fills up. If a remote
     *   origin server stalls the RTMP connection and doesn't accept content fast enough, the media
     *   cache fills up. When the cache reaches the duration specified by cacheLength, the cache
     *   stops accepting new content. If set to disconnectImmediately, the RTMP output forces a
     *   disconnect. Clear the media cache, and reconnect after restartDelay seconds. If set to
     *   waitForServer, the RTMP output waits up to 5 minutes to allow the origin server to begin
     *   accepting data again.
     */
    public fun cacheFullBehavior(cacheFullBehavior: String) {
        cdkBuilder.cacheFullBehavior(cacheFullBehavior)
    }

    /** @param cacheLength The cache length, in seconds, that is used to calculate buffer size. */
    public fun cacheLength(cacheLength: Number) {
        cdkBuilder.cacheLength(cacheLength)
    }

    /**
     * @param captionData Controls the types of data that pass to onCaptionInfo outputs. If set to
     *   all, 608 and 708 carried DTVCC data is passed. If set to field1AndField2608, DTVCC data is
     *   stripped out, but 608 data from both fields is passed. If set to field1608, only the data
     *   carried in 608 from field 1 video is passed.
     */
    public fun captionData(captionData: String) {
        cdkBuilder.captionData(captionData)
    }

    /**
     * @param inputLossAction Controls the behavior of this RTMP group if the input becomes
     *   unavailable. emitOutput: Emit a slate until the input returns. pauseOutput: Stop
     *   transmitting data until the input returns. This does not close the underlying RTMP
     *   connection.
     */
    public fun inputLossAction(inputLossAction: String) {
        cdkBuilder.inputLossAction(inputLossAction)
    }

    /**
     * @param restartDelay If a streaming output fails, the number of seconds to wait until a
     *   restart is initiated. A value of 0 means never restart.
     */
    public fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
    }

    public fun build(): CfnChannel.RtmpGroupSettingsProperty {
        if (_adMarkers.isNotEmpty()) cdkBuilder.adMarkers(_adMarkers)
        return cdkBuilder.build()
    }
}
