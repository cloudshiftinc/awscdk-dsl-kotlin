package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDNSSEC internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53.CfnDNSSEC,
) : CfnResource(cdkObject), IInspectable {
  public open fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

  public open fun hostedZoneId(`value`: String) {
    unwrap(this).setHostedZoneId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun hostedZoneId(hostedZoneId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnDNSSEC.Builder =
        software.amazon.awscdk.services.route53.CfnDNSSEC.Builder.create(scope, id)

    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnDNSSEC = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDNSSEC {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDNSSEC(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnDNSSEC): CfnDNSSEC =
        CfnDNSSEC(cdkObject)

    internal fun unwrap(wrapped: CfnDNSSEC): software.amazon.awscdk.services.route53.CfnDNSSEC =
        wrapped.cdkObject
  }
}
