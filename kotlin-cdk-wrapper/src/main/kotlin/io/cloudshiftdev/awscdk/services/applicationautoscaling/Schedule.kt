@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import java.time.Instant
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Schedule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.applicationautoscaling.Schedule,
) : CdkObject(cdkObject) {
  public open fun expressionString(): String = unwrap(this).getExpressionString()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.applicationautoscaling.Schedule,
  ) : Schedule(cdkObject)

  public companion object {
    public fun at(moment: Instant): Schedule =
        software.amazon.awscdk.services.applicationautoscaling.Schedule.at(moment).let(Schedule::wrap)

    public fun cron(options: CronOptions): Schedule =
        software.amazon.awscdk.services.applicationautoscaling.Schedule.cron(options.let(CronOptions::unwrap)).let(Schedule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cc37d243eb40a26b390350f82df5c8784ed9081b5ef885cdfd0f5184b3fc1407")
    public fun cron(options: CronOptions.Builder.() -> Unit): Schedule = cron(CronOptions(options))

    public fun expression(expression: String): Schedule =
        software.amazon.awscdk.services.applicationautoscaling.Schedule.expression(expression).let(Schedule::wrap)

    public fun rate(duration: Duration): Schedule =
        software.amazon.awscdk.services.applicationautoscaling.Schedule.rate(duration.let(Duration::unwrap)).let(Schedule::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.Schedule):
        Schedule = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Schedule):
        software.amazon.awscdk.services.applicationautoscaling.Schedule = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.applicationautoscaling.Schedule
  }
}