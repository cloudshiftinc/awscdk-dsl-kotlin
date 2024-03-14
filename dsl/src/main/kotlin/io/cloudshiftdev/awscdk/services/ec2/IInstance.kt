package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IInstance : IResource, IConnectable, IGrantable {
  public fun instanceAvailabilityZone(): String

  public fun instanceId(): String

  public fun instancePrivateDnsName(): String

  public fun instancePrivateIp(): String

  public fun instancePublicDnsName(): String

  public fun instancePublicIp(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IInstance,
  ) : IInstance {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    public override fun instanceAvailabilityZone(): String =
        unwrap(this).getInstanceAvailabilityZone()

    public override fun instanceId(): String = unwrap(this).getInstanceId()

    public override fun instancePrivateDnsName(): String = unwrap(this).getInstancePrivateDnsName()

    public override fun instancePrivateIp(): String = unwrap(this).getInstancePrivateIp()

    public override fun instancePublicDnsName(): String = unwrap(this).getInstancePublicDnsName()

    public override fun instancePublicIp(): String = unwrap(this).getInstancePublicIp()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IInstance): IInstance =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInstance): software.amazon.awscdk.services.ec2.IInstance =
        (wrapped as Wrapper).cdkObject
  }
}
