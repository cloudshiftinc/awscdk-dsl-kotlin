package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface WindowsImageProps {
  /**
   * Initial user data.
   *
   * Default: - Empty UserData for Windows machines
   */
  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  /**
   * A builder for [WindowsImageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param userData Initial user data.
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.WindowsImageProps.Builder =
        software.amazon.awscdk.services.ec2.WindowsImageProps.builder()

    /**
     * @param userData Initial user data.
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.WindowsImageProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.WindowsImageProps,
  ) : CdkObject(cdkObject), WindowsImageProps {
    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Windows machines
     */
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WindowsImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.WindowsImageProps):
        WindowsImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WindowsImageProps):
        software.amazon.awscdk.services.ec2.WindowsImageProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.WindowsImageProps
  }
}
