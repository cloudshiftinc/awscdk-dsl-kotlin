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

package io.cloudshiftdev.awscdkdsl.services.aps

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.aps.CfnWorkspace
import software.amazon.awscdk.services.aps.CfnWorkspaceProps

/**
 * Properties for defining a `CfnWorkspace`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.aps.*;
 * CfnWorkspaceProps cfnWorkspaceProps = CfnWorkspaceProps.builder()
 * .alertManagerDefinition("alertManagerDefinition")
 * .alias("alias")
 * .loggingConfiguration(LoggingConfigurationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-workspace.html)
 */
@CdkDslMarker
public class CfnWorkspacePropsDsl {
    private val cdkBuilder: CfnWorkspaceProps.Builder = CfnWorkspaceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param alertManagerDefinition The alert manager definition for the workspace, as a string.
     *   For more information, see
     *   [Alert manager and templating](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-alert-manager.html)
     *   .
     */
    public fun alertManagerDefinition(alertManagerDefinition: String) {
        cdkBuilder.alertManagerDefinition(alertManagerDefinition)
    }

    /**
     * @param alias An alias that you assign to this workspace to help you identify it. It does not
     *   need to be unique.
     *
     * The alias can be as many as 100 characters and can include any type of characters. Amazon
     * Managed Service for Prometheus automatically strips any blank spaces from the beginning and
     * end of the alias that you specify.
     */
    public fun alias(alias: String) {
        cdkBuilder.alias(alias)
    }

    /**
     * @param loggingConfiguration The LoggingConfiguration attribute is used to set the logging
     *   configuration for the workspace.
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    /**
     * @param loggingConfiguration The LoggingConfiguration attribute is used to set the logging
     *   configuration for the workspace.
     */
    public fun loggingConfiguration(
        loggingConfiguration: CfnWorkspace.LoggingConfigurationProperty
    ) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    /** @param tags A list of tag keys and values to associate with the workspace. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A list of tag keys and values to associate with the workspace. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnWorkspaceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
