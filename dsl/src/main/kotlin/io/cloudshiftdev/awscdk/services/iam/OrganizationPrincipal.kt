package io.cloudshiftdev.awscdk.services.iam

import kotlin.String

public open class OrganizationPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.OrganizationPrincipal,
) : PrincipalBase(cdkObject) {
  /**
   * Return whether or not this principal is equal to the given principal.
   */
  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  /**
   * The unique identifier (ID) of an organization (i.e. o-12345abcde).
   */
  public open fun organizationId(): String = unwrap(this).getOrganizationId()

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.OrganizationPrincipal):
        OrganizationPrincipal = OrganizationPrincipal(cdkObject)

    internal fun unwrap(wrapped: OrganizationPrincipal):
        software.amazon.awscdk.services.iam.OrganizationPrincipal = wrapped.cdkObject
  }
}
