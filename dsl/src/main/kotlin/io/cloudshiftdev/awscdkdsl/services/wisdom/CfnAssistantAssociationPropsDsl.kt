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

package io.cloudshiftdev.awscdkdsl.services.wisdom

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps

/**
 * Properties for defining a `CfnAssistantAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wisdom.*;
 * CfnAssistantAssociationProps cfnAssistantAssociationProps =
 * CfnAssistantAssociationProps.builder()
 * .assistantId("assistantId")
 * .association(AssociationDataProperty.builder()
 * .knowledgeBaseId("knowledgeBaseId")
 * .build())
 * .associationType("associationType")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistantassociation.html)
 */
@CdkDslMarker
public class CfnAssistantAssociationPropsDsl {
    private val cdkBuilder: CfnAssistantAssociationProps.Builder =
        CfnAssistantAssociationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param assistantId The identifier of the Wisdom assistant. */
    public fun assistantId(assistantId: String) {
        cdkBuilder.assistantId(assistantId)
    }

    /** @param association The identifier of the associated resource. */
    public fun association(association: IResolvable) {
        cdkBuilder.association(association)
    }

    /** @param association The identifier of the associated resource. */
    public fun association(association: CfnAssistantAssociation.AssociationDataProperty) {
        cdkBuilder.association(association)
    }

    /** @param associationType The type of association. */
    public fun associationType(associationType: String) {
        cdkBuilder.associationType(associationType)
    }

    /** @param tags The tags used to organize, track, or control access for this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags used to organize, track, or control access for this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAssistantAssociationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
