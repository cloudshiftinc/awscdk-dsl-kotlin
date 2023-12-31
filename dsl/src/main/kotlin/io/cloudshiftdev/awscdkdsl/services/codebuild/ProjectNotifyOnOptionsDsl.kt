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

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codebuild.ProjectNotificationEvents
import software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions
import software.amazon.awscdk.services.codestarnotifications.DetailType

/**
 * Additional options to pass to the notification rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * import software.amazon.awscdk.services.codestarnotifications.*;
 * ProjectNotifyOnOptions projectNotifyOnOptions = ProjectNotifyOnOptions.builder()
 * .events(List.of(ProjectNotificationEvents.BUILD_FAILED))
 * // the properties below are optional
 * .detailType(DetailType.BASIC)
 * .enabled(false)
 * .notificationRuleName("notificationRuleName")
 * .build();
 * ```
 */
@CdkDslMarker
public class ProjectNotifyOnOptionsDsl {
    private val cdkBuilder: ProjectNotifyOnOptions.Builder = ProjectNotifyOnOptions.builder()

    private val _events: MutableList<ProjectNotificationEvents> = mutableListOf()

    /**
     * @param detailType The level of detail to include in the notifications for this resource.
     *   BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     *   FULL will include any supplemental information provided by AWS CodeStar Notifications
     *   and/or the service for the resource for which the notification is created.
     */
    public fun detailType(detailType: DetailType) {
        cdkBuilder.detailType(detailType)
    }

    /**
     * @param enabled The status of the notification rule. If the enabled is set to DISABLED,
     *   notifications aren't sent for the notification rule.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param events A list of event types associated with this notification rule for CodeBuild
     *   Project. For a complete list of event types and IDs, see Notification concepts in the
     *   Developer Tools Console User Guide.
     */
    public fun events(vararg events: ProjectNotificationEvents) {
        _events.addAll(listOf(*events))
    }

    /**
     * @param events A list of event types associated with this notification rule for CodeBuild
     *   Project. For a complete list of event types and IDs, see Notification concepts in the
     *   Developer Tools Console User Guide.
     */
    public fun events(events: Collection<ProjectNotificationEvents>) {
        _events.addAll(events)
    }

    /**
     * @param notificationRuleName The name for the notification rule. Notification rule names must
     *   be unique in your AWS account.
     */
    public fun notificationRuleName(notificationRuleName: String) {
        cdkBuilder.notificationRuleName(notificationRuleName)
    }

    public fun build(): ProjectNotifyOnOptions {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        return cdkBuilder.build()
    }
}
