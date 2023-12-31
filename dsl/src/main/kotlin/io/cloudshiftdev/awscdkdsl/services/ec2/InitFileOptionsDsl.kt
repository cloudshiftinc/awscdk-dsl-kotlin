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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.InitFileOptions
import software.amazon.awscdk.services.ec2.InitServiceRestartHandle

/**
 * Options for InitFile.
 *
 * Example:
 * ```
 * Bucket myBucket;
 * InitServiceRestartHandle handle = new InitServiceRestartHandle();
 * CloudFormationInit.fromElements(InitFile.fromString("/etc/nginx/nginx.conf", "...",
 * InitFileOptions.builder().serviceRestartHandles(List.of(handle)).build()),
 * InitSource.fromS3Object("/var/www/html", myBucket, "html.zip",
 * InitSourceOptions.builder().serviceRestartHandles(List.of(handle)).build()),
 * InitService.enable("nginx", InitServiceOptions.builder()
 * .serviceRestartHandle(handle)
 * .build()));
 * ```
 */
@CdkDslMarker
public class InitFileOptionsDsl {
    private val cdkBuilder: InitFileOptions.Builder = InitFileOptions.builder()

    private val _serviceRestartHandles: MutableList<InitServiceRestartHandle> = mutableListOf()

    /**
     * @param base64Encoded True if the inlined content (from a string or file) should be treated as
     *   base64 encoded. Only applicable for inlined string and file content.
     */
    public fun base64Encoded(base64Encoded: Boolean) {
        cdkBuilder.base64Encoded(base64Encoded)
    }

    /**
     * @param group The name of the owning group for this file. Not supported for Windows systems.
     */
    public fun group(group: String) {
        cdkBuilder.group(group)
    }

    /**
     * @param mode A six-digit octal value representing the mode for this file. Use the first three
     *   digits for symlinks and the last three digits for setting permissions. To create a symlink,
     *   specify 120xxx, where xxx defines the permissions of the target file. To specify
     *   permissions for a file, use the last three digits, such as 000644.
     *
     * Not supported for Windows systems.
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /**
     * @param owner The name of the owning user for this file. Not supported for Windows systems.
     */
    public fun owner(owner: String) {
        cdkBuilder.owner(owner)
    }

    /** @param serviceRestartHandles Restart the given service after this file has been written. */
    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle) {
        _serviceRestartHandles.addAll(listOf(*serviceRestartHandles))
    }

    /** @param serviceRestartHandles Restart the given service after this file has been written. */
    public fun serviceRestartHandles(serviceRestartHandles: Collection<InitServiceRestartHandle>) {
        _serviceRestartHandles.addAll(serviceRestartHandles)
    }

    public fun build(): InitFileOptions {
        if (_serviceRestartHandles.isNotEmpty())
            cdkBuilder.serviceRestartHandles(_serviceRestartHandles)
        return cdkBuilder.build()
    }
}
