package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ILambdaApplication : IResource {
  public fun applicationArn(): String

  public fun applicationName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.ILambdaApplication,
  ) : ILambdaApplication {
    override fun applicationArn(): String = unwrap(this).getApplicationArn()

    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ILambdaApplication):
        ILambdaApplication = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILambdaApplication):
        software.amazon.awscdk.services.codedeploy.ILambdaApplication = (wrapped as
        Wrapper).cdkObject
  }
}