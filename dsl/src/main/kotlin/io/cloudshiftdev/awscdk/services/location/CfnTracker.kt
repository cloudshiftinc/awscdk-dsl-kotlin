package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTracker internal constructor(
  private val cdkObject: software.amazon.awscdk.services.location.CfnTracker,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  public open fun attrTrackerArn(): String = unwrap(this).getAttrTrackerArn()

  public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun eventBridgeEnabled(): Any? = unwrap(this).getEventBridgeEnabled()

  public open fun eventBridgeEnabled(`value`: Boolean) {
    unwrap(this).setEventBridgeEnabled(`value`)
  }

  public open fun eventBridgeEnabled(`value`: IResolvable) {
    unwrap(this).setEventBridgeEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyEnableGeospatialQueries(): Any? =
      unwrap(this).getKmsKeyEnableGeospatialQueries()

  public open fun kmsKeyEnableGeospatialQueries(`value`: Boolean) {
    unwrap(this).setKmsKeyEnableGeospatialQueries(`value`)
  }

  public open fun kmsKeyEnableGeospatialQueries(`value`: IResolvable) {
    unwrap(this).setKmsKeyEnableGeospatialQueries(`value`.let(IResolvable::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun positionFiltering(): String? = unwrap(this).getPositionFiltering()

  public open fun positionFiltering(`value`: String) {
    unwrap(this).setPositionFiltering(`value`)
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  @Deprecated(message = "deprecated in CDK")
  public open fun pricingPlan(`value`: String) {
    unwrap(this).setPricingPlan(`value`)
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun pricingPlanDataSource(): String? = unwrap(this).getPricingPlanDataSource()

  @Deprecated(message = "deprecated in CDK")
  public open fun pricingPlanDataSource(`value`: String) {
    unwrap(this).setPricingPlanDataSource(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun trackerName(): String = unwrap(this).getTrackerName()

  public open fun trackerName(`value`: String) {
    unwrap(this).setTrackerName(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
    }

    public fun eventBridgeEnabled(eventBridgeEnabled: IResolvable) {
    }

    public fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: Boolean) {
    }

    public fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: IResolvable) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    public fun positionFiltering(positionFiltering: String) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlan(pricingPlan: String) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlanDataSource(pricingPlanDataSource: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun trackerName(trackerName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnTracker.Builder =
        software.amazon.awscdk.services.location.CfnTracker.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
      cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
    }

    public override fun eventBridgeEnabled(eventBridgeEnabled: IResolvable) {
      cdkBuilder.eventBridgeEnabled(eventBridgeEnabled.let(IResolvable::unwrap))
    }

    public override fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: Boolean) {
      cdkBuilder.kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries)
    }

    public override fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: IResolvable) {
      cdkBuilder.kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries.let(IResolvable::unwrap))
    }

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public override fun positionFiltering(positionFiltering: String) {
      cdkBuilder.positionFiltering(positionFiltering)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun pricingPlanDataSource(pricingPlanDataSource: String) {
      cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun trackerName(trackerName: String) {
      cdkBuilder.trackerName(trackerName)
    }

    public fun build(): software.amazon.awscdk.services.location.CfnTracker = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTracker {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTracker(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnTracker): CfnTracker =
        CfnTracker(cdkObject)

    internal fun unwrap(wrapped: CfnTracker): software.amazon.awscdk.services.location.CfnTracker =
        wrapped.cdkObject
  }
}
