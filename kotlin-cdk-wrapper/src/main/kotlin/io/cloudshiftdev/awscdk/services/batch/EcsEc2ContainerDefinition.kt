@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.LogDriverConfig
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EcsEc2ContainerDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition,
) : CloudshiftdevConstructsConstruct(cdkObject), IEcsEc2ContainerDefinition, IEcsContainerDefinition
    {
  public override fun addUlimit(ulimit: Ulimit) {
    unwrap(this).addUlimit(ulimit.let(Ulimit::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a0d25fa71c4ef0333f45890e42d61da3c880f3fe8da2e4cc0ad769dfba1854d9")
  public override fun addUlimit(ulimit: Ulimit.Builder.() -> Unit): Unit = addUlimit(Ulimit(ulimit))

  public override fun addVolume(volume: EcsVolume) {
    unwrap(this).addVolume(volume.let(EcsVolume::unwrap))
  }

  public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public override fun cpu(): Number = unwrap(this).getCpu()

  public override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?:
      emptyMap()

  public override fun executionRole(): IRole = unwrap(this).getExecutionRole().let(IRole::wrap)

  public override fun gpu(): Number? = unwrap(this).getGpu()

  public override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

  public override fun jobRole(): IRole? = unwrap(this).getJobRole()?.let(IRole::wrap)

  public override fun linuxParameters(): LinuxParameters? =
      unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

  public override fun logDriverConfig(): LogDriverConfig? =
      unwrap(this).getLogDriverConfig()?.let(LogDriverConfig::wrap)

  public override fun memory(): Size = unwrap(this).getMemory().let(Size::wrap)

  public override fun privileged(): Boolean? = unwrap(this).getPrivileged()

  public override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

  public override fun secrets(): Map<String, Secret> =
      unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  public override fun ulimits(): List<Ulimit> = unwrap(this).getUlimits().map(Ulimit::wrap)

  public override fun user(): String? = unwrap(this).getUser()

  public override fun volumes(): List<EcsVolume> = unwrap(this).getVolumes().map(EcsVolume::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun cpu(cpu: Number)

    public fun environment(environment: Map<String, String>)

    public fun executionRole(executionRole: IRole)

    public fun gpu(gpu: Number)

    public fun image(image: ContainerImage)

    public fun jobRole(jobRole: IRole)

    public fun linuxParameters(linuxParameters: LinuxParameters)

    public fun logging(logging: LogDriver)

    public fun memory(memory: Size)

    public fun privileged(privileged: Boolean)

    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

    public fun secrets(secrets: Map<String, Secret>)

    public fun ulimits(ulimits: List<Ulimit>)

    public fun ulimits(vararg ulimits: Ulimit)

    public fun user(user: String)

    public fun volumes(volumes: List<EcsVolume>)

    public fun volumes(vararg volumes: EcsVolume)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition.Builder
        = software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition.Builder.create(scope, id)

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

    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    override fun gpu(gpu: Number) {
      cdkBuilder.gpu(gpu)
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

    override fun privileged(privileged: Boolean) {
      cdkBuilder.privileged(privileged)
    }

    override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    override fun ulimits(ulimits: List<Ulimit>) {
      cdkBuilder.ulimits(ulimits.map(Ulimit::unwrap))
    }

    override fun ulimits(vararg ulimits: Ulimit): Unit = ulimits(ulimits.toList())

    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    override fun volumes(volumes: List<EcsVolume>) {
      cdkBuilder.volumes(volumes.map(EcsVolume::unwrap))
    }

    override fun volumes(vararg volumes: EcsVolume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EcsEc2ContainerDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EcsEc2ContainerDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition):
        EcsEc2ContainerDefinition = EcsEc2ContainerDefinition(cdkObject)

    internal fun unwrap(wrapped: EcsEc2ContainerDefinition):
        software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition = wrapped.cdkObject
  }
}