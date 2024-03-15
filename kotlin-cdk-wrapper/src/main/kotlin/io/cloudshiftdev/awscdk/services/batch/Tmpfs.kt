@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface Tmpfs {
  public fun containerPath(): String

  public fun mountOptions(): List<TmpfsMountOption> =
      unwrap(this).getMountOptions()?.map(TmpfsMountOption::wrap) ?: emptyList()

  public fun size(): Size

  @CdkDslMarker
  public interface Builder {
    public fun containerPath(containerPath: String)

    public fun mountOptions(mountOptions: List<TmpfsMountOption>)

    public fun mountOptions(vararg mountOptions: TmpfsMountOption)

    public fun size(size: Size)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.Tmpfs.Builder =
        software.amazon.awscdk.services.batch.Tmpfs.builder()

    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    override fun mountOptions(mountOptions: List<TmpfsMountOption>) {
      cdkBuilder.mountOptions(mountOptions.map(TmpfsMountOption::unwrap))
    }

    override fun mountOptions(vararg mountOptions: TmpfsMountOption): Unit =
        mountOptions(mountOptions.toList())

    override fun size(size: Size) {
      cdkBuilder.size(size.let(Size::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.Tmpfs = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.Tmpfs,
  ) : CdkObject(cdkObject), Tmpfs {
    override fun containerPath(): String = unwrap(this).getContainerPath()

    override fun mountOptions(): List<TmpfsMountOption> =
        unwrap(this).getMountOptions()?.map(TmpfsMountOption::wrap) ?: emptyList()

    override fun size(): Size = unwrap(this).getSize().let(Size::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Tmpfs {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.Tmpfs): Tmpfs =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Tmpfs): software.amazon.awscdk.services.batch.Tmpfs = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.Tmpfs
  }
}
