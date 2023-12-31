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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnScript
import software.constructs.Construct

/**
 * The `AWS::GameLift::Script` resource creates a new script record for your Realtime Servers
 * script.
 *
 * Realtime scripts are JavaScript that provide configuration settings and optional custom game
 * logic for your game. The script is deployed when you create a Realtime Servers fleet to host your
 * game sessions. Script logic is executed during an active game session.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * CfnScript cfnScript = CfnScript.Builder.create(this, "MyCfnScript")
 * .storageLocation(S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html)
 */
@CdkDslMarker
public class CfnScriptDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnScript.Builder = CfnScript.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A descriptive label that is associated with a script.
     *
     * Script names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-name)
     *
     * @param name A descriptive label that is associated with a script.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
     * stored.
     *
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned
     * on, you can use the `ObjectVersion` parameter to specify an earlier version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-storagelocation)
     *
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     *   your Realtime scripts is stored.
     */
    public fun storageLocation(storageLocation: IResolvable) {
        cdkBuilder.storageLocation(storageLocation)
    }

    /**
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
     * stored.
     *
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned
     * on, you can use the `ObjectVersion` parameter to specify an earlier version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-storagelocation)
     *
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     *   your Realtime scripts is stored.
     */
    public fun storageLocation(storageLocation: CfnScript.S3LocationProperty) {
        cdkBuilder.storageLocation(storageLocation)
    }

    /**
     * A list of labels to assign to the new script resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see
     * [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference* . Once the resource is created, you can use TagResource,
     * UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit
     * may be lower than stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-tags)
     *
     * @param tags A list of labels to assign to the new script resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of labels to assign to the new script resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see
     * [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference* . Once the resource is created, you can use TagResource,
     * UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit
     * may be lower than stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-tags)
     *
     * @param tags A list of labels to assign to the new script resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The version that is associated with a build or script.
     *
     * Version strings do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-version)
     *
     * @param version The version that is associated with a build or script.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnScript {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
