@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CallApiGatewayEndpointBaseProps : TaskStateBaseProps {
  public fun apiPath(): String? = unwrap(this).getApiPath()

  public fun authType(): AuthType? = unwrap(this).getAuthType()?.let(AuthType::wrap)

  public fun headers(): TaskInput? = unwrap(this).getHeaders()?.let(TaskInput::wrap)

  public fun method(): HttpMethod

  public fun queryParameters(): TaskInput? = unwrap(this).getQueryParameters()?.let(TaskInput::wrap)

  public fun requestBody(): TaskInput? = unwrap(this).getRequestBody()?.let(TaskInput::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun apiPath(apiPath: String)

    public fun authType(authType: AuthType)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b843a378bb01bed99bac90c79018029550f0d0e62a6f9c6dbb19eb87389b063f")
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

    public fun stateName(stateName: String)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseProps.builder()

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
    @JvmName("b843a378bb01bed99bac90c79018029550f0d0e62a6f9c6dbb19eb87389b063f")
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
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseProps,
  ) : CdkObject(cdkObject), CallApiGatewayEndpointBaseProps {
    override fun apiPath(): String? = unwrap(this).getApiPath()

    override fun authType(): AuthType? = unwrap(this).getAuthType()?.let(AuthType::wrap)

    override fun comment(): String? = unwrap(this).getComment()

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    override fun headers(): TaskInput? = unwrap(this).getHeaders()?.let(TaskInput::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    override fun method(): HttpMethod = unwrap(this).getMethod().let(HttpMethod::wrap)

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun queryParameters(): TaskInput? =
        unwrap(this).getQueryParameters()?.let(TaskInput::wrap)

    override fun requestBody(): TaskInput? = unwrap(this).getRequestBody()?.let(TaskInput::wrap)

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CallApiGatewayEndpointBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseProps):
        CallApiGatewayEndpointBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CallApiGatewayEndpointBaseProps):
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayEndpointBaseProps
  }
}
