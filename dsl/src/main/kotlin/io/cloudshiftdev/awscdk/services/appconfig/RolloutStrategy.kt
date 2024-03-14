package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class RolloutStrategy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.RolloutStrategy,
) : CdkObject(cdkObject) {
  /**
   * The deployment duration of the rollout strategy.
   */
  public open fun deploymentDuration(): Duration =
      unwrap(this).getDeploymentDuration().let(Duration::wrap)

  /**
   * The final bake time of the deployment strategy.
   */
  public open fun finalBakeTime(): Duration? = unwrap(this).getFinalBakeTime()?.let(Duration::wrap)

  /**
   * The growth factor of the rollout strategy.
   */
  public open fun growthFactor(): Number = unwrap(this).getGrowthFactor()

  /**
   * The growth type of the rollout strategy.
   */
  public open fun growthType(): GrowthType? = unwrap(this).getGrowthType()?.let(GrowthType::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.RolloutStrategy,
  ) : RolloutStrategy(cdkObject)

  public companion object {
    public fun exponential(props: RolloutStrategyProps): RolloutStrategy =
        software.amazon.awscdk.services.appconfig.RolloutStrategy.exponential(props.let(RolloutStrategyProps::unwrap)).let(RolloutStrategy::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b95391bc997c59259d7da13e9d4226af5c6449088a5cb7689696ccffa5d774c0")
    public fun exponential(props: RolloutStrategyProps.Builder.() -> Unit): RolloutStrategy =
        exponential(RolloutStrategyProps(props))

    public fun linear(props: RolloutStrategyProps): RolloutStrategy =
        software.amazon.awscdk.services.appconfig.RolloutStrategy.linear(props.let(RolloutStrategyProps::unwrap)).let(RolloutStrategy::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a62b86213b48bce9dc8ddb4d37952843154a77d272725fc4be380b5d2758ef6")
    public fun linear(props: RolloutStrategyProps.Builder.() -> Unit): RolloutStrategy =
        linear(RolloutStrategyProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.RolloutStrategy):
        RolloutStrategy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RolloutStrategy):
        software.amazon.awscdk.services.appconfig.RolloutStrategy = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appconfig.RolloutStrategy
  }
}
