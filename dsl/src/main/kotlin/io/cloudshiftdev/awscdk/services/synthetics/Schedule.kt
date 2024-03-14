package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.Duration
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class Schedule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.synthetics.Schedule,
) {
  public open fun expressionString(): String = unwrap(this).getExpressionString()

  public companion object {
    public open fun cron(options: CronOptions): Schedule =
        software.amazon.awscdk.services.synthetics.Schedule.cron(options.let(CronOptions::unwrap)).let(Schedule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4520a734c5b3c9911b297d38c8083ddf780e92b19da5f22829eaf1210a2e86c")
    public open fun cron(options: CronOptions.Builder.() -> Unit): Schedule =
        cron(CronOptions(options))

    public open fun expression(expression: String): Schedule =
        software.amazon.awscdk.services.synthetics.Schedule.expression(expression).let(Schedule::wrap)

    public open fun once(): Schedule =
        software.amazon.awscdk.services.synthetics.Schedule.once().let(Schedule::wrap)

    public open fun rate(interval: Duration): Schedule =
        software.amazon.awscdk.services.synthetics.Schedule.rate(interval.let(Duration::unwrap)).let(Schedule::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Schedule): Schedule =
        Schedule(cdkObject)

    internal fun unwrap(wrapped: Schedule): software.amazon.awscdk.services.synthetics.Schedule =
        wrapped.cdkObject
  }
}