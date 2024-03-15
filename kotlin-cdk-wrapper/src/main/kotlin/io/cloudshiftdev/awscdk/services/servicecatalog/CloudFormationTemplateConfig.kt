@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface CloudFormationTemplateConfig {
  public fun assetBucket(): IBucket? = unwrap(this).getAssetBucket()?.let(IBucket::wrap)

  public fun httpUrl(): String

  @CdkDslMarker
  public interface Builder {
    public fun assetBucket(assetBucket: IBucket)

    public fun httpUrl(httpUrl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig.Builder =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig.builder()

    override fun assetBucket(assetBucket: IBucket) {
      cdkBuilder.assetBucket(assetBucket.let(IBucket::unwrap))
    }

    override fun httpUrl(httpUrl: String) {
      cdkBuilder.httpUrl(httpUrl)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig,
  ) : CdkObject(cdkObject), CloudFormationTemplateConfig {
    override fun assetBucket(): IBucket? = unwrap(this).getAssetBucket()?.let(IBucket::wrap)

    override fun httpUrl(): String = unwrap(this).getHttpUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudFormationTemplateConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig):
        CloudFormationTemplateConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationTemplateConfig):
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig
  }
}
