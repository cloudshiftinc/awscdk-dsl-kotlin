package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRecipe internal constructor(
  private val cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun steps(): Any = unwrap(this).getSteps()

  public open fun steps(`value`: IResolvable) {
    unwrap(this).setSteps(`value`.let(IResolvable::unwrap))
  }

  public open fun steps(__idx_ac66f0: List<Any>) {
    unwrap(this).setSteps(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun steps(steps: IResolvable)

    public fun steps(steps: List<Any>)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnRecipe.Builder =
        software.amazon.awscdk.services.databrew.CfnRecipe.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun steps(steps: IResolvable) {
      cdkBuilder.steps(steps.let(IResolvable::unwrap))
    }

    override fun steps(steps: List<Any>) {
      cdkBuilder.steps(steps)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.databrew.CfnRecipe = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRecipe {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRecipe(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe): CfnRecipe =
        CfnRecipe(cdkObject)

    internal fun unwrap(wrapped: CfnRecipe): software.amazon.awscdk.services.databrew.CfnRecipe =
        wrapped.cdkObject
  }

  public interface ConditionExpressionProperty {
    public fun condition(): String

    public fun targetColumn(): String

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun condition(condition: String)

      public fun targetColumn(targetColumn: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty.builder()

      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      override fun targetColumn(targetColumn: String) {
        cdkBuilder.targetColumn(targetColumn)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty,
    ) : ConditionExpressionProperty {
      override fun condition(): String = unwrap(this).getCondition()

      override fun targetColumn(): String = unwrap(this).getTargetColumn()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty):
          ConditionExpressionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionExpressionProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.ConditionExpressionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DataCatalogInputDefinitionProperty {
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun tableName(): String? = unwrap(this).getTableName()

    public fun tempDirectory(): Any? = unwrap(this).getTempDirectory()

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun databaseName(databaseName: String)

      public fun tableName(tableName: String)

      public fun tempDirectory(tempDirectory: IResolvable)

      public fun tempDirectory(tempDirectory: S3LocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01216e0c153f2b5ef6cea931fd5433362f7c657921c3971f3f891c489dd4bd77")
      public fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      override fun tempDirectory(tempDirectory: IResolvable) {
        cdkBuilder.tempDirectory(tempDirectory.let(IResolvable::unwrap))
      }

      override fun tempDirectory(tempDirectory: S3LocationProperty) {
        cdkBuilder.tempDirectory(tempDirectory.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01216e0c153f2b5ef6cea931fd5433362f7c657921c3971f3f891c489dd4bd77")
      override fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit): Unit =
          tempDirectory(S3LocationProperty(tempDirectory))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty,
    ) : DataCatalogInputDefinitionProperty {
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun tableName(): String? = unwrap(this).getTableName()

      override fun tempDirectory(): Any? = unwrap(this).getTempDirectory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataCatalogInputDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty):
          DataCatalogInputDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCatalogInputDefinitionProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.DataCatalogInputDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActionProperty {
    public fun operation(): String

    public fun parameters(): Any? = unwrap(this).getParameters()

    public interface Builder {
      public fun operation(operation: String)

      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty.builder()

      override fun operation(operation: String) {
        cdkBuilder.operation(operation)
      }

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty,
    ) : ActionProperty {
      override fun operation(): String = unwrap(this).getOperation()

      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3LocationProperty {
    public fun bucket(): String

    public fun key(): String? = unwrap(this).getKey()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty,
    ) : S3LocationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun key(): String? = unwrap(this).getKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.S3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InputProperty {
    public fun dataCatalogInputDefinition(): Any? = unwrap(this).getDataCatalogInputDefinition()

    public fun s3InputDefinition(): Any? = unwrap(this).getS3InputDefinition()

    public interface Builder {
      public fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable)

      public
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2c21a754f4292a4b713afb47e3f71ac9cb708e299806e2c7fc389941ea9360f")
      public
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty.Builder.() -> Unit)

      public fun s3InputDefinition(s3InputDefinition: IResolvable)

      public fun s3InputDefinition(s3InputDefinition: S3LocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d517f601e5d45fdc63b581e9a751819142d30d11fe69aef4b2e454711a7daa9")
      public fun s3InputDefinition(s3InputDefinition: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty.builder()

      override fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition.let(IResolvable::unwrap))
      }

      override
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition.let(DataCatalogInputDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2c21a754f4292a4b713afb47e3f71ac9cb708e299806e2c7fc389941ea9360f")
      override
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty.Builder.() -> Unit):
          Unit =
          dataCatalogInputDefinition(DataCatalogInputDefinitionProperty(dataCatalogInputDefinition))

      override fun s3InputDefinition(s3InputDefinition: IResolvable) {
        cdkBuilder.s3InputDefinition(s3InputDefinition.let(IResolvable::unwrap))
      }

      override fun s3InputDefinition(s3InputDefinition: S3LocationProperty) {
        cdkBuilder.s3InputDefinition(s3InputDefinition.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d517f601e5d45fdc63b581e9a751819142d30d11fe69aef4b2e454711a7daa9")
      override fun s3InputDefinition(s3InputDefinition: S3LocationProperty.Builder.() -> Unit): Unit
          = s3InputDefinition(S3LocationProperty(s3InputDefinition))

      public fun build(): software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty,
    ) : InputProperty {
      override fun dataCatalogInputDefinition(): Any? = unwrap(this).getDataCatalogInputDefinition()

      override fun s3InputDefinition(): Any? = unwrap(this).getS3InputDefinition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty):
          InputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.InputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RecipeParametersProperty {
    public fun aggregateFunction(): String? = unwrap(this).getAggregateFunction()

    public fun base(): String? = unwrap(this).getBase()

    public fun caseStatement(): String? = unwrap(this).getCaseStatement()

    public fun categoryMap(): String? = unwrap(this).getCategoryMap()

    public fun charsToRemove(): String? = unwrap(this).getCharsToRemove()

    public fun collapseConsecutiveWhitespace(): String? =
        unwrap(this).getCollapseConsecutiveWhitespace()

    public fun columnDataType(): String? = unwrap(this).getColumnDataType()

    public fun columnRange(): String? = unwrap(this).getColumnRange()

    public fun count(): String? = unwrap(this).getCount()

    public fun customCharacters(): String? = unwrap(this).getCustomCharacters()

    public fun customStopWords(): String? = unwrap(this).getCustomStopWords()

    public fun customValue(): String? = unwrap(this).getCustomValue()

    public fun datasetsColumns(): String? = unwrap(this).getDatasetsColumns()

    public fun dateAddValue(): String? = unwrap(this).getDateAddValue()

    public fun dateTimeFormat(): String? = unwrap(this).getDateTimeFormat()

    public fun dateTimeParameters(): String? = unwrap(this).getDateTimeParameters()

    public fun deleteOtherRows(): String? = unwrap(this).getDeleteOtherRows()

    public fun delimiter(): String? = unwrap(this).getDelimiter()

    public fun endPattern(): String? = unwrap(this).getEndPattern()

    public fun endPosition(): String? = unwrap(this).getEndPosition()

    public fun endValue(): String? = unwrap(this).getEndValue()

    public fun expandContractions(): String? = unwrap(this).getExpandContractions()

    public fun exponent(): String? = unwrap(this).getExponent()

    public fun falseString(): String? = unwrap(this).getFalseString()

    public fun groupByAggFunctionOptions(): String? = unwrap(this).getGroupByAggFunctionOptions()

    public fun groupByColumns(): String? = unwrap(this).getGroupByColumns()

    public fun hiddenColumns(): String? = unwrap(this).getHiddenColumns()

    public fun ignoreCase(): String? = unwrap(this).getIgnoreCase()

    public fun includeInSplit(): String? = unwrap(this).getIncludeInSplit()

    public fun input(): Any? = unwrap(this).getInput()

    public fun interval(): String? = unwrap(this).getInterval()

    public fun isText(): String? = unwrap(this).getIsText()

    public fun joinKeys(): String? = unwrap(this).getJoinKeys()

    public fun joinType(): String? = unwrap(this).getJoinType()

    public fun leftColumns(): String? = unwrap(this).getLeftColumns()

    public fun limit(): String? = unwrap(this).getLimit()

    public fun lowerBound(): String? = unwrap(this).getLowerBound()

    public fun mapType(): String? = unwrap(this).getMapType()

    public fun modeType(): String? = unwrap(this).getModeType()

    public fun multiLine(): Any? = unwrap(this).getMultiLine()

    public fun numRows(): String? = unwrap(this).getNumRows()

    public fun numRowsAfter(): String? = unwrap(this).getNumRowsAfter()

    public fun numRowsBefore(): String? = unwrap(this).getNumRowsBefore()

    public fun orderByColumn(): String? = unwrap(this).getOrderByColumn()

    public fun orderByColumns(): String? = unwrap(this).getOrderByColumns()

    public fun other(): String? = unwrap(this).getOther()

    public fun pattern(): String? = unwrap(this).getPattern()

    public fun patternOption1(): String? = unwrap(this).getPatternOption1()

    public fun patternOption2(): String? = unwrap(this).getPatternOption2()

    public fun patternOptions(): String? = unwrap(this).getPatternOptions()

    public fun period(): String? = unwrap(this).getPeriod()

    public fun position(): String? = unwrap(this).getPosition()

    public fun removeAllPunctuation(): String? = unwrap(this).getRemoveAllPunctuation()

    public fun removeAllQuotes(): String? = unwrap(this).getRemoveAllQuotes()

    public fun removeAllWhitespace(): String? = unwrap(this).getRemoveAllWhitespace()

    public fun removeCustomCharacters(): String? = unwrap(this).getRemoveCustomCharacters()

    public fun removeCustomValue(): String? = unwrap(this).getRemoveCustomValue()

    public fun removeLeadingAndTrailingPunctuation(): String? =
        unwrap(this).getRemoveLeadingAndTrailingPunctuation()

    public fun removeLeadingAndTrailingQuotes(): String? =
        unwrap(this).getRemoveLeadingAndTrailingQuotes()

    public fun removeLeadingAndTrailingWhitespace(): String? =
        unwrap(this).getRemoveLeadingAndTrailingWhitespace()

    public fun removeLetters(): String? = unwrap(this).getRemoveLetters()

    public fun removeNumbers(): String? = unwrap(this).getRemoveNumbers()

    public fun removeSourceColumn(): String? = unwrap(this).getRemoveSourceColumn()

    public fun removeSpecialCharacters(): String? = unwrap(this).getRemoveSpecialCharacters()

    public fun rightColumns(): String? = unwrap(this).getRightColumns()

    public fun sampleSize(): String? = unwrap(this).getSampleSize()

    public fun sampleType(): String? = unwrap(this).getSampleType()

    public fun secondInput(): String? = unwrap(this).getSecondInput()

    public fun secondaryInputs(): Any? = unwrap(this).getSecondaryInputs()

    public fun sheetIndexes(): Any? = unwrap(this).getSheetIndexes()

    public fun sheetNames(): List<String> = unwrap(this).getSheetNames() ?: emptyList()

    public fun sourceColumn(): String? = unwrap(this).getSourceColumn()

    public fun sourceColumn1(): String? = unwrap(this).getSourceColumn1()

    public fun sourceColumn2(): String? = unwrap(this).getSourceColumn2()

    public fun sourceColumns(): String? = unwrap(this).getSourceColumns()

    public fun startColumnIndex(): String? = unwrap(this).getStartColumnIndex()

    public fun startPattern(): String? = unwrap(this).getStartPattern()

    public fun startPosition(): String? = unwrap(this).getStartPosition()

    public fun startValue(): String? = unwrap(this).getStartValue()

    public fun stemmingMode(): String? = unwrap(this).getStemmingMode()

    public fun stepCount(): String? = unwrap(this).getStepCount()

    public fun stepIndex(): String? = unwrap(this).getStepIndex()

    public fun stopWordsMode(): String? = unwrap(this).getStopWordsMode()

    public fun strategy(): String? = unwrap(this).getStrategy()

    public fun targetColumn(): String? = unwrap(this).getTargetColumn()

    public fun targetColumnNames(): String? = unwrap(this).getTargetColumnNames()

    public fun targetDateFormat(): String? = unwrap(this).getTargetDateFormat()

    public fun targetIndex(): String? = unwrap(this).getTargetIndex()

    public fun timeZone(): String? = unwrap(this).getTimeZone()

    public fun tokenizerPattern(): String? = unwrap(this).getTokenizerPattern()

    public fun trueString(): String? = unwrap(this).getTrueString()

    public fun udfLang(): String? = unwrap(this).getUdfLang()

    public fun units(): String? = unwrap(this).getUnits()

    public fun unpivotColumn(): String? = unwrap(this).getUnpivotColumn()

    public fun upperBound(): String? = unwrap(this).getUpperBound()

    public fun useNewDataFrame(): String? = unwrap(this).getUseNewDataFrame()

    public fun `value`(): String? = unwrap(this).getValue()

    public fun value1(): String? = unwrap(this).getValue1()

    public fun value2(): String? = unwrap(this).getValue2()

    public fun valueColumn(): String? = unwrap(this).getValueColumn()

    public fun viewFrame(): String? = unwrap(this).getViewFrame()

    public interface Builder {
      public fun aggregateFunction(aggregateFunction: String)

      public fun base(base: String)

      public fun caseStatement(caseStatement: String)

      public fun categoryMap(categoryMap: String)

      public fun charsToRemove(charsToRemove: String)

      public fun collapseConsecutiveWhitespace(collapseConsecutiveWhitespace: String)

      public fun columnDataType(columnDataType: String)

      public fun columnRange(columnRange: String)

      public fun count(count: String)

      public fun customCharacters(customCharacters: String)

      public fun customStopWords(customStopWords: String)

      public fun customValue(customValue: String)

      public fun datasetsColumns(datasetsColumns: String)

      public fun dateAddValue(dateAddValue: String)

      public fun dateTimeFormat(dateTimeFormat: String)

      public fun dateTimeParameters(dateTimeParameters: String)

      public fun deleteOtherRows(deleteOtherRows: String)

      public fun delimiter(delimiter: String)

      public fun endPattern(endPattern: String)

      public fun endPosition(endPosition: String)

      public fun endValue(endValue: String)

      public fun expandContractions(expandContractions: String)

      public fun exponent(exponent: String)

      public fun falseString(falseString: String)

      public fun groupByAggFunctionOptions(groupByAggFunctionOptions: String)

      public fun groupByColumns(groupByColumns: String)

      public fun hiddenColumns(hiddenColumns: String)

      public fun ignoreCase(ignoreCase: String)

      public fun includeInSplit(includeInSplit: String)

      public fun input(input: Any)

      public fun interval(interval: String)

      public fun isText(isText: String)

      public fun joinKeys(joinKeys: String)

      public fun joinType(joinType: String)

      public fun leftColumns(leftColumns: String)

      public fun limit(limit: String)

      public fun lowerBound(lowerBound: String)

      public fun mapType(mapType: String)

      public fun modeType(modeType: String)

      public fun multiLine(multiLine: Boolean)

      public fun multiLine(multiLine: IResolvable)

      public fun numRows(numRows: String)

      public fun numRowsAfter(numRowsAfter: String)

      public fun numRowsBefore(numRowsBefore: String)

      public fun orderByColumn(orderByColumn: String)

      public fun orderByColumns(orderByColumns: String)

      public fun other(other: String)

      public fun pattern(pattern: String)

      public fun patternOption1(patternOption1: String)

      public fun patternOption2(patternOption2: String)

      public fun patternOptions(patternOptions: String)

      public fun period(period: String)

      public fun position(position: String)

      public fun removeAllPunctuation(removeAllPunctuation: String)

      public fun removeAllQuotes(removeAllQuotes: String)

      public fun removeAllWhitespace(removeAllWhitespace: String)

      public fun removeCustomCharacters(removeCustomCharacters: String)

      public fun removeCustomValue(removeCustomValue: String)

      public fun removeLeadingAndTrailingPunctuation(removeLeadingAndTrailingPunctuation: String)

      public fun removeLeadingAndTrailingQuotes(removeLeadingAndTrailingQuotes: String)

      public fun removeLeadingAndTrailingWhitespace(removeLeadingAndTrailingWhitespace: String)

      public fun removeLetters(removeLetters: String)

      public fun removeNumbers(removeNumbers: String)

      public fun removeSourceColumn(removeSourceColumn: String)

      public fun removeSpecialCharacters(removeSpecialCharacters: String)

      public fun rightColumns(rightColumns: String)

      public fun sampleSize(sampleSize: String)

      public fun sampleType(sampleType: String)

      public fun secondInput(secondInput: String)

      public fun secondaryInputs(secondaryInputs: IResolvable)

      public fun secondaryInputs(secondaryInputs: List<Any>)

      public fun sheetIndexes(sheetIndexes: IResolvable)

      public fun sheetIndexes(sheetIndexes: List<Number>)

      public fun sheetNames(sheetNames: List<String>)

      public fun sourceColumn(sourceColumn: String)

      public fun sourceColumn1(sourceColumn1: String)

      public fun sourceColumn2(sourceColumn2: String)

      public fun sourceColumns(sourceColumns: String)

      public fun startColumnIndex(startColumnIndex: String)

      public fun startPattern(startPattern: String)

      public fun startPosition(startPosition: String)

      public fun startValue(startValue: String)

      public fun stemmingMode(stemmingMode: String)

      public fun stepCount(stepCount: String)

      public fun stepIndex(stepIndex: String)

      public fun stopWordsMode(stopWordsMode: String)

      public fun strategy(strategy: String)

      public fun targetColumn(targetColumn: String)

      public fun targetColumnNames(targetColumnNames: String)

      public fun targetDateFormat(targetDateFormat: String)

      public fun targetIndex(targetIndex: String)

      public fun timeZone(timeZone: String)

      public fun tokenizerPattern(tokenizerPattern: String)

      public fun trueString(trueString: String)

      public fun udfLang(udfLang: String)

      public fun units(units: String)

      public fun unpivotColumn(unpivotColumn: String)

      public fun upperBound(upperBound: String)

      public fun useNewDataFrame(useNewDataFrame: String)

      public fun `value`(`value`: String)

      public fun value1(value1: String)

      public fun value2(value2: String)

      public fun valueColumn(valueColumn: String)

      public fun viewFrame(viewFrame: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty.builder()

      override fun aggregateFunction(aggregateFunction: String) {
        cdkBuilder.aggregateFunction(aggregateFunction)
      }

      override fun base(base: String) {
        cdkBuilder.base(base)
      }

      override fun caseStatement(caseStatement: String) {
        cdkBuilder.caseStatement(caseStatement)
      }

      override fun categoryMap(categoryMap: String) {
        cdkBuilder.categoryMap(categoryMap)
      }

      override fun charsToRemove(charsToRemove: String) {
        cdkBuilder.charsToRemove(charsToRemove)
      }

      override fun collapseConsecutiveWhitespace(collapseConsecutiveWhitespace: String) {
        cdkBuilder.collapseConsecutiveWhitespace(collapseConsecutiveWhitespace)
      }

      override fun columnDataType(columnDataType: String) {
        cdkBuilder.columnDataType(columnDataType)
      }

      override fun columnRange(columnRange: String) {
        cdkBuilder.columnRange(columnRange)
      }

      override fun count(count: String) {
        cdkBuilder.count(count)
      }

      override fun customCharacters(customCharacters: String) {
        cdkBuilder.customCharacters(customCharacters)
      }

      override fun customStopWords(customStopWords: String) {
        cdkBuilder.customStopWords(customStopWords)
      }

      override fun customValue(customValue: String) {
        cdkBuilder.customValue(customValue)
      }

      override fun datasetsColumns(datasetsColumns: String) {
        cdkBuilder.datasetsColumns(datasetsColumns)
      }

      override fun dateAddValue(dateAddValue: String) {
        cdkBuilder.dateAddValue(dateAddValue)
      }

      override fun dateTimeFormat(dateTimeFormat: String) {
        cdkBuilder.dateTimeFormat(dateTimeFormat)
      }

      override fun dateTimeParameters(dateTimeParameters: String) {
        cdkBuilder.dateTimeParameters(dateTimeParameters)
      }

      override fun deleteOtherRows(deleteOtherRows: String) {
        cdkBuilder.deleteOtherRows(deleteOtherRows)
      }

      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      override fun endPattern(endPattern: String) {
        cdkBuilder.endPattern(endPattern)
      }

      override fun endPosition(endPosition: String) {
        cdkBuilder.endPosition(endPosition)
      }

      override fun endValue(endValue: String) {
        cdkBuilder.endValue(endValue)
      }

      override fun expandContractions(expandContractions: String) {
        cdkBuilder.expandContractions(expandContractions)
      }

      override fun exponent(exponent: String) {
        cdkBuilder.exponent(exponent)
      }

      override fun falseString(falseString: String) {
        cdkBuilder.falseString(falseString)
      }

      override fun groupByAggFunctionOptions(groupByAggFunctionOptions: String) {
        cdkBuilder.groupByAggFunctionOptions(groupByAggFunctionOptions)
      }

      override fun groupByColumns(groupByColumns: String) {
        cdkBuilder.groupByColumns(groupByColumns)
      }

      override fun hiddenColumns(hiddenColumns: String) {
        cdkBuilder.hiddenColumns(hiddenColumns)
      }

      override fun ignoreCase(ignoreCase: String) {
        cdkBuilder.ignoreCase(ignoreCase)
      }

      override fun includeInSplit(includeInSplit: String) {
        cdkBuilder.includeInSplit(includeInSplit)
      }

      override fun input(input: Any) {
        cdkBuilder.input(input)
      }

      override fun interval(interval: String) {
        cdkBuilder.interval(interval)
      }

      override fun isText(isText: String) {
        cdkBuilder.isText(isText)
      }

      override fun joinKeys(joinKeys: String) {
        cdkBuilder.joinKeys(joinKeys)
      }

      override fun joinType(joinType: String) {
        cdkBuilder.joinType(joinType)
      }

      override fun leftColumns(leftColumns: String) {
        cdkBuilder.leftColumns(leftColumns)
      }

      override fun limit(limit: String) {
        cdkBuilder.limit(limit)
      }

      override fun lowerBound(lowerBound: String) {
        cdkBuilder.lowerBound(lowerBound)
      }

      override fun mapType(mapType: String) {
        cdkBuilder.mapType(mapType)
      }

      override fun modeType(modeType: String) {
        cdkBuilder.modeType(modeType)
      }

      override fun multiLine(multiLine: Boolean) {
        cdkBuilder.multiLine(multiLine)
      }

      override fun multiLine(multiLine: IResolvable) {
        cdkBuilder.multiLine(multiLine.let(IResolvable::unwrap))
      }

      override fun numRows(numRows: String) {
        cdkBuilder.numRows(numRows)
      }

      override fun numRowsAfter(numRowsAfter: String) {
        cdkBuilder.numRowsAfter(numRowsAfter)
      }

      override fun numRowsBefore(numRowsBefore: String) {
        cdkBuilder.numRowsBefore(numRowsBefore)
      }

      override fun orderByColumn(orderByColumn: String) {
        cdkBuilder.orderByColumn(orderByColumn)
      }

      override fun orderByColumns(orderByColumns: String) {
        cdkBuilder.orderByColumns(orderByColumns)
      }

      override fun other(other: String) {
        cdkBuilder.other(other)
      }

      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      override fun patternOption1(patternOption1: String) {
        cdkBuilder.patternOption1(patternOption1)
      }

      override fun patternOption2(patternOption2: String) {
        cdkBuilder.patternOption2(patternOption2)
      }

      override fun patternOptions(patternOptions: String) {
        cdkBuilder.patternOptions(patternOptions)
      }

      override fun period(period: String) {
        cdkBuilder.period(period)
      }

      override fun position(position: String) {
        cdkBuilder.position(position)
      }

      override fun removeAllPunctuation(removeAllPunctuation: String) {
        cdkBuilder.removeAllPunctuation(removeAllPunctuation)
      }

      override fun removeAllQuotes(removeAllQuotes: String) {
        cdkBuilder.removeAllQuotes(removeAllQuotes)
      }

      override fun removeAllWhitespace(removeAllWhitespace: String) {
        cdkBuilder.removeAllWhitespace(removeAllWhitespace)
      }

      override fun removeCustomCharacters(removeCustomCharacters: String) {
        cdkBuilder.removeCustomCharacters(removeCustomCharacters)
      }

      override fun removeCustomValue(removeCustomValue: String) {
        cdkBuilder.removeCustomValue(removeCustomValue)
      }

      override
          fun removeLeadingAndTrailingPunctuation(removeLeadingAndTrailingPunctuation: String) {
        cdkBuilder.removeLeadingAndTrailingPunctuation(removeLeadingAndTrailingPunctuation)
      }

      override fun removeLeadingAndTrailingQuotes(removeLeadingAndTrailingQuotes: String) {
        cdkBuilder.removeLeadingAndTrailingQuotes(removeLeadingAndTrailingQuotes)
      }

      override fun removeLeadingAndTrailingWhitespace(removeLeadingAndTrailingWhitespace: String) {
        cdkBuilder.removeLeadingAndTrailingWhitespace(removeLeadingAndTrailingWhitespace)
      }

      override fun removeLetters(removeLetters: String) {
        cdkBuilder.removeLetters(removeLetters)
      }

      override fun removeNumbers(removeNumbers: String) {
        cdkBuilder.removeNumbers(removeNumbers)
      }

      override fun removeSourceColumn(removeSourceColumn: String) {
        cdkBuilder.removeSourceColumn(removeSourceColumn)
      }

      override fun removeSpecialCharacters(removeSpecialCharacters: String) {
        cdkBuilder.removeSpecialCharacters(removeSpecialCharacters)
      }

      override fun rightColumns(rightColumns: String) {
        cdkBuilder.rightColumns(rightColumns)
      }

      override fun sampleSize(sampleSize: String) {
        cdkBuilder.sampleSize(sampleSize)
      }

      override fun sampleType(sampleType: String) {
        cdkBuilder.sampleType(sampleType)
      }

      override fun secondInput(secondInput: String) {
        cdkBuilder.secondInput(secondInput)
      }

      override fun secondaryInputs(secondaryInputs: IResolvable) {
        cdkBuilder.secondaryInputs(secondaryInputs.let(IResolvable::unwrap))
      }

      override fun secondaryInputs(secondaryInputs: List<Any>) {
        cdkBuilder.secondaryInputs(secondaryInputs)
      }

      override fun sheetIndexes(sheetIndexes: IResolvable) {
        cdkBuilder.sheetIndexes(sheetIndexes.let(IResolvable::unwrap))
      }

      override fun sheetIndexes(sheetIndexes: List<Number>) {
        cdkBuilder.sheetIndexes(sheetIndexes)
      }

      override fun sheetNames(sheetNames: List<String>) {
        cdkBuilder.sheetNames(sheetNames)
      }

      override fun sourceColumn(sourceColumn: String) {
        cdkBuilder.sourceColumn(sourceColumn)
      }

      override fun sourceColumn1(sourceColumn1: String) {
        cdkBuilder.sourceColumn1(sourceColumn1)
      }

      override fun sourceColumn2(sourceColumn2: String) {
        cdkBuilder.sourceColumn2(sourceColumn2)
      }

      override fun sourceColumns(sourceColumns: String) {
        cdkBuilder.sourceColumns(sourceColumns)
      }

      override fun startColumnIndex(startColumnIndex: String) {
        cdkBuilder.startColumnIndex(startColumnIndex)
      }

      override fun startPattern(startPattern: String) {
        cdkBuilder.startPattern(startPattern)
      }

      override fun startPosition(startPosition: String) {
        cdkBuilder.startPosition(startPosition)
      }

      override fun startValue(startValue: String) {
        cdkBuilder.startValue(startValue)
      }

      override fun stemmingMode(stemmingMode: String) {
        cdkBuilder.stemmingMode(stemmingMode)
      }

      override fun stepCount(stepCount: String) {
        cdkBuilder.stepCount(stepCount)
      }

      override fun stepIndex(stepIndex: String) {
        cdkBuilder.stepIndex(stepIndex)
      }

      override fun stopWordsMode(stopWordsMode: String) {
        cdkBuilder.stopWordsMode(stopWordsMode)
      }

      override fun strategy(strategy: String) {
        cdkBuilder.strategy(strategy)
      }

      override fun targetColumn(targetColumn: String) {
        cdkBuilder.targetColumn(targetColumn)
      }

      override fun targetColumnNames(targetColumnNames: String) {
        cdkBuilder.targetColumnNames(targetColumnNames)
      }

      override fun targetDateFormat(targetDateFormat: String) {
        cdkBuilder.targetDateFormat(targetDateFormat)
      }

      override fun targetIndex(targetIndex: String) {
        cdkBuilder.targetIndex(targetIndex)
      }

      override fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
      }

      override fun tokenizerPattern(tokenizerPattern: String) {
        cdkBuilder.tokenizerPattern(tokenizerPattern)
      }

      override fun trueString(trueString: String) {
        cdkBuilder.trueString(trueString)
      }

      override fun udfLang(udfLang: String) {
        cdkBuilder.udfLang(udfLang)
      }

      override fun units(units: String) {
        cdkBuilder.units(units)
      }

      override fun unpivotColumn(unpivotColumn: String) {
        cdkBuilder.unpivotColumn(unpivotColumn)
      }

      override fun upperBound(upperBound: String) {
        cdkBuilder.upperBound(upperBound)
      }

      override fun useNewDataFrame(useNewDataFrame: String) {
        cdkBuilder.useNewDataFrame(useNewDataFrame)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      override fun value1(value1: String) {
        cdkBuilder.value1(value1)
      }

      override fun value2(value2: String) {
        cdkBuilder.value2(value2)
      }

      override fun valueColumn(valueColumn: String) {
        cdkBuilder.valueColumn(valueColumn)
      }

      override fun viewFrame(viewFrame: String) {
        cdkBuilder.viewFrame(viewFrame)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty,
    ) : RecipeParametersProperty {
      override fun aggregateFunction(): String? = unwrap(this).getAggregateFunction()

      override fun base(): String? = unwrap(this).getBase()

      override fun caseStatement(): String? = unwrap(this).getCaseStatement()

      override fun categoryMap(): String? = unwrap(this).getCategoryMap()

      override fun charsToRemove(): String? = unwrap(this).getCharsToRemove()

      override fun collapseConsecutiveWhitespace(): String? =
          unwrap(this).getCollapseConsecutiveWhitespace()

      override fun columnDataType(): String? = unwrap(this).getColumnDataType()

      override fun columnRange(): String? = unwrap(this).getColumnRange()

      override fun count(): String? = unwrap(this).getCount()

      override fun customCharacters(): String? = unwrap(this).getCustomCharacters()

      override fun customStopWords(): String? = unwrap(this).getCustomStopWords()

      override fun customValue(): String? = unwrap(this).getCustomValue()

      override fun datasetsColumns(): String? = unwrap(this).getDatasetsColumns()

      override fun dateAddValue(): String? = unwrap(this).getDateAddValue()

      override fun dateTimeFormat(): String? = unwrap(this).getDateTimeFormat()

      override fun dateTimeParameters(): String? = unwrap(this).getDateTimeParameters()

      override fun deleteOtherRows(): String? = unwrap(this).getDeleteOtherRows()

      override fun delimiter(): String? = unwrap(this).getDelimiter()

      override fun endPattern(): String? = unwrap(this).getEndPattern()

      override fun endPosition(): String? = unwrap(this).getEndPosition()

      override fun endValue(): String? = unwrap(this).getEndValue()

      override fun expandContractions(): String? = unwrap(this).getExpandContractions()

      override fun exponent(): String? = unwrap(this).getExponent()

      override fun falseString(): String? = unwrap(this).getFalseString()

      override fun groupByAggFunctionOptions(): String? =
          unwrap(this).getGroupByAggFunctionOptions()

      override fun groupByColumns(): String? = unwrap(this).getGroupByColumns()

      override fun hiddenColumns(): String? = unwrap(this).getHiddenColumns()

      override fun ignoreCase(): String? = unwrap(this).getIgnoreCase()

      override fun includeInSplit(): String? = unwrap(this).getIncludeInSplit()

      override fun input(): Any? = unwrap(this).getInput()

      override fun interval(): String? = unwrap(this).getInterval()

      override fun isText(): String? = unwrap(this).getIsText()

      override fun joinKeys(): String? = unwrap(this).getJoinKeys()

      override fun joinType(): String? = unwrap(this).getJoinType()

      override fun leftColumns(): String? = unwrap(this).getLeftColumns()

      override fun limit(): String? = unwrap(this).getLimit()

      override fun lowerBound(): String? = unwrap(this).getLowerBound()

      override fun mapType(): String? = unwrap(this).getMapType()

      override fun modeType(): String? = unwrap(this).getModeType()

      override fun multiLine(): Any? = unwrap(this).getMultiLine()

      override fun numRows(): String? = unwrap(this).getNumRows()

      override fun numRowsAfter(): String? = unwrap(this).getNumRowsAfter()

      override fun numRowsBefore(): String? = unwrap(this).getNumRowsBefore()

      override fun orderByColumn(): String? = unwrap(this).getOrderByColumn()

      override fun orderByColumns(): String? = unwrap(this).getOrderByColumns()

      override fun other(): String? = unwrap(this).getOther()

      override fun pattern(): String? = unwrap(this).getPattern()

      override fun patternOption1(): String? = unwrap(this).getPatternOption1()

      override fun patternOption2(): String? = unwrap(this).getPatternOption2()

      override fun patternOptions(): String? = unwrap(this).getPatternOptions()

      override fun period(): String? = unwrap(this).getPeriod()

      override fun position(): String? = unwrap(this).getPosition()

      override fun removeAllPunctuation(): String? = unwrap(this).getRemoveAllPunctuation()

      override fun removeAllQuotes(): String? = unwrap(this).getRemoveAllQuotes()

      override fun removeAllWhitespace(): String? = unwrap(this).getRemoveAllWhitespace()

      override fun removeCustomCharacters(): String? = unwrap(this).getRemoveCustomCharacters()

      override fun removeCustomValue(): String? = unwrap(this).getRemoveCustomValue()

      override fun removeLeadingAndTrailingPunctuation(): String? =
          unwrap(this).getRemoveLeadingAndTrailingPunctuation()

      override fun removeLeadingAndTrailingQuotes(): String? =
          unwrap(this).getRemoveLeadingAndTrailingQuotes()

      override fun removeLeadingAndTrailingWhitespace(): String? =
          unwrap(this).getRemoveLeadingAndTrailingWhitespace()

      override fun removeLetters(): String? = unwrap(this).getRemoveLetters()

      override fun removeNumbers(): String? = unwrap(this).getRemoveNumbers()

      override fun removeSourceColumn(): String? = unwrap(this).getRemoveSourceColumn()

      override fun removeSpecialCharacters(): String? = unwrap(this).getRemoveSpecialCharacters()

      override fun rightColumns(): String? = unwrap(this).getRightColumns()

      override fun sampleSize(): String? = unwrap(this).getSampleSize()

      override fun sampleType(): String? = unwrap(this).getSampleType()

      override fun secondInput(): String? = unwrap(this).getSecondInput()

      override fun secondaryInputs(): Any? = unwrap(this).getSecondaryInputs()

      override fun sheetIndexes(): Any? = unwrap(this).getSheetIndexes()

      override fun sheetNames(): List<String> = unwrap(this).getSheetNames() ?: emptyList()

      override fun sourceColumn(): String? = unwrap(this).getSourceColumn()

      override fun sourceColumn1(): String? = unwrap(this).getSourceColumn1()

      override fun sourceColumn2(): String? = unwrap(this).getSourceColumn2()

      override fun sourceColumns(): String? = unwrap(this).getSourceColumns()

      override fun startColumnIndex(): String? = unwrap(this).getStartColumnIndex()

      override fun startPattern(): String? = unwrap(this).getStartPattern()

      override fun startPosition(): String? = unwrap(this).getStartPosition()

      override fun startValue(): String? = unwrap(this).getStartValue()

      override fun stemmingMode(): String? = unwrap(this).getStemmingMode()

      override fun stepCount(): String? = unwrap(this).getStepCount()

      override fun stepIndex(): String? = unwrap(this).getStepIndex()

      override fun stopWordsMode(): String? = unwrap(this).getStopWordsMode()

      override fun strategy(): String? = unwrap(this).getStrategy()

      override fun targetColumn(): String? = unwrap(this).getTargetColumn()

      override fun targetColumnNames(): String? = unwrap(this).getTargetColumnNames()

      override fun targetDateFormat(): String? = unwrap(this).getTargetDateFormat()

      override fun targetIndex(): String? = unwrap(this).getTargetIndex()

      override fun timeZone(): String? = unwrap(this).getTimeZone()

      override fun tokenizerPattern(): String? = unwrap(this).getTokenizerPattern()

      override fun trueString(): String? = unwrap(this).getTrueString()

      override fun udfLang(): String? = unwrap(this).getUdfLang()

      override fun units(): String? = unwrap(this).getUnits()

      override fun unpivotColumn(): String? = unwrap(this).getUnpivotColumn()

      override fun upperBound(): String? = unwrap(this).getUpperBound()

      override fun useNewDataFrame(): String? = unwrap(this).getUseNewDataFrame()

      override fun `value`(): String? = unwrap(this).getValue()

      override fun value1(): String? = unwrap(this).getValue1()

      override fun value2(): String? = unwrap(this).getValue2()

      override fun valueColumn(): String? = unwrap(this).getValueColumn()

      override fun viewFrame(): String? = unwrap(this).getViewFrame()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecipeParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty):
          RecipeParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecipeParametersProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SecondaryInputProperty {
    public fun dataCatalogInputDefinition(): Any? = unwrap(this).getDataCatalogInputDefinition()

    public fun s3InputDefinition(): Any? = unwrap(this).getS3InputDefinition()

    public interface Builder {
      public fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable)

      public
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07da4ac2449a81015b910b3e9adc3ab24c1dc9965866359eb1600c78a9eda524")
      public
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty.Builder.() -> Unit)

      public fun s3InputDefinition(s3InputDefinition: IResolvable)

      public fun s3InputDefinition(s3InputDefinition: S3LocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d4ac9f8d0cc6f72eaea2c632b63ce2f084a2c189df00c23b3a1ddc4cdc0e152")
      public fun s3InputDefinition(s3InputDefinition: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty.builder()

      override fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition.let(IResolvable::unwrap))
      }

      override
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition.let(DataCatalogInputDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07da4ac2449a81015b910b3e9adc3ab24c1dc9965866359eb1600c78a9eda524")
      override
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty.Builder.() -> Unit):
          Unit =
          dataCatalogInputDefinition(DataCatalogInputDefinitionProperty(dataCatalogInputDefinition))

      override fun s3InputDefinition(s3InputDefinition: IResolvable) {
        cdkBuilder.s3InputDefinition(s3InputDefinition.let(IResolvable::unwrap))
      }

      override fun s3InputDefinition(s3InputDefinition: S3LocationProperty) {
        cdkBuilder.s3InputDefinition(s3InputDefinition.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d4ac9f8d0cc6f72eaea2c632b63ce2f084a2c189df00c23b3a1ddc4cdc0e152")
      override fun s3InputDefinition(s3InputDefinition: S3LocationProperty.Builder.() -> Unit): Unit
          = s3InputDefinition(S3LocationProperty(s3InputDefinition))

      public fun build(): software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty,
    ) : SecondaryInputProperty {
      override fun dataCatalogInputDefinition(): Any? = unwrap(this).getDataCatalogInputDefinition()

      override fun s3InputDefinition(): Any? = unwrap(this).getS3InputDefinition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SecondaryInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty):
          SecondaryInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecondaryInputProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.SecondaryInputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RecipeStepProperty {
    public fun action(): Any

    public fun conditionExpressions(): Any? = unwrap(this).getConditionExpressions()

    public interface Builder {
      public fun action(action: IResolvable)

      public fun action(action: ActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e33849bae2cbbf4f460c44579da2fd3f982b69f92ef618ebb5cbc5a812ea5611")
      public fun action(action: ActionProperty.Builder.() -> Unit)

      public fun conditionExpressions(conditionExpressions: IResolvable)

      public fun conditionExpressions(conditionExpressions: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty.builder()

      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      override fun action(action: ActionProperty) {
        cdkBuilder.action(action.let(ActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e33849bae2cbbf4f460c44579da2fd3f982b69f92ef618ebb5cbc5a812ea5611")
      override fun action(action: ActionProperty.Builder.() -> Unit): Unit =
          action(ActionProperty(action))

      override fun conditionExpressions(conditionExpressions: IResolvable) {
        cdkBuilder.conditionExpressions(conditionExpressions.let(IResolvable::unwrap))
      }

      override fun conditionExpressions(conditionExpressions: List<Any>) {
        cdkBuilder.conditionExpressions(conditionExpressions)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty,
    ) : RecipeStepProperty {
      override fun action(): Any = unwrap(this).getAction()

      override fun conditionExpressions(): Any? = unwrap(this).getConditionExpressions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecipeStepProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty):
          RecipeStepProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecipeStepProperty):
          software.amazon.awscdk.services.databrew.CfnRecipe.RecipeStepProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}