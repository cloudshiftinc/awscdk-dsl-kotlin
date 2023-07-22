@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnService

/**
 * A complex type that contains information about the Amazon Route 53 DNS records that you want AWS
 * Cloud Map to create when you register an instance.
 *
 *
 * The record types of a service can only be changed by deleting the service and recreating it with
 * a new `Dnsconfig` .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * DnsConfigProperty dnsConfigProperty = DnsConfigProperty.builder()
 * .dnsRecords(List.of(DnsRecordProperty.builder()
 * .ttl(123)
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .namespaceId("namespaceId")
 * .routingPolicy("routingPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html)
 */
@CdkDslMarker
public class CfnServiceDnsConfigPropertyDsl {
  private val cdkBuilder: CfnService.DnsConfigProperty.Builder =
      CfnService.DnsConfigProperty.builder()

  private val _dnsRecords: MutableList<Any> = mutableListOf()

  /**
   * @param dnsRecords An array that contains one `DnsRecord` object for each Route 53 DNS record
   * that you want AWS Cloud Map to create when you register an instance. 
   */
  public fun dnsRecords(vararg dnsRecords: Any) {
    _dnsRecords.addAll(listOf(*dnsRecords))
  }

  /**
   * @param dnsRecords An array that contains one `DnsRecord` object for each Route 53 DNS record
   * that you want AWS Cloud Map to create when you register an instance. 
   */
  public fun dnsRecords(dnsRecords: Collection<Any>) {
    _dnsRecords.addAll(dnsRecords)
  }

  /**
   * @param dnsRecords An array that contains one `DnsRecord` object for each Route 53 DNS record
   * that you want AWS Cloud Map to create when you register an instance. 
   */
  public fun dnsRecords(dnsRecords: IResolvable) {
    cdkBuilder.dnsRecords(dnsRecords)
  }

  /**
   * @param namespaceId The ID of the namespace to use for DNS configuration.
   *
   * You must specify a value for `NamespaceId` either for `DnsConfig` or for the [service
   * properties](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html)
   * . Don't specify a value in both places.
   */
  public fun namespaceId(namespaceId: String) {
    cdkBuilder.namespaceId(namespaceId)
  }

  /**
   * @param routingPolicy The routing policy that you want to apply to all Route 53 DNS records that
   * AWS Cloud Map creates when you register an instance and specify this service.
   *
   * If you want to use this service to register instances that create alias records, specify
   * `WEIGHTED` for the routing policy.
   *
   *
   * You can specify the following values:
   *
   * * **MULTIVALUE** - If you define a health check for the service and the health check is
   * healthy, Route 53 returns the applicable value for up to eight instances.
   *
   * For example, suppose that the service includes configurations for one `A` record and a health
   * check. You use the service to register 10 instances. Route 53 responds to DNS queries with IP
   * addresses for up to eight healthy instances. If fewer than eight instances are healthy, Route 53
   * responds to every DNS query with the IP addresses for all of the healthy instances.
   *
   * If you don't define a health check for the service, Route 53 assumes that all instances are
   * healthy and returns the values for up to eight instances.
   *
   * For more information about the multivalue routing policy, see [Multivalue Answer
   * Routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue)
   * in the *Route 53 Developer Guide* .
   *
   * * **WEIGHTED** - Route 53 returns the applicable value from one randomly selected instance from
   * among the instances that you registered using the same service. Currently, all records have the
   * same weight, so you can't route more or less traffic to any instances.
   *
   * For example, suppose that the service includes configurations for one `A` record and a health
   * check. You use the service to register 10 instances. Route 53 responds to DNS queries with the IP
   * address for one randomly selected instance from among the healthy instances. If no instances are
   * healthy, Route 53 responds to DNS queries as if all of the instances were healthy.
   *
   * If you don't define a health check for the service, Route 53 assumes that all instances are
   * healthy and returns the applicable value for one randomly selected instance.
   *
   * For more information about the weighted routing policy, see [Weighted
   * Routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted)
   * in the *Route 53 Developer Guide* .
   */
  public fun routingPolicy(routingPolicy: String) {
    cdkBuilder.routingPolicy(routingPolicy)
  }

  public fun build(): CfnService.DnsConfigProperty {
    if(_dnsRecords.isNotEmpty()) cdkBuilder.dnsRecords(_dnsRecords)
    return cdkBuilder.build()
  }
}
