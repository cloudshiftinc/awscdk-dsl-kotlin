package io.cloudshiftdev.awscdk.services.detective

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnMemberInvitationProps {
  /**
   * Whether to send an invitation email to the member account.
   *
   * If set to true, the member account does not receive an invitation email.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-disableemailnotification)
   */
  public fun disableEmailNotification(): Any? = unwrap(this).getDisableEmailNotification()

  /**
   * The ARN of the behavior graph to invite the account to contribute data to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-grapharn)
   */
  public fun graphArn(): String

  /**
   * The root user email address of the invited account.
   *
   * If the email address provided is not the root user email address for the provided account, the
   * invitation creation fails.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberemailaddress)
   */
  public fun memberEmailAddress(): String

  /**
   * The AWS account identifier of the invited account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberid)
   */
  public fun memberId(): String

  /**
   * Customized text to include in the invitation email message.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-message)
   */
  public fun message(): String? = unwrap(this).getMessage()

  /**
   * A builder for [CfnMemberInvitationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param disableEmailNotification Whether to send an invitation email to the member account.
     * If set to true, the member account does not receive an invitation email.
     */
    public fun disableEmailNotification(disableEmailNotification: Boolean)

    /**
     * @param disableEmailNotification Whether to send an invitation email to the member account.
     * If set to true, the member account does not receive an invitation email.
     */
    public fun disableEmailNotification(disableEmailNotification: IResolvable)

    /**
     * @param graphArn The ARN of the behavior graph to invite the account to contribute data to. 
     */
    public fun graphArn(graphArn: String)

    /**
     * @param memberEmailAddress The root user email address of the invited account. 
     * If the email address provided is not the root user email address for the provided account,
     * the invitation creation fails.
     */
    public fun memberEmailAddress(memberEmailAddress: String)

    /**
     * @param memberId The AWS account identifier of the invited account. 
     */
    public fun memberId(memberId: String)

    /**
     * @param message Customized text to include in the invitation email message.
     */
    public fun message(message: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.detective.CfnMemberInvitationProps.Builder =
        software.amazon.awscdk.services.detective.CfnMemberInvitationProps.builder()

    /**
     * @param disableEmailNotification Whether to send an invitation email to the member account.
     * If set to true, the member account does not receive an invitation email.
     */
    override fun disableEmailNotification(disableEmailNotification: Boolean) {
      cdkBuilder.disableEmailNotification(disableEmailNotification)
    }

    /**
     * @param disableEmailNotification Whether to send an invitation email to the member account.
     * If set to true, the member account does not receive an invitation email.
     */
    override fun disableEmailNotification(disableEmailNotification: IResolvable) {
      cdkBuilder.disableEmailNotification(disableEmailNotification.let(IResolvable::unwrap))
    }

    /**
     * @param graphArn The ARN of the behavior graph to invite the account to contribute data to. 
     */
    override fun graphArn(graphArn: String) {
      cdkBuilder.graphArn(graphArn)
    }

    /**
     * @param memberEmailAddress The root user email address of the invited account. 
     * If the email address provided is not the root user email address for the provided account,
     * the invitation creation fails.
     */
    override fun memberEmailAddress(memberEmailAddress: String) {
      cdkBuilder.memberEmailAddress(memberEmailAddress)
    }

    /**
     * @param memberId The AWS account identifier of the invited account. 
     */
    override fun memberId(memberId: String) {
      cdkBuilder.memberId(memberId)
    }

    /**
     * @param message Customized text to include in the invitation email message.
     */
    override fun message(message: String) {
      cdkBuilder.message(message)
    }

    public fun build(): software.amazon.awscdk.services.detective.CfnMemberInvitationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.detective.CfnMemberInvitationProps,
  ) : CdkObject(cdkObject), CfnMemberInvitationProps {
    /**
     * Whether to send an invitation email to the member account.
     *
     * If set to true, the member account does not receive an invitation email.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-disableemailnotification)
     */
    override fun disableEmailNotification(): Any? = unwrap(this).getDisableEmailNotification()

    /**
     * The ARN of the behavior graph to invite the account to contribute data to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-grapharn)
     */
    override fun graphArn(): String = unwrap(this).getGraphArn()

    /**
     * The root user email address of the invited account.
     *
     * If the email address provided is not the root user email address for the provided account,
     * the invitation creation fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberemailaddress)
     */
    override fun memberEmailAddress(): String = unwrap(this).getMemberEmailAddress()

    /**
     * The AWS account identifier of the invited account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberid)
     */
    override fun memberId(): String = unwrap(this).getMemberId()

    /**
     * Customized text to include in the invitation email message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-message)
     */
    override fun message(): String? = unwrap(this).getMessage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMemberInvitationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.detective.CfnMemberInvitationProps):
        CfnMemberInvitationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMemberInvitationProps):
        software.amazon.awscdk.services.detective.CfnMemberInvitationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.detective.CfnMemberInvitationProps
  }
}
