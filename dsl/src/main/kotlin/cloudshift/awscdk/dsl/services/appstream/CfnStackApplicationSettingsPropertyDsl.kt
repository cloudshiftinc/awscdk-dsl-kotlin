@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnStack

@CdkDslMarker
public class CfnStackApplicationSettingsPropertyDsl {
  private val cdkBuilder: CfnStack.ApplicationSettingsProperty.Builder =
      CfnStack.ApplicationSettingsProperty.builder()

  /**
   * @param enabled Enables or disables persistent application settings for users during their
   * streaming sessions. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Enables or disables persistent application settings for users during their
   * streaming sessions. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param settingsGroup The path prefix for the S3 bucket where users’ persistent application
   * settings are stored.
   * You can allow the same persistent application settings to be used across multiple stacks by
   * specifying the same settings group for each stack.
   */
  public fun settingsGroup(settingsGroup: String) {
    cdkBuilder.settingsGroup(settingsGroup)
  }

  public fun build(): CfnStack.ApplicationSettingsProperty = cdkBuilder.build()
}
