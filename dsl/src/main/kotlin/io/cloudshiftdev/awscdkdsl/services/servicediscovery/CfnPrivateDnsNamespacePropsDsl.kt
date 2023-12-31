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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps

/**
 * Properties for defining a `CfnPrivateDnsNamespace`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * CfnPrivateDnsNamespaceProps cfnPrivateDnsNamespaceProps = CfnPrivateDnsNamespaceProps.builder()
 * .name("name")
 * .vpc("vpc")
 * // the properties below are optional
 * .description("description")
 * .properties(PropertiesProperty.builder()
 * .dnsProperties(PrivateDnsPropertiesMutableProperty.builder()
 * .soa(SOAProperty.builder()
 * .ttl(123)
 * .build())
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html)
 */
@CdkDslMarker
public class CfnPrivateDnsNamespacePropsDsl {
    private val cdkBuilder: CfnPrivateDnsNamespaceProps.Builder =
        CfnPrivateDnsNamespaceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description for the namespace. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name The name that you want to assign to this namespace. When you create a private DNS
     *   namespace, AWS Cloud Map automatically creates an Amazon Route 53 private hosted zone that
     *   has the same name as the namespace.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param properties Properties for the private DNS namespace. */
    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    /** @param properties Properties for the private DNS namespace. */
    public fun properties(properties: CfnPrivateDnsNamespace.PropertiesProperty) {
        cdkBuilder.properties(properties)
    }

    /**
     * @param tags The tags for the namespace. Each tag consists of a key and an optional value,
     *   both of which you define. Tag keys can have a maximum character length of 128 characters,
     *   and tag values can have a maximum length of 256 characters.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags for the namespace. Each tag consists of a key and an optional value,
     *   both of which you define. Tag keys can have a maximum character length of 128 characters,
     *   and tag values can have a maximum length of 256 characters.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param vpc The ID of the Amazon VPC that you want to associate the namespace with. */
    public fun vpc(vpc: String) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): CfnPrivateDnsNamespaceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
