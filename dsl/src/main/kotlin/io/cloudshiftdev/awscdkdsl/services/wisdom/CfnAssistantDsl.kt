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
import software.amazon.awscdk.services.wisdom.CfnAssistant
import software.constructs.Construct

/**
 * Specifies an Amazon Connect Wisdom assistant.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wisdom.*;
 * CfnAssistant cfnAssistant = CfnAssistant.Builder.create(this, "MyCfnAssistant")
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html)
 */
@CdkDslMarker
public class CfnAssistantDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAssistant.Builder = CfnAssistant.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description of the assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-description)
     *
     * @param description The description of the assistant.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-name)
     *
     * @param name The name of the assistant.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The KMS key used for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-serversideencryptionconfiguration)
     *
     * @param serverSideEncryptionConfiguration The KMS key used for encryption.
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
    }

    /**
     * The KMS key used for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-serversideencryptionconfiguration)
     *
     * @param serverSideEncryptionConfiguration The KMS key used for encryption.
     */
    public fun serverSideEncryptionConfiguration(
        serverSideEncryptionConfiguration: CfnAssistant.ServerSideEncryptionConfigurationProperty
    ) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The type of assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-type)
     *
     * @param type The type of assistant.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAssistant {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
