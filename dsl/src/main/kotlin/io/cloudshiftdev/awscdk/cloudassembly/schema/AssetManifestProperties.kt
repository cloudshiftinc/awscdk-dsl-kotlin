package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface AssetManifestProperties : AssetManifestOptions {
  public fun `file`(): String

  public interface Builder {
    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String)

    public fun `file`(`file`: String)

    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties.Builder =
        software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties.builder()

    override fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    override fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
      cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties,
  ) : AssetManifestProperties {
    override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    override fun `file`(): String = unwrap(this).getFile()

    override fun requiresBootstrapStackVersion(): Number? =
        unwrap(this).getRequiresBootstrapStackVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AssetManifestProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties):
        AssetManifestProperties = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetManifestProperties):
        software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties = (wrapped as
        Wrapper).cdkObject
  }
}