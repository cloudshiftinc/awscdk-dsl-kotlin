@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnContactFlowProps {
  public fun content(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun instanceArn(): String

  public fun name(): String

  public fun state(): String? = unwrap(this).getState()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun content(content: String)

    public fun description(description: String)

    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun state(state: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnContactFlowProps.Builder =
        software.amazon.awscdk.services.connect.CfnContactFlowProps.builder()

    override fun content(content: String) {
      cdkBuilder.content(content)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnContactFlowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnContactFlowProps,
  ) : CdkObject(cdkObject), CfnContactFlowProps {
    override fun content(): String = unwrap(this).getContent()

    override fun description(): String? = unwrap(this).getDescription()

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun name(): String = unwrap(this).getName()

    override fun state(): String? = unwrap(this).getState()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContactFlowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnContactFlowProps):
        CfnContactFlowProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContactFlowProps):
        software.amazon.awscdk.services.connect.CfnContactFlowProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnContactFlowProps
  }
}
