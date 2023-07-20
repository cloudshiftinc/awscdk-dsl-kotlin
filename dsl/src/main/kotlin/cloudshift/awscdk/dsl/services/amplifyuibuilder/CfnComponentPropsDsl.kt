@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnComponentPropsDsl {
    private val cdkBuilder: CfnComponentProps.Builder = CfnComponentProps.builder()

    private val _children: MutableList<Any> = mutableListOf()

    private val _variants: MutableList<Any> = mutableListOf()

    public fun appId(appId: String) {
        cdkBuilder.appId(appId)
    }

    public fun bindingProperties(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.bindingProperties(builder.map)
    }

    public fun bindingProperties(bindingProperties: Map<String, Any>) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    public fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    public fun children(vararg children: Any) {
        _children.addAll(listOf(*children))
    }

    public fun children(children: Collection<Any>) {
        _children.addAll(children)
    }

    public fun children(children: IResolvable) {
        cdkBuilder.children(children)
    }

    public fun collectionProperties(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.collectionProperties(builder.map)
    }

    public fun collectionProperties(collectionProperties: Map<String, Any>) {
        cdkBuilder.collectionProperties(collectionProperties)
    }

    public fun collectionProperties(collectionProperties: IResolvable) {
        cdkBuilder.collectionProperties(collectionProperties)
    }

    public fun componentType(componentType: String) {
        cdkBuilder.componentType(componentType)
    }

    public fun environmentName(environmentName: String) {
        cdkBuilder.environmentName(environmentName)
    }

    public fun events(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.events(builder.map)
    }

    public fun events(events: Map<String, Any>) {
        cdkBuilder.events(events)
    }

    public fun events(events: IResolvable) {
        cdkBuilder.events(events)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun overrides(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.overrides(builder.map)
    }

    public fun overrides(overrides: Any) {
        cdkBuilder.overrides(overrides)
    }

    public fun properties(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.properties(builder.map)
    }

    public fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    public fun schemaVersion(schemaVersion: String) {
        cdkBuilder.schemaVersion(schemaVersion)
    }

    public fun sourceId(sourceId: String) {
        cdkBuilder.sourceId(sourceId)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun variants(vararg variants: Any) {
        _variants.addAll(listOf(*variants))
    }

    public fun variants(variants: Collection<Any>) {
        _variants.addAll(variants)
    }

    public fun variants(variants: IResolvable) {
        cdkBuilder.variants(variants)
    }

    public fun build(): CfnComponentProps {
        if (_children.isNotEmpty()) cdkBuilder.children(_children)
        if (_variants.isNotEmpty()) cdkBuilder.variants(_variants)
        return cdkBuilder.build()
    }
}
