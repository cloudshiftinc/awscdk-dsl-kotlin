package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnMicrosoftTeamsChannelConfigurationProps {
  /**
   * The name of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-configurationname)
   */
  public fun configurationName(): String

  /**
   * The list of IAM policy ARNs that are applied as channel guardrails.
   *
   * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-guardrailpolicies)
   */
  public fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?: emptyList()

  /**
   * The ARN of the IAM role that defines the permissions for AWS Chatbot .
   *
   * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked role.
   * For more information, see [IAM Policies for AWS
   * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-iamrolearn)
   */
  public fun iamRoleArn(): String

  /**
   * Specifies the logging level for this configuration. This property affects the log entries
   * pushed to Amazon CloudWatch Logs.
   *
   * Logging levels include `ERROR` , `INFO` , or `NONE` .
   *
   * Default: - "NONE"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-logginglevel)
   */
  public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

  /**
   * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-snstopicarns)
   */
  public fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

  /**
   * The ID of the Microsoft Team authorized with AWS Chatbot .
   *
   * To get the team ID, you must perform the initial authorization flow with Microsoft Teams in the
   * AWS Chatbot console. Then you can copy and paste the team ID from the console. For more details,
   * see steps 1-4 in [Get started with Microsoft
   * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
   * in the *AWS Chatbot Administrator Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamid)
   */
  public fun teamId(): String

  /**
   * The id of the Microsoft Teams channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamschannelid)
   */
  public fun teamsChannelId(): String

  /**
   * The ID of the Microsoft Teams tenant.
   *
   * To get the tenant ID, you must perform the initial authorization flow with Microsoft Teams in
   * the AWS Chatbot console. Then you can copy and paste the tenant ID from the console. For more
   * details, see steps 1-4 in [Get started with Microsoft
   * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
   * in the *AWS Chatbot Administrator Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamstenantid)
   */
  public fun teamsTenantId(): String

  /**
   * Enables use of a user role requirement in your chat configuration.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-userrolerequired)
   */
  public fun userRoleRequired(): Any? = unwrap(this).getUserRoleRequired()

  /**
   * A builder for [CfnMicrosoftTeamsChannelConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationName The name of the configuration. 
     */
    public fun configurationName(configurationName: String)

    /**
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails.
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     */
    public fun guardrailPolicies(guardrailPolicies: List<String>)

    /**
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails.
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     */
    public fun guardrailPolicies(vararg guardrailPolicies: String)

    /**
     * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot . 
     * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked
     * role. For more information, see [IAM Policies for AWS
     * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * @param loggingLevel Specifies the logging level for this configuration. This property affects
     * the log entries pushed to Amazon CloudWatch Logs.
     * Logging levels include `ERROR` , `INFO` , or `NONE` .
     */
    public fun loggingLevel(loggingLevel: String)

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     */
    public fun snsTopicArns(snsTopicArns: List<String>)

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     */
    public fun snsTopicArns(vararg snsTopicArns: String)

    /**
     * @param teamId The ID of the Microsoft Team authorized with AWS Chatbot . 
     * To get the team ID, you must perform the initial authorization flow with Microsoft Teams in
     * the AWS Chatbot console. Then you can copy and paste the team ID from the console. For more
     * details, see steps 1-4 in [Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     * in the *AWS Chatbot Administrator Guide* .
     */
    public fun teamId(teamId: String)

    /**
     * @param teamsChannelId The id of the Microsoft Teams channel. 
     */
    public fun teamsChannelId(teamsChannelId: String)

    /**
     * @param teamsTenantId The ID of the Microsoft Teams tenant. 
     * To get the tenant ID, you must perform the initial authorization flow with Microsoft Teams in
     * the AWS Chatbot console. Then you can copy and paste the tenant ID from the console. For more
     * details, see steps 1-4 in [Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     * in the *AWS Chatbot Administrator Guide* .
     */
    public fun teamsTenantId(teamsTenantId: String)

    /**
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration.
     */
    public fun userRoleRequired(userRoleRequired: Boolean)

    /**
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration.
     */
    public fun userRoleRequired(userRoleRequired: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps.Builder =
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps.builder()

    /**
     * @param configurationName The name of the configuration. 
     */
    override fun configurationName(configurationName: String) {
      cdkBuilder.configurationName(configurationName)
    }

    /**
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails.
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     */
    override fun guardrailPolicies(guardrailPolicies: List<String>) {
      cdkBuilder.guardrailPolicies(guardrailPolicies)
    }

    /**
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails.
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     */
    override fun guardrailPolicies(vararg guardrailPolicies: String): Unit =
        guardrailPolicies(guardrailPolicies.toList())

    /**
     * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot . 
     * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked
     * role. For more information, see [IAM Policies for AWS
     * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * @param loggingLevel Specifies the logging level for this configuration. This property affects
     * the log entries pushed to Amazon CloudWatch Logs.
     * Logging levels include `ERROR` , `INFO` , or `NONE` .
     */
    override fun loggingLevel(loggingLevel: String) {
      cdkBuilder.loggingLevel(loggingLevel)
    }

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     */
    override fun snsTopicArns(snsTopicArns: List<String>) {
      cdkBuilder.snsTopicArns(snsTopicArns)
    }

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     */
    override fun snsTopicArns(vararg snsTopicArns: String): Unit =
        snsTopicArns(snsTopicArns.toList())

    /**
     * @param teamId The ID of the Microsoft Team authorized with AWS Chatbot . 
     * To get the team ID, you must perform the initial authorization flow with Microsoft Teams in
     * the AWS Chatbot console. Then you can copy and paste the team ID from the console. For more
     * details, see steps 1-4 in [Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     * in the *AWS Chatbot Administrator Guide* .
     */
    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    /**
     * @param teamsChannelId The id of the Microsoft Teams channel. 
     */
    override fun teamsChannelId(teamsChannelId: String) {
      cdkBuilder.teamsChannelId(teamsChannelId)
    }

    /**
     * @param teamsTenantId The ID of the Microsoft Teams tenant. 
     * To get the tenant ID, you must perform the initial authorization flow with Microsoft Teams in
     * the AWS Chatbot console. Then you can copy and paste the tenant ID from the console. For more
     * details, see steps 1-4 in [Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     * in the *AWS Chatbot Administrator Guide* .
     */
    override fun teamsTenantId(teamsTenantId: String) {
      cdkBuilder.teamsTenantId(teamsTenantId)
    }

    /**
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration.
     */
    override fun userRoleRequired(userRoleRequired: Boolean) {
      cdkBuilder.userRoleRequired(userRoleRequired)
    }

    /**
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration.
     */
    override fun userRoleRequired(userRoleRequired: IResolvable) {
      cdkBuilder.userRoleRequired(userRoleRequired.let(IResolvable::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps,
  ) : CdkObject(cdkObject), CfnMicrosoftTeamsChannelConfigurationProps {
    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-configurationname)
     */
    override fun configurationName(): String = unwrap(this).getConfigurationName()

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-guardrailpolicies)
     */
    override fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?:
        emptyList()

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot .
     *
     * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked
     * role. For more information, see [IAM Policies for AWS
     * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-iamrolearn)
     */
    override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

    /**
     * Specifies the logging level for this configuration. This property affects the log entries
     * pushed to Amazon CloudWatch Logs.
     *
     * Logging levels include `ERROR` , `INFO` , or `NONE` .
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-logginglevel)
     */
    override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-snstopicarns)
     */
    override fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

    /**
     * The ID of the Microsoft Team authorized with AWS Chatbot .
     *
     * To get the team ID, you must perform the initial authorization flow with Microsoft Teams in
     * the AWS Chatbot console. Then you can copy and paste the team ID from the console. For more
     * details, see steps 1-4 in [Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     * in the *AWS Chatbot Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamid)
     */
    override fun teamId(): String = unwrap(this).getTeamId()

    /**
     * The id of the Microsoft Teams channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamschannelid)
     */
    override fun teamsChannelId(): String = unwrap(this).getTeamsChannelId()

    /**
     * The ID of the Microsoft Teams tenant.
     *
     * To get the tenant ID, you must perform the initial authorization flow with Microsoft Teams in
     * the AWS Chatbot console. Then you can copy and paste the tenant ID from the console. For more
     * details, see steps 1-4 in [Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
     * in the *AWS Chatbot Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamstenantid)
     */
    override fun teamsTenantId(): String = unwrap(this).getTeamsTenantId()

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-userrolerequired)
     */
    override fun userRoleRequired(): Any? = unwrap(this).getUserRoleRequired()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnMicrosoftTeamsChannelConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps):
        CfnMicrosoftTeamsChannelConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMicrosoftTeamsChannelConfigurationProps):
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps
  }
}
