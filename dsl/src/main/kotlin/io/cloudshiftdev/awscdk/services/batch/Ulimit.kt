package io.cloudshiftdev.awscdk.services.batch

import kotlin.Number
import kotlin.Unit

public interface Ulimit {
  public fun hardLimit(): Number

  public fun name(): UlimitName

  public fun softLimit(): Number

  public interface Builder {
    public fun hardLimit(hardLimit: Number)

    public fun name(name: UlimitName)

    public fun softLimit(softLimit: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.Ulimit.Builder =
        software.amazon.awscdk.services.batch.Ulimit.builder()

    override fun hardLimit(hardLimit: Number) {
      cdkBuilder.hardLimit(hardLimit)
    }

    override fun name(name: UlimitName) {
      cdkBuilder.name(name.let(UlimitName::unwrap))
    }

    override fun softLimit(softLimit: Number) {
      cdkBuilder.softLimit(softLimit)
    }

    public fun build(): software.amazon.awscdk.services.batch.Ulimit = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.Ulimit,
  ) : Ulimit {
    override fun hardLimit(): Number = unwrap(this).getHardLimit()

    override fun name(): UlimitName = unwrap(this).getName().let(UlimitName::wrap)

    override fun softLimit(): Number = unwrap(this).getSoftLimit()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Ulimit {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.Ulimit): Ulimit =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ulimit): software.amazon.awscdk.services.batch.Ulimit = (wrapped as
        Wrapper).cdkObject
  }
}