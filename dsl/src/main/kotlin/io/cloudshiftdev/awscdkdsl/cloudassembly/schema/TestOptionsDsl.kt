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
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.CdkCommands
import software.amazon.awscdk.cloudassembly.schema.Hooks
import software.amazon.awscdk.cloudassembly.schema.TestOptions

/**
 * The set of options to control the workflow of the test runner.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * TestOptions testOptions = TestOptions.builder()
 * .allowDestroy(List.of("allowDestroy"))
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
 * .build();
 * ```
 */
@CdkDslMarker
public class TestOptionsDsl {
    private val cdkBuilder: TestOptions.Builder = TestOptions.builder()

    private val _allowDestroy: MutableList<String> = mutableListOf()

    private val _regions: MutableList<String> = mutableListOf()

    /**
     * @param allowDestroy List of CloudFormation resource types in this stack that can be destroyed
     *   as part of an update without failing the test. This list should only include resources that
     *   for this specific integration test we are sure will not cause errors or an outage if
     *   destroyed. For example, maybe we know that a new resource will be created first before the
     *   old resource is destroyed which prevents any outage.
     *
     * e.g. ['AWS::IAM::Role']
     */
    public fun allowDestroy(vararg allowDestroy: String) {
        _allowDestroy.addAll(listOf(*allowDestroy))
    }

    /**
     * @param allowDestroy List of CloudFormation resource types in this stack that can be destroyed
     *   as part of an update without failing the test. This list should only include resources that
     *   for this specific integration test we are sure will not cause errors or an outage if
     *   destroyed. For example, maybe we know that a new resource will be created first before the
     *   old resource is destroyed which prevents any outage.
     *
     * e.g. ['AWS::IAM::Role']
     */
    public fun allowDestroy(allowDestroy: Collection<String>) {
        _allowDestroy.addAll(allowDestroy)
    }

    /** @param cdkCommandOptions Additional options to use for each CDK command. */
    public fun cdkCommandOptions(cdkCommandOptions: CdkCommandsDsl.() -> Unit = {}) {
        val builder = CdkCommandsDsl()
        builder.apply(cdkCommandOptions)
        cdkBuilder.cdkCommandOptions(builder.build())
    }

    /** @param cdkCommandOptions Additional options to use for each CDK command. */
    public fun cdkCommandOptions(cdkCommandOptions: CdkCommands) {
        cdkBuilder.cdkCommandOptions(cdkCommandOptions)
    }

    /**
     * @param diffAssets Whether or not to include asset hashes in the diff Asset hashes can
     *   introduces a lot of unneccessary noise into tests, but there are some cases where asset
     *   hashes *should* be included. For example any tests involving custom resources or bundling
     */
    public fun diffAssets(diffAssets: Boolean) {
        cdkBuilder.diffAssets(diffAssets)
    }

    /**
     * @param hooks Additional commands to run at predefined points in the test workflow. e.g. {
     *   postDeploy: ['yarn', 'test'] }
     */
    public fun hooks(hooks: HooksDsl.() -> Unit = {}) {
        val builder = HooksDsl()
        builder.apply(hooks)
        cdkBuilder.hooks(builder.build())
    }

    /**
     * @param hooks Additional commands to run at predefined points in the test workflow. e.g. {
     *   postDeploy: ['yarn', 'test'] }
     */
    public fun hooks(hooks: Hooks) {
        cdkBuilder.hooks(hooks)
    }

    /** @param regions Limit deployment to these regions. */
    public fun regions(vararg regions: String) {
        _regions.addAll(listOf(*regions))
    }

    /** @param regions Limit deployment to these regions. */
    public fun regions(regions: Collection<String>) {
        _regions.addAll(regions)
    }

    /**
     * @param stackUpdateWorkflow Run update workflow on this test case This should only be set to
     *   false to test scenarios that are not possible to test as part of the update workflow.
     */
    public fun stackUpdateWorkflow(stackUpdateWorkflow: Boolean) {
        cdkBuilder.stackUpdateWorkflow(stackUpdateWorkflow)
    }

    public fun build(): TestOptions {
        if (_allowDestroy.isNotEmpty()) cdkBuilder.allowDestroy(_allowDestroy)
        if (_regions.isNotEmpty()) cdkBuilder.regions(_regions)
        return cdkBuilder.build()
    }
}
