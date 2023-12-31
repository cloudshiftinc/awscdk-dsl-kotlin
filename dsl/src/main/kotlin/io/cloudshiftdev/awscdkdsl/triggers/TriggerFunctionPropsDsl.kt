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

package io.cloudshiftdev.awscdkdsl.triggers

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import io.cloudshiftdev.awscdkdsl.services.lambda.AdotInstrumentationConfigDsl
import io.cloudshiftdev.awscdkdsl.services.lambda.LogRetentionRetryOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.lambda.VersionOptionsDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.lambda.AdotInstrumentationConfig
import software.amazon.awscdk.services.lambda.Architecture
import software.amazon.awscdk.services.lambda.Code
import software.amazon.awscdk.services.lambda.FileSystem
import software.amazon.awscdk.services.lambda.ICodeSigningConfig
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.IEventSource
import software.amazon.awscdk.services.lambda.ILayerVersion
import software.amazon.awscdk.services.lambda.LambdaInsightsVersion
import software.amazon.awscdk.services.lambda.LogRetentionRetryOptions
import software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion
import software.amazon.awscdk.services.lambda.Runtime
import software.amazon.awscdk.services.lambda.RuntimeManagementMode
import software.amazon.awscdk.services.lambda.Tracing
import software.amazon.awscdk.services.lambda.VersionOptions
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sqs.IQueue
import software.amazon.awscdk.triggers.TriggerFunctionProps
import software.constructs.Construct

/**
 * Props for `InvokeFunction`.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.triggers.*;
 * TriggerFunction.Builder.create(this, "MyTrigger")
 * .runtime(Runtime.NODEJS_14_X)
 * .handler("index.handler")
 * .code(Code.fromAsset(__dirname + "/my-trigger"))
 * .build();
 * ```
 */
@CdkDslMarker
public class TriggerFunctionPropsDsl {
    private val cdkBuilder: TriggerFunctionProps.Builder = TriggerFunctionProps.builder()

    private val _events: MutableList<IEventSource> = mutableListOf()

    private val _executeAfter: MutableList<Construct> = mutableListOf()

    private val _executeBefore: MutableList<Construct> = mutableListOf()

    private val _initialPolicy: MutableList<PolicyStatement> = mutableListOf()

    private val _layers: MutableList<ILayerVersion> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * @param adotInstrumentation Specify the configuration of AWS Distro for OpenTelemetry (ADOT)
     *   instrumentation.
     */
    public fun adotInstrumentation(
        adotInstrumentation: AdotInstrumentationConfigDsl.() -> Unit = {}
    ) {
        val builder = AdotInstrumentationConfigDsl()
        builder.apply(adotInstrumentation)
        cdkBuilder.adotInstrumentation(builder.build())
    }

    /**
     * @param adotInstrumentation Specify the configuration of AWS Distro for OpenTelemetry (ADOT)
     *   instrumentation.
     */
    public fun adotInstrumentation(adotInstrumentation: AdotInstrumentationConfig) {
        cdkBuilder.adotInstrumentation(adotInstrumentation)
    }

    /**
     * @param allowAllOutbound Whether to allow the Lambda to send all network traffic. If set to
     *   false, you must individually add traffic rules to allow the Lambda to connect to network
     *   targets.
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean) {
        cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * @param allowPublicSubnet Lambda Functions in a public subnet can NOT access the internet. Use
     *   this property to acknowledge this limitation and still place the function in a public
     *   subnet.
     */
    public fun allowPublicSubnet(allowPublicSubnet: Boolean) {
        cdkBuilder.allowPublicSubnet(allowPublicSubnet)
    }

    /** @param architecture The system architectures compatible with this lambda function. */
    public fun architecture(architecture: Architecture) {
        cdkBuilder.architecture(architecture)
    }

    /**
     * @param code The source code of your Lambda function. You can point to a file in an Amazon
     *   Simple Storage Service (Amazon S3) bucket or specify your source code as inline text.
     */
    public fun code(code: Code) {
        cdkBuilder.code(code)
    }

    /** @param codeSigningConfig Code signing config associated with this function. */
    public fun codeSigningConfig(codeSigningConfig: ICodeSigningConfig) {
        cdkBuilder.codeSigningConfig(codeSigningConfig)
    }

    /**
     * @param currentVersionOptions Options for the `lambda.Version` resource automatically created
     *   by the `fn.currentVersion` method.
     */
    public fun currentVersionOptions(currentVersionOptions: VersionOptionsDsl.() -> Unit = {}) {
        val builder = VersionOptionsDsl()
        builder.apply(currentVersionOptions)
        cdkBuilder.currentVersionOptions(builder.build())
    }

    /**
     * @param currentVersionOptions Options for the `lambda.Version` resource automatically created
     *   by the `fn.currentVersion` method.
     */
    public fun currentVersionOptions(currentVersionOptions: VersionOptions) {
        cdkBuilder.currentVersionOptions(currentVersionOptions)
    }

    /**
     * @param deadLetterQueue The SQS queue to use if DLQ is enabled. If SNS topic is desired,
     *   specify `deadLetterTopic` property instead.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * @param deadLetterQueueEnabled Enabled DLQ. If `deadLetterQueue` is undefined, an SQS queue
     *   with default options will be defined for your Function.
     */
    public fun deadLetterQueueEnabled(deadLetterQueueEnabled: Boolean) {
        cdkBuilder.deadLetterQueueEnabled(deadLetterQueueEnabled)
    }

    /**
     * @param deadLetterTopic The SNS topic to use as a DLQ. Note that if `deadLetterQueueEnabled`
     *   is set to `true`, an SQS queue will be created rather than an SNS topic. Using an SNS topic
     *   as a DLQ requires this property to be set explicitly.
     */
    public fun deadLetterTopic(deadLetterTopic: ITopic) {
        cdkBuilder.deadLetterTopic(deadLetterTopic)
    }

    /** @param description A description of the function. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param environment Key-value pairs that Lambda caches and makes available for your Lambda
     *   functions. Use environment variables to apply configuration changes, such as test and
     *   production environment configurations, without changing your Lambda function source code.
     */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param environmentEncryption The AWS KMS key that's used to encrypt your function's
     *   environment variables.
     */
    public fun environmentEncryption(environmentEncryption: IKey) {
        cdkBuilder.environmentEncryption(environmentEncryption)
    }

    /** @param ephemeralStorageSize The size of the function’s /tmp directory in MiB. */
    public fun ephemeralStorageSize(ephemeralStorageSize: Size) {
        cdkBuilder.ephemeralStorageSize(ephemeralStorageSize)
    }

    /**
     * @param events Event sources for this function. You can also add event sources using
     *   `addEventSource`.
     */
    public fun events(vararg events: IEventSource) {
        _events.addAll(listOf(*events))
    }

    /**
     * @param events Event sources for this function. You can also add event sources using
     *   `addEventSource`.
     */
    public fun events(events: Collection<IEventSource>) {
        _events.addAll(events)
    }

    /**
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     *   construct scopes have been provisioned. You can also use `trigger.executeAfter()` to add
     *   additional dependencies.
     */
    public fun executeAfter(vararg executeAfter: Construct) {
        _executeAfter.addAll(listOf(*executeAfter))
    }

    /**
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     *   construct scopes have been provisioned. You can also use `trigger.executeAfter()` to add
     *   additional dependencies.
     */
    public fun executeAfter(executeAfter: Collection<Construct>) {
        _executeAfter.addAll(executeAfter)
    }

    /**
     * @param executeBefore Adds this trigger as a dependency on other constructs. This means that
     *   this trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     */
    public fun executeBefore(vararg executeBefore: Construct) {
        _executeBefore.addAll(listOf(*executeBefore))
    }

    /**
     * @param executeBefore Adds this trigger as a dependency on other constructs. This means that
     *   this trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     */
    public fun executeBefore(executeBefore: Collection<Construct>) {
        _executeBefore.addAll(executeBefore)
    }

    /**
     * @param executeOnHandlerChange Re-executes the trigger every time the handler changes. This
     *   implies that the trigger is associated with the `currentVersion` of the handler, which gets
     *   recreated every time the handler or its configuration is updated.
     */
    public fun executeOnHandlerChange(executeOnHandlerChange: Boolean) {
        cdkBuilder.executeOnHandlerChange(executeOnHandlerChange)
    }

    /** @param filesystem The filesystem configuration for the lambda function. */
    public fun filesystem(filesystem: FileSystem) {
        cdkBuilder.filesystem(filesystem)
    }

    /** @param functionName A name for the function. */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * @param handler The name of the method within your code that Lambda calls to execute your
     *   function. The format includes the file name. It can also include namespaces and other
     *   qualifiers, depending on the runtime. For more information, see
     *   https://docs.aws.amazon.com/lambda/latest/dg/foundation-progmodel.html.
     *
     * Use `Handler.FROM_IMAGE` when defining a function from a Docker image.
     *
     * NOTE: If you specify your source code as inline text by specifying the ZipFile property
     * within the Code property, specify index.function_name as the handler.
     */
    public fun handler(handler: String) {
        cdkBuilder.handler(handler)
    }

    /**
     * @param initialPolicy Initial policy statements to add to the created Lambda Role. You can
     *   call `addToRolePolicy` to the created lambda to add statements post creation.
     */
    public fun initialPolicy(initialPolicy: PolicyStatementDsl.() -> Unit) {
        _initialPolicy.add(PolicyStatementDsl().apply(initialPolicy).build())
    }

    /**
     * @param initialPolicy Initial policy statements to add to the created Lambda Role. You can
     *   call `addToRolePolicy` to the created lambda to add statements post creation.
     */
    public fun initialPolicy(initialPolicy: Collection<PolicyStatement>) {
        _initialPolicy.addAll(initialPolicy)
    }

    /**
     * @param insightsVersion Specify the version of CloudWatch Lambda insights to use for
     *   monitoring.
     */
    public fun insightsVersion(insightsVersion: LambdaInsightsVersion) {
        cdkBuilder.insightsVersion(insightsVersion)
    }

    /**
     * @param layers A list of layers to add to the function's execution environment. You can
     *   configure your Lambda function to pull in additional code during initialization in the form
     *   of layers. Layers are packages of libraries or other dependencies that can be used by
     *   multiple functions.
     */
    public fun layers(vararg layers: ILayerVersion) {
        _layers.addAll(listOf(*layers))
    }

    /**
     * @param layers A list of layers to add to the function's execution environment. You can
     *   configure your Lambda function to pull in additional code during initialization in the form
     *   of layers. Layers are packages of libraries or other dependencies that can be used by
     *   multiple functions.
     */
    public fun layers(layers: Collection<ILayerVersion>) {
        _layers.addAll(layers)
    }

    /**
     * @param logRetention The number of days log events are kept in CloudWatch Logs. When updating
     *   this property, unsetting it doesn't remove the log retention policy. To remove the
     *   retention policy, set the value to `INFINITE`.
     */
    public fun logRetention(logRetention: RetentionDays) {
        cdkBuilder.logRetention(logRetention)
    }

    /**
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     *   to create the CloudWatch log group. These options control the retry policy when interacting
     *   with CloudWatch APIs.
     */
    public fun logRetentionRetryOptions(
        logRetentionRetryOptions: LogRetentionRetryOptionsDsl.() -> Unit = {}
    ) {
        val builder = LogRetentionRetryOptionsDsl()
        builder.apply(logRetentionRetryOptions)
        cdkBuilder.logRetentionRetryOptions(builder.build())
    }

    /**
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     *   to create the CloudWatch log group. These options control the retry policy when interacting
     *   with CloudWatch APIs.
     */
    public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
        cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions)
    }

    /**
     * @param logRetentionRole The IAM role for the Lambda function associated with the custom
     *   resource that sets the retention policy.
     */
    public fun logRetentionRole(logRetentionRole: IRole) {
        cdkBuilder.logRetentionRole(logRetentionRole)
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     *   processing. Minimum: 60 seconds Maximum: 6 hours
     */
    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    /**
     * @param memorySize The amount of memory, in MB, that is allocated to your Lambda function.
     *   Lambda uses this value to proportionally allocate the amount of CPU power. For more
     *   information, see Resource Model in the AWS Lambda Developer Guide.
     */
    public fun memorySize(memorySize: Number) {
        cdkBuilder.memorySize(memorySize)
    }

    /** @param onFailure The destination for failed invocations. */
    public fun onFailure(onFailure: IDestination) {
        cdkBuilder.onFailure(onFailure)
    }

    /** @param onSuccess The destination for successful invocations. */
    public fun onSuccess(onSuccess: IDestination) {
        cdkBuilder.onSuccess(onSuccess)
    }

    /** @param paramsAndSecrets Specify the configuration of Parameters and Secrets Extension. */
    public fun paramsAndSecrets(paramsAndSecrets: ParamsAndSecretsLayerVersion) {
        cdkBuilder.paramsAndSecrets(paramsAndSecrets)
    }

    /** @param profiling Enable profiling. */
    public fun profiling(profiling: Boolean) {
        cdkBuilder.profiling(profiling)
    }

    /** @param profilingGroup Profiling Group. */
    public fun profilingGroup(profilingGroup: IProfilingGroup) {
        cdkBuilder.profilingGroup(profilingGroup)
    }

    /**
     * @param reservedConcurrentExecutions The maximum of concurrent executions you want to reserve
     *   for the function.
     */
    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
        cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     *   Minimum: 0 Maximum: 2
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param role Lambda execution role. This is the role that will be assumed by the function upon
     *   execution. It controls the permissions that the function will have. The Role must be
     *   assumable by the 'lambda.amazonaws.com' service principal.
     *
     * The default Role automatically has permissions granted for Lambda execution. If you provide a
     * Role, you must add the relevant AWS managed policies yourself.
     *
     * The relevant managed policies are "service-role/AWSLambdaBasicExecutionRole" and
     * "service-role/AWSLambdaVPCAccessExecutionRole".
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param runtime The runtime environment for the Lambda function that you are uploading. For
     *   valid values, see the Runtime property in the AWS Lambda Developer Guide.
     *
     * Use `Runtime.FROM_IMAGE` when defining a function from a Docker image.
     */
    public fun runtime(runtime: Runtime) {
        cdkBuilder.runtime(runtime)
    }

    /**
     * @param runtimeManagementMode Sets the runtime management configuration for a function's
     *   version.
     */
    public fun runtimeManagementMode(runtimeManagementMode: RuntimeManagementMode) {
        cdkBuilder.runtimeManagementMode(runtimeManagementMode)
    }

    /**
     * @param securityGroups The list of security groups to associate with the Lambda's network
     *   interfaces. Only used if 'vpc' is supplied.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups The list of security groups to associate with the Lambda's network
     *   interfaces. Only used if 'vpc' is supplied.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param timeout The function execution time (in seconds) after which Lambda terminates the
     *   function. Because the execution time affects cost, set this value based on the function's
     *   expected execution time.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /** @param tracing Enable AWS X-Ray Tracing for Lambda Function. */
    public fun tracing(tracing: Tracing) {
        cdkBuilder.tracing(tracing)
    }

    /**
     * @param vpc VPC network to place Lambda network interfaces. Specify this if the Lambda
     *   function needs to access resources in a VPC. This is required when `vpcSubnets` is
     *   specified.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * @param vpcSubnets Where to place the network interfaces within the VPC. This requires `vpc`
     *   to be specified in order for interfaces to actually be placed in the subnets. If `vpc` is
     *   not specify, this will raise an error.
     *
     * Note: Internet access for Lambda Functions requires a NAT Gateway, so picking public subnets
     * is not allowed (unless `allowPublicSubnet` is set to `true`).
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /**
     * @param vpcSubnets Where to place the network interfaces within the VPC. This requires `vpc`
     *   to be specified in order for interfaces to actually be placed in the subnets. If `vpc` is
     *   not specify, this will raise an error.
     *
     * Note: Internet access for Lambda Functions requires a NAT Gateway, so picking public subnets
     * is not allowed (unless `allowPublicSubnet` is set to `true`).
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): TriggerFunctionProps {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        if (_executeAfter.isNotEmpty()) cdkBuilder.executeAfter(_executeAfter)
        if (_executeBefore.isNotEmpty()) cdkBuilder.executeBefore(_executeBefore)
        if (_initialPolicy.isNotEmpty()) cdkBuilder.initialPolicy(_initialPolicy)
        if (_layers.isNotEmpty()) cdkBuilder.layers(_layers)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
