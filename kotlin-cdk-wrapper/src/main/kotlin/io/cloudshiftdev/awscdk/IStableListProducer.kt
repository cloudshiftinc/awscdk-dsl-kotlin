@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.collections.List

/**
 * Interface for (stable) lazy list producers.
 */
public interface IStableListProducer {
  /**
   * Produce the list value.
   */
  public fun produce(): List<String>

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStableListProducer): IStableListProducer =
        CdkObjectWrappers.wrap(cdkObject) as IStableListProducer

    internal fun unwrap(wrapped: IStableListProducer): software.amazon.awscdk.IStableListProducer =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.IStableListProducer
  }
}
