package io.cloudshiftdev.awscdk.services.route53.patterns

import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HttpsRedirect internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.patterns.HttpsRedirect,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public interface Builder {
    public fun certificate(certificate: ICertificate)

    public fun recordNames(recordNames: List<String>)

    public fun targetDomain(targetDomain: String)

    public fun zone(zone: IHostedZone)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.patterns.HttpsRedirect.Builder =
        software.amazon.awscdk.services.route53.patterns.HttpsRedirect.Builder.create(scope, id)

    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    override fun recordNames(recordNames: List<String>) {
      cdkBuilder.recordNames(recordNames)
    }

    override fun targetDomain(targetDomain: String) {
      cdkBuilder.targetDomain(targetDomain)
    }

    override fun zone(zone: IHostedZone) {
      cdkBuilder.zone(zone.let(IHostedZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.patterns.HttpsRedirect =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpsRedirect {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpsRedirect(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.patterns.HttpsRedirect):
        HttpsRedirect = HttpsRedirect(cdkObject)

    internal fun unwrap(wrapped: HttpsRedirect):
        software.amazon.awscdk.services.route53.patterns.HttpsRedirect = wrapped.cdkObject
  }
}