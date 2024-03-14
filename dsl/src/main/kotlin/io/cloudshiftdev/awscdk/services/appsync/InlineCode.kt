package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.constructs.Construct

public open class InlineCode internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.InlineCode,
) : Code(cdkObject) {
  public override fun bind(_scope: Construct): CodeConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.InlineCode): InlineCode =
        InlineCode(cdkObject)

    internal fun unwrap(wrapped: InlineCode): software.amazon.awscdk.services.appsync.InlineCode =
        wrapped.cdkObject
  }
}
