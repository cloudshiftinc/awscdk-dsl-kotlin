package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ISourceApiAssociation : IResource {
  public fun associationArn(): String

  public fun associationId(): String

  public fun mergedApi(): IGraphqlApi

  public fun sourceApi(): IGraphqlApi

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.ISourceApiAssociation,
  ) : ISourceApiAssociation {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun associationArn(): String = unwrap(this).getAssociationArn()

    override fun associationId(): String = unwrap(this).getAssociationId()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun mergedApi(): IGraphqlApi = unwrap(this).getMergedApi().let(IGraphqlApi::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ISourceApiAssociation):
        ISourceApiAssociation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISourceApiAssociation):
        software.amazon.awscdk.services.appsync.ISourceApiAssociation = (wrapped as
        Wrapper).cdkObject
  }
}