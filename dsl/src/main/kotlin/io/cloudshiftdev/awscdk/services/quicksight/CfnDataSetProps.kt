package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnDataSetProps {
  /**
   * The AWS account ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-awsaccountid)
   */
  public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  /**
   * Groupings of columns that work together in certain Amazon QuickSight features.
   *
   * Currently, only geospatial hierarchy is supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columngroups)
   */
  public fun columnGroups(): Any? = unwrap(this).getColumnGroups()

  /**
   * A set of one or more definitions of a `ColumnLevelPermissionRule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columnlevelpermissionrules)
   */
  public fun columnLevelPermissionRules(): Any? = unwrap(this).getColumnLevelPermissionRules()

  /**
   * An ID for the dataset that you want to create.
   *
   * This ID is unique per AWS Region for each AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetid)
   */
  public fun dataSetId(): String? = unwrap(this).getDataSetId()

  /**
   * The refresh properties of a dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetrefreshproperties)
   */
  public fun dataSetRefreshProperties(): Any? = unwrap(this).getDataSetRefreshProperties()

  /**
   * The usage configuration to apply to child datasets that reference this dataset as a source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetusageconfiguration)
   */
  public fun dataSetUsageConfiguration(): Any? = unwrap(this).getDataSetUsageConfiguration()

  /**
   * The parameters that are declared in a dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetparameters)
   */
  public fun datasetParameters(): Any? = unwrap(this).getDatasetParameters()

  /**
   * The folder that contains fields and nested subfolders for your dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-fieldfolders)
   */
  public fun fieldFolders(): Any? = unwrap(this).getFieldFolders()

  /**
   * Indicates whether you want to import the data into SPICE.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-importmode)
   */
  public fun importMode(): String? = unwrap(this).getImportMode()

  /**
   * The wait policy to use when creating or updating a Dataset.
   *
   * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-ingestionwaitpolicy)
   */
  public fun ingestionWaitPolicy(): Any? = unwrap(this).getIngestionWaitPolicy()

  /**
   * Configures the combination and transformation of the data from the physical tables.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-logicaltablemap)
   */
  public fun logicalTableMap(): Any? = unwrap(this).getLogicalTableMap()

  /**
   * The display name for the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A list of resource permissions on the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-permissions)
   */
  public fun permissions(): Any? = unwrap(this).getPermissions()

  /**
   * Declares the physical tables that are available in the underlying data sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-physicaltablemap)
   */
  public fun physicalTableMap(): Any? = unwrap(this).getPhysicalTableMap()

  /**
   * The row-level security configuration for the data that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset)
   */
  public fun rowLevelPermissionDataSet(): Any? = unwrap(this).getRowLevelPermissionDataSet()

  /**
   * The element you can use to define tags for row-level security.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration)
   */
  public fun rowLevelPermissionTagConfiguration(): Any? =
      unwrap(this).getRowLevelPermissionTagConfiguration()

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDataSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsAccountId The AWS account ID.
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     * features.
     * Currently, only geospatial hierarchy is supported.
     */
    public fun columnGroups(columnGroups: IResolvable)

    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     * features.
     * Currently, only geospatial hierarchy is supported.
     */
    public fun columnGroups(columnGroups: List<Any>)

    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     * features.
     * Currently, only geospatial hierarchy is supported.
     */
    public fun columnGroups(vararg columnGroups: Any)

    /**
     * @param columnLevelPermissionRules A set of one or more definitions of a
     * `ColumnLevelPermissionRule` .
     */
    public fun columnLevelPermissionRules(columnLevelPermissionRules: IResolvable)

    /**
     * @param columnLevelPermissionRules A set of one or more definitions of a
     * `ColumnLevelPermissionRule` .
     */
    public fun columnLevelPermissionRules(columnLevelPermissionRules: List<Any>)

    /**
     * @param columnLevelPermissionRules A set of one or more definitions of a
     * `ColumnLevelPermissionRule` .
     */
    public fun columnLevelPermissionRules(vararg columnLevelPermissionRules: Any)

    /**
     * @param dataSetId An ID for the dataset that you want to create.
     * This ID is unique per AWS Region for each AWS account.
     */
    public fun dataSetId(dataSetId: String)

    /**
     * @param dataSetRefreshProperties The refresh properties of a dataset.
     */
    public fun dataSetRefreshProperties(dataSetRefreshProperties: IResolvable)

    /**
     * @param dataSetRefreshProperties The refresh properties of a dataset.
     */
    public
        fun dataSetRefreshProperties(dataSetRefreshProperties: CfnDataSet.DataSetRefreshPropertiesProperty)

    /**
     * @param dataSetRefreshProperties The refresh properties of a dataset.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9bf6e51c2eced831f27659eb6226e7c4b7a68b8348c99fc118b1a277d76122e")
    public
        fun dataSetRefreshProperties(dataSetRefreshProperties: CfnDataSet.DataSetRefreshPropertiesProperty.Builder.() -> Unit)

    /**
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     * reference this dataset as a source.
     */
    public fun dataSetUsageConfiguration(dataSetUsageConfiguration: IResolvable)

    /**
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     * reference this dataset as a source.
     */
    public
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: CfnDataSet.DataSetUsageConfigurationProperty)

    /**
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     * reference this dataset as a source.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8edc77fbe1e7b74e1f3faa2046cc61567c7d98fedc78585d7898fff2d261eac")
    public
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: CfnDataSet.DataSetUsageConfigurationProperty.Builder.() -> Unit)

    /**
     * @param datasetParameters The parameters that are declared in a dataset.
     */
    public fun datasetParameters(datasetParameters: IResolvable)

    /**
     * @param datasetParameters The parameters that are declared in a dataset.
     */
    public fun datasetParameters(datasetParameters: List<Any>)

    /**
     * @param datasetParameters The parameters that are declared in a dataset.
     */
    public fun datasetParameters(vararg datasetParameters: Any)

    /**
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset.
     */
    public fun fieldFolders(fieldFolders: IResolvable)

    /**
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset.
     */
    public fun fieldFolders(fieldFolders: Map<String, Any>)

    /**
     * @param importMode Indicates whether you want to import the data into SPICE.
     */
    public fun importMode(importMode: String)

    /**
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset.
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     */
    public fun ingestionWaitPolicy(ingestionWaitPolicy: IResolvable)

    /**
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset.
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     */
    public fun ingestionWaitPolicy(ingestionWaitPolicy: CfnDataSet.IngestionWaitPolicyProperty)

    /**
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset.
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1eee46827dc2cba7bd8af15c0df6fc1acec0cfef69d747f0ab21ea507e2ada08")
    public
        fun ingestionWaitPolicy(ingestionWaitPolicy: CfnDataSet.IngestionWaitPolicyProperty.Builder.() -> Unit)

    /**
     * @param logicalTableMap Configures the combination and transformation of the data from the
     * physical tables.
     */
    public fun logicalTableMap(logicalTableMap: IResolvable)

    /**
     * @param logicalTableMap Configures the combination and transformation of the data from the
     * physical tables.
     */
    public fun logicalTableMap(logicalTableMap: Map<String, Any>)

    /**
     * @param name The display name for the dataset.
     */
    public fun name(name: String)

    /**
     * @param permissions A list of resource permissions on the dataset.
     */
    public fun permissions(permissions: IResolvable)

    /**
     * @param permissions A list of resource permissions on the dataset.
     */
    public fun permissions(permissions: List<Any>)

    /**
     * @param permissions A list of resource permissions on the dataset.
     */
    public fun permissions(vararg permissions: Any)

    /**
     * @param physicalTableMap Declares the physical tables that are available in the underlying
     * data sources.
     */
    public fun physicalTableMap(physicalTableMap: IResolvable)

    /**
     * @param physicalTableMap Declares the physical tables that are available in the underlying
     * data sources.
     */
    public fun physicalTableMap(physicalTableMap: Map<String, Any>)

    /**
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     * want to create.
     */
    public fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: IResolvable)

    /**
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     * want to create.
     */
    public
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: CfnDataSet.RowLevelPermissionDataSetProperty)

    /**
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     * want to create.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51fa3948a50625f77a1d40d7c449907b848235af57823f7df6b9b5ef948188ed")
    public
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: CfnDataSet.RowLevelPermissionDataSetProperty.Builder.() -> Unit)

    /**
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     * row-level security.
     */
    public fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: IResolvable)

    /**
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     * row-level security.
     */
    public
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: CfnDataSet.RowLevelPermissionTagConfigurationProperty)

    /**
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     * row-level security.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd244518233a53088afb8cdeab556894298d1bb628c3c80a13b0fed2d5f3d448")
    public
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: CfnDataSet.RowLevelPermissionTagConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the dataset.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the dataset.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnDataSetProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnDataSetProps.builder()

    /**
     * @param awsAccountId The AWS account ID.
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     * features.
     * Currently, only geospatial hierarchy is supported.
     */
    override fun columnGroups(columnGroups: IResolvable) {
      cdkBuilder.columnGroups(columnGroups.let(IResolvable::unwrap))
    }

    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     * features.
     * Currently, only geospatial hierarchy is supported.
     */
    override fun columnGroups(columnGroups: List<Any>) {
      cdkBuilder.columnGroups(columnGroups)
    }

    /**
     * @param columnGroups Groupings of columns that work together in certain Amazon QuickSight
     * features.
     * Currently, only geospatial hierarchy is supported.
     */
    override fun columnGroups(vararg columnGroups: Any): Unit = columnGroups(columnGroups.toList())

    /**
     * @param columnLevelPermissionRules A set of one or more definitions of a
     * `ColumnLevelPermissionRule` .
     */
    override fun columnLevelPermissionRules(columnLevelPermissionRules: IResolvable) {
      cdkBuilder.columnLevelPermissionRules(columnLevelPermissionRules.let(IResolvable::unwrap))
    }

    /**
     * @param columnLevelPermissionRules A set of one or more definitions of a
     * `ColumnLevelPermissionRule` .
     */
    override fun columnLevelPermissionRules(columnLevelPermissionRules: List<Any>) {
      cdkBuilder.columnLevelPermissionRules(columnLevelPermissionRules)
    }

    /**
     * @param columnLevelPermissionRules A set of one or more definitions of a
     * `ColumnLevelPermissionRule` .
     */
    override fun columnLevelPermissionRules(vararg columnLevelPermissionRules: Any): Unit =
        columnLevelPermissionRules(columnLevelPermissionRules.toList())

    /**
     * @param dataSetId An ID for the dataset that you want to create.
     * This ID is unique per AWS Region for each AWS account.
     */
    override fun dataSetId(dataSetId: String) {
      cdkBuilder.dataSetId(dataSetId)
    }

    /**
     * @param dataSetRefreshProperties The refresh properties of a dataset.
     */
    override fun dataSetRefreshProperties(dataSetRefreshProperties: IResolvable) {
      cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties.let(IResolvable::unwrap))
    }

    /**
     * @param dataSetRefreshProperties The refresh properties of a dataset.
     */
    override
        fun dataSetRefreshProperties(dataSetRefreshProperties: CfnDataSet.DataSetRefreshPropertiesProperty) {
      cdkBuilder.dataSetRefreshProperties(dataSetRefreshProperties.let(CfnDataSet.DataSetRefreshPropertiesProperty::unwrap))
    }

    /**
     * @param dataSetRefreshProperties The refresh properties of a dataset.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9bf6e51c2eced831f27659eb6226e7c4b7a68b8348c99fc118b1a277d76122e")
    override
        fun dataSetRefreshProperties(dataSetRefreshProperties: CfnDataSet.DataSetRefreshPropertiesProperty.Builder.() -> Unit):
        Unit =
        dataSetRefreshProperties(CfnDataSet.DataSetRefreshPropertiesProperty(dataSetRefreshProperties))

    /**
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     * reference this dataset as a source.
     */
    override fun dataSetUsageConfiguration(dataSetUsageConfiguration: IResolvable) {
      cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     * reference this dataset as a source.
     */
    override
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: CfnDataSet.DataSetUsageConfigurationProperty) {
      cdkBuilder.dataSetUsageConfiguration(dataSetUsageConfiguration.let(CfnDataSet.DataSetUsageConfigurationProperty::unwrap))
    }

    /**
     * @param dataSetUsageConfiguration The usage configuration to apply to child datasets that
     * reference this dataset as a source.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8edc77fbe1e7b74e1f3faa2046cc61567c7d98fedc78585d7898fff2d261eac")
    override
        fun dataSetUsageConfiguration(dataSetUsageConfiguration: CfnDataSet.DataSetUsageConfigurationProperty.Builder.() -> Unit):
        Unit =
        dataSetUsageConfiguration(CfnDataSet.DataSetUsageConfigurationProperty(dataSetUsageConfiguration))

    /**
     * @param datasetParameters The parameters that are declared in a dataset.
     */
    override fun datasetParameters(datasetParameters: IResolvable) {
      cdkBuilder.datasetParameters(datasetParameters.let(IResolvable::unwrap))
    }

    /**
     * @param datasetParameters The parameters that are declared in a dataset.
     */
    override fun datasetParameters(datasetParameters: List<Any>) {
      cdkBuilder.datasetParameters(datasetParameters)
    }

    /**
     * @param datasetParameters The parameters that are declared in a dataset.
     */
    override fun datasetParameters(vararg datasetParameters: Any): Unit =
        datasetParameters(datasetParameters.toList())

    /**
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset.
     */
    override fun fieldFolders(fieldFolders: IResolvable) {
      cdkBuilder.fieldFolders(fieldFolders.let(IResolvable::unwrap))
    }

    /**
     * @param fieldFolders The folder that contains fields and nested subfolders for your dataset.
     */
    override fun fieldFolders(fieldFolders: Map<String, Any>) {
      cdkBuilder.fieldFolders(fieldFolders)
    }

    /**
     * @param importMode Indicates whether you want to import the data into SPICE.
     */
    override fun importMode(importMode: String) {
      cdkBuilder.importMode(importMode)
    }

    /**
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset.
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     */
    override fun ingestionWaitPolicy(ingestionWaitPolicy: IResolvable) {
      cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy.let(IResolvable::unwrap))
    }

    /**
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset.
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     */
    override fun ingestionWaitPolicy(ingestionWaitPolicy: CfnDataSet.IngestionWaitPolicyProperty) {
      cdkBuilder.ingestionWaitPolicy(ingestionWaitPolicy.let(CfnDataSet.IngestionWaitPolicyProperty::unwrap))
    }

    /**
     * @param ingestionWaitPolicy The wait policy to use when creating or updating a Dataset.
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1eee46827dc2cba7bd8af15c0df6fc1acec0cfef69d747f0ab21ea507e2ada08")
    override
        fun ingestionWaitPolicy(ingestionWaitPolicy: CfnDataSet.IngestionWaitPolicyProperty.Builder.() -> Unit):
        Unit = ingestionWaitPolicy(CfnDataSet.IngestionWaitPolicyProperty(ingestionWaitPolicy))

    /**
     * @param logicalTableMap Configures the combination and transformation of the data from the
     * physical tables.
     */
    override fun logicalTableMap(logicalTableMap: IResolvable) {
      cdkBuilder.logicalTableMap(logicalTableMap.let(IResolvable::unwrap))
    }

    /**
     * @param logicalTableMap Configures the combination and transformation of the data from the
     * physical tables.
     */
    override fun logicalTableMap(logicalTableMap: Map<String, Any>) {
      cdkBuilder.logicalTableMap(logicalTableMap)
    }

    /**
     * @param name The display name for the dataset.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param permissions A list of resource permissions on the dataset.
     */
    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    /**
     * @param permissions A list of resource permissions on the dataset.
     */
    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions)
    }

    /**
     * @param permissions A list of resource permissions on the dataset.
     */
    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    /**
     * @param physicalTableMap Declares the physical tables that are available in the underlying
     * data sources.
     */
    override fun physicalTableMap(physicalTableMap: IResolvable) {
      cdkBuilder.physicalTableMap(physicalTableMap.let(IResolvable::unwrap))
    }

    /**
     * @param physicalTableMap Declares the physical tables that are available in the underlying
     * data sources.
     */
    override fun physicalTableMap(physicalTableMap: Map<String, Any>) {
      cdkBuilder.physicalTableMap(physicalTableMap)
    }

    /**
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     * want to create.
     */
    override fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: IResolvable) {
      cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet.let(IResolvable::unwrap))
    }

    /**
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     * want to create.
     */
    override
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: CfnDataSet.RowLevelPermissionDataSetProperty) {
      cdkBuilder.rowLevelPermissionDataSet(rowLevelPermissionDataSet.let(CfnDataSet.RowLevelPermissionDataSetProperty::unwrap))
    }

    /**
     * @param rowLevelPermissionDataSet The row-level security configuration for the data that you
     * want to create.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51fa3948a50625f77a1d40d7c449907b848235af57823f7df6b9b5ef948188ed")
    override
        fun rowLevelPermissionDataSet(rowLevelPermissionDataSet: CfnDataSet.RowLevelPermissionDataSetProperty.Builder.() -> Unit):
        Unit =
        rowLevelPermissionDataSet(CfnDataSet.RowLevelPermissionDataSetProperty(rowLevelPermissionDataSet))

    /**
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     * row-level security.
     */
    override
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: IResolvable) {
      cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     * row-level security.
     */
    override
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: CfnDataSet.RowLevelPermissionTagConfigurationProperty) {
      cdkBuilder.rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration.let(CfnDataSet.RowLevelPermissionTagConfigurationProperty::unwrap))
    }

    /**
     * @param rowLevelPermissionTagConfiguration The element you can use to define tags for
     * row-level security.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd244518233a53088afb8cdeab556894298d1bb628c3c80a13b0fed2d5f3d448")
    override
        fun rowLevelPermissionTagConfiguration(rowLevelPermissionTagConfiguration: CfnDataSet.RowLevelPermissionTagConfigurationProperty.Builder.() -> Unit):
        Unit =
        rowLevelPermissionTagConfiguration(CfnDataSet.RowLevelPermissionTagConfigurationProperty(rowLevelPermissionTagConfiguration))

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the dataset.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the dataset.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSetProps,
  ) : CdkObject(cdkObject), CfnDataSetProps {
    /**
     * The AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-awsaccountid)
     */
    override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    /**
     * Groupings of columns that work together in certain Amazon QuickSight features.
     *
     * Currently, only geospatial hierarchy is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columngroups)
     */
    override fun columnGroups(): Any? = unwrap(this).getColumnGroups()

    /**
     * A set of one or more definitions of a `ColumnLevelPermissionRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-columnlevelpermissionrules)
     */
    override fun columnLevelPermissionRules(): Any? = unwrap(this).getColumnLevelPermissionRules()

    /**
     * An ID for the dataset that you want to create.
     *
     * This ID is unique per AWS Region for each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetid)
     */
    override fun dataSetId(): String? = unwrap(this).getDataSetId()

    /**
     * The refresh properties of a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetrefreshproperties)
     */
    override fun dataSetRefreshProperties(): Any? = unwrap(this).getDataSetRefreshProperties()

    /**
     * The usage configuration to apply to child datasets that reference this dataset as a source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetusageconfiguration)
     */
    override fun dataSetUsageConfiguration(): Any? = unwrap(this).getDataSetUsageConfiguration()

    /**
     * The parameters that are declared in a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-datasetparameters)
     */
    override fun datasetParameters(): Any? = unwrap(this).getDatasetParameters()

    /**
     * The folder that contains fields and nested subfolders for your dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-fieldfolders)
     */
    override fun fieldFolders(): Any? = unwrap(this).getFieldFolders()

    /**
     * Indicates whether you want to import the data into SPICE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-importmode)
     */
    override fun importMode(): String? = unwrap(this).getImportMode()

    /**
     * The wait policy to use when creating or updating a Dataset.
     *
     * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-ingestionwaitpolicy)
     */
    override fun ingestionWaitPolicy(): Any? = unwrap(this).getIngestionWaitPolicy()

    /**
     * Configures the combination and transformation of the data from the physical tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-logicaltablemap)
     */
    override fun logicalTableMap(): Any? = unwrap(this).getLogicalTableMap()

    /**
     * The display name for the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A list of resource permissions on the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-permissions)
     */
    override fun permissions(): Any? = unwrap(this).getPermissions()

    /**
     * Declares the physical tables that are available in the underlying data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-physicaltablemap)
     */
    override fun physicalTableMap(): Any? = unwrap(this).getPhysicalTableMap()

    /**
     * The row-level security configuration for the data that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiondataset)
     */
    override fun rowLevelPermissionDataSet(): Any? = unwrap(this).getRowLevelPermissionDataSet()

    /**
     * The element you can use to define tags for row-level security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-rowlevelpermissiontagconfiguration)
     */
    override fun rowLevelPermissionTagConfiguration(): Any? =
        unwrap(this).getRowLevelPermissionTagConfiguration()

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dataset.html#cfn-quicksight-dataset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSetProps):
        CfnDataSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataSetProps):
        software.amazon.awscdk.services.quicksight.CfnDataSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnDataSetProps
  }
}
