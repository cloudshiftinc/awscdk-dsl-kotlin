package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface TaskDefinitionAttributes : CommonTaskDefinitionAttributes {
  public fun compatibility(): Compatibility? =
      unwrap(this).getCompatibility()?.let(Compatibility::wrap)

  public interface Builder {
    public fun compatibility(compatibility: Compatibility)

    public fun executionRole(executionRole: IRole)

    public fun networkMode(networkMode: NetworkMode)

    public fun taskDefinitionArn(taskDefinitionArn: String)

    public fun taskRole(taskRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.TaskDefinitionAttributes.Builder =
        software.amazon.awscdk.services.ecs.TaskDefinitionAttributes.builder()

    override fun compatibility(compatibility: Compatibility) {
      cdkBuilder.compatibility(compatibility.let(Compatibility::unwrap))
    }

    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    override fun taskDefinitionArn(taskDefinitionArn: String) {
      cdkBuilder.taskDefinitionArn(taskDefinitionArn)
    }

    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.TaskDefinitionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.TaskDefinitionAttributes,
  ) : TaskDefinitionAttributes {
    override fun compatibility(): Compatibility? =
        unwrap(this).getCompatibility()?.let(Compatibility::wrap)

    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    override fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

    override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()

    override fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TaskDefinitionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.TaskDefinitionAttributes):
        TaskDefinitionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaskDefinitionAttributes):
        software.amazon.awscdk.services.ecs.TaskDefinitionAttributes = (wrapped as
        Wrapper).cdkObject
  }
}