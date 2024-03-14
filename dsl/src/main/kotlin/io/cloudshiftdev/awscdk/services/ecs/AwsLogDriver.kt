package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit

public open class AwsLogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.AwsLogDriver,
) : LogDriver(cdkObject) {
  /**
   * Called when the log driver is configured on a container.
   *
   * @param scope 
   * @param containerDefinition 
   */
  public override fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      containerDefinition.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

  /**
   * The log group to send log streams to.
   *
   * Only available after the LogDriver has been bound to a ContainerDefinition.
   */
  public open fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  /**
   * The log group to send log streams to.
   *
   * Only available after the LogDriver has been bound to a ContainerDefinition.
   */
  public open fun logGroup(`value`: ILogGroup) {
    unwrap(this).setLogGroup(`value`.let(ILogGroup::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.AwsLogDriver].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * This option defines a multiline start pattern in Python strftime format.
     *
     * A log message consists of a line that matches the pattern and any
     * following lines that don’t match the pattern. Thus the matched line is
     * the delimiter between log messages.
     *
     * Default: - No multiline matching.
     *
     * @param datetimeFormat This option defines a multiline start pattern in Python strftime
     * format. 
     */
    public fun datetimeFormat(datetimeFormat: String)

    /**
     * The log group to log to.
     *
     * Default: - A log group is automatically created.
     *
     * @param logGroup The log group to log to. 
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * The number of days log events are kept in CloudWatch Logs when the log group is automatically
     * created by this construct.
     *
     * Default: - Logs never expire.
     *
     * @param logRetention The number of days log events are kept in CloudWatch Logs when the log
     * group is automatically created by this construct. 
     */
    public fun logRetention(logRetention: RetentionDays)

    /**
     * When AwsLogDriverMode.NON_BLOCKING is configured, this parameter controls the size of the
     * non-blocking buffer used to temporarily store messages. This parameter is not valid with
     * AwsLogDriverMode.BLOCKING.
     *
     * Default: - 1 megabyte if driver mode is non-blocking, otherwise this property is not set
     *
     * @param maxBufferSize When AwsLogDriverMode.NON_BLOCKING is configured, this parameter
     * controls the size of the non-blocking buffer used to temporarily store messages. This parameter
     * is not valid with AwsLogDriverMode.BLOCKING. 
     */
    public fun maxBufferSize(maxBufferSize: Size)

    /**
     * The delivery mode of log messages from the container to awslogs.
     *
     * Default: - AwsLogDriverMode.BLOCKING
     *
     * @param mode The delivery mode of log messages from the container to awslogs. 
     */
    public fun mode(mode: AwsLogDriverMode)

    /**
     * This option defines a multiline start pattern using a regular expression.
     *
     * A log message consists of a line that matches the pattern and any
     * following lines that don’t match the pattern. Thus the matched line is
     * the delimiter between log messages.
     *
     * This option is ignored if datetimeFormat is also configured.
     *
     * Default: - No multiline matching.
     *
     * @param multilinePattern This option defines a multiline start pattern using a regular
     * expression. 
     */
    public fun multilinePattern(multilinePattern: String)

    /**
     * Prefix for the log streams.
     *
     * The awslogs-stream-prefix option allows you to associate a log stream
     * with the specified prefix, the container name, and the ID of the Amazon
     * ECS task to which the container belongs. If you specify a prefix with
     * this option, then the log stream takes the following format:
     *
     * ```
     * prefix-name/container-name/ecs-task-id
     * ```
     *
     * @param streamPrefix Prefix for the log streams. 
     */
    public fun streamPrefix(streamPrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AwsLogDriver.Builder =
        software.amazon.awscdk.services.ecs.AwsLogDriver.Builder.create()

    /**
     * This option defines a multiline start pattern in Python strftime format.
     *
     * A log message consists of a line that matches the pattern and any
     * following lines that don’t match the pattern. Thus the matched line is
     * the delimiter between log messages.
     *
     * Default: - No multiline matching.
     *
     * @param datetimeFormat This option defines a multiline start pattern in Python strftime
     * format. 
     */
    override fun datetimeFormat(datetimeFormat: String) {
      cdkBuilder.datetimeFormat(datetimeFormat)
    }

    /**
     * The log group to log to.
     *
     * Default: - A log group is automatically created.
     *
     * @param logGroup The log group to log to. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * The number of days log events are kept in CloudWatch Logs when the log group is automatically
     * created by this construct.
     *
     * Default: - Logs never expire.
     *
     * @param logRetention The number of days log events are kept in CloudWatch Logs when the log
     * group is automatically created by this construct. 
     */
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    /**
     * When AwsLogDriverMode.NON_BLOCKING is configured, this parameter controls the size of the
     * non-blocking buffer used to temporarily store messages. This parameter is not valid with
     * AwsLogDriverMode.BLOCKING.
     *
     * Default: - 1 megabyte if driver mode is non-blocking, otherwise this property is not set
     *
     * @param maxBufferSize When AwsLogDriverMode.NON_BLOCKING is configured, this parameter
     * controls the size of the non-blocking buffer used to temporarily store messages. This parameter
     * is not valid with AwsLogDriverMode.BLOCKING. 
     */
    override fun maxBufferSize(maxBufferSize: Size) {
      cdkBuilder.maxBufferSize(maxBufferSize.let(Size::unwrap))
    }

    /**
     * The delivery mode of log messages from the container to awslogs.
     *
     * Default: - AwsLogDriverMode.BLOCKING
     *
     * @param mode The delivery mode of log messages from the container to awslogs. 
     */
    override fun mode(mode: AwsLogDriverMode) {
      cdkBuilder.mode(mode.let(AwsLogDriverMode::unwrap))
    }

    /**
     * This option defines a multiline start pattern using a regular expression.
     *
     * A log message consists of a line that matches the pattern and any
     * following lines that don’t match the pattern. Thus the matched line is
     * the delimiter between log messages.
     *
     * This option is ignored if datetimeFormat is also configured.
     *
     * Default: - No multiline matching.
     *
     * @param multilinePattern This option defines a multiline start pattern using a regular
     * expression. 
     */
    override fun multilinePattern(multilinePattern: String) {
      cdkBuilder.multilinePattern(multilinePattern)
    }

    /**
     * Prefix for the log streams.
     *
     * The awslogs-stream-prefix option allows you to associate a log stream
     * with the specified prefix, the container name, and the ID of the Amazon
     * ECS task to which the container belongs. If you specify a prefix with
     * this option, then the log stream takes the following format:
     *
     * ```
     * prefix-name/container-name/ecs-task-id
     * ```
     *
     * @param streamPrefix Prefix for the log streams. 
     */
    override fun streamPrefix(streamPrefix: String) {
      cdkBuilder.streamPrefix(streamPrefix)
    }

    public fun build(): software.amazon.awscdk.services.ecs.AwsLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsLogDriver {
      val builderImpl = BuilderImpl()
      return AwsLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AwsLogDriver): AwsLogDriver =
        AwsLogDriver(cdkObject)

    internal fun unwrap(wrapped: AwsLogDriver): software.amazon.awscdk.services.ecs.AwsLogDriver =
        wrapped.cdkObject
  }
}
