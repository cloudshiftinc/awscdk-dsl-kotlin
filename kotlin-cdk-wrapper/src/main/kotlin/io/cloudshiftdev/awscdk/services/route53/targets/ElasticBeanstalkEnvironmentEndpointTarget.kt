@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.route53.AliasRecordTargetConfig
import io.cloudshiftdev.awscdk.services.route53.IAliasRecordTarget
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import io.cloudshiftdev.awscdk.services.route53.IRecordSet
import kotlin.String

/**
 * Use an Elastic Beanstalk environment URL as an alias record target. E.g.
 * mysampleenvironment.xyz.us-east-1.elasticbeanstalk.com or
 * mycustomcnameprefix.us-east-1.elasticbeanstalk.com.
 *
 * Only supports Elastic Beanstalk environments created after 2016 that have a regional endpoint.
 *
 * Example:
 *
 * ```
 * HostedZone zone;
 * String ebsEnvironmentUrl;
 * ARecord.Builder.create(this, "AliasRecord")
 * .zone(zone)
 * .target(RecordTarget.fromAlias(new ElasticBeanstalkEnvironmentEndpointTarget(ebsEnvironmentUrl)))
 * .build();
 * ```
 */
public open class ElasticBeanstalkEnvironmentEndpointTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53.targets.ElasticBeanstalkEnvironmentEndpointTarget,
) : CdkObject(cdkObject), IAliasRecordTarget {
  public constructor(environmentEndpoint: String) :
      this(software.amazon.awscdk.services.route53.targets.ElasticBeanstalkEnvironmentEndpointTarget(environmentEndpoint))

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
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.ElasticBeanstalkEnvironmentEndpointTarget):
        ElasticBeanstalkEnvironmentEndpointTarget =
        ElasticBeanstalkEnvironmentEndpointTarget(cdkObject)

    internal fun unwrap(wrapped: ElasticBeanstalkEnvironmentEndpointTarget):
        software.amazon.awscdk.services.route53.targets.ElasticBeanstalkEnvironmentEndpointTarget =
        wrapped.cdkObject
  }
}
