@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties of CloudFront OriginAccessIdentity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * OriginAccessIdentityProps originAccessIdentityProps = OriginAccessIdentityProps.builder()
 * .comment("comment")
 * .build();
 * ```
 */
public interface OriginAccessIdentityProps {
  /**
   * Any comments you want to include about the origin access identity.
   *
   * Default: "Allows CloudFront to reach the bucket"
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * A builder for [OriginAccessIdentityProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment Any comments you want to include about the origin access identity.
     */
    public fun comment(comment: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps.Builder =
        software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps.builder()

    /**
     * @param comment Any comments you want to include about the origin access identity.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps,
  ) : CdkObject(cdkObject), OriginAccessIdentityProps {
    /**
     * Any comments you want to include about the origin access identity.
     *
     * Default: "Allows CloudFront to reach the bucket"
     */
    override fun comment(): String? = unwrap(this).getComment()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginAccessIdentityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps):
        OriginAccessIdentityProps = CdkObjectWrappers.wrap(cdkObject) as? OriginAccessIdentityProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginAccessIdentityProps):
        software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps
  }
}
