@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface InventoryDestination {
  public fun bucket(): IBucket

  public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

  public fun prefix(): String? = unwrap(this).getPrefix()

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun bucketOwner(bucketOwner: String)

    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.InventoryDestination.Builder =
        software.amazon.awscdk.services.s3.InventoryDestination.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun bucketOwner(bucketOwner: String) {
      cdkBuilder.bucketOwner(bucketOwner)
    }

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.s3.InventoryDestination = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.InventoryDestination,
  ) : CdkObject(cdkObject), InventoryDestination {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InventoryDestination {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.InventoryDestination):
        InventoryDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InventoryDestination):
        software.amazon.awscdk.services.s3.InventoryDestination = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.s3.InventoryDestination
  }
}
