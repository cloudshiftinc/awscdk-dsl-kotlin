package io.cloudshiftdev.awscdk.services.iam

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class CompositePrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CompositePrincipal,
) : PrincipalBase(cdkObject) {
  /**
   * Adds IAM principals to the composite principal.
   *
   * Composite principals cannot have
   * conditions.
   *
   * @param principals IAM principals that will be added to the composite principal. 
   */
  public open fun addPrincipals(principals: IPrincipal): CompositePrincipal =
      unwrap(this).addPrincipals(principals.let(IPrincipal::unwrap)).let(CompositePrincipal::wrap)

  /**
   * Add the principal to the AssumeRolePolicyDocument.
   *
   * Add the statements to the AssumeRolePolicyDocument necessary to give this principal
   * permissions to assume the given role.
   *
   * @param doc 
   */
  public override fun addToAssumeRolePolicy(doc: PolicyDocument) {
    unwrap(this).addToAssumeRolePolicy(doc.let(PolicyDocument::unwrap))
  }

  /**
   * Add the principal to the AssumeRolePolicyDocument.
   *
   * Add the statements to the AssumeRolePolicyDocument necessary to give this principal
   * permissions to assume the given role.
   *
   * @param doc 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cef9e06c9678a219d566dc6f09959675ba743f7c64440ddbd5b37c4d552db9c0")
  public override fun addToAssumeRolePolicy(doc: PolicyDocument.Builder.() -> Unit): Unit =
      addToAssumeRolePolicy(PolicyDocument(doc))

  /**
   * When this Principal is used in an AssumeRole policy, the action to use.
   */
  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  /**
   * Return whether or not this principal is equal to the given principal.
   */
  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  /**
   * Returns the principals that make up the CompositePrincipal.
   */
  public open fun principals(): List<IPrincipal> =
      unwrap(this).getPrincipals().map(IPrincipal::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CompositePrincipal):
        CompositePrincipal = CompositePrincipal(cdkObject)

    internal fun unwrap(wrapped: CompositePrincipal):
        software.amazon.awscdk.services.iam.CompositePrincipal = wrapped.cdkObject
  }
}
