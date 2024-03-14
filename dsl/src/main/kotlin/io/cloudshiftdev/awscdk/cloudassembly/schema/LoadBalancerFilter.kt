package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LoadBalancerFilter {
  public fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

  public fun loadBalancerTags(): List<Tag> = unwrap(this).getLoadBalancerTags()?.map(Tag::wrap) ?:
      emptyList()

  public fun loadBalancerType(): LoadBalancerType

  public interface Builder {
    public fun loadBalancerArn(loadBalancerArn: String)

    public fun loadBalancerTags(loadBalancerTags: List<Tag>)

    public fun loadBalancerType(loadBalancerType: LoadBalancerType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter.Builder =
        software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter.builder()

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun loadBalancerTags(loadBalancerTags: List<Tag>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags.map(Tag::unwrap))
    }

    override fun loadBalancerType(loadBalancerType: LoadBalancerType) {
      cdkBuilder.loadBalancerType(loadBalancerType.let(LoadBalancerType::unwrap))
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter,
  ) : LoadBalancerFilter {
    override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerTags(): List<Tag> = unwrap(this).getLoadBalancerTags()?.map(Tag::wrap)
        ?: emptyList()

    override fun loadBalancerType(): LoadBalancerType =
        unwrap(this).getLoadBalancerType().let(LoadBalancerType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerFilter {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter):
        LoadBalancerFilter = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerFilter):
        software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter = (wrapped as
        Wrapper).cdkObject
  }
}