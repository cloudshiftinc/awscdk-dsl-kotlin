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

package io.cloudshiftdev.awscdkdsl.services.frauddetector

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.frauddetector.CfnDetector

/**
 * The entity type details.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.frauddetector.*;
 * EntityTypeProperty entityTypeProperty = EntityTypeProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-entitytype.html)
 */
@CdkDslMarker
public class CfnDetectorEntityTypePropertyDsl {
    private val cdkBuilder: CfnDetector.EntityTypeProperty.Builder =
        CfnDetector.EntityTypeProperty.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param arn The entity type ARN. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /** @param createdTime Timestamp of when the entity type was created. */
    public fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
    }

    /** @param description The entity type description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param inline Indicates whether the resource is defined within this CloudFormation template
     *   and impacts the create, update, and delete behavior of the stack. If the value is `true` ,
     *   CloudFormation will create/update/delete the resource when creating/updating/deleting the
     *   stack. If the value is `false` , CloudFormation will validate that the object exists and
     *   then use it within the resource without making changes to the object.
     *
     * For example, when creating `AWS::FraudDetector::Detector` you must define at least two
     * variables. You can set `Inline=true` for these Variables and CloudFormation will
     * create/update/delete the variables as part of stack operations. However, if you set
     * `Inline=false` , CloudFormation will associate the variables to your detector but not execute
     * any changes to the variables.
     */
    public fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
    }

    /**
     * @param inline Indicates whether the resource is defined within this CloudFormation template
     *   and impacts the create, update, and delete behavior of the stack. If the value is `true` ,
     *   CloudFormation will create/update/delete the resource when creating/updating/deleting the
     *   stack. If the value is `false` , CloudFormation will validate that the object exists and
     *   then use it within the resource without making changes to the object.
     *
     * For example, when creating `AWS::FraudDetector::Detector` you must define at least two
     * variables. You can set `Inline=true` for these Variables and CloudFormation will
     * create/update/delete the variables as part of stack operations. However, if you set
     * `Inline=false` , CloudFormation will associate the variables to your detector but not execute
     * any changes to the variables.
     */
    public fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`)
    }

    /** @param lastUpdatedTime Timestamp of when the entity type was last updated. */
    public fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
    }

    /** @param name The entity type name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDetector.EntityTypeProperty {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
