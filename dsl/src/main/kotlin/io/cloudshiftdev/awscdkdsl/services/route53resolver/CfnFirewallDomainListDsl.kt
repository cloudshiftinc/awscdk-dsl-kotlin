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

package io.cloudshiftdev.awscdkdsl.services.route53resolver

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList
import software.constructs.Construct

/**
 * High-level information about a list of firewall domains for use in a
 * [AWS::Route53Resolver::FirewallRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-rule.html)
 * . This is returned by
 * [GetFirewallDomainList](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetFirewallDomainList.html)
 * .
 *
 * To retrieve the domains that are defined for this domain list, call
 * [ListFirewallDomains](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListFirewallDomains.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnFirewallDomainList cfnFirewallDomainList = CfnFirewallDomainList.Builder.create(this,
 * "MyCfnFirewallDomainList")
 * .domainFileUrl("domainFileUrl")
 * .domains(List.of("domains"))
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html)
 */
@CdkDslMarker
public class CfnFirewallDomainListDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFirewallDomainList.Builder =
        CfnFirewallDomainList.Builder.create(scope, id)

    private val _domains: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon
     * S3) that contains the list of domains to import.
     *
     * The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file
     * must be a text file and must contain a single domain per line.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domainfileurl)
     *
     * @param domainFileUrl The fully qualified URL or URI of the file stored in Amazon Simple
     *   Storage Service (Amazon S3) that contains the list of domains to import.
     */
    public fun domainFileUrl(domainFileUrl: String) {
        cdkBuilder.domainFileUrl(domainFileUrl)
    }

    /**
     * A list of the domain lists that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domains)
     *
     * @param domains A list of the domain lists that you have defined.
     */
    public fun domains(vararg domains: String) {
        _domains.addAll(listOf(*domains))
    }

    /**
     * A list of the domain lists that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domains)
     *
     * @param domains A list of the domain lists that you have defined.
     */
    public fun domains(domains: Collection<String>) {
        _domains.addAll(domains)
    }

    /**
     * The name of the domain list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-name)
     *
     * @param name The name of the domain list.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A list of the tag keys and values that you want to associate with the domain list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-tags)
     *
     * @param tags A list of the tag keys and values that you want to associate with the domain
     *   list.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of the tag keys and values that you want to associate with the domain list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-tags)
     *
     * @param tags A list of the tag keys and values that you want to associate with the domain
     *   list.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFirewallDomainList {
        if (_domains.isNotEmpty()) cdkBuilder.domains(_domains)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
