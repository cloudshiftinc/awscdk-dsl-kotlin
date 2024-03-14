package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface NamedPackageOptions {
  /**
   * Restart the given services after this command has run.
   *
   * Default: - Do not restart any service
   */
  public fun serviceRestartHandles(): List<InitServiceRestartHandle> =
      unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

  /**
   * Specify the versions to install.
   *
   * Default: - Install the latest version
   */
  public fun version(): List<String> = unwrap(this).getVersion() ?: emptyList()

  /**
   * A builder for [NamedPackageOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param serviceRestartHandles Restart the given services after this command has run.
     */
    public fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>)

    /**
     * @param serviceRestartHandles Restart the given services after this command has run.
     */
    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle)

    /**
     * @param version Specify the versions to install.
     */
    public fun version(version: List<String>)

    /**
     * @param version Specify the versions to install.
     */
    public fun version(vararg version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NamedPackageOptions.Builder =
        software.amazon.awscdk.services.ec2.NamedPackageOptions.builder()

    /**
     * @param serviceRestartHandles Restart the given services after this command has run.
     */
    override fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>) {
      cdkBuilder.serviceRestartHandles(serviceRestartHandles.map(InitServiceRestartHandle::unwrap))
    }

    /**
     * @param serviceRestartHandles Restart the given services after this command has run.
     */
    override fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle): Unit
        = serviceRestartHandles(serviceRestartHandles.toList())

    /**
     * @param version Specify the versions to install.
     */
    override fun version(version: List<String>) {
      cdkBuilder.version(version)
    }

    /**
     * @param version Specify the versions to install.
     */
    override fun version(vararg version: String): Unit = version(version.toList())

    public fun build(): software.amazon.awscdk.services.ec2.NamedPackageOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.NamedPackageOptions,
  ) : CdkObject(cdkObject), NamedPackageOptions {
    /**
     * Restart the given services after this command has run.
     *
     * Default: - Do not restart any service
     */
    override fun serviceRestartHandles(): List<InitServiceRestartHandle> =
        unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

    /**
     * Specify the versions to install.
     *
     * Default: - Install the latest version
     */
    override fun version(): List<String> = unwrap(this).getVersion() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NamedPackageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NamedPackageOptions):
        NamedPackageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NamedPackageOptions):
        software.amazon.awscdk.services.ec2.NamedPackageOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.NamedPackageOptions
  }
}
