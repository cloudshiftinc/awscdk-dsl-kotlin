package io.cloudshiftdev.awscdk.services.sns

import kotlin.String
import kotlin.collections.Map

public open class Policy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sns.Policy,
) : FilterOrPolicy(cdkObject) {
  public open fun policyDoc(): Map<String, FilterOrPolicy> =
      unwrap(this).getPolicyDoc().mapValues{FilterOrPolicy.wrap(it.value)} ?: emptyMap()

  public override fun type(): FilterOrPolicyType =
      unwrap(this).getType().let(FilterOrPolicyType::wrap)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.Policy): Policy =
        Policy(cdkObject)

    internal fun unwrap(wrapped: Policy): software.amazon.awscdk.services.sns.Policy =
        wrapped.cdkObject
  }
}
