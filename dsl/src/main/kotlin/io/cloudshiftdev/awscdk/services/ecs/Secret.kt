package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.ssm.IParameter
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Secret internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.Secret,
) {
  public open fun arn(): String = unwrap(this).getArn()

  public open fun grantRead(arg0: IGrantable): Grant =
      unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun hasField(): Boolean? = unwrap(this).getHasField()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.Secret,
  ) : Secret(cdkObject)

  public companion object {
    public open fun fromSecretsManager(secret: ISecret): Secret =
        software.amazon.awscdk.services.ecs.Secret.fromSecretsManager(secret.let(ISecret::unwrap)).let(Secret::wrap)

    public open fun fromSecretsManager(secret: ISecret, `field`: String): Secret =
        software.amazon.awscdk.services.ecs.Secret.fromSecretsManager(secret.let(ISecret::unwrap),
        `field`).let(Secret::wrap)

    public open fun fromSecretsManagerVersion(secret: ISecret, versionInfo: SecretVersionInfo):
        Secret =
        software.amazon.awscdk.services.ecs.Secret.fromSecretsManagerVersion(secret.let(ISecret::unwrap),
        versionInfo.let(SecretVersionInfo::unwrap)).let(Secret::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("920c861858a2d3dfda5936da694fb8ff6329cc08a1fb9d3f2bdebc5f069220cb")
    public open fun fromSecretsManagerVersion(secret: ISecret,
        versionInfo: SecretVersionInfo.Builder.() -> Unit): Secret =
        fromSecretsManagerVersion(secret, SecretVersionInfo(versionInfo))

    public open fun fromSecretsManagerVersion(
      secret: ISecret,
      versionInfo: SecretVersionInfo,
      `field`: String,
    ): Secret =
        software.amazon.awscdk.services.ecs.Secret.fromSecretsManagerVersion(secret.let(ISecret::unwrap),
        versionInfo.let(SecretVersionInfo::unwrap), `field`).let(Secret::wrap)

    public open fun fromSsmParameter(parameter: IParameter): Secret =
        software.amazon.awscdk.services.ecs.Secret.fromSsmParameter(parameter.let(IParameter::unwrap)).let(Secret::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Secret): Secret =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Secret): software.amazon.awscdk.services.ecs.Secret = (wrapped as
        Wrapper).cdkObject
  }
}
