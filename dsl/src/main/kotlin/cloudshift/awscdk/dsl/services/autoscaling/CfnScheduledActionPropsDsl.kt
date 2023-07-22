@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps

@CdkDslMarker
public class CfnScheduledActionPropsDsl {
  private val cdkBuilder: CfnScheduledActionProps.Builder = CfnScheduledActionProps.builder()

  /**
   * @param autoScalingGroupName The name of the Auto Scaling group. 
   */
  public fun autoScalingGroupName(autoScalingGroupName: String) {
    cdkBuilder.autoScalingGroupName(autoScalingGroupName)
  }

  /**
   * @param desiredCapacity The desired capacity is the initial capacity of the Auto Scaling group
   * after the scheduled action runs and the capacity it attempts to maintain.
   * It can scale beyond this capacity if you add more scaling conditions.
   *
   *
   * You must specify at least one of the following properties: `MaxSize` , `MinSize` , or
   * `DesiredCapacity` .
   */
  public fun desiredCapacity(desiredCapacity: Number) {
    cdkBuilder.desiredCapacity(desiredCapacity)
  }

  /**
   * @param endTime The date and time for the recurring schedule to end, in UTC.
   * For example, `"2021-06-01T00:00:00Z"` .
   */
  public fun endTime(endTime: String) {
    cdkBuilder.endTime(endTime)
  }

  /**
   * @param maxSize The maximum size of the Auto Scaling group.
   */
  public fun maxSize(maxSize: Number) {
    cdkBuilder.maxSize(maxSize)
  }

  /**
   * @param minSize The minimum size of the Auto Scaling group.
   */
  public fun minSize(minSize: Number) {
    cdkBuilder.minSize(minSize)
  }

  /**
   * @param recurrence The recurring schedule for this action.
   * This format consists of five fields separated by white spaces: [Minute] [Hour] [Day_of_Month]
   * [Month_of_Year] [Day_of_Week]. The value must be in quotes (for example, `"30 0 1 1,6,12 *"` ).
   * For more information about this format, see
   * [Crontab](https://docs.aws.amazon.com/http://crontab.org) .
   *
   * When `StartTime` and `EndTime` are specified with `Recurrence` , they form the boundaries of
   * when the recurring action starts and stops.
   *
   * Cron expressions use Universal Coordinated Time (UTC) by default.
   */
  public fun recurrence(recurrence: String) {
    cdkBuilder.recurrence(recurrence)
  }

  /**
   * @param startTime The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format in
   * UTC/GMT only and in quotes (for example, `"2021-06-01T00:00:00Z"` ).
   * If you specify `Recurrence` and `StartTime` , Amazon EC2 Auto Scaling performs the action at
   * this time, and then performs the action based on the specified recurrence.
   */
  public fun startTime(startTime: String) {
    cdkBuilder.startTime(startTime)
  }

  /**
   * @param timeZone Specifies the time zone for a cron expression.
   * If a time zone is not provided, UTC is used by default.
   *
   * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone
   * Database (such as `Etc/GMT+9` or `Pacific/Tahiti` ). For more information, see
   * [https://en.wikipedia.org/wiki/List_of_tz_database_time_zones](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/List_of_tz_database_time_zones)
   * .
   */
  public fun timeZone(timeZone: String) {
    cdkBuilder.timeZone(timeZone)
  }

  public fun build(): CfnScheduledActionProps = cdkBuilder.build()
}
