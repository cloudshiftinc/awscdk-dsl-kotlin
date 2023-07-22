@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnDataset
import software.amazon.awscdk.services.personalize.CfnDatasetGroup
import software.amazon.awscdk.services.personalize.CfnDatasetGroupProps
import software.amazon.awscdk.services.personalize.CfnDatasetProps
import software.amazon.awscdk.services.personalize.CfnSchema
import software.amazon.awscdk.services.personalize.CfnSchemaProps
import software.amazon.awscdk.services.personalize.CfnSolution
import software.amazon.awscdk.services.personalize.CfnSolutionProps
import software.constructs.Construct

public object personalize {
  /**
   * Creates an empty dataset and adds it to the specified dataset group.
   *
   * Use
   * [CreateDatasetImportJob](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetImportJob.html)
   * to import your training data to a dataset.
   *
   * There are three types of datasets:
   *
   * * Interactions
   * * Items
   * * Users
   *
   * Each dataset type has an associated schema with required field types. Only the `Interactions`
   * dataset is required in order to train a model (also referred to as creating a solution).
   *
   * A dataset can be in one of the following states:
   *
   * * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
   * * DELETE PENDING &gt; DELETE IN_PROGRESS
   *
   * To get the status of the dataset, call
   * [DescribeDataset](https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDataset.html) .
   *
   * **Related APIs** -
   * [CreateDatasetGroup](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetGroup.html)
   *
   * * [ListDatasets](https://docs.aws.amazon.com/personalize/latest/dg/API_ListDatasets.html)
   * * [DescribeDataset](https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDataset.html)
   * * [DeleteDataset](https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteDataset.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * Object dataSource;
   * CfnDataset cfnDataset = CfnDataset.Builder.create(this, "MyCfnDataset")
   * .datasetGroupArn("datasetGroupArn")
   * .datasetType("datasetType")
   * .name("name")
   * .schemaArn("schemaArn")
   * // the properties below are optional
   * .datasetImportJob(DatasetImportJobProperty.builder()
   * .datasetArn("datasetArn")
   * .datasetImportJobArn("datasetImportJobArn")
   * .dataSource(dataSource)
   * .jobName("jobName")
   * .roleArn("roleArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html)
   */
  public inline fun cfnDataset(
    scope: Construct,
    id: String,
    block: CfnDatasetDsl.() -> Unit = {},
  ): CfnDataset {
    val builder = CfnDatasetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The Amazon S3 bucket that contains the training data to import.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * DataSourceProperty dataSourceProperty = DataSourceProperty.builder()
   * .dataLocation("dataLocation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasource.html)
   */
  public inline fun cfnDatasetDataSourceProperty(block: CfnDatasetDataSourcePropertyDsl.() -> Unit =
      {}): CfnDataset.DataSourceProperty {
    val builder = CfnDatasetDataSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
   * Personalize dataset.
   *
   * For more information, see
   * [CreateDatasetImportJob](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetImportJob.html)
   * .
   *
   * A dataset import job can be in one of the following states:
   *
   * * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * Object dataSource;
   * DatasetImportJobProperty datasetImportJobProperty = DatasetImportJobProperty.builder()
   * .datasetArn("datasetArn")
   * .datasetImportJobArn("datasetImportJobArn")
   * .dataSource(dataSource)
   * .jobName("jobName")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-dataset-datasetimportjob.html)
   */
  public inline
      fun cfnDatasetDatasetImportJobProperty(block: CfnDatasetDatasetImportJobPropertyDsl.() -> Unit
      = {}): CfnDataset.DatasetImportJobProperty {
    val builder = CfnDatasetDatasetImportJobPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A dataset group is a collection of related datasets (Interactions, User, and Item).
   *
   * You create a dataset group by calling
   * [CreateDatasetGroup](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetGroup.html)
   * . You then create a dataset and add it to a dataset group by calling
   * [CreateDataset](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html) . The
   * dataset group is used to create and train a solution by calling
   * [CreateSolution](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html) . A
   * dataset group can contain only one of each type of dataset.
   *
   * You can specify an AWS Key Management Service (KMS) key to encrypt the datasets in the group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * CfnDatasetGroup cfnDatasetGroup = CfnDatasetGroup.Builder.create(this, "MyCfnDatasetGroup")
   * .name("name")
   * // the properties below are optional
   * .domain("domain")
   * .kmsKeyArn("kmsKeyArn")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html)
   */
  public inline fun cfnDatasetGroup(
    scope: Construct,
    id: String,
    block: CfnDatasetGroupDsl.() -> Unit = {},
  ): CfnDatasetGroup {
    val builder = CfnDatasetGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnDatasetGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * CfnDatasetGroupProps cfnDatasetGroupProps = CfnDatasetGroupProps.builder()
   * .name("name")
   * // the properties below are optional
   * .domain("domain")
   * .kmsKeyArn("kmsKeyArn")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html)
   */
  public inline fun cfnDatasetGroupProps(block: CfnDatasetGroupPropsDsl.() -> Unit = {}):
      CfnDatasetGroupProps {
    val builder = CfnDatasetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnDataset`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * Object dataSource;
   * CfnDatasetProps cfnDatasetProps = CfnDatasetProps.builder()
   * .datasetGroupArn("datasetGroupArn")
   * .datasetType("datasetType")
   * .name("name")
   * .schemaArn("schemaArn")
   * // the properties below are optional
   * .datasetImportJob(DatasetImportJobProperty.builder()
   * .datasetArn("datasetArn")
   * .datasetImportJobArn("datasetImportJobArn")
   * .dataSource(dataSource)
   * .jobName("jobName")
   * .roleArn("roleArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html)
   */
  public inline fun cfnDatasetProps(block: CfnDatasetPropsDsl.() -> Unit = {}): CfnDatasetProps {
    val builder = CfnDatasetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates an Amazon Personalize schema from the specified schema string.
   *
   * The schema you create must be in Avro JSON format.
   *
   * Amazon Personalize recognizes three schema variants. Each schema is associated with a dataset
   * type and has a set of required field and keywords. If you are creating a schema for a dataset in a
   * Domain dataset group, you provide the domain of the Domain dataset group. You specify a schema
   * when you call
   * [CreateDataset](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html) .
   *
   * For more information on schemas, see [Datasets and
   * schemas](https://docs.aws.amazon.com/personalize/latest/dg/how-it-works-dataset-schema.html) .
   *
   * **Related APIs** -
   * [ListSchemas](https://docs.aws.amazon.com/personalize/latest/dg/API_ListSchemas.html)
   *
   * * [DescribeSchema](https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSchema.html)
   * * [DeleteSchema](https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteSchema.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * CfnSchema cfnSchema = CfnSchema.Builder.create(this, "MyCfnSchema")
   * .name("name")
   * .schema("schema")
   * // the properties below are optional
   * .domain("domain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html)
   */
  public inline fun cfnSchema(
    scope: Construct,
    id: String,
    block: CfnSchemaDsl.() -> Unit = {},
  ): CfnSchema {
    val builder = CfnSchemaDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSchema`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * CfnSchemaProps cfnSchemaProps = CfnSchemaProps.builder()
   * .name("name")
   * .schema("schema")
   * // the properties below are optional
   * .domain("domain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html)
   */
  public inline fun cfnSchemaProps(block: CfnSchemaPropsDsl.() -> Unit = {}): CfnSchemaProps {
    val builder = CfnSchemaPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that provides information about a solution.
   *
   * A solution is a trained model that can be deployed as a campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * Object autoMlConfig;
   * Object hpoConfig;
   * CfnSolution cfnSolution = CfnSolution.Builder.create(this, "MyCfnSolution")
   * .datasetGroupArn("datasetGroupArn")
   * .name("name")
   * // the properties below are optional
   * .eventType("eventType")
   * .performAutoMl(false)
   * .performHpo(false)
   * .recipeArn("recipeArn")
   * .solutionConfig(SolutionConfigProperty.builder()
   * .algorithmHyperParameters(Map.of(
   * "algorithmHyperParametersKey", "algorithmHyperParameters"))
   * .autoMlConfig(autoMlConfig)
   * .eventValueThreshold("eventValueThreshold")
   * .featureTransformationParameters(Map.of(
   * "featureTransformationParametersKey", "featureTransformationParameters"))
   * .hpoConfig(hpoConfig)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html)
   */
  public inline fun cfnSolution(
    scope: Construct,
    id: String,
    block: CfnSolutionDsl.() -> Unit = {},
  ): CfnSolution {
    val builder = CfnSolutionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The hyperparameters and their allowable ranges.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * AlgorithmHyperParameterRangesProperty algorithmHyperParameterRangesProperty =
   * AlgorithmHyperParameterRangesProperty.builder()
   * .categoricalHyperParameterRanges(List.of(CategoricalHyperParameterRangeProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build()))
   * .continuousHyperParameterRanges(List.of(ContinuousHyperParameterRangeProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * .name("name")
   * .build()))
   * .integerHyperParameterRanges(List.of(IntegerHyperParameterRangeProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * .name("name")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-algorithmhyperparameterranges.html)
   */
  public inline
      fun cfnSolutionAlgorithmHyperParameterRangesProperty(block: CfnSolutionAlgorithmHyperParameterRangesPropertyDsl.() -> Unit
      = {}): CfnSolution.AlgorithmHyperParameterRangesProperty {
    val builder = CfnSolutionAlgorithmHyperParameterRangesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The AutoMLConfig object containing a list of recipes to search when AutoML is performed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * AutoMLConfigProperty autoMLConfigProperty = AutoMLConfigProperty.builder()
   * .metricName("metricName")
   * .recipeList(List.of("recipeList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-automlconfig.html)
   */
  public inline
      fun cfnSolutionAutoMLConfigProperty(block: CfnSolutionAutoMLConfigPropertyDsl.() -> Unit =
      {}): CfnSolution.AutoMLConfigProperty {
    val builder = CfnSolutionAutoMLConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Provides the name and values of a Categorical hyperparameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * CategoricalHyperParameterRangeProperty categoricalHyperParameterRangeProperty =
   * CategoricalHyperParameterRangeProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-categoricalhyperparameterrange.html)
   */
  public inline
      fun cfnSolutionCategoricalHyperParameterRangeProperty(block: CfnSolutionCategoricalHyperParameterRangePropertyDsl.() -> Unit
      = {}): CfnSolution.CategoricalHyperParameterRangeProperty {
    val builder = CfnSolutionCategoricalHyperParameterRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Provides the name and range of a continuous hyperparameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * ContinuousHyperParameterRangeProperty continuousHyperParameterRangeProperty =
   * ContinuousHyperParameterRangeProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-continuoushyperparameterrange.html)
   */
  public inline
      fun cfnSolutionContinuousHyperParameterRangeProperty(block: CfnSolutionContinuousHyperParameterRangePropertyDsl.() -> Unit
      = {}): CfnSolution.ContinuousHyperParameterRangeProperty {
    val builder = CfnSolutionContinuousHyperParameterRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes the properties for hyperparameter optimization (HPO).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * HpoConfigProperty hpoConfigProperty = HpoConfigProperty.builder()
   * .algorithmHyperParameterRanges(AlgorithmHyperParameterRangesProperty.builder()
   * .categoricalHyperParameterRanges(List.of(CategoricalHyperParameterRangeProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build()))
   * .continuousHyperParameterRanges(List.of(ContinuousHyperParameterRangeProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * .name("name")
   * .build()))
   * .integerHyperParameterRanges(List.of(IntegerHyperParameterRangeProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * .name("name")
   * .build()))
   * .build())
   * .hpoObjective(HpoObjectiveProperty.builder()
   * .metricName("metricName")
   * .metricRegex("metricRegex")
   * .type("type")
   * .build())
   * .hpoResourceConfig(HpoResourceConfigProperty.builder()
   * .maxNumberOfTrainingJobs("maxNumberOfTrainingJobs")
   * .maxParallelTrainingJobs("maxParallelTrainingJobs")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoconfig.html)
   */
  public inline fun cfnSolutionHpoConfigProperty(block: CfnSolutionHpoConfigPropertyDsl.() -> Unit =
      {}): CfnSolution.HpoConfigProperty {
    val builder = CfnSolutionHpoConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The metric to optimize during HPO.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * HpoObjectiveProperty hpoObjectiveProperty = HpoObjectiveProperty.builder()
   * .metricName("metricName")
   * .metricRegex("metricRegex")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoobjective.html)
   */
  public inline
      fun cfnSolutionHpoObjectiveProperty(block: CfnSolutionHpoObjectivePropertyDsl.() -> Unit =
      {}): CfnSolution.HpoObjectiveProperty {
    val builder = CfnSolutionHpoObjectivePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes the resource configuration for hyperparameter optimization (HPO).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * HpoResourceConfigProperty hpoResourceConfigProperty = HpoResourceConfigProperty.builder()
   * .maxNumberOfTrainingJobs("maxNumberOfTrainingJobs")
   * .maxParallelTrainingJobs("maxParallelTrainingJobs")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hporesourceconfig.html)
   */
  public inline
      fun cfnSolutionHpoResourceConfigProperty(block: CfnSolutionHpoResourceConfigPropertyDsl.() -> Unit
      = {}): CfnSolution.HpoResourceConfigProperty {
    val builder = CfnSolutionHpoResourceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Provides the name and range of an integer-valued hyperparameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * IntegerHyperParameterRangeProperty integerHyperParameterRangeProperty =
   * IntegerHyperParameterRangeProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-integerhyperparameterrange.html)
   */
  public inline
      fun cfnSolutionIntegerHyperParameterRangeProperty(block: CfnSolutionIntegerHyperParameterRangePropertyDsl.() -> Unit
      = {}): CfnSolution.IntegerHyperParameterRangeProperty {
    val builder = CfnSolutionIntegerHyperParameterRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSolution`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * Object autoMlConfig;
   * Object hpoConfig;
   * CfnSolutionProps cfnSolutionProps = CfnSolutionProps.builder()
   * .datasetGroupArn("datasetGroupArn")
   * .name("name")
   * // the properties below are optional
   * .eventType("eventType")
   * .performAutoMl(false)
   * .performHpo(false)
   * .recipeArn("recipeArn")
   * .solutionConfig(SolutionConfigProperty.builder()
   * .algorithmHyperParameters(Map.of(
   * "algorithmHyperParametersKey", "algorithmHyperParameters"))
   * .autoMlConfig(autoMlConfig)
   * .eventValueThreshold("eventValueThreshold")
   * .featureTransformationParameters(Map.of(
   * "featureTransformationParametersKey", "featureTransformationParameters"))
   * .hpoConfig(hpoConfig)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html)
   */
  public inline fun cfnSolutionProps(block: CfnSolutionPropsDsl.() -> Unit = {}): CfnSolutionProps {
    val builder = CfnSolutionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes the configuration properties for the solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.personalize.*;
   * Object autoMlConfig;
   * Object hpoConfig;
   * SolutionConfigProperty solutionConfigProperty = SolutionConfigProperty.builder()
   * .algorithmHyperParameters(Map.of(
   * "algorithmHyperParametersKey", "algorithmHyperParameters"))
   * .autoMlConfig(autoMlConfig)
   * .eventValueThreshold("eventValueThreshold")
   * .featureTransformationParameters(Map.of(
   * "featureTransformationParametersKey", "featureTransformationParameters"))
   * .hpoConfig(hpoConfig)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html)
   */
  public inline
      fun cfnSolutionSolutionConfigProperty(block: CfnSolutionSolutionConfigPropertyDsl.() -> Unit =
      {}): CfnSolution.SolutionConfigProperty {
    val builder = CfnSolutionSolutionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
