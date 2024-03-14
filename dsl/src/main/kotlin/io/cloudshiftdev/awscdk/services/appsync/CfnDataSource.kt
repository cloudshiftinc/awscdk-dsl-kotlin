package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun attrDataSourceArn(): String = unwrap(this).getAttrDataSourceArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun dynamoDbConfig(): Any? = unwrap(this).getDynamoDbConfig()

  public open fun dynamoDbConfig(`value`: IResolvable) {
    unwrap(this).setDynamoDbConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun dynamoDbConfig(`value`: DynamoDBConfigProperty) {
    unwrap(this).setDynamoDbConfig(`value`.let(DynamoDBConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9847d1b716708382d21f1d3bec380aa20ac82890a60a3003c6fe37d043191340")
  public open fun dynamoDbConfig(`value`: DynamoDBConfigProperty.Builder.() -> Unit): Unit =
      dynamoDbConfig(DynamoDBConfigProperty(`value`))

  public open fun elasticsearchConfig(): Any? = unwrap(this).getElasticsearchConfig()

  public open fun elasticsearchConfig(`value`: IResolvable) {
    unwrap(this).setElasticsearchConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun elasticsearchConfig(`value`: ElasticsearchConfigProperty) {
    unwrap(this).setElasticsearchConfig(`value`.let(ElasticsearchConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83c2e7247c82d5e138346877167749a065612612e748405dbb788f06dd341875")
  public open fun elasticsearchConfig(`value`: ElasticsearchConfigProperty.Builder.() -> Unit): Unit
      = elasticsearchConfig(ElasticsearchConfigProperty(`value`))

  public open fun eventBridgeConfig(): Any? = unwrap(this).getEventBridgeConfig()

  public open fun eventBridgeConfig(`value`: IResolvable) {
    unwrap(this).setEventBridgeConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun eventBridgeConfig(`value`: EventBridgeConfigProperty) {
    unwrap(this).setEventBridgeConfig(`value`.let(EventBridgeConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("592a41e7ab9b043ee495c87318478f51c9a3d0e0a147572f4c99f32c4f975ce7")
  public open fun eventBridgeConfig(`value`: EventBridgeConfigProperty.Builder.() -> Unit): Unit =
      eventBridgeConfig(EventBridgeConfigProperty(`value`))

  public open fun httpConfig(): Any? = unwrap(this).getHttpConfig()

  public open fun httpConfig(`value`: IResolvable) {
    unwrap(this).setHttpConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun httpConfig(`value`: HttpConfigProperty) {
    unwrap(this).setHttpConfig(`value`.let(HttpConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3dfdc489685bfc14040bb386cea5a7333ffcb75aed942eebc662664adb0e0427")
  public open fun httpConfig(`value`: HttpConfigProperty.Builder.() -> Unit): Unit =
      httpConfig(HttpConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

  public open fun lambdaConfig(`value`: IResolvable) {
    unwrap(this).setLambdaConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun lambdaConfig(`value`: LambdaConfigProperty) {
    unwrap(this).setLambdaConfig(`value`.let(LambdaConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ea92d93167aea122afe95976f0b49a87c63ae5f263f26d2bb0834e154274274")
  public open fun lambdaConfig(`value`: LambdaConfigProperty.Builder.() -> Unit): Unit =
      lambdaConfig(LambdaConfigProperty(`value`))

  public open fun metricsConfig(): String? = unwrap(this).getMetricsConfig()

  public open fun metricsConfig(`value`: String) {
    unwrap(this).setMetricsConfig(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun openSearchServiceConfig(): Any? = unwrap(this).getOpenSearchServiceConfig()

  public open fun openSearchServiceConfig(`value`: IResolvable) {
    unwrap(this).setOpenSearchServiceConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun openSearchServiceConfig(`value`: OpenSearchServiceConfigProperty) {
    unwrap(this).setOpenSearchServiceConfig(`value`.let(OpenSearchServiceConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("91b6688c97e2b6484edfbfcf4fd03c030800e3fad8600f188de4d1ac9717d780")
  public open
      fun openSearchServiceConfig(`value`: OpenSearchServiceConfigProperty.Builder.() -> Unit): Unit
      = openSearchServiceConfig(OpenSearchServiceConfigProperty(`value`))

  public open fun relationalDatabaseConfig(): Any? = unwrap(this).getRelationalDatabaseConfig()

  public open fun relationalDatabaseConfig(`value`: IResolvable) {
    unwrap(this).setRelationalDatabaseConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun relationalDatabaseConfig(`value`: RelationalDatabaseConfigProperty) {
    unwrap(this).setRelationalDatabaseConfig(`value`.let(RelationalDatabaseConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("deddcd787d4e34169de7fdff78aa257416249c83b6cd9a650996203375316d9f")
  public open
      fun relationalDatabaseConfig(`value`: RelationalDatabaseConfigProperty.Builder.() -> Unit):
      Unit = relationalDatabaseConfig(RelationalDatabaseConfigProperty(`value`))

  public open fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

  public open fun serviceRoleArn(`value`: String) {
    unwrap(this).setServiceRoleArn(`value`)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun apiId(apiId: String) {
    }

    public fun description(description: String) {
    }

    public fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
    }

    public fun dynamoDbConfig(dynamoDbConfig: DynamoDBConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bf043b8a0324e8cba83c896eb3b8de672374ba174fe1c1840e63db4787ab86d")
    public fun dynamoDbConfig(dynamoDbConfig: DynamoDBConfigProperty.Builder.() -> Unit) {
    }

    public fun elasticsearchConfig(elasticsearchConfig: IResolvable) {
    }

    public fun elasticsearchConfig(elasticsearchConfig: ElasticsearchConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af23ba3c1884605cbefd293bf604520c0a4999decc3132972519ce6c8f566eec")
    public
        fun elasticsearchConfig(elasticsearchConfig: ElasticsearchConfigProperty.Builder.() -> Unit) {
    }

    public fun eventBridgeConfig(eventBridgeConfig: IResolvable) {
    }

    public fun eventBridgeConfig(eventBridgeConfig: EventBridgeConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4c74ddc3490714ef3189129995dee44bb1ca9c7bfba1a9a6bdb7d2451070dd2")
    public fun eventBridgeConfig(eventBridgeConfig: EventBridgeConfigProperty.Builder.() -> Unit) {
    }

    public fun httpConfig(httpConfig: IResolvable) {
    }

    public fun httpConfig(httpConfig: HttpConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e08d6ea4ca692be29a521d63c170735c9a43cec6600bce9728f00b25dfbf0908")
    public fun httpConfig(httpConfig: HttpConfigProperty.Builder.() -> Unit) {
    }

    public fun lambdaConfig(lambdaConfig: IResolvable) {
    }

    public fun lambdaConfig(lambdaConfig: LambdaConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b061edee103eb893f92d9a14bc5d5ef3ed457c5565af3b903d8cf4377662d99b")
    public fun lambdaConfig(lambdaConfig: LambdaConfigProperty.Builder.() -> Unit) {
    }

    public fun metricsConfig(metricsConfig: String) {
    }

    public fun name(name: String) {
    }

    public fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
    }

    public fun openSearchServiceConfig(openSearchServiceConfig: OpenSearchServiceConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7db0304fb68d98d60026fc85293012ba30cd0ea0ae55a233747776aa47fc0734")
    public
        fun openSearchServiceConfig(openSearchServiceConfig: OpenSearchServiceConfigProperty.Builder.() -> Unit) {
    }

    public fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable) {
    }

    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: RelationalDatabaseConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1744480542680fc4bd2c859423c6a216f70f90bec2eb184b72ad0c1660b5243")
    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: RelationalDatabaseConfigProperty.Builder.() -> Unit) {
    }

    public fun serviceRoleArn(serviceRoleArn: String) {
    }

    public fun type(type: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnDataSource.Builder =
        software.amazon.awscdk.services.appsync.CfnDataSource.Builder.create(scope, id)

    public override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(IResolvable::unwrap))
    }

    public override fun dynamoDbConfig(dynamoDbConfig: DynamoDBConfigProperty) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(DynamoDBConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bf043b8a0324e8cba83c896eb3b8de672374ba174fe1c1840e63db4787ab86d")
    public override fun dynamoDbConfig(dynamoDbConfig: DynamoDBConfigProperty.Builder.() -> Unit):
        Unit = dynamoDbConfig(DynamoDBConfigProperty(dynamoDbConfig))

    public override fun elasticsearchConfig(elasticsearchConfig: IResolvable) {
      cdkBuilder.elasticsearchConfig(elasticsearchConfig.let(IResolvable::unwrap))
    }

    public override fun elasticsearchConfig(elasticsearchConfig: ElasticsearchConfigProperty) {
      cdkBuilder.elasticsearchConfig(elasticsearchConfig.let(ElasticsearchConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af23ba3c1884605cbefd293bf604520c0a4999decc3132972519ce6c8f566eec")
    public override
        fun elasticsearchConfig(elasticsearchConfig: ElasticsearchConfigProperty.Builder.() -> Unit):
        Unit = elasticsearchConfig(ElasticsearchConfigProperty(elasticsearchConfig))

    public override fun eventBridgeConfig(eventBridgeConfig: IResolvable) {
      cdkBuilder.eventBridgeConfig(eventBridgeConfig.let(IResolvable::unwrap))
    }

    public override fun eventBridgeConfig(eventBridgeConfig: EventBridgeConfigProperty) {
      cdkBuilder.eventBridgeConfig(eventBridgeConfig.let(EventBridgeConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4c74ddc3490714ef3189129995dee44bb1ca9c7bfba1a9a6bdb7d2451070dd2")
    public override
        fun eventBridgeConfig(eventBridgeConfig: EventBridgeConfigProperty.Builder.() -> Unit): Unit
        = eventBridgeConfig(EventBridgeConfigProperty(eventBridgeConfig))

    public override fun httpConfig(httpConfig: IResolvable) {
      cdkBuilder.httpConfig(httpConfig.let(IResolvable::unwrap))
    }

    public override fun httpConfig(httpConfig: HttpConfigProperty) {
      cdkBuilder.httpConfig(httpConfig.let(HttpConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e08d6ea4ca692be29a521d63c170735c9a43cec6600bce9728f00b25dfbf0908")
    public override fun httpConfig(httpConfig: HttpConfigProperty.Builder.() -> Unit): Unit =
        httpConfig(HttpConfigProperty(httpConfig))

    public override fun lambdaConfig(lambdaConfig: IResolvable) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable::unwrap))
    }

    public override fun lambdaConfig(lambdaConfig: LambdaConfigProperty) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(LambdaConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b061edee103eb893f92d9a14bc5d5ef3ed457c5565af3b903d8cf4377662d99b")
    public override fun lambdaConfig(lambdaConfig: LambdaConfigProperty.Builder.() -> Unit): Unit =
        lambdaConfig(LambdaConfigProperty(lambdaConfig))

    public override fun metricsConfig(metricsConfig: String) {
      cdkBuilder.metricsConfig(metricsConfig)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(IResolvable::unwrap))
    }

    public override
        fun openSearchServiceConfig(openSearchServiceConfig: OpenSearchServiceConfigProperty) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(OpenSearchServiceConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7db0304fb68d98d60026fc85293012ba30cd0ea0ae55a233747776aa47fc0734")
    public override
        fun openSearchServiceConfig(openSearchServiceConfig: OpenSearchServiceConfigProperty.Builder.() -> Unit):
        Unit = openSearchServiceConfig(OpenSearchServiceConfigProperty(openSearchServiceConfig))

    public override fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable) {
      cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig.let(IResolvable::unwrap))
    }

    public override
        fun relationalDatabaseConfig(relationalDatabaseConfig: RelationalDatabaseConfigProperty) {
      cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig.let(RelationalDatabaseConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1744480542680fc4bd2c859423c6a216f70f90bec2eb184b72ad0c1660b5243")
    public override
        fun relationalDatabaseConfig(relationalDatabaseConfig: RelationalDatabaseConfigProperty.Builder.() -> Unit):
        Unit = relationalDatabaseConfig(RelationalDatabaseConfigProperty(relationalDatabaseConfig))

    public override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnDataSource = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource):
        CfnDataSource = CfnDataSource(cdkObject)

    internal fun unwrap(wrapped: CfnDataSource):
        software.amazon.awscdk.services.appsync.CfnDataSource = wrapped.cdkObject
  }

  public interface HttpConfigProperty {
    public fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

    public fun endpoint(): String

    public interface Builder {
      public fun authorizationConfig(authorizationConfig: IResolvable) {
      }

      public fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9900f5245e9541abfe09c6a72be99e3d73b35739de732b27e104b26649a924fd")
      public
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit) {
      }

      public fun endpoint(endpoint: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.builder()

      public override fun authorizationConfig(authorizationConfig: IResolvable) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(IResolvable::unwrap))
      }

      public override fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9900f5245e9541abfe09c6a72be99e3d73b35739de732b27e104b26649a924fd")
      public override
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit):
          Unit = authorizationConfig(AuthorizationConfigProperty(authorizationConfig))

      public override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public fun build(): software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty,
    ) : HttpConfigProperty {
      public override fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

      public override fun endpoint(): String = unwrap(this).getEndpoint()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty):
          HttpConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AuthorizationConfigProperty {
    public fun authorizationType(): String

    public fun awsIamConfig(): Any? = unwrap(this).getAwsIamConfig()

    public interface Builder {
      public fun authorizationType(authorizationType: String) {
      }

      public fun awsIamConfig(awsIamConfig: IResolvable) {
      }

      public fun awsIamConfig(awsIamConfig: AwsIamConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e361c77d7cd39b00648a85be5e24e1d444972385f26641485f260026656be75")
      public fun awsIamConfig(awsIamConfig: AwsIamConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.builder()

      public override fun authorizationType(authorizationType: String) {
        cdkBuilder.authorizationType(authorizationType)
      }

      public override fun awsIamConfig(awsIamConfig: IResolvable) {
        cdkBuilder.awsIamConfig(awsIamConfig.let(IResolvable::unwrap))
      }

      public override fun awsIamConfig(awsIamConfig: AwsIamConfigProperty) {
        cdkBuilder.awsIamConfig(awsIamConfig.let(AwsIamConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e361c77d7cd39b00648a85be5e24e1d444972385f26641485f260026656be75")
      public override fun awsIamConfig(awsIamConfig: AwsIamConfigProperty.Builder.() -> Unit): Unit
          = awsIamConfig(AwsIamConfigProperty(awsIamConfig))

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty,
    ) : AuthorizationConfigProperty {
      public override fun authorizationType(): String = unwrap(this).getAuthorizationType()

      public override fun awsIamConfig(): Any? = unwrap(this).getAwsIamConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty):
          AuthorizationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EventBridgeConfigProperty {
    public fun eventBusArn(): String

    public interface Builder {
      public fun eventBusArn(eventBusArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty.builder()

      public override fun eventBusArn(eventBusArn: String) {
        cdkBuilder.eventBusArn(eventBusArn)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty,
    ) : EventBridgeConfigProperty {
      public override fun eventBusArn(): String = unwrap(this).getEventBusArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty):
          EventBridgeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RelationalDatabaseConfigProperty {
    public fun rdsHttpEndpointConfig(): Any? = unwrap(this).getRdsHttpEndpointConfig()

    public fun relationalDatabaseSourceType(): String

    public interface Builder {
      public fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: IResolvable) {
      }

      public fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: RdsHttpEndpointConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0c0e1a030f7709ef41b4271ecea3609f7962dfd162d9b4ff87849ef4d907eab")
      public
          fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: RdsHttpEndpointConfigProperty.Builder.() -> Unit) {
      }

      public fun relationalDatabaseSourceType(relationalDatabaseSourceType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.builder()

      public override fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: IResolvable) {
        cdkBuilder.rdsHttpEndpointConfig(rdsHttpEndpointConfig.let(IResolvable::unwrap))
      }

      public override
          fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: RdsHttpEndpointConfigProperty) {
        cdkBuilder.rdsHttpEndpointConfig(rdsHttpEndpointConfig.let(RdsHttpEndpointConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0c0e1a030f7709ef41b4271ecea3609f7962dfd162d9b4ff87849ef4d907eab")
      public override
          fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: RdsHttpEndpointConfigProperty.Builder.() -> Unit):
          Unit = rdsHttpEndpointConfig(RdsHttpEndpointConfigProperty(rdsHttpEndpointConfig))

      public override fun relationalDatabaseSourceType(relationalDatabaseSourceType: String) {
        cdkBuilder.relationalDatabaseSourceType(relationalDatabaseSourceType)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty,
    ) : RelationalDatabaseConfigProperty {
      public override fun rdsHttpEndpointConfig(): Any? = unwrap(this).getRdsHttpEndpointConfig()

      public override fun relationalDatabaseSourceType(): String =
          unwrap(this).getRelationalDatabaseSourceType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RelationalDatabaseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty):
          RelationalDatabaseConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationalDatabaseConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OpenSearchServiceConfigProperty {
    public fun awsRegion(): String

    public fun endpoint(): String

    public interface Builder {
      public fun awsRegion(awsRegion: String) {
      }

      public fun endpoint(endpoint: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty.builder()

      public override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      public override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty,
    ) : OpenSearchServiceConfigProperty {
      public override fun awsRegion(): String = unwrap(this).getAwsRegion()

      public override fun endpoint(): String = unwrap(this).getEndpoint()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OpenSearchServiceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty):
          OpenSearchServiceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenSearchServiceConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AwsIamConfigProperty {
    public fun signingRegion(): String? = unwrap(this).getSigningRegion()

    public fun signingServiceName(): String? = unwrap(this).getSigningServiceName()

    public interface Builder {
      public fun signingRegion(signingRegion: String) {
      }

      public fun signingServiceName(signingServiceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty.builder()

      public override fun signingRegion(signingRegion: String) {
        cdkBuilder.signingRegion(signingRegion)
      }

      public override fun signingServiceName(signingServiceName: String) {
        cdkBuilder.signingServiceName(signingServiceName)
      }

      public fun build(): software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty,
    ) : AwsIamConfigProperty {
      public override fun signingRegion(): String? = unwrap(this).getSigningRegion()

      public override fun signingServiceName(): String? = unwrap(this).getSigningServiceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AwsIamConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty):
          AwsIamConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsIamConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ElasticsearchConfigProperty {
    public fun awsRegion(): String

    public fun endpoint(): String

    public interface Builder {
      public fun awsRegion(awsRegion: String) {
      }

      public fun endpoint(endpoint: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty.builder()

      public override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      public override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty,
    ) : ElasticsearchConfigProperty {
      public override fun awsRegion(): String = unwrap(this).getAwsRegion()

      public override fun endpoint(): String = unwrap(this).getEndpoint()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticsearchConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty):
          ElasticsearchConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeltaSyncConfigProperty {
    public fun baseTableTtl(): String

    public fun deltaSyncTableName(): String

    public fun deltaSyncTableTtl(): String

    public interface Builder {
      public fun baseTableTtl(baseTableTtl: String) {
      }

      public fun deltaSyncTableName(deltaSyncTableName: String) {
      }

      public fun deltaSyncTableTtl(deltaSyncTableTtl: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty.builder()

      public override fun baseTableTtl(baseTableTtl: String) {
        cdkBuilder.baseTableTtl(baseTableTtl)
      }

      public override fun deltaSyncTableName(deltaSyncTableName: String) {
        cdkBuilder.deltaSyncTableName(deltaSyncTableName)
      }

      public override fun deltaSyncTableTtl(deltaSyncTableTtl: String) {
        cdkBuilder.deltaSyncTableTtl(deltaSyncTableTtl)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty,
    ) : DeltaSyncConfigProperty {
      public override fun baseTableTtl(): String = unwrap(this).getBaseTableTtl()

      public override fun deltaSyncTableName(): String = unwrap(this).getDeltaSyncTableName()

      public override fun deltaSyncTableTtl(): String = unwrap(this).getDeltaSyncTableTtl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeltaSyncConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty):
          DeltaSyncConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeltaSyncConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DynamoDBConfigProperty {
    public fun awsRegion(): String

    public fun deltaSyncConfig(): Any? = unwrap(this).getDeltaSyncConfig()

    public fun tableName(): String

    public fun useCallerCredentials(): Any? = unwrap(this).getUseCallerCredentials()

    public fun versioned(): Any? = unwrap(this).getVersioned()

    public interface Builder {
      public fun awsRegion(awsRegion: String) {
      }

      public fun deltaSyncConfig(deltaSyncConfig: IResolvable) {
      }

      public fun deltaSyncConfig(deltaSyncConfig: DeltaSyncConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1002deaccd15ebe98dae193da399c9a598c2958f044db78528bbe004ff78089")
      public fun deltaSyncConfig(deltaSyncConfig: DeltaSyncConfigProperty.Builder.() -> Unit) {
      }

      public fun tableName(tableName: String) {
      }

      public fun useCallerCredentials(useCallerCredentials: Boolean) {
      }

      public fun useCallerCredentials(useCallerCredentials: IResolvable) {
      }

      public fun versioned(versioned: Boolean) {
      }

      public fun versioned(versioned: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.builder()

      public override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      public override fun deltaSyncConfig(deltaSyncConfig: IResolvable) {
        cdkBuilder.deltaSyncConfig(deltaSyncConfig.let(IResolvable::unwrap))
      }

      public override fun deltaSyncConfig(deltaSyncConfig: DeltaSyncConfigProperty) {
        cdkBuilder.deltaSyncConfig(deltaSyncConfig.let(DeltaSyncConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1002deaccd15ebe98dae193da399c9a598c2958f044db78528bbe004ff78089")
      public override
          fun deltaSyncConfig(deltaSyncConfig: DeltaSyncConfigProperty.Builder.() -> Unit): Unit =
          deltaSyncConfig(DeltaSyncConfigProperty(deltaSyncConfig))

      public override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public override fun useCallerCredentials(useCallerCredentials: Boolean) {
        cdkBuilder.useCallerCredentials(useCallerCredentials)
      }

      public override fun useCallerCredentials(useCallerCredentials: IResolvable) {
        cdkBuilder.useCallerCredentials(useCallerCredentials.let(IResolvable::unwrap))
      }

      public override fun versioned(versioned: Boolean) {
        cdkBuilder.versioned(versioned)
      }

      public override fun versioned(versioned: IResolvable) {
        cdkBuilder.versioned(versioned.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty,
    ) : DynamoDBConfigProperty {
      public override fun awsRegion(): String = unwrap(this).getAwsRegion()

      public override fun deltaSyncConfig(): Any? = unwrap(this).getDeltaSyncConfig()

      public override fun tableName(): String = unwrap(this).getTableName()

      public override fun useCallerCredentials(): Any? = unwrap(this).getUseCallerCredentials()

      public override fun versioned(): Any? = unwrap(this).getVersioned()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty):
          DynamoDBConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LambdaConfigProperty {
    public fun lambdaFunctionArn(): String

    public interface Builder {
      public fun lambdaFunctionArn(lambdaFunctionArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty.builder()

      public override fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
      }

      public fun build(): software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty,
    ) : LambdaConfigProperty {
      public override fun lambdaFunctionArn(): String = unwrap(this).getLambdaFunctionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty):
          LambdaConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RdsHttpEndpointConfigProperty {
    public fun awsRegion(): String

    public fun awsSecretStoreArn(): String

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun dbClusterIdentifier(): String

    public fun schema(): String? = unwrap(this).getSchema()

    public interface Builder {
      public fun awsRegion(awsRegion: String) {
      }

      public fun awsSecretStoreArn(awsSecretStoreArn: String) {
      }

      public fun databaseName(databaseName: String) {
      }

      public fun dbClusterIdentifier(dbClusterIdentifier: String) {
      }

      public fun schema(schema: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.builder()

      public override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      public override fun awsSecretStoreArn(awsSecretStoreArn: String) {
        cdkBuilder.awsSecretStoreArn(awsSecretStoreArn)
      }

      public override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      public override fun dbClusterIdentifier(dbClusterIdentifier: String) {
        cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
      }

      public override fun schema(schema: String) {
        cdkBuilder.schema(schema)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty,
    ) : RdsHttpEndpointConfigProperty {
      public override fun awsRegion(): String = unwrap(this).getAwsRegion()

      public override fun awsSecretStoreArn(): String = unwrap(this).getAwsSecretStoreArn()

      public override fun databaseName(): String? = unwrap(this).getDatabaseName()

      public override fun dbClusterIdentifier(): String = unwrap(this).getDbClusterIdentifier()

      public override fun schema(): String? = unwrap(this).getSchema()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RdsHttpEndpointConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty):
          RdsHttpEndpointConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RdsHttpEndpointConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
