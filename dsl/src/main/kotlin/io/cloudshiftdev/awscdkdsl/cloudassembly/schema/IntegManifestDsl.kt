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

package io.cloudshiftdev.awscdkdsl.cloudassembly.schema

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.cloudassembly.schema.IntegManifest
import software.amazon.awscdk.cloudassembly.schema.TestCase

/**
 * Definitions for the integration testing manifest.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * IntegManifest integManifest = IntegManifest.builder()
 * .testCases(Map.of(
 * "testCasesKey", TestCase.builder()
 * .stacks(List.of("stacks"))
 * // the properties below are optional
 * .allowDestroy(List.of("allowDestroy"))
 * .assertionStack("assertionStack")
 * .assertionStackName("assertionStackName")
 * .cdkCommandOptions(CdkCommands.builder()
 * .deploy(DeployCommand.builder()
 * .args(DeployOptions.builder()
 * .all(false)
 * .app("app")
 * .assetMetadata(false)
 * .caBundlePath("caBundlePath")
 * .changeSetName("changeSetName")
 * .ci(false)
 * .color(false)
 * .concurrency(123)
 * .context(Map.of(
 * "contextKey", "context"))
 * .debug(false)
 * .ec2Creds(false)
 * .exclusively(false)
 * .execute(false)
 * .force(false)
 * .ignoreErrors(false)
 * .json(false)
 * .lookups(false)
 * .notices(false)
 * .notificationArns(List.of("notificationArns"))
 * .output("output")
 * .outputsFile("outputsFile")
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .pathMetadata(false)
 * .profile("profile")
 * .proxy("proxy")
 * .requireApproval(RequireApproval.NEVER)
 * .reuseAssets(List.of("reuseAssets"))
 * .roleArn("roleArn")
 * .rollback(false)
 * .stacks(List.of("stacks"))
 * .staging(false)
 * .strict(false)
 * .toolkitStackName("toolkitStackName")
 * .trace(false)
 * .usePreviousParameters(false)
 * .verbose(false)
 * .versionReporting(false)
 * .build())
 * .enabled(false)
 * .expectedMessage("expectedMessage")
 * .expectError(false)
 * .build())
 * .destroy(DestroyCommand.builder()
 * .args(DestroyOptions.builder()
 * .all(false)
 * .app("app")
 * .assetMetadata(false)
 * .caBundlePath("caBundlePath")
 * .color(false)
 * .context(Map.of(
 * "contextKey", "context"))
 * .debug(false)
 * .ec2Creds(false)
 * .exclusively(false)
 * .force(false)
 * .ignoreErrors(false)
 * .json(false)
 * .lookups(false)
 * .notices(false)
 * .output("output")
 * .pathMetadata(false)
 * .profile("profile")
 * .proxy("proxy")
 * .roleArn("roleArn")
 * .stacks(List.of("stacks"))
 * .staging(false)
 * .strict(false)
 * .trace(false)
 * .verbose(false)
 * .versionReporting(false)
 * .build())
 * .enabled(false)
 * .expectedMessage("expectedMessage")
 * .expectError(false)
 * .build())
 * .build())
 * .diffAssets(false)
 * .hooks(Hooks.builder()
 * .postDeploy(List.of("postDeploy"))
 * .postDestroy(List.of("postDestroy"))
 * .preDeploy(List.of("preDeploy"))
 * .preDestroy(List.of("preDestroy"))
 * .build())
 * .regions(List.of("regions"))
 * .stackUpdateWorkflow(false)
 * .build()))
 * .version("version")
 * // the properties below are optional
 * .enableLookups(false)
 * .synthContext(Map.of(
 * "synthContextKey", "synthContext"))
 * .build();
 * ```
 */
@CdkDslMarker
public class IntegManifestDsl {
    private val cdkBuilder: IntegManifest.Builder = IntegManifest.builder()

    /**
     * @param enableLookups Enable lookups for this test. If lookups are enabled then
     *   `stackUpdateWorkflow` must be set to false. Lookups should only be enabled when you are
     *   explicitely testing lookups.
     */
    public fun enableLookups(enableLookups: Boolean) {
        cdkBuilder.enableLookups(enableLookups)
    }

    /**
     * @param synthContext Additional context to use when performing a synth. Any context provided
     *   here will override any default context
     */
    public fun synthContext(synthContext: Map<String, String>) {
        cdkBuilder.synthContext(synthContext)
    }

    /** @param testCases test cases. */
    public fun testCases(testCases: Map<String, TestCase>) {
        cdkBuilder.testCases(testCases)
    }

    /** @param version Version of the manifest. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): IntegManifest = cdkBuilder.build()
}
