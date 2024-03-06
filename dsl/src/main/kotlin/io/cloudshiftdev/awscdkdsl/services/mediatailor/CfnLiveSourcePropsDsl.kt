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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps

/**
 * Properties for defining a `CfnLiveSource`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * CfnLiveSourceProps cfnLiveSourceProps = CfnLiveSourceProps.builder()
 * .httpPackageConfigurations(List.of(HttpPackageConfigurationProperty.builder()
 * .path("path")
 * .sourceGroup("sourceGroup")
 * .type("type")
 * .build()))
 * .liveSourceName("liveSourceName")
 * .sourceLocationName("sourceLocationName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html)
 */
@CdkDslMarker
public class CfnLiveSourcePropsDsl {
    private val cdkBuilder: CfnLiveSourceProps.Builder = CfnLiveSourceProps.builder()

    private val _httpPackageConfigurations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param httpPackageConfigurations The HTTP package configurations for the live source. */
    public fun httpPackageConfigurations(vararg httpPackageConfigurations: Any) {
        _httpPackageConfigurations.addAll(listOf(*httpPackageConfigurations))
    }

    /** @param httpPackageConfigurations The HTTP package configurations for the live source. */
    public fun httpPackageConfigurations(httpPackageConfigurations: Collection<Any>) {
        _httpPackageConfigurations.addAll(httpPackageConfigurations)
    }

    /** @param httpPackageConfigurations The HTTP package configurations for the live source. */
    public fun httpPackageConfigurations(httpPackageConfigurations: IResolvable) {
        cdkBuilder.httpPackageConfigurations(httpPackageConfigurations)
    }

    /** @param liveSourceName The name that's used to refer to a live source. */
    public fun liveSourceName(liveSourceName: String) {
        cdkBuilder.liveSourceName(liveSourceName)
    }

    /** @param sourceLocationName The name of the source location. */
    public fun sourceLocationName(sourceLocationName: String) {
        cdkBuilder.sourceLocationName(sourceLocationName)
    }

    /**
     * @param tags The tags assigned to the live source. Tags are key-value pairs that you can
     *   associate with Amazon resources to help with organization, access control, and cost
     *   tracking. For more information, see
     *   [Tagging AWS Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags assigned to the live source. Tags are key-value pairs that you can
     *   associate with Amazon resources to help with organization, access control, and cost
     *   tracking. For more information, see
     *   [Tagging AWS Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLiveSourceProps {
        if (_httpPackageConfigurations.isNotEmpty())
            cdkBuilder.httpPackageConfigurations(_httpPackageConfigurations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
