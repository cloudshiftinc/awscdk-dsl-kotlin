package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnTableProps {
  /**
   * The ID of the Data Catalog in which to create the `Table` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid)
   */
  public fun catalogId(): String

  /**
   * The name of the database where the table metadata resides.
   *
   * For Hive compatibility, this must be all lowercase.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename)
   */
  public fun databaseName(): String

  /**
   * Specifies an `OpenTableFormatInput` structure when creating an open format table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-opentableformatinput)
   */
  public fun openTableFormatInput(): Any? = unwrap(this).getOpenTableFormatInput()

  /**
   * A structure used to define a table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
   */
  public fun tableInput(): Any

  /**
   * A builder for [CfnTableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param catalogId The ID of the Data Catalog in which to create the `Table` . 
     */
    public fun catalogId(catalogId: String)

    /**
     * @param databaseName The name of the database where the table metadata resides. 
     * For Hive compatibility, this must be all lowercase.
     */
    public fun databaseName(databaseName: String)

    /**
     * @param openTableFormatInput Specifies an `OpenTableFormatInput` structure when creating an
     * open format table.
     */
    public fun openTableFormatInput(openTableFormatInput: IResolvable)

    /**
     * @param openTableFormatInput Specifies an `OpenTableFormatInput` structure when creating an
     * open format table.
     */
    public fun openTableFormatInput(openTableFormatInput: CfnTable.OpenTableFormatInputProperty)

    /**
     * @param openTableFormatInput Specifies an `OpenTableFormatInput` structure when creating an
     * open format table.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01f235bf0a53055ce97d121ace788757a4a27b13e570816d3ddd47c0c3664c25")
    public
        fun openTableFormatInput(openTableFormatInput: CfnTable.OpenTableFormatInputProperty.Builder.() -> Unit)

    /**
     * @param tableInput A structure used to define a table. 
     */
    public fun tableInput(tableInput: IResolvable)

    /**
     * @param tableInput A structure used to define a table. 
     */
    public fun tableInput(tableInput: CfnTable.TableInputProperty)

    /**
     * @param tableInput A structure used to define a table. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79055d6ca86f70c323755ae20b8465fcc2d5f57eda405e2de0830a81695767ae")
    public fun tableInput(tableInput: CfnTable.TableInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTableProps.Builder =
        software.amazon.awscdk.services.glue.CfnTableProps.builder()

    /**
     * @param catalogId The ID of the Data Catalog in which to create the `Table` . 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param databaseName The name of the database where the table metadata resides. 
     * For Hive compatibility, this must be all lowercase.
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param openTableFormatInput Specifies an `OpenTableFormatInput` structure when creating an
     * open format table.
     */
    override fun openTableFormatInput(openTableFormatInput: IResolvable) {
      cdkBuilder.openTableFormatInput(openTableFormatInput.let(IResolvable::unwrap))
    }

    /**
     * @param openTableFormatInput Specifies an `OpenTableFormatInput` structure when creating an
     * open format table.
     */
    override fun openTableFormatInput(openTableFormatInput: CfnTable.OpenTableFormatInputProperty) {
      cdkBuilder.openTableFormatInput(openTableFormatInput.let(CfnTable.OpenTableFormatInputProperty::unwrap))
    }

    /**
     * @param openTableFormatInput Specifies an `OpenTableFormatInput` structure when creating an
     * open format table.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01f235bf0a53055ce97d121ace788757a4a27b13e570816d3ddd47c0c3664c25")
    override
        fun openTableFormatInput(openTableFormatInput: CfnTable.OpenTableFormatInputProperty.Builder.() -> Unit):
        Unit = openTableFormatInput(CfnTable.OpenTableFormatInputProperty(openTableFormatInput))

    /**
     * @param tableInput A structure used to define a table. 
     */
    override fun tableInput(tableInput: IResolvable) {
      cdkBuilder.tableInput(tableInput.let(IResolvable::unwrap))
    }

    /**
     * @param tableInput A structure used to define a table. 
     */
    override fun tableInput(tableInput: CfnTable.TableInputProperty) {
      cdkBuilder.tableInput(tableInput.let(CfnTable.TableInputProperty::unwrap))
    }

    /**
     * @param tableInput A structure used to define a table. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79055d6ca86f70c323755ae20b8465fcc2d5f57eda405e2de0830a81695767ae")
    override fun tableInput(tableInput: CfnTable.TableInputProperty.Builder.() -> Unit): Unit =
        tableInput(CfnTable.TableInputProperty(tableInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnTableProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnTableProps,
  ) : CdkObject(cdkObject), CfnTableProps {
    /**
     * The ID of the Data Catalog in which to create the `Table` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid)
     */
    override fun catalogId(): String = unwrap(this).getCatalogId()

    /**
     * The name of the database where the table metadata resides.
     *
     * For Hive compatibility, this must be all lowercase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename)
     */
    override fun databaseName(): String = unwrap(this).getDatabaseName()

    /**
     * Specifies an `OpenTableFormatInput` structure when creating an open format table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-opentableformatinput)
     */
    override fun openTableFormatInput(): Any? = unwrap(this).getOpenTableFormatInput()

    /**
     * A structure used to define a table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
     */
    override fun tableInput(): Any = unwrap(this).getTableInput()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTableProps): CfnTableProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTableProps): software.amazon.awscdk.services.glue.CfnTableProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTableProps
  }
}
