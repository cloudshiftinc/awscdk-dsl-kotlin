package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Number
import kotlin.Unit

public interface ItemReaderProps {
  /**
   * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
   */
  public fun bucket(): IBucket

  /**
   * Limits the number of items passed to the Distributed Map state.
   *
   * Default: - Distributed Map state will iterate over all items provided by the ItemReader
   */
  public fun maxItems(): Number? = unwrap(this).getMaxItems()

  /**
   * A builder for [ItemReaderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     * over. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param maxItems Limits the number of items passed to the Distributed Map state.
     */
    public fun maxItems(maxItems: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ItemReaderProps.Builder =
        software.amazon.awscdk.services.stepfunctions.ItemReaderProps.builder()

    /**
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     * over. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param maxItems Limits the number of items passed to the Distributed Map state.
     */
    override fun maxItems(maxItems: Number) {
      cdkBuilder.maxItems(maxItems)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ItemReaderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.ItemReaderProps,
  ) : CdkObject(cdkObject), ItemReaderProps {
    /**
     * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * Limits the number of items passed to the Distributed Map state.
     *
     * Default: - Distributed Map state will iterate over all items provided by the ItemReader
     */
    override fun maxItems(): Number? = unwrap(this).getMaxItems()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ItemReaderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ItemReaderProps):
        ItemReaderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ItemReaderProps):
        software.amazon.awscdk.services.stepfunctions.ItemReaderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ItemReaderProps
  }
}
