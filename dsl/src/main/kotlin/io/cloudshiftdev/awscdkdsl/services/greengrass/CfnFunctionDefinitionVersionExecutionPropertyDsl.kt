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

package io.cloudshiftdev.awscdkdsl.services.greengrass

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

/**
 * Configuration settings for the Lambda execution environment on the AWS IoT Greengrass core.
 *
 * In an AWS CloudFormation template, `Execution` is a property of the
 * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
 * property type for a function definition version and the
 * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
 * property type for a function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * ExecutionProperty executionProperty = ExecutionProperty.builder()
 * .isolationMode("isolationMode")
 * .runAs(RunAsProperty.builder()
 * .gid(123)
 * .uid(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html)
 */
@CdkDslMarker
public class CfnFunctionDefinitionVersionExecutionPropertyDsl {
    private val cdkBuilder: CfnFunctionDefinitionVersion.ExecutionProperty.Builder =
        CfnFunctionDefinitionVersion.ExecutionProperty.builder()

    /**
     * @param isolationMode The containerization that the Lambda function runs in. Valid values are
     *   `GreengrassContainer` or `NoContainer` . Typically, this is `GreengrassContainer` . For
     *   more information, see
     *   [Containerization](https://docs.aws.amazon.com/greengrass/latest/developerguide/lambda-group-config.html#lambda-function-containerization)
     *   in the *Developer Guide* .
     * * When set on the
     *   [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
     *   property of a function definition version, this setting is used as the default
     *   containerization for all Lambda functions in the function definition version.
     * * When set on the
     *   [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
     *   property of a function, this setting applies to the individual function and overrides the
     *   default. Omit this value to run the function with the default containerization.
     *
     * We recommend that you run in a Greengrass container unless your business case requires that
     * you run without containerization.
     */
    public fun isolationMode(isolationMode: String) {
        cdkBuilder.isolationMode(isolationMode)
    }

    /**
     * @param runAs The user and group permissions used to run the Lambda function. Typically, this
     *   is the ggc_user and ggc_group. For more information, see
     *   [Run as](https://docs.aws.amazon.com/greengrass/latest/developerguide/lambda-group-config.html#lambda-access-identity.html)
     *   in the *Developer Guide* .
     * * When set on the
     *   [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
     *   property of a function definition version, this setting is used as the default access
     *   identity for all Lambda functions in the function definition version.
     * * When set on the
     *   [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
     *   property of a function, this setting applies to the individual function and overrides the
     *   default. You can override the user, group, or both. Omit this value to run the function
     *   with the default permissions.
     *
     * Running as the root user increases risks to your data and device. Do not run as root
     * (UID/GID=0) unless your business case requires it. For more information and requirements, see
     * [Running a Lambda Function as Root](https://docs.aws.amazon.com/greengrass/latest/developerguide/lambda-group-config.html#lambda-running-as-root)
     * .
     */
    public fun runAs(runAs: IResolvable) {
        cdkBuilder.runAs(runAs)
    }

    /**
     * @param runAs The user and group permissions used to run the Lambda function. Typically, this
     *   is the ggc_user and ggc_group. For more information, see
     *   [Run as](https://docs.aws.amazon.com/greengrass/latest/developerguide/lambda-group-config.html#lambda-access-identity.html)
     *   in the *Developer Guide* .
     * * When set on the
     *   [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
     *   property of a function definition version, this setting is used as the default access
     *   identity for all Lambda functions in the function definition version.
     * * When set on the
     *   [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
     *   property of a function, this setting applies to the individual function and overrides the
     *   default. You can override the user, group, or both. Omit this value to run the function
     *   with the default permissions.
     *
     * Running as the root user increases risks to your data and device. Do not run as root
     * (UID/GID=0) unless your business case requires it. For more information and requirements, see
     * [Running a Lambda Function as Root](https://docs.aws.amazon.com/greengrass/latest/developerguide/lambda-group-config.html#lambda-running-as-root)
     * .
     */
    public fun runAs(runAs: CfnFunctionDefinitionVersion.RunAsProperty) {
        cdkBuilder.runAs(runAs)
    }

    public fun build(): CfnFunctionDefinitionVersion.ExecutionProperty = cdkBuilder.build()
}
