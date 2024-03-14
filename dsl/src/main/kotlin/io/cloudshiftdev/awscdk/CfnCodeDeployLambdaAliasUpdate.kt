package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface CfnCodeDeployLambdaAliasUpdate {
  public fun afterAllowTrafficHook(): String? = unwrap(this).getAfterAllowTrafficHook()

  public fun applicationName(): String

  public fun beforeAllowTrafficHook(): String? = unwrap(this).getBeforeAllowTrafficHook()

  public fun deploymentGroupName(): String

  public interface Builder {
    public fun afterAllowTrafficHook(afterAllowTrafficHook: String)

    public fun applicationName(applicationName: String)

    public fun beforeAllowTrafficHook(beforeAllowTrafficHook: String)

    public fun deploymentGroupName(deploymentGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate.Builder =
        software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate.builder()

    override fun afterAllowTrafficHook(afterAllowTrafficHook: String) {
      cdkBuilder.afterAllowTrafficHook(afterAllowTrafficHook)
    }

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun beforeAllowTrafficHook(beforeAllowTrafficHook: String) {
      cdkBuilder.beforeAllowTrafficHook(beforeAllowTrafficHook)
    }

    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun build(): software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate,
  ) : CfnCodeDeployLambdaAliasUpdate {
    override fun afterAllowTrafficHook(): String? = unwrap(this).getAfterAllowTrafficHook()

    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun beforeAllowTrafficHook(): String? = unwrap(this).getBeforeAllowTrafficHook()

    override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCodeDeployLambdaAliasUpdate {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate):
        CfnCodeDeployLambdaAliasUpdate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployLambdaAliasUpdate):
        software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate = (wrapped as Wrapper).cdkObject
  }
}