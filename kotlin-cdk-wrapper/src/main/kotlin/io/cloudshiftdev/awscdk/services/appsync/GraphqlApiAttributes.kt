@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Attributes for GraphQL imports.
 *
 * Example:
 *
 * ```
 * GraphqlApi sourceApi = GraphqlApi.Builder.create(this, "FirstSourceAPI")
 * .name("FirstSourceAPI")
 * .definition(Definition.fromFile(join(__dirname, "appsync.merged-api-1.graphql")))
 * .build();
 * IGraphqlApi importedMergedApi = GraphqlApi.fromGraphqlApiAttributes(this, "ImportedMergedApi",
 * GraphqlApiAttributes.builder()
 * .graphqlApiId("MyApiId")
 * .graphqlApiArn("MyApiArn")
 * .build());
 * IRole importedExecutionRole = Role.fromRoleArn(this, "ExecutionRole",
 * "arn:aws:iam::ACCOUNT:role/MyExistingRole");
 * SourceApiAssociation.Builder.create(this, "SourceApiAssociation2")
 * .sourceApi(sourceApi)
 * .mergedApi(importedMergedApi)
 * .mergeType(MergeType.MANUAL_MERGE)
 * .mergedApiExecutionRole(importedExecutionRole)
 * .build();
 * ```
 */
public interface GraphqlApiAttributes {
  /**
   * the arn for the GraphQL Api.
   *
   * Default: - autogenerated arn
   */
  public fun graphqlApiArn(): String? = unwrap(this).getGraphqlApiArn()

  /**
   * an unique AWS AppSync GraphQL API identifier i.e. 'lxz775lwdrgcndgz3nurvac7oa'.
   */
  public fun graphqlApiId(): String

  /**
   * A builder for [GraphqlApiAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param graphqlApiArn the arn for the GraphQL Api.
     */
    public fun graphqlApiArn(graphqlApiArn: String)

    /**
     * @param graphqlApiId an unique AWS AppSync GraphQL API identifier i.e.
     * 'lxz775lwdrgcndgz3nurvac7oa'. 
     */
    public fun graphqlApiId(graphqlApiId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.GraphqlApiAttributes.Builder =
        software.amazon.awscdk.services.appsync.GraphqlApiAttributes.builder()

    /**
     * @param graphqlApiArn the arn for the GraphQL Api.
     */
    override fun graphqlApiArn(graphqlApiArn: String) {
      cdkBuilder.graphqlApiArn(graphqlApiArn)
    }

    /**
     * @param graphqlApiId an unique AWS AppSync GraphQL API identifier i.e.
     * 'lxz775lwdrgcndgz3nurvac7oa'. 
     */
    override fun graphqlApiId(graphqlApiId: String) {
      cdkBuilder.graphqlApiId(graphqlApiId)
    }

    public fun build(): software.amazon.awscdk.services.appsync.GraphqlApiAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiAttributes,
  ) : CdkObject(cdkObject), GraphqlApiAttributes {
    /**
     * the arn for the GraphQL Api.
     *
     * Default: - autogenerated arn
     */
    override fun graphqlApiArn(): String? = unwrap(this).getGraphqlApiArn()

    /**
     * an unique AWS AppSync GraphQL API identifier i.e. 'lxz775lwdrgcndgz3nurvac7oa'.
     */
    override fun graphqlApiId(): String = unwrap(this).getGraphqlApiId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GraphqlApiAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiAttributes):
        GraphqlApiAttributes = CdkObjectWrappers.wrap(cdkObject) as? GraphqlApiAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GraphqlApiAttributes):
        software.amazon.awscdk.services.appsync.GraphqlApiAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.GraphqlApiAttributes
  }
}
