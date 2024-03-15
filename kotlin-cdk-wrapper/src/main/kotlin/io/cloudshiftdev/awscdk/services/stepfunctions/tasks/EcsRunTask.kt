@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.TaskDefinition
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EcsRunTask internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask,
) : TaskStateBase(cdkObject), IConnectable {
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun assignPublicIp(assignPublicIp: Boolean)

    public fun cluster(cluster: ICluster)

    public fun comment(comment: String)

    public fun containerOverrides(containerOverrides: List<ContainerOverride>)

    public fun containerOverrides(vararg containerOverrides: ContainerOverride)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70ebe03278a53b551b732afadb0fad9fa84cad26998f0d5390edfd9bf918bd2e")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun launchTarget(launchTarget: IEcsLaunchTarget)

    public fun outputPath(outputPath: String)

    public fun propagatedTagSource(propagatedTagSource: PropagatedTagSource)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun revisionNumber(revisionNumber: Number)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun stateName(stateName: String)

    public fun subnets(subnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53ef47c4171694591a1bf3d57aaafc4fe3f6177bfc360a41d93d468a4f845a37")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    public fun taskDefinition(taskDefinition: TaskDefinition)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask.Builder.create(scope, id)

    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun containerOverrides(containerOverrides: List<ContainerOverride>) {
      cdkBuilder.containerOverrides(containerOverrides.map(ContainerOverride::unwrap))
    }

    override fun containerOverrides(vararg containerOverrides: ContainerOverride): Unit =
        containerOverrides(containerOverrides.toList())

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70ebe03278a53b551b732afadb0fad9fa84cad26998f0d5390edfd9bf918bd2e")
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

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override fun launchTarget(launchTarget: IEcsLaunchTarget) {
      cdkBuilder.launchTarget(launchTarget.let(IEcsLaunchTarget::unwrap))
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun propagatedTagSource(propagatedTagSource: PropagatedTagSource) {
      cdkBuilder.propagatedTagSource(propagatedTagSource.let(PropagatedTagSource::unwrap))
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override fun revisionNumber(revisionNumber: Number) {
      cdkBuilder.revisionNumber(revisionNumber)
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53ef47c4171694591a1bf3d57aaafc4fe3f6177bfc360a41d93d468a4f845a37")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition::unwrap))
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EcsRunTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EcsRunTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask):
        EcsRunTask = EcsRunTask(cdkObject)

    internal fun unwrap(wrapped: EcsRunTask):
        software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTask = wrapped.cdkObject
  }
}