package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IConnection : IResource {
  public fun connectionArn(): String

  public fun connectionName(): String

  public fun connectionSecretArn(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.IConnection,
  ) : IConnection {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun connectionArn(): String = unwrap(this).getConnectionArn()

    override fun connectionName(): String = unwrap(this).getConnectionName()

    override fun connectionSecretArn(): String = unwrap(this).getConnectionSecretArn()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IConnection): IConnection =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IConnection): software.amazon.awscdk.services.events.IConnection =
        (wrapped as Wrapper).cdkObject
  }
}