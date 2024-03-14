package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SageMakerCreateEndpoint internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint,
) : TaskStateBase(cdkObject) {
  public interface Builder {
    public fun comment(comment: String) {
    }

    public fun credentials(credentials: Credentials) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1248c2c013867b91d4512391e6dbfb3f366b290c5a8f57e3efaf87337a919c0d")
    public fun credentials(credentials: Credentials.Builder.() -> Unit) {
    }

    public fun endpointConfigName(endpointConfigName: String) {
    }

    public fun endpointName(endpointName: String) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
    }

    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    }

    public fun inputPath(inputPath: String) {
    }

    public fun integrationPattern(integrationPattern: IntegrationPattern) {
    }

    public fun outputPath(outputPath: String) {
    }

    public fun resultPath(resultPath: String) {
    }

    public fun resultSelector(resultSelector: Map<String, Any>) {
    }

    public fun stateName(stateName: String) {
    }

    public fun tags(tags: TaskInput) {
    }

    public fun taskTimeout(taskTimeout: Timeout) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint.Builder.create(scope,
        id)

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1248c2c013867b91d4512391e6dbfb3f366b290c5a8f57e3efaf87337a919c0d")
    public override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    public override fun endpointConfigName(endpointConfigName: String) {
      cdkBuilder.endpointConfigName(endpointConfigName)
    }

    public override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    public override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    public override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    public override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    public override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    public override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    public override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    public override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public override fun tags(tags: TaskInput) {
      cdkBuilder.tags(tags.let(TaskInput::unwrap))
    }

    public override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SageMakerCreateEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SageMakerCreateEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint):
        SageMakerCreateEndpoint = SageMakerCreateEndpoint(cdkObject)

    internal fun unwrap(wrapped: SageMakerCreateEndpoint):
        software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint =
        wrapped.cdkObject
  }
}
