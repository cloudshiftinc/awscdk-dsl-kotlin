@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.EnvironmentFile
import software.amazon.awscdk.services.ecs.FirelensConfig
import software.amazon.awscdk.services.ecs.FirelensLogRouter
import software.amazon.awscdk.services.ecs.HealthCheck
import software.amazon.awscdk.services.ecs.LinuxParameters
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.PortMapping
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.SystemControl
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.ecs.Ulimit
import software.constructs.Construct

/**
 * Firelens log router.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ecs.*;
 * AppProtocol appProtocol;
 * ContainerImage containerImage;
 * EnvironmentFile environmentFile;
 * LinuxParameters linuxParameters;
 * LogDriver logDriver;
 * Secret secret;
 * TaskDefinition taskDefinition;
 * FirelensLogRouter firelensLogRouter = FirelensLogRouter.Builder.create(this,
 * "MyFirelensLogRouter")
 * .firelensConfig(FirelensConfig.builder()
 * .type(FirelensLogRouterType.FLUENTBIT)
 * // the properties below are optional
 * .options(FirelensOptions.builder()
 * .configFileType(FirelensConfigFileType.S3)
 * .configFileValue("configFileValue")
 * .enableECSLogMetadata(false)
 * .build())
 * .build())
 * .image(containerImage)
 * .taskDefinition(taskDefinition)
 * // the properties below are optional
 * .command(List.of("command"))
 * .containerName("containerName")
 * .cpu(123)
 * .disableNetworking(false)
 * .dnsSearchDomains(List.of("dnsSearchDomains"))
 * .dnsServers(List.of("dnsServers"))
 * .dockerLabels(Map.of(
 * "dockerLabelsKey", "dockerLabels"))
 * .dockerSecurityOptions(List.of("dockerSecurityOptions"))
 * .entryPoint(List.of("entryPoint"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .environmentFiles(List.of(environmentFile))
 * .essential(false)
 * .extraHosts(Map.of(
 * "extraHostsKey", "extraHosts"))
 * .gpuCount(123)
 * .healthCheck(HealthCheck.builder()
 * .command(List.of("command"))
 * // the properties below are optional
 * .interval(Duration.minutes(30))
 * .retries(123)
 * .startPeriod(Duration.minutes(30))
 * .timeout(Duration.minutes(30))
 * .build())
 * .hostname("hostname")
 * .inferenceAcceleratorResources(List.of("inferenceAcceleratorResources"))
 * .linuxParameters(linuxParameters)
 * .logging(logDriver)
 * .memoryLimitMiB(123)
 * .memoryReservationMiB(123)
 * .portMappings(List.of(PortMapping.builder()
 * .containerPort(123)
 * // the properties below are optional
 * .appProtocol(appProtocol)
 * .containerPortRange("containerPortRange")
 * .hostPort(123)
 * .name("name")
 * .protocol(Protocol.TCP)
 * .build()))
 * .privileged(false)
 * .pseudoTerminal(false)
 * .readonlyRootFilesystem(false)
 * .secrets(Map.of(
 * "secretsKey", secret))
 * .startTimeout(Duration.minutes(30))
 * .stopTimeout(Duration.minutes(30))
 * .systemControls(List.of(SystemControl.builder()
 * .namespace("namespace")
 * .value("value")
 * .build()))
 * .ulimits(List.of(Ulimit.builder()
 * .hardLimit(123)
 * .name(UlimitName.CORE)
 * .softLimit(123)
 * .build()))
 * .user("user")
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 */
@CdkDslMarker
public class FirelensLogRouterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: FirelensLogRouter.Builder = FirelensLogRouter.Builder.create(scope, id)

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
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     *
     * @param command The command that is passed to the container.
     */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     *
     * @param command The command that is passed to the container.
     */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /**
     * The name of the container.
     *
     * Default: - id of node associated with ContainerDefinition.
     *
     * @param containerName The name of the container.
     */
    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    /**
     * The minimum number of CPU units to reserve for the container.
     *
     * Default: - No minimum CPU units reserved.
     *
     * @param cpu The minimum number of CPU units to reserve for the container.
     */
    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    /**
     * Specifies whether networking is disabled within the container.
     *
     * When this parameter is true, networking is disabled within the container.
     *
     * Default: false
     *
     * @param disableNetworking Specifies whether networking is disabled within the container.
     */
    public fun disableNetworking(disableNetworking: Boolean) {
        cdkBuilder.disableNetworking(disableNetworking)
    }

    /**
     * A list of DNS search domains that are presented to the container.
     *
     * Default: - No search domains.
     *
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
     */
    public fun dnsSearchDomains(vararg dnsSearchDomains: String) {
        _dnsSearchDomains.addAll(listOf(*dnsSearchDomains))
    }

    /**
     * A list of DNS search domains that are presented to the container.
     *
     * Default: - No search domains.
     *
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
     */
    public fun dnsSearchDomains(dnsSearchDomains: Collection<String>) {
        _dnsSearchDomains.addAll(dnsSearchDomains)
    }

    /**
     * A list of DNS servers that are presented to the container.
     *
     * Default: - Default DNS servers.
     *
     * @param dnsServers A list of DNS servers that are presented to the container.
     */
    public fun dnsServers(vararg dnsServers: String) {
        _dnsServers.addAll(listOf(*dnsServers))
    }

    /**
     * A list of DNS servers that are presented to the container.
     *
     * Default: - Default DNS servers.
     *
     * @param dnsServers A list of DNS servers that are presented to the container.
     */
    public fun dnsServers(dnsServers: Collection<String>) {
        _dnsServers.addAll(dnsServers)
    }

    /**
     * A key/value map of labels to add to the container.
     *
     * Default: - No labels.
     *
     * @param dockerLabels A key/value map of labels to add to the container.
     */
    public fun dockerLabels(dockerLabels: Map<String, String>) {
        cdkBuilder.dockerLabels(dockerLabels)
    }

    /**
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security
     * systems.
     *
     * Default: - No security labels.
     *
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and
     *   AppArmor multi-level security systems.
     */
    public fun dockerSecurityOptions(vararg dockerSecurityOptions: String) {
        _dockerSecurityOptions.addAll(listOf(*dockerSecurityOptions))
    }

    /**
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security
     * systems.
     *
     * Default: - No security labels.
     *
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and
     *   AppArmor multi-level security systems.
     */
    public fun dockerSecurityOptions(dockerSecurityOptions: Collection<String>) {
        _dockerSecurityOptions.addAll(dockerSecurityOptions)
    }

    /**
     * The ENTRYPOINT value to pass to the container.
     *
     * Default: - Entry point configured in container.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     *
     * @param entryPoint The ENTRYPOINT value to pass to the container.
     */
    public fun entryPoint(vararg entryPoint: String) {
        _entryPoint.addAll(listOf(*entryPoint))
    }

    /**
     * The ENTRYPOINT value to pass to the container.
     *
     * Default: - Entry point configured in container.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     *
     * @param entryPoint The ENTRYPOINT value to pass to the container.
     */
    public fun entryPoint(entryPoint: Collection<String>) {
        _entryPoint.addAll(entryPoint)
    }

    /**
     * The environment variables to pass to the container.
     *
     * Default: - No environment variables.
     *
     * @param environment The environment variables to pass to the container.
     */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /**
     * The environment files to pass to the container.
     *
     * Default: - No environment files.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
     *
     * @param environmentFiles The environment files to pass to the container.
     */
    public fun environmentFiles(vararg environmentFiles: EnvironmentFile) {
        _environmentFiles.addAll(listOf(*environmentFiles))
    }

    /**
     * The environment files to pass to the container.
     *
     * Default: - No environment files.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
     *
     * @param environmentFiles The environment files to pass to the container.
     */
    public fun environmentFiles(environmentFiles: Collection<EnvironmentFile>) {
        _environmentFiles.addAll(environmentFiles)
    }

    /**
     * Specifies whether the container is marked essential.
     *
     * If the essential parameter of a container is marked as true, and that container fails or
     * stops for any reason, all other containers that are part of the task are stopped. If the
     * essential parameter of a container is marked as false, then its failure does not affect the
     * rest of the containers in a task. All tasks must have at least one essential container.
     *
     * If this parameter is omitted, a container is assumed to be essential.
     *
     * Default: true
     *
     * @param essential Specifies whether the container is marked essential.
     */
    public fun essential(essential: Boolean) {
        cdkBuilder.essential(essential)
    }

    /**
     * A list of hostnames and IP address mappings to append to the /etc/hosts file on the
     * container.
     *
     * Default: - No extra hosts.
     *
     * @param extraHosts A list of hostnames and IP address mappings to append to the /etc/hosts
     *   file on the container.
     */
    public fun extraHosts(extraHosts: Map<String, String>) {
        cdkBuilder.extraHosts(extraHosts)
    }

    /**
     * Firelens configuration.
     *
     * @param firelensConfig Firelens configuration.
     */
    public fun firelensConfig(firelensConfig: FirelensConfigDsl.() -> Unit = {}) {
        val builder = FirelensConfigDsl()
        builder.apply(firelensConfig)
        cdkBuilder.firelensConfig(builder.build())
    }

    /**
     * Firelens configuration.
     *
     * @param firelensConfig Firelens configuration.
     */
    public fun firelensConfig(firelensConfig: FirelensConfig) {
        cdkBuilder.firelensConfig(firelensConfig)
    }

    /**
     * The number of GPUs assigned to the container.
     *
     * Default: - No GPUs assigned.
     *
     * @param gpuCount The number of GPUs assigned to the container.
     */
    public fun gpuCount(gpuCount: Number) {
        cdkBuilder.gpuCount(gpuCount)
    }

    /**
     * The health check command and associated configuration parameters for the container.
     *
     * Default: - Health check configuration from container.
     *
     * @param healthCheck The health check command and associated configuration parameters for the
     *   container.
     */
    public fun healthCheck(healthCheck: HealthCheckDsl.() -> Unit = {}) {
        val builder = HealthCheckDsl()
        builder.apply(healthCheck)
        cdkBuilder.healthCheck(builder.build())
    }

    /**
     * The health check command and associated configuration parameters for the container.
     *
     * Default: - Health check configuration from container.
     *
     * @param healthCheck The health check command and associated configuration parameters for the
     *   container.
     */
    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /**
     * The hostname to use for your container.
     *
     * Default: - Automatic hostname.
     *
     * @param hostname The hostname to use for your container.
     */
    public fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
    }

    /**
     * The image used to start a container.
     *
     * This string is passed directly to the Docker daemon. Images in the Docker Hub registry are
     * available by default. Other repositories are specified with either repository-url/image:tag
     * or repository-url/image&#64;digest.
     *
     * @param image The image used to start a container.
     *
     * TODO: Update these to specify using classes of IContainerImage
     */
    public fun image(image: ContainerImage) {
        cdkBuilder.image(image)
    }

    /**
     * The inference accelerators referenced by the container.
     *
     * Default: - No inference accelerators assigned.
     *
     * @param inferenceAcceleratorResources The inference accelerators referenced by the container.
     */
    public fun inferenceAcceleratorResources(vararg inferenceAcceleratorResources: String) {
        _inferenceAcceleratorResources.addAll(listOf(*inferenceAcceleratorResources))
    }

    /**
     * The inference accelerators referenced by the container.
     *
     * Default: - No inference accelerators assigned.
     *
     * @param inferenceAcceleratorResources The inference accelerators referenced by the container.
     */
    public fun inferenceAcceleratorResources(inferenceAcceleratorResources: Collection<String>) {
        _inferenceAcceleratorResources.addAll(inferenceAcceleratorResources)
    }

    /**
     * Linux-specific modifications that are applied to the container, such as Linux kernel
     * capabilities.
     *
     * For more information see
     * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html).
     *
     * Default: - No Linux parameters.
     *
     * @param linuxParameters Linux-specific modifications that are applied to the container, such
     *   as Linux kernel capabilities.
     */
    public fun linuxParameters(linuxParameters: LinuxParameters) {
        cdkBuilder.linuxParameters(linuxParameters)
    }

    /**
     * The log configuration specification for the container.
     *
     * Default: - Containers use the same logging driver that the Docker daemon uses.
     *
     * @param logging The log configuration specification for the container.
     */
    public fun logging(logging: LogDriver) {
        cdkBuilder.logging(logging)
    }

    /**
     * The amount (in MiB) of memory to present to the container.
     *
     * If your container attempts to exceed the allocated memory, the container is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory limit.
     *
     * @param memoryLimitMiB The amount (in MiB) of memory to present to the container.
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * The soft limit (in MiB) of memory to reserve for the container.
     *
     * When system memory is under heavy contention, Docker attempts to keep the container memory to
     * this soft limit. However, your container can consume more memory when it needs to, up to
     * either the hard limit specified with the memory parameter (if applicable), or all of the
     * available memory on the container instance, whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory reserved.
     *
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container.
     */
    public fun memoryReservationMiB(memoryReservationMiB: Number) {
        cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    /**
     * The port mappings to add to the container definition.
     *
     * Default: - No ports are mapped.
     *
     * @param portMappings The port mappings to add to the container definition.
     */
    public fun portMappings(portMappings: PortMappingDsl.() -> Unit) {
        _portMappings.add(PortMappingDsl().apply(portMappings).build())
    }

    /**
     * The port mappings to add to the container definition.
     *
     * Default: - No ports are mapped.
     *
     * @param portMappings The port mappings to add to the container definition.
     */
    public fun portMappings(portMappings: Collection<PortMapping>) {
        _portMappings.addAll(portMappings)
    }

    /**
     * Specifies whether the container is marked as privileged.
     *
     * When this parameter is true, the container is given elevated privileges on the host container
     * instance (similar to the root user).
     *
     * Default: false
     *
     * @param privileged Specifies whether the container is marked as privileged.
     */
    public fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
    }

    /**
     * When this parameter is true, a TTY is allocated.
     *
     * This parameter maps to Tty in the "Create a container section" of the Docker Remote API and
     * the --tty option to `docker run`.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_pseudoterminal)
     *
     * @param pseudoTerminal When this parameter is true, a TTY is allocated.
     */
    public fun pseudoTerminal(pseudoTerminal: Boolean) {
        cdkBuilder.pseudoTerminal(pseudoTerminal)
    }

    /**
     * When this parameter is true, the container is given read-only access to its root file system.
     *
     * Default: false
     *
     * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
     *   access to its root file system.
     */
    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    /**
     * The secret environment variables to pass to the container.
     *
     * Default: - No secret environment variables.
     *
     * @param secrets The secret environment variables to pass to the container.
     */
    public fun secrets(secrets: Map<String, Secret>) {
        cdkBuilder.secrets(secrets)
    }

    /**
     * Time duration (in seconds) to wait before giving up on resolving dependencies for a
     * container.
     *
     * Default: - none
     *
     * @param startTimeout Time duration (in seconds) to wait before giving up on resolving
     *   dependencies for a container.
     */
    public fun startTimeout(startTimeout: Duration) {
        cdkBuilder.startTimeout(startTimeout)
    }

    /**
     * Time duration (in seconds) to wait before the container is forcefully killed if it doesn't
     * exit normally on its own.
     *
     * Default: - none
     *
     * @param stopTimeout Time duration (in seconds) to wait before the container is forcefully
     *   killed if it doesn't exit normally on its own.
     */
    public fun stopTimeout(stopTimeout: Duration) {
        cdkBuilder.stopTimeout(stopTimeout)
    }

    /**
     * A list of namespaced kernel parameters to set in the container.
     *
     * Default: - No system controls are set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_systemcontrols)
     *
     * @param systemControls A list of namespaced kernel parameters to set in the container.
     */
    public fun systemControls(systemControls: SystemControlDsl.() -> Unit) {
        _systemControls.add(SystemControlDsl().apply(systemControls).build())
    }

    /**
     * A list of namespaced kernel parameters to set in the container.
     *
     * Default: - No system controls are set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_systemcontrols)
     *
     * @param systemControls A list of namespaced kernel parameters to set in the container.
     */
    public fun systemControls(systemControls: Collection<SystemControl>) {
        _systemControls.addAll(systemControls)
    }

    /**
     * The name of the task definition that includes this container definition.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param taskDefinition The name of the task definition that includes this container
     *   definition.
     */
    public fun taskDefinition(taskDefinition: TaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    /**
     * An array of ulimits to set in the container.
     *
     * @param ulimits An array of ulimits to set in the container.
     */
    public fun ulimits(ulimits: UlimitDsl.() -> Unit) {
        _ulimits.add(UlimitDsl().apply(ulimits).build())
    }

    /**
     * An array of ulimits to set in the container.
     *
     * @param ulimits An array of ulimits to set in the container.
     */
    public fun ulimits(ulimits: Collection<Ulimit>) {
        _ulimits.addAll(ulimits)
    }

    /**
     * The user to use inside the container.
     *
     * This parameter maps to User in the Create a container section of the Docker Remote API and
     * the --user option to docker run.
     *
     * Default: root
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#ContainerDefinition-user)
     *
     * @param user The user to use inside the container.
     */
    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    /**
     * The working directory in which to run commands inside the container.
     *
     * Default: /
     *
     * @param workingDirectory The working directory in which to run commands inside the container.
     */
    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): FirelensLogRouter {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_dnsSearchDomains.isNotEmpty()) cdkBuilder.dnsSearchDomains(_dnsSearchDomains)
        if (_dnsServers.isNotEmpty()) cdkBuilder.dnsServers(_dnsServers)
        if (_dockerSecurityOptions.isNotEmpty())
            cdkBuilder.dockerSecurityOptions(_dockerSecurityOptions)
        if (_entryPoint.isNotEmpty()) cdkBuilder.entryPoint(_entryPoint)
        if (_environmentFiles.isNotEmpty()) cdkBuilder.environmentFiles(_environmentFiles)
        if (_inferenceAcceleratorResources.isNotEmpty())
            cdkBuilder.inferenceAcceleratorResources(_inferenceAcceleratorResources)
        if (_portMappings.isNotEmpty()) cdkBuilder.portMappings(_portMappings)
        if (_systemControls.isNotEmpty()) cdkBuilder.systemControls(_systemControls)
        if (_ulimits.isNotEmpty()) cdkBuilder.ulimits(_ulimits)
        return cdkBuilder.build()
    }
}
