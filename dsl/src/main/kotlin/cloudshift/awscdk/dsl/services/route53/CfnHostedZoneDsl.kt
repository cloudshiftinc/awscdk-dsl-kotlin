@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnHostedZone
import software.constructs.Construct

/**
 * Creates a new public or private hosted zone.
 *
 * You create records in a public hosted zone to define how you want to route traffic on the
 * internet for a domain, such as example.com, and its subdomains (apex.example.com, acme.example.com).
 * You create records in a private hosted zone to define how you want to route traffic for a domain and
 * its subdomains within one or more Amazon Virtual Private Clouds (Amazon VPCs).
 *
 *
 * You can't convert a public hosted zone to a private hosted zone or vice versa. Instead, you must
 * create a new hosted zone with the same name and create new resource record sets.
 *
 *
 * For more information about charges for hosted zones, see [Amazon Route 53
 * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
 *
 * Note the following:
 *
 * * You can't create a hosted zone for a top-level domain (TLD) such as .com.
 * * If your domain is registered with a registrar other than Route 53, you must update the name
 * servers with your registrar to make Route 53 the DNS service for the domain. For more information,
 * see [Migrating DNS Service for an Existing Domain to Amazon
 * Route 53](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/MigratingDNS.html) in the
 * *Amazon Route 53 Developer Guide* .
 *
 * When you submit a `CreateHostedZone` request, the initial status of the hosted zone is `PENDING`
 * . For public hosted zones, this means that the NS and SOA records are not yet available on all
 * Route 53 DNS servers. When the NS and SOA records are available, the status of the zone changes to
 * `INSYNC` .
 *
 * The `CreateHostedZone` request requires the caller to have an `ec2:DescribeVpcs` permission.
 *
 *
 * When creating private hosted zones, the Amazon VPC must belong to the same partition where the
 * hosted zone is created. A partition is a group of AWS Regions . Each AWS account is scoped to one
 * partition.
 *
 * The following are the supported partitions:
 *
 * * `aws` - AWS Regions
 * * `aws-cn` - China Regions
 * * `aws-us-gov` - AWS GovCloud (US) Region
 *
 * For more information, see [Access
 * Management](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
 * General Reference* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * CfnHostedZone cfnHostedZone = CfnHostedZone.Builder.create(this, "MyCfnHostedZone")
 * .hostedZoneConfig(HostedZoneConfigProperty.builder()
 * .comment("comment")
 * .build())
 * .hostedZoneTags(List.of(HostedZoneTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .name("name")
 * .queryLoggingConfig(QueryLoggingConfigProperty.builder()
 * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
 * .build())
 * .vpcs(List.of(VPCProperty.builder()
 * .vpcId("vpcId")
 * .vpcRegion("vpcRegion")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html)
 */
@CdkDslMarker
public class CfnHostedZoneDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnHostedZone.Builder = CfnHostedZone.Builder.create(scope, id)

  private val _hostedZoneTags: MutableList<CfnHostedZone.HostedZoneTagProperty> = mutableListOf()

  private val _vpcs: MutableList<Any> = mutableListOf()

  /**
   * A complex type that contains an optional comment.
   *
   * If you don't want to specify a comment, omit the `HostedZoneConfig` and `Comment` elements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzoneconfig)
   * @param hostedZoneConfig A complex type that contains an optional comment. 
   */
  public fun hostedZoneConfig(hostedZoneConfig: IResolvable) {
    cdkBuilder.hostedZoneConfig(hostedZoneConfig)
  }

  /**
   * A complex type that contains an optional comment.
   *
   * If you don't want to specify a comment, omit the `HostedZoneConfig` and `Comment` elements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzoneconfig)
   * @param hostedZoneConfig A complex type that contains an optional comment. 
   */
  public fun hostedZoneConfig(hostedZoneConfig: CfnHostedZone.HostedZoneConfigProperty) {
    cdkBuilder.hostedZoneConfig(hostedZoneConfig)
  }

  /**
   * Adds, edits, or deletes tags for a health check or a hosted zone.
   *
   * For information about using tags for cost allocation, see [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
   * *AWS Billing and Cost Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags)
   * @param hostedZoneTags Adds, edits, or deletes tags for a health check or a hosted zone. 
   */
  public fun hostedZoneTags(hostedZoneTags: CfnHostedZoneHostedZoneTagPropertyDsl.() -> Unit) {
    _hostedZoneTags.add(CfnHostedZoneHostedZoneTagPropertyDsl().apply(hostedZoneTags).build())
  }

  /**
   * Adds, edits, or deletes tags for a health check or a hosted zone.
   *
   * For information about using tags for cost allocation, see [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
   * *AWS Billing and Cost Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-hostedzonetags)
   * @param hostedZoneTags Adds, edits, or deletes tags for a health check or a hosted zone. 
   */
  public fun hostedZoneTags(hostedZoneTags: Collection<CfnHostedZone.HostedZoneTagProperty>) {
    _hostedZoneTags.addAll(hostedZoneTags)
  }

  /**
   * The name of the domain.
   *
   * Specify a fully qualified domain name, for example, *www.example.com* . The trailing dot is
   * optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route
   * 53 treats *www.example.com* (without a trailing dot) and *www.example.com.* (with a trailing dot)
   * as identical.
   *
   * If you're creating a public hosted zone, this is the name you have registered with your DNS
   * registrar. If your domain name is registered with a registrar other than Route 53, change the name
   * servers for your domain to the set of `NameServers` that are returned by the `Fn::GetAtt`
   * intrinsic function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-name)
   * @param name The name of the domain. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Creates a configuration for DNS query logging.
   *
   * After you create a query logging configuration, Amazon Route 53 begins to publish log data to
   * an Amazon CloudWatch Logs log group.
   *
   * DNS query logs contain information about the queries that Route 53 receives for a specified
   * public hosted zone, such as the following:
   *
   * * Route 53 edge location that responded to the DNS query
   * * Domain or subdomain that was requested
   * * DNS record type, such as A or AAAA
   * * DNS response code, such as `NoError` or `ServFail`
   * * **Log Group and Resource Policy** - Before you create a query logging configuration, perform
   * the following operations.
   *
   *
   * If you create a query logging configuration using the Route 53 console, Route 53 performs these
   * operations automatically.
   *
   *
   * * Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you
   * create a query logging configuration. Note the following:
   * * You must create the log group in the us-east-1 region.
   * * You must use the same AWS account to create the log group and the hosted zone that you want
   * to configure query logging for.
   * * When you create log groups for query logging, we recommend that you use a consistent prefix,
   * for example:
   *
   * `/aws/route53/ *hosted zone name*`
   *
   * In the next step, you'll create a resource policy, which controls access to one or more log
   * groups and the associated AWS resources, such as Route 53 hosted zones. There's a limit on the
   * number of resource policies that you can create, so we recommend that you use a consistent prefix
   * so you can use the same resource policy for all the log groups that you create for query logging.
   *
   * * Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs to
   * create log streams and to send query logs to log streams. For the value of `Resource` , specify
   * the ARN for the log group that you created in the previous step. To use the same resource policy
   * for all the CloudWatch Logs log groups that you created for query logging configurations, replace
   * the hosted zone name with `*` , for example:
   *
   * `arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *`
   *
   * To avoid the confused deputy problem, a security issue where an entity without a permission for
   * an action can coerce a more-privileged entity to perform it, you can optionally limit the
   * permissions that a service has to a resource in a resource-based policy by supplying the following
   * values:
   *
   * * For `aws:SourceArn` , supply the hosted zone ARN used in creating the query logging
   * configuration. For example, `aws:SourceArn: arn:aws:route53:::hostedzone/hosted zone ID` .
   * * For `aws:SourceAccount` , supply the account ID for the account that creates the query
   * logging configuration. For example, `aws:SourceAccount:111111111111` .
   *
   * For more information, see [The confused deputy
   * problem](https://docs.aws.amazon.com/IAM/latest/UserGuide/confused-deputy.html) in the *AWS IAM
   * User Guide* .
   *
   *
   * You can't use the CloudWatch console to create or edit a resource policy. You must use the
   * CloudWatch API, one of the AWS SDKs, or the AWS CLI .
   *
   *
   * * **Log Streams and Edge Locations** - When Route 53 finishes creating the configuration for
   * DNS query logging, it does the following:
   * * Creates a log stream for an edge location the first time that the edge location responds to
   * DNS queries for the specified hosted zone. That log stream is used to log all queries that Route
   * 53 responds to for that edge location.
   * * Begins to send query logs to the applicable log stream.
   *
   * The name of each log stream is in the following format:
   *
   * `*hosted zone ID* / *edge location code*`
   *
   * The edge location code is a three-letter code and an arbitrarily assigned number, for example,
   * DFW3. The three-letter code typically corresponds with the International Air Transport Association
   * airport code for an airport near the edge location. (These abbreviations might change in the
   * future.) For a list of edge locations, see "The Route 53 Global Network" on the [Route 53 Product
   * Details](https://docs.aws.amazon.com/route53/details/) page.
   *
   * * **Queries That Are Logged** - Query logs contain only the queries that DNS resolvers forward
   * to Route 53. If a DNS resolver has already cached the response to a query (such as the IP address
   * for a load balancer for example.com), the resolver will continue to return the cached response. It
   * doesn't forward another query to Route 53 until the TTL for the corresponding resource record set
   * expires. Depending on how many DNS queries are submitted for a resource record set, and depending
   * on the TTL for that resource record set, query logs might contain information about only one query
   * out of every several thousand queries that are submitted to DNS. For more information about how
   * DNS works, see [Routing Internet Traffic to Your Website or Web
   * Application](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html)
   * in the *Amazon Route 53 Developer Guide* .
   * * **Log File Format** - For a list of the values in each query log and the format of each
   * value, see [Logging DNS
   * Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html) in the *Amazon
   * Route 53 Developer Guide* .
   * * **Pricing** - For information about charges for query logs, see [Amazon CloudWatch
   * Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
   * * **How to Stop Logging** - If you want Route 53 to stop sending query logs to CloudWatch Logs,
   * delete the query logging configuration. For more information, see
   * [DeleteQueryLoggingConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-queryloggingconfig)
   * @param queryLoggingConfig Creates a configuration for DNS query logging. 
   */
  public fun queryLoggingConfig(queryLoggingConfig: IResolvable) {
    cdkBuilder.queryLoggingConfig(queryLoggingConfig)
  }

  /**
   * Creates a configuration for DNS query logging.
   *
   * After you create a query logging configuration, Amazon Route 53 begins to publish log data to
   * an Amazon CloudWatch Logs log group.
   *
   * DNS query logs contain information about the queries that Route 53 receives for a specified
   * public hosted zone, such as the following:
   *
   * * Route 53 edge location that responded to the DNS query
   * * Domain or subdomain that was requested
   * * DNS record type, such as A or AAAA
   * * DNS response code, such as `NoError` or `ServFail`
   * * **Log Group and Resource Policy** - Before you create a query logging configuration, perform
   * the following operations.
   *
   *
   * If you create a query logging configuration using the Route 53 console, Route 53 performs these
   * operations automatically.
   *
   *
   * * Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you
   * create a query logging configuration. Note the following:
   * * You must create the log group in the us-east-1 region.
   * * You must use the same AWS account to create the log group and the hosted zone that you want
   * to configure query logging for.
   * * When you create log groups for query logging, we recommend that you use a consistent prefix,
   * for example:
   *
   * `/aws/route53/ *hosted zone name*`
   *
   * In the next step, you'll create a resource policy, which controls access to one or more log
   * groups and the associated AWS resources, such as Route 53 hosted zones. There's a limit on the
   * number of resource policies that you can create, so we recommend that you use a consistent prefix
   * so you can use the same resource policy for all the log groups that you create for query logging.
   *
   * * Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs to
   * create log streams and to send query logs to log streams. For the value of `Resource` , specify
   * the ARN for the log group that you created in the previous step. To use the same resource policy
   * for all the CloudWatch Logs log groups that you created for query logging configurations, replace
   * the hosted zone name with `*` , for example:
   *
   * `arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *`
   *
   * To avoid the confused deputy problem, a security issue where an entity without a permission for
   * an action can coerce a more-privileged entity to perform it, you can optionally limit the
   * permissions that a service has to a resource in a resource-based policy by supplying the following
   * values:
   *
   * * For `aws:SourceArn` , supply the hosted zone ARN used in creating the query logging
   * configuration. For example, `aws:SourceArn: arn:aws:route53:::hostedzone/hosted zone ID` .
   * * For `aws:SourceAccount` , supply the account ID for the account that creates the query
   * logging configuration. For example, `aws:SourceAccount:111111111111` .
   *
   * For more information, see [The confused deputy
   * problem](https://docs.aws.amazon.com/IAM/latest/UserGuide/confused-deputy.html) in the *AWS IAM
   * User Guide* .
   *
   *
   * You can't use the CloudWatch console to create or edit a resource policy. You must use the
   * CloudWatch API, one of the AWS SDKs, or the AWS CLI .
   *
   *
   * * **Log Streams and Edge Locations** - When Route 53 finishes creating the configuration for
   * DNS query logging, it does the following:
   * * Creates a log stream for an edge location the first time that the edge location responds to
   * DNS queries for the specified hosted zone. That log stream is used to log all queries that Route
   * 53 responds to for that edge location.
   * * Begins to send query logs to the applicable log stream.
   *
   * The name of each log stream is in the following format:
   *
   * `*hosted zone ID* / *edge location code*`
   *
   * The edge location code is a three-letter code and an arbitrarily assigned number, for example,
   * DFW3. The three-letter code typically corresponds with the International Air Transport Association
   * airport code for an airport near the edge location. (These abbreviations might change in the
   * future.) For a list of edge locations, see "The Route 53 Global Network" on the [Route 53 Product
   * Details](https://docs.aws.amazon.com/route53/details/) page.
   *
   * * **Queries That Are Logged** - Query logs contain only the queries that DNS resolvers forward
   * to Route 53. If a DNS resolver has already cached the response to a query (such as the IP address
   * for a load balancer for example.com), the resolver will continue to return the cached response. It
   * doesn't forward another query to Route 53 until the TTL for the corresponding resource record set
   * expires. Depending on how many DNS queries are submitted for a resource record set, and depending
   * on the TTL for that resource record set, query logs might contain information about only one query
   * out of every several thousand queries that are submitted to DNS. For more information about how
   * DNS works, see [Routing Internet Traffic to Your Website or Web
   * Application](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html)
   * in the *Amazon Route 53 Developer Guide* .
   * * **Log File Format** - For a list of the values in each query log and the format of each
   * value, see [Logging DNS
   * Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html) in the *Amazon
   * Route 53 Developer Guide* .
   * * **Pricing** - For information about charges for query logs, see [Amazon CloudWatch
   * Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
   * * **How to Stop Logging** - If you want Route 53 to stop sending query logs to CloudWatch Logs,
   * delete the query logging configuration. For more information, see
   * [DeleteQueryLoggingConfig](https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-queryloggingconfig)
   * @param queryLoggingConfig Creates a configuration for DNS query logging. 
   */
  public fun queryLoggingConfig(queryLoggingConfig: CfnHostedZone.QueryLoggingConfigProperty) {
    cdkBuilder.queryLoggingConfig(queryLoggingConfig)
  }

  /**
   * *Private hosted zones:* A complex type that contains information about the VPCs that are
   * associated with the specified hosted zone.
   *
   *
   * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs)
   * @param vpcs *Private hosted zones:* A complex type that contains information about the VPCs
   * that are associated with the specified hosted zone. 
   */
  public fun vpcs(vararg vpcs: Any) {
    _vpcs.addAll(listOf(*vpcs))
  }

  /**
   * *Private hosted zones:* A complex type that contains information about the VPCs that are
   * associated with the specified hosted zone.
   *
   *
   * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs)
   * @param vpcs *Private hosted zones:* A complex type that contains information about the VPCs
   * that are associated with the specified hosted zone. 
   */
  public fun vpcs(vpcs: Collection<Any>) {
    _vpcs.addAll(vpcs)
  }

  /**
   * *Private hosted zones:* A complex type that contains information about the VPCs that are
   * associated with the specified hosted zone.
   *
   *
   * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html#cfn-route53-hostedzone-vpcs)
   * @param vpcs *Private hosted zones:* A complex type that contains information about the VPCs
   * that are associated with the specified hosted zone. 
   */
  public fun vpcs(vpcs: IResolvable) {
    cdkBuilder.vpcs(vpcs)
  }

  public fun build(): CfnHostedZone {
    if(_hostedZoneTags.isNotEmpty()) cdkBuilder.hostedZoneTags(_hostedZoneTags)
    if(_vpcs.isNotEmpty()) cdkBuilder.vpcs(_vpcs)
    return cdkBuilder.build()
  }
}
