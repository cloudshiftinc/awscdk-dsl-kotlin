@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * Specifies the configuration used when importing incremental records from the source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * IncrementalPullConfigProperty incrementalPullConfigProperty =
 * IncrementalPullConfigProperty.builder()
 * .datetimeTypeFieldName("datetimeTypeFieldName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-incrementalpullconfig.html)
 */
@CdkDslMarker
public class CfnIntegrationIncrementalPullConfigPropertyDsl {
  private val cdkBuilder: CfnIntegration.IncrementalPullConfigProperty.Builder =
      CfnIntegration.IncrementalPullConfigProperty.builder()

  /**
   * @param datetimeTypeFieldName A field that specifies the date time or timestamp field as the
   * criteria to use when importing incremental records from the source.
   */
  public fun datetimeTypeFieldName(datetimeTypeFieldName: String) {
    cdkBuilder.datetimeTypeFieldName(datetimeTypeFieldName)
  }

  public fun build(): CfnIntegration.IncrementalPullConfigProperty = cdkBuilder.build()
}
