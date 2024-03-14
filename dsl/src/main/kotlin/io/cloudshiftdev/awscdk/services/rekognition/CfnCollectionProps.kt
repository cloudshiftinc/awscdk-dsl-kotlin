package io.cloudshiftdev.awscdk.services.rekognition

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCollectionProps {
  /**
   * ID for the collection that you are creating.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-collectionid)
   */
  public fun collectionId(): String

  /**
   * A set of tags (key-value pairs) that you want to attach to the collection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCollectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param collectionId ID for the collection that you are creating. 
     */
    public fun collectionId(collectionId: String)

    /**
     * @param tags A set of tags (key-value pairs) that you want to attach to the collection.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A set of tags (key-value pairs) that you want to attach to the collection.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rekognition.CfnCollectionProps.Builder =
        software.amazon.awscdk.services.rekognition.CfnCollectionProps.builder()

    /**
     * @param collectionId ID for the collection that you are creating. 
     */
    override fun collectionId(collectionId: String) {
      cdkBuilder.collectionId(collectionId)
    }

    /**
     * @param tags A set of tags (key-value pairs) that you want to attach to the collection.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A set of tags (key-value pairs) that you want to attach to the collection.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rekognition.CfnCollectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rekognition.CfnCollectionProps,
  ) : CdkObject(cdkObject), CfnCollectionProps {
    /**
     * ID for the collection that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-collectionid)
     */
    override fun collectionId(): String = unwrap(this).getCollectionId()

    /**
     * A set of tags (key-value pairs) that you want to attach to the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCollectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnCollectionProps):
        CfnCollectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCollectionProps):
        software.amazon.awscdk.services.rekognition.CfnCollectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rekognition.CfnCollectionProps
  }
}
