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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnCapacityReservation
import software.constructs.Construct

/**
 * Creates a new Capacity Reservation with the specified attributes.
 *
 * For more information, see
 * [Capacity Reservations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-capacity-reservations.html)
 * in the *Amazon EC2 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnCapacityReservation cfnCapacityReservation = CfnCapacityReservation.Builder.create(this,
 * "MyCfnCapacityReservation")
 * .availabilityZone("availabilityZone")
 * .instanceCount(123)
 * .instancePlatform("instancePlatform")
 * .instanceType("instanceType")
 * // the properties below are optional
 * .ebsOptimized(false)
 * .endDate("endDate")
 * .endDateType("endDateType")
 * .ephemeralStorage(false)
 * .instanceMatchCriteria("instanceMatchCriteria")
 * .outPostArn("outPostArn")
 * .placementGroupArn("placementGroupArn")
 * .tagSpecifications(List.of(TagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .tenancy("tenancy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html)
 */
@CdkDslMarker
public class CfnCapacityReservationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCapacityReservation.Builder =
        CfnCapacityReservation.Builder.create(scope, id)

    private val _tagSpecifications: MutableList<Any> = mutableListOf()

    /**
     * The Availability Zone in which to create the Capacity Reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-availabilityzone)
     *
     * @param availabilityZone The Availability Zone in which to create the Capacity Reservation.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * Indicates whether the Capacity Reservation supports EBS-optimized instances.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using an EBS- optimized instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ebsoptimized)
     *
     * @param ebsOptimized Indicates whether the Capacity Reservation supports EBS-optimized
     *   instances.
     */
    public fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * Indicates whether the Capacity Reservation supports EBS-optimized instances.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using an EBS- optimized instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ebsoptimized)
     *
     * @param ebsOptimized Indicates whether the Capacity Reservation supports EBS-optimized
     *   instances.
     */
    public fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * The date and time at which the Capacity Reservation expires.
     *
     * When a Capacity Reservation expires, the reserved capacity is released and you can no longer
     * launch instances into it. The Capacity Reservation's state changes to `expired` when it
     * reaches its end date and time.
     *
     * You must provide an `EndDate` value if `EndDateType` is `limited` . Omit `EndDate` if
     * `EndDateType` is `unlimited` .
     *
     * If the `EndDateType` is `limited` , the Capacity Reservation is cancelled within an hour from
     * the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation
     * is guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddate)
     *
     * @param endDate The date and time at which the Capacity Reservation expires.
     */
    public fun endDate(endDate: String) {
        cdkBuilder.endDate(endDate)
    }

    /**
     * Indicates the way in which the Capacity Reservation ends.
     *
     * A Capacity Reservation can have one of the following end types:
     * * `unlimited` - The Capacity Reservation remains active until you explicitly cancel it. Do
     *   not provide an `EndDate` if the `EndDateType` is `unlimited` .
     * * `limited` - The Capacity Reservation expires automatically at a specified date and time.
     *   You must provide an `EndDate` value if the `EndDateType` value is `limited` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-enddatetype)
     *
     * @param endDateType Indicates the way in which the Capacity Reservation ends.
     */
    public fun endDateType(endDateType: String) {
        cdkBuilder.endDateType(endDateType)
    }

    /**
     * *Deprecated.*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ephemeralstorage)
     *
     * @param ephemeralStorage *Deprecated.*.
     */
    public fun ephemeralStorage(ephemeralStorage: Boolean) {
        cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    /**
     * *Deprecated.*.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-ephemeralstorage)
     *
     * @param ephemeralStorage *Deprecated.*.
     */
    public fun ephemeralStorage(ephemeralStorage: IResolvable) {
        cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    /**
     * The number of instances for which to reserve capacity.
     *
     * Valid range: 1 - 1000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancecount)
     *
     * @param instanceCount The number of instances for which to reserve capacity.
     */
    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * Indicates the type of instance launches that the Capacity Reservation accepts. The options
     * include:.
     * * `open` - The Capacity Reservation automatically matches all instances that have matching
     *   attributes (instance type, platform, and Availability Zone). Instances that have matching
     *   attributes run in the Capacity Reservation automatically without specifying any additional
     *   parameters.
     * * `targeted` - The Capacity Reservation only accepts instances that have matching attributes
     *   (instance type, platform, and Availability Zone), and explicitly target the Capacity
     *   Reservation. This ensures that only permitted instances can use the reserved capacity.
     *
     * Default: `open`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancematchcriteria)
     *
     * @param instanceMatchCriteria Indicates the type of instance launches that the Capacity
     *   Reservation accepts. The options include:.
     */
    public fun instanceMatchCriteria(instanceMatchCriteria: String) {
        cdkBuilder.instanceMatchCriteria(instanceMatchCriteria)
    }

    /**
     * The type of operating system for which to reserve capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instanceplatform)
     *
     * @param instancePlatform The type of operating system for which to reserve capacity.
     */
    public fun instancePlatform(instancePlatform: String) {
        cdkBuilder.instancePlatform(instancePlatform)
    }

    /**
     * The instance type for which to reserve capacity.
     *
     * For more information, see
     * [Instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in
     * the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-instancetype)
     *
     * @param instanceType The instance type for which to reserve capacity.
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-outpostarn)
     *
     * @param outPostArn The Amazon Resource Name (ARN) of the Outpost on which to create the
     *   Capacity Reservation.
     */
    public fun outPostArn(outPostArn: String) {
        cdkBuilder.outPostArn(outPostArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the cluster placement group in which to create the Capacity
     * Reservation.
     *
     * For more information, see
     * [Capacity Reservations for cluster placement groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-cpg.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-placementgrouparn)
     *
     * @param placementGroupArn The Amazon Resource Name (ARN) of the cluster placement group in
     *   which to create the Capacity Reservation.
     */
    public fun placementGroupArn(placementGroupArn: String) {
        cdkBuilder.placementGroupArn(placementGroupArn)
    }

    /**
     * The tags to apply to the Capacity Reservation during launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications)
     *
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    public fun tagSpecifications(vararg tagSpecifications: Any) {
        _tagSpecifications.addAll(listOf(*tagSpecifications))
    }

    /**
     * The tags to apply to the Capacity Reservation during launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications)
     *
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    public fun tagSpecifications(tagSpecifications: Collection<Any>) {
        _tagSpecifications.addAll(tagSpecifications)
    }

    /**
     * The tags to apply to the Capacity Reservation during launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tagspecifications)
     *
     * @param tagSpecifications The tags to apply to the Capacity Reservation during launch.
     */
    public fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications)
    }

    /**
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the
     * following tenancy settings:.
     * * `default` - The Capacity Reservation is created on hardware that is shared with other AWS
     *   accounts .
     * * `dedicated` - The Capacity Reservation is created on single-tenant hardware that is
     *   dedicated to a single AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-capacityreservation.html#cfn-ec2-capacityreservation-tenancy)
     *
     * @param tenancy Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can
     *   have one of the following tenancy settings:.
     */
    public fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
    }

    public fun build(): CfnCapacityReservation {
        if (_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
        return cdkBuilder.build()
    }
}
