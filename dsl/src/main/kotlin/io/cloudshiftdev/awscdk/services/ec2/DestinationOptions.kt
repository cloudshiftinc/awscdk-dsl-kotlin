package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.Unit

public interface DestinationOptions : S3DestinationOptions {
  public interface Builder {
    public fun fileFormat(fileFormat: FlowLogFileFormat)

    public fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean)

    public fun perHourPartition(perHourPartition: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.DestinationOptions.Builder =
        software.amazon.awscdk.services.ec2.DestinationOptions.builder()

    override fun fileFormat(fileFormat: FlowLogFileFormat) {
      cdkBuilder.fileFormat(fileFormat.let(FlowLogFileFormat::unwrap))
    }

    override fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean) {
      cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions)
    }

    override fun perHourPartition(perHourPartition: Boolean) {
      cdkBuilder.perHourPartition(perHourPartition)
    }

    public fun build(): software.amazon.awscdk.services.ec2.DestinationOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.DestinationOptions,
  ) : DestinationOptions {
    override fun fileFormat(): FlowLogFileFormat? =
        unwrap(this).getFileFormat()?.let(FlowLogFileFormat::wrap)

    override fun hiveCompatiblePartitions(): Boolean? = unwrap(this).getHiveCompatiblePartitions()

    override fun perHourPartition(): Boolean? = unwrap(this).getPerHourPartition()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DestinationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.DestinationOptions):
        DestinationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DestinationOptions):
        software.amazon.awscdk.services.ec2.DestinationOptions = (wrapped as Wrapper).cdkObject
  }
}