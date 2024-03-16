@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a Origin Request Policy.
 */
public interface IOriginRequestPolicy {
  /**
   * The ID of the origin request policy.
   */
  public fun originRequestPolicyId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy):
        IOriginRequestPolicy = CdkObjectWrappers.wrap(cdkObject) as IOriginRequestPolicy

    internal fun unwrap(wrapped: IOriginRequestPolicy):
        software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy
  }
}
