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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * A rule statement that labels web requests by country and region and that matches against web
 * requests based on country code.
 *
 * A geo match rule labels every request that it inspects regardless of whether it finds a match.
 * * To manage requests only by country, you can use this statement by itself and specify the
 *   countries that you want to match against in the `CountryCodes` array.
 * * Otherwise, configure your geo match rule with Count action so that it only labels requests.
 *   Then, add one or more label match rules to run after the geo match rule and configure them to
 *   match against the geographic labels and handle the requests as needed.
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
 * For additional details, see
 * [Geographic match rule statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
 * in the
 * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * GeoMatchStatementProperty geoMatchStatementProperty = GeoMatchStatementProperty.builder()
 * .countryCodes(List.of("countryCodes"))
 * .forwardedIpConfig(ForwardedIPConfigurationProperty.builder()
 * .fallbackBehavior("fallbackBehavior")
 * .headerName("headerName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html)
 */
@CdkDslMarker
public class CfnWebACLGeoMatchStatementPropertyDsl {
    private val cdkBuilder: CfnWebACL.GeoMatchStatementProperty.Builder =
        CfnWebACL.GeoMatchStatementProperty.builder()

    private val _countryCodes: MutableList<String> = mutableListOf()

    /**
     * @param countryCodes An array of two-character country codes that you want to match against,
     *   for example, `[ "US", "CN" ]` , from the alpha-2 country ISO codes of the ISO 3166
     *   international standard. When you use a geo match statement just for the region and country
     *   labels that it adds to requests, you still have to supply a country code for the rule to
     *   evaluate. In this case, you configure the rule to only count matching requests, but it will
     *   still generate logging and count metrics for any matches. You can reduce the logging and
     *   metrics that the rule produces by specifying a country that's unlikely to be a source of
     *   traffic to your site.
     */
    public fun countryCodes(vararg countryCodes: String) {
        _countryCodes.addAll(listOf(*countryCodes))
    }

    /**
     * @param countryCodes An array of two-character country codes that you want to match against,
     *   for example, `[ "US", "CN" ]` , from the alpha-2 country ISO codes of the ISO 3166
     *   international standard. When you use a geo match statement just for the region and country
     *   labels that it adds to requests, you still have to supply a country code for the rule to
     *   evaluate. In this case, you configure the rule to only count matching requests, but it will
     *   still generate logging and count metrics for any matches. You can reduce the logging and
     *   metrics that the rule produces by specifying a country that's unlikely to be a source of
     *   traffic to your site.
     */
    public fun countryCodes(countryCodes: Collection<String>) {
        _countryCodes.addAll(countryCodes)
    }

    /**
     * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that
     *   you specify, instead of using the IP address that's reported by the web request origin.
     *   Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     */
    public fun forwardedIpConfig(forwardedIpConfig: IResolvable) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig)
    }

    /**
     * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that
     *   you specify, instead of using the IP address that's reported by the web request origin.
     *   Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     */
    public fun forwardedIpConfig(forwardedIpConfig: CfnWebACL.ForwardedIPConfigurationProperty) {
        cdkBuilder.forwardedIpConfig(forwardedIpConfig)
    }

    public fun build(): CfnWebACL.GeoMatchStatementProperty {
        if (_countryCodes.isNotEmpty()) cdkBuilder.countryCodes(_countryCodes)
        return cdkBuilder.build()
    }
}
