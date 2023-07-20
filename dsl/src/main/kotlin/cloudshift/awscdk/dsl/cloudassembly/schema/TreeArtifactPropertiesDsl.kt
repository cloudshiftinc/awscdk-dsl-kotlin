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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties
import kotlin.String

@CdkDslMarker
public class TreeArtifactPropertiesDsl {
    private val cdkBuilder: TreeArtifactProperties.Builder = TreeArtifactProperties.builder()

    public fun `file`(`file`: String) {
        cdkBuilder.`file`(`file`)
    }

    public fun build(): TreeArtifactProperties = cdkBuilder.build()
}
