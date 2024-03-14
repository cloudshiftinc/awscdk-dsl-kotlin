package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface AutoscaledCapacityOptions {
  /**
   * The maximum allowable capacity.
   */
  public fun maxCapacity(): Number

  /**
   * The minimum allowable capacity.
   *
   * Default: 1
   */
  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  /**
   * If you want to switch a table's billing mode from on-demand to provisioned or from provisioned
   * to on-demand, you must specify a value for this property for each autoscaled resource.
   *
   * Default: no seed capacity
   */
  public fun seedCapacity(): Number? = unwrap(this).getSeedCapacity()

  /**
   * The ratio of consumed capacity units to provisioned capacity units.
   *
   * Note: Target utilization percent cannot be less than 20 and cannot be greater
   * than 90.
   *
   * Default: 70
   */
  public fun targetUtilizationPercent(): Number? = unwrap(this).getTargetUtilizationPercent()

  /**
   * A builder for [AutoscaledCapacityOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxCapacity The maximum allowable capacity. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param minCapacity The minimum allowable capacity.
     */
    public fun minCapacity(minCapacity: Number)

    /**
     * @param seedCapacity If you want to switch a table's billing mode from on-demand to
     * provisioned or from provisioned to on-demand, you must specify a value for this property for
     * each autoscaled resource.
     */
    public fun seedCapacity(seedCapacity: Number)

    /**
     * @param targetUtilizationPercent The ratio of consumed capacity units to provisioned capacity
     * units.
     * Note: Target utilization percent cannot be less than 20 and cannot be greater
     * than 90.
     */
    public fun targetUtilizationPercent(targetUtilizationPercent: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions.Builder =
        software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions.builder()

    /**
     * @param maxCapacity The maximum allowable capacity. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity The minimum allowable capacity.
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param seedCapacity If you want to switch a table's billing mode from on-demand to
     * provisioned or from provisioned to on-demand, you must specify a value for this property for
     * each autoscaled resource.
     */
    override fun seedCapacity(seedCapacity: Number) {
      cdkBuilder.seedCapacity(seedCapacity)
    }

    /**
     * @param targetUtilizationPercent The ratio of consumed capacity units to provisioned capacity
     * units.
     * Note: Target utilization percent cannot be less than 20 and cannot be greater
     * than 90.
     */
    override fun targetUtilizationPercent(targetUtilizationPercent: Number) {
      cdkBuilder.targetUtilizationPercent(targetUtilizationPercent)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions,
  ) : CdkObject(cdkObject), AutoscaledCapacityOptions {
    /**
     * The maximum allowable capacity.
     */
    override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    /**
     * The minimum allowable capacity.
     *
     * Default: 1
     */
    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    /**
     * If you want to switch a table's billing mode from on-demand to provisioned or from
     * provisioned to on-demand, you must specify a value for this property for each autoscaled
     * resource.
     *
     * Default: no seed capacity
     */
    override fun seedCapacity(): Number? = unwrap(this).getSeedCapacity()

    /**
     * The ratio of consumed capacity units to provisioned capacity units.
     *
     * Note: Target utilization percent cannot be less than 20 and cannot be greater
     * than 90.
     *
     * Default: 70
     */
    override fun targetUtilizationPercent(): Number? = unwrap(this).getTargetUtilizationPercent()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AutoscaledCapacityOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions):
        AutoscaledCapacityOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoscaledCapacityOptions):
        software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.AutoscaledCapacityOptions
  }
}
