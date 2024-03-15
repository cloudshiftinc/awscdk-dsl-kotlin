@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dax

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSubnetGroupProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  public fun subnetIds(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun subnetGroupName(subnetGroupName: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dax.CfnSubnetGroupProps.Builder =
        software.amazon.awscdk.services.dax.CfnSubnetGroupProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    public fun build(): software.amazon.awscdk.services.dax.CfnSubnetGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dax.CfnSubnetGroupProps,
  ) : CdkObject(cdkObject), CfnSubnetGroupProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubnetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dax.CfnSubnetGroupProps):
        CfnSubnetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetGroupProps):
        software.amazon.awscdk.services.dax.CfnSubnetGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.dax.CfnSubnetGroupProps
  }
}
