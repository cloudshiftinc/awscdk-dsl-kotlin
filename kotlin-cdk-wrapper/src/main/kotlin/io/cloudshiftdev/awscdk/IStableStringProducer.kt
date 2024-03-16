@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for (stable) lazy string producers.
 */
public interface IStableStringProducer {
  /**
   * Produce the string value.
   */
  public fun produce(): String?

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStableStringProducer):
        IStableStringProducer = CdkObjectWrappers.wrap(cdkObject) as IStableStringProducer

    internal fun unwrap(wrapped: IStableStringProducer):
        software.amazon.awscdk.IStableStringProducer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IStableStringProducer
  }
}
