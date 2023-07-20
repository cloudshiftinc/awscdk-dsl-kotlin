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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWebACLSizeConstraintStatementPropertyDsl {
    private val cdkBuilder: CfnWebACL.SizeConstraintStatementProperty.Builder =
        CfnWebACL.SizeConstraintStatementProperty.builder()

    private val _textTransformations: MutableList<Any> = mutableListOf()

    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    public fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    public fun fieldToMatch(fieldToMatch: CfnWebACL.FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun textTransformations(vararg textTransformations: Any) {
        _textTransformations.addAll(listOf(*textTransformations))
    }

    public fun textTransformations(textTransformations: Collection<Any>) {
        _textTransformations.addAll(textTransformations)
    }

    public fun textTransformations(textTransformations: IResolvable) {
        cdkBuilder.textTransformations(textTransformations)
    }

    public fun build(): CfnWebACL.SizeConstraintStatementProperty {
        if (_textTransformations.isNotEmpty()) cdkBuilder.textTransformations(_textTransformations)
        return cdkBuilder.build()
    }
}
