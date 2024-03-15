@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class ReleaseLabel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel,
) : CdkObject(cdkObject) {
  public open fun label(): String = unwrap(this).getLabel()

  public companion object {
    public val EMR_5_32_0: ReleaseLabel =
        ReleaseLabel.wrap(software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel.EMR_5_32_0)

    public val EMR_5_33_0: ReleaseLabel =
        ReleaseLabel.wrap(software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel.EMR_5_33_0)

    public val EMR_6_2_0: ReleaseLabel =
        ReleaseLabel.wrap(software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel.EMR_6_2_0)

    public val EMR_6_3_0: ReleaseLabel =
        ReleaseLabel.wrap(software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel.EMR_6_3_0)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel):
        ReleaseLabel = ReleaseLabel(cdkObject)

    internal fun unwrap(wrapped: ReleaseLabel):
        software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel = wrapped.cdkObject
  }
}