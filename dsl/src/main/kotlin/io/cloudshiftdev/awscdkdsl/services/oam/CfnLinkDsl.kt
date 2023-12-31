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

package io.cloudshiftdev.awscdkdsl.services.oam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.oam.CfnLink
import software.constructs.Construct

/**
 * Creates a link between a source account and a sink that you have created in a monitoring account.
 *
 * Before you create a link, you must create a sink in the monitoring account. The sink must have a
 * sink policy that permits the source account to link to it. You can grant permission to source
 * accounts by granting permission to an entire organization, an organizational unit, or to
 * individual accounts.
 *
 * For more information, see
 * [CreateSink](https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html) and
 * [PutSinkPolicy](https://docs.aws.amazon.com/OAM/latest/APIReference/API_PutSinkPolicy.html) .
 *
 * Each monitoring account can be linked to as many as 100,000 source accounts.
 *
 * Each source account can be linked to as many as five monitoring accounts.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.oam.*;
 * CfnLink cfnLink = CfnLink.Builder.create(this, "MyCfnLink")
 * .resourceTypes(List.of("resourceTypes"))
 * .sinkIdentifier("sinkIdentifier")
 * // the properties below are optional
 * .labelTemplate("labelTemplate")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html)
 */
@CdkDslMarker
public class CfnLinkDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLink.Builder = CfnLink.Builder.create(scope, id)

    private val _resourceTypes: MutableList<String> = mutableListOf()

    /**
     * Specify a friendly human-readable name to use to identify this source account when you are
     * viewing data from it in the monitoring account.
     *
     * You can include the following variables in your template:
     * * `$AccountName` is the name of the account
     * * `$AccountEmail` is a globally-unique email address, which includes the email domain, such
     *   as `mariagarcia&#64;example.com`
     * * `$AccountEmailNoDomain` is an email address without the domain name, such as `mariagarcia`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-labeltemplate)
     *
     * @param labelTemplate Specify a friendly human-readable name to use to identify this source
     *   account when you are viewing data from it in the monitoring account.
     */
    public fun labelTemplate(labelTemplate: String) {
        cdkBuilder.labelTemplate(labelTemplate)
    }

    /**
     * An array of strings that define which types of data that the source account shares with the
     * monitoring account.
     *
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-resourcetypes)
     *
     * @param resourceTypes An array of strings that define which types of data that the source
     *   account shares with the monitoring account.
     */
    public fun resourceTypes(vararg resourceTypes: String) {
        _resourceTypes.addAll(listOf(*resourceTypes))
    }

    /**
     * An array of strings that define which types of data that the source account shares with the
     * monitoring account.
     *
     * Valid values are `AWS::CloudWatch::Metric | AWS::Logs::LogGroup | AWS::XRay::Trace` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-resourcetypes)
     *
     * @param resourceTypes An array of strings that define which types of data that the source
     *   account shares with the monitoring account.
     */
    public fun resourceTypes(resourceTypes: Collection<String>) {
        _resourceTypes.addAll(resourceTypes)
    }

    /**
     * The ARN of the sink in the monitoring account that you want to link to.
     *
     * You can use
     * [ListSinks](https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html) to find
     * the ARNs of sinks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-sinkidentifier)
     *
     * @param sinkIdentifier The ARN of the sink in the monitoring account that you want to link to.
     */
    public fun sinkIdentifier(sinkIdentifier: String) {
        cdkBuilder.sinkIdentifier(sinkIdentifier)
    }

    /**
     * An array of key-value pairs to apply to the link.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-link.html#cfn-oam-link-tags)
     *
     * @param tags An array of key-value pairs to apply to the link.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnLink {
        if (_resourceTypes.isNotEmpty()) cdkBuilder.resourceTypes(_resourceTypes)
        return cdkBuilder.build()
    }
}
