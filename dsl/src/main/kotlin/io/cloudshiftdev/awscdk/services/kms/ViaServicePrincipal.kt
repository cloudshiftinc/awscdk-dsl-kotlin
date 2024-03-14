package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.services.iam.PrincipalBase
import io.cloudshiftdev.awscdk.services.iam.PrincipalPolicyFragment
import kotlin.String

public open class ViaServicePrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kms.ViaServicePrincipal,
) : PrincipalBase(cdkObject) {
  /**
   * Return whether or not this principal is equal to the given principal.
   */
  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.ViaServicePrincipal):
        ViaServicePrincipal = ViaServicePrincipal(cdkObject)

    internal fun unwrap(wrapped: ViaServicePrincipal):
        software.amazon.awscdk.services.kms.ViaServicePrincipal = wrapped.cdkObject
  }
}
