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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Specifies the JSON and CSV content types of the data that the endpoint captures.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CaptureContentTypeHeaderProperty captureContentTypeHeaderProperty =
 * CaptureContentTypeHeaderProperty.builder()
 * .csvContentTypes(List.of("csvContentTypes"))
 * .jsonContentTypes(List.of("jsonContentTypes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-capturecontenttypeheader.html)
 */
@CdkDslMarker
public class CfnEndpointConfigCaptureContentTypeHeaderPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.CaptureContentTypeHeaderProperty.Builder =
        CfnEndpointConfig.CaptureContentTypeHeaderProperty.builder()

    private val _csvContentTypes: MutableList<String> = mutableListOf()

    private val _jsonContentTypes: MutableList<String> = mutableListOf()

    /**
     * @param csvContentTypes A list of the CSV content types of the data that the endpoint
     *   captures. For the endpoint to capture the data, you must also specify the content type when
     *   you invoke the endpoint.
     */
    public fun csvContentTypes(vararg csvContentTypes: String) {
        _csvContentTypes.addAll(listOf(*csvContentTypes))
    }

    /**
     * @param csvContentTypes A list of the CSV content types of the data that the endpoint
     *   captures. For the endpoint to capture the data, you must also specify the content type when
     *   you invoke the endpoint.
     */
    public fun csvContentTypes(csvContentTypes: Collection<String>) {
        _csvContentTypes.addAll(csvContentTypes)
    }

    /**
     * @param jsonContentTypes A list of the JSON content types of the data that the endpoint
     *   captures. For the endpoint to capture the data, you must also specify the content type when
     *   you invoke the endpoint.
     */
    public fun jsonContentTypes(vararg jsonContentTypes: String) {
        _jsonContentTypes.addAll(listOf(*jsonContentTypes))
    }

    /**
     * @param jsonContentTypes A list of the JSON content types of the data that the endpoint
     *   captures. For the endpoint to capture the data, you must also specify the content type when
     *   you invoke the endpoint.
     */
    public fun jsonContentTypes(jsonContentTypes: Collection<String>) {
        _jsonContentTypes.addAll(jsonContentTypes)
    }

    public fun build(): CfnEndpointConfig.CaptureContentTypeHeaderProperty {
        if (_csvContentTypes.isNotEmpty()) cdkBuilder.csvContentTypes(_csvContentTypes)
        if (_jsonContentTypes.isNotEmpty()) cdkBuilder.jsonContentTypes(_jsonContentTypes)
        return cdkBuilder.build()
    }
}
