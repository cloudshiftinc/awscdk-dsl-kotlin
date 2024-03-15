@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface BasePathMappingOptions {
  public fun attachToStage(): Boolean? = unwrap(this).getAttachToStage()

  public fun basePath(): String? = unwrap(this).getBasePath()

  public fun stage(): Stage? = unwrap(this).getStage()?.let(Stage::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun attachToStage(attachToStage: Boolean)

    public fun basePath(basePath: String)

    public fun stage(stage: Stage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.BasePathMappingOptions.Builder =
        software.amazon.awscdk.services.apigateway.BasePathMappingOptions.builder()

    override fun attachToStage(attachToStage: Boolean) {
      cdkBuilder.attachToStage(attachToStage)
    }

    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    override fun stage(stage: Stage) {
      cdkBuilder.stage(stage.let(Stage::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.BasePathMappingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.BasePathMappingOptions,
  ) : CdkObject(cdkObject), BasePathMappingOptions {
    override fun attachToStage(): Boolean? = unwrap(this).getAttachToStage()

    override fun basePath(): String? = unwrap(this).getBasePath()

    override fun stage(): Stage? = unwrap(this).getStage()?.let(Stage::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BasePathMappingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.BasePathMappingOptions):
        BasePathMappingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasePathMappingOptions):
        software.amazon.awscdk.services.apigateway.BasePathMappingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.BasePathMappingOptions
  }
}