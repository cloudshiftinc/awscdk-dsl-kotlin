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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.SchemaFile
import kotlin.String

@CdkDslMarker
public class SchemaFileDsl {
    private val cdkBuilder: SchemaFile.Builder = SchemaFile.Builder.create()

    public fun filePath(filePath: String) {
        cdkBuilder.filePath(filePath)
    }

    public fun build(): SchemaFile = cdkBuilder.build()
}
