@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Ec2TaskDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.Ec2TaskDefinition,
) : TaskDefinition(cdkObject), IEc2TaskDefinition {
  public override fun addContainer(id: String, props: ContainerDefinitionOptions):
      ContainerDefinition = unwrap(this).addContainer(id,
      props.let(ContainerDefinitionOptions::unwrap)).let(ContainerDefinition::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad60dadcf6b5a99535d38733285d125986065c711b1844893efc32b804589a91")
  public override fun addContainer(id: String,
      props: ContainerDefinitionOptions.Builder.() -> Unit): ContainerDefinition = addContainer(id,
      ContainerDefinitionOptions(props))

  @CdkDslMarker
  public interface Builder {
    public fun executionRole(executionRole: IRole)

    public fun family(family: String)

    public fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>)

    public fun inferenceAccelerators(vararg inferenceAccelerators: InferenceAccelerator)

    public fun ipcMode(ipcMode: IpcMode)

    public fun networkMode(networkMode: NetworkMode)

    public fun pidMode(pidMode: PidMode)

    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration)

    public fun taskRole(taskRole: IRole)

    public fun volumes(volumes: List<Volume>)

    public fun volumes(vararg volumes: Volume)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ec2TaskDefinition.Builder =
        software.amazon.awscdk.services.ecs.Ec2TaskDefinition.Builder.create(scope, id)

    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    override fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>) {
      cdkBuilder.inferenceAccelerators(inferenceAccelerators.map(InferenceAccelerator::unwrap))
    }

    override fun inferenceAccelerators(vararg inferenceAccelerators: InferenceAccelerator): Unit =
        inferenceAccelerators(inferenceAccelerators.toList())

    override fun ipcMode(ipcMode: IpcMode) {
      cdkBuilder.ipcMode(ipcMode.let(IpcMode::unwrap))
    }

    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    override fun pidMode(pidMode: PidMode) {
      cdkBuilder.pidMode(pidMode.let(PidMode::unwrap))
    }

    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

    override fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfiguration::unwrap))
    }

    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    override fun volumes(volumes: List<Volume>) {
      cdkBuilder.volumes(volumes.map(Volume::unwrap))
    }

    override fun volumes(vararg volumes: Volume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ecs.Ec2TaskDefinition = cdkBuilder.build()
  }

  public companion object {
    public fun fromEc2TaskDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      ec2TaskDefinitionArn: String,
    ): IEc2TaskDefinition =
        software.amazon.awscdk.services.ecs.Ec2TaskDefinition.fromEc2TaskDefinitionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, ec2TaskDefinitionArn).let(IEc2TaskDefinition::wrap)

    public fun fromEc2TaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: Ec2TaskDefinitionAttributes,
    ): IEc2TaskDefinition =
        software.amazon.awscdk.services.ecs.Ec2TaskDefinition.fromEc2TaskDefinitionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(Ec2TaskDefinitionAttributes::unwrap)).let(IEc2TaskDefinition::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("831e03cd1177ff8a7b26c4aea6d55da95fb064478c439f83bd74f417450d0e79")
    public fun fromEc2TaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: Ec2TaskDefinitionAttributes.Builder.() -> Unit,
    ): IEc2TaskDefinition = fromEc2TaskDefinitionAttributes(scope, id,
        Ec2TaskDefinitionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Ec2TaskDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Ec2TaskDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Ec2TaskDefinition):
        Ec2TaskDefinition = Ec2TaskDefinition(cdkObject)

    internal fun unwrap(wrapped: Ec2TaskDefinition):
        software.amazon.awscdk.services.ecs.Ec2TaskDefinition = wrapped.cdkObject
  }
}
