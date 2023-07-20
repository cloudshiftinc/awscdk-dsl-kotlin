@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.DefinitionBody
import software.amazon.awscdk.services.stepfunctions.IChainable
import software.amazon.awscdk.services.stepfunctions.LogOptions
import software.amazon.awscdk.services.stepfunctions.StateMachineProps
import software.amazon.awscdk.services.stepfunctions.StateMachineType

@CdkDslMarker
public class StateMachinePropsDsl {
  private val cdkBuilder: StateMachineProps.Builder = StateMachineProps.builder()

  @Deprecated(message = "deprecated in CDK")
  public fun definition(definition: IChainable) {
    cdkBuilder.definition(definition)
  }

  public fun definitionBody(definitionBody: DefinitionBody) {
    cdkBuilder.definitionBody(definitionBody)
  }

  public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
    cdkBuilder.definitionSubstitutions(definitionSubstitutions)
  }

  public fun logs(block: LogOptionsDsl.() -> Unit = {}) {
    val builder = LogOptionsDsl()
    builder.apply(block)
    cdkBuilder.logs(builder.build())
  }

  public fun logs(logs: LogOptions) {
    cdkBuilder.logs(logs)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun stateMachineName(stateMachineName: String) {
    cdkBuilder.stateMachineName(stateMachineName)
  }

  public fun stateMachineType(stateMachineType: StateMachineType) {
    cdkBuilder.stateMachineType(stateMachineType)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun tracingEnabled(tracingEnabled: Boolean) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  public fun build(): StateMachineProps = cdkBuilder.build()
}
