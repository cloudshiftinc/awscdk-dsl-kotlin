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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnBucket
import software.constructs.Construct

/**
 * The `AWS::Lightsail::Bucket` resource specifies a bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CfnBucket cfnBucket = CfnBucket.Builder.create(this, "MyCfnBucket")
 * .bucketName("bucketName")
 * .bundleId("bundleId")
 * // the properties below are optional
 * .accessRules(AccessRulesProperty.builder()
 * .allowPublicOverrides(false)
 * .objectAccess("objectAccess")
 * .build())
 * .objectVersioning(false)
 * .readOnlyAccessAccounts(List.of("readOnlyAccessAccounts"))
 * .resourcesReceivingAccess(List.of("resourcesReceivingAccess"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html)
 */
@CdkDslMarker
public class CfnBucketDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBucket.Builder = CfnBucket.Builder.create(scope, id)

    private val _readOnlyAccessAccounts: MutableList<String> = mutableListOf()

    private val _resourcesReceivingAccess: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * An object that describes the access rules for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-accessrules)
     *
     * @param accessRules An object that describes the access rules for the bucket.
     */
    public fun accessRules(accessRules: IResolvable) {
        cdkBuilder.accessRules(accessRules)
    }

    /**
     * An object that describes the access rules for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-accessrules)
     *
     * @param accessRules An object that describes the access rules for the bucket.
     */
    public fun accessRules(accessRules: CfnBucket.AccessRulesProperty) {
        cdkBuilder.accessRules(accessRules)
    }

    /**
     * The name of the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-bucketname)
     *
     * @param bucketName The name of the bucket.
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * The bundle ID for the bucket (for example, `small_1_0` ).
     *
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a
     * bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-bundleid)
     *
     * @param bundleId The bundle ID for the bucket (for example, `small_1_0` ).
     */
    public fun bundleId(bundleId: String) {
        cdkBuilder.bundleId(bundleId)
    }

    /**
     * Indicates whether object versioning is enabled for the bucket.
     *
     * The following options can be configured:
     * * `Enabled` - Object versioning is enabled.
     * * `Suspended` - Object versioning was previously enabled but is currently suspended. Existing
     *   object versions are retained.
     * * `NeverEnabled` - Object versioning has never been enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-objectversioning)
     *
     * @param objectVersioning Indicates whether object versioning is enabled for the bucket.
     */
    public fun objectVersioning(objectVersioning: Boolean) {
        cdkBuilder.objectVersioning(objectVersioning)
    }

    /**
     * Indicates whether object versioning is enabled for the bucket.
     *
     * The following options can be configured:
     * * `Enabled` - Object versioning is enabled.
     * * `Suspended` - Object versioning was previously enabled but is currently suspended. Existing
     *   object versions are retained.
     * * `NeverEnabled` - Object versioning has never been enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-objectversioning)
     *
     * @param objectVersioning Indicates whether object versioning is enabled for the bucket.
     */
    public fun objectVersioning(objectVersioning: IResolvable) {
        cdkBuilder.objectVersioning(objectVersioning)
    }

    /**
     * An array of AWS account IDs that have read-only access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-readonlyaccessaccounts)
     *
     * @param readOnlyAccessAccounts An array of AWS account IDs that have read-only access to the
     *   bucket.
     */
    public fun readOnlyAccessAccounts(vararg readOnlyAccessAccounts: String) {
        _readOnlyAccessAccounts.addAll(listOf(*readOnlyAccessAccounts))
    }

    /**
     * An array of AWS account IDs that have read-only access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-readonlyaccessaccounts)
     *
     * @param readOnlyAccessAccounts An array of AWS account IDs that have read-only access to the
     *   bucket.
     */
    public fun readOnlyAccessAccounts(readOnlyAccessAccounts: Collection<String>) {
        _readOnlyAccessAccounts.addAll(readOnlyAccessAccounts)
    }

    /**
     * An array of Lightsail instances that have access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-resourcesreceivingaccess)
     *
     * @param resourcesReceivingAccess An array of Lightsail instances that have access to the
     *   bucket.
     */
    public fun resourcesReceivingAccess(vararg resourcesReceivingAccess: String) {
        _resourcesReceivingAccess.addAll(listOf(*resourcesReceivingAccess))
    }

    /**
     * An array of Lightsail instances that have access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-resourcesreceivingaccess)
     *
     * @param resourcesReceivingAccess An array of Lightsail instances that have access to the
     *   bucket.
     */
    public fun resourcesReceivingAccess(resourcesReceivingAccess: Collection<String>) {
        _resourcesReceivingAccess.addAll(resourcesReceivingAccess)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnBucket {
        if (_readOnlyAccessAccounts.isNotEmpty())
            cdkBuilder.readOnlyAccessAccounts(_readOnlyAccessAccounts)
        if (_resourcesReceivingAccess.isNotEmpty())
            cdkBuilder.resourcesReceivingAccess(_resourcesReceivingAccess)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
