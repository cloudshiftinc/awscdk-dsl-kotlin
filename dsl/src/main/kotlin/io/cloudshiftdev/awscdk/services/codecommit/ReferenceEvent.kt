package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class ReferenceEvent internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codecommit.ReferenceEvent,
) : CdkObject(cdkObject) {
  public companion object {
    public fun commitId(): String =
        software.amazon.awscdk.services.codecommit.ReferenceEvent.getCommitId()

    public fun eventType(): String =
        software.amazon.awscdk.services.codecommit.ReferenceEvent.getEventType()

    public fun referenceFullName(): String =
        software.amazon.awscdk.services.codecommit.ReferenceEvent.getReferenceFullName()

    public fun referenceName(): String =
        software.amazon.awscdk.services.codecommit.ReferenceEvent.getReferenceName()

    public fun referenceType(): String =
        software.amazon.awscdk.services.codecommit.ReferenceEvent.getReferenceType()

    public fun repositoryId(): String =
        software.amazon.awscdk.services.codecommit.ReferenceEvent.getRepositoryId()

    public fun repositoryName(): String =
        software.amazon.awscdk.services.codecommit.ReferenceEvent.getRepositoryName()

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.ReferenceEvent):
        ReferenceEvent = ReferenceEvent(cdkObject)

    internal fun unwrap(wrapped: ReferenceEvent):
        software.amazon.awscdk.services.codecommit.ReferenceEvent = wrapped.cdkObject
  }
}
