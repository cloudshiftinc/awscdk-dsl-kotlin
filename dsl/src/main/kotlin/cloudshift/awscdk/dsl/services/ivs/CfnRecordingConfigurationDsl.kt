@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRecordingConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRecordingConfiguration.Builder =
        CfnRecordingConfiguration.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun destinationConfiguration(destinationConfiguration: IResolvable) {
        cdkBuilder.destinationConfiguration(destinationConfiguration)
    }

    public fun destinationConfiguration(destinationConfiguration: CfnRecordingConfiguration.DestinationConfigurationProperty) {
        cdkBuilder.destinationConfiguration(destinationConfiguration)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun recordingReconnectWindowSeconds(recordingReconnectWindowSeconds: Number) {
        cdkBuilder.recordingReconnectWindowSeconds(recordingReconnectWindowSeconds)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun thumbnailConfiguration(thumbnailConfiguration: IResolvable) {
        cdkBuilder.thumbnailConfiguration(thumbnailConfiguration)
    }

    public fun thumbnailConfiguration(thumbnailConfiguration: CfnRecordingConfiguration.ThumbnailConfigurationProperty) {
        cdkBuilder.thumbnailConfiguration(thumbnailConfiguration)
    }

    public fun build(): CfnRecordingConfiguration {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
