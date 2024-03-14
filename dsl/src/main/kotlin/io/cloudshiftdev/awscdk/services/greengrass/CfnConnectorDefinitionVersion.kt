package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnectorDefinitionVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the connector definition associated with this version.
   */
  public open fun connectorDefinitionId(): String = unwrap(this).getConnectorDefinitionId()

  /**
   * The ID of the connector definition associated with this version.
   */
  public open fun connectorDefinitionId(`value`: String) {
    unwrap(this).setConnectorDefinitionId(`value`)
  }

  /**
   * The connectors in this version.
   */
  public open fun connectors(): Any = unwrap(this).getConnectors()

  /**
   * The connectors in this version.
   */
  public open fun connectors(`value`: IResolvable) {
    unwrap(this).setConnectors(`value`.let(IResolvable::unwrap))
  }

  /**
   * The connectors in this version.
   */
  public open fun connectors(__idx_ac66f0: List<Any>) {
    unwrap(this).setConnectors(__idx_ac66f0)
  }

  /**
   * The connectors in this version.
   */
  public open fun connectors(vararg __idx_ac66f0: Any): Unit = connectors(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.greengrass.CfnConnectorDefinitionVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the connector definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectordefinitionid)
     * @param connectorDefinitionId The ID of the connector definition associated with this version.
     * 
     */
    public fun connectorDefinitionId(connectorDefinitionId: String)

    /**
     * The connectors in this version.
     *
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
     * @param connectors The connectors in this version. 
     */
    public fun connectors(connectors: IResolvable)

    /**
     * The connectors in this version.
     *
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
     * @param connectors The connectors in this version. 
     */
    public fun connectors(connectors: List<Any>)

    /**
     * The connectors in this version.
     *
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
     * @param connectors The connectors in this version. 
     */
    public fun connectors(vararg connectors: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.Builder.create(scope,
        id)

    /**
     * The ID of the connector definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectordefinitionid)
     * @param connectorDefinitionId The ID of the connector definition associated with this version.
     * 
     */
    override fun connectorDefinitionId(connectorDefinitionId: String) {
      cdkBuilder.connectorDefinitionId(connectorDefinitionId)
    }

    /**
     * The connectors in this version.
     *
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
     * @param connectors The connectors in this version. 
     */
    override fun connectors(connectors: IResolvable) {
      cdkBuilder.connectors(connectors.let(IResolvable::unwrap))
    }

    /**
     * The connectors in this version.
     *
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
     * @param connectors The connectors in this version. 
     */
    override fun connectors(connectors: List<Any>) {
      cdkBuilder.connectors(connectors)
    }

    /**
     * The connectors in this version.
     *
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
     * @param connectors The connectors in this version. 
     */
    override fun connectors(vararg connectors: Any): Unit = connectors(connectors.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnectorDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnectorDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion):
        CfnConnectorDefinitionVersion = CfnConnectorDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion = wrapped.cdkObject
  }

  public interface ConnectorProperty {
    /**
     * The Amazon Resource Name (ARN) of the connector.
     *
     * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
     * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinitionversion-connector.html#cfn-greengrass-connectordefinitionversion-connector-connectorarn)
     */
    public fun connectorArn(): String

    /**
     * A descriptive or arbitrary ID for the connector.
     *
     * This value must be unique within the connector definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinitionversion-connector.html#cfn-greengrass-connectordefinitionversion-connector-id)
     */
    public fun id(): String

    /**
     * The parameters or configuration that the connector uses.
     *
     * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
     * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinitionversion-connector.html#cfn-greengrass-connectordefinitionversion-connector-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A builder for [ConnectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectorArn The Amazon Resource Name (ARN) of the connector. 
       * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
       * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
       */
      public fun connectorArn(connectorArn: String)

      /**
       * @param id A descriptive or arbitrary ID for the connector. 
       * This value must be unique within the connector definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      public fun id(id: String)

      /**
       * @param parameters The parameters or configuration that the connector uses.
       * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
       * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
       */
      public fun parameters(parameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty.builder()

      /**
       * @param connectorArn The Amazon Resource Name (ARN) of the connector. 
       * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
       * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
       */
      override fun connectorArn(connectorArn: String) {
        cdkBuilder.connectorArn(connectorArn)
      }

      /**
       * @param id A descriptive or arbitrary ID for the connector. 
       * This value must be unique within the connector definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param parameters The parameters or configuration that the connector uses.
       * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
       * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
       */
      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty,
    ) : CdkObject(cdkObject), ConnectorProperty {
      /**
       * The Amazon Resource Name (ARN) of the connector.
       *
       * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
       * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinitionversion-connector.html#cfn-greengrass-connectordefinitionversion-connector-connectorarn)
       */
      override fun connectorArn(): String = unwrap(this).getConnectorArn()

      /**
       * A descriptive or arbitrary ID for the connector.
       *
       * This value must be unique within the connector definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinitionversion-connector.html#cfn-greengrass-connectordefinitionversion-connector-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The parameters or configuration that the connector uses.
       *
       * For more information about connectors provided by AWS , see [Greengrass Connectors Provided
       * by AWS](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors-list.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinitionversion-connector.html#cfn-greengrass-connectordefinitionversion-connector-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty):
          ConnectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorProperty):
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty
    }
  }
}
