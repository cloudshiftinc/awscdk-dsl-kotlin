@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LogRetention internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.LogRetention,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun logGroupArn(): String = unwrap(this).getLogGroupArn()

  @CdkDslMarker
  public interface Builder {
    public fun logGroupName(logGroupName: String)

    public fun logGroupRegion(logGroupRegion: String)

    public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efcdd4942bd022962255054dc2ff87e9319e87002c3990d10f0cac097f804d6b")
    public
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun retention(retention: RetentionDays)

    public fun role(role: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.LogRetention.Builder =
        software.amazon.awscdk.services.logs.LogRetention.Builder.create(scope, id)

    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    override fun logGroupRegion(logGroupRegion: String) {
      cdkBuilder.logGroupRegion(logGroupRegion)
    }

    override fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
      cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions.let(LogRetentionRetryOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efcdd4942bd022962255054dc2ff87e9319e87002c3990d10f0cac097f804d6b")
    override
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit):
        Unit = logRetentionRetryOptions(LogRetentionRetryOptions(logRetentionRetryOptions))

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun retention(retention: RetentionDays) {
      cdkBuilder.retention(retention.let(RetentionDays::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogRetention = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LogRetention {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LogRetention(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.LogRetention): LogRetention =
        LogRetention(cdkObject)

    internal fun unwrap(wrapped: LogRetention): software.amazon.awscdk.services.logs.LogRetention =
        wrapped.cdkObject
  }
}