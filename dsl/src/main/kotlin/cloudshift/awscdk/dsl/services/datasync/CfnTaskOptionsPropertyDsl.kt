@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnTask

/**
 * Represents the options that are available to control the behavior of a
 * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
 * operation. This behavior includes preserving metadata, such as user ID (UID), group ID (GID), and
 * file permissions; overwriting files in the destination; data integrity verification; and so on.
 *
 * A task has a set of default options associated with it. If you don't specify an option in
 * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
 * , the default value is used. You can override the default options on each task execution by
 * specifying an overriding `Options` value to
 * [StartTaskExecution](https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * OptionsProperty optionsProperty = OptionsProperty.builder()
 * .atime("atime")
 * .bytesPerSecond(123)
 * .gid("gid")
 * .logLevel("logLevel")
 * .mtime("mtime")
 * .objectTags("objectTags")
 * .overwriteMode("overwriteMode")
 * .posixPermissions("posixPermissions")
 * .preserveDeletedFiles("preserveDeletedFiles")
 * .preserveDevices("preserveDevices")
 * .securityDescriptorCopyFlags("securityDescriptorCopyFlags")
 * .taskQueueing("taskQueueing")
 * .transferMode("transferMode")
 * .uid("uid")
 * .verifyMode("verifyMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-options.html)
 */
@CdkDslMarker
public class CfnTaskOptionsPropertyDsl {
  private val cdkBuilder: CfnTask.OptionsProperty.Builder = CfnTask.OptionsProperty.builder()

  /**
   * @param atime A file metadata value that shows the last time that a file was accessed (that is,
   * when the file was read or written to).
   * If you set `Atime` to `BEST_EFFORT` , AWS DataSync attempts to preserve the original `Atime`
   * attribute on all source files (that is, the version before the PREPARING phase). However, `Atime`
   * 's behavior is not fully standard across platforms, so AWS DataSync can only do this on a
   * best-effort basis.
   *
   * Default value: `BEST_EFFORT`
   *
   * `BEST_EFFORT` : Attempt to preserve the per-file `Atime` value (recommended).
   *
   * `NONE` : Ignore `Atime` .
   *
   *
   * If `Atime` is set to `BEST_EFFORT` , `Mtime` must be set to `PRESERVE` .
   *
   * If `Atime` is set to `NONE` , `Mtime` must also be `NONE` .
   */
  public fun atime(atime: String) {
    cdkBuilder.atime(atime)
  }

  /**
   * @param bytesPerSecond A value that limits the bandwidth used by AWS DataSync .
   * For example, if you want AWS DataSync to use a maximum of 1 MB, set this value to `1048576`
   * (=1024*1024).
   */
  public fun bytesPerSecond(bytesPerSecond: Number) {
    cdkBuilder.bytesPerSecond(bytesPerSecond)
  }

  /**
   * @param gid The group ID (GID) of the file's owners.
   * Default value: `INT_VALUE`
   *
   * `INT_VALUE` : Preserve the integer value of the user ID (UID) and group ID (GID) (recommended).
   *
   * `NAME` : Currently not supported.
   *
   * `NONE` : Ignore the UID and GID.
   */
  public fun gid(gid: String) {
    cdkBuilder.gid(gid)
  }

  /**
   * @param logLevel Specifies the type of logs that DataSync publishes to a Amazon CloudWatch Logs
   * log group.
   * To specify the log group, see
   * [CloudWatchLogGroupArn](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn)
   * .
   *
   * If you set `LogLevel` to `OFF` , no logs are published. `BASIC` publishes logs on errors for
   * individual files transferred. `TRANSFER` publishes logs for every file or object that is
   * transferred and integrity checked.
   */
  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  /**
   * @param mtime A value that indicates the last time that a file was modified (that is, a file was
   * written to) before the PREPARING phase.
   * This option is required for cases when you need to run the same task more than one time.
   *
   * Default value: `PRESERVE`
   *
   * `PRESERVE` : Preserve original `Mtime` (recommended)
   *
   * `NONE` : Ignore `Mtime` .
   *
   *
   * If `Mtime` is set to `PRESERVE` , `Atime` must be set to `BEST_EFFORT` .
   *
   * If `Mtime` is set to `NONE` , `Atime` must also be set to `NONE` .
   */
  public fun mtime(mtime: String) {
    cdkBuilder.mtime(mtime)
  }

  /**
   * @param objectTags Specifies whether object tags are preserved when transferring between object
   * storage systems.
   * If you want your DataSync task to ignore object tags, specify the `NONE` value.
   *
   * Default Value: `PRESERVE`
   */
  public fun objectTags(objectTags: String) {
    cdkBuilder.objectTags(objectTags)
  }

  /**
   * @param overwriteMode Specifies whether data at the destination location should be overwritten
   * or preserved.
   * If set to `NEVER` , a destination file for example will not be replaced by a source file (even
   * if the destination file differs from the source file). If you modify files in the destination and
   * you sync the files, you can use this value to protect against overwriting those changes.
   *
   * Some storage classes have specific behaviors that can affect your Amazon S3 storage cost. For
   * detailed information, see [Considerations when working with Amazon S3 storage classes in
   * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
   * .
   */
  public fun overwriteMode(overwriteMode: String) {
    cdkBuilder.overwriteMode(overwriteMode)
  }

  /**
   * @param posixPermissions A value that determines which users or groups can access a file for a
   * specific purpose, such as reading, writing, or execution of the file.
   * This option should be set only for Network File System (NFS), Amazon EFS, and Amazon S3
   * locations. For more information about what metadata is copied by DataSync, see [Metadata Copied by
   * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied)
   * .
   *
   * Default value: `PRESERVE`
   *
   * `PRESERVE` : Preserve POSIX-style permissions (recommended).
   *
   * `NONE` : Ignore permissions.
   *
   *
   * AWS DataSync can preserve extant permissions of a source location.
   */
  public fun posixPermissions(posixPermissions: String) {
    cdkBuilder.posixPermissions(posixPermissions)
  }

  /**
   * @param preserveDeletedFiles A value that specifies whether files in the destination that don't
   * exist in the source file system are preserved.
   * This option can affect your storage costs. If your task deletes objects, you might incur
   * minimum storage duration charges for certain storage classes. For detailed information, see
   * [Considerations when working with Amazon S3 storage classes in
   * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
   * in the *AWS DataSync User Guide* .
   *
   * Default value: `PRESERVE`
   *
   * `PRESERVE` : Ignore destination files that aren't present in the source (recommended).
   *
   * `REMOVE` : Delete destination files that aren't present in the source.
   */
  public fun preserveDeletedFiles(preserveDeletedFiles: String) {
    cdkBuilder.preserveDeletedFiles(preserveDeletedFiles)
  }

  /**
   * @param preserveDevices A value that determines whether AWS DataSync should preserve the
   * metadata of block and character devices in the source file system, and re-create the files with
   * that device name and metadata on the destination.
   * DataSync does not copy the contents of such devices, only the name and metadata.
   *
   *
   * AWS DataSync can't sync the actual contents of such devices, because they are nonterminal and
   * don't return an end-of-file (EOF) marker.
   *
   *
   * Default value: `NONE`
   *
   * `NONE` : Ignore special devices (recommended).
   *
   * `PRESERVE` : Preserve character and block device metadata. This option isn't currently
   * supported for Amazon EFS.
   */
  public fun preserveDevices(preserveDevices: String) {
    cdkBuilder.preserveDevices(preserveDevices)
  }

  /**
   * @param securityDescriptorCopyFlags A value that determines which components of the SMB security
   * descriptor are copied from source to destination objects.
   * This value is only used for transfers between SMB and Amazon FSx for Windows File Server
   * locations, or between two Amazon FSx for Windows File Server locations. For more information about
   * how DataSync handles metadata, see [How DataSync Handles Metadata and Special
   * Files](https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html) .
   *
   * Default value: `OWNER_DACL`
   *
   * `OWNER_DACL` : For each copied object, DataSync copies the following metadata:
   *
   * * Object owner.
   * * NTFS discretionary access control lists (DACLs), which determine whether to grant access to
   * an object.
   *
   * When you use option, DataSync does NOT copy the NTFS system access control lists (SACLs), which
   * are used by administrators to log attempts to access a secured object.
   *
   * `OWNER_DACL_SACL` : For each copied object, DataSync copies the following metadata:
   *
   * * Object owner.
   * * NTFS discretionary access control lists (DACLs), which determine whether to grant access to
   * an object.
   * * NTFS system access control lists (SACLs), which are used by administrators to log attempts to
   * access a secured object.
   *
   * Copying SACLs requires granting additional permissions to the Windows user that DataSync uses
   * to access your SMB location. For information about choosing a user that ensures sufficient
   * permissions to files, folders, and metadata, see
   * [user](https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#SMBuser) .
   *
   * `NONE` : None of the SMB security descriptor components are copied. Destination objects are
   * owned by the user that was provided for accessing the destination location. DACLs and SACLs are
   * set based on the destination server’s configuration.
   */
  public fun securityDescriptorCopyFlags(securityDescriptorCopyFlags: String) {
    cdkBuilder.securityDescriptorCopyFlags(securityDescriptorCopyFlags)
  }

  /**
   * @param taskQueueing Specifies whether your transfer tasks should be put into a queue during
   * certain scenarios when [running multiple
   * tasks](https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#running-multiple-tasks)
   * . This is `ENABLED` by default.
   */
  public fun taskQueueing(taskQueueing: String) {
    cdkBuilder.taskQueueing(taskQueueing)
  }

  /**
   * @param transferMode A value that determines whether DataSync transfers only the data and
   * metadata that differ between the source and the destination location, or whether DataSync
   * transfers all the content from the source, without comparing it to the destination location.
   * `CHANGED` : DataSync copies only data or metadata that is new or different from the source
   * location to the destination location.
   *
   * `ALL` : DataSync copies all source location content to the destination, without comparing it to
   * existing content on the destination.
   */
  public fun transferMode(transferMode: String) {
    cdkBuilder.transferMode(transferMode)
  }

  /**
   * @param uid The user ID (UID) of the file's owner.
   * Default value: `INT_VALUE`
   *
   * `INT_VALUE` : Preserve the integer value of the UID and group ID (GID) (recommended).
   *
   * `NAME` : Currently not supported
   *
   * `NONE` : Ignore the UID and GID.
   */
  public fun uid(uid: String) {
    cdkBuilder.uid(uid)
  }

  /**
   * @param verifyMode A value that determines whether a data integrity verification is performed at
   * the end of a task execution after all data and metadata have been transferred.
   * For more information, see [Configure task
   * settings](https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html) .
   *
   * Default value: `POINT_IN_TIME_CONSISTENT`
   *
   * `ONLY_FILES_TRANSFERRED` (recommended): Perform verification only on files that were
   * transferred.
   *
   * `POINT_IN_TIME_CONSISTENT` : Scan the entire source and entire destination at the end of the
   * transfer to verify that the source and destination are fully synchronized. This option isn't
   * supported when transferring to S3 Glacier or S3 Glacier Deep Archive storage classes.
   *
   * `NONE` : No additional verification is done at the end of the transfer, but all data
   * transmissions are integrity-checked with checksum verification during the transfer.
   */
  public fun verifyMode(verifyMode: String) {
    cdkBuilder.verifyMode(verifyMode)
  }

  public fun build(): CfnTask.OptionsProperty = cdkBuilder.build()
}
