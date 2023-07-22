@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues
import software.constructs.Construct

/**
 * A StepFunctions task to call DynamoDeleteItem.
 *
 * Example:
 *
 * ```
 * Table myTable;
 * DynamoDeleteItem.Builder.create(this, "DeleteItem")
 * .key(Map.of("MessageId", DynamoAttributeValue.fromString("message-007")))
 * .table(myTable)
 * .resultPath(JsonPath.DISCARD)
 * .build();
 * ```
 */
@CdkDslMarker
public class DynamoDeleteItemDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: DynamoDeleteItem.Builder = DynamoDeleteItem.Builder.create(scope, id)

  /**
   * An optional description for this state.
   *
   * Default: - No comment
   *
   * @param comment An optional description for this state. 
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * A condition that must be satisfied in order for a conditional DeleteItem to succeed.
   *
   * Default: - No condition expression
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ConditionExpression)
   * @param conditionExpression A condition that must be satisfied in order for a conditional
   * DeleteItem to succeed. 
   */
  public fun conditionExpression(conditionExpression: String) {
    cdkBuilder.conditionExpression(conditionExpression)
  }

  /**
   * Credentials for an IAM Role that the State Machine assumes for executing the task.
   *
   * This enables cross-account resource invocations.
   *
   * Default: - None (Task is executed using the State Machine's execution role)
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
   * @param credentials Credentials for an IAM Role that the State Machine assumes for executing the
   * task. 
   */
  public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
    val builder = CredentialsDsl()
    builder.apply(credentials)
    cdkBuilder.credentials(builder.build())
  }

  /**
   * Credentials for an IAM Role that the State Machine assumes for executing the task.
   *
   * This enables cross-account resource invocations.
   *
   * Default: - None (Task is executed using the State Machine's execution role)
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
   * @param credentials Credentials for an IAM Role that the State Machine assumes for executing the
   * task. 
   */
  public fun credentials(credentials: Credentials) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * One or more substitution tokens for attribute names in an expression.
   *
   * Default: - No expression attribute names
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ExpressionAttributeNames)
   * @param expressionAttributeNames One or more substitution tokens for attribute names in an
   * expression. 
   */
  public fun expressionAttributeNames(expressionAttributeNames: Map<String, String>) {
    cdkBuilder.expressionAttributeNames(expressionAttributeNames)
  }

  /**
   * One or more values that can be substituted in an expression.
   *
   * Default: - No expression attribute values
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ExpressionAttributeValues)
   * @param expressionAttributeValues One or more values that can be substituted in an expression. 
   */
  public
      fun expressionAttributeValues(expressionAttributeValues: Map<String, DynamoAttributeValue>) {
    cdkBuilder.expressionAttributeValues(expressionAttributeValues)
  }

  /**
   * (deprecated) Timeout for the heartbeat.
   *
   * Default: - None
   *
   * @deprecated use `heartbeatTimeout`
   * @param heartbeat Timeout for the heartbeat. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun heartbeat(heartbeat: Duration) {
    cdkBuilder.heartbeat(heartbeat)
  }

  /**
   * Timeout for the heartbeat.
   *
   * [disable-awslint:duration-prop-type] is needed because all props interface in
   * aws-stepfunctions-tasks extend this interface
   *
   * Default: - None
   *
   * @param heartbeatTimeout Timeout for the heartbeat. 
   */
  public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  /**
   * JSONPath expression to select part of the state to be the input to this state.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * input to be the empty object {}.
   *
   * Default: - The entire task input (JSON path '$')
   *
   * @param inputPath JSONPath expression to select part of the state to be the input to this state.
   * 
   */
  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  /**
   * AWS Step Functions integrates with services directly in the Amazon States Language.
   *
   * You can control these AWS services using service integration patterns
   *
   * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
   * `IntegrationPattern.RUN_JOB` for the following exceptions:
   * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
   * `EmrContainersStartJobRun`.
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-to-resource.html#connect-wait-token)
   * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
   * States Language. 
   */
  public fun integrationPattern(integrationPattern: IntegrationPattern) {
    cdkBuilder.integrationPattern(integrationPattern)
  }

  /**
   * Primary key of the item to retrieve.
   *
   * For the primary key, you must provide all of the attributes.
   * For example, with a simple primary key, you only need to provide a value for the partition key.
   * For a composite primary key, you must provide values for both the partition key and the sort
   * key.
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html#DDB-GetItem-request-Key)
   * @param key Primary key of the item to retrieve. 
   */
  public fun key(key: Map<String, DynamoAttributeValue>) {
    cdkBuilder.key(key)
  }

  /**
   * JSONPath expression to select select a portion of the state output to pass to the next state.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * output to be the empty object {}.
   *
   * Default: - The entire JSON node determined by the state input, the task result,
   * and resultPath is passed to the next state (JSON path '$')
   *
   * @param outputPath JSONPath expression to select select a portion of the state output to pass to
   * the next state. 
   */
  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  /**
   * JSONPath expression to indicate where to inject the state's output.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the state's
   * input to become its output.
   *
   * Default: - Replaces the entire input with the result (JSON path '$')
   *
   * @param resultPath JSONPath expression to indicate where to inject the state's output. 
   */
  public fun resultPath(resultPath: String) {
    cdkBuilder.resultPath(resultPath)
  }

  /**
   * The JSON that will replace the state's raw result and become the effective result before
   * ResultPath is applied.
   *
   * You can use ResultSelector to create a payload with values that are static
   * or selected from the state's raw result.
   *
   * Default: - None
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
   * @param resultSelector The JSON that will replace the state's raw result and become the
   * effective result before ResultPath is applied. 
   */
  public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(resultSelector)
    cdkBuilder.resultSelector(builder.map)
  }

  /**
   * The JSON that will replace the state's raw result and become the effective result before
   * ResultPath is applied.
   *
   * You can use ResultSelector to create a payload with values that are static
   * or selected from the state's raw result.
   *
   * Default: - None
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
   * @param resultSelector The JSON that will replace the state's raw result and become the
   * effective result before ResultPath is applied. 
   */
  public fun resultSelector(resultSelector: Map<String, Any>) {
    cdkBuilder.resultSelector(resultSelector)
  }

  /**
   * Determines the level of detail about provisioned throughput consumption that is returned in the
   * response.
   *
   * Default: DynamoConsumedCapacity.NONE
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ReturnConsumedCapacity)
   * @param returnConsumedCapacity Determines the level of detail about provisioned throughput
   * consumption that is returned in the response. 
   */
  public fun returnConsumedCapacity(returnConsumedCapacity: DynamoConsumedCapacity) {
    cdkBuilder.returnConsumedCapacity(returnConsumedCapacity)
  }

  /**
   * Determines whether item collection metrics are returned.
   *
   * If set to SIZE, the response includes statistics about item collections, if any,
   * that were modified during the operation are returned in the response.
   * If set to NONE (the default), no statistics are returned.
   *
   * Default: DynamoItemCollectionMetrics.NONE
   *
   * @param returnItemCollectionMetrics Determines whether item collection metrics are returned. 
   */
  public fun returnItemCollectionMetrics(returnItemCollectionMetrics: DynamoItemCollectionMetrics) {
    cdkBuilder.returnItemCollectionMetrics(returnItemCollectionMetrics)
  }

  /**
   * Use ReturnValues if you want to get the item attributes as they appeared before they were
   * deleted.
   *
   * Default: DynamoReturnValues.NONE
   *
   * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html#DDB-DeleteItem-request-ReturnValues)
   * @param returnValues Use ReturnValues if you want to get the item attributes as they appeared
   * before they were deleted. 
   */
  public fun returnValues(returnValues: DynamoReturnValues) {
    cdkBuilder.returnValues(returnValues)
  }

  /**
   * The name of the table containing the requested item.
   *
   * @param table The name of the table containing the requested item. 
   */
  public fun table(table: ITable) {
    cdkBuilder.table(table)
  }

  /**
   * Timeout for the task.
   *
   * [disable-awslint:duration-prop-type] is needed because all props interface in
   * aws-stepfunctions-tasks extend this interface
   *
   * Default: - None
   *
   * @param taskTimeout Timeout for the task. 
   */
  public fun taskTimeout(taskTimeout: Timeout) {
    cdkBuilder.taskTimeout(taskTimeout)
  }

  /**
   * (deprecated) Timeout for the task.
   *
   * Default: - None
   *
   * @deprecated use `taskTimeout`
   * @param timeout Timeout for the task. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): DynamoDeleteItem = cdkBuilder.build()
}
