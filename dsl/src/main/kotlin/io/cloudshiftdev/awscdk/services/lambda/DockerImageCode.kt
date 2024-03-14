package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.services.ecr.IRepository
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class DockerImageCode internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.DockerImageCode,
) {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.DockerImageCode,
  ) : DockerImageCode(cdkObject)

  public companion object {
    public open fun fromEcr(repository: IRepository): DockerImageCode =
        software.amazon.awscdk.services.lambda.DockerImageCode.fromEcr(repository.let(IRepository::unwrap)).let(DockerImageCode::wrap)

    public open fun fromEcr(repository: IRepository, props: EcrImageCodeProps): DockerImageCode =
        software.amazon.awscdk.services.lambda.DockerImageCode.fromEcr(repository.let(IRepository::unwrap),
        props.let(EcrImageCodeProps::unwrap)).let(DockerImageCode::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a068e59d0ef7e88c3a454c3b30641e7c445a629e3f5358d04033959b44107e55")
    public open fun fromEcr(repository: IRepository, props: EcrImageCodeProps.Builder.() -> Unit):
        DockerImageCode = fromEcr(repository, EcrImageCodeProps(props))

    public open fun fromImageAsset(directory: String): DockerImageCode =
        software.amazon.awscdk.services.lambda.DockerImageCode.fromImageAsset(directory).let(DockerImageCode::wrap)

    public open fun fromImageAsset(directory: String, props: AssetImageCodeProps): DockerImageCode =
        software.amazon.awscdk.services.lambda.DockerImageCode.fromImageAsset(directory,
        props.let(AssetImageCodeProps::unwrap)).let(DockerImageCode::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67c92a6cf6fedc397b1923c153f0cd368aa267b7db106768981b7d93178e52bc")
    public open fun fromImageAsset(directory: String,
        props: AssetImageCodeProps.Builder.() -> Unit): DockerImageCode = fromImageAsset(directory,
        AssetImageCodeProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DockerImageCode):
        DockerImageCode = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageCode):
        software.amazon.awscdk.services.lambda.DockerImageCode = (wrapped as Wrapper).cdkObject
  }
}
