@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface DkimRecord {
  public fun name(): String

  public fun `value`(): String

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.DkimRecord.Builder =
        software.amazon.awscdk.services.ses.DkimRecord.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.ses.DkimRecord = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.DkimRecord,
  ) : CdkObject(cdkObject), DkimRecord {
    override fun name(): String = unwrap(this).getName()

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DkimRecord {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DkimRecord): DkimRecord =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DkimRecord): software.amazon.awscdk.services.ses.DkimRecord =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.DkimRecord
  }
}