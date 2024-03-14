package io.cloudshiftdev.awscdk.services.synthetics

import kotlin.String

public open class Runtime internal constructor(
  private val cdkObject: software.amazon.awscdk.services.synthetics.Runtime,
) {
  public open fun family(): RuntimeFamily = unwrap(this).getFamily().let(RuntimeFamily::wrap)

  public open fun name(): String = unwrap(this).getName()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Runtime): Runtime =
        Runtime(cdkObject)

    internal fun unwrap(wrapped: Runtime): software.amazon.awscdk.services.synthetics.Runtime =
        wrapped.cdkObject
  }
}
