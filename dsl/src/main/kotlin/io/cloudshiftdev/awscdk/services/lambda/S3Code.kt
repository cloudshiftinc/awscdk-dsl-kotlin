package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean

public open class S3Code internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.S3Code,
) : Code(cdkObject) {
  /**
   * Called when the lambda or layer is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param _scope 
   */
  public override fun bind(_scope: Construct): CodeConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  /**
   * Determines whether this Code is inline code or not.
   */
  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.S3Code): S3Code =
        S3Code(cdkObject)

    internal fun unwrap(wrapped: S3Code): software.amazon.awscdk.services.lambda.S3Code =
        wrapped.cdkObject
  }
}
