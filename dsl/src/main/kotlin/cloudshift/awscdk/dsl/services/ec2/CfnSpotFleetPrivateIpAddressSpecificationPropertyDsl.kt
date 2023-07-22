@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * Describes a secondary private IPv4 address for a network interface.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PrivateIpAddressSpecificationProperty privateIpAddressSpecificationProperty =
 * PrivateIpAddressSpecificationProperty.builder()
 * .privateIpAddress("privateIpAddress")
 * // the properties below are optional
 * .primary(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-privateipaddressspecification.html)
 */
@CdkDslMarker
public class CfnSpotFleetPrivateIpAddressSpecificationPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.PrivateIpAddressSpecificationProperty.Builder =
      CfnSpotFleet.PrivateIpAddressSpecificationProperty.builder()

  /**
   * @param primary Indicates whether the private IPv4 address is the primary private IPv4 address.
   * Only one IPv4 address can be designated as primary.
   */
  public fun primary(primary: Boolean) {
    cdkBuilder.primary(primary)
  }

  /**
   * @param primary Indicates whether the private IPv4 address is the primary private IPv4 address.
   * Only one IPv4 address can be designated as primary.
   */
  public fun primary(primary: IResolvable) {
    cdkBuilder.primary(primary)
  }

  /**
   * @param privateIpAddress The private IPv4 address. 
   */
  public fun privateIpAddress(privateIpAddress: String) {
    cdkBuilder.privateIpAddress(privateIpAddress)
  }

  public fun build(): CfnSpotFleet.PrivateIpAddressSpecificationProperty = cdkBuilder.build()
}
