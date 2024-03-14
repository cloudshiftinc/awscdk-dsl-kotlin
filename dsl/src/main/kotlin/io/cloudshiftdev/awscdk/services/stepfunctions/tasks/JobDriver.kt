package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface JobDriver {
  public fun sparkSubmitJobDriver(): SparkSubmitJobDriver

  public interface Builder {
    public fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriver)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd65666a6cd5e8d0877bea883bee5e98c04d753bb31b5c14947f8ae7155c0061")
    public fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriver.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.JobDriver.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.JobDriver.builder()

    override fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriver) {
      cdkBuilder.sparkSubmitJobDriver(sparkSubmitJobDriver.let(SparkSubmitJobDriver::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd65666a6cd5e8d0877bea883bee5e98c04d753bb31b5c14947f8ae7155c0061")
    override
        fun sparkSubmitJobDriver(sparkSubmitJobDriver: SparkSubmitJobDriver.Builder.() -> Unit):
        Unit = sparkSubmitJobDriver(SparkSubmitJobDriver(sparkSubmitJobDriver))

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.JobDriver =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.JobDriver,
  ) : JobDriver {
    override fun sparkSubmitJobDriver(): SparkSubmitJobDriver =
        unwrap(this).getSparkSubmitJobDriver().let(SparkSubmitJobDriver::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): JobDriver {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.JobDriver):
        JobDriver = Wrapper(cdkObject)

    internal fun unwrap(wrapped: JobDriver):
        software.amazon.awscdk.services.stepfunctions.tasks.JobDriver = (wrapped as
        Wrapper).cdkObject
  }
}
