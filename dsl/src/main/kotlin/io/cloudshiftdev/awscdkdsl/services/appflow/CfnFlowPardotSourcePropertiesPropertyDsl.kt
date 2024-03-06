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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when Salesforce Pardot is being used as a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * PardotSourcePropertiesProperty pardotSourcePropertiesProperty =
 * PardotSourcePropertiesProperty.builder()
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-pardotsourceproperties.html)
 */
@CdkDslMarker
public class CfnFlowPardotSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.PardotSourcePropertiesProperty.Builder =
        CfnFlow.PardotSourcePropertiesProperty.builder()

    /** @param object The object specified in the Salesforce Pardot flow source. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.PardotSourcePropertiesProperty = cdkBuilder.build()
}
