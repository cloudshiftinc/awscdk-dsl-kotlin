package io.cloudshiftdev.awscdk.services.applicationautoscaling

import kotlin.Number
import kotlin.Unit

public interface EnableScalingProps {
  public fun maxCapacity(): Number

  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  public interface Builder {
    public fun maxCapacity(maxCapacity: Number)

    public fun minCapacity(minCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps.builder()

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps,
  ) : EnableScalingProps {
    override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EnableScalingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps):
        EnableScalingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnableScalingProps):
        software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps = (wrapped as
        Wrapper).cdkObject
  }
}
