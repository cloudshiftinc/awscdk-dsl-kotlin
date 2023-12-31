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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue
import software.constructs.Construct

/**
 * The `AWS::GameLift::GameSessionQueue` resource creates a placement queue that processes requests
 * for new game sessions.
 *
 * A queue uses FleetIQ algorithms to determine the best placement locations and find an available
 * game server, then prompts the game server to start a new game session. Queues can have
 * destinations (GameLift fleets or aliases), which determine where the queue can place new game
 * sessions. A queue can have destinations with varied fleet type (Spot and On-Demand), instance
 * type, and AWS Region .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * CfnGameSessionQueue cfnGameSessionQueue = CfnGameSessionQueue.Builder.create(this,
 * "MyCfnGameSessionQueue")
 * .name("name")
 * // the properties below are optional
 * .customEventData("customEventData")
 * .destinations(List.of(DestinationProperty.builder()
 * .destinationArn("destinationArn")
 * .build()))
 * .filterConfiguration(FilterConfigurationProperty.builder()
 * .allowedLocations(List.of("allowedLocations"))
 * .build())
 * .notificationTarget("notificationTarget")
 * .playerLatencyPolicies(List.of(PlayerLatencyPolicyProperty.builder()
 * .maximumIndividualPlayerLatencyMilliseconds(123)
 * .policyDurationSeconds(123)
 * .build()))
 * .priorityConfiguration(PriorityConfigurationProperty.builder()
 * .locationOrder(List.of("locationOrder"))
 * .priorityOrder(List.of("priorityOrder"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .timeoutInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html)
 */
@CdkDslMarker
public class CfnGameSessionQueueDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGameSessionQueue.Builder =
        CfnGameSessionQueue.Builder.create(scope, id)

    private val _destinations: MutableList<Any> = mutableListOf()

    private val _playerLatencyPolicies: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Information to be added to all events that are related to this game session queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-customeventdata)
     *
     * @param customEventData Information to be added to all events that are related to this game
     *   session queue.
     */
    public fun customEventData(customEventData: String) {
        cdkBuilder.customEventData(customEventData)
    }

    /**
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
     * requests in the queue.
     *
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations)
     *
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     *   session placement requests in the queue.
     */
    public fun destinations(vararg destinations: Any) {
        _destinations.addAll(listOf(*destinations))
    }

    /**
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
     * requests in the queue.
     *
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations)
     *
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     *   session placement requests in the queue.
     */
    public fun destinations(destinations: Collection<Any>) {
        _destinations.addAll(destinations)
    }

    /**
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
     * requests in the queue.
     *
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations)
     *
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     *   session placement requests in the queue.
     */
    public fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations)
    }

    /**
     * A list of locations where a queue is allowed to place new game sessions.
     *
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-filterconfiguration)
     *
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     *   sessions.
     */
    public fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration)
    }

    /**
     * A list of locations where a queue is allowed to place new game sessions.
     *
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-filterconfiguration)
     *
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     *   sessions.
     */
    public fun filterConfiguration(
        filterConfiguration: CfnGameSessionQueue.FilterConfigurationProperty
    ) {
        cdkBuilder.filterConfiguration(filterConfiguration)
    }

    /**
     * A descriptive label that is associated with game session queue.
     *
     * Queue names must be unique within each Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-name)
     *
     * @param name A descriptive label that is associated with game session queue.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An SNS topic ARN that is set up to receive game session placement notifications.
     *
     * See
     * [Setting up notifications for game session placement](https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-notificationtarget)
     *
     * @param notificationTarget An SNS topic ARN that is set up to receive game session placement
     *   notifications.
     */
    public fun notificationTarget(notificationTarget: String) {
        cdkBuilder.notificationTarget(notificationTarget)
    }

    /**
     * A set of policies that act as a sliding cap on player latency.
     *
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency.
     * Use multiple policies to gradually relax latency requirements a step at a time. Multiple
     * policies are applied based on their maximum allowed latency, starting with the lowest value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies)
     *
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency.
     */
    public fun playerLatencyPolicies(vararg playerLatencyPolicies: Any) {
        _playerLatencyPolicies.addAll(listOf(*playerLatencyPolicies))
    }

    /**
     * A set of policies that act as a sliding cap on player latency.
     *
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency.
     * Use multiple policies to gradually relax latency requirements a step at a time. Multiple
     * policies are applied based on their maximum allowed latency, starting with the lowest value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies)
     *
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency.
     */
    public fun playerLatencyPolicies(playerLatencyPolicies: Collection<Any>) {
        _playerLatencyPolicies.addAll(playerLatencyPolicies)
    }

    /**
     * A set of policies that act as a sliding cap on player latency.
     *
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency.
     * Use multiple policies to gradually relax latency requirements a step at a time. Multiple
     * policies are applied based on their maximum allowed latency, starting with the lowest value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies)
     *
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency.
     */
    public fun playerLatencyPolicies(playerLatencyPolicies: IResolvable) {
        cdkBuilder.playerLatencyPolicies(playerLatencyPolicies)
    }

    /**
     * Custom settings to use when prioritizing destinations and locations for game session
     * placements.
     *
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization
     * process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-priorityconfiguration)
     *
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     *   locations for game session placements.
     */
    public fun priorityConfiguration(priorityConfiguration: IResolvable) {
        cdkBuilder.priorityConfiguration(priorityConfiguration)
    }

    /**
     * Custom settings to use when prioritizing destinations and locations for game session
     * placements.
     *
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization
     * process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-priorityconfiguration)
     *
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     *   locations for game session placements.
     */
    public fun priorityConfiguration(
        priorityConfiguration: CfnGameSessionQueue.PriorityConfigurationProperty
    ) {
        cdkBuilder.priorityConfiguration(priorityConfiguration)
    }

    /**
     * A list of labels to assign to the new game session queue resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see
     * [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference* . Once the resource is created, you can use TagResource,
     * UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit
     * may be lower than stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-tags)
     *
     * @param tags A list of labels to assign to the new game session queue resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of labels to assign to the new game session queue resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see
     * [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference* . Once the resource is created, you can use TagResource,
     * UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit
     * may be lower than stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-tags)
     *
     * @param tags A list of labels to assign to the new game session queue resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The maximum time, in seconds, that a new game session placement request remains in the queue.
     *
     * When a request exceeds this time, the game session placement changes to a `TIMED_OUT` status.
     * By default, this property is set to `600` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-timeoutinseconds)
     *
     * @param timeoutInSeconds The maximum time, in seconds, that a new game session placement
     *   request remains in the queue.
     */
    public fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun build(): CfnGameSessionQueue {
        if (_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
        if (_playerLatencyPolicies.isNotEmpty())
            cdkBuilder.playerLatencyPolicies(_playerLatencyPolicies)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
