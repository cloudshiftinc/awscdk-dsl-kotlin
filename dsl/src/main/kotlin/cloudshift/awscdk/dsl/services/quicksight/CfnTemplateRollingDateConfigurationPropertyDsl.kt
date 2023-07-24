@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

/**
 * The rolling date configuration of a date time filter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RollingDateConfigurationProperty rollingDateConfigurationProperty =
 * RollingDateConfigurationProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .dataSetIdentifier("dataSetIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-rollingdateconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateRollingDateConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.RollingDateConfigurationProperty.Builder =
        CfnTemplate.RollingDateConfigurationProperty.builder()

    /**
     * @param dataSetIdentifier The data set that is used in the rolling date configuration.
     */
    public fun dataSetIdentifier(dataSetIdentifier: String) {
        cdkBuilder.dataSetIdentifier(dataSetIdentifier)
    }

    /**
     * @param expression The expression of the rolling date configuration.
     */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnTemplate.RollingDateConfigurationProperty = cdkBuilder.build()
}
