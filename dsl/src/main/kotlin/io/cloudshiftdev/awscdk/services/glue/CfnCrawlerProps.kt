package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCrawlerProps {
  /**
   * A list of UTF-8 strings that specify the names of custom classifiers that are associated with
   * the crawler.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers)
   */
  public fun classifiers(): List<String> = unwrap(this).getClassifiers() ?: emptyList()

  /**
   * Crawler configuration information.
   *
   * This versioned JSON string allows users to specify aspects of a crawler's behavior. For more
   * information, see [Configuring a
   * Crawler](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration)
   */
  public fun configuration(): String? = unwrap(this).getConfiguration()

  /**
   * The name of the `SecurityConfiguration` structure to be used by this crawler.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-crawlersecurityconfiguration)
   */
  public fun crawlerSecurityConfiguration(): String? =
      unwrap(this).getCrawlerSecurityConfiguration()

  /**
   * The name of the database in which the crawler's output is stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename)
   */
  public fun databaseName(): String? = unwrap(this).getDatabaseName()

  /**
   * A description of the crawler.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the crawler.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
   * that were added since the last crawler run.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-recrawlpolicy)
   */
  public fun recrawlPolicy(): Any? = unwrap(this).getRecrawlPolicy()

  /**
   * The Amazon Resource Name (ARN) of an IAM role that's used to access customer resources, such as
   * Amazon Simple Storage Service (Amazon S3) data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role)
   */
  public fun role(): String

  /**
   * For scheduled crawlers, the schedule when the crawler runs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
   */
  public fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * The policy that specifies update and delete behaviors for the crawler.
   *
   * The policy tells the crawler what to do in the event that it detects a change in a table that
   * already exists in the customer's database at the time of the crawl. The `SchemaChangePolicy` does
   * not affect whether or how new tables and partitions are added. New tables and partitions are
   * always created regardless of the `SchemaChangePolicy` on a crawler.
   *
   * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schemachangepolicy)
   */
  public fun schemaChangePolicy(): Any? = unwrap(this).getSchemaChangePolicy()

  /**
   * The prefix added to the names of tables that are created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix)
   */
  public fun tablePrefix(): String? = unwrap(this).getTablePrefix()

  /**
   * The tags to use with this crawler.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A collection of targets to crawl.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
   */
  public fun targets(): Any

  /**
   * A builder for [CfnCrawlerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param classifiers A list of UTF-8 strings that specify the names of custom classifiers that
     * are associated with the crawler.
     */
    public fun classifiers(classifiers: List<String>)

    /**
     * @param classifiers A list of UTF-8 strings that specify the names of custom classifiers that
     * are associated with the crawler.
     */
    public fun classifiers(vararg classifiers: String)

    /**
     * @param configuration Crawler configuration information.
     * This versioned JSON string allows users to specify aspects of a crawler's behavior. For more
     * information, see [Configuring a
     * Crawler](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html) .
     */
    public fun configuration(configuration: String)

    /**
     * @param crawlerSecurityConfiguration The name of the `SecurityConfiguration` structure to be
     * used by this crawler.
     */
    public fun crawlerSecurityConfiguration(crawlerSecurityConfiguration: String)

    /**
     * @param databaseName The name of the database in which the crawler's output is stored.
     */
    public fun databaseName(databaseName: String)

    /**
     * @param description A description of the crawler.
     */
    public fun description(description: String)

    /**
     * @param name The name of the crawler.
     */
    public fun name(name: String)

    /**
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     * crawl only folders that were added since the last crawler run.
     */
    public fun recrawlPolicy(recrawlPolicy: IResolvable)

    /**
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     * crawl only folders that were added since the last crawler run.
     */
    public fun recrawlPolicy(recrawlPolicy: CfnCrawler.RecrawlPolicyProperty)

    /**
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     * crawl only folders that were added since the last crawler run.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00fafccc921a42e918189ca7bbe2e5878273b6f4ba995cdc403a900164ed5f13")
    public fun recrawlPolicy(recrawlPolicy: CfnCrawler.RecrawlPolicyProperty.Builder.() -> Unit)

    /**
     * @param role The Amazon Resource Name (ARN) of an IAM role that's used to access customer
     * resources, such as Amazon Simple Storage Service (Amazon S3) data. 
     */
    public fun role(role: String)

    /**
     * @param schedule For scheduled crawlers, the schedule when the crawler runs.
     */
    public fun schedule(schedule: IResolvable)

    /**
     * @param schedule For scheduled crawlers, the schedule when the crawler runs.
     */
    public fun schedule(schedule: CfnCrawler.ScheduleProperty)

    /**
     * @param schedule For scheduled crawlers, the schedule when the crawler runs.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f53ad6b835d6e9c3a7aed497e70ab6a240cb960792c1f6ffd5ca3ea4fe4c29a")
    public fun schedule(schedule: CfnCrawler.ScheduleProperty.Builder.() -> Unit)

    /**
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     * crawler.
     * The policy tells the crawler what to do in the event that it detects a change in a table that
     * already exists in the customer's database at the time of the crawl. The `SchemaChangePolicy`
     * does not affect whether or how new tables and partitions are added. New tables and partitions
     * are always created regardless of the `SchemaChangePolicy` on a crawler.
     *
     * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
     */
    public fun schemaChangePolicy(schemaChangePolicy: IResolvable)

    /**
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     * crawler.
     * The policy tells the crawler what to do in the event that it detects a change in a table that
     * already exists in the customer's database at the time of the crawl. The `SchemaChangePolicy`
     * does not affect whether or how new tables and partitions are added. New tables and partitions
     * are always created regardless of the `SchemaChangePolicy` on a crawler.
     *
     * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
     */
    public fun schemaChangePolicy(schemaChangePolicy: CfnCrawler.SchemaChangePolicyProperty)

    /**
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     * crawler.
     * The policy tells the crawler what to do in the event that it detects a change in a table that
     * already exists in the customer's database at the time of the crawl. The `SchemaChangePolicy`
     * does not affect whether or how new tables and partitions are added. New tables and partitions
     * are always created regardless of the `SchemaChangePolicy` on a crawler.
     *
     * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e321b78f263ba19d1986c5aa4b054e4fd0646a81e6d1690010437ea093643eb1")
    public
        fun schemaChangePolicy(schemaChangePolicy: CfnCrawler.SchemaChangePolicyProperty.Builder.() -> Unit)

    /**
     * @param tablePrefix The prefix added to the names of tables that are created.
     */
    public fun tablePrefix(tablePrefix: String)

    /**
     * @param tags The tags to use with this crawler.
     */
    public fun tags(tags: Any)

    /**
     * @param targets A collection of targets to crawl. 
     */
    public fun targets(targets: IResolvable)

    /**
     * @param targets A collection of targets to crawl. 
     */
    public fun targets(targets: CfnCrawler.TargetsProperty)

    /**
     * @param targets A collection of targets to crawl. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cf831b43bbde48b01205bcd7adb62a65674aed6667bef5112a6c900306bbbcc")
    public fun targets(targets: CfnCrawler.TargetsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnCrawlerProps.Builder =
        software.amazon.awscdk.services.glue.CfnCrawlerProps.builder()

    /**
     * @param classifiers A list of UTF-8 strings that specify the names of custom classifiers that
     * are associated with the crawler.
     */
    override fun classifiers(classifiers: List<String>) {
      cdkBuilder.classifiers(classifiers)
    }

    /**
     * @param classifiers A list of UTF-8 strings that specify the names of custom classifiers that
     * are associated with the crawler.
     */
    override fun classifiers(vararg classifiers: String): Unit = classifiers(classifiers.toList())

    /**
     * @param configuration Crawler configuration information.
     * This versioned JSON string allows users to specify aspects of a crawler's behavior. For more
     * information, see [Configuring a
     * Crawler](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html) .
     */
    override fun configuration(configuration: String) {
      cdkBuilder.configuration(configuration)
    }

    /**
     * @param crawlerSecurityConfiguration The name of the `SecurityConfiguration` structure to be
     * used by this crawler.
     */
    override fun crawlerSecurityConfiguration(crawlerSecurityConfiguration: String) {
      cdkBuilder.crawlerSecurityConfiguration(crawlerSecurityConfiguration)
    }

    /**
     * @param databaseName The name of the database in which the crawler's output is stored.
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param description A description of the crawler.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the crawler.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     * crawl only folders that were added since the last crawler run.
     */
    override fun recrawlPolicy(recrawlPolicy: IResolvable) {
      cdkBuilder.recrawlPolicy(recrawlPolicy.let(IResolvable::unwrap))
    }

    /**
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     * crawl only folders that were added since the last crawler run.
     */
    override fun recrawlPolicy(recrawlPolicy: CfnCrawler.RecrawlPolicyProperty) {
      cdkBuilder.recrawlPolicy(recrawlPolicy.let(CfnCrawler.RecrawlPolicyProperty::unwrap))
    }

    /**
     * @param recrawlPolicy A policy that specifies whether to crawl the entire dataset again, or to
     * crawl only folders that were added since the last crawler run.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00fafccc921a42e918189ca7bbe2e5878273b6f4ba995cdc403a900164ed5f13")
    override fun recrawlPolicy(recrawlPolicy: CfnCrawler.RecrawlPolicyProperty.Builder.() -> Unit):
        Unit = recrawlPolicy(CfnCrawler.RecrawlPolicyProperty(recrawlPolicy))

    /**
     * @param role The Amazon Resource Name (ARN) of an IAM role that's used to access customer
     * resources, such as Amazon Simple Storage Service (Amazon S3) data. 
     */
    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    /**
     * @param schedule For scheduled crawlers, the schedule when the crawler runs.
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    /**
     * @param schedule For scheduled crawlers, the schedule when the crawler runs.
     */
    override fun schedule(schedule: CfnCrawler.ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnCrawler.ScheduleProperty::unwrap))
    }

    /**
     * @param schedule For scheduled crawlers, the schedule when the crawler runs.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f53ad6b835d6e9c3a7aed497e70ab6a240cb960792c1f6ffd5ca3ea4fe4c29a")
    override fun schedule(schedule: CfnCrawler.ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(CfnCrawler.ScheduleProperty(schedule))

    /**
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     * crawler.
     * The policy tells the crawler what to do in the event that it detects a change in a table that
     * already exists in the customer's database at the time of the crawl. The `SchemaChangePolicy`
     * does not affect whether or how new tables and partitions are added. New tables and partitions
     * are always created regardless of the `SchemaChangePolicy` on a crawler.
     *
     * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
     */
    override fun schemaChangePolicy(schemaChangePolicy: IResolvable) {
      cdkBuilder.schemaChangePolicy(schemaChangePolicy.let(IResolvable::unwrap))
    }

    /**
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     * crawler.
     * The policy tells the crawler what to do in the event that it detects a change in a table that
     * already exists in the customer's database at the time of the crawl. The `SchemaChangePolicy`
     * does not affect whether or how new tables and partitions are added. New tables and partitions
     * are always created regardless of the `SchemaChangePolicy` on a crawler.
     *
     * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
     */
    override fun schemaChangePolicy(schemaChangePolicy: CfnCrawler.SchemaChangePolicyProperty) {
      cdkBuilder.schemaChangePolicy(schemaChangePolicy.let(CfnCrawler.SchemaChangePolicyProperty::unwrap))
    }

    /**
     * @param schemaChangePolicy The policy that specifies update and delete behaviors for the
     * crawler.
     * The policy tells the crawler what to do in the event that it detects a change in a table that
     * already exists in the customer's database at the time of the crawl. The `SchemaChangePolicy`
     * does not affect whether or how new tables and partitions are added. New tables and partitions
     * are always created regardless of the `SchemaChangePolicy` on a crawler.
     *
     * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e321b78f263ba19d1986c5aa4b054e4fd0646a81e6d1690010437ea093643eb1")
    override
        fun schemaChangePolicy(schemaChangePolicy: CfnCrawler.SchemaChangePolicyProperty.Builder.() -> Unit):
        Unit = schemaChangePolicy(CfnCrawler.SchemaChangePolicyProperty(schemaChangePolicy))

    /**
     * @param tablePrefix The prefix added to the names of tables that are created.
     */
    override fun tablePrefix(tablePrefix: String) {
      cdkBuilder.tablePrefix(tablePrefix)
    }

    /**
     * @param tags The tags to use with this crawler.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param targets A collection of targets to crawl. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * @param targets A collection of targets to crawl. 
     */
    override fun targets(targets: CfnCrawler.TargetsProperty) {
      cdkBuilder.targets(targets.let(CfnCrawler.TargetsProperty::unwrap))
    }

    /**
     * @param targets A collection of targets to crawl. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cf831b43bbde48b01205bcd7adb62a65674aed6667bef5112a6c900306bbbcc")
    override fun targets(targets: CfnCrawler.TargetsProperty.Builder.() -> Unit): Unit =
        targets(CfnCrawler.TargetsProperty(targets))

    public fun build(): software.amazon.awscdk.services.glue.CfnCrawlerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnCrawlerProps,
  ) : CdkObject(cdkObject), CfnCrawlerProps {
    /**
     * A list of UTF-8 strings that specify the names of custom classifiers that are associated with
     * the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-classifiers)
     */
    override fun classifiers(): List<String> = unwrap(this).getClassifiers() ?: emptyList()

    /**
     * Crawler configuration information.
     *
     * This versioned JSON string allows users to specify aspects of a crawler's behavior. For more
     * information, see [Configuring a
     * Crawler](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-configuration)
     */
    override fun configuration(): String? = unwrap(this).getConfiguration()

    /**
     * The name of the `SecurityConfiguration` structure to be used by this crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-crawlersecurityconfiguration)
     */
    override fun crawlerSecurityConfiguration(): String? =
        unwrap(this).getCrawlerSecurityConfiguration()

    /**
     * The name of the database in which the crawler's output is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-databasename)
     */
    override fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * A description of the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders
     * that were added since the last crawler run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-recrawlpolicy)
     */
    override fun recrawlPolicy(): Any? = unwrap(this).getRecrawlPolicy()

    /**
     * The Amazon Resource Name (ARN) of an IAM role that's used to access customer resources, such
     * as Amazon Simple Storage Service (Amazon S3) data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-role)
     */
    override fun role(): String = unwrap(this).getRole()

    /**
     * For scheduled crawlers, the schedule when the crawler runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schedule)
     */
    override fun schedule(): Any? = unwrap(this).getSchedule()

    /**
     * The policy that specifies update and delete behaviors for the crawler.
     *
     * The policy tells the crawler what to do in the event that it detects a change in a table that
     * already exists in the customer's database at the time of the crawl. The `SchemaChangePolicy`
     * does not affect whether or how new tables and partitions are added. New tables and partitions
     * are always created regardless of the `SchemaChangePolicy` on a crawler.
     *
     * The SchemaChangePolicy consists of two components, `UpdateBehavior` and `DeleteBehavior` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-schemachangepolicy)
     */
    override fun schemaChangePolicy(): Any? = unwrap(this).getSchemaChangePolicy()

    /**
     * The prefix added to the names of tables that are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tableprefix)
     */
    override fun tablePrefix(): String? = unwrap(this).getTablePrefix()

    /**
     * The tags to use with this crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * A collection of targets to crawl.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-crawler.html#cfn-glue-crawler-targets)
     */
    override fun targets(): Any = unwrap(this).getTargets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCrawlerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawlerProps):
        CfnCrawlerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCrawlerProps):
        software.amazon.awscdk.services.glue.CfnCrawlerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnCrawlerProps
  }
}
