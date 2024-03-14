package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class SecretValue internal constructor(
  internal override val cdkObject: software.amazon.awscdk.SecretValue,
) : Intrinsic(cdkObject) {
  /**
   * Resolve the secret.
   *
   * If the feature flag is not set, resolve as normal. Otherwise, throw a descriptive
   * error that the usage guard is missing.
   *
   * @param context 
   */
  public override fun resolve(context: IResolveContext): Any =
      unwrap(this).resolve(context.let(IResolveContext::unwrap))

  /**
   * Disable usage protection on this secret.
   *
   * Call this to indicate that you want to use the secret value held by this
   * object in an unchecked way. If you don't call this method, using the secret
   * value directly in a string context or as a property value somewhere will
   * produce an error.
   *
   * This method has 'unsafe' in the name on purpose! Make sure that the
   * construct property you are using the returned value in is does not end up
   * in a place in your AWS infrastructure where it could be read by anyone
   * unexpected.
   *
   * When in doubt, don't call this method and only pass the object to constructs that
   * accept `SecretValue` parameters.
   */
  public open fun unsafeUnwrap(): String = unwrap(this).unsafeUnwrap()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.SecretValue].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Capture the stack trace of where this token is created.
     *
     * Default: true
     *
     * @param stackTrace Capture the stack trace of where this token is created. 
     */
    public fun stackTrace(stackTrace: Boolean)

    /**
     * Type that this token is expected to evaluate to.
     *
     * Default: ResolutionTypeHint.STRING
     *
     * @param typeHint Type that this token is expected to evaluate to. 
     */
    public fun typeHint(typeHint: ResolutionTypeHint)
  }

  private class BuilderImpl(
    protectedValue: Any,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.SecretValue.Builder =
        software.amazon.awscdk.SecretValue.Builder.create(protectedValue)

    /**
     * Capture the stack trace of where this token is created.
     *
     * Default: true
     *
     * @param stackTrace Capture the stack trace of where this token is created. 
     */
    override fun stackTrace(stackTrace: Boolean) {
      cdkBuilder.stackTrace(stackTrace)
    }

    /**
     * Type that this token is expected to evaluate to.
     *
     * Default: ResolutionTypeHint.STRING
     *
     * @param typeHint Type that this token is expected to evaluate to. 
     */
    override fun typeHint(typeHint: ResolutionTypeHint) {
      cdkBuilder.typeHint(typeHint.let(ResolutionTypeHint::unwrap))
    }

    public fun build(): software.amazon.awscdk.SecretValue = cdkBuilder.build()
  }

  public companion object {
    public fun cfnDynamicReference(ref: CfnDynamicReference): SecretValue =
        software.amazon.awscdk.SecretValue.cfnDynamicReference(ref.let(CfnDynamicReference::unwrap)).let(SecretValue::wrap)

    public fun cfnParameter(`param`: CfnParameter): SecretValue =
        software.amazon.awscdk.SecretValue.cfnParameter(`param`.let(CfnParameter::unwrap)).let(SecretValue::wrap)

    public fun isSecretValue(x: Any): Boolean = software.amazon.awscdk.SecretValue.isSecretValue(x)

    @Deprecated(message = "deprecated in CDK")
    public fun plainText(secret: String): SecretValue =
        software.amazon.awscdk.SecretValue.plainText(secret).let(SecretValue::wrap)

    public fun resourceAttribute(attr: String): SecretValue =
        software.amazon.awscdk.SecretValue.resourceAttribute(attr).let(SecretValue::wrap)

    public fun secretsManager(secretId: String): SecretValue =
        software.amazon.awscdk.SecretValue.secretsManager(secretId).let(SecretValue::wrap)

    public fun secretsManager(secretId: String, options: SecretsManagerSecretOptions): SecretValue =
        software.amazon.awscdk.SecretValue.secretsManager(secretId,
        options.let(SecretsManagerSecretOptions::unwrap)).let(SecretValue::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3f7c9f1d82680cb6f5a02536b3a5ec5da53d07abf763bbfe93af1986e49e659")
    public fun secretsManager(secretId: String,
        options: SecretsManagerSecretOptions.Builder.() -> Unit): SecretValue =
        secretsManager(secretId, SecretsManagerSecretOptions(options))

    public fun ssmSecure(parameterName: String): SecretValue =
        software.amazon.awscdk.SecretValue.ssmSecure(parameterName).let(SecretValue::wrap)

    public fun ssmSecure(parameterName: String, version: String): SecretValue =
        software.amazon.awscdk.SecretValue.ssmSecure(parameterName, version).let(SecretValue::wrap)

    public fun unsafePlainText(secret: String): SecretValue =
        software.amazon.awscdk.SecretValue.unsafePlainText(secret).let(SecretValue::wrap)

    public operator fun invoke(protectedValue: Any, block: Builder.() -> Unit = {}): SecretValue {
      val builderImpl = BuilderImpl(protectedValue)
      return SecretValue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.SecretValue): SecretValue =
        SecretValue(cdkObject)

    internal fun unwrap(wrapped: SecretValue): software.amazon.awscdk.SecretValue =
        wrapped.cdkObject
  }
}
