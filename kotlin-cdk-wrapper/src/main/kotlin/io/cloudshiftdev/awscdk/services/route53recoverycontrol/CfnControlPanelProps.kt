@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnControlPanelProps {
  public fun clusterArn(): String? = unwrap(this).getClusterArn()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun clusterArn(clusterArn: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps.builder()

    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps,
  ) : CdkObject(cdkObject), CfnControlPanelProps {
    override fun clusterArn(): String? = unwrap(this).getClusterArn()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnControlPanelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps):
        CfnControlPanelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnControlPanelProps):
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps
  }
}
