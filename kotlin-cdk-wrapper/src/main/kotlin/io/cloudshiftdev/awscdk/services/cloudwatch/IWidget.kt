@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * A single dashboard widget.
 */
public interface IWidget {
  /**
   * The amount of vertical grid units the widget will take up.
   */
  public fun height(): Number

  /**
   * Place the widget at a given position.
   *
   * @param x 
   * @param y 
   */
  public fun position(x: Number, y: Number)

  /**
   * Return the widget JSON for use in the dashboard.
   */
  public fun toJson(): List<Any>

  /**
   * (deprecated) Any warnings that are produced as a result of putting together this widget.
   *
   * * use warningsV2
   */
  @Deprecated(message = "deprecated in CDK")
  public fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

  /**
   * Any warnings that are produced as a result of putting together this widget.
   */
  public fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

  /**
   * The amount of horizontal grid units the widget will take up.
   */
  public fun width(): Number

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IWidget): IWidget =
        CdkObjectWrappers.wrap(cdkObject) as IWidget

    internal fun unwrap(wrapped: IWidget): software.amazon.awscdk.services.cloudwatch.IWidget =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.IWidget
  }
}
