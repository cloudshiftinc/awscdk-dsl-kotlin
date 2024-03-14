package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String

public open class PartitionKey internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.PartitionKey,
) : PrimaryKey(cdkObject) {
  public open fun sort(key: String): SortKeyStep = unwrap(this).sort(key).let(SortKeyStep::wrap)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.PartitionKey): PartitionKey
        = PartitionKey(cdkObject)

    internal fun unwrap(wrapped: PartitionKey): software.amazon.awscdk.services.appsync.PartitionKey
        = wrapped.cdkObject
  }
}
