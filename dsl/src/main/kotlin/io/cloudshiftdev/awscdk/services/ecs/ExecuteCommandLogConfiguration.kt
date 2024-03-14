package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ExecuteCommandLogConfiguration {
  public fun cloudWatchEncryptionEnabled(): Boolean? = unwrap(this).getCloudWatchEncryptionEnabled()

  public fun cloudWatchLogGroup(): ILogGroup? =
      unwrap(this).getCloudWatchLogGroup()?.let(ILogGroup::wrap)

  public fun s3Bucket(): IBucket? = unwrap(this).getS3Bucket()?.let(IBucket::wrap)

  public fun s3EncryptionEnabled(): Boolean? = unwrap(this).getS3EncryptionEnabled()

  public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

  public interface Builder {
    public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean) {
    }

    public fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup) {
    }

    public fun s3Bucket(s3Bucket: IBucket) {
    }

    public fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean) {
    }

    public fun s3KeyPrefix(s3KeyPrefix: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration.Builder =
        software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration.builder()

    public override fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean) {
      cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled)
    }

    public override fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup) {
      cdkBuilder.cloudWatchLogGroup(cloudWatchLogGroup.let(ILogGroup::unwrap))
    }

    public override fun s3Bucket(s3Bucket: IBucket) {
      cdkBuilder.s3Bucket(s3Bucket.let(IBucket::unwrap))
    }

    public override fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean) {
      cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled)
    }

    public override fun s3KeyPrefix(s3KeyPrefix: String) {
      cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration,
  ) : ExecuteCommandLogConfiguration {
    public override fun cloudWatchEncryptionEnabled(): Boolean? =
        unwrap(this).getCloudWatchEncryptionEnabled()

    public override fun cloudWatchLogGroup(): ILogGroup? =
        unwrap(this).getCloudWatchLogGroup()?.let(ILogGroup::wrap)

    public override fun s3Bucket(): IBucket? = unwrap(this).getS3Bucket()?.let(IBucket::wrap)

    public override fun s3EncryptionEnabled(): Boolean? = unwrap(this).getS3EncryptionEnabled()

    public override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ExecuteCommandLogConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration):
        ExecuteCommandLogConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExecuteCommandLogConfiguration):
        software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
