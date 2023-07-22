@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.forecast

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.forecast.CfnDatasetGroup
import software.constructs.Construct

/**
 * Creates a dataset group, which holds a collection of related datasets.
 *
 * You can add datasets to the dataset group when you create the dataset group, or later by using
 * the [UpdateDatasetGroup](https://docs.aws.amazon.com/forecast/latest/dg/API_UpdateDatasetGroup.html)
 * operation.
 *
 * After creating a dataset group and adding datasets, you use the dataset group when you create a
 * predictor. For more information, see [Dataset
 * groups](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html) .
 *
 * To get a list of all your datasets groups, use the
 * [ListDatasetGroups](https://docs.aws.amazon.com/forecast/latest/dg/API_ListDatasetGroups.html)
 * operation.
 *
 *
 * The `Status` of a dataset group must be `ACTIVE` before you can use the dataset group to create a
 * predictor. To get the status, use the
 * [DescribeDatasetGroup](https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetGroup.html)
 * operation.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.forecast.*;
 * CfnDatasetGroup cfnDatasetGroup = CfnDatasetGroup.Builder.create(this, "MyCfnDatasetGroup")
 * .datasetGroupName("datasetGroupName")
 * .domain("domain")
 * // the properties below are optional
 * .datasetArns(List.of("datasetArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html)
 */
@CdkDslMarker
public class CfnDatasetGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDatasetGroup.Builder = CfnDatasetGroup.Builder.create(scope, id)

  private val _datasetArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the
   * dataset group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetarns)
   * @param datasetArns An array of Amazon Resource Names (ARNs) of the datasets that you want to
   * include in the dataset group. 
   */
  public fun datasetArns(vararg datasetArns: String) {
    _datasetArns.addAll(listOf(*datasetArns))
  }

  /**
   * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the
   * dataset group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetarns)
   * @param datasetArns An array of Amazon Resource Names (ARNs) of the datasets that you want to
   * include in the dataset group. 
   */
  public fun datasetArns(datasetArns: Collection<String>) {
    _datasetArns.addAll(datasetArns)
  }

  /**
   * The name of the dataset group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-datasetgroupname)
   * @param datasetGroupName The name of the dataset group. 
   */
  public fun datasetGroupName(datasetGroupName: String) {
    cdkBuilder.datasetGroupName(datasetGroupName)
  }

  /**
   * The domain associated with the dataset group.
   *
   * When you add a dataset to a dataset group, this value and the value specified for the `Domain`
   * parameter of the
   * [CreateDataset](https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDataset.html) operation
   * must match.
   *
   * The `Domain` and `DatasetType` that you choose determine the fields that must be present in
   * training data that you import to a dataset. For example, if you choose the `RETAIL` domain and
   * `TARGET_TIME_SERIES` as the `DatasetType` , Amazon Forecast requires that `item_id` , `timestamp`
   * , and `demand` fields are present in your data. For more information, see [Dataset
   * groups](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-domain)
   * @param domain The domain associated with the dataset group. 
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html#cfn-forecast-datasetgroup-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDatasetGroup {
    if(_datasetArns.isNotEmpty()) cdkBuilder.datasetArns(_datasetArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
