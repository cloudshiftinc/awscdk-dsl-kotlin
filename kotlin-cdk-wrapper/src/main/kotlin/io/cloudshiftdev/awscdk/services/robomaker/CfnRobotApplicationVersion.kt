@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRobotApplicationVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun application(): String = unwrap(this).getApplication()

  public open fun application(`value`: String) {
    unwrap(this).setApplication(`value`)
  }

  public open fun attrApplicationVersion(): String = unwrap(this).getAttrApplicationVersion()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  public open fun currentRevisionId(`value`: String) {
    unwrap(this).setCurrentRevisionId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun application(application: String)

    public fun currentRevisionId(currentRevisionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion.Builder =
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion.Builder.create(scope,
        id)

    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRobotApplicationVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRobotApplicationVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion):
        CfnRobotApplicationVersion = CfnRobotApplicationVersion(cdkObject)

    internal fun unwrap(wrapped: CfnRobotApplicationVersion):
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion = wrapped.cdkObject
  }
}
