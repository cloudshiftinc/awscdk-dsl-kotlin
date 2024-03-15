@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.applicationautoscaling.Schedule
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.events.targets.Tag
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ScheduledTaskBaseProps {
  public fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

  public fun desiredTaskCount(): Number? = unwrap(this).getDesiredTaskCount()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun propagateTags(): PropagatedTagSource? =
      unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

  public fun ruleName(): String? = unwrap(this).getRuleName()

  public fun schedule(): Schedule

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  public fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: ICluster)

    public fun desiredTaskCount(desiredTaskCount: Number)

    public fun enabled(enabled: Boolean)

    public fun propagateTags(propagateTags: PropagatedTagSource)

    public fun ruleName(ruleName: String)

    public fun schedule(schedule: Schedule)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b776167e6c6d17a3f3af29a291c51e1c0339732037d63e37642e2870bc4aaddf")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun tags(tags: List<Tag>)

    public fun tags(vararg tags: Tag)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps.builder()

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun desiredTaskCount(desiredTaskCount: Number) {
      cdkBuilder.desiredTaskCount(desiredTaskCount)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b776167e6c6d17a3f3af29a291c51e1c0339732037d63e37642e2870bc4aaddf")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag::unwrap))
    }

    override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps,
  ) : CdkObject(cdkObject), ScheduledTaskBaseProps {
    override fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

    override fun desiredTaskCount(): Number? = unwrap(this).getDesiredTaskCount()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    override fun ruleName(): String? = unwrap(this).getRuleName()

    override fun schedule(): Schedule = unwrap(this).getSchedule().let(Schedule::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    override fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledTaskBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps):
        ScheduledTaskBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledTaskBaseProps):
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps
  }
}