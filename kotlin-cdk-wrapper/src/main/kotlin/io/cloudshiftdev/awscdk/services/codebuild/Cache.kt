@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Cache internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.Cache,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.Cache,
  ) : Cache(cdkObject)

  public companion object {
    public fun bucket(bucket: IBucket): Cache =
        software.amazon.awscdk.services.codebuild.Cache.bucket(bucket.let(IBucket::unwrap)).let(Cache::wrap)

    public fun bucket(bucket: IBucket, options: BucketCacheOptions): Cache =
        software.amazon.awscdk.services.codebuild.Cache.bucket(bucket.let(IBucket::unwrap),
        options.let(BucketCacheOptions::unwrap)).let(Cache::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6eb3d0edf88b31d8b205a25aad1fee39fac0902b3ecfcfda69f004457e7f5f4")
    public fun bucket(bucket: IBucket, options: BucketCacheOptions.Builder.() -> Unit): Cache =
        bucket(bucket, BucketCacheOptions(options))

    public fun local(modes: LocalCacheMode): Cache =
        software.amazon.awscdk.services.codebuild.Cache.local(modes.let(LocalCacheMode::unwrap)).let(Cache::wrap)

    public fun none(): Cache =
        software.amazon.awscdk.services.codebuild.Cache.none().let(Cache::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.Cache): Cache =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Cache): software.amazon.awscdk.services.codebuild.Cache = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.Cache
  }
}