package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet

public open class Route53RecordTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53.targets.Route53RecordTarget,
) : CdkObject(cdkObject), IAliasRecordTarget {
  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param zone
   */
  public override fun bind(_record: IRecordSet): AliasRecordTargetConfig =
      unwrap(this).bind(_record.let(IRecordSet::unwrap)).let(AliasRecordTargetConfig::wrap)

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param zone
   */
  public override fun bind(_record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig =
      unwrap(this).bind(_record.let(IRecordSet::unwrap),
      zone.let(IHostedZone::unwrap)).let(AliasRecordTargetConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.Route53RecordTarget):
        Route53RecordTarget = Route53RecordTarget(cdkObject)

    internal fun unwrap(wrapped: Route53RecordTarget):
        software.amazon.awscdk.services.route53.targets.Route53RecordTarget = wrapped.cdkObject
  }
}
