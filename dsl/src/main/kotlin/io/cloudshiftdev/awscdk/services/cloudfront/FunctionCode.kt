package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class FunctionCode internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.FunctionCode,
) {
  public open fun render(): String = unwrap(this).render()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.FunctionCode,
  ) : FunctionCode(cdkObject)

  public companion object {
    public open fun fromFile(options: FileCodeOptions): FunctionCode =
        software.amazon.awscdk.services.cloudfront.FunctionCode.fromFile(options.let(FileCodeOptions::unwrap)).let(FunctionCode::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f53d4fdd60d88d1066ce14701c44b6e6aab79d38ec5e6f1245ba33b34e1e75d7")
    public open fun fromFile(options: FileCodeOptions.Builder.() -> Unit): FunctionCode =
        fromFile(FileCodeOptions(options))

    public open fun fromInline(code: String): FunctionCode =
        software.amazon.awscdk.services.cloudfront.FunctionCode.fromInline(code).let(FunctionCode::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FunctionCode):
        FunctionCode = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionCode):
        software.amazon.awscdk.services.cloudfront.FunctionCode = (wrapped as Wrapper).cdkObject
  }
}
