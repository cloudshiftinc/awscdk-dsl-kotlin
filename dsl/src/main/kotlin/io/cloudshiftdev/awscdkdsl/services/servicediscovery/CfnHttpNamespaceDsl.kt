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

package io.cloudshiftdev.awscdkdsl.services.servicediscovery

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace
import software.constructs.Construct

/**
 * The `HttpNamespace` resource is an AWS Cloud Map resource type that contains information about an
 * HTTP namespace.
 *
 * Service instances that you register using an HTTP namespace can be discovered using a
 * `DiscoverInstances` request but can't be discovered using DNS.
 *
 * For the current quota on the number of namespaces that you can create using the same AWS account,
 * see [AWS Cloud Map quotas](https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html)
 * in the ** .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * CfnHttpNamespace cfnHttpNamespace = CfnHttpNamespace.Builder.create(this, "MyCfnHttpNamespace")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html)
 */
@CdkDslMarker
public class CfnHttpNamespaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnHttpNamespace.Builder = CfnHttpNamespace.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description for the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html#cfn-servicediscovery-httpnamespace-description)
     *
     * @param description A description for the namespace.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name that you want to assign to this namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html#cfn-servicediscovery-httpnamespace-name)
     *
     * @param name The name that you want to assign to this namespace.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html#cfn-servicediscovery-httpnamespace-tags)
     *
     * @param tags The tags for the namespace.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-httpnamespace.html#cfn-servicediscovery-httpnamespace-tags)
     *
     * @param tags The tags for the namespace.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnHttpNamespace {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
