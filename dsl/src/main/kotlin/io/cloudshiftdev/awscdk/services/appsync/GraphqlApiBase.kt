package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.rds.IServerlessCluster
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.elasticsearch.IDomain as ElasticsearchIDomain
import io.cloudshiftdev.awscdk.services.opensearchservice.IDomain as OpensearchserviceIDomain

public abstract class GraphqlApiBase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiBase,
) : Resource(cdkObject), IGraphqlApi {
  public override fun addDynamoDbDataSource(id: String, table: ITable): DynamoDbDataSource =
      unwrap(this).addDynamoDbDataSource(id,
      table.let(ITable::unwrap)).let(DynamoDbDataSource::wrap)

  public override fun addDynamoDbDataSource(
    id: String,
    table: ITable,
    options: DataSourceOptions,
  ): DynamoDbDataSource = unwrap(this).addDynamoDbDataSource(id, table.let(ITable::unwrap),
      options.let(DataSourceOptions::unwrap)).let(DynamoDbDataSource::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("530dd82c95ed746875fe350e7cde2e4fbc011d487637179a7db2e8e6deacaf0f")
  public override fun addDynamoDbDataSource(
    id: String,
    table: ITable,
    options: DataSourceOptions.Builder.() -> Unit,
  ): DynamoDbDataSource = addDynamoDbDataSource(id, table, DataSourceOptions(options))

  @Deprecated(message = "deprecated in CDK")
  public override fun addElasticsearchDataSource(id: String, domain: ElasticsearchIDomain):
      ElasticsearchDataSource = unwrap(this).addElasticsearchDataSource(id,
      domain.let(ElasticsearchIDomain::unwrap)).let(ElasticsearchDataSource::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun addElasticsearchDataSource(
    id: String,
    domain: ElasticsearchIDomain,
    options: DataSourceOptions,
  ): ElasticsearchDataSource = unwrap(this).addElasticsearchDataSource(id,
      domain.let(ElasticsearchIDomain::unwrap),
      options.let(DataSourceOptions::unwrap)).let(ElasticsearchDataSource::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0140c82b8b61fcbf955d362494e2dda1c27bce203e323f42c39a2f0d210d07e3")
  public override fun addElasticsearchDataSource(
    id: String,
    domain: ElasticsearchIDomain,
    options: DataSourceOptions.Builder.() -> Unit,
  ): ElasticsearchDataSource = addElasticsearchDataSource(id, domain, DataSourceOptions(options))

  public override fun addEventBridgeDataSource(id: String, eventBus: IEventBus):
      EventBridgeDataSource = unwrap(this).addEventBridgeDataSource(id,
      eventBus.let(IEventBus::unwrap)).let(EventBridgeDataSource::wrap)

  public override fun addEventBridgeDataSource(
    id: String,
    eventBus: IEventBus,
    options: DataSourceOptions,
  ): EventBridgeDataSource = unwrap(this).addEventBridgeDataSource(id,
      eventBus.let(IEventBus::unwrap),
      options.let(DataSourceOptions::unwrap)).let(EventBridgeDataSource::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1a221338235f20da91d27739af1cae4d12b3f101b872bc80ef0dc52cb587b3d")
  public override fun addEventBridgeDataSource(
    id: String,
    eventBus: IEventBus,
    options: DataSourceOptions.Builder.() -> Unit,
  ): EventBridgeDataSource = addEventBridgeDataSource(id, eventBus, DataSourceOptions(options))

  public override fun addHttpDataSource(id: String, endpoint: String): HttpDataSource =
      unwrap(this).addHttpDataSource(id, endpoint).let(HttpDataSource::wrap)

  public override fun addHttpDataSource(
    id: String,
    endpoint: String,
    options: HttpDataSourceOptions,
  ): HttpDataSource = unwrap(this).addHttpDataSource(id, endpoint,
      options.let(HttpDataSourceOptions::unwrap)).let(HttpDataSource::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adc715bb04cde12e0c5e1b70042b159e2aab45f9ee3bfd1d56778b2f941f73b6")
  public override fun addHttpDataSource(
    id: String,
    endpoint: String,
    options: HttpDataSourceOptions.Builder.() -> Unit,
  ): HttpDataSource = addHttpDataSource(id, endpoint, HttpDataSourceOptions(options))

  public override fun addLambdaDataSource(id: String, lambdaFunction: IFunction): LambdaDataSource =
      unwrap(this).addLambdaDataSource(id,
      lambdaFunction.let(IFunction::unwrap)).let(LambdaDataSource::wrap)

  public override fun addLambdaDataSource(
    id: String,
    lambdaFunction: IFunction,
    options: DataSourceOptions,
  ): LambdaDataSource = unwrap(this).addLambdaDataSource(id, lambdaFunction.let(IFunction::unwrap),
      options.let(DataSourceOptions::unwrap)).let(LambdaDataSource::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5743d20f6e9bffad5b7739c473ab2a90eb35b8c23f6c85534da3967bd9c0a1a")
  public override fun addLambdaDataSource(
    id: String,
    lambdaFunction: IFunction,
    options: DataSourceOptions.Builder.() -> Unit,
  ): LambdaDataSource = addLambdaDataSource(id, lambdaFunction, DataSourceOptions(options))

  public override fun addNoneDataSource(id: String): NoneDataSource =
      unwrap(this).addNoneDataSource(id).let(NoneDataSource::wrap)

  public override fun addNoneDataSource(id: String, options: DataSourceOptions): NoneDataSource =
      unwrap(this).addNoneDataSource(id,
      options.let(DataSourceOptions::unwrap)).let(NoneDataSource::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f6ad3c2d0d3a1e70a3c0a4d1b13a764aaf821c23e6022c32e77eafd2e3511485")
  public override fun addNoneDataSource(id: String, options: DataSourceOptions.Builder.() -> Unit):
      NoneDataSource = addNoneDataSource(id, DataSourceOptions(options))

  public override fun addOpenSearchDataSource(id: String, domain: OpensearchserviceIDomain):
      OpenSearchDataSource = unwrap(this).addOpenSearchDataSource(id,
      domain.let(OpensearchserviceIDomain::unwrap)).let(OpenSearchDataSource::wrap)

  public override fun addOpenSearchDataSource(
    id: String,
    domain: OpensearchserviceIDomain,
    options: DataSourceOptions,
  ): OpenSearchDataSource = unwrap(this).addOpenSearchDataSource(id,
      domain.let(OpensearchserviceIDomain::unwrap),
      options.let(DataSourceOptions::unwrap)).let(OpenSearchDataSource::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a4cb979329edf469eb722bd82ee676e144874290e4bf8b25e186aa1b5331890")
  public override fun addOpenSearchDataSource(
    id: String,
    domain: OpensearchserviceIDomain,
    options: DataSourceOptions.Builder.() -> Unit,
  ): OpenSearchDataSource = addOpenSearchDataSource(id, domain, DataSourceOptions(options))

  public override fun addRdsDataSource(
    id: String,
    serverlessCluster: IServerlessCluster,
    secretStore: ISecret,
  ): RdsDataSource = unwrap(this).addRdsDataSource(id,
      serverlessCluster.let(IServerlessCluster::unwrap),
      secretStore.let(ISecret::unwrap)).let(RdsDataSource::wrap)

  public override fun addRdsDataSource(
    id: String,
    serverlessCluster: IServerlessCluster,
    secretStore: ISecret,
    databaseName: String,
  ): RdsDataSource = unwrap(this).addRdsDataSource(id,
      serverlessCluster.let(IServerlessCluster::unwrap), secretStore.let(ISecret::unwrap),
      databaseName).let(RdsDataSource::wrap)

  public override fun addRdsDataSource(
    id: String,
    serverlessCluster: IServerlessCluster,
    secretStore: ISecret,
    databaseName: String,
    options: DataSourceOptions,
  ): RdsDataSource = unwrap(this).addRdsDataSource(id,
      serverlessCluster.let(IServerlessCluster::unwrap), secretStore.let(ISecret::unwrap),
      databaseName, options.let(DataSourceOptions::unwrap)).let(RdsDataSource::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3a9fffa2af175b82843c8d257699a3a39f51c1a5f014c37a8b7fc18df18205e9")
  public override fun addRdsDataSource(
    id: String,
    serverlessCluster: IServerlessCluster,
    secretStore: ISecret,
    databaseName: String,
    options: DataSourceOptions.Builder.() -> Unit,
  ): RdsDataSource = addRdsDataSource(id, serverlessCluster, secretStore, databaseName,
      DataSourceOptions(options))

  public override fun addSchemaDependency(construct: CfnResource): Boolean =
      unwrap(this).addSchemaDependency(construct.let(CfnResource::unwrap))

  public override fun apiId(): String = unwrap(this).getApiId()

  public override fun arn(): String = unwrap(this).getArn()

  public override fun createResolver(id: String, props: ExtendedResolverProps): Resolver =
      unwrap(this).createResolver(id, props.let(ExtendedResolverProps::unwrap)).let(Resolver::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfac965a6b25365e261bc8f10e37f75dee20d44ce736e5d6bb3be729ca63320e")
  public override fun createResolver(id: String, props: ExtendedResolverProps.Builder.() -> Unit):
      Resolver = createResolver(id, ExtendedResolverProps(props))

  public override fun grant(
    grantee: IGrantable,
    resources: IamResource,
    actions: String,
  ): Grant = unwrap(this).grant(grantee.let(IGrantable::unwrap), resources.let(IamResource::unwrap),
      actions).let(Grant::wrap)

  public override fun grantMutation(grantee: IGrantable, fields: String): Grant =
      unwrap(this).grantMutation(grantee.let(IGrantable::unwrap), fields).let(Grant::wrap)

  public override fun grantQuery(grantee: IGrantable, fields: String): Grant =
      unwrap(this).grantQuery(grantee.let(IGrantable::unwrap), fields).let(Grant::wrap)

  public override fun grantSubscription(grantee: IGrantable, fields: String): Grant =
      unwrap(this).grantSubscription(grantee.let(IGrantable::unwrap), fields).let(Grant::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiBase,
  ) : GraphqlApiBase(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiBase):
        GraphqlApiBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GraphqlApiBase):
        software.amazon.awscdk.services.appsync.GraphqlApiBase = (wrapped as Wrapper).cdkObject
  }
}