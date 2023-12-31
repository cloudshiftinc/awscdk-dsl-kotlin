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
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * The `ContainerDefinition` property specifies a container definition.
 *
 * Container definitions are used in task definitions to describe the different containers that are
 * launched as part of a task.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ContainerDefinitionProperty containerDefinitionProperty = ContainerDefinitionProperty.builder()
 * .image("image")
 * .name("name")
 * // the properties below are optional
 * .command(List.of("command"))
 * .cpu(123)
 * .dependsOn(List.of(ContainerDependencyProperty.builder()
 * .condition("condition")
 * .containerName("containerName")
 * .build()))
 * .disableNetworking(false)
 * .dnsSearchDomains(List.of("dnsSearchDomains"))
 * .dnsServers(List.of("dnsServers"))
 * .dockerLabels(Map.of(
 * "dockerLabelsKey", "dockerLabels"))
 * .dockerSecurityOptions(List.of("dockerSecurityOptions"))
 * .entryPoint(List.of("entryPoint"))
 * .environment(List.of(KeyValuePairProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .environmentFiles(List.of(EnvironmentFileProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .essential(false)
 * .extraHosts(List.of(HostEntryProperty.builder()
 * .hostname("hostname")
 * .ipAddress("ipAddress")
 * .build()))
 * .firelensConfiguration(FirelensConfigurationProperty.builder()
 * .options(Map.of(
 * "optionsKey", "options"))
 * .type("type")
 * .build())
 * .healthCheck(HealthCheckProperty.builder()
 * .command(List.of("command"))
 * .interval(123)
 * .retries(123)
 * .startPeriod(123)
 * .timeout(123)
 * .build())
 * .hostname("hostname")
 * .interactive(false)
 * .links(List.of("links"))
 * .linuxParameters(LinuxParametersProperty.builder()
 * .capabilities(KernelCapabilitiesProperty.builder()
 * .add(List.of("add"))
 * .drop(List.of("drop"))
 * .build())
 * .devices(List.of(DeviceProperty.builder()
 * .containerPath("containerPath")
 * .hostPath("hostPath")
 * .permissions(List.of("permissions"))
 * .build()))
 * .initProcessEnabled(false)
 * .maxSwap(123)
 * .sharedMemorySize(123)
 * .swappiness(123)
 * .tmpfs(List.of(TmpfsProperty.builder()
 * .size(123)
 * // the properties below are optional
 * .containerPath("containerPath")
 * .mountOptions(List.of("mountOptions"))
 * .build()))
 * .build())
 * .logConfiguration(LogConfigurationProperty.builder()
 * .logDriver("logDriver")
 * // the properties below are optional
 * .options(Map.of(
 * "optionsKey", "options"))
 * .secretOptions(List.of(SecretProperty.builder()
 * .name("name")
 * .valueFrom("valueFrom")
 * .build()))
 * .build())
 * .memory(123)
 * .memoryReservation(123)
 * .mountPoints(List.of(MountPointProperty.builder()
 * .containerPath("containerPath")
 * .readOnly(false)
 * .sourceVolume("sourceVolume")
 * .build()))
 * .portMappings(List.of(PortMappingProperty.builder()
 * .appProtocol("appProtocol")
 * .containerPort(123)
 * .containerPortRange("containerPortRange")
 * .hostPort(123)
 * .name("name")
 * .protocol("protocol")
 * .build()))
 * .privileged(false)
 * .pseudoTerminal(false)
 * .readonlyRootFilesystem(false)
 * .repositoryCredentials(RepositoryCredentialsProperty.builder()
 * .credentialsParameter("credentialsParameter")
 * .build())
 * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .secrets(List.of(SecretProperty.builder()
 * .name("name")
 * .valueFrom("valueFrom")
 * .build()))
 * .startTimeout(123)
 * .stopTimeout(123)
 * .systemControls(List.of(SystemControlProperty.builder()
 * .namespace("namespace")
 * .value("value")
 * .build()))
 * .ulimits(List.of(UlimitProperty.builder()
 * .hardLimit(123)
 * .name("name")
 * .softLimit(123)
 * .build()))
 * .user("user")
 * .volumesFrom(List.of(VolumeFromProperty.builder()
 * .readOnly(false)
 * .sourceContainer("sourceContainer")
 * .build()))
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionContainerDefinitionPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.ContainerDefinitionProperty.Builder =
        CfnTaskDefinition.ContainerDefinitionProperty.builder()

    private val _command: MutableList<String> = mutableListOf()

    private val _dependsOn: MutableList<Any> = mutableListOf()

    private val _dnsSearchDomains: MutableList<String> = mutableListOf()

    private val _dnsServers: MutableList<String> = mutableListOf()

    private val _dockerSecurityOptions: MutableList<String> = mutableListOf()

    private val _entryPoint: MutableList<String> = mutableListOf()

    private val _environment: MutableList<Any> = mutableListOf()

    private val _environmentFiles: MutableList<Any> = mutableListOf()

    private val _extraHosts: MutableList<Any> = mutableListOf()

    private val _links: MutableList<String> = mutableListOf()

    private val _mountPoints: MutableList<Any> = mutableListOf()

    private val _portMappings: MutableList<Any> = mutableListOf()

    private val _resourceRequirements: MutableList<Any> = mutableListOf()

    private val _secrets: MutableList<Any> = mutableListOf()

    private val _systemControls: MutableList<Any> = mutableListOf()

    private val _ulimits: MutableList<Any> = mutableListOf()

    private val _volumesFrom: MutableList<Any> = mutableListOf()

    /**
     * @param command The command that's passed to the container. This parameter maps to `Cmd` in
     *   the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `COMMAND` parameter to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   . For more information, see
     *   [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
     *   . If there are multiple arguments, each argument is a separated string in the array.
     */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /**
     * @param command The command that's passed to the container. This parameter maps to `Cmd` in
     *   the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `COMMAND` parameter to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   . For more information, see
     *   [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
     *   . If there are multiple arguments, each argument is a separated string in the array.
     */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /**
     * @param cpu The number of `cpu` units reserved for the container. This parameter maps to
     *   `CpuShares` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--cpu-shares` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This field is optional for tasks using the Fargate launch type, and the only requirement is
     * that the total amount of CPU reserved for all containers within a task be lower than the
     * task-level `cpu` value.
     *
     * You can determine the number of CPU units that are available per EC2 instance type by
     * multiplying the vCPUs listed for that instance type on the
     * [Amazon EC2 Instances](https://docs.aws.amazon.com/ec2/instance-types/) detail page by 1,024.
     *
     * Linux containers share unallocated CPU units with other containers on the container instance
     * with the same ratio as their allocated amount. For example, if you run a single-container
     * task on a single-core instance type with 512 CPU units specified for that container, and
     * that's the only task running on the container instance, that container could use the full
     * 1,024 CPU unit share at any given time. However, if you launched another copy of the same
     * task on that container instance, each task is guaranteed a minimum of 512 CPU units when
     * needed. Moreover, each container could float to higher CPU usage if the other container was
     * not using it. If both tasks were 100% active all of the time, they would be limited to 512
     * CPU units.
     *
     * On Linux container instances, the Docker daemon on the container instance uses the CPU value
     * to calculate the relative CPU share ratios for running containers. For more information, see
     * [CPU share constraint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#cpu-share-constraint)
     * in the Docker documentation. The minimum valid CPU share value that the Linux kernel allows
     * is 2. However, the CPU parameter isn't required, and you can use CPU values below 2 in your
     * container definitions. For CPU values below 2 (including null), the behavior varies based on
     * your Amazon ECS container agent version:
     * * *Agent versions less than or equal to 1.1.0:* Null and zero CPU values are passed to Docker
     *   as 0, which Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to Docker
     *   as 1, which the Linux kernel converts to two CPU shares.
     * * *Agent versions greater than or equal to 1.2.0:* Null, zero, and CPU values of 1 are passed
     *   to Docker as 2.
     *
     * On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota.
     * Windows containers only have access to the specified amount of CPU that's described in the
     * task definition. A null or zero CPU value is passed to Docker as `0` , which Windows
     * interprets as 1% of one CPU.
     */
    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    /**
     * @param dependsOn The dependencies defined for container startup and shutdown. A container can
     *   contain multiple dependencies. When a dependency is defined for container startup, for
     *   container shutdown it is reversed.
     *
     * For tasks using the EC2 launch type, the container instances require at least version 1.26.0
     * of the container agent to turn on container dependencies. However, we recommend using the
     * latest container agent version. For information about checking your agent version and
     * updating to the latest version, see
     * [Updating the Amazon ECS Container Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html)
     * in the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
     * package. If your container instances are launched from version `20190301` or later, then they
     * contain the required versions of the container agent and `ecs-init` . For more information,
     * see
     * [Amazon ECS-optimized Linux AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * For tasks using the Fargate launch type, the task or service requires the following
     * platforms:
     * * Linux platform version `1.3.0` or later.
     * * Windows platform version `1.0.0` or later.
     *
     * If the task definition is used in a blue/green deployment that uses
     * [AWS::CodeDeploy::DeploymentGroup BlueGreenDeploymentConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
     * , the `dependsOn` parameter is not supported. For more information see
     * [Issue #680](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-coverage-roadmap/issues/680)
     * on the on the GitHub website.
     */
    public fun dependsOn(vararg dependsOn: Any) {
        _dependsOn.addAll(listOf(*dependsOn))
    }

    /**
     * @param dependsOn The dependencies defined for container startup and shutdown. A container can
     *   contain multiple dependencies. When a dependency is defined for container startup, for
     *   container shutdown it is reversed.
     *
     * For tasks using the EC2 launch type, the container instances require at least version 1.26.0
     * of the container agent to turn on container dependencies. However, we recommend using the
     * latest container agent version. For information about checking your agent version and
     * updating to the latest version, see
     * [Updating the Amazon ECS Container Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html)
     * in the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
     * package. If your container instances are launched from version `20190301` or later, then they
     * contain the required versions of the container agent and `ecs-init` . For more information,
     * see
     * [Amazon ECS-optimized Linux AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * For tasks using the Fargate launch type, the task or service requires the following
     * platforms:
     * * Linux platform version `1.3.0` or later.
     * * Windows platform version `1.0.0` or later.
     *
     * If the task definition is used in a blue/green deployment that uses
     * [AWS::CodeDeploy::DeploymentGroup BlueGreenDeploymentConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
     * , the `dependsOn` parameter is not supported. For more information see
     * [Issue #680](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-coverage-roadmap/issues/680)
     * on the on the GitHub website.
     */
    public fun dependsOn(dependsOn: Collection<Any>) {
        _dependsOn.addAll(dependsOn)
    }

    /**
     * @param dependsOn The dependencies defined for container startup and shutdown. A container can
     *   contain multiple dependencies. When a dependency is defined for container startup, for
     *   container shutdown it is reversed.
     *
     * For tasks using the EC2 launch type, the container instances require at least version 1.26.0
     * of the container agent to turn on container dependencies. However, we recommend using the
     * latest container agent version. For information about checking your agent version and
     * updating to the latest version, see
     * [Updating the Amazon ECS Container Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html)
     * in the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
     * package. If your container instances are launched from version `20190301` or later, then they
     * contain the required versions of the container agent and `ecs-init` . For more information,
     * see
     * [Amazon ECS-optimized Linux AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * For tasks using the Fargate launch type, the task or service requires the following
     * platforms:
     * * Linux platform version `1.3.0` or later.
     * * Windows platform version `1.0.0` or later.
     *
     * If the task definition is used in a blue/green deployment that uses
     * [AWS::CodeDeploy::DeploymentGroup BlueGreenDeploymentConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
     * , the `dependsOn` parameter is not supported. For more information see
     * [Issue #680](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-coverage-roadmap/issues/680)
     * on the on the GitHub website.
     */
    public fun dependsOn(dependsOn: IResolvable) {
        cdkBuilder.dependsOn(dependsOn)
    }

    /**
     * @param disableNetworking When this parameter is true, networking is off within the container.
     *   This parameter maps to `NetworkDisabled` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   .
     *
     * This parameter is not supported for Windows containers.
     */
    public fun disableNetworking(disableNetworking: Boolean) {
        cdkBuilder.disableNetworking(disableNetworking)
    }

    /**
     * @param disableNetworking When this parameter is true, networking is off within the container.
     *   This parameter maps to `NetworkDisabled` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   .
     *
     * This parameter is not supported for Windows containers.
     */
    public fun disableNetworking(disableNetworking: IResolvable) {
        cdkBuilder.disableNetworking(disableNetworking)
    }

    /**
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
     *   This parameter maps to `DnsSearch` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--dns-search` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter is not supported for Windows containers.
     */
    public fun dnsSearchDomains(vararg dnsSearchDomains: String) {
        _dnsSearchDomains.addAll(listOf(*dnsSearchDomains))
    }

    /**
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
     *   This parameter maps to `DnsSearch` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--dns-search` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter is not supported for Windows containers.
     */
    public fun dnsSearchDomains(dnsSearchDomains: Collection<String>) {
        _dnsSearchDomains.addAll(dnsSearchDomains)
    }

    /**
     * @param dnsServers A list of DNS servers that are presented to the container. This parameter
     *   maps to `Dns` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--dns` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter is not supported for Windows containers.
     */
    public fun dnsServers(vararg dnsServers: String) {
        _dnsServers.addAll(listOf(*dnsServers))
    }

    /**
     * @param dnsServers A list of DNS servers that are presented to the container. This parameter
     *   maps to `Dns` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--dns` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter is not supported for Windows containers.
     */
    public fun dnsServers(dnsServers: Collection<String>) {
        _dnsServers.addAll(dnsServers)
    }

    /**
     * @param dockerLabels A key/value map of labels to add to the container. This parameter maps to
     *   `Labels` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--label` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   . This parameter requires version 1.18 of the Docker Remote API or greater on your
     *   container instance. To check the Docker Remote API version on your container instance, log
     *   in to your container instance and run the following command: `sudo docker version --format
     *   '{{.Server.APIVersion}}'`
     */
    public fun dockerLabels(dockerLabels: Map<String, String>) {
        cdkBuilder.dockerLabels(dockerLabels)
    }

    /**
     * @param dockerLabels A key/value map of labels to add to the container. This parameter maps to
     *   `Labels` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--label` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   . This parameter requires version 1.18 of the Docker Remote API or greater on your
     *   container instance. To check the Docker Remote API version on your container instance, log
     *   in to your container instance and run the following command: `sudo docker version --format
     *   '{{.Server.APIVersion}}'`
     */
    public fun dockerLabels(dockerLabels: IResolvable) {
        cdkBuilder.dockerLabels(dockerLabels)
    }

    /**
     * @param dockerSecurityOptions A list of strings to provide custom configuration for multiple
     *   security systems. For more information about valid values, see
     *   [Docker Run Security Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   . This field isn't valid for containers in tasks using the Fargate launch type.
     *
     * For Linux tasks on EC2, this parameter can be used to reference custom labels for SELinux and
     * AppArmor multi-level security systems.
     *
     * For any tasks on EC2, this parameter can be used to reference a credential spec file that
     * configures a container for Active Directory authentication. For more information, see
     * [Using gMSAs for Windows Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html)
     * and
     * [Using gMSAs for Linux Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * This parameter maps to `SecurityOpt` in the
     * [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the
     * [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     * and the `--security-opt` option to
     * [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * The Amazon ECS container agent running on a container instance must register with the
     * `ECS_SELINUX_CAPABLE=true` or `ECS_APPARMOR_CAPABLE=true` environment variables before
     * containers placed on that instance can use these security options. For more information, see
     * [Amazon ECS Container Agent Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * For more information about valid values, see
     * [Docker Run Security Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * Valid values: "no-new-privileges" | "apparmor:PROFILE" | "label:value" |
     * "credentialspec:CredentialSpecFilePath"
     */
    public fun dockerSecurityOptions(vararg dockerSecurityOptions: String) {
        _dockerSecurityOptions.addAll(listOf(*dockerSecurityOptions))
    }

    /**
     * @param dockerSecurityOptions A list of strings to provide custom configuration for multiple
     *   security systems. For more information about valid values, see
     *   [Docker Run Security Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   . This field isn't valid for containers in tasks using the Fargate launch type.
     *
     * For Linux tasks on EC2, this parameter can be used to reference custom labels for SELinux and
     * AppArmor multi-level security systems.
     *
     * For any tasks on EC2, this parameter can be used to reference a credential spec file that
     * configures a container for Active Directory authentication. For more information, see
     * [Using gMSAs for Windows Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html)
     * and
     * [Using gMSAs for Linux Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * This parameter maps to `SecurityOpt` in the
     * [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the
     * [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     * and the `--security-opt` option to
     * [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * The Amazon ECS container agent running on a container instance must register with the
     * `ECS_SELINUX_CAPABLE=true` or `ECS_APPARMOR_CAPABLE=true` environment variables before
     * containers placed on that instance can use these security options. For more information, see
     * [Amazon ECS Container Agent Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * For more information about valid values, see
     * [Docker Run Security Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * Valid values: "no-new-privileges" | "apparmor:PROFILE" | "label:value" |
     * "credentialspec:CredentialSpecFilePath"
     */
    public fun dockerSecurityOptions(dockerSecurityOptions: Collection<String>) {
        _dockerSecurityOptions.addAll(dockerSecurityOptions)
    }

    /**
     * @param entryPoint Early versions of the Amazon ECS container agent don't properly handle
     *   `entryPoint` parameters. If you have problems using `entryPoint` , update your container
     *   agent or enter your commands and arguments as `command` array items instead.
     *
     * The entry point that's passed to the container. This parameter maps to `Entrypoint` in the
     * [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the
     * [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     * and the `--entrypoint` option to
     * [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * . For more information, see
     * [https://docs.docker.com/engine/reference/builder/#entrypoint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
     * .
     */
    public fun entryPoint(vararg entryPoint: String) {
        _entryPoint.addAll(listOf(*entryPoint))
    }

    /**
     * @param entryPoint Early versions of the Amazon ECS container agent don't properly handle
     *   `entryPoint` parameters. If you have problems using `entryPoint` , update your container
     *   agent or enter your commands and arguments as `command` array items instead.
     *
     * The entry point that's passed to the container. This parameter maps to `Entrypoint` in the
     * [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the
     * [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     * and the `--entrypoint` option to
     * [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * . For more information, see
     * [https://docs.docker.com/engine/reference/builder/#entrypoint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
     * .
     */
    public fun entryPoint(entryPoint: Collection<String>) {
        _entryPoint.addAll(entryPoint)
    }

    /**
     * @param environment The environment variables to pass to a container. This parameter maps to
     *   `Env` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--env` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * We don't recommend that you use plaintext environment variables for sensitive information,
     * such as credential data.
     */
    public fun environment(vararg environment: Any) {
        _environment.addAll(listOf(*environment))
    }

    /**
     * @param environment The environment variables to pass to a container. This parameter maps to
     *   `Env` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--env` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * We don't recommend that you use plaintext environment variables for sensitive information,
     * such as credential data.
     */
    public fun environment(environment: Collection<Any>) {
        _environment.addAll(environment)
    }

    /**
     * @param environment The environment variables to pass to a container. This parameter maps to
     *   `Env` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--env` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * We don't recommend that you use plaintext environment variables for sensitive information,
     * such as credential data.
     */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param environmentFiles A list of files containing the environment variables to pass to a
     *   container. This parameter maps to the `--env-file` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * You can specify up to ten environment files. The file must have a `.env` file extension. Each
     * line in an environment file contains an environment variable in `VARIABLE=VALUE` format.
     * Lines beginning with `#` are treated as comments and are ignored. For more information about
     * the environment variable file syntax, see
     * [Declare default environment variables in file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/)
     * .
     *
     * If there are environment variables specified using the `environment` parameter in a container
     * definition, they take precedence over the variables contained within an environment file. If
     * multiple environment files are specified that contain the same variable, they're processed
     * from the top down. We recommend that you use unique variable names. For more information, see
     * [Specifying Environment Variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun environmentFiles(vararg environmentFiles: Any) {
        _environmentFiles.addAll(listOf(*environmentFiles))
    }

    /**
     * @param environmentFiles A list of files containing the environment variables to pass to a
     *   container. This parameter maps to the `--env-file` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * You can specify up to ten environment files. The file must have a `.env` file extension. Each
     * line in an environment file contains an environment variable in `VARIABLE=VALUE` format.
     * Lines beginning with `#` are treated as comments and are ignored. For more information about
     * the environment variable file syntax, see
     * [Declare default environment variables in file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/)
     * .
     *
     * If there are environment variables specified using the `environment` parameter in a container
     * definition, they take precedence over the variables contained within an environment file. If
     * multiple environment files are specified that contain the same variable, they're processed
     * from the top down. We recommend that you use unique variable names. For more information, see
     * [Specifying Environment Variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun environmentFiles(environmentFiles: Collection<Any>) {
        _environmentFiles.addAll(environmentFiles)
    }

    /**
     * @param environmentFiles A list of files containing the environment variables to pass to a
     *   container. This parameter maps to the `--env-file` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * You can specify up to ten environment files. The file must have a `.env` file extension. Each
     * line in an environment file contains an environment variable in `VARIABLE=VALUE` format.
     * Lines beginning with `#` are treated as comments and are ignored. For more information about
     * the environment variable file syntax, see
     * [Declare default environment variables in file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/)
     * .
     *
     * If there are environment variables specified using the `environment` parameter in a container
     * definition, they take precedence over the variables contained within an environment file. If
     * multiple environment files are specified that contain the same variable, they're processed
     * from the top down. We recommend that you use unique variable names. For more information, see
     * [Specifying Environment Variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun environmentFiles(environmentFiles: IResolvable) {
        cdkBuilder.environmentFiles(environmentFiles)
    }

    /**
     * @param essential If the `essential` parameter of a container is marked as `true` , and that
     *   container fails or stops for any reason, all other containers that are part of the task are
     *   stopped. If the `essential` parameter of a container is marked as `false` , its failure
     *   doesn't affect the rest of the containers in a task. If this parameter is omitted, a
     *   container is assumed to be essential.
     *
     * All tasks must have at least one essential container. If you have an application that's
     * composed of multiple containers, group containers that are used for a common purpose into
     * components, and separate the different components into multiple task definitions. For more
     * information, see
     * [Application Architecture](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun essential(essential: Boolean) {
        cdkBuilder.essential(essential)
    }

    /**
     * @param essential If the `essential` parameter of a container is marked as `true` , and that
     *   container fails or stops for any reason, all other containers that are part of the task are
     *   stopped. If the `essential` parameter of a container is marked as `false` , its failure
     *   doesn't affect the rest of the containers in a task. If this parameter is omitted, a
     *   container is assumed to be essential.
     *
     * All tasks must have at least one essential container. If you have an application that's
     * composed of multiple containers, group containers that are used for a common purpose into
     * components, and separate the different components into multiple task definitions. For more
     * information, see
     * [Application Architecture](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun essential(essential: IResolvable) {
        cdkBuilder.essential(essential)
    }

    /**
     * @param extraHosts A list of hostnames and IP address mappings to append to the `/etc/hosts`
     *   file on the container. This parameter maps to `ExtraHosts` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--add-host` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter isn't supported for Windows containers or tasks that use the `awsvpc` network
     * mode.
     */
    public fun extraHosts(vararg extraHosts: Any) {
        _extraHosts.addAll(listOf(*extraHosts))
    }

    /**
     * @param extraHosts A list of hostnames and IP address mappings to append to the `/etc/hosts`
     *   file on the container. This parameter maps to `ExtraHosts` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--add-host` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter isn't supported for Windows containers or tasks that use the `awsvpc` network
     * mode.
     */
    public fun extraHosts(extraHosts: Collection<Any>) {
        _extraHosts.addAll(extraHosts)
    }

    /**
     * @param extraHosts A list of hostnames and IP address mappings to append to the `/etc/hosts`
     *   file on the container. This parameter maps to `ExtraHosts` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--add-host` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter isn't supported for Windows containers or tasks that use the `awsvpc` network
     * mode.
     */
    public fun extraHosts(extraHosts: IResolvable) {
        cdkBuilder.extraHosts(extraHosts)
    }

    /**
     * @param firelensConfiguration The FireLens configuration for the container. This is used to
     *   specify and configure a log router for container logs. For more information, see
     *   [Custom Log Routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html)
     *   in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun firelensConfiguration(firelensConfiguration: IResolvable) {
        cdkBuilder.firelensConfiguration(firelensConfiguration)
    }

    /**
     * @param firelensConfiguration The FireLens configuration for the container. This is used to
     *   specify and configure a log router for container logs. For more information, see
     *   [Custom Log Routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html)
     *   in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun firelensConfiguration(
        firelensConfiguration: CfnTaskDefinition.FirelensConfigurationProperty
    ) {
        cdkBuilder.firelensConfiguration(firelensConfiguration)
    }

    /**
     * @param healthCheck The container health check command and associated configuration parameters
     *   for the container. This parameter maps to `HealthCheck` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `HEALTHCHECK` parameter of
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     */
    public fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /**
     * @param healthCheck The container health check command and associated configuration parameters
     *   for the container. This parameter maps to `HealthCheck` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `HEALTHCHECK` parameter of
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     */
    public fun healthCheck(healthCheck: CfnTaskDefinition.HealthCheckProperty) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /**
     * @param hostname The hostname to use for your container. This parameter maps to `Hostname` in
     *   the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--hostname` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * The `hostname` parameter is not supported if you're using the `awsvpc` network mode.
     */
    public fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
    }

    /**
     * @param image The image used to start a container. This string is passed directly to the
     *   Docker daemon. By default, images in the Docker Hub registry are available. Other
     *   repositories are specified with either `*repository-url* / *image* : *tag*` or
     *   `*repository-url* / *image* &#64; *digest*` . Up to 255 letters (uppercase and lowercase),
     *   numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are
     *   allowed. This parameter maps to `Image` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `IMAGE` parameter of
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     * * When a new task starts, the Amazon ECS container agent pulls the latest version of the
     *   specified image and tag for the container to use. However, subsequent updates to a
     *   repository image aren't propagated to already running tasks.
     * * Images in Amazon ECR repositories can be specified by either using the full
     *   `registry/repository:tag` or `registry/repository&#64;digest` . For example,
     *   `012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest` or
     *   `012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;&#64;sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE`
     *   .
     * * Images in official repositories on Docker Hub use a single name (for example, `ubuntu` or
     *   `mongo` ).
     * * Images in other repositories on Docker Hub are qualified with an organization name (for
     *   example, `amazon/amazon-ecs-agent` ).
     * * Images in other online repositories are qualified further by a domain name (for example,
     *   `quay.io/assemblyline/ubuntu` ).
     */
    public fun image(image: String) {
        cdkBuilder.image(image)
    }

    /**
     * @param interactive When this parameter is `true` , you can deploy containerized applications
     *   that require `stdin` or a `tty` to be allocated. This parameter maps to `OpenStdin` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--interactive` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     */
    public fun interactive(interactive: Boolean) {
        cdkBuilder.interactive(interactive)
    }

    /**
     * @param interactive When this parameter is `true` , you can deploy containerized applications
     *   that require `stdin` or a `tty` to be allocated. This parameter maps to `OpenStdin` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--interactive` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     */
    public fun interactive(interactive: IResolvable) {
        cdkBuilder.interactive(interactive)
    }

    /**
     * @param links The `links` parameter allows containers to communicate with each other without
     *   the need for port mappings. This parameter is only supported if the network mode of a task
     *   definition is `bridge` . The `name:internalName` construct is analogous to `name:alias` in
     *   Docker links. Up to 255 letters (uppercase and lowercase), numbers, underscores, and
     *   hyphens are allowed. For more information about linking Docker containers, go to
     *   [Legacy container links](https://docs.aws.amazon.com/https://docs.docker.com/network/links/)
     *   in the Docker documentation. This parameter maps to `Links` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--link` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter is not supported for Windows containers. &gt; Containers that are collocated
     * on a single container instance may be able to communicate with each other without requiring
     * links or host port mappings. Network isolation is achieved on the container instance using
     * security groups and VPC settings.
     */
    public fun links(vararg links: String) {
        _links.addAll(listOf(*links))
    }

    /**
     * @param links The `links` parameter allows containers to communicate with each other without
     *   the need for port mappings. This parameter is only supported if the network mode of a task
     *   definition is `bridge` . The `name:internalName` construct is analogous to `name:alias` in
     *   Docker links. Up to 255 letters (uppercase and lowercase), numbers, underscores, and
     *   hyphens are allowed. For more information about linking Docker containers, go to
     *   [Legacy container links](https://docs.aws.amazon.com/https://docs.docker.com/network/links/)
     *   in the Docker documentation. This parameter maps to `Links` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--link` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter is not supported for Windows containers. &gt; Containers that are collocated
     * on a single container instance may be able to communicate with each other without requiring
     * links or host port mappings. Network isolation is achieved on the container instance using
     * security groups and VPC settings.
     */
    public fun links(links: Collection<String>) {
        _links.addAll(links)
    }

    /**
     * @param linuxParameters Linux-specific modifications that are applied to the container, such
     *   as Linux kernel capabilities. For more information see
     *   [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
     *   .
     *
     * This parameter is not supported for Windows containers.
     */
    public fun linuxParameters(linuxParameters: IResolvable) {
        cdkBuilder.linuxParameters(linuxParameters)
    }

    /**
     * @param linuxParameters Linux-specific modifications that are applied to the container, such
     *   as Linux kernel capabilities. For more information see
     *   [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
     *   .
     *
     * This parameter is not supported for Windows containers.
     */
    public fun linuxParameters(linuxParameters: CfnTaskDefinition.LinuxParametersProperty) {
        cdkBuilder.linuxParameters(linuxParameters)
    }

    /**
     * @param logConfiguration The log configuration specification for the container. This parameter
     *   maps to `LogConfig` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--log-driver` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *   By default, containers use the same logging driver that the Docker daemon uses. However,
     *   the container may use a different logging driver than the Docker daemon by specifying a log
     *   driver with this parameter in the container definition. To use a different logging driver
     *   for a container, the log system must be configured properly on the container instance (or
     *   on a different log server for remote logging options). For more information on the options
     *   for different supported log drivers, see
     *   [Configure logging drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
     *   in the Docker documentation.
     *
     * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon
     * (shown in the
     * [LogConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_LogConfiguration.html)
     * data type). Additional log drivers may be available in future releases of the Amazon ECS
     * container agent.
     *
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container instance, log in to your
     * container instance and run the following command: `sudo docker version --format
     * '{{.Server.APIVersion}}'`
     *
     * The Amazon ECS container agent running on a container instance must register the logging
     * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
     * variable before containers placed on that instance can use these log configuration options.
     * For more information, see
     * [Amazon ECS Container Agent Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /**
     * @param logConfiguration The log configuration specification for the container. This parameter
     *   maps to `LogConfig` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--log-driver` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *   By default, containers use the same logging driver that the Docker daemon uses. However,
     *   the container may use a different logging driver than the Docker daemon by specifying a log
     *   driver with this parameter in the container definition. To use a different logging driver
     *   for a container, the log system must be configured properly on the container instance (or
     *   on a different log server for remote logging options). For more information on the options
     *   for different supported log drivers, see
     *   [Configure logging drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
     *   in the Docker documentation.
     *
     * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon
     * (shown in the
     * [LogConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_LogConfiguration.html)
     * data type). Additional log drivers may be available in future releases of the Amazon ECS
     * container agent.
     *
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container instance, log in to your
     * container instance and run the following command: `sudo docker version --format
     * '{{.Server.APIVersion}}'`
     *
     * The Amazon ECS container agent running on a container instance must register the logging
     * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
     * variable before containers placed on that instance can use these log configuration options.
     * For more information, see
     * [Amazon ECS Container Agent Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun logConfiguration(logConfiguration: CfnTaskDefinition.LogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /**
     * @param memory The amount (in MiB) of memory to present to the container. If your container
     *   attempts to exceed the memory specified here, the container is killed. The total amount of
     *   memory reserved for all containers within a task must be lower than the task `memory`
     *   value, if one is specified. This parameter maps to `Memory` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--memory` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * If using the Fargate launch type, this parameter is optional.
     *
     * If using the EC2 launch type, you must specify either a task-level memory value or a
     * container-level memory value. If you specify both a container-level `memory` and
     * `memoryReservation` value, `memory` must be greater than `memoryReservation` . If you specify
     * `memoryReservation` , then that value is subtracted from the available memory resources for
     * the container instance where the container is placed. Otherwise, the value of `memory` is
     * used.
     *
     * The Docker 20.10.0 or later daemon reserves a minimum of 6 MiB of memory for a container, so
     * you should not specify fewer than 6 MiB of memory for your containers.
     *
     * The Docker 19.03.13-ce or earlier daemon reserves a minimum of 4 MiB of memory for a
     * container, so you should not specify fewer than 4 MiB of memory for your containers.
     */
    public fun memory(memory: Number) {
        cdkBuilder.memory(memory)
    }

    /**
     * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container. When
     *   system memory is under heavy contention, Docker attempts to keep the container memory to
     *   this soft limit. However, your container can consume more memory when it needs to, up to
     *   either the hard limit specified with the `memory` parameter (if applicable), or all of the
     *   available memory on the container instance, whichever comes first. This parameter maps to
     *   `MemoryReservation` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--memory-reservation` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * If a task-level memory value is not specified, you must specify a non-zero integer for one or
     * both of `memory` or `memoryReservation` in a container definition. If you specify both,
     * `memory` must be greater than `memoryReservation` . If you specify `memoryReservation` , then
     * that value is subtracted from the available memory resources for the container instance where
     * the container is placed. Otherwise, the value of `memory` is used.
     *
     * For example, if your container normally uses 128 MiB of memory, but occasionally bursts to
     * 256 MiB of memory for short periods of time, you can set a `memoryReservation` of 128 MiB,
     * and a `memory` hard limit of 300 MiB. This configuration would allow the container to only
     * reserve 128 MiB of memory from the remaining resources on the container instance, but also
     * allow the container to consume more memory resources when needed.
     *
     * The Docker 20.10.0 or later daemon reserves a minimum of 6 MiB of memory for a container. So,
     * don't specify less than 6 MiB of memory for your containers.
     *
     * The Docker 19.03.13-ce or earlier daemon reserves a minimum of 4 MiB of memory for a
     * container. So, don't specify less than 4 MiB of memory for your containers.
     */
    public fun memoryReservation(memoryReservation: Number) {
        cdkBuilder.memoryReservation(memoryReservation)
    }

    /**
     * @param mountPoints The mount points for data volumes in your container. This parameter maps
     *   to `Volumes` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--volume` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
     * Windows containers can't mount directories on a different drive, and mount point can't be
     * across drives.
     */
    public fun mountPoints(vararg mountPoints: Any) {
        _mountPoints.addAll(listOf(*mountPoints))
    }

    /**
     * @param mountPoints The mount points for data volumes in your container. This parameter maps
     *   to `Volumes` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--volume` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
     * Windows containers can't mount directories on a different drive, and mount point can't be
     * across drives.
     */
    public fun mountPoints(mountPoints: Collection<Any>) {
        _mountPoints.addAll(mountPoints)
    }

    /**
     * @param mountPoints The mount points for data volumes in your container. This parameter maps
     *   to `Volumes` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--volume` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
     * Windows containers can't mount directories on a different drive, and mount point can't be
     * across drives.
     */
    public fun mountPoints(mountPoints: IResolvable) {
        cdkBuilder.mountPoints(mountPoints)
    }

    /**
     * @param name The name of a container. If you're linking multiple containers together in a task
     *   definition, the `name` of one container can be entered in the `links` of another container
     *   to connect the containers. Up to 255 letters (uppercase and lowercase), numbers,
     *   underscores, and hyphens are allowed. This parameter maps to `name` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--name` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param portMappings The list of port mappings for the container. Port mappings allow
     *   containers to access ports on the host container instance to send or receive traffic.
     *
     * For task definitions that use the `awsvpc` network mode, you should only specify the
     * `containerPort` . The `hostPort` can be left blank or it must be the same value as the
     * `containerPort` .
     *
     * Port mappings on Windows use the `NetNAT` gateway address rather than `localhost` . There is
     * no loopback for port mappings on Windows, so you cannot access a container's mapped port from
     * the host itself.
     *
     * This parameter maps to `PortBindings` in the
     * [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the
     * [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     * and the `--publish` option to
     * [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . If
     * the network mode of a task definition is set to `none` , then you can't specify port
     * mappings. If the network mode of a task definition is set to `host` , then host ports must
     * either be undefined or they must match the container port in the port mapping.
     *
     * After a task reaches the `RUNNING` status, manual and automatic host and container port
     * assignments are visible in the *Network Bindings* section of a container description for a
     * selected task in the Amazon ECS console. The assignments are also visible in the
     * `networkBindings` section
     * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
     * responses.
     */
    public fun portMappings(vararg portMappings: Any) {
        _portMappings.addAll(listOf(*portMappings))
    }

    /**
     * @param portMappings The list of port mappings for the container. Port mappings allow
     *   containers to access ports on the host container instance to send or receive traffic.
     *
     * For task definitions that use the `awsvpc` network mode, you should only specify the
     * `containerPort` . The `hostPort` can be left blank or it must be the same value as the
     * `containerPort` .
     *
     * Port mappings on Windows use the `NetNAT` gateway address rather than `localhost` . There is
     * no loopback for port mappings on Windows, so you cannot access a container's mapped port from
     * the host itself.
     *
     * This parameter maps to `PortBindings` in the
     * [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the
     * [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     * and the `--publish` option to
     * [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . If
     * the network mode of a task definition is set to `none` , then you can't specify port
     * mappings. If the network mode of a task definition is set to `host` , then host ports must
     * either be undefined or they must match the container port in the port mapping.
     *
     * After a task reaches the `RUNNING` status, manual and automatic host and container port
     * assignments are visible in the *Network Bindings* section of a container description for a
     * selected task in the Amazon ECS console. The assignments are also visible in the
     * `networkBindings` section
     * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
     * responses.
     */
    public fun portMappings(portMappings: Collection<Any>) {
        _portMappings.addAll(portMappings)
    }

    /**
     * @param portMappings The list of port mappings for the container. Port mappings allow
     *   containers to access ports on the host container instance to send or receive traffic.
     *
     * For task definitions that use the `awsvpc` network mode, you should only specify the
     * `containerPort` . The `hostPort` can be left blank or it must be the same value as the
     * `containerPort` .
     *
     * Port mappings on Windows use the `NetNAT` gateway address rather than `localhost` . There is
     * no loopback for port mappings on Windows, so you cannot access a container's mapped port from
     * the host itself.
     *
     * This parameter maps to `PortBindings` in the
     * [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the
     * [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     * and the `--publish` option to
     * [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . If
     * the network mode of a task definition is set to `none` , then you can't specify port
     * mappings. If the network mode of a task definition is set to `host` , then host ports must
     * either be undefined or they must match the container port in the port mapping.
     *
     * After a task reaches the `RUNNING` status, manual and automatic host and container port
     * assignments are visible in the *Network Bindings* section of a container description for a
     * selected task in the Amazon ECS console. The assignments are also visible in the
     * `networkBindings` section
     * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
     * responses.
     */
    public fun portMappings(portMappings: IResolvable) {
        cdkBuilder.portMappings(portMappings)
    }

    /**
     * @param privileged When this parameter is true, the container is given elevated privileges on
     *   the host container instance (similar to the `root` user). This parameter maps to
     *   `Privileged` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--privileged` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate .
     */
    public fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
    }

    /**
     * @param privileged When this parameter is true, the container is given elevated privileges on
     *   the host container instance (similar to the `root` user). This parameter maps to
     *   `Privileged` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--privileged` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate .
     */
    public fun privileged(privileged: IResolvable) {
        cdkBuilder.privileged(privileged)
    }

    /**
     * @param pseudoTerminal When this parameter is `true` , a TTY is allocated. This parameter maps
     *   to `Tty` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--tty` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     */
    public fun pseudoTerminal(pseudoTerminal: Boolean) {
        cdkBuilder.pseudoTerminal(pseudoTerminal)
    }

    /**
     * @param pseudoTerminal When this parameter is `true` , a TTY is allocated. This parameter maps
     *   to `Tty` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--tty` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     */
    public fun pseudoTerminal(pseudoTerminal: IResolvable) {
        cdkBuilder.pseudoTerminal(pseudoTerminal)
    }

    /**
     * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
     *   access to its root file system. This parameter maps to `ReadonlyRootfs` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--read-only` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter is not supported for Windows containers.
     */
    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    /**
     * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
     *   access to its root file system. This parameter maps to `ReadonlyRootfs` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--read-only` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * This parameter is not supported for Windows containers.
     */
    public fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    /** @param repositoryCredentials The private repository authentication credentials to use. */
    public fun repositoryCredentials(repositoryCredentials: IResolvable) {
        cdkBuilder.repositoryCredentials(repositoryCredentials)
    }

    /** @param repositoryCredentials The private repository authentication credentials to use. */
    public fun repositoryCredentials(
        repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty
    ) {
        cdkBuilder.repositoryCredentials(repositoryCredentials)
    }

    /**
     * @param resourceRequirements The type and amount of a resource to assign to a container. The
     *   only supported resource is a GPU.
     */
    public fun resourceRequirements(vararg resourceRequirements: Any) {
        _resourceRequirements.addAll(listOf(*resourceRequirements))
    }

    /**
     * @param resourceRequirements The type and amount of a resource to assign to a container. The
     *   only supported resource is a GPU.
     */
    public fun resourceRequirements(resourceRequirements: Collection<Any>) {
        _resourceRequirements.addAll(resourceRequirements)
    }

    /**
     * @param resourceRequirements The type and amount of a resource to assign to a container. The
     *   only supported resource is a GPU.
     */
    public fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements)
    }

    /**
     * @param secrets The secrets to pass to the container. For more information, see
     *   [Specifying Sensitive Data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
     *   in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun secrets(vararg secrets: Any) {
        _secrets.addAll(listOf(*secrets))
    }

    /**
     * @param secrets The secrets to pass to the container. For more information, see
     *   [Specifying Sensitive Data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
     *   in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun secrets(secrets: Collection<Any>) {
        _secrets.addAll(secrets)
    }

    /**
     * @param secrets The secrets to pass to the container. For more information, see
     *   [Specifying Sensitive Data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
     *   in the *Amazon Elastic Container Service Developer Guide* .
     */
    public fun secrets(secrets: IResolvable) {
        cdkBuilder.secrets(secrets)
    }

    /**
     * @param startTimeout Time duration (in seconds) to wait before giving up on resolving
     *   dependencies for a container. For example, you specify two containers in a task definition
     *   with containerA having a dependency on containerB reaching a `COMPLETE` , `SUCCESS` , or
     *   `HEALTHY` status. If a `startTimeout` value is specified for containerB and it doesn't
     *   reach the desired status within that time then containerA gives up and not start. This
     *   results in the task transitioning to a `STOPPED` state.
     *
     * When the `ECS_CONTAINER_START_TIMEOUT` container agent configuration variable is used, it's
     * enforced independently from this start timeout value.
     *
     * For tasks using the Fargate launch type, the task or service requires the following
     * platforms:
     * * Linux platform version `1.3.0` or later.
     * * Windows platform version `1.0.0` or later.
     *
     * For tasks using the EC2 launch type, your container instances require at least version
     * `1.26.0` of the container agent to use a container start timeout value. However, we recommend
     * using the latest container agent version. For information about checking your agent version
     * and updating to the latest version, see
     * [Updating the Amazon ECS Container Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html)
     * in the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version `1.26.0-1` of the `ecs-init`
     * package. If your container instances are launched from version `20190301` or later, then they
     * contain the required versions of the container agent and `ecs-init` . For more information,
     * see
     * [Amazon ECS-optimized Linux AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * The valid values are 2-120 seconds.
     */
    public fun startTimeout(startTimeout: Number) {
        cdkBuilder.startTimeout(startTimeout)
    }

    /**
     * @param stopTimeout Time duration (in seconds) to wait before the container is forcefully
     *   killed if it doesn't exit normally on its own. For tasks using the Fargate launch type, the
     *   task or service requires the following platforms:
     * * Linux platform version `1.3.0` or later.
     * * Windows platform version `1.0.0` or later.
     *
     * The max stop timeout value is 120 seconds and if the parameter is not specified, the default
     * value of 30 seconds is used.
     *
     * For tasks that use the EC2 launch type, if the `stopTimeout` parameter isn't specified, the
     * value set for the Amazon ECS container agent configuration variable
     * `ECS_CONTAINER_STOP_TIMEOUT` is used. If neither the `stopTimeout` parameter or the
     * `ECS_CONTAINER_STOP_TIMEOUT` agent configuration variable are set, then the default values of
     * 30 seconds for Linux containers and 30 seconds on Windows containers are used. Your container
     * instances require at least version 1.26.0 of the container agent to use a container stop
     * timeout value. However, we recommend using the latest container agent version. For
     * information about checking your agent version and updating to the latest version, see
     * [Updating the Amazon ECS Container Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html)
     * in the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
     * package. If your container instances are launched from version `20190301` or later, then they
     * contain the required versions of the container agent and `ecs-init` . For more information,
     * see
     * [Amazon ECS-optimized Linux AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * The valid values are 2-120 seconds.
     */
    public fun stopTimeout(stopTimeout: Number) {
        cdkBuilder.stopTimeout(stopTimeout)
    }

    /**
     * @param systemControls A list of namespaced kernel parameters to set in the container. This
     *   parameter maps to `Sysctls` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--sysctl` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   . For example, you can configure `net.ipv4.tcp_keepalive_time` setting to maintain longer
     *   lived connections.
     *
     * We don't recommended that you specify network-related `systemControls` parameters for
     * multiple containers in a single task that also uses either the `awsvpc` or `host` network
     * modes. For tasks that use the `awsvpc` network mode, the container that's started last
     * determines which `systemControls` parameters take effect. For tasks that use the `host`
     * network mode, it changes the container instance's namespaced kernel parameters as well as the
     * containers. &gt; This parameter is not supported for Windows containers. &gt; This parameter
     * is only supported for tasks that are hosted on AWS Fargate if the tasks are using platform
     * version `1.4.0` or later (Linux). This isn't supported for Windows containers on Fargate.
     */
    public fun systemControls(vararg systemControls: Any) {
        _systemControls.addAll(listOf(*systemControls))
    }

    /**
     * @param systemControls A list of namespaced kernel parameters to set in the container. This
     *   parameter maps to `Sysctls` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--sysctl` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   . For example, you can configure `net.ipv4.tcp_keepalive_time` setting to maintain longer
     *   lived connections.
     *
     * We don't recommended that you specify network-related `systemControls` parameters for
     * multiple containers in a single task that also uses either the `awsvpc` or `host` network
     * modes. For tasks that use the `awsvpc` network mode, the container that's started last
     * determines which `systemControls` parameters take effect. For tasks that use the `host`
     * network mode, it changes the container instance's namespaced kernel parameters as well as the
     * containers. &gt; This parameter is not supported for Windows containers. &gt; This parameter
     * is only supported for tasks that are hosted on AWS Fargate if the tasks are using platform
     * version `1.4.0` or later (Linux). This isn't supported for Windows containers on Fargate.
     */
    public fun systemControls(systemControls: Collection<Any>) {
        _systemControls.addAll(systemControls)
    }

    /**
     * @param systemControls A list of namespaced kernel parameters to set in the container. This
     *   parameter maps to `Sysctls` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--sysctl` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   . For example, you can configure `net.ipv4.tcp_keepalive_time` setting to maintain longer
     *   lived connections.
     *
     * We don't recommended that you specify network-related `systemControls` parameters for
     * multiple containers in a single task that also uses either the `awsvpc` or `host` network
     * modes. For tasks that use the `awsvpc` network mode, the container that's started last
     * determines which `systemControls` parameters take effect. For tasks that use the `host`
     * network mode, it changes the container instance's namespaced kernel parameters as well as the
     * containers. &gt; This parameter is not supported for Windows containers. &gt; This parameter
     * is only supported for tasks that are hosted on AWS Fargate if the tasks are using platform
     * version `1.4.0` or later (Linux). This isn't supported for Windows containers on Fargate.
     */
    public fun systemControls(systemControls: IResolvable) {
        cdkBuilder.systemControls(systemControls)
    }

    /**
     * @param ulimits A list of `ulimits` to set in the container. This parameter maps to `Ulimits`
     *   in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--ulimit` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *   Valid naming values are displayed in the
     *   [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) data
     *   type. This parameter requires version 1.18 of the Docker Remote API or greater on your
     *   container instance. To check the Docker Remote API version on your container instance, log
     *   in to your container instance and run the following command: `sudo docker version --format
     *   '{{.Server.APIVersion}}'`
     *
     * This parameter is not supported for Windows containers.
     */
    public fun ulimits(vararg ulimits: Any) {
        _ulimits.addAll(listOf(*ulimits))
    }

    /**
     * @param ulimits A list of `ulimits` to set in the container. This parameter maps to `Ulimits`
     *   in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--ulimit` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *   Valid naming values are displayed in the
     *   [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) data
     *   type. This parameter requires version 1.18 of the Docker Remote API or greater on your
     *   container instance. To check the Docker Remote API version on your container instance, log
     *   in to your container instance and run the following command: `sudo docker version --format
     *   '{{.Server.APIVersion}}'`
     *
     * This parameter is not supported for Windows containers.
     */
    public fun ulimits(ulimits: Collection<Any>) {
        _ulimits.addAll(ulimits)
    }

    /**
     * @param ulimits A list of `ulimits` to set in the container. This parameter maps to `Ulimits`
     *   in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--ulimit` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *   Valid naming values are displayed in the
     *   [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) data
     *   type. This parameter requires version 1.18 of the Docker Remote API or greater on your
     *   container instance. To check the Docker Remote API version on your container instance, log
     *   in to your container instance and run the following command: `sudo docker version --format
     *   '{{.Server.APIVersion}}'`
     *
     * This parameter is not supported for Windows containers.
     */
    public fun ulimits(ulimits: IResolvable) {
        cdkBuilder.ulimits(ulimits)
    }

    /**
     * @param user The user to use inside the container. This parameter maps to `User` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--user` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     *
     * When running tasks using the `host` network mode, don't run containers using the root user
     * (UID 0). We recommend using a non-root user for better security.
     *
     * You can specify the `user` using the following formats. If specifying a UID or GID, you must
     * specify it as a positive integer.
     * * `user`
     * * `user:group`
     * * `uid`
     * * `uid:gid`
     * * `user:gid`
     * * `uid:group`
     *
     * This parameter is not supported for Windows containers.
     */
    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    /**
     * @param volumesFrom Data volumes to mount from another container. This parameter maps to
     *   `VolumesFrom` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--volumes-from` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     */
    public fun volumesFrom(vararg volumesFrom: Any) {
        _volumesFrom.addAll(listOf(*volumesFrom))
    }

    /**
     * @param volumesFrom Data volumes to mount from another container. This parameter maps to
     *   `VolumesFrom` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--volumes-from` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     */
    public fun volumesFrom(volumesFrom: Collection<Any>) {
        _volumesFrom.addAll(volumesFrom)
    }

    /**
     * @param volumesFrom Data volumes to mount from another container. This parameter maps to
     *   `VolumesFrom` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--volumes-from` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     */
    public fun volumesFrom(volumesFrom: IResolvable) {
        cdkBuilder.volumesFrom(volumesFrom)
    }

    /**
     * @param workingDirectory The working directory to run commands inside the container in. This
     *   parameter maps to `WorkingDir` in the
     *   [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     *   section of the
     *   [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     *   and the `--workdir` option to
     *   [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     *   .
     */
    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): CfnTaskDefinition.ContainerDefinitionProperty {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_dependsOn.isNotEmpty()) cdkBuilder.dependsOn(_dependsOn)
        if (_dnsSearchDomains.isNotEmpty()) cdkBuilder.dnsSearchDomains(_dnsSearchDomains)
        if (_dnsServers.isNotEmpty()) cdkBuilder.dnsServers(_dnsServers)
        if (_dockerSecurityOptions.isNotEmpty())
            cdkBuilder.dockerSecurityOptions(_dockerSecurityOptions)
        if (_entryPoint.isNotEmpty()) cdkBuilder.entryPoint(_entryPoint)
        if (_environment.isNotEmpty()) cdkBuilder.environment(_environment)
        if (_environmentFiles.isNotEmpty()) cdkBuilder.environmentFiles(_environmentFiles)
        if (_extraHosts.isNotEmpty()) cdkBuilder.extraHosts(_extraHosts)
        if (_links.isNotEmpty()) cdkBuilder.links(_links)
        if (_mountPoints.isNotEmpty()) cdkBuilder.mountPoints(_mountPoints)
        if (_portMappings.isNotEmpty()) cdkBuilder.portMappings(_portMappings)
        if (_resourceRequirements.isNotEmpty())
            cdkBuilder.resourceRequirements(_resourceRequirements)
        if (_secrets.isNotEmpty()) cdkBuilder.secrets(_secrets)
        if (_systemControls.isNotEmpty()) cdkBuilder.systemControls(_systemControls)
        if (_ulimits.isNotEmpty()) cdkBuilder.ulimits(_ulimits)
        if (_volumesFrom.isNotEmpty()) cdkBuilder.volumesFrom(_volumesFrom)
        return cdkBuilder.build()
    }
}
