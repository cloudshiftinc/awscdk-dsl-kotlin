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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.connect.CfnPrompt
import software.constructs.Construct

/**
 * Creates a prompt for the specified Amazon Connect instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnPrompt cfnPrompt = CfnPrompt.Builder.create(this, "MyCfnPrompt")
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .s3Uri("s3Uri")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html)
 */
@CdkDslMarker
public class CfnPromptDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPrompt.Builder = CfnPrompt.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-description)
     *
     * @param description The description of the prompt.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-instancearn)
     *
     * @param instanceArn The identifier of the Amazon Connect instance.
     */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-name)
     *
     * @param name The name of the prompt.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The URI for the S3 bucket where the prompt is stored.
     *
     * This property is required when you create a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-s3uri)
     *
     * @param s3Uri The URI for the S3 bucket where the prompt is stored.
     */
    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPrompt {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
