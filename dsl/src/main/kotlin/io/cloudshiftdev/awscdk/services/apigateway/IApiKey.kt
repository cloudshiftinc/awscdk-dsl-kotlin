package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IApiKey : IResource {
  public fun keyArn(): String

  public fun keyId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IApiKey,
  ) : IApiKey {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun keyArn(): String = unwrap(this).getKeyArn()

    override fun keyId(): String = unwrap(this).getKeyId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IApiKey): IApiKey =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApiKey): software.amazon.awscdk.services.apigateway.IApiKey =
        (wrapped as Wrapper).cdkObject
  }
}