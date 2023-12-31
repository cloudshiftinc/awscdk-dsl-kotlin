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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

/**
 * The tags to apply to a resource when the resource is being created.
 *
 * When you specify a tag, you must specify the resource type to tag, otherwise the request will
 * fail.
 *
 * The `Valid Values` lists all the resource types that can be tagged. However, the action you're
 * using might not support tagging all of these resource types. If you try to tag a resource type
 * that is unsupported for the action you're using, you'll get an error.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-tagspecification.html)
 */
@CdkDslMarker
public class CfnClientVpnEndpointTagSpecificationPropertyDsl {
    private val cdkBuilder: CfnClientVpnEndpoint.TagSpecificationProperty.Builder =
        CfnClientVpnEndpoint.TagSpecificationProperty.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param resourceType The type of resource to tag. */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /** @param tags The tags to apply to the resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to apply to the resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnClientVpnEndpoint.TagSpecificationProperty {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
