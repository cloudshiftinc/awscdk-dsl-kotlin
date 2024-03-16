@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Return the appropriate values for the environment placeholders.
 */
public interface IEnvironmentPlaceholderProvider {
  /**
   * Return the account.
   */
  public fun accountId(): String

  /**
   * Return the partition.
   */
  public fun partition(): String

  /**
   * Return the region.
   */
  public fun region(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.IEnvironmentPlaceholderProvider):
        IEnvironmentPlaceholderProvider = CdkObjectWrappers.wrap(cdkObject) as
        IEnvironmentPlaceholderProvider

    internal fun unwrap(wrapped: IEnvironmentPlaceholderProvider):
        software.amazon.awscdk.cxapi.IEnvironmentPlaceholderProvider = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cxapi.IEnvironmentPlaceholderProvider
  }
}
