package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface MySqlInstanceEngineProps {
  /**
   * The exact version of the engine to use.
   */
  public fun version(): MysqlEngineVersion

  /**
   * A builder for [MySqlInstanceEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The exact version of the engine to use. 
     */
    public fun version(version: MysqlEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.MySqlInstanceEngineProps.Builder =
        software.amazon.awscdk.services.rds.MySqlInstanceEngineProps.builder()

    /**
     * @param version The exact version of the engine to use. 
     */
    override fun version(version: MysqlEngineVersion) {
      cdkBuilder.version(version.let(MysqlEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.MySqlInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.MySqlInstanceEngineProps,
  ) : CdkObject(cdkObject), MySqlInstanceEngineProps {
    /**
     * The exact version of the engine to use.
     */
    override fun version(): MysqlEngineVersion =
        unwrap(this).getVersion().let(MysqlEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MySqlInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.MySqlInstanceEngineProps):
        MySqlInstanceEngineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MySqlInstanceEngineProps):
        software.amazon.awscdk.services.rds.MySqlInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.MySqlInstanceEngineProps
  }
}
