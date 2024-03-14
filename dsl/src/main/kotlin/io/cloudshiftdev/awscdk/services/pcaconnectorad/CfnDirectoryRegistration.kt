package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDirectoryRegistration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
   * .
   */
  public open fun attrDirectoryRegistrationArn(): String =
      unwrap(this).getAttrDirectoryRegistrationArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The identifier of the Active Directory.
   */
  public open fun directoryId(): String = unwrap(this).getDirectoryId()

  /**
   * The identifier of the Active Directory.
   */
  public open fun directoryId(`value`: String) {
    unwrap(this).setDirectoryId(`value`)
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
   * Metadata assigned to a directory registration consisting of a key-value pair.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Metadata assigned to a directory registration consisting of a key-value pair.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.pcaconnectorad.CfnDirectoryRegistration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the Active Directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html#cfn-pcaconnectorad-directoryregistration-directoryid)
     * @param directoryId The identifier of the Active Directory. 
     */
    public fun directoryId(directoryId: String)

    /**
     * Metadata assigned to a directory registration consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html#cfn-pcaconnectorad-directoryregistration-tags)
     * @param tags Metadata assigned to a directory registration consisting of a key-value pair. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration.Builder.create(scope,
        id)

    /**
     * The identifier of the Active Directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html#cfn-pcaconnectorad-directoryregistration-directoryid)
     * @param directoryId The identifier of the Active Directory. 
     */
    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    /**
     * Metadata assigned to a directory registration consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-directoryregistration.html#cfn-pcaconnectorad-directoryregistration-tags)
     * @param tags Metadata assigned to a directory registration consisting of a key-value pair. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDirectoryRegistration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDirectoryRegistration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration):
        CfnDirectoryRegistration = CfnDirectoryRegistration(cdkObject)

    internal fun unwrap(wrapped: CfnDirectoryRegistration):
        software.amazon.awscdk.services.pcaconnectorad.CfnDirectoryRegistration = wrapped.cdkObject
  }
}
