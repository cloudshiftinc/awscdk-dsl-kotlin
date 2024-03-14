package io.cloudshiftdev.awscdk.services.events.targets

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ContainerOverride {
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public fun containerName(): String

  public fun cpu(): Number? = unwrap(this).getCpu()

  public fun environment(): List<TaskEnvironmentVariable> =
      unwrap(this).getEnvironment()?.map(TaskEnvironmentVariable::wrap) ?: emptyList()

  public fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

  public fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

  public interface Builder {
    public fun command(command: List<String>)

    public fun containerName(containerName: String)

    public fun cpu(cpu: Number)

    public fun environment(environment: List<TaskEnvironmentVariable>)

    public fun memoryLimit(memoryLimit: Number)

    public fun memoryReservation(memoryReservation: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.ContainerOverride.Builder
        = software.amazon.awscdk.services.events.targets.ContainerOverride.builder()

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    override fun environment(environment: List<TaskEnvironmentVariable>) {
      cdkBuilder.environment(environment.map(TaskEnvironmentVariable::unwrap))
    }

    override fun memoryLimit(memoryLimit: Number) {
      cdkBuilder.memoryLimit(memoryLimit)
    }

    override fun memoryReservation(memoryReservation: Number) {
      cdkBuilder.memoryReservation(memoryReservation)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.ContainerOverride =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.targets.ContainerOverride,
  ) : ContainerOverride {
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun containerName(): String = unwrap(this).getContainerName()

    override fun cpu(): Number? = unwrap(this).getCpu()

    override fun environment(): List<TaskEnvironmentVariable> =
        unwrap(this).getEnvironment()?.map(TaskEnvironmentVariable::wrap) ?: emptyList()

    override fun memoryLimit(): Number? = unwrap(this).getMemoryLimit()

    override fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerOverride {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.ContainerOverride):
        ContainerOverride = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerOverride):
        software.amazon.awscdk.services.events.targets.ContainerOverride = (wrapped as
        Wrapper).cdkObject
  }
}
