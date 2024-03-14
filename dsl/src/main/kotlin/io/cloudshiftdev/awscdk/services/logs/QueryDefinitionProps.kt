package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface QueryDefinitionProps {
  /**
   * Specify certain log groups for the query definition.
   *
   * Default: - no specified log groups
   */
  public fun logGroups(): List<ILogGroup> = unwrap(this).getLogGroups()?.map(ILogGroup::wrap) ?:
      emptyList()

  /**
   * Name of the query definition.
   */
  public fun queryDefinitionName(): String

  /**
   * The query string to use for this query definition.
   */
  public fun queryString(): QueryString

  /**
   * A builder for [QueryDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logGroups Specify certain log groups for the query definition.
     */
    public fun logGroups(logGroups: List<ILogGroup>)

    /**
     * @param logGroups Specify certain log groups for the query definition.
     */
    public fun logGroups(vararg logGroups: ILogGroup)

    /**
     * @param queryDefinitionName Name of the query definition. 
     */
    public fun queryDefinitionName(queryDefinitionName: String)

    /**
     * @param queryString The query string to use for this query definition. 
     */
    public fun queryString(queryString: QueryString)

    /**
     * @param queryString The query string to use for this query definition. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f58b9dc8df8cb31b405726ee0019b3c8c2b55d72d9c6d481928fd7f1e7fce093")
    public fun queryString(queryString: QueryString.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.QueryDefinitionProps.Builder =
        software.amazon.awscdk.services.logs.QueryDefinitionProps.builder()

    /**
     * @param logGroups Specify certain log groups for the query definition.
     */
    override fun logGroups(logGroups: List<ILogGroup>) {
      cdkBuilder.logGroups(logGroups.map(ILogGroup::unwrap))
    }

    /**
     * @param logGroups Specify certain log groups for the query definition.
     */
    override fun logGroups(vararg logGroups: ILogGroup): Unit = logGroups(logGroups.toList())

    /**
     * @param queryDefinitionName Name of the query definition. 
     */
    override fun queryDefinitionName(queryDefinitionName: String) {
      cdkBuilder.queryDefinitionName(queryDefinitionName)
    }

    /**
     * @param queryString The query string to use for this query definition. 
     */
    override fun queryString(queryString: QueryString) {
      cdkBuilder.queryString(queryString.let(QueryString::unwrap))
    }

    /**
     * @param queryString The query string to use for this query definition. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f58b9dc8df8cb31b405726ee0019b3c8c2b55d72d9c6d481928fd7f1e7fce093")
    override fun queryString(queryString: QueryString.Builder.() -> Unit): Unit =
        queryString(QueryString(queryString))

    public fun build(): software.amazon.awscdk.services.logs.QueryDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.QueryDefinitionProps,
  ) : CdkObject(cdkObject), QueryDefinitionProps {
    /**
     * Specify certain log groups for the query definition.
     *
     * Default: - no specified log groups
     */
    override fun logGroups(): List<ILogGroup> = unwrap(this).getLogGroups()?.map(ILogGroup::wrap) ?:
        emptyList()

    /**
     * Name of the query definition.
     */
    override fun queryDefinitionName(): String = unwrap(this).getQueryDefinitionName()

    /**
     * The query string to use for this query definition.
     */
    override fun queryString(): QueryString = unwrap(this).getQueryString().let(QueryString::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueryDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.QueryDefinitionProps):
        QueryDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryDefinitionProps):
        software.amazon.awscdk.services.logs.QueryDefinitionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.QueryDefinitionProps
  }
}
