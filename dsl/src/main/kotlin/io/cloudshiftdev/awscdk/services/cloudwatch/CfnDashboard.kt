package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDashboard internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnDashboard,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun dashboardBody(): String = unwrap(this).getDashboardBody()

  public open fun dashboardBody(`value`: String) {
    unwrap(this).setDashboardBody(`value`)
  }

  public open fun dashboardName(): String? = unwrap(this).getDashboardName()

  public open fun dashboardName(`value`: String) {
    unwrap(this).setDashboardName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun dashboardBody(dashboardBody: String) {
    }

    public fun dashboardName(dashboardName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnDashboard.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnDashboard.Builder.create(scope, id)

    public override fun dashboardBody(dashboardBody: String) {
      cdkBuilder.dashboardBody(dashboardBody)
    }

    public override fun dashboardName(dashboardName: String) {
      cdkBuilder.dashboardName(dashboardName)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnDashboard = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDashboard {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDashboard(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnDashboard):
        CfnDashboard = CfnDashboard(cdkObject)

    internal fun unwrap(wrapped: CfnDashboard):
        software.amazon.awscdk.services.cloudwatch.CfnDashboard = wrapped.cdkObject
  }
}
