@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@CdkDslMarker
public class CfnFirewallPolicyStatefulEngineOptionsPropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.StatefulEngineOptionsProperty.Builder =
      CfnFirewallPolicy.StatefulEngineOptionsProperty.builder()

  /**
   * @param ruleOrder Indicates how to manage the order of stateful rule evaluation for the policy.
   * `DEFAULT_ACTION_ORDER` is the default behavior. Stateful rules are provided to the rule engine
   * as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more
   * information, see [Evaluation order for stateful
   * rules](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html)
   * in the *AWS Network Firewall Developer Guide* .
   */
  public fun ruleOrder(ruleOrder: String) {
    cdkBuilder.ruleOrder(ruleOrder)
  }

  /**
   * @param streamExceptionPolicy Configures how Network Firewall processes traffic when a network
   * connection breaks midstream.
   * Network connections can break due to disruptions in external networks or within the firewall
   * itself.
   *
   * * `DROP` - Network Firewall fails closed and drops all subsequent traffic going to the
   * firewall. This is the default behavior.
   * * `CONTINUE` - Network Firewall continues to apply rules to the subsequent traffic without
   * context from traffic before the break. This impacts the behavior of rules that depend on this
   * context. For example, if you have a stateful rule to `drop http` traffic, Network Firewall won't
   * match the traffic for this rule because the service won't have the context from session
   * initialization defining the application layer protocol as HTTP. However, this behavior is rule
   * dependent—a TCP-layer rule using a `flow:stateless` rule would still match, as would the
   * `aws:drop_strict` default action.
   * * `REJECT` - Network Firewall fails closed and drops all subsequent traffic going to the
   * firewall. Network Firewall also sends a TCP reject packet back to your client so that the client
   * can immediately establish a new session. Network Firewall will have context about the new session
   * and will apply rules to the subsequent traffic.
   */
  public fun streamExceptionPolicy(streamExceptionPolicy: String) {
    cdkBuilder.streamExceptionPolicy(streamExceptionPolicy)
  }

  public fun build(): CfnFirewallPolicy.StatefulEngineOptionsProperty = cdkBuilder.build()
}
