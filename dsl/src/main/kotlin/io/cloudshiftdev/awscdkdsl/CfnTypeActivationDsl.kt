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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.CfnTypeActivation
import software.amazon.awscdk.IResolvable
import software.constructs.Construct

/**
 * Activates a public third-party extension, making it available for use in stack templates.
 *
 * For more information, see
 * [Using public extensions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html)
 * in the *AWS CloudFormation User Guide* .
 *
 * Once you have activated a public third-party extension in your account and Region, use
 * [SetTypeConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetTypeConfiguration.html)
 * to specify configuration properties for the extension. For more information, see
 * [Configuring extensions at the account level](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-register.html#registry-set-configuration)
 * in the *CloudFormation User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnTypeActivation cfnTypeActivation = CfnTypeActivation.Builder.create(this,
 * "MyCfnTypeActivation")
 * .autoUpdate(false)
 * .executionRoleArn("executionRoleArn")
 * .loggingConfig(LoggingConfigProperty.builder()
 * .logGroupName("logGroupName")
 * .logRoleArn("logRoleArn")
 * .build())
 * .majorVersion("majorVersion")
 * .publicTypeArn("publicTypeArn")
 * .publisherId("publisherId")
 * .type("type")
 * .typeName("typeName")
 * .typeNameAlias("typeNameAlias")
 * .versionBump("versionBump")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html)
 */
@CdkDslMarker
public class CfnTypeActivationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTypeActivation.Builder = CfnTypeActivation.Builder.create(scope, id)

    /**
     * Whether to automatically update the extension in this account and Region when a new *minor*
     * version is published by the extension publisher.
     *
     * Major versions released by the publisher must be manually updated.
     *
     * The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-autoupdate)
     *
     * @param autoUpdate Whether to automatically update the extension in this account and Region
     *   when a new *minor* version is published by the extension publisher.
     */
    public fun autoUpdate(autoUpdate: Boolean) {
        cdkBuilder.autoUpdate(autoUpdate)
    }

    /**
     * Whether to automatically update the extension in this account and Region when a new *minor*
     * version is published by the extension publisher.
     *
     * Major versions released by the publisher must be manually updated.
     *
     * The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-autoupdate)
     *
     * @param autoUpdate Whether to automatically update the extension in this account and Region
     *   when a new *minor* version is published by the extension publisher.
     */
    public fun autoUpdate(autoUpdate: IResolvable) {
        cdkBuilder.autoUpdate(autoUpdate)
    }

    /**
     * The name of the IAM execution role to use to activate the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-executionrolearn)
     *
     * @param executionRoleArn The name of the IAM execution role to use to activate the extension.
     */
    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * Specifies logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
     *
     * @param loggingConfig Specifies logging configuration information for an extension.
     */
    public fun loggingConfig(loggingConfig: CfnTypeActivation.LoggingConfigProperty) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    /**
     * Specifies logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
     *
     * @param loggingConfig Specifies logging configuration information for an extension.
     */
    public fun loggingConfig(loggingConfig: IResolvable) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    /**
     * The major version of this extension you want to activate, if multiple major versions are
     * available.
     *
     * The default is the latest major version. CloudFormation uses the latest available *minor*
     * version of the major version selected.
     *
     * You can specify `MajorVersion` or `VersionBump` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-majorversion)
     *
     * @param majorVersion The major version of this extension you want to activate, if multiple
     *   major versions are available.
     */
    public fun majorVersion(majorVersion: String) {
        cdkBuilder.majorVersion(majorVersion)
    }

    /**
     * The Amazon Resource Number (ARN) of the public extension.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publictypearn)
     *
     * @param publicTypeArn The Amazon Resource Number (ARN) of the public extension.
     */
    public fun publicTypeArn(publicTypeArn: String) {
        cdkBuilder.publicTypeArn(publicTypeArn)
    }

    /**
     * The ID of the extension publisher.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publisherid)
     *
     * @param publisherId The ID of the extension publisher.
     */
    public fun publisherId(publisherId: String) {
        cdkBuilder.publisherId(publisherId)
    }

    /**
     * The extension type.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-type)
     *
     * @param type The extension type.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * The name of the extension.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-typename)
     *
     * @param typeName The name of the extension.
     */
    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    /**
     * An alias to assign to the public extension, in this account and Region.
     *
     * If you specify an alias for the extension, CloudFormation treats the alias as the extension
     * type name within this account and Region. You must use the alias to refer to the extension in
     * your templates, API calls, and CloudFormation console.
     *
     * An extension alias must be unique within a given account and Region. You can activate the
     * same public resource multiple times in the same account and Region, using different type name
     * aliases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-typenamealias)
     *
     * @param typeNameAlias An alias to assign to the public extension, in this account and Region.
     */
    public fun typeNameAlias(typeNameAlias: String) {
        cdkBuilder.typeNameAlias(typeNameAlias)
    }

    /**
     * Manually updates a previously-activated type to a new major or minor version, if available.
     *
     * You can also use this parameter to update the value of `AutoUpdate` .
     * * `MAJOR` : CloudFormation updates the extension to the newest major version, if one is
     *   available.
     * * `MINOR` : CloudFormation updates the extension to the newest minor version, if one is
     *   available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-versionbump)
     *
     * @param versionBump Manually updates a previously-activated type to a new major or minor
     *   version, if available.
     */
    public fun versionBump(versionBump: String) {
        cdkBuilder.versionBump(versionBump)
    }

    public fun build(): CfnTypeActivation = cdkBuilder.build()
}
