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

package io.cloudshiftdev.awscdkdsl.services.fsx

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnFileSystem

/**
 * The OpenZFS configuration for the file system that's being created.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * OpenZFSConfigurationProperty openZFSConfigurationProperty =
 * OpenZFSConfigurationProperty.builder()
 * .deploymentType("deploymentType")
 * // the properties below are optional
 * .automaticBackupRetentionDays(123)
 * .copyTagsToBackups(false)
 * .copyTagsToVolumes(false)
 * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
 * .diskIopsConfiguration(DiskIopsConfigurationProperty.builder()
 * .iops(123)
 * .mode("mode")
 * .build())
 * .options(List.of("options"))
 * .rootVolumeConfiguration(RootVolumeConfigurationProperty.builder()
 * .copyTagsToSnapshots(false)
 * .dataCompressionType("dataCompressionType")
 * .nfsExports(List.of(NfsExportsProperty.builder()
 * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
 * .clients("clients")
 * .options(List.of("options"))
 * .build()))
 * .build()))
 * .readOnly(false)
 * .recordSizeKiB(123)
 * .userAndGroupQuotas(List.of(UserAndGroupQuotasProperty.builder()
 * .id(123)
 * .storageCapacityQuotaGiB(123)
 * .type("type")
 * .build()))
 * .build())
 * .throughputCapacity(123)
 * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html)
 */
@CdkDslMarker
public class CfnFileSystemOpenZFSConfigurationPropertyDsl {
    private val cdkBuilder: CfnFileSystem.OpenZFSConfigurationProperty.Builder =
        CfnFileSystem.OpenZFSConfigurationProperty.builder()

    private val _options: MutableList<String> = mutableListOf()

    /**
     * @param automaticBackupRetentionDays The number of days to retain automatic backups. Setting
     *   this property to `0` disables automatic backups. You can retain automatic backups for a
     *   maximum of 90 days. The default is `30` .
     */
    public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
        cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
    }

    /**
     * @param copyTagsToBackups A Boolean value indicating whether tags for the file system should
     *   be copied to backups. This value defaults to `false` . If it's set to `true` , all tags for
     *   the file system are copied to all automatic and user-initiated backups where the user
     *   doesn't specify tags. If this value is `true` , and you specify one or more tags, only the
     *   specified tags are copied to backups. If you specify one or more tags when creating a
     *   user-initiated backup, no tags are copied from the file system, regardless of this value.
     */
    public fun copyTagsToBackups(copyTagsToBackups: Boolean) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
    }

    /**
     * @param copyTagsToBackups A Boolean value indicating whether tags for the file system should
     *   be copied to backups. This value defaults to `false` . If it's set to `true` , all tags for
     *   the file system are copied to all automatic and user-initiated backups where the user
     *   doesn't specify tags. If this value is `true` , and you specify one or more tags, only the
     *   specified tags are copied to backups. If you specify one or more tags when creating a
     *   user-initiated backup, no tags are copied from the file system, regardless of this value.
     */
    public fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
    }

    /**
     * @param copyTagsToVolumes A Boolean value indicating whether tags for the file system should
     *   be copied to volumes. This value defaults to `false` . If it's set to `true` , all tags for
     *   the file system are copied to volumes where the user doesn't specify tags. If this value is
     *   `true` , and you specify one or more tags, only the specified tags are copied to volumes.
     *   If you specify one or more tags when creating the volume, no tags are copied from the file
     *   system, regardless of this value.
     */
    public fun copyTagsToVolumes(copyTagsToVolumes: Boolean) {
        cdkBuilder.copyTagsToVolumes(copyTagsToVolumes)
    }

    /**
     * @param copyTagsToVolumes A Boolean value indicating whether tags for the file system should
     *   be copied to volumes. This value defaults to `false` . If it's set to `true` , all tags for
     *   the file system are copied to volumes where the user doesn't specify tags. If this value is
     *   `true` , and you specify one or more tags, only the specified tags are copied to volumes.
     *   If you specify one or more tags when creating the volume, no tags are copied from the file
     *   system, regardless of this value.
     */
    public fun copyTagsToVolumes(copyTagsToVolumes: IResolvable) {
        cdkBuilder.copyTagsToVolumes(copyTagsToVolumes)
    }

    /**
     * @param dailyAutomaticBackupStartTime A recurring daily time, in the format `HH:MM` . `HH` is
     *   the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the hour. For
     *   example, `05:00` specifies 5 AM daily.
     */
    public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
        cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
    }

    /**
     * @param deploymentType Specifies the file system deployment type. Single AZ deployment types
     *   are configured for redundancy within a single Availability Zone in an AWS Region . Valid
     *   values are the following:
     * * `MULTI_AZ_1` - Creates file systems with high availability that are configured for Multi-AZ
     *   redundancy to tolerate temporary unavailability in Availability Zones (AZs). `Multi_AZ_1`
     *   is available in the following AWS Regions :
     * * `SINGLE_AZ_1` - (Default) Creates file systems with throughput capacities of 64 - 4,096
     *   MB/s. `Single_AZ_1` is available in all AWS Regions where Amazon FSx for OpenZFS is
     *   available.
     * * `SINGLE_AZ_2` - Creates file systems with throughput capacities of 160 - 10,240 MB/s using
     *   an NVMe L2ARC cache. `Single_AZ_2` is available only in the US East (N. Virginia), US East
     *   (Ohio), US West (Oregon), and Europe (Ireland) AWS Regions .
     *
     * For more information, see:
     * [Deployment type availability](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions)
     * and
     * [File system performance](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance)
     * in the *Amazon FSx for OpenZFS User Guide* .
     */
    public fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
    }

    /**
     * @param diskIopsConfiguration The SSD IOPS (input/output operations per second) configuration
     *   for an Amazon FSx for NetApp ONTAP, Amazon FSx for Windows File Server, or FSx for OpenZFS
     *   file system. By default, Amazon FSx automatically provisions 3 IOPS per GB of storage
     *   capacity. You can provision additional IOPS per GB of storage. The configuration consists
     *   of the total number of provisioned SSD IOPS and how it is was provisioned, or the mode (by
     *   the customer or by Amazon FSx).
     */
    public fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration)
    }

    /**
     * @param diskIopsConfiguration The SSD IOPS (input/output operations per second) configuration
     *   for an Amazon FSx for NetApp ONTAP, Amazon FSx for Windows File Server, or FSx for OpenZFS
     *   file system. By default, Amazon FSx automatically provisions 3 IOPS per GB of storage
     *   capacity. You can provision additional IOPS per GB of storage. The configuration consists
     *   of the total number of provisioned SSD IOPS and how it is was provisioned, or the mode (by
     *   the customer or by Amazon FSx).
     */
    public fun diskIopsConfiguration(
        diskIopsConfiguration: CfnFileSystem.DiskIopsConfigurationProperty
    ) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration)
    }

    /**
     * @param options To delete a file system if there are child volumes present below the root
     *   volume, use the string `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` . If your file system has child
     *   volumes and you don't use this option, the delete request will fail.
     */
    public fun options(vararg options: String) {
        _options.addAll(listOf(*options))
    }

    /**
     * @param options To delete a file system if there are child volumes present below the root
     *   volume, use the string `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` . If your file system has child
     *   volumes and you don't use this option, the delete request will fail.
     */
    public fun options(options: Collection<String>) {
        _options.addAll(options)
    }

    /**
     * @param rootVolumeConfiguration The configuration Amazon FSx uses when creating the root value
     *   of the Amazon FSx for OpenZFS file system. All volumes are children of the root volume.
     */
    public fun rootVolumeConfiguration(rootVolumeConfiguration: IResolvable) {
        cdkBuilder.rootVolumeConfiguration(rootVolumeConfiguration)
    }

    /**
     * @param rootVolumeConfiguration The configuration Amazon FSx uses when creating the root value
     *   of the Amazon FSx for OpenZFS file system. All volumes are children of the root volume.
     */
    public fun rootVolumeConfiguration(
        rootVolumeConfiguration: CfnFileSystem.RootVolumeConfigurationProperty
    ) {
        cdkBuilder.rootVolumeConfiguration(rootVolumeConfiguration)
    }

    /**
     * @param throughputCapacity Specifies the throughput of an Amazon FSx for OpenZFS file system,
     *   measured in megabytes per second (MBps). Valid values depend on the DeploymentType you
     *   choose, as follows:
     * * For `SINGLE_AZ_1` , valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MBps.
     * * For `SINGLE_AZ_2` , valid values are 160, 320, 640, 1280, 2560, 3840, 5120, 7680, or 10240
     *   MBps.
     *
     * You pay for additional throughput capacity that you provision.
     */
    public fun throughputCapacity(throughputCapacity: Number) {
        cdkBuilder.throughputCapacity(throughputCapacity)
    }

    /**
     * @param weeklyMaintenanceStartTime A recurring weekly time, in the format `D:HH:MM` . `D` is
     *   the day of the week, for which 1 represents Monday and 7 represents Sunday. For further
     *   details, see
     *   [the ISO-8601 spec as described on Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date)
     *   .
     *
     * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
     * hour.
     *
     * For example, `1:05:00` specifies maintenance at 5 AM Monday.
     */
    public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
        cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
    }

    public fun build(): CfnFileSystem.OpenZFSConfigurationProperty {
        if (_options.isNotEmpty()) cdkBuilder.options(_options)
        return cdkBuilder.build()
    }
}
