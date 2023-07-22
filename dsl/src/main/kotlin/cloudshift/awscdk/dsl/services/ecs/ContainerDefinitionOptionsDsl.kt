@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.ContainerDefinitionOptions
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.EnvironmentFile
import software.amazon.awscdk.services.ecs.HealthCheck
import software.amazon.awscdk.services.ecs.LinuxParameters
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.PortMapping
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.SystemControl
import software.amazon.awscdk.services.ecs.Ulimit

/**
 * Example:
 *
 * ```
 * TaskDefinition taskDefinition;
 * Cluster cluster;
 * // Add a container to the task definition
 * ContainerDefinition specificContainer = taskDefinition.addContainer("Container",
 * ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("/aws/aws-example-app"))
 * .memoryLimitMiB(2048)
 * .build());
 * // Add a port mapping
 * specificContainer.addPortMappings(PortMapping.builder()
 * .containerPort(7600)
 * .protocol(Protocol.TCP)
 * .build());
 * Ec2Service.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .cloudMapOptions(CloudMapOptions.builder()
 * // Create SRV records - useful for bridge networking
 * .dnsRecordType(DnsRecordType.SRV)
 * // Targets port TCP port 7600 `specificContainer`
 * .container(specificContainer)
 * .containerPort(7600)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ContainerDefinitionOptionsDsl {
  private val cdkBuilder: ContainerDefinitionOptions.Builder = ContainerDefinitionOptions.builder()

  private val _command: MutableList<String> = mutableListOf()

  private val _dnsSearchDomains: MutableList<String> = mutableListOf()

  private val _dnsServers: MutableList<String> = mutableListOf()

  private val _dockerSecurityOptions: MutableList<String> = mutableListOf()

  private val _entryPoint: MutableList<String> = mutableListOf()

  private val _environmentFiles: MutableList<EnvironmentFile> = mutableListOf()

  private val _inferenceAcceleratorResources: MutableList<String> = mutableListOf()

  private val _portMappings: MutableList<PortMapping> = mutableListOf()

  private val _systemControls: MutableList<SystemControl> = mutableListOf()

  private val _ulimits: MutableList<Ulimit> = mutableListOf()

  /**
   * @param command The command that is passed to the container.
   * If you provide a shell command as a single string, you have to quote command-line arguments.
   */
  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  /**
   * @param command The command that is passed to the container.
   * If you provide a shell command as a single string, you have to quote command-line arguments.
   */
  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  /**
   * @param containerName The name of the container.
   */
  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  /**
   * @param cpu The minimum number of CPU units to reserve for the container.
   */
  public fun cpu(cpu: Number) {
    cdkBuilder.cpu(cpu)
  }

  /**
   * @param disableNetworking Specifies whether networking is disabled within the container.
   * When this parameter is true, networking is disabled within the container.
   */
  public fun disableNetworking(disableNetworking: Boolean) {
    cdkBuilder.disableNetworking(disableNetworking)
  }

  /**
   * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
   */
  public fun dnsSearchDomains(vararg dnsSearchDomains: String) {
    _dnsSearchDomains.addAll(listOf(*dnsSearchDomains))
  }

  /**
   * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
   */
  public fun dnsSearchDomains(dnsSearchDomains: Collection<String>) {
    _dnsSearchDomains.addAll(dnsSearchDomains)
  }

  /**
   * @param dnsServers A list of DNS servers that are presented to the container.
   */
  public fun dnsServers(vararg dnsServers: String) {
    _dnsServers.addAll(listOf(*dnsServers))
  }

  /**
   * @param dnsServers A list of DNS servers that are presented to the container.
   */
  public fun dnsServers(dnsServers: Collection<String>) {
    _dnsServers.addAll(dnsServers)
  }

  /**
   * @param dockerLabels A key/value map of labels to add to the container.
   */
  public fun dockerLabels(dockerLabels: Map<String, String>) {
    cdkBuilder.dockerLabels(dockerLabels)
  }

  /**
   * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and
   * AppArmor multi-level security systems.
   */
  public fun dockerSecurityOptions(vararg dockerSecurityOptions: String) {
    _dockerSecurityOptions.addAll(listOf(*dockerSecurityOptions))
  }

  /**
   * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and
   * AppArmor multi-level security systems.
   */
  public fun dockerSecurityOptions(dockerSecurityOptions: Collection<String>) {
    _dockerSecurityOptions.addAll(dockerSecurityOptions)
  }

  /**
   * @param entryPoint The ENTRYPOINT value to pass to the container.
   */
  public fun entryPoint(vararg entryPoint: String) {
    _entryPoint.addAll(listOf(*entryPoint))
  }

  /**
   * @param entryPoint The ENTRYPOINT value to pass to the container.
   */
  public fun entryPoint(entryPoint: Collection<String>) {
    _entryPoint.addAll(entryPoint)
  }

  /**
   * @param environment The environment variables to pass to the container.
   */
  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param environmentFiles The environment files to pass to the container.
   */
  public fun environmentFiles(vararg environmentFiles: EnvironmentFile) {
    _environmentFiles.addAll(listOf(*environmentFiles))
  }

  /**
   * @param environmentFiles The environment files to pass to the container.
   */
  public fun environmentFiles(environmentFiles: Collection<EnvironmentFile>) {
    _environmentFiles.addAll(environmentFiles)
  }

  /**
   * @param essential Specifies whether the container is marked essential.
   * If the essential parameter of a container is marked as true, and that container fails
   * or stops for any reason, all other containers that are part of the task are stopped.
   * If the essential parameter of a container is marked as false, then its failure does not
   * affect the rest of the containers in a task. All tasks must have at least one essential
   * container.
   *
   * If this parameter is omitted, a container is assumed to be essential.
   */
  public fun essential(essential: Boolean) {
    cdkBuilder.essential(essential)
  }

  /**
   * @param extraHosts A list of hostnames and IP address mappings to append to the /etc/hosts file
   * on the container.
   */
  public fun extraHosts(extraHosts: Map<String, String>) {
    cdkBuilder.extraHosts(extraHosts)
  }

  /**
   * @param gpuCount The number of GPUs assigned to the container.
   */
  public fun gpuCount(gpuCount: Number) {
    cdkBuilder.gpuCount(gpuCount)
  }

  /**
   * @param healthCheck The health check command and associated configuration parameters for the
   * container.
   */
  public fun healthCheck(healthCheck: HealthCheckDsl.() -> Unit = {}) {
    val builder = HealthCheckDsl()
    builder.apply(healthCheck)
    cdkBuilder.healthCheck(builder.build())
  }

  /**
   * @param healthCheck The health check command and associated configuration parameters for the
   * container.
   */
  public fun healthCheck(healthCheck: HealthCheck) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * @param hostname The hostname to use for your container.
   */
  public fun hostname(hostname: String) {
    cdkBuilder.hostname(hostname)
  }

  /**
   * @param image The image used to start a container. 
   * This string is passed directly to the Docker daemon.
   * Images in the Docker Hub registry are available by default.
   * Other repositories are specified with either repository-url/image:tag or
   * repository-url/image&#64;digest.
   * TODO: Update these to specify using classes of IContainerImage
   */
  public fun image(image: ContainerImage) {
    cdkBuilder.image(image)
  }

  /**
   * @param inferenceAcceleratorResources The inference accelerators referenced by the container.
   */
  public fun inferenceAcceleratorResources(vararg inferenceAcceleratorResources: String) {
    _inferenceAcceleratorResources.addAll(listOf(*inferenceAcceleratorResources))
  }

  /**
   * @param inferenceAcceleratorResources The inference accelerators referenced by the container.
   */
  public fun inferenceAcceleratorResources(inferenceAcceleratorResources: Collection<String>) {
    _inferenceAcceleratorResources.addAll(inferenceAcceleratorResources)
  }

  /**
   * @param linuxParameters Linux-specific modifications that are applied to the container, such as
   * Linux kernel capabilities.
   * For more information see
   * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html).
   */
  public fun linuxParameters(linuxParameters: LinuxParameters) {
    cdkBuilder.linuxParameters(linuxParameters)
  }

  /**
   * @param logging The log configuration specification for the container.
   */
  public fun logging(logging: LogDriver) {
    cdkBuilder.logging(logging)
  }

  /**
   * @param memoryLimitMiB The amount (in MiB) of memory to present to the container.
   * If your container attempts to exceed the allocated memory, the container
   * is terminated.
   *
   * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
   */
  public fun memoryLimitMiB(memoryLimitMiB: Number) {
    cdkBuilder.memoryLimitMiB(memoryLimitMiB)
  }

  /**
   * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container.
   * When system memory is under heavy contention, Docker attempts to keep the
   * container memory to this soft limit. However, your container can consume more
   * memory when it needs to, up to either the hard limit specified with the memory
   * parameter (if applicable), or all of the available memory on the container
   * instance, whichever comes first.
   *
   * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
   */
  public fun memoryReservationMiB(memoryReservationMiB: Number) {
    cdkBuilder.memoryReservationMiB(memoryReservationMiB)
  }

  /**
   * @param portMappings The port mappings to add to the container definition.
   */
  public fun portMappings(portMappings: PortMappingDsl.() -> Unit) {
    _portMappings.add(PortMappingDsl().apply(portMappings).build())
  }

  /**
   * @param portMappings The port mappings to add to the container definition.
   */
  public fun portMappings(portMappings: Collection<PortMapping>) {
    _portMappings.addAll(portMappings)
  }

  /**
   * @param privileged Specifies whether the container is marked as privileged.
   * When this parameter is true, the container is given elevated privileges on the host container
   * instance (similar to the root user).
   */
  public fun privileged(privileged: Boolean) {
    cdkBuilder.privileged(privileged)
  }

  /**
   * @param pseudoTerminal When this parameter is true, a TTY is allocated.
   * This parameter maps to Tty in the "Create a container section" of the
   * Docker Remote API and the --tty option to `docker run`.
   */
  public fun pseudoTerminal(pseudoTerminal: Boolean) {
    cdkBuilder.pseudoTerminal(pseudoTerminal)
  }

  /**
   * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
   * access to its root file system.
   */
  public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
    cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
  }

  /**
   * @param secrets The secret environment variables to pass to the container.
   */
  public fun secrets(secrets: Map<String, Secret>) {
    cdkBuilder.secrets(secrets)
  }

  /**
   * @param startTimeout Time duration (in seconds) to wait before giving up on resolving
   * dependencies for a container.
   */
  public fun startTimeout(startTimeout: Duration) {
    cdkBuilder.startTimeout(startTimeout)
  }

  /**
   * @param stopTimeout Time duration (in seconds) to wait before the container is forcefully killed
   * if it doesn't exit normally on its own.
   */
  public fun stopTimeout(stopTimeout: Duration) {
    cdkBuilder.stopTimeout(stopTimeout)
  }

  /**
   * @param systemControls A list of namespaced kernel parameters to set in the container.
   */
  public fun systemControls(systemControls: SystemControlDsl.() -> Unit) {
    _systemControls.add(SystemControlDsl().apply(systemControls).build())
  }

  /**
   * @param systemControls A list of namespaced kernel parameters to set in the container.
   */
  public fun systemControls(systemControls: Collection<SystemControl>) {
    _systemControls.addAll(systemControls)
  }

  /**
   * @param ulimits An array of ulimits to set in the container.
   */
  public fun ulimits(ulimits: UlimitDsl.() -> Unit) {
    _ulimits.add(UlimitDsl().apply(ulimits).build())
  }

  /**
   * @param ulimits An array of ulimits to set in the container.
   */
  public fun ulimits(ulimits: Collection<Ulimit>) {
    _ulimits.addAll(ulimits)
  }

  /**
   * @param user The user to use inside the container.
   * This parameter maps to User in the Create a container section of the Docker Remote API and
   * the --user option to docker run.
   */
  public fun user(user: String) {
    cdkBuilder.user(user)
  }

  /**
   * @param workingDirectory The working directory in which to run commands inside the container.
   */
  public fun workingDirectory(workingDirectory: String) {
    cdkBuilder.workingDirectory(workingDirectory)
  }

  public fun build(): ContainerDefinitionOptions {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_dnsSearchDomains.isNotEmpty()) cdkBuilder.dnsSearchDomains(_dnsSearchDomains)
    if(_dnsServers.isNotEmpty()) cdkBuilder.dnsServers(_dnsServers)
    if(_dockerSecurityOptions.isNotEmpty()) cdkBuilder.dockerSecurityOptions(_dockerSecurityOptions)
    if(_entryPoint.isNotEmpty()) cdkBuilder.entryPoint(_entryPoint)
    if(_environmentFiles.isNotEmpty()) cdkBuilder.environmentFiles(_environmentFiles)
    if(_inferenceAcceleratorResources.isNotEmpty())
        cdkBuilder.inferenceAcceleratorResources(_inferenceAcceleratorResources)
    if(_portMappings.isNotEmpty()) cdkBuilder.portMappings(_portMappings)
    if(_systemControls.isNotEmpty()) cdkBuilder.systemControls(_systemControls)
    if(_ulimits.isNotEmpty()) cdkBuilder.ulimits(_ulimits)
    return cdkBuilder.build()
  }
}
