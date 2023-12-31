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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.lambda.DockerBuildAssetOptions

/**
 * Options when creating an asset from a Docker build.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * DockerBuildAssetOptions dockerBuildAssetOptions = DockerBuildAssetOptions.builder()
 * .buildArgs(Map.of(
 * "buildArgsKey", "buildArgs"))
 * .file("file")
 * .imagePath("imagePath")
 * .outputPath("outputPath")
 * .platform("platform")
 * .targetStage("targetStage")
 * .build();
 * ```
 */
@CdkDslMarker
public class DockerBuildAssetOptionsDsl {
    private val cdkBuilder: DockerBuildAssetOptions.Builder = DockerBuildAssetOptions.builder()

    /** @param buildArgs Build args. */
    public fun buildArgs(buildArgs: Map<String, String>) {
        cdkBuilder.buildArgs(buildArgs)
    }

    /** @param file Name of the Dockerfile, must relative to the docker build path. */
    public fun `file`(`file`: String) {
        cdkBuilder.`file`(`file`)
    }

    /**
     * @param imagePath The path in the Docker image where the asset is located after the build
     *   operation.
     */
    public fun imagePath(imagePath: String) {
        cdkBuilder.imagePath(imagePath)
    }

    /**
     * @param outputPath The path on the local filesystem where the asset will be copied using
     *   `docker cp`.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param platform Set platform if server is multi-platform capable. *Requires Docker Engine API
     *   v1.38+*. Example value: `linux/amd64`
     */
    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    /**
     * @param targetStage Set build target for multi-stage container builds. Any stage defined
     *   afterwards will be ignored. Example value: `build-env`
     */
    public fun targetStage(targetStage: String) {
        cdkBuilder.targetStage(targetStage)
    }

    public fun build(): DockerBuildAssetOptions = cdkBuilder.build()
}
