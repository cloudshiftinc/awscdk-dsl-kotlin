package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface OriginBindOptions {
  /**
   * The identifier of this Origin, as assigned by the Distribution this Origin has been used added
   * to.
   */
  public fun originId(): String

  /**
   * A builder for [OriginBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param originId The identifier of this Origin, as assigned by the Distribution this Origin
     * has been used added to. 
     */
    public fun originId(originId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginBindOptions.Builder =
        software.amazon.awscdk.services.cloudfront.OriginBindOptions.builder()

    /**
     * @param originId The identifier of this Origin, as assigned by the Distribution this Origin
     * has been used added to. 
     */
    override fun originId(originId: String) {
      cdkBuilder.originId(originId)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.OriginBindOptions,
  ) : CdkObject(cdkObject), OriginBindOptions {
    /**
     * The identifier of this Origin, as assigned by the Distribution this Origin has been used
     * added to.
     */
    override fun originId(): String = unwrap(this).getOriginId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginBindOptions):
        OriginBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginBindOptions):
        software.amazon.awscdk.services.cloudfront.OriginBindOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.OriginBindOptions
  }
}
