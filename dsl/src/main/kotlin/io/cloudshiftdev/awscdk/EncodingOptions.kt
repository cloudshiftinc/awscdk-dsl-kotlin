package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface EncodingOptions {
  /**
   * A hint for the Token's purpose when stringifying it.
   */
  public fun displayHint(): String? = unwrap(this).getDisplayHint()

  /**
   * A builder for [EncodingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param displayHint A hint for the Token's purpose when stringifying it.
     */
    public fun displayHint(displayHint: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.EncodingOptions.Builder =
        software.amazon.awscdk.EncodingOptions.builder()

    /**
     * @param displayHint A hint for the Token's purpose when stringifying it.
     */
    override fun displayHint(displayHint: String) {
      cdkBuilder.displayHint(displayHint)
    }

    public fun build(): software.amazon.awscdk.EncodingOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.EncodingOptions,
  ) : CdkObject(cdkObject), EncodingOptions {
    /**
     * A hint for the Token's purpose when stringifying it.
     */
    override fun displayHint(): String? = unwrap(this).getDisplayHint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EncodingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.EncodingOptions): EncodingOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EncodingOptions): software.amazon.awscdk.EncodingOptions = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.EncodingOptions
  }
}
