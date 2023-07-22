@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.budgets.CfnBudget

/**
 * The `Subscriber` property type specifies who to notify for a Billing and Cost Management budget
 * notification.
 *
 * The subscriber consists of a subscription type, and either an Amazon SNS topic or an email
 * address.
 *
 * For example, an email subscriber would have the following parameters:
 *
 * * A `subscriptionType` of `EMAIL`
 * * An `address` of `example&#64;example.com`
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * SubscriberProperty subscriberProperty = SubscriberProperty.builder()
 * .address("address")
 * .subscriptionType("subscriptionType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html)
 */
@CdkDslMarker
public class CfnBudgetSubscriberPropertyDsl {
  private val cdkBuilder: CfnBudget.SubscriberProperty.Builder =
      CfnBudget.SubscriberProperty.builder()

  /**
   * @param address The address that AWS sends budget notifications to, either an SNS topic or an
   * email. 
   * When you create a subscriber, the value of `Address` can't contain line breaks.
   */
  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  /**
   * @param subscriptionType The type of notification that AWS sends to a subscriber. 
   */
  public fun subscriptionType(subscriptionType: String) {
    cdkBuilder.subscriptionType(subscriptionType)
  }

  public fun build(): CfnBudget.SubscriberProperty = cdkBuilder.build()
}
