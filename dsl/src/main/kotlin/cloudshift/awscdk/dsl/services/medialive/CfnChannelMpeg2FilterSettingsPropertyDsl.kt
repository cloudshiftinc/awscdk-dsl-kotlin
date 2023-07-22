@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings to configure video filters that apply to the MPEG-2 codec.
 *
 * The parent of this entity is Mpeg2FilterSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Mpeg2FilterSettingsProperty mpeg2FilterSettingsProperty = Mpeg2FilterSettingsProperty.builder()
 * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
 * .postFilterSharpening("postFilterSharpening")
 * .strength("strength")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mpeg2filtersettings.html)
 */
@CdkDslMarker
public class CfnChannelMpeg2FilterSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Mpeg2FilterSettingsProperty.Builder =
      CfnChannel.Mpeg2FilterSettingsProperty.builder()

  /**
   * @param temporalFilterSettings Settings for applying the temporal filter to the video.
   */
  public fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
    cdkBuilder.temporalFilterSettings(temporalFilterSettings)
  }

  /**
   * @param temporalFilterSettings Settings for applying the temporal filter to the video.
   */
  public
      fun temporalFilterSettings(temporalFilterSettings: CfnChannel.TemporalFilterSettingsProperty) {
    cdkBuilder.temporalFilterSettings(temporalFilterSettings)
  }

  public fun build(): CfnChannel.Mpeg2FilterSettingsProperty = cdkBuilder.build()
}
