package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class PrivateHostedZone internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.PrivateHostedZone,
) : HostedZone(cdkObject), IPrivateHostedZone {
  public interface Builder {
    public fun addTrailingDot(addTrailingDot: Boolean) {
    }

    public fun comment(comment: String) {
    }

    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun zoneName(zoneName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.PrivateHostedZone.Builder =
        software.amazon.awscdk.services.route53.PrivateHostedZone.Builder.create(scope, id)

    public override fun addTrailingDot(addTrailingDot: Boolean) {
      cdkBuilder.addTrailingDot(addTrailingDot)
    }

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
      cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.PrivateHostedZone =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromPrivateHostedZoneId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      privateHostedZoneId: String,
    ): IPrivateHostedZone =
        software.amazon.awscdk.services.route53.PrivateHostedZone.fromPrivateHostedZoneId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, privateHostedZoneId).let(IPrivateHostedZone::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PrivateHostedZone {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PrivateHostedZone(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.PrivateHostedZone):
        PrivateHostedZone = PrivateHostedZone(cdkObject)

    internal fun unwrap(wrapped: PrivateHostedZone):
        software.amazon.awscdk.services.route53.PrivateHostedZone = wrapped.cdkObject
  }
}
