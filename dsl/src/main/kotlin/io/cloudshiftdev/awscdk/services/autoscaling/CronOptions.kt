package io.cloudshiftdev.awscdk.services.autoscaling

import kotlin.String
import kotlin.Unit

public interface CronOptions {
  public fun day(): String? = unwrap(this).getDay()

  public fun hour(): String? = unwrap(this).getHour()

  public fun minute(): String? = unwrap(this).getMinute()

  public fun month(): String? = unwrap(this).getMonth()

  public fun weekDay(): String? = unwrap(this).getWeekDay()

  public interface Builder {
    public fun day(day: String)

    public fun hour(hour: String)

    public fun minute(minute: String)

    public fun month(month: String)

    public fun weekDay(weekDay: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CronOptions.Builder =
        software.amazon.awscdk.services.autoscaling.CronOptions.builder()

    override fun day(day: String) {
      cdkBuilder.day(day)
    }

    override fun hour(hour: String) {
      cdkBuilder.hour(hour)
    }

    override fun minute(minute: String) {
      cdkBuilder.minute(minute)
    }

    override fun month(month: String) {
      cdkBuilder.month(month)
    }

    override fun weekDay(weekDay: String) {
      cdkBuilder.weekDay(weekDay)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CronOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.CronOptions,
  ) : CronOptions {
    override fun day(): String? = unwrap(this).getDay()

    override fun hour(): String? = unwrap(this).getHour()

    override fun minute(): String? = unwrap(this).getMinute()

    override fun month(): String? = unwrap(this).getMonth()

    override fun weekDay(): String? = unwrap(this).getWeekDay()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CronOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CronOptions):
        CronOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CronOptions):
        software.amazon.awscdk.services.autoscaling.CronOptions = (wrapped as Wrapper).cdkObject
  }
}
