package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.Unit

public interface DistributionAttributes {
  public fun distributionId(): String

  public fun domainName(): String

  public interface Builder {
    public fun distributionId(distributionId: String)

    public fun domainName(domainName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.DistributionAttributes.Builder =
        software.amazon.awscdk.services.cloudfront.DistributionAttributes.builder()

    override fun distributionId(distributionId: String) {
      cdkBuilder.distributionId(distributionId)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.DistributionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.DistributionAttributes,
  ) : DistributionAttributes {
    override fun distributionId(): String = unwrap(this).getDistributionId()

    override fun domainName(): String = unwrap(this).getDomainName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DistributionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.DistributionAttributes):
        DistributionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DistributionAttributes):
        software.amazon.awscdk.services.cloudfront.DistributionAttributes = (wrapped as
        Wrapper).cdkObject
  }
}