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

package io.cloudshiftdev.awscdkdsl.services.servicecatalog

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint
import software.constructs.Construct

/**
 * Specifies a launch constraint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnLaunchRoleConstraint cfnLaunchRoleConstraint = CfnLaunchRoleConstraint.Builder.create(this,
 * "MyCfnLaunchRoleConstraint")
 * .portfolioId("portfolioId")
 * .productId("productId")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .description("description")
 * .localRoleName("localRoleName")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html)
 */
@CdkDslMarker
public class CfnLaunchRoleConstraintDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLaunchRoleConstraint.Builder =
        CfnLaunchRoleConstraint.Builder.create(scope, id)

    /**
     * The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-acceptlanguage)
     *
     * @param acceptLanguage The language code.
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * The description of the constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-description)
     *
     * @param description The description of the constraint.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * You are required to specify either the `RoleArn` or the `LocalRoleName` but can't use both.
     *
     * If you specify the `LocalRoleName` property, when an account uses the launch constraint, the
     * IAM role with that name in the account will be used. This allows launch-role constraints to
     * be account-agnostic so the administrator can create fewer resources per shared account.
     *
     * The given role name must exist in the account used to create the launch constraint and the
     * account of the user who launches a product with this launch constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-localrolename)
     *
     * @param localRoleName You are required to specify either the `RoleArn` or the `LocalRoleName`
     *   but can't use both.
     */
    public fun localRoleName(localRoleName: String) {
        cdkBuilder.localRoleName(localRoleName)
    }

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-portfolioid)
     *
     * @param portfolioId The portfolio identifier.
     */
    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    /**
     * The product identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-productid)
     *
     * @param productId The product identifier.
     */
    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    /**
     * The ARN of the launch role.
     *
     * You are required to specify `RoleArn` or `LocalRoleName` but can't use both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-rolearn)
     *
     * @param roleArn The ARN of the launch role.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnLaunchRoleConstraint = cdkBuilder.build()
}
