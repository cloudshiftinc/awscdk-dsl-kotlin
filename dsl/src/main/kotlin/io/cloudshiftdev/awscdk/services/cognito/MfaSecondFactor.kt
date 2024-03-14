package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface MfaSecondFactor {
  /**
   * The MFA token is a time-based one time password that is generated by a hardware or software
   * token.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-mfa-totp.html)
   */
  public fun otp(): Boolean

  /**
   * The MFA token is sent to the user via SMS to their verified phone numbers.
   *
   * Default: true
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-mfa-sms-text-message.html)
   */
  public fun sms(): Boolean

  /**
   * A builder for [MfaSecondFactor]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param otp The MFA token is a time-based one time password that is generated by a hardware or
     * software token. 
     */
    public fun otp(otp: Boolean)

    /**
     * @param sms The MFA token is sent to the user via SMS to their verified phone numbers. 
     */
    public fun sms(sms: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.MfaSecondFactor.Builder =
        software.amazon.awscdk.services.cognito.MfaSecondFactor.builder()

    /**
     * @param otp The MFA token is a time-based one time password that is generated by a hardware or
     * software token. 
     */
    override fun otp(otp: Boolean) {
      cdkBuilder.otp(otp)
    }

    /**
     * @param sms The MFA token is sent to the user via SMS to their verified phone numbers. 
     */
    override fun sms(sms: Boolean) {
      cdkBuilder.sms(sms)
    }

    public fun build(): software.amazon.awscdk.services.cognito.MfaSecondFactor = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.MfaSecondFactor,
  ) : CdkObject(cdkObject), MfaSecondFactor {
    /**
     * The MFA token is a time-based one time password that is generated by a hardware or software
     * token.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-mfa-totp.html)
     */
    override fun otp(): Boolean = unwrap(this).getOtp()

    /**
     * The MFA token is sent to the user via SMS to their verified phone numbers.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-mfa-sms-text-message.html)
     */
    override fun sms(): Boolean = unwrap(this).getSms()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MfaSecondFactor {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.MfaSecondFactor):
        MfaSecondFactor = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MfaSecondFactor):
        software.amazon.awscdk.services.cognito.MfaSecondFactor = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.MfaSecondFactor
  }
}
