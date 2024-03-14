package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface NestedCloudAssemblyProperties {
  /**
   * Relative path to the nested cloud assembly.
   */
  public fun directoryName(): String

  /**
   * Display name for the cloud assembly.
   *
   * Default: - The artifact ID
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * A builder for [NestedCloudAssemblyProperties]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param directoryName Relative path to the nested cloud assembly. 
     */
    public fun directoryName(directoryName: String)

    /**
     * @param displayName Display name for the cloud assembly.
     */
    public fun displayName(displayName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties.Builder =
        software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties.builder()

    /**
     * @param directoryName Relative path to the nested cloud assembly. 
     */
    override fun directoryName(directoryName: String) {
      cdkBuilder.directoryName(directoryName)
    }

    /**
     * @param displayName Display name for the cloud assembly.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties,
  ) : NestedCloudAssemblyProperties {
    /**
     * Relative path to the nested cloud assembly.
     */
    override fun directoryName(): String = unwrap(this).getDirectoryName()

    /**
     * Display name for the cloud assembly.
     *
     * Default: - The artifact ID
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NestedCloudAssemblyProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties):
        NestedCloudAssemblyProperties = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NestedCloudAssemblyProperties):
        software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties = (wrapped as
        Wrapper).cdkObject
  }
}
