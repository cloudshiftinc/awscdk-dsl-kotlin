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
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps

/**
 * Properties for defining a `CfnPublicDnsNamespace`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * CfnPublicDnsNamespaceProps cfnPublicDnsNamespaceProps = CfnPublicDnsNamespaceProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .properties(PropertiesProperty.builder()
 * .dnsProperties(PublicDnsPropertiesMutableProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html)
 */
@CdkDslMarker
public class CfnPublicDnsNamespacePropsDsl {
    private val cdkBuilder: CfnPublicDnsNamespaceProps.Builder =
        CfnPublicDnsNamespaceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description for the namespace. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name The name that you want to assign to this namespace.
     *
     * Do not include sensitive information in the name. The name is publicly available using DNS
     * queries.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param properties Properties for the public DNS namespace. */
    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    /** @param properties Properties for the public DNS namespace. */
    public fun properties(properties: CfnPublicDnsNamespace.PropertiesProperty) {
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

    public fun build(): CfnPublicDnsNamespaceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
