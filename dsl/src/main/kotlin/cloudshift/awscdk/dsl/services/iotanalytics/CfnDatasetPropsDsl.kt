@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import software.amazon.awscdk.services.iotanalytics.CfnDatasetProps

/**
 * Properties for defining a `CfnDataset`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * CfnDatasetProps cfnDatasetProps = CfnDatasetProps.builder()
 * .actions(List.of(ActionProperty.builder()
 * .actionName("actionName")
 * // the properties below are optional
 * .containerAction(ContainerActionProperty.builder()
 * .executionRoleArn("executionRoleArn")
 * .image("image")
 * .resourceConfiguration(ResourceConfigurationProperty.builder()
 * .computeType("computeType")
 * .volumeSizeInGb(123)
 * .build())
 * // the properties below are optional
 * .variables(List.of(VariableProperty.builder()
 * .variableName("variableName")
 * // the properties below are optional
 * .datasetContentVersionValue(DatasetContentVersionValueProperty.builder()
 * .datasetName("datasetName")
 * .build())
 * .doubleValue(123)
 * .outputFileUriValue(OutputFileUriValueProperty.builder()
 * .fileName("fileName")
 * .build())
 * .stringValue("stringValue")
 * .build()))
 * .build())
 * .queryAction(QueryActionProperty.builder()
 * .sqlQuery("sqlQuery")
 * // the properties below are optional
 * .filters(List.of(FilterProperty.builder()
 * .deltaTime(DeltaTimeProperty.builder()
 * .offsetSeconds(123)
 * .timeExpression("timeExpression")
 * .build())
 * .build()))
 * .build())
 * .build()))
 * // the properties below are optional
 * .contentDeliveryRules(List.of(DatasetContentDeliveryRuleProperty.builder()
 * .destination(DatasetContentDeliveryRuleDestinationProperty.builder()
 * .iotEventsDestinationConfiguration(IotEventsDestinationConfigurationProperty.builder()
 * .inputName("inputName")
 * .roleArn("roleArn")
 * .build())
 * .s3DestinationConfiguration(S3DestinationConfigurationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .glueConfiguration(GlueConfigurationProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .entryName("entryName")
 * .build()))
 * .datasetName("datasetName")
 * .lateDataRules(List.of(LateDataRuleProperty.builder()
 * .ruleConfiguration(LateDataRuleConfigurationProperty.builder()
 * .deltaTimeSessionWindowConfiguration(DeltaTimeSessionWindowConfigurationProperty.builder()
 * .timeoutInMinutes(123)
 * .build())
 * .build())
 * // the properties below are optional
 * .ruleName("ruleName")
 * .build()))
 * .retentionPeriod(RetentionPeriodProperty.builder()
 * .numberOfDays(123)
 * .unlimited(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .triggers(List.of(TriggerProperty.builder()
 * .schedule(ScheduleProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * .build())
 * .triggeringDataset(TriggeringDatasetProperty.builder()
 * .datasetName("datasetName")
 * .build())
 * .build()))
 * .versioningConfiguration(VersioningConfigurationProperty.builder()
 * .maxVersions(123)
 * .unlimited(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-dataset.html)
 */
@CdkDslMarker
public class CfnDatasetPropsDsl {
  private val cdkBuilder: CfnDatasetProps.Builder = CfnDatasetProps.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  private val _contentDeliveryRules: MutableList<Any> = mutableListOf()

  private val _lateDataRules: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _triggers: MutableList<Any> = mutableListOf()

  /**
   * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
   */
  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
   */
  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  /**
   * @param actions The `DatasetAction` objects that automatically create the dataset contents. 
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * @param contentDeliveryRules When dataset contents are created they are delivered to
   * destinations specified here.
   */
  public fun contentDeliveryRules(vararg contentDeliveryRules: Any) {
    _contentDeliveryRules.addAll(listOf(*contentDeliveryRules))
  }

  /**
   * @param contentDeliveryRules When dataset contents are created they are delivered to
   * destinations specified here.
   */
  public fun contentDeliveryRules(contentDeliveryRules: Collection<Any>) {
    _contentDeliveryRules.addAll(contentDeliveryRules)
  }

  /**
   * @param contentDeliveryRules When dataset contents are created they are delivered to
   * destinations specified here.
   */
  public fun contentDeliveryRules(contentDeliveryRules: IResolvable) {
    cdkBuilder.contentDeliveryRules(contentDeliveryRules)
  }

  /**
   * @param datasetName The name of the dataset.
   */
  public fun datasetName(datasetName: String) {
    cdkBuilder.datasetName(datasetName)
  }

  /**
   * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
   * arrives late.
   * To specify `lateDataRules` , the dataset must use a
   * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
   * filter.
   */
  public fun lateDataRules(vararg lateDataRules: Any) {
    _lateDataRules.addAll(listOf(*lateDataRules))
  }

  /**
   * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
   * arrives late.
   * To specify `lateDataRules` , the dataset must use a
   * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
   * filter.
   */
  public fun lateDataRules(lateDataRules: Collection<Any>) {
    _lateDataRules.addAll(lateDataRules)
  }

  /**
   * @param lateDataRules A list of data rules that send notifications to CloudWatch, when data
   * arrives late.
   * To specify `lateDataRules` , the dataset must use a
   * [DeltaTimer](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
   * filter.
   */
  public fun lateDataRules(lateDataRules: IResolvable) {
    cdkBuilder.lateDataRules(lateDataRules)
  }

  /**
   * @param retentionPeriod Optional.
   * How long, in days, message data is kept for the dataset.
   */
  public fun retentionPeriod(retentionPeriod: IResolvable) {
    cdkBuilder.retentionPeriod(retentionPeriod)
  }

  /**
   * @param retentionPeriod Optional.
   * How long, in days, message data is kept for the dataset.
   */
  public fun retentionPeriod(retentionPeriod: CfnDataset.RetentionPeriodProperty) {
    cdkBuilder.retentionPeriod(retentionPeriod)
  }

  /**
   * @param tags Metadata which can be used to manage the data set.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Metadata which can be used to manage the data set.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
   * updated.
   */
  public fun triggers(vararg triggers: Any) {
    _triggers.addAll(listOf(*triggers))
  }

  /**
   * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
   * updated.
   */
  public fun triggers(triggers: Collection<Any>) {
    _triggers.addAll(triggers)
  }

  /**
   * @param triggers The `DatasetTrigger` objects that specify when the dataset is automatically
   * updated.
   */
  public fun triggers(triggers: IResolvable) {
    cdkBuilder.triggers(triggers)
  }

  /**
   * @param versioningConfiguration Optional.
   * How many versions of dataset contents are kept. If not specified or set to null, only the
   * latest version plus the latest succeeded version (if they are different) are kept for the time
   * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
   * Versions of AWS IoT Analytics
   * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
   * in the *AWS IoT Analytics User Guide* .
   */
  public fun versioningConfiguration(versioningConfiguration: IResolvable) {
    cdkBuilder.versioningConfiguration(versioningConfiguration)
  }

  /**
   * @param versioningConfiguration Optional.
   * How many versions of dataset contents are kept. If not specified or set to null, only the
   * latest version plus the latest succeeded version (if they are different) are kept for the time
   * period specified by the `retentionPeriod` parameter. For more information, see [Keeping Multiple
   * Versions of AWS IoT Analytics
   * datasets](https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
   * in the *AWS IoT Analytics User Guide* .
   */
  public
      fun versioningConfiguration(versioningConfiguration: CfnDataset.VersioningConfigurationProperty) {
    cdkBuilder.versioningConfiguration(versioningConfiguration)
  }

  public fun build(): CfnDatasetProps {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_contentDeliveryRules.isNotEmpty()) cdkBuilder.contentDeliveryRules(_contentDeliveryRules)
    if(_lateDataRules.isNotEmpty()) cdkBuilder.lateDataRules(_lateDataRules)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_triggers.isNotEmpty()) cdkBuilder.triggers(_triggers)
    return cdkBuilder.build()
  }
}
