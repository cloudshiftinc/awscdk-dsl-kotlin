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

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.services.cloudwatch.MetricOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.codestarnotifications.NotificationRuleOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.events.OnEventOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.codebuild.BuildImageConfig
import software.amazon.awscdk.services.codebuild.CfnProject
import software.amazon.awscdk.services.codebuild.CfnReportGroup
import software.amazon.awscdk.services.codebuild.IBindableBuildImage
import software.amazon.awscdk.services.codebuild.IBuildImage
import software.amazon.awscdk.services.codebuild.IProject
import software.amazon.awscdk.services.codebuild.LinuxArmBuildImage
import software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage
import software.amazon.awscdk.services.codebuild.LinuxBuildImage
import software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage
import software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage
import software.amazon.awscdk.services.codebuild.Project
import software.amazon.awscdk.services.codebuild.WindowsBuildImage
import software.amazon.awscdk.services.codestarnotifications.INotificationRule
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
import software.amazon.awscdk.services.events.Rule
import software.constructs.Construct

/**
 * `Artifacts` is a property of the
 * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
 * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
 */
public inline fun CfnProject.setArtifacts(block: CfnProjectArtifactsPropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectArtifactsPropertyDsl()
    builder.apply(block)
    return setArtifacts(builder.build())
}

/** A `ProjectBuildBatchConfig` object that defines the batch build options for the project. */
public inline fun CfnProject.setBuildBatchConfig(
    block: CfnProjectProjectBuildBatchConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnProjectProjectBuildBatchConfigPropertyDsl()
    builder.apply(block)
    return setBuildBatchConfig(builder.build())
}

/** Settings that AWS CodeBuild uses to store and reuse build dependencies. */
public inline fun CfnProject.setCache(block: CfnProjectProjectCachePropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectProjectCachePropertyDsl()
    builder.apply(block)
    return setCache(builder.build())
}

/**
 * The build environment settings for the project, such as the environment type or the environment
 * variables to use for the build environment.
 */
public inline fun CfnProject.setEnvironment(
    block: CfnProjectEnvironmentPropertyDsl.() -> Unit = {}
) {
    val builder = CfnProjectEnvironmentPropertyDsl()
    builder.apply(block)
    return setEnvironment(builder.build())
}

/** Information about logs for the build project. */
public inline fun CfnProject.setLogsConfig(block: CfnProjectLogsConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectLogsConfigPropertyDsl()
    builder.apply(block)
    return setLogsConfig(builder.build())
}

/**
 * The source code settings for the project, such as the source code's repository type and location.
 */
public inline fun CfnProject.setSource(block: CfnProjectSourcePropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectSourcePropertyDsl()
    builder.apply(block)
    return setSource(builder.build())
}

/**
 * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
 * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
 * code change is pushed to the repository.
 */
public inline fun CfnProject.setTriggers(
    block: CfnProjectProjectTriggersPropertyDsl.() -> Unit = {}
) {
    val builder = CfnProjectProjectTriggersPropertyDsl()
    builder.apply(block)
    return setTriggers(builder.build())
}

/**
 * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon VPC.
 */
public inline fun CfnProject.setVpcConfig(block: CfnProjectVpcConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectVpcConfigPropertyDsl()
    builder.apply(block)
    return setVpcConfig(builder.build())
}

/** Information about the destination where the raw data of this `ReportGroup` is exported. */
public inline fun CfnReportGroup.setExportConfig(
    block: CfnReportGroupReportExportConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnReportGroupReportExportConfigPropertyDsl()
    builder.apply(block)
    return setExportConfig(builder.build())
}

/**
 * Function that allows the build image access to the construct tree.
 *
 * @param scope
 * @param project
 * @param options
 */
public inline fun IBindableBuildImage.bind(
    arg0: Construct,
    arg1: IProject,
    block: BuildImageBindOptionsDsl.() -> Unit = {},
): BuildImageConfig {
    val builder = BuildImageBindOptionsDsl()
    builder.apply(block)
    return bind(arg0, arg1, builder.build())
}

/**
 * Allows the image a chance to validate whether the passed configuration is correct.
 *
 * @param buildEnvironment the current build environment.
 */
public inline fun IBuildImage.validate(block: BuildEnvironmentDsl.() -> Unit = {}): List<String> {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return validate(builder.build())
}

/** @param policyStatement */
public inline fun IProject.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToRolePolicy(builder.build())
}

/**
 * @param metricName The name of the metric.
 * @param props Customization properties.
 * @return a CloudWatch metric associated with this build project.
 */
public inline fun IProject.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(arg0, builder.build())
}

/**
 * Measures the number of builds triggered.
 *
 * Units: Count
 *
 * Valid CloudWatch statistics: Sum
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun IProject.metricBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricBuilds(builder.build())
}

/**
 * Measures the duration of all builds over time.
 *
 * Units: Seconds
 *
 * Valid CloudWatch statistics: Average (recommended), Maximum, Minimum
 *
 * Default: average over 5 minutes
 *
 * @param props
 */
public inline fun IProject.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDuration(builder.build())
}

/**
 * Measures the number of builds that failed because of client error or because of a timeout.
 *
 * Units: Count
 *
 * Valid CloudWatch statistics: Sum
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun IProject.metricFailedBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFailedBuilds(builder.build())
}

/**
 * Measures the number of successful builds.
 *
 * Units: Count
 *
 * Valid CloudWatch statistics: Sum
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun IProject.metricSucceededBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSucceededBuilds(builder.build())
}

/**
 * Defines a CodeStar Notification rule triggered when the project events emitted by you specified,
 * it very similar to `onEvent` API.
 *
 * You can also use the methods `notifyOnBuildSucceeded` and `notifyOnBuildFailed` to define rules
 * for these specific event emitted.
 *
 * @param id The logical identifier of the CodeStar Notifications rule that will be created.
 * @param target The target to register for the CodeStar Notifications destination.
 * @param options Customization options for CodeStar Notifications rule.
 * @return CodeStar Notifications rule associated with this build project.
 */
public inline fun IProject.notifyOn(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: ProjectNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = ProjectNotifyOnOptionsDsl()
    builder.apply(block)
    return notifyOn(arg0, arg1, builder.build())
}

/**
 * Defines a CodeStar notification rule which triggers when a build fails.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun IProject.notifyOnBuildFailed(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnBuildFailed(arg0, arg1, builder.build())
}

/**
 * Defines a CodeStar notification rule which triggers when a build completes successfully.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun IProject.notifyOnBuildSucceeded(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnBuildSucceeded(arg0, arg1, builder.build())
}

/**
 * Defines an event rule which triggers when a build fails.
 *
 * @param id
 * @param options
 */
public inline fun IProject.onBuildFailed(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onBuildFailed(arg0, builder.build())
}

/**
 * Defines an event rule which triggers when a build starts.
 *
 * @param id
 * @param options
 */
public inline fun IProject.onBuildStarted(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onBuildStarted(arg0, builder.build())
}

/**
 * Defines an event rule which triggers when a build completes successfully.
 *
 * @param id
 * @param options
 */
public inline fun IProject.onBuildSucceeded(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onBuildSucceeded(arg0, builder.build())
}

/**
 * Defines a CloudWatch event rule triggered when something happens with this project.
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
 *
 * @param id
 * @param options
 */
public inline fun IProject.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(arg0, builder.build())
}

/**
 * Defines a CloudWatch event rule that triggers upon phase change of this build project.
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
 *
 * @param id
 * @param options
 */
public inline fun IProject.onPhaseChange(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onPhaseChange(arg0, builder.build())
}

/**
 * Defines a CloudWatch event rule triggered when the build project state changes.
 *
 * You can filter specific build status events using an event pattern filter on the `build-status`
 * detail field:
 *
 * const rule = project.onStateChange('OnBuildStarted', { target }); rule.addEventPattern({ detail:
 * { 'build-status': [ "IN_PROGRESS", "SUCCEEDED", "FAILED", "STOPPED" ] } });
 *
 * You can also use the methods `onBuildFailed` and `onBuildSucceeded` to define rules for these
 * specific state changes.
 *
 * To access fields from the event in the event target input, use the static fields on the
 * `StateChangeEvent` class.
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
 *
 * @param id
 * @param options
 */
public inline fun IProject.onStateChange(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onStateChange(arg0, builder.build())
}

/**
 * Validates by checking the BuildEnvironment computeType as aarch64 images only support
 * ComputeType.SMALL and ComputeType.LARGE.
 *
 * @param buildEnvironment BuildEnvironment.
 */
public inline fun LinuxArmBuildImage.validate(
    block: BuildEnvironmentDsl.() -> Unit = {}
): List<String> {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return validate(builder.build())
}

/**
 * Allows the image a chance to validate whether the passed configuration is correct.
 *
 * @param buildEnvironment
 */
public inline fun LinuxArmLambdaBuildImage.validate(
    block: BuildEnvironmentDsl.() -> Unit = {}
): List<String> {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return validate(builder.build())
}

/**
 * Allows the image a chance to validate whether the passed configuration is correct.
 *
 * @param env
 */
public inline fun LinuxBuildImage.validate(
    block: BuildEnvironmentDsl.() -> Unit = {}
): List<String> {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return validate(builder.build())
}

/**
 * Function that allows the build image access to the construct tree.
 *
 * @param scope
 * @param project
 * @param _options
 */
public inline fun LinuxGpuBuildImage.bind(
    scope: Construct,
    project: IProject,
    block: BuildImageBindOptionsDsl.() -> Unit = {},
): BuildImageConfig {
    val builder = BuildImageBindOptionsDsl()
    builder.apply(block)
    return bind(scope, project, builder.build())
}

/**
 * Allows the image a chance to validate whether the passed configuration is correct.
 *
 * @param buildEnvironment
 */
public inline fun LinuxGpuBuildImage.validate(
    block: BuildEnvironmentDsl.() -> Unit = {}
): List<String> {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return validate(builder.build())
}

/**
 * Allows the image a chance to validate whether the passed configuration is correct.
 *
 * @param buildEnvironment
 */
public inline fun LinuxLambdaBuildImage.validate(
    block: BuildEnvironmentDsl.() -> Unit = {}
): List<String> {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return validate(builder.build())
}

/**
 * Add a permission only if there's a policy attached.
 *
 * @param statement The permissions statement to add.
 */
public inline fun Project.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToRolePolicy(builder.build())
}

/**
 * A callback invoked when the given project is added to a CodePipeline.
 *
 * @param _scope the construct the binding is taking place in.
 * @param options additional options for the binding.
 */
public inline fun Project.bindToCodePipeline(
    _scope: Construct,
    block: BindToCodePipelineOptionsDsl.() -> Unit = {}
) {
    val builder = BindToCodePipelineOptionsDsl()
    builder.apply(block)
    return bindToCodePipeline(_scope, builder.build())
}

/**
 * @param metricName The name of the metric.
 * @param props Customization properties.
 * @return a CloudWatch metric associated with this build project.
 */
public inline fun Project.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Measures the number of builds triggered.
 *
 * Units: Count
 *
 * Valid CloudWatch statistics: Sum
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun Project.metricBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricBuilds(builder.build())
}

/**
 * Measures the duration of all builds over time.
 *
 * Units: Seconds
 *
 * Valid CloudWatch statistics: Average (recommended), Maximum, Minimum
 *
 * Default: average over 5 minutes
 *
 * @param props
 */
public inline fun Project.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDuration(builder.build())
}

/**
 * Measures the number of builds that failed because of client error or because of a timeout.
 *
 * Units: Count
 *
 * Valid CloudWatch statistics: Sum
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun Project.metricFailedBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricFailedBuilds(builder.build())
}

/**
 * Measures the number of successful builds.
 *
 * Units: Count
 *
 * Valid CloudWatch statistics: Sum
 *
 * Default: sum over 5 minutes
 *
 * @param props
 */
public inline fun Project.metricSucceededBuilds(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSucceededBuilds(builder.build())
}

/**
 * Defines a CodeStar Notification rule triggered when the project events emitted by you specified,
 * it very similar to `onEvent` API.
 *
 * You can also use the methods `notifyOnBuildSucceeded` and `notifyOnBuildFailed` to define rules
 * for these specific event emitted.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Project.notifyOn(
    id: String,
    target: INotificationRuleTarget,
    block: ProjectNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = ProjectNotifyOnOptionsDsl()
    builder.apply(block)
    return notifyOn(id, target, builder.build())
}

/**
 * Defines a CodeStar notification rule which triggers when a build fails.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Project.notifyOnBuildFailed(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnBuildFailed(id, target, builder.build())
}

/**
 * Defines a CodeStar notification rule which triggers when a build completes successfully.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Project.notifyOnBuildSucceeded(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnBuildSucceeded(id, target, builder.build())
}

/**
 * Defines an event rule which triggers when a build fails.
 *
 * To access fields from the event in the event target input, use the static fields on the
 * `StateChangeEvent` class.
 *
 * @param id
 * @param options
 */
public inline fun Project.onBuildFailed(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onBuildFailed(id, builder.build())
}

/**
 * Defines an event rule which triggers when a build starts.
 *
 * To access fields from the event in the event target input, use the static fields on the
 * `StateChangeEvent` class.
 *
 * @param id
 * @param options
 */
public inline fun Project.onBuildStarted(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onBuildStarted(id, builder.build())
}

/**
 * Defines an event rule which triggers when a build completes successfully.
 *
 * To access fields from the event in the event target input, use the static fields on the
 * `StateChangeEvent` class.
 *
 * @param id
 * @param options
 */
public inline fun Project.onBuildSucceeded(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onBuildSucceeded(id, builder.build())
}

/**
 * Defines a CloudWatch event rule triggered when something happens with this project.
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
 *
 * @param id
 * @param options
 */
public inline fun Project.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(id, builder.build())
}

/**
 * Defines a CloudWatch event rule that triggers upon phase change of this build project.
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
 *
 * @param id
 * @param options
 */
public inline fun Project.onPhaseChange(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onPhaseChange(id, builder.build())
}

/**
 * Defines a CloudWatch event rule triggered when the build project state changes.
 *
 * You can filter specific build status events using an event pattern filter on the `build-status`
 * detail field:
 *
 * const rule = project.onStateChange('OnBuildStarted', { target }); rule.addEventPattern({ detail:
 * { 'build-status': [ "IN_PROGRESS", "SUCCEEDED", "FAILED", "STOPPED" ] } });
 *
 * You can also use the methods `onBuildFailed` and `onBuildSucceeded` to define rules for these
 * specific state changes.
 *
 * To access fields from the event in the event target input, use the static fields on the
 * `StateChangeEvent` class.
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html)
 *
 * @param id
 * @param options
 */
public inline fun Project.onStateChange(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onStateChange(id, builder.build())
}

/**
 * Allows the image a chance to validate whether the passed configuration is correct.
 *
 * @param buildEnvironment
 */
public inline fun WindowsBuildImage.validate(
    block: BuildEnvironmentDsl.() -> Unit = {}
): List<String> {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return validate(builder.build())
}
