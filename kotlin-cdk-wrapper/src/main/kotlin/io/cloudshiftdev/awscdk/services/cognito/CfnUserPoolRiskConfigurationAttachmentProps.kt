@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUserPoolRiskConfigurationAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolRiskConfigurationAttachmentProps cfnUserPoolRiskConfigurationAttachmentProps =
 * CfnUserPoolRiskConfigurationAttachmentProps.builder()
 * .clientId("clientId")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .accountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationTypeProperty.builder()
 * .actions(AccountTakeoverActionsTypeProperty.builder()
 * .highAction(AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build())
 * .lowAction(AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build())
 * .mediumAction(AccountTakeoverActionTypeProperty.builder()
 * .eventAction("eventAction")
 * .notify(false)
 * .build())
 * .build())
 * // the properties below are optional
 * .notifyConfiguration(NotifyConfigurationTypeProperty.builder()
 * .sourceArn("sourceArn")
 * // the properties below are optional
 * .blockEmail(NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build())
 * .from("from")
 * .mfaEmail(NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build())
 * .noActionEmail(NotifyEmailTypeProperty.builder()
 * .subject("subject")
 * // the properties below are optional
 * .htmlBody("htmlBody")
 * .textBody("textBody")
 * .build())
 * .replyTo("replyTo")
 * .build())
 * .build())
 * .compromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationTypeProperty.builder()
 * .actions(CompromisedCredentialsActionsTypeProperty.builder()
 * .eventAction("eventAction")
 * .build())
 * // the properties below are optional
 * .eventFilter(List.of("eventFilter"))
 * .build())
 * .riskExceptionConfiguration(RiskExceptionConfigurationTypeProperty.builder()
 * .blockedIpRangeList(List.of("blockedIpRangeList"))
 * .skippedIpRangeList(List.of("skippedIpRangeList"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html)
 */
public interface CfnUserPoolRiskConfigurationAttachmentProps {
  /**
   * The account takeover risk configuration object, including the `NotifyConfiguration` object and
   * `Actions` to take if there is an account takeover.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
   */
  public fun accountTakeoverRiskConfiguration(): Any? =
      unwrap(this).getAccountTakeoverRiskConfiguration()

  /**
   * The app client ID.
   *
   * You can specify the risk configuration for a single client (with a specific ClientId) or for
   * all clients (by setting the ClientId to `ALL` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid)
   */
  public fun clientId(): String

  /**
   * The compromised credentials risk configuration object, including the `EventFilter` and the
   * `EventAction` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
   */
  public fun compromisedCredentialsRiskConfiguration(): Any? =
      unwrap(this).getCompromisedCredentialsRiskConfiguration()

  /**
   * The configuration to override the risk decision.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
   */
  public fun riskExceptionConfiguration(): Any? = unwrap(this).getRiskExceptionConfiguration()

  /**
   * The user pool ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid)
   */
  public fun userPoolId(): String

  /**
   * A builder for [CfnUserPoolRiskConfigurationAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     * including the `NotifyConfiguration` object and `Actions` to take if there is an account
     * takeover.
     */
    public fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable)

    /**
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     * including the `NotifyConfiguration` object and `Actions` to take if there is an account
     * takeover.
     */
    public
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty)

    /**
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     * including the `NotifyConfiguration` object and `Actions` to take if there is an account
     * takeover.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb271e35416f61b857614270b74ca98b3886d0741f2eff8f638aedbce2ef7ca0")
    public
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * @param clientId The app client ID. 
     * You can specify the risk configuration for a single client (with a specific ClientId) or for
     * all clients (by setting the ClientId to `ALL` ).
     */
    public fun clientId(clientId: String)

    /**
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     * object, including the `EventFilter` and the `EventAction` .
     */
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable)

    /**
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     * object, including the `EventFilter` and the `EventAction` .
     */
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty)

    /**
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     * object, including the `EventFilter` and the `EventAction` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("683ec85a0d5c3a7ccd5caf628278c5d85261b1299fa29aa29cf168b975643e5b")
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * @param riskExceptionConfiguration The configuration to override the risk decision.
     */
    public fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable)

    /**
     * @param riskExceptionConfiguration The configuration to override the risk decision.
     */
    public
        fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty)

    /**
     * @param riskExceptionConfiguration The configuration to override the risk decision.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccd370c772a07343b844afc5a971eacca678c609610d5e9cc698a2638888c52e")
    public
        fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder.() -> Unit)

    /**
     * @param userPoolId The user pool ID. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps.Builder
        =
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps.builder()

    /**
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     * including the `NotifyConfiguration` object and `Actions` to take if there is an account
     * takeover.
     */
    override fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable) {
      cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     * including the `NotifyConfiguration` object and `Actions` to take if there is an account
     * takeover.
     */
    override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty) {
      cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.let(CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty::unwrap))
    }

    /**
     * @param accountTakeoverRiskConfiguration The account takeover risk configuration object,
     * including the `NotifyConfiguration` object and `Actions` to take if there is an account
     * takeover.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb271e35416f61b857614270b74ca98b3886d0741f2eff8f638aedbce2ef7ca0")
    override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        accountTakeoverRiskConfiguration(CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty(accountTakeoverRiskConfiguration))

    /**
     * @param clientId The app client ID. 
     * You can specify the risk configuration for a single client (with a specific ClientId) or for
     * all clients (by setting the ClientId to `ALL` ).
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     * object, including the `EventFilter` and the `EventAction` .
     */
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable) {
      cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     * object, including the `EventFilter` and the `EventAction` .
     */
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty) {
      cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.let(CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty::unwrap))
    }

    /**
     * @param compromisedCredentialsRiskConfiguration The compromised credentials risk configuration
     * object, including the `EventFilter` and the `EventAction` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("683ec85a0d5c3a7ccd5caf628278c5d85261b1299fa29aa29cf168b975643e5b")
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        compromisedCredentialsRiskConfiguration(CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty(compromisedCredentialsRiskConfiguration))

    /**
     * @param riskExceptionConfiguration The configuration to override the risk decision.
     */
    override fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable) {
      cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param riskExceptionConfiguration The configuration to override the risk decision.
     */
    override
        fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty) {
      cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration.let(CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty::unwrap))
    }

    /**
     * @param riskExceptionConfiguration The configuration to override the risk decision.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccd370c772a07343b844afc5a971eacca678c609610d5e9cc698a2638888c52e")
    override
        fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        riskExceptionConfiguration(CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty(riskExceptionConfiguration))

    /**
     * @param userPoolId The user pool ID. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps,
  ) : CdkObject(cdkObject), CfnUserPoolRiskConfigurationAttachmentProps {
    /**
     * The account takeover risk configuration object, including the `NotifyConfiguration` object
     * and `Actions` to take if there is an account takeover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfiguration)
     */
    override fun accountTakeoverRiskConfiguration(): Any? =
        unwrap(this).getAccountTakeoverRiskConfiguration()

    /**
     * The app client ID.
     *
     * You can specify the risk configuration for a single client (with a specific ClientId) or for
     * all clients (by setting the ClientId to `ALL` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid)
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * The compromised credentials risk configuration object, including the `EventFilter` and the
     * `EventAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfiguration)
     */
    override fun compromisedCredentialsRiskConfiguration(): Any? =
        unwrap(this).getCompromisedCredentialsRiskConfiguration()

    /**
     * The configuration to override the risk decision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfiguration)
     */
    override fun riskExceptionConfiguration(): Any? = unwrap(this).getRiskExceptionConfiguration()

    /**
     * The user pool ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnUserPoolRiskConfigurationAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps):
        CfnUserPoolRiskConfigurationAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnUserPoolRiskConfigurationAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolRiskConfigurationAttachmentProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps
  }
}
