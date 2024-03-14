package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.services.iam.ManagedPolicy
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UntrustedCodeBoundaryPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy,
) : ManagedPolicy(cdkObject) {
  public interface Builder {
    public fun additionalStatements(additionalStatements: List<PolicyStatement>)

    public fun managedPolicyName(managedPolicyName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy.Builder =
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy.Builder.create(scope,
        id)

    override fun additionalStatements(additionalStatements: List<PolicyStatement>) {
      cdkBuilder.additionalStatements(additionalStatements.map(PolicyStatement::unwrap))
    }

    override fun managedPolicyName(managedPolicyName: String) {
      cdkBuilder.managedPolicyName(managedPolicyName)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UntrustedCodeBoundaryPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UntrustedCodeBoundaryPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy):
        UntrustedCodeBoundaryPolicy = UntrustedCodeBoundaryPolicy(cdkObject)

    internal fun unwrap(wrapped: UntrustedCodeBoundaryPolicy):
        software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy = wrapped.cdkObject
  }
}