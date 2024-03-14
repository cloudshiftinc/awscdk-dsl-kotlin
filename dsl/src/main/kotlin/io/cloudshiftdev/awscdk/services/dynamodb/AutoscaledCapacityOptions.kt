package io.cloudshiftdev.awscdk.services.dynamodb

import kotlin.Number
import kotlin.Unit

public interface AutoscaledCapacityOptions {
  public fun maxCapacity(): Number

  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  public fun seedCapacity(): Number? = unwrap(this).getSeedCapacity()

  public fun targetUtilizationPercent(): Number? = unwrap(this).getTargetUtilizationPercent()

  public interface Builder {
    public fun maxCapacity(maxCapacity: Number)

    public fun minCapacity(minCapacity: Number)

    public fun seedCapacity(seedCapacity: Number)

    public fun targetUtilizationPercent(targetUtilizationPercent: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions.Builder =
        software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions.builder()

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    override fun seedCapacity(seedCapacity: Number) {
      cdkBuilder.seedCapacity(seedCapacity)
    }

    override fun targetUtilizationPercent(targetUtilizationPercent: Number) {
      cdkBuilder.targetUtilizationPercent(targetUtilizationPercent)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions,
  ) : AutoscaledCapacityOptions {
    override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    override fun seedCapacity(): Number? = unwrap(this).getSeedCapacity()

    override fun targetUtilizationPercent(): Number? = unwrap(this).getTargetUtilizationPercent()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AutoscaledCapacityOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions):
        AutoscaledCapacityOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoscaledCapacityOptions):
        software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions = (wrapped as
        Wrapper).cdkObject
  }
}
