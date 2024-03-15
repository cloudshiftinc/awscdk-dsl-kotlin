@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IOrigin {
  public fun bind(arg0: Construct, arg1: OriginBindOptions): OriginBindConfig

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4d8f445ceb4e4ebb177be4645de7fd3d72f0f5d66bcf420280cc1b7bc73b342")
  public fun bind(arg0: Construct, arg1: OriginBindOptions.Builder.() -> Unit): OriginBindConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.IOrigin,
  ) : CdkObject(cdkObject), IOrigin {
    override fun bind(arg0: Construct, arg1: OriginBindOptions): OriginBindConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(OriginBindOptions::unwrap)).let(OriginBindConfig::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4d8f445ceb4e4ebb177be4645de7fd3d72f0f5d66bcf420280cc1b7bc73b342")
    override fun bind(arg0: Construct, arg1: OriginBindOptions.Builder.() -> Unit): OriginBindConfig
        = bind(arg0, OriginBindOptions(arg1))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IOrigin): IOrigin =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IOrigin): software.amazon.awscdk.services.cloudfront.IOrigin =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IOrigin
  }
}
