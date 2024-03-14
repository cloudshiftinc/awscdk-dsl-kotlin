package io.cloudshiftdev.awscdk.services.opensearchservice

import kotlin.String
import kotlin.Unit

public interface DomainAttributes {
  public fun domainArn(): String

  public fun domainEndpoint(): String

  public interface Builder {
    public fun domainArn(domainArn: String) {
    }

    public fun domainEndpoint(domainEndpoint: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.DomainAttributes.Builder =
        software.amazon.awscdk.services.opensearchservice.DomainAttributes.builder()

    public override fun domainArn(domainArn: String) {
      cdkBuilder.domainArn(domainArn)
    }

    public override fun domainEndpoint(domainEndpoint: String) {
      cdkBuilder.domainEndpoint(domainEndpoint)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.DomainAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.opensearchservice.DomainAttributes,
  ) : DomainAttributes {
    public override fun domainArn(): String = unwrap(this).getDomainArn()

    public override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DomainAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.DomainAttributes):
        DomainAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainAttributes):
        software.amazon.awscdk.services.opensearchservice.DomainAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
