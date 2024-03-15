@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EmrModifyInstanceFleetByName internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName,
) : TaskStateBase(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun clusterId(clusterId: String)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4cd8db102533a40d88c17c2f771e4d232744ccc942663ee6bf1d47cb7907c1c")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun instanceFleetName(instanceFleetName: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun outputPath(outputPath: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)

    public fun targetOnDemandCapacity(targetOnDemandCapacity: Number)

    public fun targetSpotCapacity(targetSpotCapacity: Number)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName.Builder.create(scope,
        id)

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
    @JvmName("b4cd8db102533a40d88c17c2f771e4d232744ccc942663ee6bf1d47cb7907c1c")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

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

    override fun instanceFleetName(instanceFleetName: String) {
      cdkBuilder.instanceFleetName(instanceFleetName)
    }

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
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

    override fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
      cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
    }

    override fun targetSpotCapacity(targetSpotCapacity: Number) {
      cdkBuilder.targetSpotCapacity(targetSpotCapacity)
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EmrModifyInstanceFleetByName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EmrModifyInstanceFleetByName(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName):
        EmrModifyInstanceFleetByName = EmrModifyInstanceFleetByName(cdkObject)

    internal fun unwrap(wrapped: EmrModifyInstanceFleetByName):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceFleetByName =
        wrapped.cdkObject
  }
}
