@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
import software.constructs.Construct

/**
 * The `AWS::ApplicationAutoScaling::ScalingPolicy` resource defines a scaling policy that
 * Application Auto Scaling uses to adjust the capacity of a scalable target.
 *
 * For more information, see [Target tracking scaling
 * policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html)
 * and [Step scaling
 * policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html)
 * in the *Application Auto Scaling User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * CfnScalingPolicy cfnScalingPolicy = CfnScalingPolicy.Builder.create(this, "MyCfnScalingPolicy")
 * .policyName("policyName")
 * .policyType("policyType")
 * // the properties below are optional
 * .resourceId("resourceId")
 * .scalableDimension("scalableDimension")
 * .scalingTargetId("scalingTargetId")
 * .serviceNamespace("serviceNamespace")
 * .stepScalingPolicyConfiguration(StepScalingPolicyConfigurationProperty.builder()
 * .adjustmentType("adjustmentType")
 * .cooldown(123)
 * .metricAggregationType("metricAggregationType")
 * .minAdjustmentMagnitude(123)
 * .stepAdjustments(List.of(StepAdjustmentProperty.builder()
 * .scalingAdjustment(123)
 * // the properties below are optional
 * .metricIntervalLowerBound(123)
 * .metricIntervalUpperBound(123)
 * .build()))
 * .build())
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .customizedMetricSpecification(CustomizedMetricSpecificationProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .statistic("statistic")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build())
 * .disableScaleIn(false)
 * .predefinedMetricSpecification(PredefinedMetricSpecificationProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
 */
@CdkDslMarker
public class CfnScalingPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnScalingPolicy.Builder = CfnScalingPolicy.Builder.create(scope, id)

  /**
   * The name of the scaling policy.
   *
   * Updates to the name of a target tracking scaling policy are not supported, unless you also
   * update the metric used for scaling. To change only a target tracking scaling policy's name, first
   * delete the policy by removing the existing `AWS::ApplicationAutoScaling::ScalingPolicy` resource
   * from the template and updating the stack. Then, recreate the resource with the same settings and a
   * different name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname)
   * @param policyName The name of the scaling policy. 
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  /**
   * The scaling policy type.
   *
   * The following policy types are supported:
   *
   * `TargetTrackingScaling` —Not supported for Amazon EMR
   *
   * `StepScaling` —Not supported for DynamoDB, Amazon Comprehend, Lambda, Amazon Keyspaces, Amazon
   * MSK, Amazon ElastiCache, or Neptune.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype)
   * @param policyType The scaling policy type. 
   */
  public fun policyType(policyType: String) {
    cdkBuilder.policyType(policyType)
  }

  /**
   * The identifier of the resource associated with the scaling policy.
   *
   * This string consists of the resource type and unique identifier.
   *
   * * ECS service - The resource type is `service` and the unique identifier is the cluster name
   * and service name. Example: `service/default/sample-webapp` .
   * * Spot Fleet - The resource type is `spot-fleet-request` and the unique identifier is the Spot
   * Fleet request ID. Example: `spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE` .
   * * EMR cluster - The resource type is `instancegroup` and the unique identifier is the cluster
   * ID and instance group ID. Example: `instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0` .
   * * AppStream 2.0 fleet - The resource type is `fleet` and the unique identifier is the fleet
   * name. Example: `fleet/sample-fleet` .
   * * DynamoDB table - The resource type is `table` and the unique identifier is the table name.
   * Example: `table/my-table` .
   * * DynamoDB global secondary index - The resource type is `index` and the unique identifier is
   * the index name. Example: `table/my-table/index/my-table-index` .
   * * Aurora DB cluster - The resource type is `cluster` and the unique identifier is the cluster
   * name. Example: `cluster:my-db-cluster` .
   * * SageMaker endpoint variant - The resource type is `variant` and the unique identifier is the
   * resource ID. Example: `endpoint/my-end-point/variant/KMeansClustering` .
   * * Custom resources are not supported with a resource type. This parameter must specify the
   * `OutputValue` from the CloudFormation template stack used to access the resources. The unique
   * identifier is defined by the service provider. More information is available in our [GitHub
   * repository](https://docs.aws.amazon.com/https://github.com/aws/aws-auto-scaling-custom-resource) .
   * * Amazon Comprehend document classification endpoint - The resource type and unique identifier
   * are specified using the endpoint ARN. Example:
   * `arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE` .
   * * Amazon Comprehend entity recognizer endpoint - The resource type and unique identifier are
   * specified using the endpoint ARN. Example:
   * `arn:aws:comprehend:us-west-2:123456789012:entity-recognizer-endpoint/EXAMPLE` .
   * * Lambda provisioned concurrency - The resource type is `function` and the unique identifier is
   * the function name with a function version or alias name suffix that is not `$LATEST` . Example:
   * `function:my-function:prod` or `function:my-function:1` .
   * * Amazon Keyspaces table - The resource type is `table` and the unique identifier is the table
   * name. Example: `keyspace/mykeyspace/table/mytable` .
   * * Amazon MSK cluster - The resource type and unique identifier are specified using the cluster
   * ARN. Example:
   * `arn:aws:kafka:us-east-1:123456789012:cluster/demo-cluster-1/6357e0b2-0e6a-4b86-a0b4-70df934c2e31-5`
   * .
   * * Amazon ElastiCache replication group - The resource type is `replication-group` and the
   * unique identifier is the replication group name. Example: `replication-group/mycluster` .
   * * Neptune cluster - The resource type is `cluster` and the unique identifier is the cluster
   * name. Example: `cluster:mycluster` .
   * * SageMaker Serverless endpoint - The resource type is `variant` and the unique identifier is
   * the resource ID. Example: `endpoint/my-end-point/variant/KMeansClustering` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid)
   * @param resourceId The identifier of the resource associated with the scaling policy. 
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * The scalable dimension. This string consists of the service namespace, resource type, and
   * scaling property.
   *
   * * `ecs:service:DesiredCount` - The desired task count of an ECS service.
   * * `elasticmapreduce:instancegroup:InstanceCount` - The instance count of an EMR Instance Group.
   * * `ec2:spot-fleet-request:TargetCapacity` - The target capacity of a Spot Fleet.
   * * `appstream:fleet:DesiredCapacity` - The desired capacity of an AppStream 2.0 fleet.
   * * `dynamodb:table:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB table.
   * * `dynamodb:table:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB table.
   * * `dynamodb:index:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB global
   * secondary index.
   * * `dynamodb:index:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB global
   * secondary index.
   * * `rds:cluster:ReadReplicaCount` - The count of Aurora Replicas in an Aurora DB cluster.
   * Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
   * * `sagemaker:variant:DesiredInstanceCount` - The number of EC2 instances for a SageMaker model
   * endpoint variant.
   * * `custom-resource:ResourceType:Property` - The scalable dimension for a custom resource
   * provided by your own application or service.
   * * `comprehend:document-classifier-endpoint:DesiredInferenceUnits` - The number of inference
   * units for an Amazon Comprehend document classification endpoint.
   * * `comprehend:entity-recognizer-endpoint:DesiredInferenceUnits` - The number of inference units
   * for an Amazon Comprehend entity recognizer endpoint.
   * * `lambda:function:ProvisionedConcurrency` - The provisioned concurrency for a Lambda function.
   * * `cassandra:table:ReadCapacityUnits` - The provisioned read capacity for an Amazon Keyspaces
   * table.
   * * `cassandra:table:WriteCapacityUnits` - The provisioned write capacity for an Amazon Keyspaces
   * table.
   * * `kafka:broker-storage:VolumeSize` - The provisioned volume size (in GiB) for brokers in an
   * Amazon MSK cluster.
   * * `elasticache:replication-group:NodeGroups` - The number of node groups for an Amazon
   * ElastiCache replication group.
   * * `elasticache:replication-group:Replicas` - The number of replicas per node group for an
   * Amazon ElastiCache replication group.
   * * `neptune:cluster:ReadReplicaCount` - The count of read replicas in an Amazon Neptune DB
   * cluster.
   * * `sagemaker:variant:DesiredProvisionedConcurrency` - The provisioned concurrency for a
   * SageMaker Serverless endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension)
   * @param scalableDimension The scalable dimension. This string consists of the service namespace,
   * resource type, and scaling property. 
   */
  public fun scalableDimension(scalableDimension: String) {
    cdkBuilder.scalableDimension(scalableDimension)
  }

  /**
   * The CloudFormation-generated ID of an Application Auto Scaling scalable target.
   *
   * For more information about the ID, see the Return Value section of the
   * `AWS::ApplicationAutoScaling::ScalableTarget` resource.
   *
   *
   * You must specify either the `ScalingTargetId` property, or the `ResourceId` ,
   * `ScalableDimension` , and `ServiceNamespace` properties, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid)
   * @param scalingTargetId The CloudFormation-generated ID of an Application Auto Scaling scalable
   * target. 
   */
  public fun scalingTargetId(scalingTargetId: String) {
    cdkBuilder.scalingTargetId(scalingTargetId)
  }

  /**
   * The namespace of the AWS service that provides the resource, or a `custom-resource` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace)
   * @param serviceNamespace The namespace of the AWS service that provides the resource, or a
   * `custom-resource` . 
   */
  public fun serviceNamespace(serviceNamespace: String) {
    cdkBuilder.serviceNamespace(serviceNamespace)
  }

  /**
   * A step scaling policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
   * @param stepScalingPolicyConfiguration A step scaling policy. 
   */
  public fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: IResolvable) {
    cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration)
  }

  /**
   * A step scaling policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
   * @param stepScalingPolicyConfiguration A step scaling policy. 
   */
  public
      fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: CfnScalingPolicy.StepScalingPolicyConfigurationProperty) {
    cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration)
  }

  /**
   * A target tracking scaling policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
   * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy. 
   */
  public
      fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable) {
    cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration)
  }

  /**
   * A target tracking scaling policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
   * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy. 
   */
  public
      fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty) {
    cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration)
  }

  public fun build(): CfnScalingPolicy = cdkBuilder.build()
}
