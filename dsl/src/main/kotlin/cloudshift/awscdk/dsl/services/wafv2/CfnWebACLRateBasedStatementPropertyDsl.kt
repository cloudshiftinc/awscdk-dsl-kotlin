@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * A rate-based rule tracks the rate of requests for each originating IP address, and triggers the
 * rule action when the rate exceeds a limit that you specify on the number of requests in any 5-minute
 * time span.
 *
 * You can use this to put a temporary block on requests from an IP address that is sending
 * excessive requests.
 *
 * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule that
 * you use. For example, if you provide the same rate-based rule settings in two web ACLs, each of the
 * two rule statements represents a separate instance of the rate-based rule and gets its own tracking
 * and management by AWS WAF . If you define a rate-based rule inside a rule group, and then use that
 * rule group in multiple places, each use creates a separate instance of the rate-based rule that gets
 * its own tracking and management by AWS WAF .
 *
 * When the rule action triggers, AWS WAF blocks additional requests from the IP address until the
 * request rate falls below the limit.
 *
 * You can optionally nest another statement inside the rate-based statement, to narrow the scope of
 * the rule so that it only counts requests that match the nested statement. For example, based on
 * recent requests that you have seen from an attacker, you might create a rate-based rule with a
 * nested AND rule statement that contains the following nested statements:
 *
 * * An IP match statement with an IP set that specifies the address 192.0.2.44.
 * * A string match statement that searches in the User-Agent header for the string BadBot.
 *
 * In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000.
 * Requests that meet the criteria of both of the nested statements are counted. If the count exceeds
 * 1,000 requests per five minutes, the rule action triggers. Requests that do not meet the criteria of
 * both of the nested statements are not counted towards the rate limit and are not affected by this
 * rule.
 *
 * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
 * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and inside
 * a rule group.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatement.html)
 */
@CdkDslMarker
public class CfnWebACLRateBasedStatementPropertyDsl {
  private val cdkBuilder: CfnWebACL.RateBasedStatementProperty.Builder =
      CfnWebACL.RateBasedStatementProperty.builder()

  /**
   * @param aggregateKeyType Setting that indicates how to aggregate the request counts. The options
   * are the following:. 
   * * `IP` - Aggregate the request counts on the IP address from the web request origin.
   * * `FORWARDED_IP` - Aggregate the request counts on the first IP address in an HTTP header. If
   * you use this, configure the `ForwardedIPConfig` , to specify the header to use.
   *
   *
   * You can only use the `IP` and `FORWARDED_IP` key types.
   */
  public fun aggregateKeyType(aggregateKeyType: String) {
    cdkBuilder.aggregateKeyType(aggregateKeyType)
  }

  /**
   * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that
   * you specify, instead of using the IP address that's reported by the web request origin.
   * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
   *
   *
   * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web
   * request at all.
   *
   *
   * This is required if you specify a forwarded IP in the rule's aggregate key settings.
   */
  public fun forwardedIpConfig(forwardedIpConfig: IResolvable) {
    cdkBuilder.forwardedIpConfig(forwardedIpConfig)
  }

  /**
   * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that
   * you specify, instead of using the IP address that's reported by the web request origin.
   * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
   *
   *
   * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web
   * request at all.
   *
   *
   * This is required if you specify a forwarded IP in the rule's aggregate key settings.
   */
  public fun forwardedIpConfig(forwardedIpConfig: CfnWebACL.ForwardedIPConfigurationProperty) {
    cdkBuilder.forwardedIpConfig(forwardedIpConfig)
  }

  /**
   * @param limit The limit on requests per 5-minute period for a single originating IP address. 
   * If the statement includes a `ScopeDownStatement` , this limit is applied only to the requests
   * that match the statement.
   */
  public fun limit(limit: Number) {
    cdkBuilder.limit(limit)
  }

  /**
   * @param scopeDownStatement An optional nested statement that narrows the scope of the web
   * requests that are evaluated by the rate-based statement.
   * Requests are only tracked by the rate-based statement if they match the scope-down statement.
   * You can use any nestable `Statement` in the scope-down statement, and you can nest statements at
   * any level, the same as you can for a rule statement.
   */
  public fun scopeDownStatement(scopeDownStatement: IResolvable) {
    cdkBuilder.scopeDownStatement(scopeDownStatement)
  }

  /**
   * @param scopeDownStatement An optional nested statement that narrows the scope of the web
   * requests that are evaluated by the rate-based statement.
   * Requests are only tracked by the rate-based statement if they match the scope-down statement.
   * You can use any nestable `Statement` in the scope-down statement, and you can nest statements at
   * any level, the same as you can for a rule statement.
   */
  public fun scopeDownStatement(scopeDownStatement: CfnWebACL.StatementProperty) {
    cdkBuilder.scopeDownStatement(scopeDownStatement)
  }

  public fun build(): CfnWebACL.RateBasedStatementProperty = cdkBuilder.build()
}
