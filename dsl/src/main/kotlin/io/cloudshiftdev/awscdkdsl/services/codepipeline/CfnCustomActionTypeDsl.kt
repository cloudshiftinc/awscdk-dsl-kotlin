@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType
import software.constructs.Construct

/**
 * The `AWS::CodePipeline::CustomActionType` resource creates a custom action for activities that
 * aren't included in the CodePipeline default actions, such as running an internally developed
 * build process or a test suite.
 *
 * You can use these custom actions in the stage of a pipeline. For more information, see
 * [Create and Add a Custom Action in AWS CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
 * in the *AWS CodePipeline User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * CfnCustomActionType cfnCustomActionType = CfnCustomActionType.Builder.create(this,
 * "MyCfnCustomActionType")
 * .category("category")
 * .inputArtifactDetails(ArtifactDetailsProperty.builder()
 * .maximumCount(123)
 * .minimumCount(123)
 * .build())
 * .outputArtifactDetails(ArtifactDetailsProperty.builder()
 * .maximumCount(123)
 * .minimumCount(123)
 * .build())
 * .provider("provider")
 * .version("version")
 * // the properties below are optional
 * .configurationProperties(List.of(ConfigurationPropertiesProperty.builder()
 * .key(false)
 * .name("name")
 * .required(false)
 * .secret(false)
 * // the properties below are optional
 * .description("description")
 * .queryable(false)
 * .type("type")
 * .build()))
 * .settings(SettingsProperty.builder()
 * .entityUrlTemplate("entityUrlTemplate")
 * .executionUrlTemplate("executionUrlTemplate")
 * .revisionUrlTemplate("revisionUrlTemplate")
 * .thirdPartyConfigurationUrl("thirdPartyConfigurationUrl")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html)
 */
@CdkDslMarker
public class CfnCustomActionTypeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCustomActionType.Builder =
        CfnCustomActionType.Builder.create(scope, id)

    private val _configurationProperties: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The category of the custom action, such as a build action or a test action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category)
     *
     * @param category The category of the custom action, such as a build action or a test action.
     */
    public fun category(category: String) {
        cdkBuilder.category(category)
    }

    /**
     * The configuration properties for the custom action.
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see
     * [Create a Custom Action for a Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
     *
     * @param configurationProperties The configuration properties for the custom action.
     */
    public fun configurationProperties(vararg configurationProperties: Any) {
        _configurationProperties.addAll(listOf(*configurationProperties))
    }

    /**
     * The configuration properties for the custom action.
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see
     * [Create a Custom Action for a Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
     *
     * @param configurationProperties The configuration properties for the custom action.
     */
    public fun configurationProperties(configurationProperties: Collection<Any>) {
        _configurationProperties.addAll(configurationProperties)
    }

    /**
     * The configuration properties for the custom action.
     *
     * You can refer to a name in the configuration properties of the custom action within the URL
     * templates by following the format of {Config:name}, as long as the configuration property is
     * both required and not secret. For more information, see
     * [Create a Custom Action for a Pipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties)
     *
     * @param configurationProperties The configuration properties for the custom action.
     */
    public fun configurationProperties(configurationProperties: IResolvable) {
        cdkBuilder.configurationProperties(configurationProperties)
    }

    /**
     * The details of the input artifact for the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
     *
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     *   commit ID.
     */
    public fun inputArtifactDetails(inputArtifactDetails: IResolvable) {
        cdkBuilder.inputArtifactDetails(inputArtifactDetails)
    }

    /**
     * The details of the input artifact for the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-inputartifactdetails)
     *
     * @param inputArtifactDetails The details of the input artifact for the action, such as its
     *   commit ID.
     */
    public fun inputArtifactDetails(
        inputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty
    ) {
        cdkBuilder.inputArtifactDetails(inputArtifactDetails)
    }

    /**
     * The details of the output artifact of the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
     *
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     *   commit ID.
     */
    public fun outputArtifactDetails(outputArtifactDetails: IResolvable) {
        cdkBuilder.outputArtifactDetails(outputArtifactDetails)
    }

    /**
     * The details of the output artifact of the action, such as its commit ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-outputartifactdetails)
     *
     * @param outputArtifactDetails The details of the output artifact of the action, such as its
     *   commit ID.
     */
    public fun outputArtifactDetails(
        outputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty
    ) {
        cdkBuilder.outputArtifactDetails(outputArtifactDetails)
    }

    /**
     * The provider of the service used in the custom action, such as CodeDeploy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider)
     *
     * @param provider The provider of the service used in the custom action, such as CodeDeploy.
     */
    public fun provider(provider: String) {
        cdkBuilder.provider(provider)
    }

    /**
     * URLs that provide users information about this custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
     *
     * @param settings URLs that provide users information about this custom action.
     */
    public fun settings(settings: IResolvable) {
        cdkBuilder.settings(settings)
    }

    /**
     * URLs that provide users information about this custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-settings)
     *
     * @param settings URLs that provide users information about this custom action.
     */
    public fun settings(settings: CfnCustomActionType.SettingsProperty) {
        cdkBuilder.settings(settings)
    }

    /**
     * The tags for the custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-tags)
     *
     * @param tags The tags for the custom action.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags for the custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-tags)
     *
     * @param tags The tags for the custom action.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The version identifier of the custom action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version)
     *
     * @param version The version identifier of the custom action.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnCustomActionType {
        if (_configurationProperties.isNotEmpty())
            cdkBuilder.configurationProperties(_configurationProperties)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
