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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.CfnHook
import software.constructs.Construct

/**
 * Represents a CloudFormation resource.
 *
 * Example:
 * ```
 * CfnInclude cfnTemplate;
 * // mutating the hook
 * Role myRole;
 * CfnHook hook = cfnTemplate.getHook("MyOutput");
 * CfnCodeDeployBlueGreenHook codeDeployHook = (CfnCodeDeployBlueGreenHook)hook;
 * codeDeployHook.getServiceRole() = myRole.getRoleArn();
 * ```
 */
@CdkDslMarker
public class CfnHookDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnHook.Builder = CfnHook.Builder.create(scope, id)

    /**
     * The properties of the hook.
     *
     * Default: - no properties
     *
     * @param properties The properties of the hook.
     */
    public fun properties(properties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(properties)
        cdkBuilder.properties(builder.map)
    }

    /**
     * The properties of the hook.
     *
     * Default: - no properties
     *
     * @param properties The properties of the hook.
     */
    public fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
    }

    /**
     * The type of the hook (for example, "AWS::CodeDeploy::BlueGreen").
     *
     * @param type The type of the hook (for example, "AWS::CodeDeploy::BlueGreen").
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnHook = cdkBuilder.build()
}
