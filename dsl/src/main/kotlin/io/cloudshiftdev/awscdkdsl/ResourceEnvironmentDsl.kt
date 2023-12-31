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
import kotlin.String
import software.amazon.awscdk.ResourceEnvironment

/**
 * Represents the environment a given resource lives in.
 *
 * Used as the return value for the `IResource.env` property.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * ResourceEnvironment resourceEnvironment = ResourceEnvironment.builder()
 * .account("account")
 * .region("region")
 * .build();
 * ```
 */
@CdkDslMarker
public class ResourceEnvironmentDsl {
    private val cdkBuilder: ResourceEnvironment.Builder = ResourceEnvironment.builder()

    /**
     * @param account The AWS account ID that this resource belongs to. Since this can be a Token
     *   (for example, when the account is CloudFormation's AWS::AccountId intrinsic), make sure to
     *   use Token.compareStrings() instead of just comparing the values for equality.
     */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /**
     * @param region The AWS region that this resource belongs to. Since this can be a Token (for
     *   example, when the region is CloudFormation's AWS::Region intrinsic), make sure to use
     *   Token.compareStrings() instead of just comparing the values for equality.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): ResourceEnvironment = cdkBuilder.build()
}
