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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.GetContextValueOptions

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * Object dummyValue;
 * Object props;
 * GetContextValueOptions getContextValueOptions = GetContextValueOptions.builder()
 * .dummyValue(dummyValue)
 * .provider("provider")
 * // the properties below are optional
 * .includeEnvironment(false)
 * .props(Map.of(
 * "propsKey", props))
 * .build();
 * ```
 */
@CdkDslMarker
public class GetContextValueOptionsDsl {
    private val cdkBuilder: GetContextValueOptions.Builder = GetContextValueOptions.builder()

    /**
     * @param dummyValue The value to return if the context value was not found and a missing
     *   context is reported. This should be a dummy value that should preferably fail during
     *   deployment since it represents an invalid state.
     */
    public fun dummyValue(dummyValue: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(dummyValue)
        cdkBuilder.dummyValue(builder.map)
    }

    /**
     * @param dummyValue The value to return if the context value was not found and a missing
     *   context is reported. This should be a dummy value that should preferably fail during
     *   deployment since it represents an invalid state.
     */
    public fun dummyValue(dummyValue: Any) {
        cdkBuilder.dummyValue(dummyValue)
    }

    /**
     * @param includeEnvironment Whether to include the stack's account and region automatically.
     */
    public fun includeEnvironment(includeEnvironment: Boolean) {
        cdkBuilder.includeEnvironment(includeEnvironment)
    }

    /** @param props Provider-specific properties. */
    public fun props(props: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(props)
        cdkBuilder.props(builder.map)
    }

    /** @param props Provider-specific properties. */
    public fun props(props: Map<String, Any>) {
        cdkBuilder.props(props)
    }

    /** @param provider The context provider to query. */
    public fun provider(provider: String) {
        cdkBuilder.provider(provider)
    }

    public fun build(): GetContextValueOptions = cdkBuilder.build()
}
