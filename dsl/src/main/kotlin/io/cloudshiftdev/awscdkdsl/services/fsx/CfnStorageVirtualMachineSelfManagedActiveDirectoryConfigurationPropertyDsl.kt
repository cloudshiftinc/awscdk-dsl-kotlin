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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine

/**
 * The configuration that Amazon FSx uses to join a FSx for Windows File Server file system or an
 * FSx for ONTAP storage virtual machine (SVM) to a self-managed (including on-premises) Microsoft
 * Active Directory (AD) directory.
 *
 * For more information, see
 * [Using Amazon FSx for Windows with your self-managed Microsoft Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html)
 * or
 * [Managing FSx for ONTAP SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * SelfManagedActiveDirectoryConfigurationProperty selfManagedActiveDirectoryConfigurationProperty =
 * SelfManagedActiveDirectoryConfigurationProperty.builder()
 * .dnsIps(List.of("dnsIps"))
 * .domainName("domainName")
 * .fileSystemAdministratorsGroup("fileSystemAdministratorsGroup")
 * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
 * .password("password")
 * .userName("userName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html)
 */
@CdkDslMarker
public class CfnStorageVirtualMachineSelfManagedActiveDirectoryConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty.Builder =
        CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty.builder()

    private val _dnsIps: MutableList<String> = mutableListOf()

    /**
     * @param dnsIps A list of up to three IP addresses of DNS servers or domain controllers in the
     *   self-managed AD directory.
     */
    public fun dnsIps(vararg dnsIps: String) {
        _dnsIps.addAll(listOf(*dnsIps))
    }

    /**
     * @param dnsIps A list of up to three IP addresses of DNS servers or domain controllers in the
     *   self-managed AD directory.
     */
    public fun dnsIps(dnsIps: Collection<String>) {
        _dnsIps.addAll(dnsIps)
    }

    /**
     * @param domainName The fully qualified domain name of the self-managed AD directory, such as
     *   `corp.example.com` .
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * @param fileSystemAdministratorsGroup (Optional) The name of the domain group whose members
     *   are granted administrative privileges for the file system. Administrative privileges
     *   include taking ownership of files and folders, setting audit controls (audit ACLs) on files
     *   and folders, and administering the file system remotely by using the FSx Remote PowerShell.
     *   The group that you specify must already exist in your domain. If you don't provide one,
     *   your AD domain's Domain Admins group is used.
     */
    public fun fileSystemAdministratorsGroup(fileSystemAdministratorsGroup: String) {
        cdkBuilder.fileSystemAdministratorsGroup(fileSystemAdministratorsGroup)
    }

    /**
     * @param organizationalUnitDistinguishedName (Optional) The fully qualified distinguished name
     *   of the organizational unit within your self-managed AD directory. Amazon FSx only accepts
     *   OU as the direct parent of the file system. An example is
     *   `OU=FSx,DC=yourdomain,DC=corp,DC=com` . To learn more, see
     *   [RFC 2253](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc2253) . If none is
     *   provided, the FSx file system is created in the default location of your self-managed AD
     *   directory.
     *
     * Only Organizational Unit (OU) objects can be the direct parent of the file system that you're
     * creating.
     */
    public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
        cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
    }

    /**
     * @param password The password for the service account on your self-managed AD domain that
     *   Amazon FSx will use to join to your AD domain.
     */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /**
     * @param userName The user name for the service account on your self-managed AD domain that
     *   Amazon FSx will use to join to your AD domain. This account must have the permission to
     *   join computers to the domain in the organizational unit provided in
     *   `OrganizationalUnitDistinguishedName` , or in the default location of your AD domain.
     */
    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty {
        if (_dnsIps.isNotEmpty()) cdkBuilder.dnsIps(_dnsIps)
        return cdkBuilder.build()
    }
}
