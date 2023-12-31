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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnModelProps

/**
 * Properties for defining a `CfnModel`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * Object schema;
 * CfnModelProps cfnModelProps = CfnModelProps.builder()
 * .restApiId("restApiId")
 * // the properties below are optional
 * .contentType("contentType")
 * .description("description")
 * .name("name")
 * .schema(schema)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html)
 */
@CdkDslMarker
public class CfnModelPropsDsl {
    private val cdkBuilder: CfnModelProps.Builder = CfnModelProps.builder()

    /** @param contentType The content-type for the model. */
    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    /** @param description The description of the model. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name A name for the model. If you don't specify a name, AWS CloudFormation generates a
     *   unique physical ID and uses that ID for the model name. For more information, see
     *   [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     *   .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param restApiId The string identifier of the associated RestApi. */
    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    /**
     * @param schema The schema for the model. For `application/json` models, this should be JSON
     *   schema draft 4 model. Do not include "* /" characters in the description of any properties
     *   because such "* /" characters may be interpreted as the closing marker for comments in some
     *   languages, such as Java or JavaScript, causing the installation of your API's SDK generated
     *   by API Gateway to fail.
     */
    public fun schema(schema: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(schema)
        cdkBuilder.schema(builder.map)
    }

    /**
     * @param schema The schema for the model. For `application/json` models, this should be JSON
     *   schema draft 4 model. Do not include "* /" characters in the description of any properties
     *   because such "* /" characters may be interpreted as the closing marker for comments in some
     *   languages, such as Java or JavaScript, causing the installation of your API's SDK generated
     *   by API Gateway to fail.
     */
    public fun schema(schema: Any) {
        cdkBuilder.schema(schema)
    }

    public fun build(): CfnModelProps = cdkBuilder.build()
}
