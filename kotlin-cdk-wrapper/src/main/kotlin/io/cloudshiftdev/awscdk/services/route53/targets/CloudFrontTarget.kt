@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudfront.IDistribution
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

/**
 * Use a CloudFront Distribution as an alias record target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * HostedZone myZone;
 * CloudFrontWebDistribution distribution;
 * AaaaRecord.Builder.create(this, "Alias")
 * .zone(myZone)
 * .target(RecordTarget.fromAlias(new CloudFrontTarget(distribution)))
 * .build();
 * ```
 */
public open class CloudFrontTarget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.targets.CloudFrontTarget,
) : CdkObject(cdkObject), IAliasRecordTarget {
  public constructor(distribution: IDistribution) :
      this(software.amazon.awscdk.services.route53.targets.CloudFrontTarget(IDistribution.unwrap(distribution)))

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(_record: IRecordSet): AliasRecordTargetConfig =
      unwrap(this).bind(_record.let(IRecordSet::unwrap)).let(AliasRecordTargetConfig::wrap)

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param _record 
   * @param _zone
   */
  public override fun bind(_record: IRecordSet, _zone: IHostedZone): AliasRecordTargetConfig =
      unwrap(this).bind(_record.let(IRecordSet::unwrap),
      _zone.let(IHostedZone::unwrap)).let(AliasRecordTargetConfig::wrap)

  public companion object {
    public val CLOUDFRONT_ZONE_ID: String =
        software.amazon.awscdk.services.route53.targets.CloudFrontTarget.CLOUDFRONT_ZONE_ID

    public fun hostedZoneId(scope: IConstruct): String =
        software.amazon.awscdk.services.route53.targets.CloudFrontTarget.getHostedZoneId(scope.let(IConstruct::unwrap))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.CloudFrontTarget):
        CloudFrontTarget = CloudFrontTarget(cdkObject)

    internal fun unwrap(wrapped: CloudFrontTarget):
        software.amazon.awscdk.services.route53.targets.CloudFrontTarget = wrapped.cdkObject
  }
}
