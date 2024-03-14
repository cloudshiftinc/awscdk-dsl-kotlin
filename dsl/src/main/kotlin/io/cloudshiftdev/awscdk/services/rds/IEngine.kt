package io.cloudshiftdev.awscdk.services.rds

import kotlin.String

public interface IEngine {
  public fun defaultUsername(): String? = unwrap(this).getDefaultUsername()

  public fun engineFamily(): String? = unwrap(this).getEngineFamily()

  public fun engineType(): String

  public fun engineVersion(): EngineVersion? =
      unwrap(this).getEngineVersion()?.let(EngineVersion::wrap)

  public fun parameterGroupFamily(): String? = unwrap(this).getParameterGroupFamily()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.IEngine,
  ) : IEngine {
    public override fun defaultUsername(): String? = unwrap(this).getDefaultUsername()

    public override fun engineFamily(): String? = unwrap(this).getEngineFamily()

    public override fun engineType(): String = unwrap(this).getEngineType()

    public override fun engineVersion(): EngineVersion? =
        unwrap(this).getEngineVersion()?.let(EngineVersion::wrap)

    public override fun parameterGroupFamily(): String? = unwrap(this).getParameterGroupFamily()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IEngine): IEngine =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEngine): software.amazon.awscdk.services.rds.IEngine = (wrapped as
        Wrapper).cdkObject
  }
}
