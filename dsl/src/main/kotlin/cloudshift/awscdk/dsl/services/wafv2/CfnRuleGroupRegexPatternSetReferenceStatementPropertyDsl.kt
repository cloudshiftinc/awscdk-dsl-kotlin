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
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleGroupRegexPatternSetReferenceStatementPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.RegexPatternSetReferenceStatementProperty.Builder =
        CfnRuleGroup.RegexPatternSetReferenceStatementProperty.builder()

    private val _textTransformations: MutableList<Any> = mutableListOf()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    public fun fieldToMatch(fieldToMatch: CfnRuleGroup.FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch)
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

    public fun build(): CfnRuleGroup.RegexPatternSetReferenceStatementProperty {
        if (_textTransformations.isNotEmpty()) cdkBuilder.textTransformations(_textTransformations)
        return cdkBuilder.build()
    }
}
