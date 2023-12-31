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

package io.cloudshiftdev.awscdkdsl.services.datasync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP

/**
 * Specifies how DataSync can access a location using the NFS protocol.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * NfsMountOptionsProperty nfsMountOptionsProperty = NfsMountOptionsProperty.builder()
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-nfsmountoptions.html)
 */
@CdkDslMarker
public class CfnLocationFSxONTAPNfsMountOptionsPropertyDsl {
    private val cdkBuilder: CfnLocationFSxONTAP.NfsMountOptionsProperty.Builder =
        CfnLocationFSxONTAP.NfsMountOptionsProperty.builder()

    /**
     * @param version Specifies the NFS version that you want DataSync to use when mounting your NFS
     *   share. If the server refuses to use the version specified, the task fails.
     *
     * You can specify the following options:
     * * `AUTOMATIC` (default): DataSync chooses NFS version 4.1.
     * * `NFS3` : Stateless protocol version that allows for asynchronous writes on the server.
     * * `NFSv4_0` : Stateful, firewall-friendly protocol version that supports delegations and
     *   pseudo file systems.
     * * `NFSv4_1` : Stateful protocol version that supports sessions, directory delegations, and
     *   parallel data processing. NFS version 4.1 also includes all features available in version
     *   4.0.
     *
     * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnLocationFSxONTAP.NfsMountOptionsProperty = cdkBuilder.build()
}
