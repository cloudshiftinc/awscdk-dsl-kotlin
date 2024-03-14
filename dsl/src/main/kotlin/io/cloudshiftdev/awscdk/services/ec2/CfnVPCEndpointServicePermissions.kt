package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCEndpointServicePermissions internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
   * AWS accounts ).
   */
  public open fun allowedPrincipals(): List<String> = unwrap(this).getAllowedPrincipals() ?:
      emptyList()

  /**
   * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
   * AWS accounts ).
   */
  public open fun allowedPrincipals(`value`: List<String>) {
    unwrap(this).setAllowedPrincipals(`value`)
  }

  /**
   * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
   * AWS accounts ).
   */
  public open fun allowedPrincipals(vararg `value`: String): Unit =
      allowedPrincipals(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the service.
   */
  public open fun serviceId(): String = unwrap(this).getServiceId()

  /**
   * The ID of the service.
   */
  public open fun serviceId(`value`: String) {
    unwrap(this).setServiceId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPCEndpointServicePermissions].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
     * AWS accounts ).
     *
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
     * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
     * example, users, IAM roles, and AWS accounts ). 
     */
    public fun allowedPrincipals(allowedPrincipals: List<String>)

    /**
     * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
     * AWS accounts ).
     *
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
     * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
     * example, users, IAM roles, and AWS accounts ). 
     */
    public fun allowedPrincipals(vararg allowedPrincipals: String)

    /**
     * The ID of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid)
     * @param serviceId The ID of the service. 
     */
    public fun serviceId(serviceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions.Builder.create(scope,
        id)

    /**
     * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
     * AWS accounts ).
     *
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
     * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
     * example, users, IAM roles, and AWS accounts ). 
     */
    override fun allowedPrincipals(allowedPrincipals: List<String>) {
      cdkBuilder.allowedPrincipals(allowedPrincipals)
    }

    /**
     * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
     * AWS accounts ).
     *
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
     * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
     * example, users, IAM roles, and AWS accounts ). 
     */
    override fun allowedPrincipals(vararg allowedPrincipals: String): Unit =
        allowedPrincipals(allowedPrincipals.toList())

    /**
     * The ID of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid)
     * @param serviceId The ID of the service. 
     */
    override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCEndpointServicePermissions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCEndpointServicePermissions(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions):
        CfnVPCEndpointServicePermissions = CfnVPCEndpointServicePermissions(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointServicePermissions):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions = wrapped.cdkObject
  }
}
