@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.frauddetector

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLabelProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnLabelProps.Builder =
        software.amazon.awscdk.services.frauddetector.CfnLabelProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnLabelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.frauddetector.CfnLabelProps,
  ) : CdkObject(cdkObject), CfnLabelProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLabelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnLabelProps):
        CfnLabelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLabelProps):
        software.amazon.awscdk.services.frauddetector.CfnLabelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.frauddetector.CfnLabelProps
  }
}
