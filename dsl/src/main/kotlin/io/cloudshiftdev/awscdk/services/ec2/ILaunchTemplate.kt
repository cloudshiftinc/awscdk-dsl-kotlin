package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ILaunchTemplate : IResource {
  public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

  public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  public fun versionNumber(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.ILaunchTemplate,
  ) : ILaunchTemplate {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun versionNumber(): String = unwrap(this).getVersionNumber()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ILaunchTemplate):
        ILaunchTemplate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILaunchTemplate):
        software.amazon.awscdk.services.ec2.ILaunchTemplate = (wrapped as Wrapper).cdkObject
  }
}
