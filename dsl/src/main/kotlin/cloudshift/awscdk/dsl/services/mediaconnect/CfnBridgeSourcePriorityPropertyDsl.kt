@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnBridge

/**
 * The priority you want to assign to a source.
 *
 * You can have a primary stream and a backup stream or two equally prioritized streams. This
 * setting only applies when Failover Mode is set to FAILOVER.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * SourcePriorityProperty sourcePriorityProperty = SourcePriorityProperty.builder()
 * .primarySource("primarySource")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-sourcepriority.html)
 */
@CdkDslMarker
public class CfnBridgeSourcePriorityPropertyDsl {
  private val cdkBuilder: CfnBridge.SourcePriorityProperty.Builder =
      CfnBridge.SourcePriorityProperty.builder()

  /**
   * @param primarySource The name of the source you choose as the primary source for this flow.
   */
  public fun primarySource(primarySource: String) {
    cdkBuilder.primarySource(primarySource)
  }

  public fun build(): CfnBridge.SourcePriorityProperty = cdkBuilder.build()
}
