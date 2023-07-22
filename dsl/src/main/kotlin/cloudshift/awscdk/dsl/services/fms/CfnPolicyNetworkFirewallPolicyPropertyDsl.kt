@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fms.CfnPolicy

/**
 * Configures the firewall policy deployment model of AWS Network Firewall .
 *
 * For information about Network Firewall deployment models, see [AWS Network Firewall example
 * architectures with
 * routing](https://docs.aws.amazon.com/network-firewall/latest/developerguide/architectures.html) in
 * the *Network Firewall Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fms.*;
 * NetworkFirewallPolicyProperty networkFirewallPolicyProperty =
 * NetworkFirewallPolicyProperty.builder()
 * .firewallDeploymentModel("firewallDeploymentModel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-networkfirewallpolicy.html)
 */
@CdkDslMarker
public class CfnPolicyNetworkFirewallPolicyPropertyDsl {
  private val cdkBuilder: CfnPolicy.NetworkFirewallPolicyProperty.Builder =
      CfnPolicy.NetworkFirewallPolicyProperty.builder()

  /**
   * @param firewallDeploymentModel Defines the deployment model to use for the firewall policy. 
   * To use a distributed model, set
   * [FirewallDeploymentModel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fms-policy-thirdpartyfirewallpolicy.html)
   * to `DISTRIBUTED` .
   */
  public fun firewallDeploymentModel(firewallDeploymentModel: String) {
    cdkBuilder.firewallDeploymentModel(firewallDeploymentModel)
  }

  public fun build(): CfnPolicy.NetworkFirewallPolicyProperty = cdkBuilder.build()
}
