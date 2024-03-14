package io.cloudshiftdev.awscdk.services.iam

public open class OpenIdConnectPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.OpenIdConnectPrincipal,
) : WebIdentityPrincipal(cdkObject) {
  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.OpenIdConnectPrincipal):
        OpenIdConnectPrincipal = OpenIdConnectPrincipal(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectPrincipal):
        software.amazon.awscdk.services.iam.OpenIdConnectPrincipal = wrapped.cdkObject
  }
}
