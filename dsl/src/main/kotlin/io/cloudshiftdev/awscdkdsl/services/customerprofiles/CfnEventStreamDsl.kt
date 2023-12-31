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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.customerprofiles.CfnEventStream
import software.constructs.Construct

/**
 * An Event Stream resource of Amazon Connect Customer Profiles.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * CfnEventStream cfnEventStream = CfnEventStream.Builder.create(this, "MyCfnEventStream")
 * .domainName("domainName")
 * .eventStreamName("eventStreamName")
 * .uri("uri")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html)
 */
@CdkDslMarker
public class CfnEventStreamDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventStream.Builder = CfnEventStream.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-domainname)
     *
     * @param domainName The unique name of the domain.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The name of the event stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-eventstreamname)
     *
     * @param eventStreamName The name of the event stream.
     */
    public fun eventStreamName(eventStreamName: String) {
        cdkBuilder.eventStreamName(eventStreamName)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The StreamARN of the destination to deliver profile events to.
     *
     * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-uri)
     *
     * @param uri The StreamARN of the destination to deliver profile events to.
     */
    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): CfnEventStream {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
