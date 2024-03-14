package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface S3OriginConfig {
  public fun originAccessIdentity(): IOriginAccessIdentity? =
      unwrap(this).getOriginAccessIdentity()?.let(IOriginAccessIdentity::wrap)

  public fun originHeaders(): Map<String, String> = unwrap(this).getOriginHeaders() ?: emptyMap()

  public fun originPath(): String? = unwrap(this).getOriginPath()

  public fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

  public fun s3BucketSource(): IBucket

  public interface Builder {
    public fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity) {
    }

    public fun originHeaders(originHeaders: Map<String, String>) {
    }

    public fun originPath(originPath: String) {
    }

    public fun originShieldRegion(originShieldRegion: String) {
    }

    public fun s3BucketSource(s3BucketSource: IBucket) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.S3OriginConfig.Builder =
        software.amazon.awscdk.services.cloudfront.S3OriginConfig.builder()

    public override fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity) {
      cdkBuilder.originAccessIdentity(originAccessIdentity.let(IOriginAccessIdentity::unwrap))
    }

    public override fun originHeaders(originHeaders: Map<String, String>) {
      cdkBuilder.originHeaders(originHeaders)
    }

    public override fun originPath(originPath: String) {
      cdkBuilder.originPath(originPath)
    }

    public override fun originShieldRegion(originShieldRegion: String) {
      cdkBuilder.originShieldRegion(originShieldRegion)
    }

    public override fun s3BucketSource(s3BucketSource: IBucket) {
      cdkBuilder.s3BucketSource(s3BucketSource.let(IBucket::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.S3OriginConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.S3OriginConfig,
  ) : S3OriginConfig {
    public override fun originAccessIdentity(): IOriginAccessIdentity? =
        unwrap(this).getOriginAccessIdentity()?.let(IOriginAccessIdentity::wrap)

    public override fun originHeaders(): Map<String, String> = unwrap(this).getOriginHeaders() ?:
        emptyMap()

    public override fun originPath(): String? = unwrap(this).getOriginPath()

    public override fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

    public override fun s3BucketSource(): IBucket =
        unwrap(this).getS3BucketSource().let(IBucket::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): S3OriginConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.S3OriginConfig):
        S3OriginConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3OriginConfig):
        software.amazon.awscdk.services.cloudfront.S3OriginConfig = (wrapped as Wrapper).cdkObject
  }
}
