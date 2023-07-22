@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.PlacementConstraint
import software.amazon.awscdk.services.ecs.PlacementStrategy
import software.amazon.awscdk.services.stepfunctions.tasks.EcsEc2LaunchTarget

/**
 * Configuration for running an ECS task on EC2.
 *
 * Example:
 *
 * ```
 * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
 * .isDefault(true)
 * .build());
 * Cluster cluster = Cluster.Builder.create(this, "Ec2Cluster").vpc(vpc).build();
 * cluster.addCapacity("DefaultAutoScalingGroup", AddCapacityOptions.builder()
 * .instanceType(new InstanceType("t2.micro"))
 * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
 * .build());
 * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
 * .compatibility(Compatibility.EC2)
 * .build();
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("foo/bar"))
 * .memoryLimitMiB(256)
 * .build());
 * EcsRunTask runTask = EcsRunTask.Builder.create(this, "Run")
 * .integrationPattern(IntegrationPattern.RUN_JOB)
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .launchTarget(EcsEc2LaunchTarget.Builder.create()
 * .placementStrategies(List.of(PlacementStrategy.spreadAcrossInstances(),
 * PlacementStrategy.packedByCpu(), PlacementStrategy.randomly()))
 * .placementConstraints(List.of(PlacementConstraint.memberOf("blieptuut")))
 * .build())
 * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/userguide/launch_types.html#launch-type-ec2)
 */
@CdkDslMarker
public class EcsEc2LaunchTargetDsl {
  private val cdkBuilder: EcsEc2LaunchTarget.Builder = EcsEc2LaunchTarget.Builder.create()

  private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

  private val _placementStrategies: MutableList<PlacementStrategy> = mutableListOf()

  /**
   * Placement constraints.
   *
   * Default: - None
   *
   * @param placementConstraints Placement constraints. 
   */
  public fun placementConstraints(vararg placementConstraints: PlacementConstraint) {
    _placementConstraints.addAll(listOf(*placementConstraints))
  }

  /**
   * Placement constraints.
   *
   * Default: - None
   *
   * @param placementConstraints Placement constraints. 
   */
  public fun placementConstraints(placementConstraints: Collection<PlacementConstraint>) {
    _placementConstraints.addAll(placementConstraints)
  }

  /**
   * Placement strategies.
   *
   * Default: - None
   *
   * @param placementStrategies Placement strategies. 
   */
  public fun placementStrategies(vararg placementStrategies: PlacementStrategy) {
    _placementStrategies.addAll(listOf(*placementStrategies))
  }

  /**
   * Placement strategies.
   *
   * Default: - None
   *
   * @param placementStrategies Placement strategies. 
   */
  public fun placementStrategies(placementStrategies: Collection<PlacementStrategy>) {
    _placementStrategies.addAll(placementStrategies)
  }

  public fun build(): EcsEc2LaunchTarget {
    if(_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
    if(_placementStrategies.isNotEmpty()) cdkBuilder.placementStrategies(_placementStrategies)
    return cdkBuilder.build()
  }
}
