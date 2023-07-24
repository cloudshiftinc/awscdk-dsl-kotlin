@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Determines the gradient color settings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GradientColorProperty gradientColorProperty = GradientColorProperty.builder()
 * .stops(List.of(GradientStopProperty.builder()
 * .gradientOffset(123)
 * // the properties below are optional
 * .color("color")
 * .dataValue(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-gradientcolor.html)
 */
@CdkDslMarker
public class CfnTemplateGradientColorPropertyDsl {
    private val cdkBuilder: CfnTemplate.GradientColorProperty.Builder =
        CfnTemplate.GradientColorProperty.builder()

    private val _stops: MutableList<Any> = mutableListOf()

    /**
     * @param stops The list of gradient color stops.
     */
    public fun stops(vararg stops: Any) {
        _stops.addAll(listOf(*stops))
    }

    /**
     * @param stops The list of gradient color stops.
     */
    public fun stops(stops: Collection<Any>) {
        _stops.addAll(stops)
    }

    /**
     * @param stops The list of gradient color stops.
     */
    public fun stops(stops: IResolvable) {
        cdkBuilder.stops(stops)
    }

    public fun build(): CfnTemplate.GradientColorProperty {
        if (_stops.isNotEmpty()) cdkBuilder.stops(_stops)
        return cdkBuilder.build()
    }
}
