package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRulesetProps {
  /**
   * The description of the ruleset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the ruleset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-name)
   */
  public fun name(): String

  /**
   * Contains metadata about the ruleset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-rules)
   */
  public fun rules(): Any

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-targetarn)
   */
  public fun targetArn(): String

  /**
   * A builder for [CfnRulesetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the ruleset.
     */
    public fun description(description: String)

    /**
     * @param name The name of the ruleset. 
     */
    public fun name(name: String)

    /**
     * @param rules Contains metadata about the ruleset. 
     */
    public fun rules(rules: IResolvable)

    /**
     * @param rules Contains metadata about the ruleset. 
     */
    public fun rules(rules: List<Any>)

    /**
     * @param rules Contains metadata about the ruleset. 
     */
    public fun rules(vararg rules: Any)

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

    /**
     * @param targetArn The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is
     * associated with. 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnRulesetProps.Builder =
        software.amazon.awscdk.services.databrew.CfnRulesetProps.builder()

    /**
     * @param description The description of the ruleset.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the ruleset. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param rules Contains metadata about the ruleset. 
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    /**
     * @param rules Contains metadata about the ruleset. 
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    /**
     * @param rules Contains metadata about the ruleset. 
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

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

    /**
     * @param targetArn The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is
     * associated with. 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.databrew.CfnRulesetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.databrew.CfnRulesetProps,
  ) : CdkObject(cdkObject), CfnRulesetProps {
    /**
     * The description of the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Contains metadata about the ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-rules)
     */
    override fun rules(): Any = unwrap(this).getRules()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-ruleset.html#cfn-databrew-ruleset-targetarn)
     */
    override fun targetArn(): String = unwrap(this).getTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRulesetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnRulesetProps):
        CfnRulesetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRulesetProps):
        software.amazon.awscdk.services.databrew.CfnRulesetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.databrew.CfnRulesetProps
  }
}
