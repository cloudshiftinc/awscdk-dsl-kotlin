@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.apigateway.IRestApi
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CallApiGatewayRestApiEndpoint internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint,
) : TaskStateBase(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun api(api: IRestApi)

    public fun apiPath(apiPath: String)

    public fun authType(authType: AuthType)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48cbf238cfd7bc3d223792469204258054715bc24ce41957532990934c8393cd")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun headers(headers: TaskInput)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun method(method: HttpMethod)

    public fun outputPath(outputPath: String)

    public fun queryParameters(queryParameters: TaskInput)

    public fun requestBody(requestBody: TaskInput)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stageName(stageName: String)

    public fun stateName(stateName: String)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint.Builder.create(scope,
        id)

    override fun api(api: IRestApi) {
      cdkBuilder.api(api.let(IRestApi::unwrap))
    }

    override fun apiPath(apiPath: String) {
      cdkBuilder.apiPath(apiPath)
    }

    override fun authType(authType: AuthType) {
      cdkBuilder.authType(authType.let(AuthType::unwrap))
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48cbf238cfd7bc3d223792469204258054715bc24ce41957532990934c8393cd")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    override fun headers(headers: TaskInput) {
      cdkBuilder.headers(headers.let(TaskInput::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod::unwrap))
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun queryParameters(queryParameters: TaskInput) {
      cdkBuilder.queryParameters(queryParameters.let(TaskInput::unwrap))
    }

    override fun requestBody(requestBody: TaskInput) {
      cdkBuilder.requestBody(requestBody.let(TaskInput::unwrap))
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CallApiGatewayRestApiEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CallApiGatewayRestApiEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint):
        CallApiGatewayRestApiEndpoint = CallApiGatewayRestApiEndpoint(cdkObject)

    internal fun unwrap(wrapped: CallApiGatewayRestApiEndpoint):
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpoint =
        wrapped.cdkObject
  }
}