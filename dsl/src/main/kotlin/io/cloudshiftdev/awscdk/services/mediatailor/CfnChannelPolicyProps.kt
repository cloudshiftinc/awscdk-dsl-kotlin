package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnChannelPolicyProps {
  /**
   * The name of the channel associated with this Channel Policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html#cfn-mediatailor-channelpolicy-channelname)
   */
  public fun channelName(): String

  /**
   * The IAM policy for the channel.
   *
   * IAM policies are used to control access to your channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html#cfn-mediatailor-channelpolicy-policy)
   */
  public fun policy(): Any

  /**
   * A builder for [CfnChannelPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelName The name of the channel associated with this Channel Policy. 
     */
    public fun channelName(channelName: String)

    /**
     * @param policy The IAM policy for the channel. 
     * IAM policies are used to control access to your channel.
     */
    public fun policy(policy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediatailor.CfnChannelPolicyProps.Builder =
        software.amazon.awscdk.services.mediatailor.CfnChannelPolicyProps.builder()

    /**
     * @param channelName The name of the channel associated with this Channel Policy. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * @param policy The IAM policy for the channel. 
     * IAM policies are used to control access to your channel.
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnChannelPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannelPolicyProps,
  ) : CdkObject(cdkObject), CfnChannelPolicyProps {
    /**
     * The name of the channel associated with this Channel Policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html#cfn-mediatailor-channelpolicy-channelname)
     */
    override fun channelName(): String = unwrap(this).getChannelName()

    /**
     * The IAM policy for the channel.
     *
     * IAM policies are used to control access to your channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html#cfn-mediatailor-channelpolicy-policy)
     */
    override fun policy(): Any = unwrap(this).getPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannelPolicyProps):
        CfnChannelPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelPolicyProps):
        software.amazon.awscdk.services.mediatailor.CfnChannelPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediatailor.CfnChannelPolicyProps
  }
}
