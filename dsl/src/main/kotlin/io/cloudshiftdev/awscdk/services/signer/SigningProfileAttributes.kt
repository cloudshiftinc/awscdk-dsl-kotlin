package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface SigningProfileAttributes {
  /**
   * The name of signing profile.
   */
  public fun signingProfileName(): String

  /**
   * The version of signing profile.
   */
  public fun signingProfileVersion(): String

  /**
   * A builder for [SigningProfileAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param signingProfileName The name of signing profile. 
     */
    public fun signingProfileName(signingProfileName: String)

    /**
     * @param signingProfileVersion The version of signing profile. 
     */
    public fun signingProfileVersion(signingProfileVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.SigningProfileAttributes.Builder
        = software.amazon.awscdk.services.signer.SigningProfileAttributes.builder()

    /**
     * @param signingProfileName The name of signing profile. 
     */
    override fun signingProfileName(signingProfileName: String) {
      cdkBuilder.signingProfileName(signingProfileName)
    }

    /**
     * @param signingProfileVersion The version of signing profile. 
     */
    override fun signingProfileVersion(signingProfileVersion: String) {
      cdkBuilder.signingProfileVersion(signingProfileVersion)
    }

    public fun build(): software.amazon.awscdk.services.signer.SigningProfileAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.signer.SigningProfileAttributes,
  ) : CdkObject(cdkObject), SigningProfileAttributes {
    /**
     * The name of signing profile.
     */
    override fun signingProfileName(): String = unwrap(this).getSigningProfileName()

    /**
     * The version of signing profile.
     */
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
