@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface EmrAddStepProps : TaskStateBaseProps {
  public fun actionOnFailure(): ActionOnFailure? =
      unwrap(this).getActionOnFailure()?.let(ActionOnFailure::wrap)

  public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

  public fun clusterId(): String

  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public fun jar(): String

  public fun mainClass(): String? = unwrap(this).getMainClass()

  public fun name(): String

  public fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun actionOnFailure(actionOnFailure: ActionOnFailure)

    public fun args(args: List<String>)

    public fun args(vararg args: String)

    public fun clusterId(clusterId: String)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5adde35b54c77777433030351f4af5f42989a8246aa44dbaf9222b2d5fdef94c")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    public fun executionRoleArn(executionRoleArn: String)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun jar(jar: String)

    public fun mainClass(mainClass: String)

    public fun name(name: String)

    public fun outputPath(outputPath: String)

    public fun properties(properties: Map<String, String>)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepProps.builder()

    override fun actionOnFailure(actionOnFailure: ActionOnFailure) {
      cdkBuilder.actionOnFailure(actionOnFailure.let(ActionOnFailure::unwrap))
    }

    override fun args(args: List<String>) {
      cdkBuilder.args(args)
    }

    override fun args(vararg args: String): Unit = args(args.toList())

    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5adde35b54c77777433030351f4af5f42989a8246aa44dbaf9222b2d5fdef94c")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
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

    override fun jar(jar: String) {
      cdkBuilder.jar(jar)
    }

    override fun mainClass(mainClass: String) {
      cdkBuilder.mainClass(mainClass)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun properties(properties: Map<String, String>) {
      cdkBuilder.properties(properties)
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepProps,
  ) : CdkObject(cdkObject), EmrAddStepProps {
    override fun actionOnFailure(): ActionOnFailure? =
        unwrap(this).getActionOnFailure()?.let(ActionOnFailure::wrap)

    override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    override fun clusterId(): String = unwrap(this).getClusterId()

    override fun comment(): String? = unwrap(this).getComment()

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    override fun jar(): String = unwrap(this).getJar()

    override fun mainClass(): String? = unwrap(this).getMainClass()

    override fun name(): String = unwrap(this).getName()

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EmrAddStepProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepProps):
        EmrAddStepProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmrAddStepProps):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepProps
  }
}
