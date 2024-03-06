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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps

/**
 * Properties for defining a `CfnPolicyStore`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * CfnPolicyStoreProps cfnPolicyStoreProps = CfnPolicyStoreProps.builder()
 * .validationSettings(ValidationSettingsProperty.builder()
 * .mode("mode")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .schema(SchemaDefinitionProperty.builder()
 * .cedarJson("cedarJson")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html)
 */
@CdkDslMarker
public class CfnPolicyStorePropsDsl {
    private val cdkBuilder: CfnPolicyStoreProps.Builder = CfnPolicyStoreProps.builder()

    /**
     * @param description Descriptive text that you can provide to help with identification of the
     *   current policy store.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param schema Creates or updates the policy schema in a policy store. Cedar can use the
     *   schema to validate any Cedar policies and policy templates submitted to the policy store.
     *   Any changes to the schema validate only policies and templates submitted after the schema
     *   change. Existing policies and templates are not re-evaluated against the changed schema. If
     *   you later update a policy, then it is evaluated against the new schema at that time.
     */
    public fun schema(schema: IResolvable) {
        cdkBuilder.schema(schema)
    }

    /**
     * @param schema Creates or updates the policy schema in a policy store. Cedar can use the
     *   schema to validate any Cedar policies and policy templates submitted to the policy store.
     *   Any changes to the schema validate only policies and templates submitted after the schema
     *   change. Existing policies and templates are not re-evaluated against the changed schema. If
     *   you later update a policy, then it is evaluated against the new schema at that time.
     */
    public fun schema(schema: CfnPolicyStore.SchemaDefinitionProperty) {
        cdkBuilder.schema(schema)
    }

    /**
     * @param validationSettings Specifies the validation setting for this policy store. Currently,
     *   the only valid and required value is `Mode` .
     *
     * We recommend that you turn on `STRICT` mode only after you define a schema. If a schema
     * doesn't exist, then `STRICT` mode causes any policy to fail validation, and Verified
     * Permissions rejects the policy. You can turn off validation by using the
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * . Then, when you have a schema defined, use
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * again to turn validation back on.
     */
    public fun validationSettings(validationSettings: IResolvable) {
        cdkBuilder.validationSettings(validationSettings)
    }

    /**
     * @param validationSettings Specifies the validation setting for this policy store. Currently,
     *   the only valid and required value is `Mode` .
     *
     * We recommend that you turn on `STRICT` mode only after you define a schema. If a schema
     * doesn't exist, then `STRICT` mode causes any policy to fail validation, and Verified
     * Permissions rejects the policy. You can turn off validation by using the
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * . Then, when you have a schema defined, use
     * [UpdatePolicyStore](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyStore)
     * again to turn validation back on.
     */
    public fun validationSettings(validationSettings: CfnPolicyStore.ValidationSettingsProperty) {
        cdkBuilder.validationSettings(validationSettings)
    }

    public fun build(): CfnPolicyStoreProps = cdkBuilder.build()
}
