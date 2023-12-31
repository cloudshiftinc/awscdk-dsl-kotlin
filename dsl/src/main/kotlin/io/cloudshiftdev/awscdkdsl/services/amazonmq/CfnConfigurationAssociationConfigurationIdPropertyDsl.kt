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

package io.cloudshiftdev.awscdkdsl.services.amazonmq

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation

/**
 * The `ConfigurationId` property type specifies a configuration Id and the revision of a
 * configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * ConfigurationIdProperty configurationIdProperty = ConfigurationIdProperty.builder()
 * .id("id")
 * .revision(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configurationassociation-configurationid.html)
 */
@CdkDslMarker
public class CfnConfigurationAssociationConfigurationIdPropertyDsl {
    private val cdkBuilder: CfnConfigurationAssociation.ConfigurationIdProperty.Builder =
        CfnConfigurationAssociation.ConfigurationIdProperty.builder()

    /** @param id The unique ID that Amazon MQ generates for the configuration. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param revision The revision number of the configuration. */
    public fun revision(revision: Number) {
        cdkBuilder.revision(revision)
    }

    public fun build(): CfnConfigurationAssociation.ConfigurationIdProperty = cdkBuilder.build()
}
