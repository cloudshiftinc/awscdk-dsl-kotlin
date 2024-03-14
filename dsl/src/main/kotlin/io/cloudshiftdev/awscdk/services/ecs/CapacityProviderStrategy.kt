package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CapacityProviderStrategy {
  public fun base(): Number? = unwrap(this).getBase()

  public fun capacityProvider(): String

  public fun weight(): Number? = unwrap(this).getWeight()

  public interface Builder {
    public fun base(base: Number)

    public fun capacityProvider(capacityProvider: String)

    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CapacityProviderStrategy.Builder =
        software.amazon.awscdk.services.ecs.CapacityProviderStrategy.builder()

    override fun base(base: Number) {
      cdkBuilder.base(base)
    }

    override fun capacityProvider(capacityProvider: String) {
      cdkBuilder.capacityProvider(capacityProvider)
    }

    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CapacityProviderStrategy =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.CapacityProviderStrategy,
  ) : CapacityProviderStrategy {
    override fun base(): Number? = unwrap(this).getBase()

    override fun capacityProvider(): String = unwrap(this).getCapacityProvider()

    override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CapacityProviderStrategy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CapacityProviderStrategy):
        CapacityProviderStrategy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CapacityProviderStrategy):
        software.amazon.awscdk.services.ecs.CapacityProviderStrategy = (wrapped as
        Wrapper).cdkObject
  }
}