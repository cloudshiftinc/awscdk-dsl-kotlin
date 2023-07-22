@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnWebhook

@CdkDslMarker
public class CfnWebhookWebhookFilterRulePropertyDsl {
  private val cdkBuilder: CfnWebhook.WebhookFilterRuleProperty.Builder =
      CfnWebhook.WebhookFilterRuleProperty.builder()

  /**
   * @param jsonPath A JsonPath expression that is applied to the body/payload of the webhook. 
   * The value selected by the JsonPath expression must match the value specified in the
   * `MatchEquals` field. Otherwise, the request is ignored. For more information, see [Java JsonPath
   * implementation](https://docs.aws.amazon.com/https://github.com/json-path/JsonPath) in GitHub.
   */
  public fun jsonPath(jsonPath: String) {
    cdkBuilder.jsonPath(jsonPath)
  }

  /**
   * @param matchEquals The value selected by the `JsonPath` expression must match what is supplied
   * in the `MatchEquals` field.
   * Otherwise, the request is ignored. Properties from the target action configuration can be
   * included as placeholders in this value by surrounding the action configuration key with curly
   * brackets. For example, if the value supplied here is "refs/heads/{Branch}" and the target action
   * has an action configuration property called "Branch" with a value of "main", the `MatchEquals`
   * value is evaluated as "refs/heads/main". For a list of action configuration properties for
   * built-in action types, see [Pipeline Structure Reference Action
   * Requirements](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements)
   * .
   */
  public fun matchEquals(matchEquals: String) {
    cdkBuilder.matchEquals(matchEquals)
  }

  public fun build(): CfnWebhook.WebhookFilterRuleProperty = cdkBuilder.build()
}
