package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Unit

public interface RepositoryImageProps {
  /**
   * The secret to expose to the container that contains the credentials for the image repository.
   *
   * The supported value is the full ARN of an AWS Secrets Manager secret.
   */
  public fun credentials(): ISecret? = unwrap(this).getCredentials()?.let(ISecret::wrap)

  /**
   * A builder for [RepositoryImageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param credentials The secret to expose to the container that contains the credentials for
     * the image repository.
     * The supported value is the full ARN of an AWS Secrets Manager secret.
     */
    public fun credentials(credentials: ISecret)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.RepositoryImageProps.Builder =
        software.amazon.awscdk.services.ecs.RepositoryImageProps.builder()

    /**
     * @param credentials The secret to expose to the container that contains the credentials for
     * the image repository.
     * The supported value is the full ARN of an AWS Secrets Manager secret.
     */
    override fun credentials(credentials: ISecret) {
      cdkBuilder.credentials(credentials.let(ISecret::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.RepositoryImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.RepositoryImageProps,
  ) : CdkObject(cdkObject), RepositoryImageProps {
    /**
     * The secret to expose to the container that contains the credentials for the image repository.
     *
     * The supported value is the full ARN of an AWS Secrets Manager secret.
     */
    override fun credentials(): ISecret? = unwrap(this).getCredentials()?.let(ISecret::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.RepositoryImageProps):
        RepositoryImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryImageProps):
        software.amazon.awscdk.services.ecs.RepositoryImageProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.RepositoryImageProps
  }
}
