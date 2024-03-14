package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataQualityRuleset internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnDataQualityRuleset,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid
   * creating or starting multiple instances of the same resource.
   */
  public open fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid
   * creating or starting multiple instances of the same resource.
   */
  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  /**
   * A description of the data quality ruleset.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the data quality ruleset.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the data quality ruleset.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the data quality ruleset.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A Data Quality Definition Language (DQDL) ruleset.
   */
  public open fun ruleset(): String? = unwrap(this).getRuleset()

  /**
   * A Data Quality Definition Language (DQDL) ruleset.
   */
  public open fun ruleset(`value`: String) {
    unwrap(this).setRuleset(`value`)
  }

  /**
   * A list of tags applied to the data quality ruleset.
   */
  public open fun tags(): Any? = unwrap(this).getTags()

  /**
   * A list of tags applied to the data quality ruleset.
   */
  public open fun tags(`value`: Any) {
    unwrap(this).setTags(`value`)
  }

  /**
   * An object representing an AWS Glue table.
   */
  public open fun targetTable(): Any? = unwrap(this).getTargetTable()

  /**
   * An object representing an AWS Glue table.
   */
  public open fun targetTable(`value`: IResolvable) {
    unwrap(this).setTargetTable(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object representing an AWS Glue table.
   */
  public open fun targetTable(`value`: DataQualityTargetTableProperty) {
    unwrap(this).setTargetTable(`value`.let(DataQualityTargetTableProperty::unwrap))
  }

  /**
   * An object representing an AWS Glue table.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e0af79cecc806cfa4653b571f3e17a5500c5e03ca84b4cb157cf31f941ec204")
  public open fun targetTable(`value`: DataQualityTargetTableProperty.Builder.() -> Unit): Unit =
      targetTable(DataQualityTargetTableProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnDataQualityRuleset].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid
     * creating or starting multiple instances of the same resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-clienttoken)
     * @param clientToken Used for idempotency and is recommended to be set to a random ID (such as
     * a UUID) to avoid creating or starting multiple instances of the same resource. 
     */
    public fun clientToken(clientToken: String)

    /**
     * A description of the data quality ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-description)
     * @param description A description of the data quality ruleset. 
     */
    public fun description(description: String)

    /**
     * The name of the data quality ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-name)
     * @param name The name of the data quality ruleset. 
     */
    public fun name(name: String)

    /**
     * A Data Quality Definition Language (DQDL) ruleset.
     *
     * For more information see the AWS Glue Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-ruleset)
     * @param ruleset A Data Quality Definition Language (DQDL) ruleset. 
     */
    public fun ruleset(ruleset: String)

    /**
     * A list of tags applied to the data quality ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-tags)
     * @param tags A list of tags applied to the data quality ruleset. 
     */
    public fun tags(tags: Any)

    /**
     * An object representing an AWS Glue table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-targettable)
     * @param targetTable An object representing an AWS Glue table. 
     */
    public fun targetTable(targetTable: IResolvable)

    /**
     * An object representing an AWS Glue table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-targettable)
     * @param targetTable An object representing an AWS Glue table. 
     */
    public fun targetTable(targetTable: DataQualityTargetTableProperty)

    /**
     * An object representing an AWS Glue table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-targettable)
     * @param targetTable An object representing an AWS Glue table. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d1c2f10db8f3a409fb5d22a6fb506a0411855f3941cbc59f934a4c87a94eb52")
    public fun targetTable(targetTable: DataQualityTargetTableProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDataQualityRuleset.Builder =
        software.amazon.awscdk.services.glue.CfnDataQualityRuleset.Builder.create(scope, id)

    /**
     * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid
     * creating or starting multiple instances of the same resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-clienttoken)
     * @param clientToken Used for idempotency and is recommended to be set to a random ID (such as
     * a UUID) to avoid creating or starting multiple instances of the same resource. 
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * A description of the data quality ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-description)
     * @param description A description of the data quality ruleset. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the data quality ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-name)
     * @param name The name of the data quality ruleset. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A Data Quality Definition Language (DQDL) ruleset.
     *
     * For more information see the AWS Glue Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-ruleset)
     * @param ruleset A Data Quality Definition Language (DQDL) ruleset. 
     */
    override fun ruleset(ruleset: String) {
      cdkBuilder.ruleset(ruleset)
    }

    /**
     * A list of tags applied to the data quality ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-tags)
     * @param tags A list of tags applied to the data quality ruleset. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * An object representing an AWS Glue table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-targettable)
     * @param targetTable An object representing an AWS Glue table. 
     */
    override fun targetTable(targetTable: IResolvable) {
      cdkBuilder.targetTable(targetTable.let(IResolvable::unwrap))
    }

    /**
     * An object representing an AWS Glue table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-targettable)
     * @param targetTable An object representing an AWS Glue table. 
     */
    override fun targetTable(targetTable: DataQualityTargetTableProperty) {
      cdkBuilder.targetTable(targetTable.let(DataQualityTargetTableProperty::unwrap))
    }

    /**
     * An object representing an AWS Glue table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-targettable)
     * @param targetTable An object representing an AWS Glue table. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d1c2f10db8f3a409fb5d22a6fb506a0411855f3941cbc59f934a4c87a94eb52")
    override fun targetTable(targetTable: DataQualityTargetTableProperty.Builder.() -> Unit): Unit =
        targetTable(DataQualityTargetTableProperty(targetTable))

    public fun build(): software.amazon.awscdk.services.glue.CfnDataQualityRuleset =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnDataQualityRuleset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataQualityRuleset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataQualityRuleset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataQualityRuleset):
        CfnDataQualityRuleset = CfnDataQualityRuleset(cdkObject)

    internal fun unwrap(wrapped: CfnDataQualityRuleset):
        software.amazon.awscdk.services.glue.CfnDataQualityRuleset = wrapped.cdkObject
  }

  public interface DataQualityTargetTableProperty {
    /**
     * The name of the database where the AWS Glue table exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-dataqualityruleset-dataqualitytargettable.html#cfn-glue-dataqualityruleset-dataqualitytargettable-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * The name of the AWS Glue table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-dataqualityruleset-dataqualitytargettable.html#cfn-glue-dataqualityruleset-dataqualitytargettable-tablename)
     */
    public fun tableName(): String? = unwrap(this).getTableName()

    /**
     * A builder for [DataQualityTargetTableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseName The name of the database where the AWS Glue table exists.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param tableName The name of the AWS Glue table.
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty.builder()

      /**
       * @param databaseName The name of the database where the AWS Glue table exists.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param tableName The name of the AWS Glue table.
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty,
    ) : CdkObject(cdkObject), DataQualityTargetTableProperty {
      /**
       * The name of the database where the AWS Glue table exists.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-dataqualityruleset-dataqualitytargettable.html#cfn-glue-dataqualityruleset-dataqualitytargettable-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * The name of the AWS Glue table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-dataqualityruleset-dataqualitytargettable.html#cfn-glue-dataqualityruleset-dataqualitytargettable-tablename)
       */
      override fun tableName(): String? = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataQualityTargetTableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty):
          DataQualityTargetTableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataQualityTargetTableProperty):
          software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDataQualityRuleset.DataQualityTargetTableProperty
    }
  }
}
