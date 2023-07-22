@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.Effect
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.iam.PolicyStatement

/**
 * Represents a statement in an IAM policy document.
 *
 * Example:
 *
 * ```
 * // Add gateway endpoints when creating the VPC
 * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
 * .gatewayEndpoints(Map.of(
 * "S3", GatewayVpcEndpointOptions.builder()
 * .service(GatewayVpcEndpointAwsService.S3)
 * .build()))
 * .build();
 * // Alternatively gateway endpoints can be added on the VPC
 * GatewayVpcEndpoint dynamoDbEndpoint = vpc.addGatewayEndpoint("DynamoDbEndpoint",
 * GatewayVpcEndpointOptions.builder()
 * .service(GatewayVpcEndpointAwsService.DYNAMODB)
 * .build());
 * // This allows to customize the endpoint policy
 * dynamoDbEndpoint.addToPolicy(
 * PolicyStatement.Builder.create() // Restrict to listing and describing tables
 * .principals(List.of(new AnyPrincipal()))
 * .actions(List.of("dynamodb:DescribeTable", "dynamodb:ListTables"))
 * .resources(List.of("*")).build());
 * // Add an interface endpoint
 * vpc.addInterfaceEndpoint("EcrDockerEndpoint", InterfaceVpcEndpointOptions.builder()
 * .service(InterfaceVpcEndpointAwsService.ECR_DOCKER)
 * .build());
 * ```
 */
@CdkDslMarker
public class PolicyStatementDsl {
  private val cdkBuilder: PolicyStatement.Builder = PolicyStatement.Builder.create()

  private val _actions: MutableList<String> = mutableListOf()

  private val _notActions: MutableList<String> = mutableListOf()

  private val _notPrincipals: MutableList<IPrincipal> = mutableListOf()

  private val _notResources: MutableList<String> = mutableListOf()

  private val _principals: MutableList<IPrincipal> = mutableListOf()

  private val _resources: MutableList<String> = mutableListOf()

  /**
   * List of actions to add to the statement.
   *
   * Default: - no actions
   *
   * @param actions List of actions to add to the statement. 
   */
  public fun actions(vararg actions: String) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * List of actions to add to the statement.
   *
   * Default: - no actions
   *
   * @param actions List of actions to add to the statement. 
   */
  public fun actions(actions: Collection<String>) {
    _actions.addAll(actions)
  }

  /**
   * Conditions to add to the statement.
   *
   * Default: - no condition
   *
   * @param conditions Conditions to add to the statement. 
   */
  public fun conditions(conditions: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(conditions)
    cdkBuilder.conditions(builder.map)
  }

  /**
   * Conditions to add to the statement.
   *
   * Default: - no condition
   *
   * @param conditions Conditions to add to the statement. 
   */
  public fun conditions(conditions: Map<String, Any>) {
    cdkBuilder.conditions(conditions)
  }

  /**
   * Whether to allow or deny the actions in this statement.
   *
   * Default: Effect.ALLOW
   *
   * @param effect Whether to allow or deny the actions in this statement. 
   */
  public fun effect(effect: Effect) {
    cdkBuilder.effect(effect)
  }

  /**
   * List of not actions to add to the statement.
   *
   * Default: - no not-actions
   *
   * @param notActions List of not actions to add to the statement. 
   */
  public fun notActions(vararg notActions: String) {
    _notActions.addAll(listOf(*notActions))
  }

  /**
   * List of not actions to add to the statement.
   *
   * Default: - no not-actions
   *
   * @param notActions List of not actions to add to the statement. 
   */
  public fun notActions(notActions: Collection<String>) {
    _notActions.addAll(notActions)
  }

  /**
   * List of not principals to add to the statement.
   *
   * Default: - no not principals
   *
   * @param notPrincipals List of not principals to add to the statement. 
   */
  public fun notPrincipals(vararg notPrincipals: IPrincipal) {
    _notPrincipals.addAll(listOf(*notPrincipals))
  }

  /**
   * List of not principals to add to the statement.
   *
   * Default: - no not principals
   *
   * @param notPrincipals List of not principals to add to the statement. 
   */
  public fun notPrincipals(notPrincipals: Collection<IPrincipal>) {
    _notPrincipals.addAll(notPrincipals)
  }

  /**
   * NotResource ARNs to add to the statement.
   *
   * Default: - no not-resources
   *
   * @param notResources NotResource ARNs to add to the statement. 
   */
  public fun notResources(vararg notResources: String) {
    _notResources.addAll(listOf(*notResources))
  }

  /**
   * NotResource ARNs to add to the statement.
   *
   * Default: - no not-resources
   *
   * @param notResources NotResource ARNs to add to the statement. 
   */
  public fun notResources(notResources: Collection<String>) {
    _notResources.addAll(notResources)
  }

  /**
   * List of principals to add to the statement.
   *
   * Default: - no principals
   *
   * @param principals List of principals to add to the statement. 
   */
  public fun principals(vararg principals: IPrincipal) {
    _principals.addAll(listOf(*principals))
  }

  /**
   * List of principals to add to the statement.
   *
   * Default: - no principals
   *
   * @param principals List of principals to add to the statement. 
   */
  public fun principals(principals: Collection<IPrincipal>) {
    _principals.addAll(principals)
  }

  /**
   * Resource ARNs to add to the statement.
   *
   * Default: - no resources
   *
   * @param resources Resource ARNs to add to the statement. 
   */
  public fun resources(vararg resources: String) {
    _resources.addAll(listOf(*resources))
  }

  /**
   * Resource ARNs to add to the statement.
   *
   * Default: - no resources
   *
   * @param resources Resource ARNs to add to the statement. 
   */
  public fun resources(resources: Collection<String>) {
    _resources.addAll(resources)
  }

  /**
   * The Sid (statement ID) is an optional identifier that you provide for the policy statement.
   *
   * You can assign a Sid value to each statement in a
   * statement array. In services that let you specify an ID element, such as
   * SQS and SNS, the Sid value is just a sub-ID of the policy document's ID. In
   * IAM, the Sid value must be unique within a JSON policy.
   *
   * Default: - no sid
   *
   * @param sid The Sid (statement ID) is an optional identifier that you provide for the policy
   * statement. 
   */
  public fun sid(sid: String) {
    cdkBuilder.sid(sid)
  }

  public fun build(): PolicyStatement {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_notActions.isNotEmpty()) cdkBuilder.notActions(_notActions)
    if(_notPrincipals.isNotEmpty()) cdkBuilder.notPrincipals(_notPrincipals)
    if(_notResources.isNotEmpty()) cdkBuilder.notResources(_notResources)
    if(_principals.isNotEmpty()) cdkBuilder.principals(_principals)
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
