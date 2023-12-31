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

package io.cloudshiftdev.awscdkdsl.services.waf.regional

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.regional.CfnIPSet

/**
 * This is *AWS WAF Classic* documentation.
 *
 * For more information, see
 * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
 * in the developer guide.
 *
 * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
 * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
 * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
 *
 * Specifies the IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR format) that
 * web requests originate from.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * IPSetDescriptorProperty iPSetDescriptorProperty = Map.of(
 * "type", "type",
 * "value", "value");
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ipset-ipsetdescriptor.html)
 */
@CdkDslMarker
public class CfnIPSetIPSetDescriptorPropertyDsl {
    private val cdkBuilder: CfnIPSet.IPSetDescriptorProperty.Builder =
        CfnIPSet.IPSetDescriptorProperty.builder()

    /** @param type Specify `IPV4` or `IPV6` . */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param value Specify an IPv4 address by using CIDR notation. For example:.
     * * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     *   192.0.2.44, specify `192.0.2.44/32` .
     * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     *   from 192.0.2.0 to 192.0.2.255, specify `192.0.2.0/24` .
     *
     * For more information about CIDR notation, see the Wikipedia entry
     * [Classless Inter-Domain Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     *
     * Specify an IPv6 address by using CIDR notation. For example:
     * * To configure AWS WAF to allow, block, or count requests that originated from the IP address
     *   1111:0000:0000:0000:0000:0000:0000:0111, specify
     *   `1111:0000:0000:0000:0000:0000:0000:0111/128` .
     * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
     *   1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *   `1111:0000:0000:0000:0000:0000:0000:0000/64` .
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnIPSet.IPSetDescriptorProperty = cdkBuilder.build()
}
