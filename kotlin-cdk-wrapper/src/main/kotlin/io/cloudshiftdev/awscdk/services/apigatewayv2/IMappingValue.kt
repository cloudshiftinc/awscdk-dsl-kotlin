@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a Mapping Value.
 */
public interface IMappingValue {
  /**
   * Represents a Mapping Value.
   */
  public fun `value`(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IMappingValue):
        IMappingValue = CdkObjectWrappers.wrap(cdkObject) as IMappingValue

    internal fun unwrap(wrapped: IMappingValue):
        software.amazon.awscdk.services.apigatewayv2.IMappingValue = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IMappingValue
  }
}
