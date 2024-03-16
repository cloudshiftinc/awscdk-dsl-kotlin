@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnAssessmentTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.inspector.*;
 * CfnAssessmentTemplateProps cfnAssessmentTemplateProps = CfnAssessmentTemplateProps.builder()
 * .assessmentTargetArn("assessmentTargetArn")
 * .durationInSeconds(123)
 * .rulesPackageArns(List.of("rulesPackageArns"))
 * // the properties below are optional
 * .assessmentTemplateName("assessmentTemplateName")
 * .userAttributesForFindings(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html)
 */
public interface CfnAssessmentTemplateProps {
  /**
   * The ARN of the assessment target to be included in the assessment template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttargetarn)
   */
  public fun assessmentTargetArn(): String

  /**
   * The user-defined name that identifies the assessment template that you want to create.
   *
   * You can create several assessment templates for the same assessment target. The names of the
   * assessment templates that correspond to a particular assessment target must be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttemplatename)
   */
  public fun assessmentTemplateName(): String? = unwrap(this).getAssessmentTemplateName()

  /**
   * The duration of the assessment run in seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-durationinseconds)
   */
  public fun durationInSeconds(): Number

  /**
   * The ARNs of the rules packages that you want to use in the assessment template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-rulespackagearns)
   */
  public fun rulesPackageArns(): List<String>

  /**
   * The user-defined attributes that are assigned to every finding that is generated by the
   * assessment run that uses this assessment template.
   *
   * Within an assessment template, each key must be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-userattributesforfindings)
   */
  public fun userAttributesForFindings(): Any? = unwrap(this).getUserAttributesForFindings()

  /**
   * A builder for [CfnAssessmentTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assessmentTargetArn The ARN of the assessment target to be included in the assessment
     * template. 
     */
    public fun assessmentTargetArn(assessmentTargetArn: String)

    /**
     * @param assessmentTemplateName The user-defined name that identifies the assessment template
     * that you want to create.
     * You can create several assessment templates for the same assessment target. The names of the
     * assessment templates that correspond to a particular assessment target must be unique.
     */
    public fun assessmentTemplateName(assessmentTemplateName: String)

    /**
     * @param durationInSeconds The duration of the assessment run in seconds. 
     */
    public fun durationInSeconds(durationInSeconds: Number)

    /**
     * @param rulesPackageArns The ARNs of the rules packages that you want to use in the assessment
     * template. 
     */
    public fun rulesPackageArns(rulesPackageArns: List<String>)

    /**
     * @param rulesPackageArns The ARNs of the rules packages that you want to use in the assessment
     * template. 
     */
    public fun rulesPackageArns(vararg rulesPackageArns: String)

    /**
     * @param userAttributesForFindings The user-defined attributes that are assigned to every
     * finding that is generated by the assessment run that uses this assessment template.
     * Within an assessment template, each key must be unique.
     */
    public fun userAttributesForFindings(userAttributesForFindings: IResolvable)

    /**
     * @param userAttributesForFindings The user-defined attributes that are assigned to every
     * finding that is generated by the assessment run that uses this assessment template.
     * Within an assessment template, each key must be unique.
     */
    public fun userAttributesForFindings(userAttributesForFindings: List<Any>)

    /**
     * @param userAttributesForFindings The user-defined attributes that are assigned to every
     * finding that is generated by the assessment run that uses this assessment template.
     * Within an assessment template, each key must be unique.
     */
    public fun userAttributesForFindings(vararg userAttributesForFindings: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder =
        software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.builder()

    /**
     * @param assessmentTargetArn The ARN of the assessment target to be included in the assessment
     * template. 
     */
    override fun assessmentTargetArn(assessmentTargetArn: String) {
      cdkBuilder.assessmentTargetArn(assessmentTargetArn)
    }

    /**
     * @param assessmentTemplateName The user-defined name that identifies the assessment template
     * that you want to create.
     * You can create several assessment templates for the same assessment target. The names of the
     * assessment templates that correspond to a particular assessment target must be unique.
     */
    override fun assessmentTemplateName(assessmentTemplateName: String) {
      cdkBuilder.assessmentTemplateName(assessmentTemplateName)
    }

    /**
     * @param durationInSeconds The duration of the assessment run in seconds. 
     */
    override fun durationInSeconds(durationInSeconds: Number) {
      cdkBuilder.durationInSeconds(durationInSeconds)
    }

    /**
     * @param rulesPackageArns The ARNs of the rules packages that you want to use in the assessment
     * template. 
     */
    override fun rulesPackageArns(rulesPackageArns: List<String>) {
      cdkBuilder.rulesPackageArns(rulesPackageArns)
    }

    /**
     * @param rulesPackageArns The ARNs of the rules packages that you want to use in the assessment
     * template. 
     */
    override fun rulesPackageArns(vararg rulesPackageArns: String): Unit =
        rulesPackageArns(rulesPackageArns.toList())

    /**
     * @param userAttributesForFindings The user-defined attributes that are assigned to every
     * finding that is generated by the assessment run that uses this assessment template.
     * Within an assessment template, each key must be unique.
     */
    override fun userAttributesForFindings(userAttributesForFindings: IResolvable) {
      cdkBuilder.userAttributesForFindings(userAttributesForFindings.let(IResolvable::unwrap))
    }

    /**
     * @param userAttributesForFindings The user-defined attributes that are assigned to every
     * finding that is generated by the assessment run that uses this assessment template.
     * Within an assessment template, each key must be unique.
     */
    override fun userAttributesForFindings(userAttributesForFindings: List<Any>) {
      cdkBuilder.userAttributesForFindings(userAttributesForFindings)
    }

    /**
     * @param userAttributesForFindings The user-defined attributes that are assigned to every
     * finding that is generated by the assessment run that uses this assessment template.
     * Within an assessment template, each key must be unique.
     */
    override fun userAttributesForFindings(vararg userAttributesForFindings: Any): Unit =
        userAttributesForFindings(userAttributesForFindings.toList())

    public fun build(): software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps,
  ) : CdkObject(cdkObject), CfnAssessmentTemplateProps {
    /**
     * The ARN of the assessment target to be included in the assessment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttargetarn)
     */
    override fun assessmentTargetArn(): String = unwrap(this).getAssessmentTargetArn()

    /**
     * The user-defined name that identifies the assessment template that you want to create.
     *
     * You can create several assessment templates for the same assessment target. The names of the
     * assessment templates that correspond to a particular assessment target must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttemplatename)
     */
    override fun assessmentTemplateName(): String? = unwrap(this).getAssessmentTemplateName()

    /**
     * The duration of the assessment run in seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-durationinseconds)
     */
    override fun durationInSeconds(): Number = unwrap(this).getDurationInSeconds()

    /**
     * The ARNs of the rules packages that you want to use in the assessment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-rulespackagearns)
     */
    override fun rulesPackageArns(): List<String> = unwrap(this).getRulesPackageArns()

    /**
     * The user-defined attributes that are assigned to every finding that is generated by the
     * assessment run that uses this assessment template.
     *
     * Within an assessment template, each key must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-userattributesforfindings)
     */
    override fun userAttributesForFindings(): Any? = unwrap(this).getUserAttributesForFindings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssessmentTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps):
        CfnAssessmentTemplateProps = CdkObjectWrappers.wrap(cdkObject) as CfnAssessmentTemplateProps

    internal fun unwrap(wrapped: CfnAssessmentTemplateProps):
        software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps
  }
}
