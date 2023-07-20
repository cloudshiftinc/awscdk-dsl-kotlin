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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CliCredentialsStackSynthesizer
import kotlin.String

@CdkDslMarker
public class CliCredentialsStackSynthesizerDsl {
    private val cdkBuilder: CliCredentialsStackSynthesizer.Builder =
        CliCredentialsStackSynthesizer.Builder.create()

    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun dockerTagPrefix(dockerTagPrefix: String) {
        cdkBuilder.dockerTagPrefix(dockerTagPrefix)
    }

    public fun fileAssetsBucketName(fileAssetsBucketName: String) {
        cdkBuilder.fileAssetsBucketName(fileAssetsBucketName)
    }

    public fun imageAssetsRepositoryName(imageAssetsRepositoryName: String) {
        cdkBuilder.imageAssetsRepositoryName(imageAssetsRepositoryName)
    }

    public fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
    }

    public fun build(): CliCredentialsStackSynthesizer = cdkBuilder.build()
}
