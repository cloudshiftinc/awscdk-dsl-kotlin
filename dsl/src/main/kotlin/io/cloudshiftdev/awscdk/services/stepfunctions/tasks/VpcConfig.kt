package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface VpcConfig {
  public fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

  public fun vpc(): IVpc

  public interface Builder {
    public fun subnets(subnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e50d9188ae71a4d38fd04c5df66494a22082ef9c80cc1796c4342205bc1bbcb9")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig.builder()

    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e50d9188ae71a4d38fd04c5df66494a22082ef9c80cc1796c4342205bc1bbcb9")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig,
  ) : VpcConfig {
    override fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig):
        VpcConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig = (wrapped as
        Wrapper).cdkObject
  }
}
