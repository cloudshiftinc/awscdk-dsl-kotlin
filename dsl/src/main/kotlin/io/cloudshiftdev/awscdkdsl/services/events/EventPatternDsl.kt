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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.events.EventPattern

/**
 * Events in Amazon CloudWatch Events are represented as JSON objects. For more information about
 * JSON objects, see RFC 7159.
 *
 * **Important**: this class can only be used with a `Rule` class. In particular, do not use it with
 * `CfnRule` class: your pattern will not be rendered correctly. In a `CfnRule` class, write the
 * pattern as you normally would when directly writing CloudFormation.
 *
 * Rules use event patterns to select events and route them to targets. A pattern either matches an
 * event or it doesn't. Event patterns are represented as JSON objects with a structure that is
 * similar to that of events.
 *
 * It is important to remember the following about event pattern matching:
 * * For a pattern to match an event, the event must contain all the field names listed in the
 *   pattern. The field names must appear in the event with the same nesting structure.
 * * Other fields of the event not mentioned in the pattern are ignored; effectively, there is a
 *   `"*": "*"` wildcard for fields not mentioned.
 * * The matching is exact (character-by-character), without case-folding or any other string
 *   normalization.
 * * The values being matched follow JSON rules: Strings enclosed in quotes, numbers, and the
 *   unquoted keywords true, false, and null.
 * * Number matching is at the string representation level. For example, 300, 300.0, and 3.0e2 are
 *   not considered equal.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Function fn = Function.Builder.create(this, "MyFunc")
 * .runtime(Runtime.NODEJS_14_X)
 * .handler("index.handler")
 * .code(Code.fromInline("exports.handler = handler.toString()"))
 * .build();
 * Rule rule = Rule.Builder.create(this, "rule")
 * .eventPattern(EventPattern.builder()
 * .source(List.of("aws.ec2"))
 * .build())
 * .build();
 * Queue queue = new Queue(this, "Queue");
 * rule.addTarget(LambdaFunction.Builder.create(fn)
 * .deadLetterQueue(queue) // Optional: add a dead letter queue
 * .maxEventAge(Duration.hours(2)) // Optional: set the maxEventAge retry policy
 * .retryAttempts(2)
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html)
 */
@CdkDslMarker
public class EventPatternDsl {
    private val cdkBuilder: EventPattern.Builder = EventPattern.builder()

    private val _account: MutableList<String> = mutableListOf()

    private val _detailType: MutableList<String> = mutableListOf()

    private val _id: MutableList<String> = mutableListOf()

    private val _region: MutableList<String> = mutableListOf()

    private val _resources: MutableList<String> = mutableListOf()

    private val _source: MutableList<String> = mutableListOf()

    private val _time: MutableList<String> = mutableListOf()

    private val _version: MutableList<String> = mutableListOf()

    /** @param account The 12-digit number identifying an AWS account. */
    public fun account(vararg account: String) {
        _account.addAll(listOf(*account))
    }

    /** @param account The 12-digit number identifying an AWS account. */
    public fun account(account: Collection<String>) {
        _account.addAll(account)
    }

    /**
     * @param detail A JSON object, whose content is at the discretion of the service originating
     *   the event.
     */
    public fun detail(detail: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(detail)
        cdkBuilder.detail(builder.map)
    }

    /**
     * @param detail A JSON object, whose content is at the discretion of the service originating
     *   the event.
     */
    public fun detail(detail: Map<String, Any>) {
        cdkBuilder.detail(detail)
    }

    /**
     * @param detailType Identifies, in combination with the source field, the fields and values
     *   that appear in the detail field. Represents the "detail-type" event field.
     */
    public fun detailType(vararg detailType: String) {
        _detailType.addAll(listOf(*detailType))
    }

    /**
     * @param detailType Identifies, in combination with the source field, the fields and values
     *   that appear in the detail field. Represents the "detail-type" event field.
     */
    public fun detailType(detailType: Collection<String>) {
        _detailType.addAll(detailType)
    }

    /**
     * @param id A unique value is generated for every event. This can be helpful in tracing events
     *   as they move through rules to targets, and are processed.
     */
    public fun id(vararg id: String) {
        _id.addAll(listOf(*id))
    }

    /**
     * @param id A unique value is generated for every event. This can be helpful in tracing events
     *   as they move through rules to targets, and are processed.
     */
    public fun id(id: Collection<String>) {
        _id.addAll(id)
    }

    /** @param region Identifies the AWS region where the event originated. */
    public fun region(vararg region: String) {
        _region.addAll(listOf(*region))
    }

    /** @param region Identifies the AWS region where the event originated. */
    public fun region(region: Collection<String>) {
        _region.addAll(region)
    }

    /**
     * @param resources This JSON array contains ARNs that identify resources that are involved in
     *   the event. Inclusion of these ARNs is at the discretion of the service.
     *
     * For example, Amazon EC2 instance state-changes include Amazon EC2 instance ARNs, Auto Scaling
     * events include ARNs for both instances and Auto Scaling groups, but API calls with AWS
     * CloudTrail do not include resource ARNs.
     */
    public fun resources(vararg resources: String) {
        _resources.addAll(listOf(*resources))
    }

    /**
     * @param resources This JSON array contains ARNs that identify resources that are involved in
     *   the event. Inclusion of these ARNs is at the discretion of the service.
     *
     * For example, Amazon EC2 instance state-changes include Amazon EC2 instance ARNs, Auto Scaling
     * events include ARNs for both instances and Auto Scaling groups, but API calls with AWS
     * CloudTrail do not include resource ARNs.
     */
    public fun resources(resources: Collection<String>) {
        _resources.addAll(resources)
    }

    /**
     * @param source Identifies the service that sourced the event. All events sourced from within
     *   AWS begin with "aws." Customer-generated events can have any value here, as long as it
     *   doesn't begin with "aws." We recommend the use of Java package-name style reverse
     *   domain-name strings.
     *
     * To find the correct value for source for an AWS service, see the table in AWS Service
     * Namespaces. For example, the source value for Amazon CloudFront is aws.cloudfront.
     */
    public fun source(vararg source: String) {
        _source.addAll(listOf(*source))
    }

    /**
     * @param source Identifies the service that sourced the event. All events sourced from within
     *   AWS begin with "aws." Customer-generated events can have any value here, as long as it
     *   doesn't begin with "aws." We recommend the use of Java package-name style reverse
     *   domain-name strings.
     *
     * To find the correct value for source for an AWS service, see the table in AWS Service
     * Namespaces. For example, the source value for Amazon CloudFront is aws.cloudfront.
     */
    public fun source(source: Collection<String>) {
        _source.addAll(source)
    }

    /**
     * @param time The event timestamp, which can be specified by the service originating the event.
     *   If the event spans a time interval, the service might choose to report the start time, so
     *   this value can be noticeably before the time the event is actually received.
     */
    public fun time(vararg time: String) {
        _time.addAll(listOf(*time))
    }

    /**
     * @param time The event timestamp, which can be specified by the service originating the event.
     *   If the event spans a time interval, the service might choose to report the start time, so
     *   this value can be noticeably before the time the event is actually received.
     */
    public fun time(time: Collection<String>) {
        _time.addAll(time)
    }

    /** @param version By default, this is set to 0 (zero) in all events. */
    public fun version(vararg version: String) {
        _version.addAll(listOf(*version))
    }

    /** @param version By default, this is set to 0 (zero) in all events. */
    public fun version(version: Collection<String>) {
        _version.addAll(version)
    }

    public fun build(): EventPattern {
        if (_account.isNotEmpty()) cdkBuilder.account(_account)
        if (_detailType.isNotEmpty()) cdkBuilder.detailType(_detailType)
        if (_id.isNotEmpty()) cdkBuilder.id(_id)
        if (_region.isNotEmpty()) cdkBuilder.region(_region)
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        if (_source.isNotEmpty()) cdkBuilder.source(_source)
        if (_time.isNotEmpty()) cdkBuilder.time(_time)
        if (_version.isNotEmpty()) cdkBuilder.version(_version)
        return cdkBuilder.build()
    }
}
