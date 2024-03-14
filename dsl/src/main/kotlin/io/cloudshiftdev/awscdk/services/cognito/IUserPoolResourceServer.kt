package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IUserPoolResourceServer : IResource {
  public fun userPoolResourceServerId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.IUserPoolResourceServer,
  ) : IUserPoolResourceServer {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun userPoolResourceServerId(): String = unwrap(this).getUserPoolResourceServerId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.IUserPoolResourceServer):
        IUserPoolResourceServer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IUserPoolResourceServer):
        software.amazon.awscdk.services.cognito.IUserPoolResourceServer = (wrapped as
        Wrapper).cdkObject
  }
}
