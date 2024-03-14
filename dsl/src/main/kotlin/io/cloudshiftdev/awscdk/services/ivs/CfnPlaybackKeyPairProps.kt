package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPlaybackKeyPairProps {
  /**
   * Playback-key-pair name.
   *
   * The value does not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The public portion of a customer-generated key pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-publickeymaterial)
   */
  public fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackkeypair-tag.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPlaybackKeyPairProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Playback-key-pair name.
     * The value does not need to be unique.
     */
    public fun name(name: String)

    /**
     * @param publicKeyMaterial The public portion of a customer-generated key pair.
     */
    public fun publicKeyMaterial(publicKeyMaterial: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackkeypair-tag.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackkeypair-tag.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps.Builder =
        software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps.builder()

    /**
     * @param name Playback-key-pair name.
     * The value does not need to be unique.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param publicKeyMaterial The public portion of a customer-generated key pair.
     */
    override fun publicKeyMaterial(publicKeyMaterial: String) {
      cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackkeypair-tag.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackkeypair-tag.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps,
  ) : CdkObject(cdkObject), CfnPlaybackKeyPairProps {
    /**
     * Playback-key-pair name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The public portion of a customer-generated key pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-publickeymaterial)
     */
    override fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-playbackkeypair-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-playbackkeypair.html#cfn-ivs-playbackkeypair-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlaybackKeyPairProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps):
        CfnPlaybackKeyPairProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPlaybackKeyPairProps):
        software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps
  }
}
