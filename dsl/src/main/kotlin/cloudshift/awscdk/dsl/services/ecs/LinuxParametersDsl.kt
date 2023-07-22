@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ecs.LinuxParameters
import software.constructs.Construct

/**
 * Linux-specific options that are applied to the container.
 *
 * Example:
 *
 * ```
 * TaskDefinition taskDefinition;
 * taskDefinition.addContainer("container", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .memoryLimitMiB(1024)
 * .linuxParameters(LinuxParameters.Builder.create(this, "LinuxParameters")
 * .initProcessEnabled(true)
 * .sharedMemorySize(1024)
 * .maxSwap(Size.mebibytes(5000))
 * .swappiness(90)
 * .build())
 * .build());
 * ```
 */
@CdkDslMarker
public class LinuxParametersDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: LinuxParameters.Builder = LinuxParameters.Builder.create(scope, id)

  /**
   * Specifies whether to run an init process inside the container that forwards signals and reaps
   * processes.
   *
   * Default: false
   *
   * @param initProcessEnabled Specifies whether to run an init process inside the container that
   * forwards signals and reaps processes. 
   */
  public fun initProcessEnabled(initProcessEnabled: Boolean) {
    cdkBuilder.initProcessEnabled(initProcessEnabled)
  }

  /**
   * The total amount of swap memory a container can use.
   *
   * This parameter
   * will be translated to the --memory-swap option to docker run.
   *
   * This parameter is only supported when you are using the EC2 launch type.
   * Accepted values are positive integers.
   *
   * Default: No swap.
   *
   * @param maxSwap The total amount of swap memory a container can use. 
   */
  public fun maxSwap(maxSwap: Size) {
    cdkBuilder.maxSwap(maxSwap)
  }

  /**
   * The value for the size of the /dev/shm volume.
   *
   * Default: No shared memory.
   *
   * @param sharedMemorySize The value for the size of the /dev/shm volume. 
   */
  public fun sharedMemorySize(sharedMemorySize: Number) {
    cdkBuilder.sharedMemorySize(sharedMemorySize)
  }

  /**
   * This allows you to tune a container's memory swappiness behavior.
   *
   * This parameter
   * maps to the --memory-swappiness option to docker run. The swappiness relates
   * to the kernel's tendency to swap memory. A value of 0 will cause swapping to
   * not happen unless absolutely necessary. A value of 100 will cause pages to
   * be swapped very aggressively.
   *
   * This parameter is only supported when you are using the EC2 launch type.
   * Accepted values are whole numbers between 0 and 100. If a value is not
   * specified for maxSwap then this parameter is ignored.
   *
   * Default: 60
   *
   * @param swappiness This allows you to tune a container's memory swappiness behavior. 
   */
  public fun swappiness(swappiness: Number) {
    cdkBuilder.swappiness(swappiness)
  }

  public fun build(): LinuxParameters = cdkBuilder.build()
}
