package io.cloudshiftdev.awscdk.services.iam

public open class WebIdentityPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.WebIdentityPrincipal,
) : FederatedPrincipal(cdkObject) {
  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.WebIdentityPrincipal):
        WebIdentityPrincipal = WebIdentityPrincipal(cdkObject)

    internal fun unwrap(wrapped: WebIdentityPrincipal):
        software.amazon.awscdk.services.iam.WebIdentityPrincipal = wrapped.cdkObject
  }
}
