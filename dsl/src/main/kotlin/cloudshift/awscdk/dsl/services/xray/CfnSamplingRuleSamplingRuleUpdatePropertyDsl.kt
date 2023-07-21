@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnSamplingRule

@CdkDslMarker
public class CfnSamplingRuleSamplingRuleUpdatePropertyDsl {
  private val cdkBuilder: CfnSamplingRule.SamplingRuleUpdateProperty.Builder =
      CfnSamplingRule.SamplingRuleUpdateProperty.builder()

  public fun attributes(attributes: Map<String, String>) {
    cdkBuilder.attributes(attributes)
  }

  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  public fun fixedRate(fixedRate: Number) {
    cdkBuilder.fixedRate(fixedRate)
  }

  public fun host(host: String) {
    cdkBuilder.host(host)
  }

  public fun httpMethod(httpMethod: String) {
    cdkBuilder.httpMethod(httpMethod)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun reservoirSize(reservoirSize: Number) {
    cdkBuilder.reservoirSize(reservoirSize)
  }

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun ruleArn(ruleArn: String) {
    cdkBuilder.ruleArn(ruleArn)
  }

  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun serviceType(serviceType: String) {
    cdkBuilder.serviceType(serviceType)
  }

  public fun urlPath(urlPath: String) {
    cdkBuilder.urlPath(urlPath)
  }

  public fun build(): CfnSamplingRule.SamplingRuleUpdateProperty = cdkBuilder.build()
}