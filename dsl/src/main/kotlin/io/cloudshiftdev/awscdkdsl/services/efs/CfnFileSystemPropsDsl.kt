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

package io.cloudshiftdev.awscdkdsl.services.efs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.efs.CfnFileSystem
import software.amazon.awscdk.services.efs.CfnFileSystemProps

/**
 * Properties for defining a `CfnFileSystem`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.efs.*;
 * Object fileSystemPolicy;
 * CfnFileSystemProps cfnFileSystemProps = CfnFileSystemProps.builder()
 * .availabilityZoneName("availabilityZoneName")
 * .backupPolicy(BackupPolicyProperty.builder()
 * .status("status")
 * .build())
 * .bypassPolicyLockoutSafetyCheck(false)
 * .encrypted(false)
 * .fileSystemPolicy(fileSystemPolicy)
 * .fileSystemProtection(FileSystemProtectionProperty.builder()
 * .replicationOverwriteProtection("replicationOverwriteProtection")
 * .build())
 * .fileSystemTags(List.of(ElasticFileSystemTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .kmsKeyId("kmsKeyId")
 * .lifecyclePolicies(List.of(LifecyclePolicyProperty.builder()
 * .transitionToArchive("transitionToArchive")
 * .transitionToIa("transitionToIa")
 * .transitionToPrimaryStorageClass("transitionToPrimaryStorageClass")
 * .build()))
 * .performanceMode("performanceMode")
 * .provisionedThroughputInMibps(123)
 * .replicationConfiguration(ReplicationConfigurationProperty.builder()
 * .destinations(List.of(ReplicationDestinationProperty.builder()
 * .availabilityZoneName("availabilityZoneName")
 * .fileSystemId("fileSystemId")
 * .kmsKeyId("kmsKeyId")
 * .region("region")
 * .build()))
 * .build())
 * .throughputMode("throughputMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html)
 */
@CdkDslMarker
public class CfnFileSystemPropsDsl {
    private val cdkBuilder: CfnFileSystemProps.Builder = CfnFileSystemProps.builder()

    private val _fileSystemTags: MutableList<CfnFileSystem.ElasticFileSystemTagProperty> =
        mutableListOf()

    private val _lifecyclePolicies: MutableList<Any> = mutableListOf()

    /**
     * @param availabilityZoneName For One Zone file systems, specify the AWS Availability Zone in
     *   which to create the file system. Use the format `us-east-1a` to specify the Availability
     *   Zone. For more information about One Zone file systems, see
     *   [EFS file system types](https://docs.aws.amazon.com/efs/latest/ug/availability-durability.html#file-system-type)
     *   in the *Amazon EFS User Guide* .
     *
     * One Zone file systems are not available in all Availability Zones in AWS Regions where Amazon
     * EFS is available.
     */
    public fun availabilityZoneName(availabilityZoneName: String) {
        cdkBuilder.availabilityZoneName(availabilityZoneName)
    }

    /**
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     *   system.
     */
    public fun backupPolicy(backupPolicy: IResolvable) {
        cdkBuilder.backupPolicy(backupPolicy)
    }

    /**
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     *   system.
     */
    public fun backupPolicy(backupPolicy: CfnFileSystem.BackupPolicyProperty) {
        cdkBuilder.backupPolicy(backupPolicy)
    }

    /**
     * @param bypassPolicyLockoutSafetyCheck (Optional) A boolean that specifies whether or not to
     *   bypass the `FileSystemPolicy` lockout safety check. The lockout safety check determines
     *   whether the policy in the request will lock out, or prevent, the IAM principal that is
     *   making the request from making future `PutFileSystemPolicy` requests on this file system.
     *   Set `BypassPolicyLockoutSafetyCheck` to `True` only when you intend to prevent the IAM
     *   principal that is making the request from making subsequent `PutFileSystemPolicy` requests
     *   on this file system. The default value is `False` .
     */
    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean) {
        cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck)
    }

    /**
     * @param bypassPolicyLockoutSafetyCheck (Optional) A boolean that specifies whether or not to
     *   bypass the `FileSystemPolicy` lockout safety check. The lockout safety check determines
     *   whether the policy in the request will lock out, or prevent, the IAM principal that is
     *   making the request from making future `PutFileSystemPolicy` requests on this file system.
     *   Set `BypassPolicyLockoutSafetyCheck` to `True` only when you intend to prevent the IAM
     *   principal that is making the request from making subsequent `PutFileSystemPolicy` requests
     *   on this file system. The default value is `False` .
     */
    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable) {
        cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck)
    }

    /**
     * @param encrypted A Boolean value that, if true, creates an encrypted file system. When
     *   creating an encrypted file system, you have the option of specifying a KmsKeyId for an
     *   existing AWS KMS key . If you don't specify a KMS key , then the default KMS key for Amazon
     *   EFS , `/aws/elasticfilesystem` , is used to protect the encrypted file system.
     */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param encrypted A Boolean value that, if true, creates an encrypted file system. When
     *   creating an encrypted file system, you have the option of specifying a KmsKeyId for an
     *   existing AWS KMS key . If you don't specify a KMS key , then the default KMS key for Amazon
     *   EFS , `/aws/elasticfilesystem` , is used to protect the encrypted file system.
     */
    public fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param fileSystemPolicy The `FileSystemPolicy` for the EFS file system. A file system policy
     *   is an IAM resource policy used to control NFS access to an EFS file system. For more
     *   information, see
     *   [Using IAM to control NFS access to Amazon EFS](https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html)
     *   in the *Amazon EFS User Guide* .
     */
    public fun fileSystemPolicy(fileSystemPolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(fileSystemPolicy)
        cdkBuilder.fileSystemPolicy(builder.map)
    }

    /**
     * @param fileSystemPolicy The `FileSystemPolicy` for the EFS file system. A file system policy
     *   is an IAM resource policy used to control NFS access to an EFS file system. For more
     *   information, see
     *   [Using IAM to control NFS access to Amazon EFS](https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html)
     *   in the *Amazon EFS User Guide* .
     */
    public fun fileSystemPolicy(fileSystemPolicy: Any) {
        cdkBuilder.fileSystemPolicy(fileSystemPolicy)
    }

    /** @param fileSystemProtection Describes the protection on the file system. */
    public fun fileSystemProtection(fileSystemProtection: IResolvable) {
        cdkBuilder.fileSystemProtection(fileSystemProtection)
    }

    /** @param fileSystemProtection Describes the protection on the file system. */
    public fun fileSystemProtection(
        fileSystemProtection: CfnFileSystem.FileSystemProtectionProperty
    ) {
        cdkBuilder.fileSystemProtection(fileSystemProtection)
    }

    /**
     * @param fileSystemTags Use to create one or more tags associated with the file system. Each
     *   tag is a user-defined key-value pair. Name your file system on creation by including a
     *   `"Key":"Name","Value":"{value}"` key-value pair. Each key must be unique. For more
     *   information, see
     *   [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     *   the *AWS General Reference Guide* .
     */
    public fun fileSystemTags(
        fileSystemTags: CfnFileSystemElasticFileSystemTagPropertyDsl.() -> Unit
    ) {
        _fileSystemTags.add(
            CfnFileSystemElasticFileSystemTagPropertyDsl().apply(fileSystemTags).build()
        )
    }

    /**
     * @param fileSystemTags Use to create one or more tags associated with the file system. Each
     *   tag is a user-defined key-value pair. Name your file system on creation by including a
     *   `"Key":"Name","Value":"{value}"` key-value pair. Each key must be unique. For more
     *   information, see
     *   [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     *   the *AWS General Reference Guide* .
     */
    public fun fileSystemTags(
        fileSystemTags: Collection<CfnFileSystem.ElasticFileSystemTagProperty>
    ) {
        _fileSystemTags.addAll(fileSystemTags)
    }

    /**
     * @param kmsKeyId The ID of the AWS KMS key to be used to protect the encrypted file system.
     *   This parameter is only required if you want to use a nondefault KMS key . If this parameter
     *   is not specified, the default KMS key for Amazon EFS is used. This ID can be in one of the
     *   following formats:
     * * Key ID - A unique identifier of the key, for example `1234abcd-12ab-34cd-56ef-1234567890ab`
     *   .
     * * ARN - An Amazon Resource Name (ARN) for the key, for example
     *   `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` .
     * * Key alias - A previously created display name for a key, for example `alias/projectKey1` .
     * * Key alias ARN - An ARN for a key alias, for example
     *   `arn:aws:kms:us-west-2:444455556666:alias/projectKey1` .
     *
     * If `KmsKeyId` is specified, the `Encrypted` parameter must be set to true.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     *   `LifecycleConfiguration` object. A `LifecycleConfiguration` object informs Lifecycle
     *   management of the following:
     * * When to move files in the file system from primary storage to IA storage.
     * * When to move files in the file system from primary storage or IA storage to Archive
     *   storage.
     * * When to move files that are in IA or Archive storage to primary storage.
     *
     * Amazon EFS requires that each `LifecyclePolicy` object have only a single transition. This
     * means that in a request body, `LifecyclePolicies` needs to be structured as an array of
     * `LifecyclePolicy` objects, one object for each transition, `TransitionToIA` ,
     * `TransitionToArchive` `TransitionToPrimaryStorageClass` . See the example requests in the
     * following section for more information.
     */
    public fun lifecyclePolicies(vararg lifecyclePolicies: Any) {
        _lifecyclePolicies.addAll(listOf(*lifecyclePolicies))
    }

    /**
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     *   `LifecycleConfiguration` object. A `LifecycleConfiguration` object informs Lifecycle
     *   management of the following:
     * * When to move files in the file system from primary storage to IA storage.
     * * When to move files in the file system from primary storage or IA storage to Archive
     *   storage.
     * * When to move files that are in IA or Archive storage to primary storage.
     *
     * Amazon EFS requires that each `LifecyclePolicy` object have only a single transition. This
     * means that in a request body, `LifecyclePolicies` needs to be structured as an array of
     * `LifecyclePolicy` objects, one object for each transition, `TransitionToIA` ,
     * `TransitionToArchive` `TransitionToPrimaryStorageClass` . See the example requests in the
     * following section for more information.
     */
    public fun lifecyclePolicies(lifecyclePolicies: Collection<Any>) {
        _lifecyclePolicies.addAll(lifecyclePolicies)
    }

    /**
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     *   `LifecycleConfiguration` object. A `LifecycleConfiguration` object informs Lifecycle
     *   management of the following:
     * * When to move files in the file system from primary storage to IA storage.
     * * When to move files in the file system from primary storage or IA storage to Archive
     *   storage.
     * * When to move files that are in IA or Archive storage to primary storage.
     *
     * Amazon EFS requires that each `LifecyclePolicy` object have only a single transition. This
     * means that in a request body, `LifecyclePolicies` needs to be structured as an array of
     * `LifecyclePolicy` objects, one object for each transition, `TransitionToIA` ,
     * `TransitionToArchive` `TransitionToPrimaryStorageClass` . See the example requests in the
     * following section for more information.
     */
    public fun lifecyclePolicies(lifecyclePolicies: IResolvable) {
        cdkBuilder.lifecyclePolicies(lifecyclePolicies)
    }

    /**
     * @param performanceMode The performance mode of the file system. We recommend `generalPurpose`
     *   performance mode for all file systems. File systems using the `maxIO` performance mode can
     *   scale to higher levels of aggregate throughput and operations per second with a tradeoff of
     *   slightly higher latencies for most file operations. The performance mode can't be changed
     *   after the file system has been created. The `maxIO` mode is not supported on One Zone file
     *   systems.
     *
     * Due to the higher per-operation latencies with Max I/O, we recommend using General Purpose
     * performance mode for all file systems.
     *
     * Default is `generalPurpose` .
     */
    public fun performanceMode(performanceMode: String) {
        cdkBuilder.performanceMode(performanceMode)
    }

    /**
     * @param provisionedThroughputInMibps The throughput, measured in mebibytes per second (MiBps),
     *   that you want to provision for a file system that you're creating. Required if
     *   `ThroughputMode` is set to `provisioned` . Valid values are 1-3414 MiBps, with the upper
     *   limit depending on Region. To increase this limit, contact AWS Support . For more
     *   information, see
     *   [Amazon EFS quotas that you can increase](https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits)
     *   in the *Amazon EFS User Guide* .
     */
    public fun provisionedThroughputInMibps(provisionedThroughputInMibps: Number) {
        cdkBuilder.provisionedThroughputInMibps(provisionedThroughputInMibps)
    }

    /**
     * @param replicationConfiguration Describes the replication configuration for a specific file
     *   system.
     */
    public fun replicationConfiguration(replicationConfiguration: IResolvable) {
        cdkBuilder.replicationConfiguration(replicationConfiguration)
    }

    /**
     * @param replicationConfiguration Describes the replication configuration for a specific file
     *   system.
     */
    public fun replicationConfiguration(
        replicationConfiguration: CfnFileSystem.ReplicationConfigurationProperty
    ) {
        cdkBuilder.replicationConfiguration(replicationConfiguration)
    }

    /**
     * @param throughputMode Specifies the throughput mode for the file system. The mode can be
     *   `bursting` , `provisioned` , or `elastic` . If you set `ThroughputMode` to `provisioned` ,
     *   you must also set a value for `ProvisionedThroughputInMibps` . After you create the file
     *   system, you can decrease your file system's Provisioned throughput or change between the
     *   throughput modes, with certain time restrictions. For more information, see
     *   [Specifying throughput with provisioned mode](https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput)
     *   in the *Amazon EFS User Guide* .
     *
     * Default is `bursting` .
     */
    public fun throughputMode(throughputMode: String) {
        cdkBuilder.throughputMode(throughputMode)
    }

    public fun build(): CfnFileSystemProps {
        if (_fileSystemTags.isNotEmpty()) cdkBuilder.fileSystemTags(_fileSystemTags)
        if (_lifecyclePolicies.isNotEmpty()) cdkBuilder.lifecyclePolicies(_lifecyclePolicies)
        return cdkBuilder.build()
    }
}
