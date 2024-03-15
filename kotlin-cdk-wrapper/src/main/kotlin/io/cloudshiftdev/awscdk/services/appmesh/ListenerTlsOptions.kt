@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ListenerTlsOptions {
  public fun certificate(): TlsCertificate

  public fun mode(): TlsMode

  public fun mutualTlsValidation(): MutualTlsValidation? =
      unwrap(this).getMutualTlsValidation()?.let(MutualTlsValidation::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun certificate(certificate: TlsCertificate)

    public fun mode(mode: TlsMode)

    public fun mutualTlsValidation(mutualTlsValidation: MutualTlsValidation)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ec4217479ceb85446f582505d8719f66b85c0f5b545e50fd29876e73785781d")
    public fun mutualTlsValidation(mutualTlsValidation: MutualTlsValidation.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.ListenerTlsOptions.Builder =
        software.amazon.awscdk.services.appmesh.ListenerTlsOptions.builder()

    override fun certificate(certificate: TlsCertificate) {
      cdkBuilder.certificate(certificate.let(TlsCertificate::unwrap))
    }

    override fun mode(mode: TlsMode) {
      cdkBuilder.mode(mode.let(TlsMode::unwrap))
    }

    override fun mutualTlsValidation(mutualTlsValidation: MutualTlsValidation) {
      cdkBuilder.mutualTlsValidation(mutualTlsValidation.let(MutualTlsValidation::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ec4217479ceb85446f582505d8719f66b85c0f5b545e50fd29876e73785781d")
    override fun mutualTlsValidation(mutualTlsValidation: MutualTlsValidation.Builder.() -> Unit):
        Unit = mutualTlsValidation(MutualTlsValidation(mutualTlsValidation))

    public fun build(): software.amazon.awscdk.services.appmesh.ListenerTlsOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.ListenerTlsOptions,
  ) : CdkObject(cdkObject), ListenerTlsOptions {
    override fun certificate(): TlsCertificate =
        unwrap(this).getCertificate().let(TlsCertificate::wrap)

    override fun mode(): TlsMode = unwrap(this).getMode().let(TlsMode::wrap)

    override fun mutualTlsValidation(): MutualTlsValidation? =
        unwrap(this).getMutualTlsValidation()?.let(MutualTlsValidation::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ListenerTlsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.ListenerTlsOptions):
        ListenerTlsOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ListenerTlsOptions):
        software.amazon.awscdk.services.appmesh.ListenerTlsOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.ListenerTlsOptions
  }
}
