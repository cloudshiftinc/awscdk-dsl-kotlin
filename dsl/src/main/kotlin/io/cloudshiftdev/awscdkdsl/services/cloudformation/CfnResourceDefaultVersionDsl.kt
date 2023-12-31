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

package io.cloudshiftdev.awscdkdsl.services.cloudformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion
import software.constructs.Construct

/**
 * Specifies the default version of a resource.
 *
 * The default version of a resource will be used in CloudFormation operations.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * CfnResourceDefaultVersion cfnResourceDefaultVersion =
 * CfnResourceDefaultVersion.Builder.create(this, "MyCfnResourceDefaultVersion")
 * .typeName("typeName")
 * .typeVersionArn("typeVersionArn")
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html)
 */
@CdkDslMarker
public class CfnResourceDefaultVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourceDefaultVersion.Builder =
        CfnResourceDefaultVersion.Builder.create(scope, id)

    /**
     * The name of the resource.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-typename)
     *
     * @param typeName The name of the resource.
     */
    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    /**
     * The Amazon Resource Name (ARN) of the resource version.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-typeversionarn)
     *
     * @param typeVersionArn The Amazon Resource Name (ARN) of the resource version.
     */
    public fun typeVersionArn(typeVersionArn: String) {
        cdkBuilder.typeVersionArn(typeVersionArn)
    }

    /**
     * The ID of a specific version of the resource.
     *
     * The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the
     * resource version when it's registered.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-versionid)
     *
     * @param versionId The ID of a specific version of the resource.
     */
    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): CfnResourceDefaultVersion = cdkBuilder.build()
}
