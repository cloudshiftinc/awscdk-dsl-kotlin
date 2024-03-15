@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SecondaryIndexProps {
  public fun indexName(): String

  public fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?: emptyList()

  public fun projectionType(): ProjectionType? =
      unwrap(this).getProjectionType()?.let(ProjectionType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun indexName(indexName: String)

    public fun nonKeyAttributes(nonKeyAttributes: List<String>)

    public fun nonKeyAttributes(vararg nonKeyAttributes: String)

    public fun projectionType(projectionType: ProjectionType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.Builder =
        software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.builder()

    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    override fun nonKeyAttributes(nonKeyAttributes: List<String>) {
      cdkBuilder.nonKeyAttributes(nonKeyAttributes)
    }

    override fun nonKeyAttributes(vararg nonKeyAttributes: String): Unit =
        nonKeyAttributes(nonKeyAttributes.toList())

    override fun projectionType(projectionType: ProjectionType) {
      cdkBuilder.projectionType(projectionType.let(ProjectionType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.SecondaryIndexProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.SecondaryIndexProps,
  ) : CdkObject(cdkObject), SecondaryIndexProps {
    override fun indexName(): String = unwrap(this).getIndexName()

    override fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?:
        emptyList()

    override fun projectionType(): ProjectionType? =
        unwrap(this).getProjectionType()?.let(ProjectionType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecondaryIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.SecondaryIndexProps):
        SecondaryIndexProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecondaryIndexProps):
        software.amazon.awscdk.services.dynamodb.SecondaryIndexProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.SecondaryIndexProps
  }
}
