@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface NotificationRuleSourceConfig {
  public fun sourceArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig.Builder =
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig.builder()

    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build():
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig,
  ) : CdkObject(cdkObject), NotificationRuleSourceConfig {
    override fun sourceArn(): String = unwrap(this).getSourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationRuleSourceConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig):
        NotificationRuleSourceConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationRuleSourceConfig):
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
  }
}