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

package io.cloudshiftdev.awscdkdsl.services.appintegrations

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration
import software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps

/**
 * Properties for defining a `CfnDataIntegration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appintegrations.*;
 * Object filters;
 * Object objectConfiguration;
 * CfnDataIntegrationProps cfnDataIntegrationProps = CfnDataIntegrationProps.builder()
 * .kmsKey("kmsKey")
 * .name("name")
 * .scheduleConfig(ScheduleConfigProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * // the properties below are optional
 * .firstExecutionFrom("firstExecutionFrom")
 * .object("object")
 * .build())
 * .sourceUri("sourceUri")
 * // the properties below are optional
 * .description("description")
 * .fileConfiguration(FileConfigurationProperty.builder()
 * .folders(List.of("folders"))
 * // the properties below are optional
 * .filters(filters)
 * .build())
 * .objectConfiguration(objectConfiguration)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html)
 */
@CdkDslMarker
public class CfnDataIntegrationPropsDsl {
    private val cdkBuilder: CfnDataIntegrationProps.Builder = CfnDataIntegrationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description of the DataIntegration. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param fileConfiguration The configuration for what files should be pulled from the source.
     */
    public fun fileConfiguration(fileConfiguration: IResolvable) {
        cdkBuilder.fileConfiguration(fileConfiguration)
    }

    /**
     * @param fileConfiguration The configuration for what files should be pulled from the source.
     */
    public fun fileConfiguration(fileConfiguration: CfnDataIntegration.FileConfigurationProperty) {
        cdkBuilder.fileConfiguration(fileConfiguration)
    }

    /** @param kmsKey The KMS key for the DataIntegration. */
    public fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
    }

    /** @param name The name of the DataIntegration. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param objectConfiguration The configuration for what data should be pulled from the source.
     */
    public fun objectConfiguration(objectConfiguration: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(objectConfiguration)
        cdkBuilder.objectConfiguration(builder.map)
    }

    /**
     * @param objectConfiguration The configuration for what data should be pulled from the source.
     */
    public fun objectConfiguration(objectConfiguration: Any) {
        cdkBuilder.objectConfiguration(objectConfiguration)
    }

    /**
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     */
    public fun scheduleConfig(scheduleConfig: IResolvable) {
        cdkBuilder.scheduleConfig(scheduleConfig)
    }

    /**
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     */
    public fun scheduleConfig(scheduleConfig: CfnDataIntegration.ScheduleConfigProperty) {
        cdkBuilder.scheduleConfig(scheduleConfig)
    }

    /** @param sourceUri The URI of the data source. */
    public fun sourceUri(sourceUri: String) {
        cdkBuilder.sourceUri(sourceUri)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDataIntegrationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
