@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String

/**
 * Thresholds for highlighting cells in TableWidget.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * dashboard.addWidgets(TableWidget.Builder.create()
 * // ...
 * .thresholds(List.of(TableThreshold.above(1000, Color.RED), TableThreshold.between(500, 1000,
 * Color.ORANGE), TableThreshold.below(500, Color.GREEN)))
 * .build());
 * ```
 */
public open class TableThreshold(
  cdkObject: software.amazon.awscdk.services.cloudwatch.TableThreshold,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun toJson(): Any = unwrap(this).toJson()

  public companion object {
    public fun above(`value`: Number): TableThreshold =
        software.amazon.awscdk.services.cloudwatch.TableThreshold.above(`value`).let(TableThreshold::wrap)

    public fun above(`value`: Number, color: String): TableThreshold =
        software.amazon.awscdk.services.cloudwatch.TableThreshold.above(`value`,
        color).let(TableThreshold::wrap)

    public fun below(`value`: Number): TableThreshold =
        software.amazon.awscdk.services.cloudwatch.TableThreshold.below(`value`).let(TableThreshold::wrap)

    public fun below(`value`: Number, color: String): TableThreshold =
        software.amazon.awscdk.services.cloudwatch.TableThreshold.below(`value`,
        color).let(TableThreshold::wrap)

    public fun between(lowerBound: Number, upperBound: Number): TableThreshold =
        software.amazon.awscdk.services.cloudwatch.TableThreshold.between(lowerBound,
        upperBound).let(TableThreshold::wrap)

    public fun between(
      lowerBound: Number,
      upperBound: Number,
      color: String,
    ): TableThreshold =
        software.amazon.awscdk.services.cloudwatch.TableThreshold.between(lowerBound, upperBound,
        color).let(TableThreshold::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TableThreshold):
        TableThreshold = TableThreshold(cdkObject)

    internal fun unwrap(wrapped: TableThreshold):
        software.amazon.awscdk.services.cloudwatch.TableThreshold = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.TableThreshold
  }
}
