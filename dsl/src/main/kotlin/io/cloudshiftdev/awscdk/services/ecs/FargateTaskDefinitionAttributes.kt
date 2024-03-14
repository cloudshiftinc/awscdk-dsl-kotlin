package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface FargateTaskDefinitionAttributes : CommonTaskDefinitionAttributes {
  public interface Builder {
    public fun executionRole(executionRole: IRole)

    public fun networkMode(networkMode: NetworkMode)

    public fun taskDefinitionArn(taskDefinitionArn: String)

    public fun taskRole(taskRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.FargateTaskDefinitionAttributes.Builder =
        software.amazon.awscdk.services.ecs.FargateTaskDefinitionAttributes.builder()

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

    public fun build(): software.amazon.awscdk.services.ecs.FargateTaskDefinitionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.FargateTaskDefinitionAttributes,
  ) : FargateTaskDefinitionAttributes {
    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    override fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

    override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()

    override fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FargateTaskDefinitionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FargateTaskDefinitionAttributes):
        FargateTaskDefinitionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FargateTaskDefinitionAttributes):
        software.amazon.awscdk.services.ecs.FargateTaskDefinitionAttributes = (wrapped as
        Wrapper).cdkObject
  }
}