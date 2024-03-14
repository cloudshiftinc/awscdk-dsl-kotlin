package io.cloudshiftdev.awscdk.services.eventschemas

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnRegistryPolicyProps {
  /**
   * A resource-based policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-policy)
   */
  public fun policy(): Any

  /**
   * The name of the registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-registryname)
   */
  public fun registryName(): String

  /**
   * The revision ID of the policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-revisionid)
   */
  public fun revisionId(): String? = unwrap(this).getRevisionId()

  /**
   * A builder for [CfnRegistryPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policy A resource-based policy. 
     */
    public fun policy(policy: Any)

    /**
     * @param registryName The name of the registry. 
     */
    public fun registryName(registryName: String)

    /**
     * @param revisionId The revision ID of the policy.
     */
    public fun revisionId(revisionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps.Builder =
        software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps.builder()

    /**
     * @param policy A resource-based policy. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param registryName The name of the registry. 
     */
    override fun registryName(registryName: String) {
      cdkBuilder.registryName(registryName)
    }

    /**
     * @param revisionId The revision ID of the policy.
     */
    override fun revisionId(revisionId: String) {
      cdkBuilder.revisionId(revisionId)
    }

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps,
  ) : CdkObject(cdkObject), CfnRegistryPolicyProps {
    /**
     * A resource-based policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-policy)
     */
    override fun policy(): Any = unwrap(this).getPolicy()

    /**
     * The name of the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-registryname)
     */
    override fun registryName(): String = unwrap(this).getRegistryName()

    /**
     * The revision ID of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html#cfn-eventschemas-registrypolicy-revisionid)
     */
    override fun revisionId(): String? = unwrap(this).getRevisionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRegistryPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps):
        CfnRegistryPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryPolicyProps):
        software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps
  }
}
