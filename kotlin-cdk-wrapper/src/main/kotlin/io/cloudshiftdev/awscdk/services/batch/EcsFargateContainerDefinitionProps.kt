@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.CpuArchitecture
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.OperatingSystemFamily
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface EcsFargateContainerDefinitionProps : EcsContainerDefinitionProps {
  public fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

  public fun ephemeralStorageSize(): Size? = unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

  public fun fargateCpuArchitecture(): CpuArchitecture? =
      unwrap(this).getFargateCpuArchitecture()?.let(CpuArchitecture::wrap)

  public fun fargateOperatingSystemFamily(): OperatingSystemFamily? =
      unwrap(this).getFargateOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)

  public fun fargatePlatformVersion(): FargatePlatformVersion? =
      unwrap(this).getFargatePlatformVersion()?.let(FargatePlatformVersion::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun assignPublicIp(assignPublicIp: Boolean)

    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun cpu(cpu: Number)

    public fun environment(environment: Map<String, String>)

    public fun ephemeralStorageSize(ephemeralStorageSize: Size)

    public fun executionRole(executionRole: IRole)

    public fun fargateCpuArchitecture(fargateCpuArchitecture: CpuArchitecture)

    public fun fargateOperatingSystemFamily(fargateOperatingSystemFamily: OperatingSystemFamily)

    public fun fargatePlatformVersion(fargatePlatformVersion: FargatePlatformVersion)

    public fun image(image: ContainerImage)

    public fun jobRole(jobRole: IRole)

    public fun linuxParameters(linuxParameters: LinuxParameters)

    public fun logging(logging: LogDriver)

    public fun memory(memory: Size)

    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

    public fun secrets(secrets: Map<String, Secret>)

    public fun user(user: String)

    public fun volumes(volumes: List<EcsVolume>)

    public fun volumes(vararg volumes: EcsVolume)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps.builder()

    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun command(vararg command: String): Unit = command(command.toList())

    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    override fun ephemeralStorageSize(ephemeralStorageSize: Size) {
      cdkBuilder.ephemeralStorageSize(ephemeralStorageSize.let(Size::unwrap))
    }

    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    override fun fargateCpuArchitecture(fargateCpuArchitecture: CpuArchitecture) {
      cdkBuilder.fargateCpuArchitecture(fargateCpuArchitecture.let(CpuArchitecture::unwrap))
    }

    override fun fargateOperatingSystemFamily(fargateOperatingSystemFamily: OperatingSystemFamily) {
      cdkBuilder.fargateOperatingSystemFamily(fargateOperatingSystemFamily.let(OperatingSystemFamily::unwrap))
    }

    override fun fargatePlatformVersion(fargatePlatformVersion: FargatePlatformVersion) {
      cdkBuilder.fargatePlatformVersion(fargatePlatformVersion.let(FargatePlatformVersion::unwrap))
    }

    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    override fun jobRole(jobRole: IRole) {
      cdkBuilder.jobRole(jobRole.let(IRole::unwrap))
    }

    override fun linuxParameters(linuxParameters: LinuxParameters) {
      cdkBuilder.linuxParameters(linuxParameters.let(LinuxParameters::unwrap))
    }

    override fun logging(logging: LogDriver) {
      cdkBuilder.logging(logging.let(LogDriver::unwrap))
    }

    override fun memory(memory: Size) {
      cdkBuilder.memory(memory.let(Size::unwrap))
    }

    override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    override fun volumes(volumes: List<EcsVolume>) {
      cdkBuilder.volumes(volumes.map(EcsVolume::unwrap))
    }

    override fun volumes(vararg volumes: EcsVolume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps,
  ) : CdkObject(cdkObject), EcsFargateContainerDefinitionProps {
    override fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun cpu(): Number = unwrap(this).getCpu()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun ephemeralStorageSize(): Size? =
        unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    override fun fargateCpuArchitecture(): CpuArchitecture? =
        unwrap(this).getFargateCpuArchitecture()?.let(CpuArchitecture::wrap)

    override fun fargateOperatingSystemFamily(): OperatingSystemFamily? =
        unwrap(this).getFargateOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)

    override fun fargatePlatformVersion(): FargatePlatformVersion? =
        unwrap(this).getFargatePlatformVersion()?.let(FargatePlatformVersion::wrap)

    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    override fun jobRole(): IRole? = unwrap(this).getJobRole()?.let(IRole::wrap)

    override fun linuxParameters(): LinuxParameters? =
        unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

    override fun logging(): LogDriver? = unwrap(this).getLogging()?.let(LogDriver::wrap)

    override fun memory(): Size = unwrap(this).getMemory().let(Size::wrap)

    override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

    override fun secrets(): Map<String, Secret> =
        unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

    override fun user(): String? = unwrap(this).getUser()

    override fun volumes(): List<EcsVolume> = unwrap(this).getVolumes()?.map(EcsVolume::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsFargateContainerDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps):
        EcsFargateContainerDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsFargateContainerDefinitionProps):
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps
  }
}
