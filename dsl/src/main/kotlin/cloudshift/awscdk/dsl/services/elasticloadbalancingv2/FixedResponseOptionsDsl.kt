@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions

/**
 * Options for `ListenerAction.fixedResponse()`.
 *
 * Example:
 *
 * ```
 * ApplicationListener listener;
 * listener.addAction("Fixed", AddApplicationActionProps.builder()
 * .priority(10)
 * .conditions(List.of(ListenerCondition.pathPatterns(List.of("/ok"))))
 * .action(ListenerAction.fixedResponse(200, FixedResponseOptions.builder()
 * .contentType("text/plain")
 * .messageBody("OK")
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class FixedResponseOptionsDsl {
  private val cdkBuilder: FixedResponseOptions.Builder = FixedResponseOptions.builder()

  /**
   * @param contentType Content Type of the response.
   * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param messageBody The response body.
   */
  public fun messageBody(messageBody: String) {
    cdkBuilder.messageBody(messageBody)
  }

  public fun build(): FixedResponseOptions = cdkBuilder.build()
}
