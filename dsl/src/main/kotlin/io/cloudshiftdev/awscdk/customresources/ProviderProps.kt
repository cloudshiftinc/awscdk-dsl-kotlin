package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ProviderProps {
  /**
   * The AWS Lambda function to invoke in order to determine if the operation is complete.
   *
   * This function will be called immediately after `onEvent` and then
   * periodically based on the configured query interval as long as it returns
   * `false`. If the function still returns `false` and the alloted timeout has
   * passed, the operation will fail.
   *
   * Default: - provider is synchronous. This means that the `onEvent` handler
   * is expected to finish all lifecycle operations within the initial invocation.
   */
  public fun isCompleteHandler(): IFunction? =
      unwrap(this).getIsCompleteHandler()?.let(IFunction::wrap)

  /**
   * The Log Group used for logging of events emitted by the custom resource's lambda function.
   *
   * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
   * If you are deploying to another type of region, please check regional availability first.
   *
   * Default: - a default log group created by AWS Lambda
   */
  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  /**
   * The number of days framework log events are kept in CloudWatch Logs.
   *
   * When
   * updating this property, unsetting it doesn't remove the log retention policy.
   * To remove the retention policy, set the value to `INFINITE`.
   *
   * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
   * `logGroup` allows you to create a fully customizable log group and instruct the Lambda function
   * to send logs to it.
   *
   * Default: logs.RetentionDays.INFINITE
   */
  public fun logRetention(): RetentionDays? =
      unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

  /**
   * The AWS Lambda function to invoke for all resource lifecycle operations (CREATE/UPDATE/DELETE).
   *
   * This function is responsible to begin the requested resource operation
   * (CREATE/UPDATE/DELETE) and return any additional properties to add to the
   * event, which will later be passed to `isComplete`. The `PhysicalResourceId`
   * property must be included in the response.
   */
  public fun onEventHandler(): IFunction

  /**
   * AWS KMS key used to encrypt provider lambda's environment variables.
   *
   * Default: -  AWS Lambda creates and uses an AWS managed customer master key (CMK)
   */
  public fun providerFunctionEnvEncryption(): IKey? =
      unwrap(this).getProviderFunctionEnvEncryption()?.let(IKey::wrap)

  /**
   * Provider Lambda name.
   *
   * The provider lambda function name.
   *
   * Default: -  CloudFormation default name from unique physical ID
   */
  public fun providerFunctionName(): String? = unwrap(this).getProviderFunctionName()

  /**
   * Time between calls to the `isComplete` handler which determines if the resource has been
   * stabilized.
   *
   * The first `isComplete` will be called immediately after `handler` and then
   * every `queryInterval` seconds, and until `timeout` has been reached or until
   * `isComplete` returns `true`.
   *
   * Default: Duration.seconds(5)
   */
  public fun queryInterval(): Duration? = unwrap(this).getQueryInterval()?.let(Duration::wrap)

  /**
   * AWS Lambda execution role.
   *
   * The role that will be assumed by the AWS Lambda.
   * Must be assumable by the 'lambda.amazonaws.com' service principal.
   *
   * Default: - A default role will be created.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Security groups to attach to the provider functions.
   *
   * Only used if 'vpc' is supplied
   *
   * Default: - If `vpc` is not supplied, no security groups are attached. Otherwise, a dedicated
   * security
   * group is created for each function.
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * Total timeout for the entire operation.
   *
   * The maximum timeout is 1 hour (yes, it can exceed the AWS Lambda 15 minutes)
   *
   * Default: Duration.minutes(30)
   */
  public fun totalTimeout(): Duration? = unwrap(this).getTotalTimeout()?.let(Duration::wrap)

  /**
   * The vpc to provision the lambda functions in.
   *
   * Default: - functions are not provisioned inside a vpc.
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * Which subnets from the VPC to place the lambda functions in.
   *
   * Only used if 'vpc' is supplied. Note: internet access for Lambdas
   * requires a NAT gateway, so picking Public subnets is not allowed.
   *
   * Default: - the Vpc default strategy if not specified
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [ProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param isCompleteHandler The AWS Lambda function to invoke in order to determine if the
     * operation is complete.
     * This function will be called immediately after `onEvent` and then
     * periodically based on the configured query interval as long as it returns
     * `false`. If the function still returns `false` and the alloted timeout has
     * passed, the operation will fail.
     */
    public fun isCompleteHandler(isCompleteHandler: IFunction)

    /**
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     * lambda function.
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * @param logRetention The number of days framework log events are kept in CloudWatch Logs.
     * When
     * updating this property, unsetting it doesn't remove the log retention policy.
     * To remove the retention policy, set the value to `INFINITE`.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    public fun logRetention(logRetention: RetentionDays)

    /**
     * @param onEventHandler The AWS Lambda function to invoke for all resource lifecycle operations
     * (CREATE/UPDATE/DELETE). 
     * This function is responsible to begin the requested resource operation
     * (CREATE/UPDATE/DELETE) and return any additional properties to add to the
     * event, which will later be passed to `isComplete`. The `PhysicalResourceId`
     * property must be included in the response.
     */
    public fun onEventHandler(onEventHandler: IFunction)

    /**
     * @param providerFunctionEnvEncryption AWS KMS key used to encrypt provider lambda's
     * environment variables.
     */
    public fun providerFunctionEnvEncryption(providerFunctionEnvEncryption: IKey)

    /**
     * @param providerFunctionName Provider Lambda name.
     * The provider lambda function name.
     */
    public fun providerFunctionName(providerFunctionName: String)

    /**
     * @param queryInterval Time between calls to the `isComplete` handler which determines if the
     * resource has been stabilized.
     * The first `isComplete` will be called immediately after `handler` and then
     * every `queryInterval` seconds, and until `timeout` has been reached or until
     * `isComplete` returns `true`.
     */
    public fun queryInterval(queryInterval: Duration)

    /**
     * @param role AWS Lambda execution role.
     * The role that will be assumed by the AWS Lambda.
     * Must be assumable by the 'lambda.amazonaws.com' service principal.
     */
    public fun role(role: IRole)

    /**
     * @param securityGroups Security groups to attach to the provider functions.
     * Only used if 'vpc' is supplied
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups Security groups to attach to the provider functions.
     * Only used if 'vpc' is supplied
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param totalTimeout Total timeout for the entire operation.
     * The maximum timeout is 1 hour (yes, it can exceed the AWS Lambda 15 minutes)
     */
    public fun totalTimeout(totalTimeout: Duration)

    /**
     * @param vpc The vpc to provision the lambda functions in.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in.
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in.
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59c9969f7250ffe8bee78b1148f2db9967d4a930cea26f58371093c920fe06b0")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.ProviderProps.Builder =
        software.amazon.awscdk.customresources.ProviderProps.builder()

    /**
     * @param isCompleteHandler The AWS Lambda function to invoke in order to determine if the
     * operation is complete.
     * This function will be called immediately after `onEvent` and then
     * periodically based on the configured query interval as long as it returns
     * `false`. If the function still returns `false` and the alloted timeout has
     * passed, the operation will fail.
     */
    override fun isCompleteHandler(isCompleteHandler: IFunction) {
      cdkBuilder.isCompleteHandler(isCompleteHandler.let(IFunction::unwrap))
    }

    /**
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     * lambda function.
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param logRetention The number of days framework log events are kept in CloudWatch Logs.
     * When
     * updating this property, unsetting it doesn't remove the log retention policy.
     * To remove the retention policy, set the value to `INFINITE`.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    /**
     * @param onEventHandler The AWS Lambda function to invoke for all resource lifecycle operations
     * (CREATE/UPDATE/DELETE). 
     * This function is responsible to begin the requested resource operation
     * (CREATE/UPDATE/DELETE) and return any additional properties to add to the
     * event, which will later be passed to `isComplete`. The `PhysicalResourceId`
     * property must be included in the response.
     */
    override fun onEventHandler(onEventHandler: IFunction) {
      cdkBuilder.onEventHandler(onEventHandler.let(IFunction::unwrap))
    }

    /**
     * @param providerFunctionEnvEncryption AWS KMS key used to encrypt provider lambda's
     * environment variables.
     */
    override fun providerFunctionEnvEncryption(providerFunctionEnvEncryption: IKey) {
      cdkBuilder.providerFunctionEnvEncryption(providerFunctionEnvEncryption.let(IKey::unwrap))
    }

    /**
     * @param providerFunctionName Provider Lambda name.
     * The provider lambda function name.
     */
    override fun providerFunctionName(providerFunctionName: String) {
      cdkBuilder.providerFunctionName(providerFunctionName)
    }

    /**
     * @param queryInterval Time between calls to the `isComplete` handler which determines if the
     * resource has been stabilized.
     * The first `isComplete` will be called immediately after `handler` and then
     * every `queryInterval` seconds, and until `timeout` has been reached or until
     * `isComplete` returns `true`.
     */
    override fun queryInterval(queryInterval: Duration) {
      cdkBuilder.queryInterval(queryInterval.let(Duration::unwrap))
    }

    /**
     * @param role AWS Lambda execution role.
     * The role that will be assumed by the AWS Lambda.
     * Must be assumable by the 'lambda.amazonaws.com' service principal.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param securityGroups Security groups to attach to the provider functions.
     * Only used if 'vpc' is supplied
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups Security groups to attach to the provider functions.
     * Only used if 'vpc' is supplied
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param totalTimeout Total timeout for the entire operation.
     * The maximum timeout is 1 hour (yes, it can exceed the AWS Lambda 15 minutes)
     */
    override fun totalTimeout(totalTimeout: Duration) {
      cdkBuilder.totalTimeout(totalTimeout.let(Duration::unwrap))
    }

    /**
     * @param vpc The vpc to provision the lambda functions in.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in.
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in.
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59c9969f7250ffe8bee78b1148f2db9967d4a930cea26f58371093c920fe06b0")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.customresources.ProviderProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.customresources.ProviderProps,
  ) : CdkObject(cdkObject), ProviderProps {
    /**
     * The AWS Lambda function to invoke in order to determine if the operation is complete.
     *
     * This function will be called immediately after `onEvent` and then
     * periodically based on the configured query interval as long as it returns
     * `false`. If the function still returns `false` and the alloted timeout has
     * passed, the operation will fail.
     *
     * Default: - provider is synchronous. This means that the `onEvent` handler
     * is expected to finish all lifecycle operations within the initial invocation.
     */
    override fun isCompleteHandler(): IFunction? =
        unwrap(this).getIsCompleteHandler()?.let(IFunction::wrap)

    /**
     * The Log Group used for logging of events emitted by the custom resource's lambda function.
     *
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     *
     * Default: - a default log group created by AWS Lambda
     */
    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    /**
     * The number of days framework log events are kept in CloudWatch Logs.
     *
     * When
     * updating this property, unsetting it doesn't remove the log retention policy.
     * To remove the retention policy, set the value to `INFINITE`.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: logs.RetentionDays.INFINITE
     */
    override fun logRetention(): RetentionDays? =
        unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

    /**
     * The AWS Lambda function to invoke for all resource lifecycle operations
     * (CREATE/UPDATE/DELETE).
     *
     * This function is responsible to begin the requested resource operation
     * (CREATE/UPDATE/DELETE) and return any additional properties to add to the
     * event, which will later be passed to `isComplete`. The `PhysicalResourceId`
     * property must be included in the response.
     */
    override fun onEventHandler(): IFunction = unwrap(this).getOnEventHandler().let(IFunction::wrap)

    /**
     * AWS KMS key used to encrypt provider lambda's environment variables.
     *
     * Default: -  AWS Lambda creates and uses an AWS managed customer master key (CMK)
     */
    override fun providerFunctionEnvEncryption(): IKey? =
        unwrap(this).getProviderFunctionEnvEncryption()?.let(IKey::wrap)

    /**
     * Provider Lambda name.
     *
     * The provider lambda function name.
     *
     * Default: -  CloudFormation default name from unique physical ID
     */
    override fun providerFunctionName(): String? = unwrap(this).getProviderFunctionName()

    /**
     * Time between calls to the `isComplete` handler which determines if the resource has been
     * stabilized.
     *
     * The first `isComplete` will be called immediately after `handler` and then
     * every `queryInterval` seconds, and until `timeout` has been reached or until
     * `isComplete` returns `true`.
     *
     * Default: Duration.seconds(5)
     */
    override fun queryInterval(): Duration? = unwrap(this).getQueryInterval()?.let(Duration::wrap)

    /**
     * AWS Lambda execution role.
     *
     * The role that will be assumed by the AWS Lambda.
     * Must be assumable by the 'lambda.amazonaws.com' service principal.
     *
     * Default: - A default role will be created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Security groups to attach to the provider functions.
     *
     * Only used if 'vpc' is supplied
     *
     * Default: - If `vpc` is not supplied, no security groups are attached. Otherwise, a dedicated
     * security
     * group is created for each function.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Total timeout for the entire operation.
     *
     * The maximum timeout is 1 hour (yes, it can exceed the AWS Lambda 15 minutes)
     *
     * Default: Duration.minutes(30)
     */
    override fun totalTimeout(): Duration? = unwrap(this).getTotalTimeout()?.let(Duration::wrap)

    /**
     * The vpc to provision the lambda functions in.
     *
     * Default: - functions are not provisioned inside a vpc.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * Which subnets from the VPC to place the lambda functions in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.ProviderProps):
        ProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProviderProps):
        software.amazon.awscdk.customresources.ProviderProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.customresources.ProviderProps
  }
}
