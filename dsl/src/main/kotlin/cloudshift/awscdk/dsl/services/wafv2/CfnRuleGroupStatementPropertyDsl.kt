@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * The processing guidance for a rule, used by AWS WAF to determine whether a web request matches
 * the rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * Object all;
 * Object allQueryArguments;
 * Object method;
 * Object queryString;
 * Object singleHeader;
 * Object singleQueryArgument;
 * StatementProperty statementProperty_;
 * Object uriPath;
 * StatementProperty statementProperty = StatementProperty.builder()
 * .andStatement(AndStatementProperty.builder()
 * .statements(List.of(statementProperty_))
 * .build())
 * .byteMatchStatement(ByteMatchStatementProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .positionalConstraint("positionalConstraint")
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .searchString("searchString")
 * .searchStringBase64("searchStringBase64")
 * .build())
 * .geoMatchStatement(GeoMatchStatementProperty.builder()
 * .countryCodes(List.of("countryCodes"))
 * .forwardedIpConfig(ForwardedIPConfigurationProperty.builder()
 * .fallbackBehavior("fallbackBehavior")
 * .headerName("headerName")
 * .build())
 * .build())
 * .ipSetReferenceStatement(Map.of(
 * "arn", "arn",
 * // the properties below are optional
 * "ipSetForwardedIpConfig", Map.of(
 * "fallbackBehavior", "fallbackBehavior",
 * "headerName", "headerName",
 * "position", "position")))
 * .labelMatchStatement(LabelMatchStatementProperty.builder()
 * .key("key")
 * .scope("scope")
 * .build())
 * .notStatement(NotStatementProperty.builder()
 * .statement(statementProperty_)
 * .build())
 * .orStatement(OrStatementProperty.builder()
 * .statements(List.of(statementProperty_))
 * .build())
 * .rateBasedStatement(RateBasedStatementProperty.builder()
 * .aggregateKeyType("aggregateKeyType")
 * .limit(123)
 * // the properties below are optional
 * .forwardedIpConfig(ForwardedIPConfigurationProperty.builder()
 * .fallbackBehavior("fallbackBehavior")
 * .headerName("headerName")
 * .build())
 * .scopeDownStatement(statementProperty_)
 * .build())
 * .regexMatchStatement(RegexMatchStatementProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .regexString("regexString")
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .regexPatternSetReferenceStatement(RegexPatternSetReferenceStatementProperty.builder()
 * .arn("arn")
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .sizeConstraintStatement(SizeConstraintStatementProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .size(123)
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .sqliMatchStatement(SqliMatchStatementProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .sensitivityLevel("sensitivityLevel")
 * .build())
 * .xssMatchStatement(XssMatchStatementProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html)
 */
@CdkDslMarker
public class CfnRuleGroupStatementPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.StatementProperty.Builder =
      CfnRuleGroup.StatementProperty.builder()

  /**
   * @param andStatement A logical rule statement used to combine other rule statements with AND
   * logic.
   * You provide more than one `Statement` within the `AndStatement` .
   */
  public fun andStatement(andStatement: IResolvable) {
    cdkBuilder.andStatement(andStatement)
  }

  /**
   * @param andStatement A logical rule statement used to combine other rule statements with AND
   * logic.
   * You provide more than one `Statement` within the `AndStatement` .
   */
  public fun andStatement(andStatement: CfnRuleGroup.AndStatementProperty) {
    cdkBuilder.andStatement(andStatement)
  }

  /**
   * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF to
   * apply to web requests.
   * The byte match statement provides the bytes to search for, the location in requests that you
   * want AWS WAF to search, and other settings. The bytes to search for are typically a string that
   * corresponds with ASCII characters. In the AWS WAF console and the developer guide, this is called
   * a string match statement.
   */
  public fun byteMatchStatement(byteMatchStatement: IResolvable) {
    cdkBuilder.byteMatchStatement(byteMatchStatement)
  }

  /**
   * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF to
   * apply to web requests.
   * The byte match statement provides the bytes to search for, the location in requests that you
   * want AWS WAF to search, and other settings. The bytes to search for are typically a string that
   * corresponds with ASCII characters. In the AWS WAF console and the developer guide, this is called
   * a string match statement.
   */
  public fun byteMatchStatement(byteMatchStatement: CfnRuleGroup.ByteMatchStatementProperty) {
    cdkBuilder.byteMatchStatement(byteMatchStatement)
  }

  /**
   * @param geoMatchStatement A rule statement that labels web requests by country and region and
   * that matches against web requests based on country code.
   * A geo match rule labels every request that it inspects regardless of whether it finds a match.
   *
   * * To manage requests only by country, you can use this statement by itself and specify the
   * countries that you want to match against in the `CountryCodes` array.
   * * Otherwise, configure your geo match rule with Count action so that it only labels requests.
   * Then, add one or more label match rules to run after the geo match rule and configure them to
   * match against the geographic labels and handle the requests as needed.
   *
   * AWS WAF labels requests using the alpha-2 country and region codes from the International
   * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using either
   * the IP address in the web request origin or, if you specify it, the address in the geo match
   * `ForwardedIPConfig` .
   *
   * If you use the web request origin, the label formats are `awswaf:clientip:geo:region:&lt;ISO
   * country code&gt;-&lt;ISO region code&gt;` and `awswaf:clientip:geo:country:&lt;ISO country
   * code&gt;` .
   *
   * If you use a forwarded IP address, the label formats are `awswaf:forwardedip:geo:region:&lt;ISO
   * country code&gt;-&lt;ISO region code&gt;` and `awswaf:forwardedip:geo:country:&lt;ISO country
   * code&gt;` .
   *
   * For additional details, see [Geographic match rule
   * statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
   * in the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
   */
  public fun geoMatchStatement(geoMatchStatement: IResolvable) {
    cdkBuilder.geoMatchStatement(geoMatchStatement)
  }

  /**
   * @param geoMatchStatement A rule statement that labels web requests by country and region and
   * that matches against web requests based on country code.
   * A geo match rule labels every request that it inspects regardless of whether it finds a match.
   *
   * * To manage requests only by country, you can use this statement by itself and specify the
   * countries that you want to match against in the `CountryCodes` array.
   * * Otherwise, configure your geo match rule with Count action so that it only labels requests.
   * Then, add one or more label match rules to run after the geo match rule and configure them to
   * match against the geographic labels and handle the requests as needed.
   *
   * AWS WAF labels requests using the alpha-2 country and region codes from the International
   * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using either
   * the IP address in the web request origin or, if you specify it, the address in the geo match
   * `ForwardedIPConfig` .
   *
   * If you use the web request origin, the label formats are `awswaf:clientip:geo:region:&lt;ISO
   * country code&gt;-&lt;ISO region code&gt;` and `awswaf:clientip:geo:country:&lt;ISO country
   * code&gt;` .
   *
   * If you use a forwarded IP address, the label formats are `awswaf:forwardedip:geo:region:&lt;ISO
   * country code&gt;-&lt;ISO region code&gt;` and `awswaf:forwardedip:geo:country:&lt;ISO country
   * code&gt;` .
   *
   * For additional details, see [Geographic match rule
   * statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
   * in the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
   */
  public fun geoMatchStatement(geoMatchStatement: CfnRuleGroup.GeoMatchStatementProperty) {
    cdkBuilder.geoMatchStatement(geoMatchStatement)
  }

  /**
   * @param ipSetReferenceStatement A rule statement used to detect web requests coming from
   * particular IP addresses or address ranges.
   * To use this, create an `IPSet` that specifies the addresses you want to detect, then use the
   * ARN of that set in this statement.
   *
   * Each IP set rule statement references an IP set. You create and maintain the set independent of
   * your rules. This allows you to use the single set in multiple rules. When you update the
   * referenced set, AWS WAF automatically updates all rules that reference it.
   */
  public fun ipSetReferenceStatement(ipSetReferenceStatement: IResolvable) {
    cdkBuilder.ipSetReferenceStatement(ipSetReferenceStatement)
  }

  /**
   * @param ipSetReferenceStatement A rule statement used to detect web requests coming from
   * particular IP addresses or address ranges.
   * To use this, create an `IPSet` that specifies the addresses you want to detect, then use the
   * ARN of that set in this statement.
   *
   * Each IP set rule statement references an IP set. You create and maintain the set independent of
   * your rules. This allows you to use the single set in multiple rules. When you update the
   * referenced set, AWS WAF automatically updates all rules that reference it.
   */
  public
      fun ipSetReferenceStatement(ipSetReferenceStatement: CfnRuleGroup.IPSetReferenceStatementProperty) {
    cdkBuilder.ipSetReferenceStatement(ipSetReferenceStatement)
  }

  /**
   * @param labelMatchStatement A rule statement to match against labels that have been added to the
   * web request by rules that have already run in the web ACL.
   * The label match statement provides the label or namespace string to search for. The label
   * string can represent a part or all of the fully qualified label name that had been added to the
   * web request. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix
   * identifies the rule group or web ACL context of the rule that added the label. If you do not
   * provide the fully qualified name in your label match string, AWS WAF performs the search for
   * labels that were added in the same context as the label match statement.
   */
  public fun labelMatchStatement(labelMatchStatement: IResolvable) {
    cdkBuilder.labelMatchStatement(labelMatchStatement)
  }

  /**
   * @param labelMatchStatement A rule statement to match against labels that have been added to the
   * web request by rules that have already run in the web ACL.
   * The label match statement provides the label or namespace string to search for. The label
   * string can represent a part or all of the fully qualified label name that had been added to the
   * web request. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix
   * identifies the rule group or web ACL context of the rule that added the label. If you do not
   * provide the fully qualified name in your label match string, AWS WAF performs the search for
   * labels that were added in the same context as the label match statement.
   */
  public fun labelMatchStatement(labelMatchStatement: CfnRuleGroup.LabelMatchStatementProperty) {
    cdkBuilder.labelMatchStatement(labelMatchStatement)
  }

  /**
   * @param notStatement A logical rule statement used to negate the results of another rule
   * statement.
   * You provide one `Statement` within the `NotStatement` .
   */
  public fun notStatement(notStatement: IResolvable) {
    cdkBuilder.notStatement(notStatement)
  }

  /**
   * @param notStatement A logical rule statement used to negate the results of another rule
   * statement.
   * You provide one `Statement` within the `NotStatement` .
   */
  public fun notStatement(notStatement: CfnRuleGroup.NotStatementProperty) {
    cdkBuilder.notStatement(notStatement)
  }

  /**
   * @param orStatement A logical rule statement used to combine other rule statements with OR
   * logic.
   * You provide more than one `Statement` within the `OrStatement` .
   */
  public fun orStatement(orStatement: IResolvable) {
    cdkBuilder.orStatement(orStatement)
  }

  /**
   * @param orStatement A logical rule statement used to combine other rule statements with OR
   * logic.
   * You provide more than one `Statement` within the `OrStatement` .
   */
  public fun orStatement(orStatement: CfnRuleGroup.OrStatementProperty) {
    cdkBuilder.orStatement(orStatement)
  }

  /**
   * @param rateBasedStatement A rate-based rule tracks the rate of requests for each originating IP
   * address, and triggers the rule action when the rate exceeds a limit that you specify on the number
   * of requests in any 5-minute time span.
   * You can use this to put a temporary block on requests from an IP address that is sending
   * excessive requests.
   *
   * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule that
   * you use. For example, if you provide the same rate-based rule settings in two web ACLs, each of
   * the two rule statements represents a separate instance of the rate-based rule and gets its own
   * tracking and management by AWS WAF . If you define a rate-based rule inside a rule group, and then
   * use that rule group in multiple places, each use creates a separate instance of the rate-based
   * rule that gets its own tracking and management by AWS WAF .
   *
   * When the rule action triggers, AWS WAF blocks additional requests from the IP address until the
   * request rate falls below the limit.
   *
   * You can optionally nest another statement inside the rate-based statement, to narrow the scope
   * of the rule so that it only counts requests that match the nested statement. For example, based on
   * recent requests that you have seen from an attacker, you might create a rate-based rule with a
   * nested AND rule statement that contains the following nested statements:
   *
   * * An IP match statement with an IP set that specifies the address 192.0.2.44.
   * * A string match statement that searches in the User-Agent header for the string BadBot.
   *
   * In this rate-based rule, you also define a rate limit. For this example, the rate limit is
   * 1,000. Requests that meet the criteria of both of the nested statements are counted. If the count
   * exceeds 1,000 requests per five minutes, the rule action triggers. Requests that do not meet the
   * criteria of both of the nested statements are not counted towards the rate limit and are not
   * affected by this rule.
   *
   * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
   * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
   * inside a rule group.
   */
  public fun rateBasedStatement(rateBasedStatement: IResolvable) {
    cdkBuilder.rateBasedStatement(rateBasedStatement)
  }

  /**
   * @param rateBasedStatement A rate-based rule tracks the rate of requests for each originating IP
   * address, and triggers the rule action when the rate exceeds a limit that you specify on the number
   * of requests in any 5-minute time span.
   * You can use this to put a temporary block on requests from an IP address that is sending
   * excessive requests.
   *
   * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule that
   * you use. For example, if you provide the same rate-based rule settings in two web ACLs, each of
   * the two rule statements represents a separate instance of the rate-based rule and gets its own
   * tracking and management by AWS WAF . If you define a rate-based rule inside a rule group, and then
   * use that rule group in multiple places, each use creates a separate instance of the rate-based
   * rule that gets its own tracking and management by AWS WAF .
   *
   * When the rule action triggers, AWS WAF blocks additional requests from the IP address until the
   * request rate falls below the limit.
   *
   * You can optionally nest another statement inside the rate-based statement, to narrow the scope
   * of the rule so that it only counts requests that match the nested statement. For example, based on
   * recent requests that you have seen from an attacker, you might create a rate-based rule with a
   * nested AND rule statement that contains the following nested statements:
   *
   * * An IP match statement with an IP set that specifies the address 192.0.2.44.
   * * A string match statement that searches in the User-Agent header for the string BadBot.
   *
   * In this rate-based rule, you also define a rate limit. For this example, the rate limit is
   * 1,000. Requests that meet the criteria of both of the nested statements are counted. If the count
   * exceeds 1,000 requests per five minutes, the rule action triggers. Requests that do not meet the
   * criteria of both of the nested statements are not counted towards the rate limit and are not
   * affected by this rule.
   *
   * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
   * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
   * inside a rule group.
   */
  public fun rateBasedStatement(rateBasedStatement: CfnRuleGroup.RateBasedStatementProperty) {
    cdkBuilder.rateBasedStatement(rateBasedStatement)
  }

  /**
   * @param regexMatchStatement A rule statement used to search web request components for a match
   * against a single regular expression.
   */
  public fun regexMatchStatement(regexMatchStatement: IResolvable) {
    cdkBuilder.regexMatchStatement(regexMatchStatement)
  }

  /**
   * @param regexMatchStatement A rule statement used to search web request components for a match
   * against a single regular expression.
   */
  public fun regexMatchStatement(regexMatchStatement: CfnRuleGroup.RegexMatchStatementProperty) {
    cdkBuilder.regexMatchStatement(regexMatchStatement)
  }

  /**
   * @param regexPatternSetReferenceStatement A rule statement used to search web request components
   * for matches with regular expressions.
   * To use this, create a `RegexPatternSet` that specifies the expressions that you want to detect,
   * then use the ARN of that set in this statement. A web request matches the pattern set rule
   * statement if the request component matches any of the patterns in the set.
   *
   * Each regex pattern set rule statement references a regex pattern set. You create and maintain
   * the set independent of your rules. This allows you to use the single set in multiple rules. When
   * you update the referenced set, AWS WAF automatically updates all rules that reference it.
   */
  public fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: IResolvable) {
    cdkBuilder.regexPatternSetReferenceStatement(regexPatternSetReferenceStatement)
  }

  /**
   * @param regexPatternSetReferenceStatement A rule statement used to search web request components
   * for matches with regular expressions.
   * To use this, create a `RegexPatternSet` that specifies the expressions that you want to detect,
   * then use the ARN of that set in this statement. A web request matches the pattern set rule
   * statement if the request component matches any of the patterns in the set.
   *
   * Each regex pattern set rule statement references a regex pattern set. You create and maintain
   * the set independent of your rules. This allows you to use the single set in multiple rules. When
   * you update the referenced set, AWS WAF automatically updates all rules that reference it.
   */
  public
      fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: CfnRuleGroup.RegexPatternSetReferenceStatementProperty) {
    cdkBuilder.regexPatternSetReferenceStatement(regexPatternSetReferenceStatement)
  }

  /**
   * @param sizeConstraintStatement A rule statement that compares a number of bytes against the
   * size of a request component, using a comparison operator, such as greater than (&gt;) or less than
   * (&lt;).
   * For example, you can use a size constraint statement to look for query strings that are longer
   * than 100 bytes.
   *
   * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of bytes
   * of the body up to the limit for the web ACL. By default, for regional web ACLs, this limit is 8 KB
   * (8,192 kilobytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 kilobytes). For
   * CloudFront web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for
   * additional fees. If you know that the request body for your web requests should never exceed the
   * inspection limit, you could use a size constraint statement to block requests that have a larger
   * request body size.
   *
   * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI
   * counts as one character. For example, the URI `/logo.jpg` is nine characters long.
   */
  public fun sizeConstraintStatement(sizeConstraintStatement: IResolvable) {
    cdkBuilder.sizeConstraintStatement(sizeConstraintStatement)
  }

  /**
   * @param sizeConstraintStatement A rule statement that compares a number of bytes against the
   * size of a request component, using a comparison operator, such as greater than (&gt;) or less than
   * (&lt;).
   * For example, you can use a size constraint statement to look for query strings that are longer
   * than 100 bytes.
   *
   * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of bytes
   * of the body up to the limit for the web ACL. By default, for regional web ACLs, this limit is 8 KB
   * (8,192 kilobytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 kilobytes). For
   * CloudFront web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for
   * additional fees. If you know that the request body for your web requests should never exceed the
   * inspection limit, you could use a size constraint statement to block requests that have a larger
   * request body size.
   *
   * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI
   * counts as one character. For example, the URI `/logo.jpg` is nine characters long.
   */
  public
      fun sizeConstraintStatement(sizeConstraintStatement: CfnRuleGroup.SizeConstraintStatementProperty) {
    cdkBuilder.sizeConstraintStatement(sizeConstraintStatement)
  }

  /**
   * @param sqliMatchStatement A rule statement that inspects for malicious SQL code.
   * Attackers insert malicious SQL code into web requests to do things like modify your database or
   * extract data from it.
   */
  public fun sqliMatchStatement(sqliMatchStatement: IResolvable) {
    cdkBuilder.sqliMatchStatement(sqliMatchStatement)
  }

  /**
   * @param sqliMatchStatement A rule statement that inspects for malicious SQL code.
   * Attackers insert malicious SQL code into web requests to do things like modify your database or
   * extract data from it.
   */
  public fun sqliMatchStatement(sqliMatchStatement: CfnRuleGroup.SqliMatchStatementProperty) {
    cdkBuilder.sqliMatchStatement(sqliMatchStatement)
  }

  /**
   * @param xssMatchStatement A rule statement that inspects for cross-site scripting (XSS) attacks.
   * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to inject
   * malicious client-site scripts into other legitimate web browsers.
   */
  public fun xssMatchStatement(xssMatchStatement: IResolvable) {
    cdkBuilder.xssMatchStatement(xssMatchStatement)
  }

  /**
   * @param xssMatchStatement A rule statement that inspects for cross-site scripting (XSS) attacks.
   * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to inject
   * malicious client-site scripts into other legitimate web browsers.
   */
  public fun xssMatchStatement(xssMatchStatement: CfnRuleGroup.XssMatchStatementProperty) {
    cdkBuilder.xssMatchStatement(xssMatchStatement)
  }

  public fun build(): CfnRuleGroup.StatementProperty = cdkBuilder.build()
}
