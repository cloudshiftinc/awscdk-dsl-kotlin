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

package io.cloudshiftdev.awscdkdsl.services.mediapackage

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps

/**
 * Properties for defining a `CfnPackagingGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * CfnPackagingGroupProps cfnPackagingGroupProps = CfnPackagingGroupProps.builder()
 * .id("id")
 * // the properties below are optional
 * .authorization(AuthorizationProperty.builder()
 * .cdnIdentifierSecret("cdnIdentifierSecret")
 * .secretsRoleArn("secretsRoleArn")
 * .build())
 * .egressAccessLogs(LogConfigurationProperty.builder()
 * .logGroupName("logGroupName")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html)
 */
@CdkDslMarker
public class CfnPackagingGroupPropsDsl {
    private val cdkBuilder: CfnPackagingGroupProps.Builder = CfnPackagingGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param authorization Parameters for CDN authorization. */
    public fun authorization(authorization: IResolvable) {
        cdkBuilder.authorization(authorization)
    }

    /** @param authorization Parameters for CDN authorization. */
    public fun authorization(authorization: CfnPackagingGroup.AuthorizationProperty) {
        cdkBuilder.authorization(authorization)
    }

    /** @param egressAccessLogs The configuration parameters for egress access logging. */
    public fun egressAccessLogs(egressAccessLogs: IResolvable) {
        cdkBuilder.egressAccessLogs(egressAccessLogs)
    }

    /** @param egressAccessLogs The configuration parameters for egress access logging. */
    public fun egressAccessLogs(egressAccessLogs: CfnPackagingGroup.LogConfigurationProperty) {
        cdkBuilder.egressAccessLogs(egressAccessLogs)
    }

    /** @param id Unique identifier that you assign to the packaging group. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param tags The tags to assign to the packaging group. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to assign to the packaging group. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPackagingGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
