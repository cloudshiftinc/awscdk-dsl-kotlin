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
 * The settings for an AAC audio encode in the output.
 *
 * The parent of this entity is AudioCodecSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * AacSettingsProperty aacSettingsProperty = AacSettingsProperty.builder()
 * .bitrate(123)
 * .codingMode("codingMode")
 * .inputType("inputType")
 * .profile("profile")
 * .rateControlMode("rateControlMode")
 * .rawFormat("rawFormat")
 * .sampleRate(123)
 * .spec("spec")
 * .vbrQuality("vbrQuality")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-aacsettings.html)
 */
@CdkDslMarker
public class CfnChannelAacSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.AacSettingsProperty.Builder =
        CfnChannel.AacSettingsProperty.builder()

    /**
     * @param bitrate The average bitrate in bits/second. Valid values depend on the rate control
     *   mode and profile.
     */
    public fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
    }

    /**
     * @param codingMode Mono, stereo, or 5.1 channel layout. Valid values depend on the rate
     *   control mode and profile. The adReceiverMix setting receives a stereo description plus
     *   control track, and emits a mono AAC encode of the description track, with control data
     *   emitted in the PES header as per ETSI TS 101 154 Annex E.
     */
    public fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
    }

    /**
     * @param inputType Set to broadcasterMixedAd when the input contains pre-mixed main audio + AD
     *   (narration) as a stereo pair. The Audio Type field (audioType) will be set to 3, which
     *   signals to downstream systems that this stream contains broadcaster mixed AD. Note that the
     *   input received by the encoder must contain pre-mixed audio; MediaLive does not perform the
     *   mixing. The values in audioTypeControl and audioType (in AudioDescription) are ignored when
     *   set to broadcasterMixedAd. Leave this set to normal when the input does not contain
     *   pre-mixed audio + AD.
     */
    public fun inputType(inputType: String) {
        cdkBuilder.inputType(inputType)
    }

    /** @param profile The AAC profile. */
    public fun profile(profile: String) {
        cdkBuilder.profile(profile)
    }

    /** @param rateControlMode The rate control mode. */
    public fun rateControlMode(rateControlMode: String) {
        cdkBuilder.rateControlMode(rateControlMode)
    }

    /** @param rawFormat Sets the LATM/LOAS AAC output for raw containers. */
    public fun rawFormat(rawFormat: String) {
        cdkBuilder.rawFormat(rawFormat)
    }

    /**
     * @param sampleRate The sample rate in Hz. Valid values depend on the rate control mode and
     *   profile.
     */
    public fun sampleRate(sampleRate: Number) {
        cdkBuilder.sampleRate(sampleRate)
    }

    /**
     * @param spec Uses MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport
     *   Stream containers.
     */
    public fun spec(spec: String) {
        cdkBuilder.spec(spec)
    }

    /** @param vbrQuality The VBR quality level. This is used only if rateControlMode is VBR. */
    public fun vbrQuality(vbrQuality: String) {
        cdkBuilder.vbrQuality(vbrQuality)
    }

    public fun build(): CfnChannel.AacSettingsProperty = cdkBuilder.build()
}
