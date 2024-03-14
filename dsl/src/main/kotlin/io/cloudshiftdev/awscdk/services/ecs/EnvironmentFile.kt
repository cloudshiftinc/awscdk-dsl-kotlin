package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class EnvironmentFile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.EnvironmentFile,
) {
  public open fun bind(arg0: Construct): EnvironmentFileConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(EnvironmentFileConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.EnvironmentFile,
  ) : EnvironmentFile(cdkObject)

  public companion object {
    public open fun fromAsset(path: String): AssetEnvironmentFile =
        software.amazon.awscdk.services.ecs.EnvironmentFile.fromAsset(path).let(AssetEnvironmentFile::wrap)

    public open fun fromAsset(path: String, options: AssetOptions): AssetEnvironmentFile =
        software.amazon.awscdk.services.ecs.EnvironmentFile.fromAsset(path,
        options.let(AssetOptions::unwrap)).let(AssetEnvironmentFile::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("edeec1152b0bf37aee91af633844d9f37c3d95bf602d5a2e342201186b0d53ef")
    public open fun fromAsset(path: String, options: AssetOptions.Builder.() -> Unit):
        AssetEnvironmentFile = fromAsset(path, AssetOptions(options))

    public open fun fromBucket(bucket: IBucket, key: String): S3EnvironmentFile =
        software.amazon.awscdk.services.ecs.EnvironmentFile.fromBucket(bucket.let(IBucket::unwrap),
        key).let(S3EnvironmentFile::wrap)

    public open fun fromBucket(
      bucket: IBucket,
      key: String,
      objectVersion: String,
    ): S3EnvironmentFile =
        software.amazon.awscdk.services.ecs.EnvironmentFile.fromBucket(bucket.let(IBucket::unwrap),
        key, objectVersion).let(S3EnvironmentFile::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EnvironmentFile):
        EnvironmentFile = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentFile):
        software.amazon.awscdk.services.ecs.EnvironmentFile = (wrapped as Wrapper).cdkObject
  }
}