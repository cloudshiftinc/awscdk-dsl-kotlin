package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Unit

public interface ActionBindOptions {
  public fun bucket(): IBucket

  public fun role(): IRole

  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.ActionBindOptions.Builder =
        software.amazon.awscdk.services.codepipeline.ActionBindOptions.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.ActionBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.ActionBindOptions,
  ) : ActionBindOptions {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ActionBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ActionBindOptions):
        ActionBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActionBindOptions):
        software.amazon.awscdk.services.codepipeline.ActionBindOptions = (wrapped as
        Wrapper).cdkObject
  }
}
