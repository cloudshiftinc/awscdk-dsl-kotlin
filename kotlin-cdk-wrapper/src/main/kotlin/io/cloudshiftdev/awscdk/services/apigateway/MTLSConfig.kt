@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface MTLSConfig {
  public fun bucket(): IBucket

  public fun key(): String

  public fun version(): String? = unwrap(this).getVersion()

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun key(key: String)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.MTLSConfig.Builder =
        software.amazon.awscdk.services.apigateway.MTLSConfig.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.MTLSConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.MTLSConfig,
  ) : CdkObject(cdkObject), MTLSConfig {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun key(): String = unwrap(this).getKey()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MTLSConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.MTLSConfig): MTLSConfig
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MTLSConfig): software.amazon.awscdk.services.apigateway.MTLSConfig
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.MTLSConfig
  }
}