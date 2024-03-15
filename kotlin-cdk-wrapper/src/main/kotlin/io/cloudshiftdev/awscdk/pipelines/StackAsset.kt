@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface StackAsset {
  public fun assetId(): String

  public fun assetManifestPath(): String

  public fun assetPublishingRoleArn(): String? = unwrap(this).getAssetPublishingRoleArn()

  public fun assetSelector(): String

  public fun assetType(): AssetType

  public fun isTemplate(): Boolean

  @CdkDslMarker
  public interface Builder {
    public fun assetId(assetId: String)

    public fun assetManifestPath(assetManifestPath: String)

    public fun assetPublishingRoleArn(assetPublishingRoleArn: String)

    public fun assetSelector(assetSelector: String)

    public fun assetType(assetType: AssetType)

    public fun isTemplate(isTemplate: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.StackAsset.Builder =
        software.amazon.awscdk.pipelines.StackAsset.builder()

    override fun assetId(assetId: String) {
      cdkBuilder.assetId(assetId)
    }

    override fun assetManifestPath(assetManifestPath: String) {
      cdkBuilder.assetManifestPath(assetManifestPath)
    }

    override fun assetPublishingRoleArn(assetPublishingRoleArn: String) {
      cdkBuilder.assetPublishingRoleArn(assetPublishingRoleArn)
    }

    override fun assetSelector(assetSelector: String) {
      cdkBuilder.assetSelector(assetSelector)
    }

    override fun assetType(assetType: AssetType) {
      cdkBuilder.assetType(assetType.let(AssetType::unwrap))
    }

    override fun isTemplate(isTemplate: Boolean) {
      cdkBuilder.isTemplate(isTemplate)
    }

    public fun build(): software.amazon.awscdk.pipelines.StackAsset = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.StackAsset,
  ) : CdkObject(cdkObject), StackAsset {
    override fun assetId(): String = unwrap(this).getAssetId()

    override fun assetManifestPath(): String = unwrap(this).getAssetManifestPath()

    override fun assetPublishingRoleArn(): String? = unwrap(this).getAssetPublishingRoleArn()

    override fun assetSelector(): String = unwrap(this).getAssetSelector()

    override fun assetType(): AssetType = unwrap(this).getAssetType().let(AssetType::wrap)

    override fun isTemplate(): Boolean = unwrap(this).getIsTemplate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StackAsset {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StackAsset): StackAsset =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackAsset): software.amazon.awscdk.pipelines.StackAsset = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.pipelines.StackAsset
  }
}
