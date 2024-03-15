@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AssetOptions {
  public fun assetHash(): String? = unwrap(this).getAssetHash()

  public fun assetHashType(): AssetHashType? =
      unwrap(this).getAssetHashType()?.let(AssetHashType::wrap)

  public fun bundling(): BundlingOptions? = unwrap(this).getBundling()?.let(BundlingOptions::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun assetHash(assetHash: String)

    public fun assetHashType(assetHashType: AssetHashType)

    public fun bundling(bundling: BundlingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab28d33e994f3bcf578da232f9f18828c83bb8c71639a3c730b57fb713dade02")
    public fun bundling(bundling: BundlingOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.AssetOptions.Builder =
        software.amazon.awscdk.AssetOptions.builder()

    override fun assetHash(assetHash: String) {
      cdkBuilder.assetHash(assetHash)
    }

    override fun assetHashType(assetHashType: AssetHashType) {
      cdkBuilder.assetHashType(assetHashType.let(AssetHashType::unwrap))
    }

    override fun bundling(bundling: BundlingOptions) {
      cdkBuilder.bundling(bundling.let(BundlingOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab28d33e994f3bcf578da232f9f18828c83bb8c71639a3c730b57fb713dade02")
    override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
        bundling(BundlingOptions(bundling))

    public fun build(): software.amazon.awscdk.AssetOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.AssetOptions,
  ) : CdkObject(cdkObject), AssetOptions {
    override fun assetHash(): String? = unwrap(this).getAssetHash()

    override fun assetHashType(): AssetHashType? =
        unwrap(this).getAssetHashType()?.let(AssetHashType::wrap)

    override fun bundling(): BundlingOptions? =
        unwrap(this).getBundling()?.let(BundlingOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.AssetOptions): AssetOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetOptions): software.amazon.awscdk.AssetOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.AssetOptions
  }
}