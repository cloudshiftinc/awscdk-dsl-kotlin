package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnResourcePolicyProps {
  /**
   * The Amazon Resource Name (ARN) of the service network or service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcepolicy.html#cfn-vpclattice-resourcepolicy-policy)
   */
  public fun policy(): Any

  /**
   * An IAM policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcepolicy.html#cfn-vpclattice-resourcepolicy-resourcearn)
   */
  public fun resourceArn(): String

  /**
   * A builder for [CfnResourcePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policy The Amazon Resource Name (ARN) of the service network or service. 
     */
    public fun policy(policy: Any)

    /**
     * @param resourceArn An IAM policy. 
     */
    public fun resourceArn(resourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnResourcePolicyProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnResourcePolicyProps.builder()

    /**
     * @param policy The Amazon Resource Name (ARN) of the service network or service. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param resourceArn An IAM policy. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourcePolicyProps,
  ) : CdkObject(cdkObject), CfnResourcePolicyProps {
    /**
     * The Amazon Resource Name (ARN) of the service network or service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcepolicy.html#cfn-vpclattice-resourcepolicy-policy)
     */
    override fun policy(): Any = unwrap(this).getPolicy()

    /**
     * An IAM policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcepolicy.html#cfn-vpclattice-resourcepolicy-resourcearn)
     */
    override fun resourceArn(): String = unwrap(this).getResourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourcePolicyProps):
        CfnResourcePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicyProps):
        software.amazon.awscdk.services.vpclattice.CfnResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnResourcePolicyProps
  }
}
