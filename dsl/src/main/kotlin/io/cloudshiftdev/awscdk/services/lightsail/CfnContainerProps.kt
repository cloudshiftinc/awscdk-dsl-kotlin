package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnContainerProps {
  /**
   * An object that describes the current container deployment of the container service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-containerservicedeployment)
   */
  public fun containerServiceDeployment(): Any? = unwrap(this).getContainerServiceDeployment()

  /**
   * A Boolean value indicating whether the container service is disabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-isdisabled)
   */
  public fun isDisabled(): Any? = unwrap(this).getIsDisabled()

  /**
   * The power specification of the container service.
   *
   * The power specifies the amount of RAM, the number of vCPUs, and the base price of the container
   * service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-power)
   */
  public fun power(): String

  /**
   * An object that describes the configuration for the container service to access private
   * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
   * repositories.
   *
   * For more information, see [Configuring access to an Amazon ECR private repository for an Amazon
   * Lightsail container
   * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
   * in the *Amazon Lightsail Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-privateregistryaccess)
   */
  public fun privateRegistryAccess(): Any? = unwrap(this).getPrivateRegistryAccess()

  /**
   * The public domain name of the container service, such as `example.com` and `www.example.com` .
   *
   * You can specify up to four public domain names for a container service. The domain names that
   * you specify are used when you create a deployment with a container that is configured as the
   * public endpoint of your container service.
   *
   * If you don't specify public domain names, then you can use the default domain of the container
   * service.
   *
   *
   * You must create and validate an SSL/TLS certificate before you can use public domain names with
   * your container service. Use the
   * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
   * resource to create a certificate for the public domain names that you want to use with your
   * container service.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-publicdomainnames)
   */
  public fun publicDomainNames(): Any? = unwrap(this).getPublicDomainNames()

  /**
   * The scale specification of the container service.
   *
   * The scale specifies the allocated compute nodes of the container service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-scale)
   */
  public fun scale(): Number

  /**
   * The name of the container service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-servicename)
   */
  public fun serviceName(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnContainerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerServiceDeployment An object that describes the current container deployment
     * of the container service.
     */
    public fun containerServiceDeployment(containerServiceDeployment: IResolvable)

    /**
     * @param containerServiceDeployment An object that describes the current container deployment
     * of the container service.
     */
    public
        fun containerServiceDeployment(containerServiceDeployment: CfnContainer.ContainerServiceDeploymentProperty)

    /**
     * @param containerServiceDeployment An object that describes the current container deployment
     * of the container service.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91ca67103c12a77b2f2c25432b2d80f9096d5f86be295bfd0e52280f2f471f81")
    public
        fun containerServiceDeployment(containerServiceDeployment: CfnContainer.ContainerServiceDeploymentProperty.Builder.() -> Unit)

    /**
     * @param isDisabled A Boolean value indicating whether the container service is disabled.
     */
    public fun isDisabled(isDisabled: Boolean)

    /**
     * @param isDisabled A Boolean value indicating whether the container service is disabled.
     */
    public fun isDisabled(isDisabled: IResolvable)

    /**
     * @param power The power specification of the container service. 
     * The power specifies the amount of RAM, the number of vCPUs, and the base price of the
     * container service.
     */
    public fun power(power: String)

    /**
     * @param privateRegistryAccess An object that describes the configuration for the container
     * service to access private container image repositories, such as Amazon Elastic Container
     * Registry ( Amazon ECR ) private repositories.
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     */
    public fun privateRegistryAccess(privateRegistryAccess: IResolvable)

    /**
     * @param privateRegistryAccess An object that describes the configuration for the container
     * service to access private container image repositories, such as Amazon Elastic Container
     * Registry ( Amazon ECR ) private repositories.
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     */
    public
        fun privateRegistryAccess(privateRegistryAccess: CfnContainer.PrivateRegistryAccessProperty)

    /**
     * @param privateRegistryAccess An object that describes the configuration for the container
     * service to access private container image repositories, such as Amazon Elastic Container
     * Registry ( Amazon ECR ) private repositories.
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1301d17790c71cca6a31e23f98562d69e5e0f8a6cab46abe849201a3569c8be6")
    public
        fun privateRegistryAccess(privateRegistryAccess: CfnContainer.PrivateRegistryAccessProperty.Builder.() -> Unit)

    /**
     * @param publicDomainNames The public domain name of the container service, such as
     * `example.com` and `www.example.com` .
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     */
    public fun publicDomainNames(publicDomainNames: IResolvable)

    /**
     * @param publicDomainNames The public domain name of the container service, such as
     * `example.com` and `www.example.com` .
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     */
    public fun publicDomainNames(publicDomainNames: List<Any>)

    /**
     * @param publicDomainNames The public domain name of the container service, such as
     * `example.com` and `www.example.com` .
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     */
    public fun publicDomainNames(vararg publicDomainNames: Any)

    /**
     * @param scale The scale specification of the container service. 
     * The scale specifies the allocated compute nodes of the container service.
     */
    public fun scale(scale: Number)

    /**
     * @param serviceName The name of the container service. 
     */
    public fun serviceName(serviceName: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnContainerProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnContainerProps.builder()

    /**
     * @param containerServiceDeployment An object that describes the current container deployment
     * of the container service.
     */
    override fun containerServiceDeployment(containerServiceDeployment: IResolvable) {
      cdkBuilder.containerServiceDeployment(containerServiceDeployment.let(IResolvable::unwrap))
    }

    /**
     * @param containerServiceDeployment An object that describes the current container deployment
     * of the container service.
     */
    override
        fun containerServiceDeployment(containerServiceDeployment: CfnContainer.ContainerServiceDeploymentProperty) {
      cdkBuilder.containerServiceDeployment(containerServiceDeployment.let(CfnContainer.ContainerServiceDeploymentProperty::unwrap))
    }

    /**
     * @param containerServiceDeployment An object that describes the current container deployment
     * of the container service.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91ca67103c12a77b2f2c25432b2d80f9096d5f86be295bfd0e52280f2f471f81")
    override
        fun containerServiceDeployment(containerServiceDeployment: CfnContainer.ContainerServiceDeploymentProperty.Builder.() -> Unit):
        Unit =
        containerServiceDeployment(CfnContainer.ContainerServiceDeploymentProperty(containerServiceDeployment))

    /**
     * @param isDisabled A Boolean value indicating whether the container service is disabled.
     */
    override fun isDisabled(isDisabled: Boolean) {
      cdkBuilder.isDisabled(isDisabled)
    }

    /**
     * @param isDisabled A Boolean value indicating whether the container service is disabled.
     */
    override fun isDisabled(isDisabled: IResolvable) {
      cdkBuilder.isDisabled(isDisabled.let(IResolvable::unwrap))
    }

    /**
     * @param power The power specification of the container service. 
     * The power specifies the amount of RAM, the number of vCPUs, and the base price of the
     * container service.
     */
    override fun power(power: String) {
      cdkBuilder.power(power)
    }

    /**
     * @param privateRegistryAccess An object that describes the configuration for the container
     * service to access private container image repositories, such as Amazon Elastic Container
     * Registry ( Amazon ECR ) private repositories.
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     */
    override fun privateRegistryAccess(privateRegistryAccess: IResolvable) {
      cdkBuilder.privateRegistryAccess(privateRegistryAccess.let(IResolvable::unwrap))
    }

    /**
     * @param privateRegistryAccess An object that describes the configuration for the container
     * service to access private container image repositories, such as Amazon Elastic Container
     * Registry ( Amazon ECR ) private repositories.
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     */
    override
        fun privateRegistryAccess(privateRegistryAccess: CfnContainer.PrivateRegistryAccessProperty) {
      cdkBuilder.privateRegistryAccess(privateRegistryAccess.let(CfnContainer.PrivateRegistryAccessProperty::unwrap))
    }

    /**
     * @param privateRegistryAccess An object that describes the configuration for the container
     * service to access private container image repositories, such as Amazon Elastic Container
     * Registry ( Amazon ECR ) private repositories.
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1301d17790c71cca6a31e23f98562d69e5e0f8a6cab46abe849201a3569c8be6")
    override
        fun privateRegistryAccess(privateRegistryAccess: CfnContainer.PrivateRegistryAccessProperty.Builder.() -> Unit):
        Unit =
        privateRegistryAccess(CfnContainer.PrivateRegistryAccessProperty(privateRegistryAccess))

    /**
     * @param publicDomainNames The public domain name of the container service, such as
     * `example.com` and `www.example.com` .
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     */
    override fun publicDomainNames(publicDomainNames: IResolvable) {
      cdkBuilder.publicDomainNames(publicDomainNames.let(IResolvable::unwrap))
    }

    /**
     * @param publicDomainNames The public domain name of the container service, such as
     * `example.com` and `www.example.com` .
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     */
    override fun publicDomainNames(publicDomainNames: List<Any>) {
      cdkBuilder.publicDomainNames(publicDomainNames)
    }

    /**
     * @param publicDomainNames The public domain name of the container service, such as
     * `example.com` and `www.example.com` .
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     */
    override fun publicDomainNames(vararg publicDomainNames: Any): Unit =
        publicDomainNames(publicDomainNames.toList())

    /**
     * @param scale The scale specification of the container service. 
     * The scale specifies the allocated compute nodes of the container service.
     */
    override fun scale(scale: Number) {
      cdkBuilder.scale(scale)
    }

    /**
     * @param serviceName The name of the container service. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnContainerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnContainerProps,
  ) : CdkObject(cdkObject), CfnContainerProps {
    /**
     * An object that describes the current container deployment of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-containerservicedeployment)
     */
    override fun containerServiceDeployment(): Any? = unwrap(this).getContainerServiceDeployment()

    /**
     * A Boolean value indicating whether the container service is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-isdisabled)
     */
    override fun isDisabled(): Any? = unwrap(this).getIsDisabled()

    /**
     * The power specification of the container service.
     *
     * The power specifies the amount of RAM, the number of vCPUs, and the base price of the
     * container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-power)
     */
    override fun power(): String = unwrap(this).getPower()

    /**
     * An object that describes the configuration for the container service to access private
     * container image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
     * repositories.
     *
     * For more information, see [Configuring access to an Amazon ECR private repository for an
     * Amazon Lightsail container
     * service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
     * in the *Amazon Lightsail Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-privateregistryaccess)
     */
    override fun privateRegistryAccess(): Any? = unwrap(this).getPrivateRegistryAccess()

    /**
     * The public domain name of the container service, such as `example.com` and `www.example.com`
     * .
     *
     * You can specify up to four public domain names for a container service. The domain names that
     * you specify are used when you create a deployment with a container that is configured as the
     * public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-publicdomainnames)
     */
    override fun publicDomainNames(): Any? = unwrap(this).getPublicDomainNames()

    /**
     * The scale specification of the container service.
     *
     * The scale specifies the allocated compute nodes of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-scale)
     */
    override fun scale(): Number = unwrap(this).getScale()

    /**
     * The name of the container service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-servicename)
     */
    override fun serviceName(): String = unwrap(this).getServiceName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html#cfn-lightsail-container-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContainerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnContainerProps):
        CfnContainerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContainerProps):
        software.amazon.awscdk.services.lightsail.CfnContainerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnContainerProps
  }
}
