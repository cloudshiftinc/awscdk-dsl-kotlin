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

package io.cloudshiftdev.awscdkdsl.cxapi

import io.cloudshiftdev.awscdkdsl.cloudassembly.schema.TagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry
import software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry
import software.amazon.awscdk.cloudassembly.schema.Tag
import software.amazon.awscdk.cxapi.MetadataEntryResult

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * MetadataEntryResult metadataEntryResult = MetadataEntryResult.builder()
 * .path("path")
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .trace(List.of("trace"))
 * .build();
 * ```
 */
@CdkDslMarker
public class MetadataEntryResultDsl {
    private val cdkBuilder: MetadataEntryResult.Builder = MetadataEntryResult.builder()

    private val _data: MutableList<Tag> = mutableListOf()

    private val _trace: MutableList<String> = mutableListOf()

    /** @param data The data. */
    public fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
    }

    /** @param data The data. */
    public fun `data`(`data`: TagDsl.() -> Unit) {
        _data.add(TagDsl().apply(`data`).build())
    }

    /** @param data The data. */
    public fun `data`(`data`: Collection<Tag>) {
        _data.addAll(`data`)
    }

    /** @param data The data. */
    public fun `data`(`data`: ContainerImageAssetMetadataEntry) {
        cdkBuilder.`data`(`data`)
    }

    /** @param data The data. */
    public fun `data`(`data`: FileAssetMetadataEntry) {
        cdkBuilder.`data`(`data`)
    }

    /** @param path The path in which this entry was defined. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /** @param trace A stack trace for when the entry was created. */
    public fun trace(vararg trace: String) {
        _trace.addAll(listOf(*trace))
    }

    /** @param trace A stack trace for when the entry was created. */
    public fun trace(trace: Collection<String>) {
        _trace.addAll(trace)
    }

    /** @param type The type of the metadata entry. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): MetadataEntryResult {
        if (_data.isNotEmpty()) cdkBuilder.`data`(_data)
        if (_trace.isNotEmpty()) cdkBuilder.trace(_trace)
        return cdkBuilder.build()
    }
}
