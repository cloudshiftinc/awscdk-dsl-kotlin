@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SigningProfileAttributes {
  public fun signingProfileName(): String

  public fun signingProfileVersion(): String

  @CdkDslMarker
  public interface Builder {
    public fun signingProfileName(signingProfileName: String)

    public fun signingProfileVersion(signingProfileVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.SigningProfileAttributes.Builder
        = software.amazon.awscdk.services.signer.SigningProfileAttributes.builder()

    override fun signingProfileName(signingProfileName: String) {
      cdkBuilder.signingProfileName(signingProfileName)
    }

    override fun signingProfileVersion(signingProfileVersion: String) {
      cdkBuilder.signingProfileVersion(signingProfileVersion)
    }

    public fun build(): software.amazon.awscdk.services.signer.SigningProfileAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.signer.SigningProfileAttributes,
  ) : CdkObject(cdkObject), SigningProfileAttributes {
    override fun signingProfileName(): String = unwrap(this).getSigningProfileName()

    override fun signingProfileVersion(): String = unwrap(this).getSigningProfileVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SigningProfileAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.SigningProfileAttributes):
        SigningProfileAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SigningProfileAttributes):
        software.amazon.awscdk.services.signer.SigningProfileAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.signer.SigningProfileAttributes
  }
}