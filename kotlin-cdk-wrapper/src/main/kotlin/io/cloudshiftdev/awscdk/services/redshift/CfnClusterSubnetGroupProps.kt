@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnClusterSubnetGroupProps {
  public fun description(): String

  public fun subnetIds(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps,
  ) : CdkObject(cdkObject), CfnClusterSubnetGroupProps {
    override fun description(): String = unwrap(this).getDescription()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterSubnetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps):
        CfnClusterSubnetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterSubnetGroupProps):
        software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps
  }
}
