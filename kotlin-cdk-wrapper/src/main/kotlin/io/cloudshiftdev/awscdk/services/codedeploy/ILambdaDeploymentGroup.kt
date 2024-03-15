@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ILambdaDeploymentGroup : IResource {
  public fun application(): ILambdaApplication

  public fun deploymentConfig(): ILambdaDeploymentConfig

  public fun deploymentGroupArn(): String

  public fun deploymentGroupName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.ILambdaDeploymentGroup,
  ) : CdkObject(cdkObject), ILambdaDeploymentGroup {
    override fun application(): ILambdaApplication =
        unwrap(this).getApplication().let(ILambdaApplication::wrap)

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun deploymentConfig(): ILambdaDeploymentConfig =
        unwrap(this).getDeploymentConfig().let(ILambdaDeploymentConfig::wrap)

    override fun deploymentGroupArn(): String = unwrap(this).getDeploymentGroupArn()

    override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ILambdaDeploymentGroup):
        ILambdaDeploymentGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILambdaDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.ILambdaDeploymentGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.ILambdaDeploymentGroup
  }
}