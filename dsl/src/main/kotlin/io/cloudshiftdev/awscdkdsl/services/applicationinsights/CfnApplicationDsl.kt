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

package io.cloudshiftdev.awscdkdsl.services.applicationinsights

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication
import software.constructs.Construct

/**
 * The `AWS::ApplicationInsights::Application` resource adds an application that is created from a
 * resource group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .resourceGroupName("resourceGroupName")
 * // the properties below are optional
 * .autoConfigurationEnabled(false)
 * .componentMonitoringSettings(List.of(ComponentMonitoringSettingProperty.builder()
 * .componentConfigurationMode("componentConfigurationMode")
 * .tier("tier")
 * // the properties below are optional
 * .componentArn("componentArn")
 * .componentName("componentName")
 * .customComponentConfiguration(ComponentConfigurationProperty.builder()
 * .configurationDetails(ConfigurationDetailsProperty.builder()
 * .alarmMetrics(List.of(AlarmMetricProperty.builder()
 * .alarmMetricName("alarmMetricName")
 * .build()))
 * .alarms(List.of(AlarmProperty.builder()
 * .alarmName("alarmName")
 * // the properties below are optional
 * .severity("severity")
 * .build()))
 * .haClusterPrometheusExporter(HAClusterPrometheusExporterProperty.builder()
 * .prometheusPort("prometheusPort")
 * .build())
 * .hanaPrometheusExporter(HANAPrometheusExporterProperty.builder()
 * .agreeToInstallHanadbClient(false)
 * .hanaPort("hanaPort")
 * .hanaSecretName("hanaSecretName")
 * .hanasid("hanasid")
 * // the properties below are optional
 * .prometheusPort("prometheusPort")
 * .build())
 * .jmxPrometheusExporter(JMXPrometheusExporterProperty.builder()
 * .hostPort("hostPort")
 * .jmxurl("jmxurl")
 * .prometheusPort("prometheusPort")
 * .build())
 * .logs(List.of(LogProperty.builder()
 * .logType("logType")
 * // the properties below are optional
 * .encoding("encoding")
 * .logGroupName("logGroupName")
 * .logPath("logPath")
 * .patternSet("patternSet")
 * .build()))
 * .windowsEvents(List.of(WindowsEventProperty.builder()
 * .eventLevels(List.of("eventLevels"))
 * .eventName("eventName")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .patternSet("patternSet")
 * .build()))
 * .build())
 * .subComponentTypeConfigurations(List.of(SubComponentTypeConfigurationProperty.builder()
 * .subComponentConfigurationDetails(SubComponentConfigurationDetailsProperty.builder()
 * .alarmMetrics(List.of(AlarmMetricProperty.builder()
 * .alarmMetricName("alarmMetricName")
 * .build()))
 * .logs(List.of(LogProperty.builder()
 * .logType("logType")
 * // the properties below are optional
 * .encoding("encoding")
 * .logGroupName("logGroupName")
 * .logPath("logPath")
 * .patternSet("patternSet")
 * .build()))
 * .windowsEvents(List.of(WindowsEventProperty.builder()
 * .eventLevels(List.of("eventLevels"))
 * .eventName("eventName")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .patternSet("patternSet")
 * .build()))
 * .build())
 * .subComponentType("subComponentType")
 * .build()))
 * .build())
 * .defaultOverwriteComponentConfiguration(ComponentConfigurationProperty.builder()
 * .configurationDetails(ConfigurationDetailsProperty.builder()
 * .alarmMetrics(List.of(AlarmMetricProperty.builder()
 * .alarmMetricName("alarmMetricName")
 * .build()))
 * .alarms(List.of(AlarmProperty.builder()
 * .alarmName("alarmName")
 * // the properties below are optional
 * .severity("severity")
 * .build()))
 * .haClusterPrometheusExporter(HAClusterPrometheusExporterProperty.builder()
 * .prometheusPort("prometheusPort")
 * .build())
 * .hanaPrometheusExporter(HANAPrometheusExporterProperty.builder()
 * .agreeToInstallHanadbClient(false)
 * .hanaPort("hanaPort")
 * .hanaSecretName("hanaSecretName")
 * .hanasid("hanasid")
 * // the properties below are optional
 * .prometheusPort("prometheusPort")
 * .build())
 * .jmxPrometheusExporter(JMXPrometheusExporterProperty.builder()
 * .hostPort("hostPort")
 * .jmxurl("jmxurl")
 * .prometheusPort("prometheusPort")
 * .build())
 * .logs(List.of(LogProperty.builder()
 * .logType("logType")
 * // the properties below are optional
 * .encoding("encoding")
 * .logGroupName("logGroupName")
 * .logPath("logPath")
 * .patternSet("patternSet")
 * .build()))
 * .windowsEvents(List.of(WindowsEventProperty.builder()
 * .eventLevels(List.of("eventLevels"))
 * .eventName("eventName")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .patternSet("patternSet")
 * .build()))
 * .build())
 * .subComponentTypeConfigurations(List.of(SubComponentTypeConfigurationProperty.builder()
 * .subComponentConfigurationDetails(SubComponentConfigurationDetailsProperty.builder()
 * .alarmMetrics(List.of(AlarmMetricProperty.builder()
 * .alarmMetricName("alarmMetricName")
 * .build()))
 * .logs(List.of(LogProperty.builder()
 * .logType("logType")
 * // the properties below are optional
 * .encoding("encoding")
 * .logGroupName("logGroupName")
 * .logPath("logPath")
 * .patternSet("patternSet")
 * .build()))
 * .windowsEvents(List.of(WindowsEventProperty.builder()
 * .eventLevels(List.of("eventLevels"))
 * .eventName("eventName")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .patternSet("patternSet")
 * .build()))
 * .build())
 * .subComponentType("subComponentType")
 * .build()))
 * .build())
 * .build()))
 * .customComponents(List.of(CustomComponentProperty.builder()
 * .componentName("componentName")
 * .resourceList(List.of("resourceList"))
 * .build()))
 * .cweMonitorEnabled(false)
 * .groupingType("groupingType")
 * .logPatternSets(List.of(LogPatternSetProperty.builder()
 * .logPatterns(List.of(LogPatternProperty.builder()
 * .pattern("pattern")
 * .patternName("patternName")
 * .rank(123)
 * .build()))
 * .patternSetName("patternSetName")
 * .build()))
 * .opsCenterEnabled(false)
 * .opsItemSnsTopicArn("opsItemSnsTopicArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html)
 */
@CdkDslMarker
public class CfnApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

    private val _componentMonitoringSettings: MutableList<Any> = mutableListOf()

    private val _customComponents: MutableList<Any> = mutableListOf()

    private val _logPatternSets: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * If set to `true` , the application components will be configured with the monitoring
     * configuration recommended by Application Insights.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-autoconfigurationenabled)
     *
     * @param autoConfigurationEnabled If set to `true` , the application components will be
     *   configured with the monitoring configuration recommended by Application Insights.
     */
    public fun autoConfigurationEnabled(autoConfigurationEnabled: Boolean) {
        cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled)
    }

    /**
     * If set to `true` , the application components will be configured with the monitoring
     * configuration recommended by Application Insights.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-autoconfigurationenabled)
     *
     * @param autoConfigurationEnabled If set to `true` , the application components will be
     *   configured with the monitoring configuration recommended by Application Insights.
     */
    public fun autoConfigurationEnabled(autoConfigurationEnabled: IResolvable) {
        cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled)
    }

    /**
     * The monitoring settings of the components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-componentmonitoringsettings)
     *
     * @param componentMonitoringSettings The monitoring settings of the components.
     */
    public fun componentMonitoringSettings(vararg componentMonitoringSettings: Any) {
        _componentMonitoringSettings.addAll(listOf(*componentMonitoringSettings))
    }

    /**
     * The monitoring settings of the components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-componentmonitoringsettings)
     *
     * @param componentMonitoringSettings The monitoring settings of the components.
     */
    public fun componentMonitoringSettings(componentMonitoringSettings: Collection<Any>) {
        _componentMonitoringSettings.addAll(componentMonitoringSettings)
    }

    /**
     * The monitoring settings of the components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-componentmonitoringsettings)
     *
     * @param componentMonitoringSettings The monitoring settings of the components.
     */
    public fun componentMonitoringSettings(componentMonitoringSettings: IResolvable) {
        cdkBuilder.componentMonitoringSettings(componentMonitoringSettings)
    }

    /**
     * Describes a custom component by grouping similar standalone instances to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-customcomponents)
     *
     * @param customComponents Describes a custom component by grouping similar standalone instances
     *   to monitor.
     */
    public fun customComponents(vararg customComponents: Any) {
        _customComponents.addAll(listOf(*customComponents))
    }

    /**
     * Describes a custom component by grouping similar standalone instances to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-customcomponents)
     *
     * @param customComponents Describes a custom component by grouping similar standalone instances
     *   to monitor.
     */
    public fun customComponents(customComponents: Collection<Any>) {
        _customComponents.addAll(customComponents)
    }

    /**
     * Describes a custom component by grouping similar standalone instances to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-customcomponents)
     *
     * @param customComponents Describes a custom component by grouping similar standalone instances
     *   to monitor.
     */
    public fun customComponents(customComponents: IResolvable) {
        cdkBuilder.customComponents(customComponents)
    }

    /**
     * Indicates whether Application Insights can listen to CloudWatch events for the application
     * resources, such as `instance terminated` , `failed deployment` , and others.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-cwemonitorenabled)
     *
     * @param cweMonitorEnabled Indicates whether Application Insights can listen to CloudWatch
     *   events for the application resources, such as `instance terminated` , `failed deployment` ,
     *   and others.
     */
    public fun cweMonitorEnabled(cweMonitorEnabled: Boolean) {
        cdkBuilder.cweMonitorEnabled(cweMonitorEnabled)
    }

    /**
     * Indicates whether Application Insights can listen to CloudWatch events for the application
     * resources, such as `instance terminated` , `failed deployment` , and others.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-cwemonitorenabled)
     *
     * @param cweMonitorEnabled Indicates whether Application Insights can listen to CloudWatch
     *   events for the application resources, such as `instance terminated` , `failed deployment` ,
     *   and others.
     */
    public fun cweMonitorEnabled(cweMonitorEnabled: IResolvable) {
        cdkBuilder.cweMonitorEnabled(cweMonitorEnabled)
    }

    /**
     * Application Insights can create applications based on a resource group or on an account.
     *
     * To create an account-based application using all of the resources in the account, set this
     * parameter to `ACCOUNT_BASED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-groupingtype)
     *
     * @param groupingType Application Insights can create applications based on a resource group or
     *   on an account.
     */
    public fun groupingType(groupingType: String) {
        cdkBuilder.groupingType(groupingType)
    }

    /**
     * The log pattern sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-logpatternsets)
     *
     * @param logPatternSets The log pattern sets.
     */
    public fun logPatternSets(vararg logPatternSets: Any) {
        _logPatternSets.addAll(listOf(*logPatternSets))
    }

    /**
     * The log pattern sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-logpatternsets)
     *
     * @param logPatternSets The log pattern sets.
     */
    public fun logPatternSets(logPatternSets: Collection<Any>) {
        _logPatternSets.addAll(logPatternSets)
    }

    /**
     * The log pattern sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-logpatternsets)
     *
     * @param logPatternSets The log pattern sets.
     */
    public fun logPatternSets(logPatternSets: IResolvable) {
        cdkBuilder.logPatternSets(logPatternSets)
    }

    /**
     * Indicates whether Application Insights will create OpsItems for any problem that is detected
     * by Application Insights for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opscenterenabled)
     *
     * @param opsCenterEnabled Indicates whether Application Insights will create OpsItems for any
     *   problem that is detected by Application Insights for an application.
     */
    public fun opsCenterEnabled(opsCenterEnabled: Boolean) {
        cdkBuilder.opsCenterEnabled(opsCenterEnabled)
    }

    /**
     * Indicates whether Application Insights will create OpsItems for any problem that is detected
     * by Application Insights for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opscenterenabled)
     *
     * @param opsCenterEnabled Indicates whether Application Insights will create OpsItems for any
     *   problem that is detected by Application Insights for an application.
     */
    public fun opsCenterEnabled(opsCenterEnabled: IResolvable) {
        cdkBuilder.opsCenterEnabled(opsCenterEnabled)
    }

    /**
     * The SNS topic provided to Application Insights that is associated with the created OpsItems
     * to receive SNS notifications for opsItem updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opsitemsnstopicarn)
     *
     * @param opsItemSnsTopicArn The SNS topic provided to Application Insights that is associated
     *   with the created OpsItems to receive SNS notifications for opsItem updates.
     */
    public fun opsItemSnsTopicArn(opsItemSnsTopicArn: String) {
        cdkBuilder.opsItemSnsTopicArn(opsItemSnsTopicArn)
    }

    /**
     * The name of the resource group used for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-resourcegroupname)
     *
     * @param resourceGroupName The name of the resource group used for the application.
     */
    public fun resourceGroupName(resourceGroupName: String) {
        cdkBuilder.resourceGroupName(resourceGroupName)
    }

    /**
     * An array of `Tags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-tags)
     *
     * @param tags An array of `Tags` .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of `Tags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-tags)
     *
     * @param tags An array of `Tags` .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnApplication {
        if (_componentMonitoringSettings.isNotEmpty())
            cdkBuilder.componentMonitoringSettings(_componentMonitoringSettings)
        if (_customComponents.isNotEmpty()) cdkBuilder.customComponents(_customComponents)
        if (_logPatternSets.isNotEmpty()) cdkBuilder.logPatternSets(_logPatternSets)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
