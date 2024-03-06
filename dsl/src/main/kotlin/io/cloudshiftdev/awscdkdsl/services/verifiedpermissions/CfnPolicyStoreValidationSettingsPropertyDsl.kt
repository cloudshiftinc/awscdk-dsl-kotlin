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

package io.cloudshiftdev.awscdkdsl.services.verifiedpermissions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore

/**
 * A structure that contains Cedar policy validation settings for the policy store.
 *
 * The validation mode determines which validation failures that Cedar considers serious enough to
 * block acceptance of a new or edited static policy or policy template.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * ValidationSettingsProperty validationSettingsProperty = ValidationSettingsProperty.builder()
 * .mode("mode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policystore-validationsettings.html)
 */
@CdkDslMarker
public class CfnPolicyStoreValidationSettingsPropertyDsl {
    private val cdkBuilder: CfnPolicyStore.ValidationSettingsProperty.Builder =
        CfnPolicyStore.ValidationSettingsProperty.builder()

    /**
     * @param mode The validation mode currently configured for this policy store. The valid values
     *   are:.
     * * *OFF* – Neither Verified Permissions nor Cedar perform any validation on policies. No
     *   validation errors are reported by either service.
     * * *STRICT* – Requires a schema to be present in the policy store. Cedar performs validation
     *   on all submitted new or updated static policies and policy templates. Any that fail
     *   validation are rejected and Cedar doesn't store them in the policy store.
     *
     * If `Mode=STRICT` and the policy store doesn't contain a schema, Verified Permissions rejects
     * all static policies and policy templates because there is no schema to validate against.
     *
     * To submit a static policy or policy template without a schema, you must turn off validation.
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnPolicyStore.ValidationSettingsProperty = cdkBuilder.build()
}
