@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnJson internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnJson,
) : CloudshiftdevConstructsConstruct(cdkObject), IResolvable {
  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  public override fun resolve(_context: IResolveContext): Any =
      unwrap(this).resolve(_context.let(IResolveContext::unwrap))

  public open fun toJson(): String = unwrap(this).toJSON()

  public open fun `value`(): Reference = unwrap(this).getValue().let(Reference::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun `value`(`value`: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnJson.Builder =
        software.amazon.awscdk.CfnJson.Builder.create(scope, id)

    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.CfnJson = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJson {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJson(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnJson): CfnJson = CfnJson(cdkObject)

    internal fun unwrap(wrapped: CfnJson): software.amazon.awscdk.CfnJson = wrapped.cdkObject
  }
}
