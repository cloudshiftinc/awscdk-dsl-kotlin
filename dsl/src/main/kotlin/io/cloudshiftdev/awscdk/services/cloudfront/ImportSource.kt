package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class ImportSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.ImportSource,
) {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.ImportSource,
  ) : ImportSource(cdkObject)

  public companion object {
    public open fun fromAsset(path: String): ImportSource =
        software.amazon.awscdk.services.cloudfront.ImportSource.fromAsset(path).let(ImportSource::wrap)

    public open fun fromAsset(path: String, options: AssetOptions): ImportSource =
        software.amazon.awscdk.services.cloudfront.ImportSource.fromAsset(path,
        options.let(AssetOptions::unwrap)).let(ImportSource::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f124ce3ae32c31d3514a4d8c0a2163847255a9bb91b1e1eb8db2fc74831f451f")
    public open fun fromAsset(path: String, options: AssetOptions.Builder.() -> Unit): ImportSource
        = fromAsset(path, AssetOptions(options))

    public open fun fromBucket(bucket: IBucket, key: String): ImportSource =
        software.amazon.awscdk.services.cloudfront.ImportSource.fromBucket(bucket.let(IBucket::unwrap),
        key).let(ImportSource::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ImportSource):
        ImportSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ImportSource):
        software.amazon.awscdk.services.cloudfront.ImportSource = (wrapped as Wrapper).cdkObject
  }
}