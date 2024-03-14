package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnModelPackageGroupProps {
  /**
   * The description for the model group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegroupdescription)
   */
  public fun modelPackageGroupDescription(): String? =
      unwrap(this).getModelPackageGroupDescription()

  /**
   * The name of the model group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegroupname)
   */
  public fun modelPackageGroupName(): String

  /**
   * A resouce policy to control access to a model group.
   *
   * For information about resoure policies, see [Identity-based policies and resource-based
   * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html)
   * in the *AWS Identity and Access Management User Guide.* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegrouppolicy)
   */
  public fun modelPackageGroupPolicy(): Any? = unwrap(this).getModelPackageGroupPolicy()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnModelPackageGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param modelPackageGroupDescription The description for the model group.
     */
    public fun modelPackageGroupDescription(modelPackageGroupDescription: String)

    /**
     * @param modelPackageGroupName The name of the model group. 
     */
    public fun modelPackageGroupName(modelPackageGroupName: String)

    /**
     * @param modelPackageGroupPolicy A resouce policy to control access to a model group.
     * For information about resoure policies, see [Identity-based policies and resource-based
     * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html)
     * in the *AWS Identity and Access Management User Guide.* .
     */
    public fun modelPackageGroupPolicy(modelPackageGroupPolicy: Any)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps.builder()

    /**
     * @param modelPackageGroupDescription The description for the model group.
     */
    override fun modelPackageGroupDescription(modelPackageGroupDescription: String) {
      cdkBuilder.modelPackageGroupDescription(modelPackageGroupDescription)
    }

    /**
     * @param modelPackageGroupName The name of the model group. 
     */
    override fun modelPackageGroupName(modelPackageGroupName: String) {
      cdkBuilder.modelPackageGroupName(modelPackageGroupName)
    }

    /**
     * @param modelPackageGroupPolicy A resouce policy to control access to a model group.
     * For information about resoure policies, see [Identity-based policies and resource-based
     * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html)
     * in the *AWS Identity and Access Management User Guide.* .
     */
    override fun modelPackageGroupPolicy(modelPackageGroupPolicy: Any) {
      cdkBuilder.modelPackageGroupPolicy(modelPackageGroupPolicy)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps,
  ) : CdkObject(cdkObject), CfnModelPackageGroupProps {
    /**
     * The description for the model group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegroupdescription)
     */
    override fun modelPackageGroupDescription(): String? =
        unwrap(this).getModelPackageGroupDescription()

    /**
     * The name of the model group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegroupname)
     */
    override fun modelPackageGroupName(): String = unwrap(this).getModelPackageGroupName()

    /**
     * A resouce policy to control access to a model group.
     *
     * For information about resoure policies, see [Identity-based policies and resource-based
     * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html)
     * in the *AWS Identity and Access Management User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegrouppolicy)
     */
    override fun modelPackageGroupPolicy(): Any? = unwrap(this).getModelPackageGroupPolicy()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelPackageGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps):
        CfnModelPackageGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelPackageGroupProps):
        software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps
  }
}
