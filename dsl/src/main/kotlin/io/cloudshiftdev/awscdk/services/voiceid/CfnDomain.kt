package io.cloudshiftdev.awscdk.services.voiceid

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomain internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.voiceid.CfnDomain,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The identifier of the domain.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The description of the domain.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the domain.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The name for the domain.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name for the domain.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The server-side encryption configuration containing the KMS key identifier you want Voice ID to
   * use to encrypt your data.
   */
  public open fun serverSideEncryptionConfiguration(): Any =
      unwrap(this).getServerSideEncryptionConfiguration()

  /**
   * The server-side encryption configuration containing the KMS key identifier you want Voice ID to
   * use to encrypt your data.
   */
  public open fun serverSideEncryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The server-side encryption configuration containing the KMS key identifier you want Voice ID to
   * use to encrypt your data.
   */
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(ServerSideEncryptionConfigurationProperty::unwrap))
  }

  /**
   * The server-side encryption configuration containing the KMS key identifier you want Voice ID to
   * use to encrypt your data.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ece0becb0a9c77d8a84053f162dcdade92b96fda76ce55032e2bf5aef10e61c1")
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
      Unit = serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.voiceid.CfnDomain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-description)
     * @param description The description of the domain. 
     */
    public fun description(description: String)

    /**
     * The name for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-name)
     * @param name The name for the domain. 
     */
    public fun name(name: String)

    /**
     * The server-side encryption configuration containing the KMS key identifier you want Voice ID
     * to use to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     * the KMS key identifier you want Voice ID to use to encrypt your data. 
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    /**
     * The server-side encryption configuration containing the KMS key identifier you want Voice ID
     * to use to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     * the KMS key identifier you want Voice ID to use to encrypt your data. 
     */
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty)

    /**
     * The server-side encryption configuration containing the KMS key identifier you want Voice ID
     * to use to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     * the KMS key identifier you want Voice ID to use to encrypt your data. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d16ac974d8a28511745e058ff5c8b8c4d693e620b140c0705ffaf6509c9e5c3")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.voiceid.CfnDomain.Builder =
        software.amazon.awscdk.services.voiceid.CfnDomain.Builder.create(scope, id)

    /**
     * The description of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-description)
     * @param description The description of the domain. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-name)
     * @param name The name for the domain. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The server-side encryption configuration containing the KMS key identifier you want Voice ID
     * to use to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     * the KMS key identifier you want Voice ID to use to encrypt your data. 
     */
    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The server-side encryption configuration containing the KMS key identifier you want Voice ID
     * to use to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     * the KMS key identifier you want Voice ID to use to encrypt your data. 
     */
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(ServerSideEncryptionConfigurationProperty::unwrap))
    }

    /**
     * The server-side encryption configuration containing the KMS key identifier you want Voice ID
     * to use to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     * the KMS key identifier you want Voice ID to use to encrypt your data. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d16ac974d8a28511745e058ff5c8b8c4d693e620b140c0705ffaf6509c9e5c3")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.voiceid.CfnDomain = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.voiceid.CfnDomain): CfnDomain =
        CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.voiceid.CfnDomain =
        wrapped.cdkObject
  }

  public interface ServerSideEncryptionConfigurationProperty {
    /**
     * The identifier of the KMS key to use to encrypt data stored by Voice ID.
     *
     * Voice ID doesn't support asymmetric customer managed keys .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-voiceid-domain-serversideencryptionconfiguration.html#cfn-voiceid-domain-serversideencryptionconfiguration-kmskeyid)
     */
    public fun kmsKeyId(): String

    /**
     * A builder for [ServerSideEncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The identifier of the KMS key to use to encrypt data stored by Voice ID. 
       * Voice ID doesn't support asymmetric customer managed keys .
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty.builder()

      /**
       * @param kmsKeyId The identifier of the KMS key to use to encrypt data stored by Voice ID. 
       * Voice ID doesn't support asymmetric customer managed keys .
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), ServerSideEncryptionConfigurationProperty {
      /**
       * The identifier of the KMS key to use to encrypt data stored by Voice ID.
       *
       * Voice ID doesn't support asymmetric customer managed keys .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-voiceid-domain-serversideencryptionconfiguration.html#cfn-voiceid-domain-serversideencryptionconfiguration-kmskeyid)
       */
      override fun kmsKeyId(): String = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerSideEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty):
          ServerSideEncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerSideEncryptionConfigurationProperty):
          software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.voiceid.CfnDomain.ServerSideEncryptionConfigurationProperty
    }
  }
}
