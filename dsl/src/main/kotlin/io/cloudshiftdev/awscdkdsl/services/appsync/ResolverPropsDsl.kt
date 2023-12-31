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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appsync.BaseDataSource
import software.amazon.awscdk.services.appsync.CachingConfig
import software.amazon.awscdk.services.appsync.Code
import software.amazon.awscdk.services.appsync.FunctionRuntime
import software.amazon.awscdk.services.appsync.IAppsyncFunction
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.MappingTemplate
import software.amazon.awscdk.services.appsync.ResolverProps

/**
 * Additional property for an AppSync resolver for GraphQL API reference.
 *
 * Example:
 * ```
 * GraphqlApi api;
 * AppsyncFunction appsyncFunction;
 * Resolver pipelineResolver = Resolver.Builder.create(this, "pipeline")
 * .api(api)
 * .dataSource(api.addNoneDataSource("none"))
 * .typeName("typeName")
 * .fieldName("fieldName")
 * .requestMappingTemplate(MappingTemplate.fromFile("beforeRequest.vtl"))
 * .pipelineConfig(List.of(appsyncFunction))
 * .responseMappingTemplate(MappingTemplate.fromFile("afterResponse.vtl"))
 * .build();
 * ```
 */
@CdkDslMarker
public class ResolverPropsDsl {
    private val cdkBuilder: ResolverProps.Builder = ResolverProps.builder()

    private val _pipelineConfig: MutableList<IAppsyncFunction> = mutableListOf()

    /** @param api The API this resolver is attached to. */
    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    /** @param cachingConfig The caching configuration for this resolver. */
    public fun cachingConfig(cachingConfig: CachingConfigDsl.() -> Unit = {}) {
        val builder = CachingConfigDsl()
        builder.apply(cachingConfig)
        cdkBuilder.cachingConfig(builder.build())
    }

    /** @param cachingConfig The caching configuration for this resolver. */
    public fun cachingConfig(cachingConfig: CachingConfig) {
        cdkBuilder.cachingConfig(cachingConfig)
    }

    /** @param code The function code. */
    public fun code(code: Code) {
        cdkBuilder.code(code)
    }

    /** @param dataSource The data source this resolver is using. */
    public fun dataSource(dataSource: BaseDataSource) {
        cdkBuilder.dataSource(dataSource)
    }

    /**
     * @param fieldName name of the GraphQL field in the given type this resolver is attached to.
     */
    public fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
    }

    /** @param maxBatchSize The maximum number of elements per batch, when using batch invoke. */
    public fun maxBatchSize(maxBatchSize: Number) {
        cdkBuilder.maxBatchSize(maxBatchSize)
    }

    /** @param pipelineConfig configuration of the pipeline resolver. */
    public fun pipelineConfig(vararg pipelineConfig: IAppsyncFunction) {
        _pipelineConfig.addAll(listOf(*pipelineConfig))
    }

    /** @param pipelineConfig configuration of the pipeline resolver. */
    public fun pipelineConfig(pipelineConfig: Collection<IAppsyncFunction>) {
        _pipelineConfig.addAll(pipelineConfig)
    }

    /** @param requestMappingTemplate The request mapping template for this resolver. */
    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
        cdkBuilder.requestMappingTemplate(requestMappingTemplate)
    }

    /** @param responseMappingTemplate The response mapping template for this resolver. */
    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
        cdkBuilder.responseMappingTemplate(responseMappingTemplate)
    }

    /** @param runtime The functions runtime. */
    public fun runtime(runtime: FunctionRuntime) {
        cdkBuilder.runtime(runtime)
    }

    /** @param typeName name of the GraphQL type this resolver is attached to. */
    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    public fun build(): ResolverProps {
        if (_pipelineConfig.isNotEmpty()) cdkBuilder.pipelineConfig(_pipelineConfig)
        return cdkBuilder.build()
    }
}
