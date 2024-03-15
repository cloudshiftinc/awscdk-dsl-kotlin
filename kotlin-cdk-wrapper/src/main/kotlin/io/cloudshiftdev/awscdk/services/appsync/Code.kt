@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Code internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.Code,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct): CodeConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(CodeConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.Code,
  ) : Code(cdkObject)

  public companion object {
    public fun fromAsset(path: String): AssetCode =
        software.amazon.awscdk.services.appsync.Code.fromAsset(path).let(AssetCode::wrap)

    public fun fromAsset(path: String, options: AssetOptions): AssetCode =
        software.amazon.awscdk.services.appsync.Code.fromAsset(path,
        options.let(AssetOptions::unwrap)).let(AssetCode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6b30dc0029d3eae4bcdf8c40fd877adaafd1579c6e451b25506f9b13057af28")
    public fun fromAsset(path: String, options: AssetOptions.Builder.() -> Unit): AssetCode =
        fromAsset(path, AssetOptions(options))

    public fun fromInline(code: String): InlineCode =
        software.amazon.awscdk.services.appsync.Code.fromInline(code).let(InlineCode::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.Code): Code =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Code): software.amazon.awscdk.services.appsync.Code = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.Code
  }
}
