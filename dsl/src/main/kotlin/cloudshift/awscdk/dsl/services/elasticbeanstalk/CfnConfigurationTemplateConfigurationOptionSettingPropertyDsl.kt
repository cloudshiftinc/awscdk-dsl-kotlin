@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate

@CdkDslMarker
public class CfnConfigurationTemplateConfigurationOptionSettingPropertyDsl {
  private val cdkBuilder: CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder =
      CfnConfigurationTemplate.ConfigurationOptionSettingProperty.builder()

  /**
   * @param namespace A unique namespace that identifies the option's associated AWS resource. 
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * @param optionName The name of the configuration option. 
   */
  public fun optionName(optionName: String) {
    cdkBuilder.optionName(optionName)
  }

  /**
   * @param resourceName A unique resource name for the option setting.
   * Use it for a time–based scaling configuration option.
   */
  public fun resourceName(resourceName: String) {
    cdkBuilder.resourceName(resourceName)
  }

  /**
   * @param value The current value for the configuration option.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnConfigurationTemplate.ConfigurationOptionSettingProperty =
      cdkBuilder.build()
}
