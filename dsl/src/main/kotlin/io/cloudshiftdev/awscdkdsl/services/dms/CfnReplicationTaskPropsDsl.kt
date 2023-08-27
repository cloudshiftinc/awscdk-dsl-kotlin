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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.dms.CfnReplicationTaskProps

/**
 * Properties for defining a `CfnReplicationTask`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * CfnReplicationTaskProps cfnReplicationTaskProps = CfnReplicationTaskProps.builder()
 * .migrationType("migrationType")
 * .replicationInstanceArn("replicationInstanceArn")
 * .sourceEndpointArn("sourceEndpointArn")
 * .tableMappings("tableMappings")
 * .targetEndpointArn("targetEndpointArn")
 * // the properties below are optional
 * .cdcStartPosition("cdcStartPosition")
 * .cdcStartTime(123)
 * .cdcStopPosition("cdcStopPosition")
 * .replicationTaskIdentifier("replicationTaskIdentifier")
 * .replicationTaskSettings("replicationTaskSettings")
 * .resourceIdentifier("resourceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .taskData("taskData")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html)
 */
@CdkDslMarker
public class CfnReplicationTaskPropsDsl {
    private val cdkBuilder: CfnReplicationTaskProps.Builder = CfnReplicationTaskProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param cdcStartPosition Indicates when you want a change data capture (CDC) operation to
     *   start. Use either `CdcStartPosition` or `CdcStartTime` to specify when you want a CDC
     *   operation to start. Specifying both values results in an error.
     *
     * The value can be in date, checkpoint, log sequence number (LSN), or system change number
     * (SCN) format.
     *
     * Here is a date example: `--cdc-start-position "2018-03-08T12:12:12"`
     *
     * Here is a checkpoint example: `--cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"`
     *
     * Here is an LSN example: `--cdc-start-position “mysql-bin-changelog.000024:373”`
     *
     * When you use this task setting with a source PostgreSQL database, a logical replication slot
     * should already be created and associated with the source endpoint. You can verify this by
     * setting the `slotName` extra connection attribute to the name of this logical replication
     * slot. For more information, see
     * [Extra Connection Attributes When Using PostgreSQL as a Source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun cdcStartPosition(cdcStartPosition: String) {
        cdkBuilder.cdcStartPosition(cdcStartPosition)
    }

    /** @param cdcStartTime Indicates the start time for a change data capture (CDC) operation. */
    public fun cdcStartTime(cdcStartTime: Number) {
        cdkBuilder.cdcStartTime(cdcStartTime)
    }

    /**
     * @param cdcStopPosition Indicates when you want a change data capture (CDC) operation to stop.
     *   The value can be either server time or commit time.
     *
     * Here is a server time example: `--cdc-stop-position "server_time:2018-02-09T12:12:12"`
     *
     * Here is a commit time example: `--cdc-stop-position "commit_time: 2018-02-09T12:12:12"`
     */
    public fun cdcStopPosition(cdcStopPosition: String) {
        cdkBuilder.cdcStopPosition(cdcStopPosition)
    }

    /**
     * @param migrationType The migration type. Valid values: `full-load` | `cdc` |
     *   `full-load-and-cdc`
     */
    public fun migrationType(migrationType: String) {
        cdkBuilder.migrationType(migrationType)
    }

    /** @param replicationInstanceArn The Amazon Resource Name (ARN) of a replication instance. */
    public fun replicationInstanceArn(replicationInstanceArn: String) {
        cdkBuilder.replicationInstanceArn(replicationInstanceArn)
    }

    /**
     * @param replicationTaskIdentifier An identifier for the replication task. Constraints:
     * * Must contain 1-255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     */
    public fun replicationTaskIdentifier(replicationTaskIdentifier: String) {
        cdkBuilder.replicationTaskIdentifier(replicationTaskIdentifier)
    }

    /**
     * @param replicationTaskSettings Overall settings for the task, in JSON format. For more
     *   information, see
     *   [Specifying Task Settings for AWS Database Migration Service Tasks](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html)
     *   in the *AWS Database Migration Service User Guide* .
     */
    public fun replicationTaskSettings(replicationTaskSettings: String) {
        cdkBuilder.replicationTaskSettings(replicationTaskSettings)
    }

    /**
     * @param resourceIdentifier A display name for the resource identifier at the end of the
     *   `EndpointArn` response parameter that is returned in the created `Endpoint` object. The
     *   value for this parameter can have up to 31 characters. It can contain only ASCII letters,
     *   digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive
     *   hyphens, and can only begin with a letter, such as `Example-App-ARN1` .
     *
     * For example, this value might result in the `EndpointArn` value
     * `arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1` . If you don't specify a
     * `ResourceIdentifier` value, AWS DMS generates a default identifier value for the end of
     * `EndpointArn` .
     */
    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * @param sourceEndpointArn An Amazon Resource Name (ARN) that uniquely identifies the source
     *   endpoint.
     */
    public fun sourceEndpointArn(sourceEndpointArn: String) {
        cdkBuilder.sourceEndpointArn(sourceEndpointArn)
    }

    /**
     * @param tableMappings The table mappings for the task, in JSON format. For more information,
     *   see
     *   [Using Table Mapping to Specify Task Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
     *   in the *AWS Database Migration Service User Guide* .
     */
    public fun tableMappings(tableMappings: String) {
        cdkBuilder.tableMappings(tableMappings)
    }

    /** @param tags One or more tags to be assigned to the replication task. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags One or more tags to be assigned to the replication task. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param targetEndpointArn An Amazon Resource Name (ARN) that uniquely identifies the target
     *   endpoint.
     */
    public fun targetEndpointArn(targetEndpointArn: String) {
        cdkBuilder.targetEndpointArn(targetEndpointArn)
    }

    /**
     * @param taskData Supplemental information that the task requires to migrate the data for
     *   certain source and target endpoints. For more information, see
     *   [Specifying Supplemental Data for Task Settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html)
     *   in the *AWS Database Migration Service User Guide.*
     */
    public fun taskData(taskData: String) {
        cdkBuilder.taskData(taskData)
    }

    public fun build(): CfnReplicationTaskProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
