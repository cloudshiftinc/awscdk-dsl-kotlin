@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AssetStaging internal constructor(
  internal override val cdkObject: software.amazon.awscdk.AssetStaging,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun absoluteStagedPath(): String = unwrap(this).getAbsoluteStagedPath()

  public open fun assetHash(): String = unwrap(this).getAssetHash()

  public open fun isArchive(): Boolean = unwrap(this).getIsArchive()

  public open fun packaging(): FileAssetPackaging =
      unwrap(this).getPackaging().let(FileAssetPackaging::wrap)

  public open fun relativeStagedPath(stack: Stack): String =
      unwrap(this).relativeStagedPath(stack.let(Stack::unwrap))

  public open fun sourcePath(): String = unwrap(this).getSourcePath()

  @CdkDslMarker
  public interface Builder {
    public fun assetHash(assetHash: String)

    public fun assetHashType(assetHashType: AssetHashType)

    public fun bundling(bundling: BundlingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("051b0819f64bbb57788aa50ba0caecab92a6d0cb9e6d2d1c01f3b82d947476ca")
    public fun bundling(bundling: BundlingOptions.Builder.() -> Unit)

    public fun exclude(exclude: List<String>)

    public fun exclude(vararg exclude: String)

    public fun extraHash(extraHash: String)

    public fun follow(follow: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)

    public fun sourcePath(sourcePath: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.AssetStaging.Builder =
        software.amazon.awscdk.AssetStaging.Builder.create(scope, id)

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
    @JvmName("051b0819f64bbb57788aa50ba0caecab92a6d0cb9e6d2d1c01f3b82d947476ca")
    override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
        bundling(BundlingOptions(bundling))

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    override fun extraHash(extraHash: String) {
      cdkBuilder.extraHash(extraHash)
    }

    override fun follow(follow: SymlinkFollowMode) {
      cdkBuilder.follow(follow.let(SymlinkFollowMode::unwrap))
    }

    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    override fun sourcePath(sourcePath: String) {
      cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): software.amazon.awscdk.AssetStaging = cdkBuilder.build()
  }

  public companion object {
    public val BUNDLING_INPUT_DIR: String = software.amazon.awscdk.AssetStaging.BUNDLING_INPUT_DIR

    public val BUNDLING_OUTPUT_DIR: String = software.amazon.awscdk.AssetStaging.BUNDLING_OUTPUT_DIR

    public fun clearAssetHashCache() {
      software.amazon.awscdk.AssetStaging.clearAssetHashCache()
    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AssetStaging {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AssetStaging(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.AssetStaging): AssetStaging =
        AssetStaging(cdkObject)

    internal fun unwrap(wrapped: AssetStaging): software.amazon.awscdk.AssetStaging =
        wrapped.cdkObject
  }
}
