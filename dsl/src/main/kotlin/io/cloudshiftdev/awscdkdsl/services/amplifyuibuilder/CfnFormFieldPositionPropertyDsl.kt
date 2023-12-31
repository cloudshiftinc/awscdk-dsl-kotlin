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

package io.cloudshiftdev.awscdkdsl.services.amplifyuibuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * The `FieldPosition` property specifies the field position.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FieldPositionProperty fieldPositionProperty = FieldPositionProperty.builder()
 * .below("below")
 * .fixed("fixed")
 * .rightOf("rightOf")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldposition.html)
 */
@CdkDslMarker
public class CfnFormFieldPositionPropertyDsl {
    private val cdkBuilder: CfnForm.FieldPositionProperty.Builder =
        CfnForm.FieldPositionProperty.builder()

    /** @param below The field position is below the field specified by the string. */
    public fun below(below: String) {
        cdkBuilder.below(below)
    }

    /** @param fixed The field position is fixed and doesn't change in relation to other fields. */
    public fun fixed(fixed: String) {
        cdkBuilder.fixed(fixed)
    }

    /** @param rightOf The field position is to the right of the field specified by the string. */
    public fun rightOf(rightOf: String) {
        cdkBuilder.rightOf(rightOf)
    }

    public fun build(): CfnForm.FieldPositionProperty = cdkBuilder.build()
}
