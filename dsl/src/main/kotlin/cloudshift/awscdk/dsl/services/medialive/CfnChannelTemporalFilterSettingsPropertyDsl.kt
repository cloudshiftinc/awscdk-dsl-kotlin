@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings for the temporal filter to apply to the video.
 *
 * The parents of this entity are H264FilterSettings, H265FilterSettings, and Mpeg2FilterSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * TemporalFilterSettingsProperty temporalFilterSettingsProperty =
 * TemporalFilterSettingsProperty.builder()
 * .postFilterSharpening("postFilterSharpening")
 * .strength("strength")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-temporalfiltersettings.html)
 */
@CdkDslMarker
public class CfnChannelTemporalFilterSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.TemporalFilterSettingsProperty.Builder =
      CfnChannel.TemporalFilterSettingsProperty.builder()

  /**
   * @param postFilterSharpening If you enable this filter, the results are the following: - If the
   * source content is noisy (it contains excessive digital artifacts), the filter cleans up the
   * source.
   * * If the source content is already clean, the filter tends to decrease the bitrate, especially
   * when the rate control mode is QVBR.
   */
  public fun postFilterSharpening(postFilterSharpening: String) {
    cdkBuilder.postFilterSharpening(postFilterSharpening)
  }

  /**
   * @param strength Choose a filter strength.
   * We recommend a strength of 1 or 2. A higher strength might take out good information, resulting
   * in an image that is overly soft.
   */
  public fun strength(strength: String) {
    cdkBuilder.strength(strength)
  }

  public fun build(): CfnChannel.TemporalFilterSettingsProperty = cdkBuilder.build()
}
