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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import software.amazon.awscdk.services.quicksight.CfnTemplateProps

/**
 * Properties for defining a `CfnTemplate`.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-template.html)
 */
@CdkDslMarker
public class CfnTemplatePropsDsl {
    private val cdkBuilder: CfnTemplateProps.Builder = CfnTemplateProps.builder()

    private val _permissions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param awsAccountId The ID for the AWS account that the group is in. You use the ID for the
     *   AWS account that contains your Amazon QuickSight account.
     */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /** @param definition the value to be set. */
    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    /** @param definition the value to be set. */
    public fun definition(definition: CfnTemplate.TemplateVersionDefinitionProperty) {
        cdkBuilder.definition(definition)
    }

    /** @param name A display name for the template. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param permissions A list of resource permissions to be set on the template. */
    public fun permissions(vararg permissions: Any) {
        _permissions.addAll(listOf(*permissions))
    }

    /** @param permissions A list of resource permissions to be set on the template. */
    public fun permissions(permissions: Collection<Any>) {
        _permissions.addAll(permissions)
    }

    /** @param permissions A list of resource permissions to be set on the template. */
    public fun permissions(permissions: IResolvable) {
        cdkBuilder.permissions(permissions)
    }

    /**
     * @param sourceEntity The entity that you are using as a source when you create the template.
     *   In `SourceEntity` , you specify the type of object you're using as source: `SourceTemplate`
     *   for a template or `SourceAnalysis` for an analysis. Both of these require an Amazon
     *   Resource Name (ARN). For `SourceTemplate` , specify the ARN of the source template. For
     *   `SourceAnalysis` , specify the ARN of the source analysis. The `SourceTemplate` ARN can
     *   contain any AWS account and any Amazon QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` or `SourceAnalysis` to list the
     * replacement datasets for the placeholders listed in the original. The schema in each dataset
     * must match its placeholder.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    public fun sourceEntity(sourceEntity: IResolvable) {
        cdkBuilder.sourceEntity(sourceEntity)
    }

    /**
     * @param sourceEntity The entity that you are using as a source when you create the template.
     *   In `SourceEntity` , you specify the type of object you're using as source: `SourceTemplate`
     *   for a template or `SourceAnalysis` for an analysis. Both of these require an Amazon
     *   Resource Name (ARN). For `SourceTemplate` , specify the ARN of the source template. For
     *   `SourceAnalysis` , specify the ARN of the source analysis. The `SourceTemplate` ARN can
     *   contain any AWS account and any Amazon QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` or `SourceAnalysis` to list the
     * replacement datasets for the placeholders listed in the original. The schema in each dataset
     * must match its placeholder.
     *
     * Either a `SourceEntity` or a `Definition` must be provided in order for the request to be
     * valid.
     */
    public fun sourceEntity(sourceEntity: CfnTemplate.TemplateSourceEntityProperty) {
        cdkBuilder.sourceEntity(sourceEntity)
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     *   the resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     *   the resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param templateId An ID for the template that you want to create. This template is unique per
     *   AWS Region ; in each AWS account.
     */
    public fun templateId(templateId: String) {
        cdkBuilder.templateId(templateId)
    }

    /**
     * @param versionDescription A description of the current template version being created. This
     *   API operation creates the first version of the template. Every time `UpdateTemplate` is
     *   called, a new version is created. Each version of the template maintains a description of
     *   the version in the `VersionDescription` field.
     */
    public fun versionDescription(versionDescription: String) {
        cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): CfnTemplateProps {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
