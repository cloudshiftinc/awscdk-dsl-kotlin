package io.cloudshiftdev.awscdk.services.autoscaling

import kotlin.Number
import kotlin.Unit

public interface AdjustmentTier {
  public fun adjustment(): Number

  public fun lowerBound(): Number? = unwrap(this).getLowerBound()

  public fun upperBound(): Number? = unwrap(this).getUpperBound()

  public interface Builder {
    public fun adjustment(adjustment: Number)

    public fun lowerBound(lowerBound: Number)

    public fun upperBound(upperBound: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.AdjustmentTier.Builder =
        software.amazon.awscdk.services.autoscaling.AdjustmentTier.builder()

    override fun adjustment(adjustment: Number) {
      cdkBuilder.adjustment(adjustment)
    }

    override fun lowerBound(lowerBound: Number) {
      cdkBuilder.lowerBound(lowerBound)
    }

    override fun upperBound(upperBound: Number) {
      cdkBuilder.upperBound(upperBound)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.AdjustmentTier =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.AdjustmentTier,
  ) : AdjustmentTier {
    override fun adjustment(): Number = unwrap(this).getAdjustment()

    override fun lowerBound(): Number? = unwrap(this).getLowerBound()

    override fun upperBound(): Number? = unwrap(this).getUpperBound()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AdjustmentTier {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.AdjustmentTier):
        AdjustmentTier = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AdjustmentTier):
        software.amazon.awscdk.services.autoscaling.AdjustmentTier = (wrapped as Wrapper).cdkObject
  }
}
