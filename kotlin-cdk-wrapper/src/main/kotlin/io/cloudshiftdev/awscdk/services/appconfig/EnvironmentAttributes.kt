@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface EnvironmentAttributes {
  public fun application(): IApplication

  public fun description(): String? = unwrap(this).getDescription()

  public fun environmentId(): String

  public fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
      emptyList()

  public fun name(): String? = unwrap(this).getName()

  @CdkDslMarker
  public interface Builder {
    public fun application(application: IApplication)

    public fun description(description: String)

    public fun environmentId(environmentId: String)

    public fun monitors(monitors: List<Monitor>)

    public fun monitors(vararg monitors: Monitor)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.EnvironmentAttributes.Builder
        = software.amazon.awscdk.services.appconfig.EnvironmentAttributes.builder()

    override fun application(application: IApplication) {
      cdkBuilder.application(application.let(IApplication::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environmentId(environmentId: String) {
      cdkBuilder.environmentId(environmentId)
    }

    override fun monitors(monitors: List<Monitor>) {
      cdkBuilder.monitors(monitors.map(Monitor::unwrap))
    }

    override fun monitors(vararg monitors: Monitor): Unit = monitors(monitors.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.EnvironmentAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentAttributes,
  ) : CdkObject(cdkObject), EnvironmentAttributes {
    override fun application(): IApplication = unwrap(this).getApplication().let(IApplication::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun environmentId(): String = unwrap(this).getEnvironmentId()

    override fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
        emptyList()

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentAttributes):
        EnvironmentAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentAttributes):
        software.amazon.awscdk.services.appconfig.EnvironmentAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.EnvironmentAttributes
  }
}
