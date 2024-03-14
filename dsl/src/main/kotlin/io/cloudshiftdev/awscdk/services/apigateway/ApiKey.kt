package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApiKey internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.ApiKey,
) : Resource(cdkObject), IApiKey {
  public open fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun grantReadWrite(grantee: IGrantable): Grant =
      unwrap(this).grantReadWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun keyArn(): String = unwrap(this).getKeyArn()

  public override fun keyId(): String = unwrap(this).getKeyId()

  public interface Builder {
    public fun apiKeyName(apiKeyName: String) {
    }

    public fun customerId(customerId: String) {
    }

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ceb4d64eca0f465918941fc63b8d30e14ea7bbd91b8cbd1d4b2234280d025cd")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit) {
    }

    public fun defaultIntegration(defaultIntegration: Integration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1d5bfcca76c9e57f022bd3364f99bb0ac4ff30a341312056574fce113b61c67")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit) {
    }

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e13b14747b217ff1767710747d396aa04262995491c811c71dd6836c7a1e6f3")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun generateDistinctId(generateDistinctId: Boolean) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun resources(resources: List<IRestApi>) {
    }

    public fun stages(stages: List<IStage>) {
    }

    public fun `value`(`value`: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ApiKey.Builder =
        software.amazon.awscdk.services.apigateway.ApiKey.Builder.create(scope, id)

    public override fun apiKeyName(apiKeyName: String) {
      cdkBuilder.apiKeyName(apiKeyName)
    }

    public override fun customerId(customerId: String) {
      cdkBuilder.customerId(customerId)
    }

    public override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ceb4d64eca0f465918941fc63b8d30e14ea7bbd91b8cbd1d4b2234280d025cd")
    public override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    public override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1d5bfcca76c9e57f022bd3364f99bb0ac4ff30a341312056574fce113b61c67")
    public override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit
        = defaultIntegration(Integration(defaultIntegration))

    public override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e13b14747b217ff1767710747d396aa04262995491c811c71dd6836c7a1e6f3")
    public override
        fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit =
        defaultMethodOptions(MethodOptions(defaultMethodOptions))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun generateDistinctId(generateDistinctId: Boolean) {
      cdkBuilder.generateDistinctId(generateDistinctId)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun resources(resources: List<IRestApi>) {
      cdkBuilder.resources(resources.map(IRestApi::unwrap))
    }

    public override fun stages(stages: List<IStage>) {
      cdkBuilder.stages(stages.map(IStage::unwrap))
    }

    public override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ApiKey = cdkBuilder.build()
  }

  public companion object {
    public open fun fromApiKeyId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      apiKeyId: String,
    ): IApiKey =
        software.amazon.awscdk.services.apigateway.ApiKey.fromApiKeyId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, apiKeyId).let(IApiKey::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApiKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApiKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiKey): ApiKey =
        ApiKey(cdkObject)

    internal fun unwrap(wrapped: ApiKey): software.amazon.awscdk.services.apigateway.ApiKey =
        wrapped.cdkObject
  }
}
