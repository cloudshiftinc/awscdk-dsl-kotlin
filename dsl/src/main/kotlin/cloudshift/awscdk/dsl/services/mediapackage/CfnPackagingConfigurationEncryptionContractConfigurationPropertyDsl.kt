@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

/**
 * Use `encryptionContractConfiguration` to configure one or more content encryption keys for your
 * endpoints that use SPEKE Version 2.0. The encryption contract defines the content keys used to
 * encrypt the audio and video tracks in your stream. To configure the encryption contract, specify
 * which audio and video encryption presets to use. For more information about these presets, see
 * [SPEKE Version 2.0
 * Presets](https://docs.aws.amazon.com/mediapackage/latest/ug/drm-content-speke-v2-presets.html) .
 *
 * Note the following considerations when using `encryptionContractConfiguration` :
 *
 * * You can use `encryptionContractConfiguration` for DASH endpoints that use SPEKE Version 2.0.
 * SPEKE Version 2.0 relies on the CPIX Version 2.3 specification.
 * * You cannot combine an `UNENCRYPTED` preset with `UNENCRYPTED` or `SHARED` presets across
 * `presetSpeke20Audio` and `presetSpeke20Video` .
 * * When you use a `SHARED` preset, you must use it for both `presetSpeke20Audio` and
 * `presetSpeke20Video` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * EncryptionContractConfigurationProperty encryptionContractConfigurationProperty =
 * EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-encryptioncontractconfiguration.html)
 */
@CdkDslMarker
public class CfnPackagingConfigurationEncryptionContractConfigurationPropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.EncryptionContractConfigurationProperty.Builder
      = CfnPackagingConfiguration.EncryptionContractConfigurationProperty.builder()

  /**
   * @param presetSpeke20Audio A collection of audio encryption presets. 
   */
  public fun presetSpeke20Audio(presetSpeke20Audio: String) {
    cdkBuilder.presetSpeke20Audio(presetSpeke20Audio)
  }

  /**
   * @param presetSpeke20Video A collection of video encryption presets. 
   */
  public fun presetSpeke20Video(presetSpeke20Video: String) {
    cdkBuilder.presetSpeke20Video(presetSpeke20Video)
  }

  public fun build(): CfnPackagingConfiguration.EncryptionContractConfigurationProperty =
      cdkBuilder.build()
}
