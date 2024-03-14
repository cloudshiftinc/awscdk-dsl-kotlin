package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class RecordSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.RecordSet,
) : Resource(cdkObject), IRecordSet {
  public override fun domainName(): String = unwrap(this).getDomainName()

  public interface Builder {
    public fun comment(comment: String) {
    }

    public fun deleteExisting(deleteExisting: Boolean) {
    }

    public fun geoLocation(geoLocation: GeoLocation) {
    }

    public fun identifier(setIdentifier: String) {
    }

    public fun multiValueAnswer(multiValueAnswer: Boolean) {
    }

    public fun recordName(recordName: String) {
    }

    public fun recordType(recordType: RecordType) {
    }

    public fun region(region: String) {
    }

    public fun target(target: RecordTarget) {
    }

    public fun ttl(ttl: Duration) {
    }

    public fun weight(weight: Number) {
    }

    public fun zone(zone: IHostedZone) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.RecordSet.Builder =
        software.amazon.awscdk.services.route53.RecordSet.Builder.create(scope, id)

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun deleteExisting(deleteExisting: Boolean) {
      cdkBuilder.deleteExisting(deleteExisting)
    }

    public override fun geoLocation(geoLocation: GeoLocation) {
      cdkBuilder.geoLocation(geoLocation.let(GeoLocation::unwrap))
    }

    public override fun identifier(setIdentifier: String) {
      cdkBuilder.setIdentifier(setIdentifier)
    }

    public override fun multiValueAnswer(multiValueAnswer: Boolean) {
      cdkBuilder.multiValueAnswer(multiValueAnswer)
    }

    public override fun recordName(recordName: String) {
      cdkBuilder.recordName(recordName)
    }

    public override fun recordType(recordType: RecordType) {
      cdkBuilder.recordType(recordType.let(RecordType::unwrap))
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun target(target: RecordTarget) {
      cdkBuilder.target(target.let(RecordTarget::unwrap))
    }

    public override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration::unwrap))
    }

    public override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public override fun zone(zone: IHostedZone) {
      cdkBuilder.zone(zone.let(IHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.RecordSet = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): RecordSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return RecordSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.RecordSet): RecordSet =
        RecordSet(cdkObject)

    internal fun unwrap(wrapped: RecordSet): software.amazon.awscdk.services.route53.RecordSet =
        wrapped.cdkObject
  }
}
