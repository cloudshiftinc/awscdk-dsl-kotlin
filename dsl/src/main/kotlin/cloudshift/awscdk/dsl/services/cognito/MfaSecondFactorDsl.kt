@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.MfaSecondFactor

/**
 * The different ways in which a user pool can obtain their MFA token for sign in.
 *
 * Example:
 *
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * // ...
 * .mfa(Mfa.REQUIRED)
 * .mfaSecondFactor(MfaSecondFactor.builder()
 * .sms(true)
 * .otp(true)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-mfa.html)
 */
@CdkDslMarker
public class MfaSecondFactorDsl {
  private val cdkBuilder: MfaSecondFactor.Builder = MfaSecondFactor.builder()

  /**
   * @param otp The MFA token is a time-based one time password that is generated by a hardware or
   * software token. 
   */
  public fun otp(otp: Boolean) {
    cdkBuilder.otp(otp)
  }

  /**
   * @param sms The MFA token is sent to the user via SMS to their verified phone numbers. 
   */
  public fun sms(sms: Boolean) {
    cdkBuilder.sms(sms)
  }

  public fun build(): MfaSecondFactor = cdkBuilder.build()
}
