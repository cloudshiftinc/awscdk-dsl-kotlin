package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class UpdatePolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.UpdatePolicy,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.UpdatePolicy,
  ) : UpdatePolicy(cdkObject)

  public companion object {
    public fun replacingUpdate(): UpdatePolicy =
        software.amazon.awscdk.services.autoscaling.UpdatePolicy.replacingUpdate().let(UpdatePolicy::wrap)

    public fun rollingUpdate(): UpdatePolicy =
        software.amazon.awscdk.services.autoscaling.UpdatePolicy.rollingUpdate().let(UpdatePolicy::wrap)

    public fun rollingUpdate(options: RollingUpdateOptions): UpdatePolicy =
        software.amazon.awscdk.services.autoscaling.UpdatePolicy.rollingUpdate(options.let(RollingUpdateOptions::unwrap)).let(UpdatePolicy::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("429eeac013535c93986670fd396dc6358d4fc7f0e2075067e1f84f6ba74ef5fc")
    public fun rollingUpdate(options: RollingUpdateOptions.Builder.() -> Unit): UpdatePolicy =
        rollingUpdate(RollingUpdateOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.UpdatePolicy):
        UpdatePolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UpdatePolicy):
        software.amazon.awscdk.services.autoscaling.UpdatePolicy = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.autoscaling.UpdatePolicy
  }
}
