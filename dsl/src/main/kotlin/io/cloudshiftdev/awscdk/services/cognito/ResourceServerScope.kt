package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String
import kotlin.Unit

public open class ResourceServerScope internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.ResourceServerScope,
) {
  public open fun scopeDescription(): String = unwrap(this).getScopeDescription()

  public open fun scopeName(): String = unwrap(this).getScopeName()

  public interface Builder {
    public fun scopeDescription(scopeDescription: String)

    public fun scopeName(scopeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.ResourceServerScope.Builder =
        software.amazon.awscdk.services.cognito.ResourceServerScope.Builder.create()

    override fun scopeDescription(scopeDescription: String) {
      cdkBuilder.scopeDescription(scopeDescription)
    }

    override fun scopeName(scopeName: String) {
      cdkBuilder.scopeName(scopeName)
    }

    public fun build(): software.amazon.awscdk.services.cognito.ResourceServerScope =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceServerScope {
      val builderImpl = BuilderImpl()
      return ResourceServerScope(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ResourceServerScope):
        ResourceServerScope = ResourceServerScope(cdkObject)

    internal fun unwrap(wrapped: ResourceServerScope):
        software.amazon.awscdk.services.cognito.ResourceServerScope = wrapped.cdkObject
  }
}
