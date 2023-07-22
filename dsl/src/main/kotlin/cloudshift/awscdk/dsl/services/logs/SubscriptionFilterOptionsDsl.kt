@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.logs.IFilterPattern
import software.amazon.awscdk.services.logs.ILogSubscriptionDestination
import software.amazon.awscdk.services.logs.SubscriptionFilterOptions

/**
 * Properties for a new SubscriptionFilter created from a LogGroup.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * IFilterPattern filterPattern;
 * ILogSubscriptionDestination logSubscriptionDestination;
 * SubscriptionFilterOptions subscriptionFilterOptions = SubscriptionFilterOptions.builder()
 * .destination(logSubscriptionDestination)
 * .filterPattern(filterPattern)
 * .build();
 * ```
 */
@CdkDslMarker
public class SubscriptionFilterOptionsDsl {
  private val cdkBuilder: SubscriptionFilterOptions.Builder = SubscriptionFilterOptions.builder()

  /**
   * @param destination The destination to send the filtered events to. 
   * For example, a Kinesis stream or a Lambda function.
   */
  public fun destination(destination: ILogSubscriptionDestination) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param filterPattern Log events matching this pattern will be sent to the destination. 
   */
  public fun filterPattern(filterPattern: IFilterPattern) {
    cdkBuilder.filterPattern(filterPattern)
  }

  public fun build(): SubscriptionFilterOptions = cdkBuilder.build()
}
