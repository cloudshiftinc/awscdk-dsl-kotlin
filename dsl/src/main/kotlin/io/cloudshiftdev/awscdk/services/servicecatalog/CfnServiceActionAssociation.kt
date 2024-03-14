package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServiceActionAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The product identifier.
   */
  public open fun productId(): String = unwrap(this).getProductId()

  /**
   * The product identifier.
   */
  public open fun productId(`value`: String) {
    unwrap(this).setProductId(`value`)
  }

  /**
   * The identifier of the provisioning artifact.
   */
  public open fun provisioningArtifactId(): String = unwrap(this).getProvisioningArtifactId()

  /**
   * The identifier of the provisioning artifact.
   */
  public open fun provisioningArtifactId(`value`: String) {
    unwrap(this).setProvisioningArtifactId(`value`)
  }

  /**
   * The self-service action identifier.
   */
  public open fun serviceActionId(): String = unwrap(this).getServiceActionId()

  /**
   * The self-service action identifier.
   */
  public open fun serviceActionId(`value`: String) {
    unwrap(this).setServiceActionId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.servicecatalog.CfnServiceActionAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The product identifier.
     *
     * For example, `prod-abcdzk7xy33qa` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-productid)
     * @param productId The product identifier. 
     */
    public fun productId(productId: String)

    /**
     * The identifier of the provisioning artifact.
     *
     * For example, `pa-4abcdjnxjj6ne` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-provisioningartifactid)
     * @param provisioningArtifactId The identifier of the provisioning artifact. 
     */
    public fun provisioningArtifactId(provisioningArtifactId: String)

    /**
     * The self-service action identifier.
     *
     * For example, `act-fs7abcd89wxyz` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-serviceactionid)
     * @param serviceActionId The self-service action identifier. 
     */
    public fun serviceActionId(serviceActionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation.Builder.create(scope,
        id)

    /**
     * The product identifier.
     *
     * For example, `prod-abcdzk7xy33qa` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-productid)
     * @param productId The product identifier. 
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    /**
     * The identifier of the provisioning artifact.
     *
     * For example, `pa-4abcdjnxjj6ne` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-provisioningartifactid)
     * @param provisioningArtifactId The identifier of the provisioning artifact. 
     */
    override fun provisioningArtifactId(provisioningArtifactId: String) {
      cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    /**
     * The self-service action identifier.
     *
     * For example, `act-fs7abcd89wxyz` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-serviceactionid)
     * @param serviceActionId The self-service action identifier. 
     */
    override fun serviceActionId(serviceActionId: String) {
      cdkBuilder.serviceActionId(serviceActionId)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceActionAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceActionAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation):
        CfnServiceActionAssociation = CfnServiceActionAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnServiceActionAssociation):
        software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation =
        wrapped.cdkObject
  }
}
