@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * The processing guidance for a rule, used by AWS WAF to determine whether a web request matches
 * the rule.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html)
 */
@CdkDslMarker
public class CfnWebACLStatementPropertyDsl {
    private val cdkBuilder: CfnWebACL.StatementProperty.Builder =
        CfnWebACL.StatementProperty.builder()

    /**
     * @param andStatement A logical rule statement used to combine other rule statements with AND
     *   logic. You provide more than one `Statement` within the `AndStatement` .
     */
    public fun andStatement(andStatement: IResolvable) {
        cdkBuilder.andStatement(andStatement)
    }

    /**
     * @param andStatement A logical rule statement used to combine other rule statements with AND
     *   logic. You provide more than one `Statement` within the `AndStatement` .
     */
    public fun andStatement(andStatement: CfnWebACL.AndStatementProperty) {
        cdkBuilder.andStatement(andStatement)
    }

    /**
     * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF to
     *   apply to web requests. The byte match statement provides the bytes to search for, the
     *   location in requests that you want AWS WAF to search, and other settings. The bytes to
     *   search for are typically a string that corresponds with ASCII characters. In the AWS WAF
     *   console and the developer guide, this is called a string match statement.
     */
    public fun byteMatchStatement(byteMatchStatement: IResolvable) {
        cdkBuilder.byteMatchStatement(byteMatchStatement)
    }

    /**
     * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF to
     *   apply to web requests. The byte match statement provides the bytes to search for, the
     *   location in requests that you want AWS WAF to search, and other settings. The bytes to
     *   search for are typically a string that corresponds with ASCII characters. In the AWS WAF
     *   console and the developer guide, this is called a string match statement.
     */
    public fun byteMatchStatement(byteMatchStatement: CfnWebACL.ByteMatchStatementProperty) {
        cdkBuilder.byteMatchStatement(byteMatchStatement)
    }

    /**
     * @param geoMatchStatement A rule statement that labels web requests by country and region and
     *   that matches against web requests based on country code. A geo match rule labels every
     *   request that it inspects regardless of whether it finds a match.
     * * To manage requests only by country, you can use this statement by itself and specify the
     *   countries that you want to match against in the `CountryCodes` array.
     * * Otherwise, configure your geo match rule with Count action so that it only labels requests.
     *   Then, add one or more label match rules to run after the geo match rule and configure them
     *   to match against the geographic labels and handle the requests as needed.
     *
     * AWS WAF labels requests using the alpha-2 country and region codes from the International
     * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using
     * either the IP address in the web request origin or, if you specify it, the address in the geo
     * match `ForwardedIPConfig` .
     *
     * If you use the web request origin, the label formats are `awswaf:clientip:geo:region:&lt;ISO
     * country code&gt;-&lt;ISO region code&gt;` and `awswaf:clientip:geo:country:&lt;ISO country
     * code&gt;` .
     *
     * If you use a forwarded IP address, the label formats are
     * `awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
     * `awswaf:forwardedip:geo:country:&lt;ISO country code&gt;` .
     *
     * For additional details, see
     * [Geographic match rule statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
     * in the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * .
     */
    public fun geoMatchStatement(geoMatchStatement: IResolvable) {
        cdkBuilder.geoMatchStatement(geoMatchStatement)
    }

    /**
     * @param geoMatchStatement A rule statement that labels web requests by country and region and
     *   that matches against web requests based on country code. A geo match rule labels every
     *   request that it inspects regardless of whether it finds a match.
     * * To manage requests only by country, you can use this statement by itself and specify the
     *   countries that you want to match against in the `CountryCodes` array.
     * * Otherwise, configure your geo match rule with Count action so that it only labels requests.
     *   Then, add one or more label match rules to run after the geo match rule and configure them
     *   to match against the geographic labels and handle the requests as needed.
     *
     * AWS WAF labels requests using the alpha-2 country and region codes from the International
     * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using
     * either the IP address in the web request origin or, if you specify it, the address in the geo
     * match `ForwardedIPConfig` .
     *
     * If you use the web request origin, the label formats are `awswaf:clientip:geo:region:&lt;ISO
     * country code&gt;-&lt;ISO region code&gt;` and `awswaf:clientip:geo:country:&lt;ISO country
     * code&gt;` .
     *
     * If you use a forwarded IP address, the label formats are
     * `awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
     * `awswaf:forwardedip:geo:country:&lt;ISO country code&gt;` .
     *
     * For additional details, see
     * [Geographic match rule statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
     * in the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * .
     */
    public fun geoMatchStatement(geoMatchStatement: CfnWebACL.GeoMatchStatementProperty) {
        cdkBuilder.geoMatchStatement(geoMatchStatement)
    }

    /**
     * @param ipSetReferenceStatement A rule statement used to detect web requests coming from
     *   particular IP addresses or address ranges. To use this, create an `IPSet` that specifies
     *   the addresses you want to detect, then use the ARN of that set in this statement.
     *
     * Each IP set rule statement references an IP set. You create and maintain the set independent
     * of your rules. This allows you to use the single set in multiple rules. When you update the
     * referenced set, AWS WAF automatically updates all rules that reference it.
     */
    public fun ipSetReferenceStatement(ipSetReferenceStatement: IResolvable) {
        cdkBuilder.ipSetReferenceStatement(ipSetReferenceStatement)
    }

    /**
     * @param ipSetReferenceStatement A rule statement used to detect web requests coming from
     *   particular IP addresses or address ranges. To use this, create an `IPSet` that specifies
     *   the addresses you want to detect, then use the ARN of that set in this statement.
     *
     * Each IP set rule statement references an IP set. You create and maintain the set independent
     * of your rules. This allows you to use the single set in multiple rules. When you update the
     * referenced set, AWS WAF automatically updates all rules that reference it.
     */
    public fun ipSetReferenceStatement(
        ipSetReferenceStatement: CfnWebACL.IPSetReferenceStatementProperty
    ) {
        cdkBuilder.ipSetReferenceStatement(ipSetReferenceStatement)
    }

    /**
     * @param labelMatchStatement A rule statement to match against labels that have been added to
     *   the web request by rules that have already run in the web ACL. The label match statement
     *   provides the label or namespace string to search for. The label string can represent a part
     *   or all of the fully qualified label name that had been added to the web request. Fully
     *   qualified labels have a prefix, optional namespaces, and label name. The prefix identifies
     *   the rule group or web ACL context of the rule that added the label. If you do not provide
     *   the fully qualified name in your label match string, AWS WAF performs the search for labels
     *   that were added in the same context as the label match statement.
     */
    public fun labelMatchStatement(labelMatchStatement: IResolvable) {
        cdkBuilder.labelMatchStatement(labelMatchStatement)
    }

    /**
     * @param labelMatchStatement A rule statement to match against labels that have been added to
     *   the web request by rules that have already run in the web ACL. The label match statement
     *   provides the label or namespace string to search for. The label string can represent a part
     *   or all of the fully qualified label name that had been added to the web request. Fully
     *   qualified labels have a prefix, optional namespaces, and label name. The prefix identifies
     *   the rule group or web ACL context of the rule that added the label. If you do not provide
     *   the fully qualified name in your label match string, AWS WAF performs the search for labels
     *   that were added in the same context as the label match statement.
     */
    public fun labelMatchStatement(labelMatchStatement: CfnWebACL.LabelMatchStatementProperty) {
        cdkBuilder.labelMatchStatement(labelMatchStatement)
    }

    /**
     * @param managedRuleGroupStatement A rule statement used to run the rules that are defined in a
     *   managed rule group. To use this, provide the vendor name and the name of the rule group in
     *   this statement. You can retrieve the required names through the API call
     *   `ListAvailableManagedRuleGroups` .
     *
     * You cannot nest a `ManagedRuleGroupStatement` , for example for use inside a `NotStatement`
     * or `OrStatement` . It can only be referenced as a top-level statement within a rule.
     *
     * You are charged additional fees when you use the AWS WAF Bot Control managed rule group
     * `AWSManagedRulesBotControlRuleSet` , the AWS WAF Fraud Control account takeover prevention
     * (ATP) managed rule group `AWSManagedRulesATPRuleSet` , or the AWS WAF Fraud Control account
     * creation fraud prevention (ACFP) managed rule group `AWSManagedRulesACFPRuleSet` . For more
     * information, see [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    public fun managedRuleGroupStatement(managedRuleGroupStatement: IResolvable) {
        cdkBuilder.managedRuleGroupStatement(managedRuleGroupStatement)
    }

    /**
     * @param managedRuleGroupStatement A rule statement used to run the rules that are defined in a
     *   managed rule group. To use this, provide the vendor name and the name of the rule group in
     *   this statement. You can retrieve the required names through the API call
     *   `ListAvailableManagedRuleGroups` .
     *
     * You cannot nest a `ManagedRuleGroupStatement` , for example for use inside a `NotStatement`
     * or `OrStatement` . It can only be referenced as a top-level statement within a rule.
     *
     * You are charged additional fees when you use the AWS WAF Bot Control managed rule group
     * `AWSManagedRulesBotControlRuleSet` , the AWS WAF Fraud Control account takeover prevention
     * (ATP) managed rule group `AWSManagedRulesATPRuleSet` , or the AWS WAF Fraud Control account
     * creation fraud prevention (ACFP) managed rule group `AWSManagedRulesACFPRuleSet` . For more
     * information, see [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    public fun managedRuleGroupStatement(
        managedRuleGroupStatement: CfnWebACL.ManagedRuleGroupStatementProperty
    ) {
        cdkBuilder.managedRuleGroupStatement(managedRuleGroupStatement)
    }

    /**
     * @param notStatement A logical rule statement used to negate the results of another rule
     *   statement. You provide one `Statement` within the `NotStatement` .
     */
    public fun notStatement(notStatement: IResolvable) {
        cdkBuilder.notStatement(notStatement)
    }

    /**
     * @param notStatement A logical rule statement used to negate the results of another rule
     *   statement. You provide one `Statement` within the `NotStatement` .
     */
    public fun notStatement(notStatement: CfnWebACL.NotStatementProperty) {
        cdkBuilder.notStatement(notStatement)
    }

    /**
     * @param orStatement A logical rule statement used to combine other rule statements with OR
     *   logic. You provide more than one `Statement` within the `OrStatement` .
     */
    public fun orStatement(orStatement: IResolvable) {
        cdkBuilder.orStatement(orStatement)
    }

    /**
     * @param orStatement A logical rule statement used to combine other rule statements with OR
     *   logic. You provide more than one `Statement` within the `OrStatement` .
     */
    public fun orStatement(orStatement: CfnWebACL.OrStatementProperty) {
        cdkBuilder.orStatement(orStatement)
    }

    /**
     * @param rateBasedStatement A rate-based rule counts incoming requests and rate limits requests
     *   when they are coming at too fast a rate. The rule categorizes requests according to your
     *   aggregation criteria, collects them into aggregation instances, and counts and rate limits
     *   the requests for each instance.
     *
     * You can specify individual aggregation keys, like IP address or HTTP method. You can also
     * specify aggregation key combinations, like IP address and HTTP method, or HTTP method, query
     * argument, and cookie.
     *
     * Each unique set of values for the aggregation keys that you specify is a separate aggregation
     * instance, with the value from each key contributing to the aggregation instance definition.
     *
     * For example, assume the rule evaluates web requests with the following IP address and HTTP
     * method values:
     * * IP address 10.1.1.1, HTTP method POST
     * * IP address 10.1.1.1, HTTP method GET
     * * IP address 127.0.0.0, HTTP method POST
     * * IP address 10.1.1.1, HTTP method GET
     *
     * The rule would create different aggregation instances according to your aggregation criteria,
     * for example:
     * * If the aggregation criteria is just the IP address, then each individual address is an
     *   aggregation instance, and AWS WAF counts requests separately for each. The aggregation
     *   instances and request counts for our example would be the following:
     * * IP address 10.1.1.1: count 3
     * * IP address 127.0.0.0: count 1
     * * If the aggregation criteria is HTTP method, then each individual HTTP method is an
     *   aggregation instance. The aggregation instances and request counts for our example would be
     *   the following:
     * * HTTP method POST: count 2
     * * HTTP method GET: count 2
     * * If the aggregation criteria is IP address and HTTP method, then each IP address and each
     *   HTTP method would contribute to the combined aggregation instance. The aggregation
     *   instances and request counts for our example would be the following:
     * * IP address 10.1.1.1, HTTP method POST: count 1
     * * IP address 10.1.1.1, HTTP method GET: count 2
     * * IP address 127.0.0.0, HTTP method POST: count 1
     *
     * For any n-tuple of aggregation keys, each unique combination of values for the keys defines a
     * separate aggregation instance, which AWS WAF counts and rate-limits individually.
     *
     * You can optionally nest another statement inside the rate-based statement, to narrow the
     * scope of the rule so that it only counts and rate limits requests that match the nested
     * statement. You can use this nested scope-down statement in conjunction with your aggregation
     * key specifications or you can just count and rate limit all requests that match the
     * scope-down statement, without additional aggregation. When you choose to just manage all
     * requests that match a scope-down statement, the aggregation instance is singular for the
     * rule.
     *
     * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
     * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
     * inside a rule group.
     *
     * For additional information about the options, see
     * [Rate limiting web requests using rate-based rules](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html)
     * in the *AWS WAF Developer Guide* .
     *
     * If you only aggregate on the individual IP address or forwarded IP address, you can retrieve
     * the list of IP addresses that AWS WAF is currently rate limiting for a rule through the API
     * call `GetRateBasedStatementManagedKeys` . This option is not available for other aggregation
     * configurations.
     *
     * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule
     * that you use. For example, if you provide the same rate-based rule settings in two web ACLs,
     * each of the two rule statements represents a separate instance of the rate-based rule and
     * gets its own tracking and management by AWS WAF . If you define a rate-based rule inside a
     * rule group, and then use that rule group in multiple places, each use creates a separate
     * instance of the rate-based rule that gets its own tracking and management by AWS WAF .
     */
    public fun rateBasedStatement(rateBasedStatement: IResolvable) {
        cdkBuilder.rateBasedStatement(rateBasedStatement)
    }

    /**
     * @param rateBasedStatement A rate-based rule counts incoming requests and rate limits requests
     *   when they are coming at too fast a rate. The rule categorizes requests according to your
     *   aggregation criteria, collects them into aggregation instances, and counts and rate limits
     *   the requests for each instance.
     *
     * You can specify individual aggregation keys, like IP address or HTTP method. You can also
     * specify aggregation key combinations, like IP address and HTTP method, or HTTP method, query
     * argument, and cookie.
     *
     * Each unique set of values for the aggregation keys that you specify is a separate aggregation
     * instance, with the value from each key contributing to the aggregation instance definition.
     *
     * For example, assume the rule evaluates web requests with the following IP address and HTTP
     * method values:
     * * IP address 10.1.1.1, HTTP method POST
     * * IP address 10.1.1.1, HTTP method GET
     * * IP address 127.0.0.0, HTTP method POST
     * * IP address 10.1.1.1, HTTP method GET
     *
     * The rule would create different aggregation instances according to your aggregation criteria,
     * for example:
     * * If the aggregation criteria is just the IP address, then each individual address is an
     *   aggregation instance, and AWS WAF counts requests separately for each. The aggregation
     *   instances and request counts for our example would be the following:
     * * IP address 10.1.1.1: count 3
     * * IP address 127.0.0.0: count 1
     * * If the aggregation criteria is HTTP method, then each individual HTTP method is an
     *   aggregation instance. The aggregation instances and request counts for our example would be
     *   the following:
     * * HTTP method POST: count 2
     * * HTTP method GET: count 2
     * * If the aggregation criteria is IP address and HTTP method, then each IP address and each
     *   HTTP method would contribute to the combined aggregation instance. The aggregation
     *   instances and request counts for our example would be the following:
     * * IP address 10.1.1.1, HTTP method POST: count 1
     * * IP address 10.1.1.1, HTTP method GET: count 2
     * * IP address 127.0.0.0, HTTP method POST: count 1
     *
     * For any n-tuple of aggregation keys, each unique combination of values for the keys defines a
     * separate aggregation instance, which AWS WAF counts and rate-limits individually.
     *
     * You can optionally nest another statement inside the rate-based statement, to narrow the
     * scope of the rule so that it only counts and rate limits requests that match the nested
     * statement. You can use this nested scope-down statement in conjunction with your aggregation
     * key specifications or you can just count and rate limit all requests that match the
     * scope-down statement, without additional aggregation. When you choose to just manage all
     * requests that match a scope-down statement, the aggregation instance is singular for the
     * rule.
     *
     * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
     * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
     * inside a rule group.
     *
     * For additional information about the options, see
     * [Rate limiting web requests using rate-based rules](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html)
     * in the *AWS WAF Developer Guide* .
     *
     * If you only aggregate on the individual IP address or forwarded IP address, you can retrieve
     * the list of IP addresses that AWS WAF is currently rate limiting for a rule through the API
     * call `GetRateBasedStatementManagedKeys` . This option is not available for other aggregation
     * configurations.
     *
     * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule
     * that you use. For example, if you provide the same rate-based rule settings in two web ACLs,
     * each of the two rule statements represents a separate instance of the rate-based rule and
     * gets its own tracking and management by AWS WAF . If you define a rate-based rule inside a
     * rule group, and then use that rule group in multiple places, each use creates a separate
     * instance of the rate-based rule that gets its own tracking and management by AWS WAF .
     */
    public fun rateBasedStatement(rateBasedStatement: CfnWebACL.RateBasedStatementProperty) {
        cdkBuilder.rateBasedStatement(rateBasedStatement)
    }

    /**
     * @param regexMatchStatement A rule statement used to search web request components for a match
     *   against a single regular expression.
     */
    public fun regexMatchStatement(regexMatchStatement: IResolvable) {
        cdkBuilder.regexMatchStatement(regexMatchStatement)
    }

    /**
     * @param regexMatchStatement A rule statement used to search web request components for a match
     *   against a single regular expression.
     */
    public fun regexMatchStatement(regexMatchStatement: CfnWebACL.RegexMatchStatementProperty) {
        cdkBuilder.regexMatchStatement(regexMatchStatement)
    }

    /**
     * @param regexPatternSetReferenceStatement A rule statement used to search web request
     *   components for matches with regular expressions. To use this, create a `RegexPatternSet`
     *   that specifies the expressions that you want to detect, then use the ARN of that set in
     *   this statement. A web request matches the pattern set rule statement if the request
     *   component matches any of the patterns in the set.
     *
     * Each regex pattern set rule statement references a regex pattern set. You create and maintain
     * the set independent of your rules. This allows you to use the single set in multiple rules.
     * When you update the referenced set, AWS WAF automatically updates all rules that reference
     * it.
     */
    public fun regexPatternSetReferenceStatement(regexPatternSetReferenceStatement: IResolvable) {
        cdkBuilder.regexPatternSetReferenceStatement(regexPatternSetReferenceStatement)
    }

    /**
     * @param regexPatternSetReferenceStatement A rule statement used to search web request
     *   components for matches with regular expressions. To use this, create a `RegexPatternSet`
     *   that specifies the expressions that you want to detect, then use the ARN of that set in
     *   this statement. A web request matches the pattern set rule statement if the request
     *   component matches any of the patterns in the set.
     *
     * Each regex pattern set rule statement references a regex pattern set. You create and maintain
     * the set independent of your rules. This allows you to use the single set in multiple rules.
     * When you update the referenced set, AWS WAF automatically updates all rules that reference
     * it.
     */
    public fun regexPatternSetReferenceStatement(
        regexPatternSetReferenceStatement: CfnWebACL.RegexPatternSetReferenceStatementProperty
    ) {
        cdkBuilder.regexPatternSetReferenceStatement(regexPatternSetReferenceStatement)
    }

    /**
     * @param ruleGroupReferenceStatement A rule statement used to run the rules that are defined in
     *   a `RuleGroup` . To use this, create a rule group with your rules, then provide the ARN of
     *   the rule group in this statement.
     *
     * You cannot nest a `RuleGroupReferenceStatement` , for example for use inside a `NotStatement`
     * or `OrStatement` . You can only use a rule group reference statement at the top level inside
     * a web ACL.
     */
    public fun ruleGroupReferenceStatement(ruleGroupReferenceStatement: IResolvable) {
        cdkBuilder.ruleGroupReferenceStatement(ruleGroupReferenceStatement)
    }

    /**
     * @param ruleGroupReferenceStatement A rule statement used to run the rules that are defined in
     *   a `RuleGroup` . To use this, create a rule group with your rules, then provide the ARN of
     *   the rule group in this statement.
     *
     * You cannot nest a `RuleGroupReferenceStatement` , for example for use inside a `NotStatement`
     * or `OrStatement` . You can only use a rule group reference statement at the top level inside
     * a web ACL.
     */
    public fun ruleGroupReferenceStatement(
        ruleGroupReferenceStatement: CfnWebACL.RuleGroupReferenceStatementProperty
    ) {
        cdkBuilder.ruleGroupReferenceStatement(ruleGroupReferenceStatement)
    }

    /**
     * @param sizeConstraintStatement A rule statement that compares a number of bytes against the
     *   size of a request component, using a comparison operator, such as greater than (&gt;) or
     *   less than (&lt;). For example, you can use a size constraint statement to look for query
     *   strings that are longer than 100 bytes.
     *
     * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of
     * bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this
     * limit is 8 KB (8,192 bytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 bytes).
     * For CloudFront web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for
     * additional fees. If you know that the request body for your web requests should never exceed
     * the inspection limit, you could use a size constraint statement to block requests that have a
     * larger request body size.
     *
     * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI
     * counts as one character. For example, the URI `/logo.jpg` is nine characters long.
     */
    public fun sizeConstraintStatement(sizeConstraintStatement: IResolvable) {
        cdkBuilder.sizeConstraintStatement(sizeConstraintStatement)
    }

    /**
     * @param sizeConstraintStatement A rule statement that compares a number of bytes against the
     *   size of a request component, using a comparison operator, such as greater than (&gt;) or
     *   less than (&lt;). For example, you can use a size constraint statement to look for query
     *   strings that are longer than 100 bytes.
     *
     * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of
     * bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this
     * limit is 8 KB (8,192 bytes) and for CloudFront web ACLs, this limit is 16 KB (16,384 bytes).
     * For CloudFront web ACLs, you can increase the limit in the web ACL `AssociationConfig` , for
     * additional fees. If you know that the request body for your web requests should never exceed
     * the inspection limit, you could use a size constraint statement to block requests that have a
     * larger request body size.
     *
     * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI
     * counts as one character. For example, the URI `/logo.jpg` is nine characters long.
     */
    public fun sizeConstraintStatement(
        sizeConstraintStatement: CfnWebACL.SizeConstraintStatementProperty
    ) {
        cdkBuilder.sizeConstraintStatement(sizeConstraintStatement)
    }

    /**
     * @param sqliMatchStatement A rule statement that inspects for malicious SQL code. Attackers
     *   insert malicious SQL code into web requests to do things like modify your database or
     *   extract data from it.
     */
    public fun sqliMatchStatement(sqliMatchStatement: IResolvable) {
        cdkBuilder.sqliMatchStatement(sqliMatchStatement)
    }

    /**
     * @param sqliMatchStatement A rule statement that inspects for malicious SQL code. Attackers
     *   insert malicious SQL code into web requests to do things like modify your database or
     *   extract data from it.
     */
    public fun sqliMatchStatement(sqliMatchStatement: CfnWebACL.SqliMatchStatementProperty) {
        cdkBuilder.sqliMatchStatement(sqliMatchStatement)
    }

    /**
     * @param xssMatchStatement A rule statement that inspects for cross-site scripting (XSS)
     *   attacks. In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle
     *   to inject malicious client-site scripts into other legitimate web browsers.
     */
    public fun xssMatchStatement(xssMatchStatement: IResolvable) {
        cdkBuilder.xssMatchStatement(xssMatchStatement)
    }

    /**
     * @param xssMatchStatement A rule statement that inspects for cross-site scripting (XSS)
     *   attacks. In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle
     *   to inject malicious client-site scripts into other legitimate web browsers.
     */
    public fun xssMatchStatement(xssMatchStatement: CfnWebACL.XssMatchStatementProperty) {
        cdkBuilder.xssMatchStatement(xssMatchStatement)
    }

    public fun build(): CfnWebACL.StatementProperty = cdkBuilder.build()
}
