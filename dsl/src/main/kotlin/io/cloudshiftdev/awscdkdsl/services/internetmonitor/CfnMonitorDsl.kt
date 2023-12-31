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

package io.cloudshiftdev.awscdkdsl.services.internetmonitor

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.internetmonitor.CfnMonitor
import software.constructs.Construct

/**
 * The `AWS::InternetMonitor::Monitor` resource is an Internet Monitor resource type that contains
 * information about how you create a monitor in Amazon CloudWatch Internet Monitor.
 *
 * A monitor in Internet Monitor provides visibility into performance and availability between your
 * applications hosted on AWS and your end users, using a traffic profile that it creates based on
 * the application resources that you add: Virtual Private Clouds (VPCs), Amazon CloudFront
 * distributions, or WorkSpaces directories.
 *
 * Internet Monitor also alerts you to internet issues that impact your application in the
 * city-networks (geographies and networks) where your end users use it. With Internet Monitor, you
 * can quickly pinpoint the locations and providers that are affected, so that you can address the
 * issue.
 *
 * For more information, see
 * [Using Amazon CloudWatch Internet Monitor](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-InternetMonitor.html)
 * in the *Amazon CloudWatch User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.internetmonitor.*;
 * CfnMonitor cfnMonitor = CfnMonitor.Builder.create(this, "MyCfnMonitor")
 * .monitorName("monitorName")
 * // the properties below are optional
 * .healthEventsConfig(HealthEventsConfigProperty.builder()
 * .availabilityLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
 * .healthScoreThreshold(123)
 * .minTrafficImpact(123)
 * .status("status")
 * .build())
 * .availabilityScoreThreshold(123)
 * .performanceLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
 * .healthScoreThreshold(123)
 * .minTrafficImpact(123)
 * .status("status")
 * .build())
 * .performanceScoreThreshold(123)
 * .build())
 * .internetMeasurementsLogDelivery(InternetMeasurementsLogDeliveryProperty.builder()
 * .s3Config(S3ConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .logDeliveryStatus("logDeliveryStatus")
 * .build())
 * .build())
 * .maxCityNetworksToMonitor(123)
 * .resources(List.of("resources"))
 * .resourcesToAdd(List.of("resourcesToAdd"))
 * .resourcesToRemove(List.of("resourcesToRemove"))
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trafficPercentageToMonitor(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html)
 */
@CdkDslMarker
public class CfnMonitorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMonitor.Builder = CfnMonitor.Builder.create(scope, id)

    private val _resources: MutableList<String> = mutableListOf()

    private val _resourcesToAdd: MutableList<String> = mutableListOf()

    private val _resourcesToRemove: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-healtheventsconfig)
     *
     * @param healthEventsConfig
     */
    public fun healthEventsConfig(healthEventsConfig: IResolvable) {
        cdkBuilder.healthEventsConfig(healthEventsConfig)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-healtheventsconfig)
     *
     * @param healthEventsConfig
     */
    public fun healthEventsConfig(healthEventsConfig: CfnMonitor.HealthEventsConfigProperty) {
        cdkBuilder.healthEventsConfig(healthEventsConfig)
    }

    /**
     * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
     * limit) to another location, such as an Amazon S3 bucket.
     *
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or
     * ISPs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-internetmeasurementslogdelivery)
     *
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     *   city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     *   bucket.
     */
    public fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable) {
        cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery)
    }

    /**
     * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
     * limit) to another location, such as an Amazon S3 bucket.
     *
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or
     * ISPs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-internetmeasurementslogdelivery)
     *
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     *   city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     *   bucket.
     */
    public fun internetMeasurementsLogDelivery(
        internetMeasurementsLogDelivery: CfnMonitor.InternetMeasurementsLogDeliveryProperty
    ) {
        cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery)
    }

    /**
     * The maximum number of city-networks to monitor for your resources.
     *
     * A city-network is the location (city) where clients access your application resources from
     * and the network, such as an internet service provider, that clients access the resources
     * through.
     *
     * For more information, see
     * [Choosing a city-network maximum value](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html)
     * in *Using Amazon CloudWatch Internet Monitor* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-maxcitynetworkstomonitor)
     *
     * @param maxCityNetworksToMonitor The maximum number of city-networks to monitor for your
     *   resources.
     */
    public fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number) {
        cdkBuilder.maxCityNetworksToMonitor(maxCityNetworksToMonitor)
    }

    /**
     * The name of the monitor.
     *
     * A monitor name can contain only alphanumeric characters, dashes (-), periods (.), and
     * underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-monitorname)
     *
     * @param monitorName The name of the monitor.
     */
    public fun monitorName(monitorName: String) {
        cdkBuilder.monitorName(monitorName)
    }

    /**
     * The resources that have been added for the monitor, listed by their Amazon Resource Names
     * (ARNs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resources)
     *
     * @param resources The resources that have been added for the monitor, listed by their Amazon
     *   Resource Names (ARNs).
     */
    public fun resources(vararg resources: String) {
        _resources.addAll(listOf(*resources))
    }

    /**
     * The resources that have been added for the monitor, listed by their Amazon Resource Names
     * (ARNs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resources)
     *
     * @param resources The resources that have been added for the monitor, listed by their Amazon
     *   Resource Names (ARNs).
     */
    public fun resources(resources: Collection<String>) {
        _resources.addAll(resources)
    }

    /**
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     * Resources can be Amazon Virtual Private Cloud VPCs, Network Load Balancers (NLBs), Amazon
     * CloudFront distributions, or Amazon WorkSpaces directories.
     *
     * You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces
     * directories, or you can add NLBs. You can't add NLBs or WorkSpaces directories together with
     * any other resources.
     *
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it,
     * to make sure that it has internet connectivity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoadd)
     *
     * @param resourcesToAdd The resources to include in a monitor, which you provide as a set of
     *   Amazon Resource Names (ARNs).
     */
    public fun resourcesToAdd(vararg resourcesToAdd: String) {
        _resourcesToAdd.addAll(listOf(*resourcesToAdd))
    }

    /**
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     * Resources can be Amazon Virtual Private Cloud VPCs, Network Load Balancers (NLBs), Amazon
     * CloudFront distributions, or Amazon WorkSpaces directories.
     *
     * You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces
     * directories, or you can add NLBs. You can't add NLBs or WorkSpaces directories together with
     * any other resources.
     *
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it,
     * to make sure that it has internet connectivity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoadd)
     *
     * @param resourcesToAdd The resources to include in a monitor, which you provide as a set of
     *   Amazon Resource Names (ARNs).
     */
    public fun resourcesToAdd(resourcesToAdd: Collection<String>) {
        _resourcesToAdd.addAll(resourcesToAdd)
    }

    /**
     * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoremove)
     *
     * @param resourcesToRemove The resources to remove from a monitor, which you provide as a set
     *   of Amazon Resource Names (ARNs).
     */
    public fun resourcesToRemove(vararg resourcesToRemove: String) {
        _resourcesToRemove.addAll(listOf(*resourcesToRemove))
    }

    /**
     * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoremove)
     *
     * @param resourcesToRemove The resources to remove from a monitor, which you provide as a set
     *   of Amazon Resource Names (ARNs).
     */
    public fun resourcesToRemove(resourcesToRemove: Collection<String>) {
        _resourcesToRemove.addAll(resourcesToRemove)
    }

    /**
     * The status of a monitor.
     *
     * The accepted values that you can specify for `Status` are `ACTIVE` and `INACTIVE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-status)
     *
     * @param status The status of a monitor.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * The tags for a monitor, listed as a set of *key:value* pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-tags)
     *
     * @param tags The tags for a monitor, listed as a set of *key:value* pairs.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags for a monitor, listed as a set of *key:value* pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-tags)
     *
     * @param tags The tags for a monitor, listed as a set of *key:value* pairs.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The percentage of the internet-facing traffic for your application that you want to monitor.
     *
     * You can also, optionally, set a limit for the number of city-networks (client locations and
     * ASNs, typically internet service providers) that Internet Monitor will monitor traffic for.
     * The city-networks maximum limit caps the number of city-networks that Internet Monitor
     * monitors for your application, regardless of the percentage of traffic that you choose to
     * monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-trafficpercentagetomonitor)
     *
     * @param trafficPercentageToMonitor The percentage of the internet-facing traffic for your
     *   application that you want to monitor.
     */
    public fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number) {
        cdkBuilder.trafficPercentageToMonitor(trafficPercentageToMonitor)
    }

    public fun build(): CfnMonitor {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        if (_resourcesToAdd.isNotEmpty()) cdkBuilder.resourcesToAdd(_resourcesToAdd)
        if (_resourcesToRemove.isNotEmpty()) cdkBuilder.resourcesToRemove(_resourcesToRemove)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
