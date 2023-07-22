@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ce.CfnAnomalyMonitor

/**
 * The tag structure that contains a tag key and value.
 *
 *
 * Tagging is supported only for the following Cost Explorer resource types:
 * [`AnomalyMonitor`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_AnomalyMonitor.html)
 * ,
 * [`AnomalySubscription`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_AnomalySubscription.html)
 * ,
 * [`CostCategory`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategory.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ce.*;
 * ResourceTagProperty resourceTagProperty = ResourceTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalymonitor-resourcetag.html)
 */
@CdkDslMarker
public class CfnAnomalyMonitorResourceTagPropertyDsl {
  private val cdkBuilder: CfnAnomalyMonitor.ResourceTagProperty.Builder =
      CfnAnomalyMonitor.ResourceTagProperty.builder()

  /**
   * @param key The key that's associated with the tag. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value that's associated with the tag. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnomalyMonitor.ResourceTagProperty = cdkBuilder.build()
}
