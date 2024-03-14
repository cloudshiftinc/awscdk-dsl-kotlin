package io.cloudshiftdev.awscdk.services.rekognition

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCollection internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rekognition.CfnCollection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the Amazon Resource Name of the collection.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * ID for the collection that you are creating.
   */
  public open fun collectionId(): String = unwrap(this).getCollectionId()

  /**
   * ID for the collection that you are creating.
   */
  public open fun collectionId(`value`: String) {
    unwrap(this).setCollectionId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A set of tags (key-value pairs) that you want to attach to the collection.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A set of tags (key-value pairs) that you want to attach to the collection.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A set of tags (key-value pairs) that you want to attach to the collection.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rekognition.CfnCollection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * ID for the collection that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-collectionid)
     * @param collectionId ID for the collection that you are creating. 
     */
    public fun collectionId(collectionId: String)

    /**
     * A set of tags (key-value pairs) that you want to attach to the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-tags)
     * @param tags A set of tags (key-value pairs) that you want to attach to the collection. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A set of tags (key-value pairs) that you want to attach to the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-tags)
     * @param tags A set of tags (key-value pairs) that you want to attach to the collection. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rekognition.CfnCollection.Builder =
        software.amazon.awscdk.services.rekognition.CfnCollection.Builder.create(scope, id)

    /**
     * ID for the collection that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-collectionid)
     * @param collectionId ID for the collection that you are creating. 
     */
    override fun collectionId(collectionId: String) {
      cdkBuilder.collectionId(collectionId)
    }

    /**
     * A set of tags (key-value pairs) that you want to attach to the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-tags)
     * @param tags A set of tags (key-value pairs) that you want to attach to the collection. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A set of tags (key-value pairs) that you want to attach to the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html#cfn-rekognition-collection-tags)
     * @param tags A set of tags (key-value pairs) that you want to attach to the collection. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rekognition.CfnCollection =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCollection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCollection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rekognition.CfnCollection):
        CfnCollection = CfnCollection(cdkObject)

    internal fun unwrap(wrapped: CfnCollection):
        software.amazon.awscdk.services.rekognition.CfnCollection = wrapped.cdkObject
  }
}
