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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.ResourceServerScope
import software.amazon.awscdk.services.cognito.UserPoolResourceServerProps

/**
 * Properties for the UserPoolResourceServer construct.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * ResourceServerScope resourceServerScope;
 * UserPool userPool;
 * UserPoolResourceServerProps userPoolResourceServerProps = UserPoolResourceServerProps.builder()
 * .identifier("identifier")
 * .userPool(userPool)
 * // the properties below are optional
 * .scopes(List.of(resourceServerScope))
 * .userPoolResourceServerName("userPoolResourceServerName")
 * .build();
 * ```
 */
@CdkDslMarker
public class UserPoolResourceServerPropsDsl {
    private val cdkBuilder: UserPoolResourceServerProps.Builder =
        UserPoolResourceServerProps.builder()

    private val _scopes: MutableList<ResourceServerScope> = mutableListOf()

    /** @param identifier A unique resource server identifier for the resource server. */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    /** @param scopes Oauth scopes. */
    public fun scopes(scopes: ResourceServerScopeDsl.() -> Unit) {
        _scopes.add(ResourceServerScopeDsl().apply(scopes).build())
    }

    /** @param scopes Oauth scopes. */
    public fun scopes(scopes: Collection<ResourceServerScope>) {
        _scopes.addAll(scopes)
    }

    /** @param userPool The user pool to add this resource server to. */
    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    /** @param userPoolResourceServerName A friendly name for the resource server. */
    public fun userPoolResourceServerName(userPoolResourceServerName: String) {
        cdkBuilder.userPoolResourceServerName(userPoolResourceServerName)
    }

    public fun build(): UserPoolResourceServerProps {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
