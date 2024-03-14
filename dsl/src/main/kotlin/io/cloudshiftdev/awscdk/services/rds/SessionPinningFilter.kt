package io.cloudshiftdev.awscdk.services.rds

import kotlin.String

public open class SessionPinningFilter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.SessionPinningFilter,
) {
  public open fun filterName(): String = unwrap(this).getFilterName()

  public companion object {
    public open fun of(filterName: String): SessionPinningFilter =
        software.amazon.awscdk.services.rds.SessionPinningFilter.of(filterName).let(SessionPinningFilter::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.SessionPinningFilter):
        SessionPinningFilter = SessionPinningFilter(cdkObject)

    internal fun unwrap(wrapped: SessionPinningFilter):
        software.amazon.awscdk.services.rds.SessionPinningFilter = wrapped.cdkObject
  }
}