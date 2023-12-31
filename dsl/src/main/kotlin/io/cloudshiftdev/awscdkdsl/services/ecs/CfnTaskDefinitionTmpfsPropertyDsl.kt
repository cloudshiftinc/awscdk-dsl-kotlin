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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * The container path, mount options, and size of the tmpfs mount.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * TmpfsProperty tmpfsProperty = TmpfsProperty.builder()
 * .size(123)
 * // the properties below are optional
 * .containerPath("containerPath")
 * .mountOptions(List.of("mountOptions"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionTmpfsPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.TmpfsProperty.Builder =
        CfnTaskDefinition.TmpfsProperty.builder()

    private val _mountOptions: MutableList<String> = mutableListOf()

    /** @param containerPath The absolute file path where the tmpfs volume is to be mounted. */
    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param mountOptions The list of tmpfs volume mount options. Valid values: `"defaults" | "ro"
     *   | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" |
     *   "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime"
     *   | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" |
     *   "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" |
     *   "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"`
     */
    public fun mountOptions(vararg mountOptions: String) {
        _mountOptions.addAll(listOf(*mountOptions))
    }

    /**
     * @param mountOptions The list of tmpfs volume mount options. Valid values: `"defaults" | "ro"
     *   | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" |
     *   "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime"
     *   | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" |
     *   "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" |
     *   "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"`
     */
    public fun mountOptions(mountOptions: Collection<String>) {
        _mountOptions.addAll(mountOptions)
    }

    /** @param size The maximum size (in MiB) of the tmpfs volume. */
    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun build(): CfnTaskDefinition.TmpfsProperty {
        if (_mountOptions.isNotEmpty()) cdkBuilder.mountOptions(_mountOptions)
        return cdkBuilder.build()
    }
}
