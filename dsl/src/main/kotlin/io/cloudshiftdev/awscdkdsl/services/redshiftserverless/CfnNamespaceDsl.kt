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

package io.cloudshiftdev.awscdkdsl.services.redshiftserverless

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshiftserverless.CfnNamespace
import software.constructs.Construct

/**
 * A collection of database objects and users.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshiftserverless.*;
 * Object namespaceResourcePolicy;
 * CfnNamespace cfnNamespace = CfnNamespace.Builder.create(this, "MyCfnNamespace")
 * .namespaceName("namespaceName")
 * // the properties below are optional
 * .adminPasswordSecretKmsKeyId("adminPasswordSecretKmsKeyId")
 * .adminUsername("adminUsername")
 * .adminUserPassword("adminUserPassword")
 * .dbName("dbName")
 * .defaultIamRoleArn("defaultIamRoleArn")
 * .finalSnapshotName("finalSnapshotName")
 * .finalSnapshotRetentionPeriod(123)
 * .iamRoles(List.of("iamRoles"))
 * .kmsKeyId("kmsKeyId")
 * .logExports(List.of("logExports"))
 * .manageAdminPassword(false)
 * .namespaceResourcePolicy(namespaceResourcePolicy)
 * .redshiftIdcApplicationArn("redshiftIdcApplicationArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html)
 */
@CdkDslMarker
public class CfnNamespaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNamespace.Builder = CfnNamespace.Builder.create(scope, id)

    private val _iamRoles: MutableList<String> = mutableListOf()

    private val _logExports: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ID of the AWS Key Management Service (KMS) key used to encrypt and store the namespace's
     * admin credentials secret.
     *
     * You can only use this parameter if `ManageAdminPassword` is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminpasswordsecretkmskeyid)
     *
     * @param adminPasswordSecretKmsKeyId The ID of the AWS Key Management Service (KMS) key used to
     *   encrypt and store the namespace's admin credentials secret.
     */
    public fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String) {
        cdkBuilder.adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId)
    }

    /**
     * The password of the administrator for the primary database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminuserpassword)
     *
     * @param adminUserPassword The password of the administrator for the primary database created
     *   in the namespace.
     */
    public fun adminUserPassword(adminUserPassword: String) {
        cdkBuilder.adminUserPassword(adminUserPassword)
    }

    /**
     * The username of the administrator for the primary database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-adminusername)
     *
     * @param adminUsername The username of the administrator for the primary database created in
     *   the namespace.
     */
    public fun adminUsername(adminUsername: String) {
        cdkBuilder.adminUsername(adminUsername)
    }

    /**
     * The name of the primary database created in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-dbname)
     *
     * @param dbName The name of the primary database created in the namespace.
     */
    public fun dbName(dbName: String) {
        cdkBuilder.dbName(dbName)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-defaultiamrolearn)
     *
     * @param defaultIamRoleArn The Amazon Resource Name (ARN) of the IAM role to set as a default
     *   in the namespace.
     */
    public fun defaultIamRoleArn(defaultIamRoleArn: String) {
        cdkBuilder.defaultIamRoleArn(defaultIamRoleArn)
    }

    /**
     * The name of the snapshot to be created before the namespace is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-finalsnapshotname)
     *
     * @param finalSnapshotName The name of the snapshot to be created before the namespace is
     *   deleted.
     */
    public fun finalSnapshotName(finalSnapshotName: String) {
        cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    /**
     * How long to retain the final snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-finalsnapshotretentionperiod)
     *
     * @param finalSnapshotRetentionPeriod How long to retain the final snapshot.
     */
    public fun finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod: Number) {
        cdkBuilder.finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod)
    }

    /**
     * A list of IAM roles to associate with the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-iamroles)
     *
     * @param iamRoles A list of IAM roles to associate with the namespace.
     */
    public fun iamRoles(vararg iamRoles: String) {
        _iamRoles.addAll(listOf(*iamRoles))
    }

    /**
     * A list of IAM roles to associate with the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-iamroles)
     *
     * @param iamRoles A list of IAM roles to associate with the namespace.
     */
    public fun iamRoles(iamRoles: Collection<String>) {
        _iamRoles.addAll(iamRoles)
    }

    /**
     * The ID of the AWS Key Management Service key used to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-kmskeyid)
     *
     * @param kmsKeyId The ID of the AWS Key Management Service key used to encrypt your data.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The types of logs the namespace can export.
     *
     * Available export types are `userlog` , `connectionlog` , and `useractivitylog` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-logexports)
     *
     * @param logExports The types of logs the namespace can export.
     */
    public fun logExports(vararg logExports: String) {
        _logExports.addAll(listOf(*logExports))
    }

    /**
     * The types of logs the namespace can export.
     *
     * Available export types are `userlog` , `connectionlog` , and `useractivitylog` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-logexports)
     *
     * @param logExports The types of logs the namespace can export.
     */
    public fun logExports(logExports: Collection<String>) {
        _logExports.addAll(logExports)
    }

    /**
     * If true, Amazon Redshift uses AWS Secrets Manager to manage the namespace's admin
     * credentials.
     *
     * You can't use `AdminUserPassword` if `ManageAdminPassword` is true. If `ManageAdminPassword`
     * is `false` or not set, Amazon Redshift uses `AdminUserPassword` for the admin user account's
     * password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-manageadminpassword)
     *
     * @param manageAdminPassword If true, Amazon Redshift uses AWS Secrets Manager to manage the
     *   namespace's admin credentials.
     */
    public fun manageAdminPassword(manageAdminPassword: Boolean) {
        cdkBuilder.manageAdminPassword(manageAdminPassword)
    }

    /**
     * If true, Amazon Redshift uses AWS Secrets Manager to manage the namespace's admin
     * credentials.
     *
     * You can't use `AdminUserPassword` if `ManageAdminPassword` is true. If `ManageAdminPassword`
     * is `false` or not set, Amazon Redshift uses `AdminUserPassword` for the admin user account's
     * password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-manageadminpassword)
     *
     * @param manageAdminPassword If true, Amazon Redshift uses AWS Secrets Manager to manage the
     *   namespace's admin credentials.
     */
    public fun manageAdminPassword(manageAdminPassword: IResolvable) {
        cdkBuilder.manageAdminPassword(manageAdminPassword)
    }

    /**
     * The name of the namespace.
     *
     * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved word.
     * A list of reserved words can be found in
     * [Reserved Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the
     * Amazon Redshift Database Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-namespacename)
     *
     * @param namespaceName The name of the namespace.
     */
    public fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
    }

    /**
     * The resource policy that will be attached to the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-namespaceresourcepolicy)
     *
     * @param namespaceResourcePolicy The resource policy that will be attached to the namespace.
     */
    public fun namespaceResourcePolicy(namespaceResourcePolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(namespaceResourcePolicy)
        cdkBuilder.namespaceResourcePolicy(builder.map)
    }

    /**
     * The resource policy that will be attached to the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-namespaceresourcepolicy)
     *
     * @param namespaceResourcePolicy The resource policy that will be attached to the namespace.
     */
    public fun namespaceResourcePolicy(namespaceResourcePolicy: Any) {
        cdkBuilder.namespaceResourcePolicy(namespaceResourcePolicy)
    }

    /**
     * The ARN for the Redshift application that integrates with IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-redshiftidcapplicationarn)
     *
     * @param redshiftIdcApplicationArn The ARN for the Redshift application that integrates with
     *   IAM Identity Center.
     */
    public fun redshiftIdcApplicationArn(redshiftIdcApplicationArn: String) {
        cdkBuilder.redshiftIdcApplicationArn(redshiftIdcApplicationArn)
    }

    /**
     * The map of the key-value pairs used to tag the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-tags)
     *
     * @param tags The map of the key-value pairs used to tag the namespace.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The map of the key-value pairs used to tag the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html#cfn-redshiftserverless-namespace-tags)
     *
     * @param tags The map of the key-value pairs used to tag the namespace.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnNamespace {
        if (_iamRoles.isNotEmpty()) cdkBuilder.iamRoles(_iamRoles)
        if (_logExports.isNotEmpty()) cdkBuilder.logExports(_logExports)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
