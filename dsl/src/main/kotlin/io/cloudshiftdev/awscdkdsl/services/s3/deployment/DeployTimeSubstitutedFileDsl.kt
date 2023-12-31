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

package io.cloudshiftdev.awscdkdsl.services.s3.deployment

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile
import software.constructs.Construct

/**
 * `DeployTimeSubstitutedFile` is an extension of `BucketDeployment` that allows users to upload
 * individual files and specify to make substitutions in the file.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Function myLambdaFunction;
 * Bucket destinationBucket;
 * DeployTimeSubstitutedFile.Builder.create(this, "MyFile")
 * .source("my-file.yaml")
 * .destinationBucket(destinationBucket)
 * .substitutions(Map.of(
 * "variableName", myLambdaFunction.getFunctionName()))
 * .build();
 * ```
 */
@CdkDslMarker
public class DeployTimeSubstitutedFileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DeployTimeSubstitutedFile.Builder =
        DeployTimeSubstitutedFile.Builder.create(scope, id)

    /**
     * The S3 bucket to sync the contents of the zip file to.
     *
     * @param destinationBucket The S3 bucket to sync the contents of the zip file to.
     */
    public fun destinationBucket(destinationBucket: IBucket) {
        cdkBuilder.destinationBucket(destinationBucket)
    }

    /**
     * Path to the user's local file.
     *
     * @param source Path to the user's local file.
     */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    /**
     * User-defined substitutions to make in the file.
     *
     * Placeholders in the user's local file must be specified with double curly brackets and
     * spaces. For example, if you use the key 'xxxx' in the file, it must be written as: {{ xxxx }}
     * to be recognized by the construct as a substitution.
     *
     * @param substitutions User-defined substitutions to make in the file.
     */
    public fun substitutions(substitutions: Map<String, String>) {
        cdkBuilder.substitutions(substitutions)
    }

    public fun build(): DeployTimeSubstitutedFile = cdkBuilder.build()
}
