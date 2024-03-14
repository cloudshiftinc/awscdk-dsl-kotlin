package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ResponseHeadersXSSProtection {
  public fun modeBlock(): Boolean? = unwrap(this).getModeBlock()

  public fun `override`(): Boolean

  public fun protection(): Boolean

  public fun reportUri(): String? = unwrap(this).getReportUri()

  public interface Builder {
    public fun modeBlock(modeBlock: Boolean) {
    }

    public fun `override`(`override`: Boolean) {
    }

    public fun protection(protection: Boolean) {
    }

    public fun reportUri(reportUri: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection.builder()

    public override fun modeBlock(modeBlock: Boolean) {
      cdkBuilder.modeBlock(modeBlock)
    }

    public override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    public override fun protection(protection: Boolean) {
      cdkBuilder.protection(protection)
    }

    public override fun reportUri(reportUri: String) {
      cdkBuilder.reportUri(reportUri)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection,
  ) : ResponseHeadersXSSProtection {
    public override fun modeBlock(): Boolean? = unwrap(this).getModeBlock()

    public override fun `override`(): Boolean = unwrap(this).getOverride()

    public override fun protection(): Boolean = unwrap(this).getProtection()

    public override fun reportUri(): String? = unwrap(this).getReportUri()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersXSSProtection {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection):
        ResponseHeadersXSSProtection = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersXSSProtection):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection = (wrapped as
        Wrapper).cdkObject
  }
}
