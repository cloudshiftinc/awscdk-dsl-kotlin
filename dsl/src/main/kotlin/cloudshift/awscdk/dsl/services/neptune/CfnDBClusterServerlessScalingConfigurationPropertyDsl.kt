@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.neptune

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.neptune.CfnDBCluster

/**
 * Contains the scaling configuration of an Neptune Serverless DB cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.neptune.*;
 * ServerlessScalingConfigurationProperty serverlessScalingConfigurationProperty =
 * ServerlessScalingConfigurationProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-serverlessscalingconfiguration.html)
 */
@CdkDslMarker
public class CfnDBClusterServerlessScalingConfigurationPropertyDsl {
  private val cdkBuilder: CfnDBCluster.ServerlessScalingConfigurationProperty.Builder =
      CfnDBCluster.ServerlessScalingConfigurationProperty.builder()

  /**
   * @param maxCapacity The maximum number of Neptune capacity units (NCUs) for a DB instance in an
   * Neptune Serverless cluster. 
   * You can specify NCU values in half-step increments, such as 40, 40.5, 41, and so on. The
   * smallest value you can use is 2.5, whereas the largest is 128.
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param minCapacity The minimum number of Neptune capacity units (NCUs) for a DB instance in an
   * Neptune Serverless cluster. 
   * You can specify NCU values in half-step increments, such as 8, 8.5, 9, and so on. The smallest
   * value you can use is 1, whereas the largest is 128.
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): CfnDBCluster.ServerlessScalingConfigurationProperty = cdkBuilder.build()
}
