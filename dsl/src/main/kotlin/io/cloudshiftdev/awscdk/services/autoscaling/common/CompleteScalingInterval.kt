package io.cloudshiftdev.awscdk.services.autoscaling.common

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface CompleteScalingInterval {
  /**
   *
   */
  public fun change(): Number? = unwrap(this).getChange()

  /**
   *
   */
  public fun lower(): Number

  /**
   *
   */
  public fun upper(): Number

  /**
   * A builder for [CompleteScalingInterval]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param change the value to be set.
     */
    public fun change(change: Number)

    /**
     * @param lower the value to be set. 
     */
    public fun lower(lower: Number)

    /**
     * @param upper the value to be set. 
     */
    public fun upper(upper: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval.Builder =
        software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval.builder()

    /**
     * @param change the value to be set.
     */
    override fun change(change: Number) {
      cdkBuilder.change(change)
    }

    /**
     * @param lower the value to be set. 
     */
    override fun lower(lower: Number) {
      cdkBuilder.lower(lower)
    }

    /**
     * @param upper the value to be set. 
     */
    override fun upper(upper: Number) {
      cdkBuilder.upper(upper)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval,
  ) : CdkObject(cdkObject), CompleteScalingInterval {
    /**
     *
     */
    override fun change(): Number? = unwrap(this).getChange()

    /**
     *
     */
    override fun lower(): Number = unwrap(this).getLower()

    /**
     *
     */
    override fun upper(): Number = unwrap(this).getUpper()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CompleteScalingInterval {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval):
        CompleteScalingInterval = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CompleteScalingInterval):
        software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval
  }
}
