@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class VdmAttributes internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.VdmAttributes,
) : Resource(cdkObject), IVdmAttributes {
  public override fun vdmAttributesName(): String = unwrap(this).getVdmAttributesName()

  public open fun vdmAttributesResourceId(): String = unwrap(this).getVdmAttributesResourceId()

  @CdkDslMarker
  public interface Builder {
    public fun engagementMetrics(engagementMetrics: Boolean)

    public fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.VdmAttributes.Builder =
        software.amazon.awscdk.services.ses.VdmAttributes.Builder.create(scope, id)

    override fun engagementMetrics(engagementMetrics: Boolean) {
      cdkBuilder.engagementMetrics(engagementMetrics)
    }

    override fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean) {
      cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
    }

    public fun build(): software.amazon.awscdk.services.ses.VdmAttributes = cdkBuilder.build()
  }

  public companion object {
    public fun fromVdmAttributesName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      vdmAttributesName: String,
    ): IVdmAttributes =
        software.amazon.awscdk.services.ses.VdmAttributes.fromVdmAttributesName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, vdmAttributesName).let(IVdmAttributes::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VdmAttributes {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VdmAttributes(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.VdmAttributes): VdmAttributes =
        VdmAttributes(cdkObject)

    internal fun unwrap(wrapped: VdmAttributes): software.amazon.awscdk.services.ses.VdmAttributes =
        wrapped.cdkObject
  }
}
