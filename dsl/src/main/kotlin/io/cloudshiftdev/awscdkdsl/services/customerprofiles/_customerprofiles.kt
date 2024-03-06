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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps
import software.amazon.awscdk.services.customerprofiles.CfnDomain
import software.amazon.awscdk.services.customerprofiles.CfnDomainProps
import software.amazon.awscdk.services.customerprofiles.CfnEventStream
import software.amazon.awscdk.services.customerprofiles.CfnEventStreamProps
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps
import software.amazon.awscdk.services.customerprofiles.CfnObjectType
import software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps
import software.constructs.Construct

public object customerprofiles {
    /**
     * A calculated attribute definition for Customer Profiles.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * CfnCalculatedAttributeDefinition cfnCalculatedAttributeDefinition =
     * CfnCalculatedAttributeDefinition.Builder.create(this, "MyCfnCalculatedAttributeDefinition")
     * .attributeDetails(AttributeDetailsProperty.builder()
     * .attributes(List.of(AttributeItemProperty.builder()
     * .name("name")
     * .build()))
     * .expression("expression")
     * .build())
     * .calculatedAttributeName("calculatedAttributeName")
     * .domainName("domainName")
     * .statistic("statistic")
     * // the properties below are optional
     * .conditions(ConditionsProperty.builder()
     * .objectCount(123)
     * .range(RangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .threshold(ThresholdProperty.builder()
     * .operator("operator")
     * .value("value")
     * .build())
     * .build())
     * .description("description")
     * .displayName("displayName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html)
     */
    public inline fun cfnCalculatedAttributeDefinition(
        scope: Construct,
        id: String,
        block: CfnCalculatedAttributeDefinitionDsl.() -> Unit = {},
    ): CfnCalculatedAttributeDefinition {
        val builder = CfnCalculatedAttributeDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Mathematical expression and a list of attribute items specified in that expression.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * AttributeDetailsProperty attributeDetailsProperty = AttributeDetailsProperty.builder()
     * .attributes(List.of(AttributeItemProperty.builder()
     * .name("name")
     * .build()))
     * .expression("expression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-attributedetails.html)
     */
    public inline fun cfnCalculatedAttributeDefinitionAttributeDetailsProperty(
        block: CfnCalculatedAttributeDefinitionAttributeDetailsPropertyDsl.() -> Unit = {}
    ): CfnCalculatedAttributeDefinition.AttributeDetailsProperty {
        val builder = CfnCalculatedAttributeDefinitionAttributeDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of a single attribute item specified in the mathematical expression.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * AttributeItemProperty attributeItemProperty = AttributeItemProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-attributeitem.html)
     */
    public inline fun cfnCalculatedAttributeDefinitionAttributeItemProperty(
        block: CfnCalculatedAttributeDefinitionAttributeItemPropertyDsl.() -> Unit = {}
    ): CfnCalculatedAttributeDefinition.AttributeItemProperty {
        val builder = CfnCalculatedAttributeDefinitionAttributeItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The conditions including range, object count, and threshold for the calculated attribute.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * ConditionsProperty conditionsProperty = ConditionsProperty.builder()
     * .objectCount(123)
     * .range(RangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .threshold(ThresholdProperty.builder()
     * .operator("operator")
     * .value("value")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-conditions.html)
     */
    public inline fun cfnCalculatedAttributeDefinitionConditionsProperty(
        block: CfnCalculatedAttributeDefinitionConditionsPropertyDsl.() -> Unit = {}
    ): CfnCalculatedAttributeDefinition.ConditionsProperty {
        val builder = CfnCalculatedAttributeDefinitionConditionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCalculatedAttributeDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * CfnCalculatedAttributeDefinitionProps cfnCalculatedAttributeDefinitionProps =
     * CfnCalculatedAttributeDefinitionProps.builder()
     * .attributeDetails(AttributeDetailsProperty.builder()
     * .attributes(List.of(AttributeItemProperty.builder()
     * .name("name")
     * .build()))
     * .expression("expression")
     * .build())
     * .calculatedAttributeName("calculatedAttributeName")
     * .domainName("domainName")
     * .statistic("statistic")
     * // the properties below are optional
     * .conditions(ConditionsProperty.builder()
     * .objectCount(123)
     * .range(RangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .threshold(ThresholdProperty.builder()
     * .operator("operator")
     * .value("value")
     * .build())
     * .build())
     * .description("description")
     * .displayName("displayName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html)
     */
    public inline fun cfnCalculatedAttributeDefinitionProps(
        block: CfnCalculatedAttributeDefinitionPropsDsl.() -> Unit = {}
    ): CfnCalculatedAttributeDefinitionProps {
        val builder = CfnCalculatedAttributeDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The relative time period over which data is included in the aggregation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * RangeProperty rangeProperty = RangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-range.html)
     */
    public inline fun cfnCalculatedAttributeDefinitionRangeProperty(
        block: CfnCalculatedAttributeDefinitionRangePropertyDsl.() -> Unit = {}
    ): CfnCalculatedAttributeDefinition.RangeProperty {
        val builder = CfnCalculatedAttributeDefinitionRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The threshold for the calculated attribute.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * ThresholdProperty thresholdProperty = ThresholdProperty.builder()
     * .operator("operator")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-threshold.html)
     */
    public inline fun cfnCalculatedAttributeDefinitionThresholdProperty(
        block: CfnCalculatedAttributeDefinitionThresholdPropertyDsl.() -> Unit = {}
    ): CfnCalculatedAttributeDefinition.ThresholdProperty {
        val builder = CfnCalculatedAttributeDefinitionThresholdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon Connect Customer Profiles Domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
     * .defaultExpirationDays(123)
     * .domainName("domainName")
     * // the properties below are optional
     * .deadLetterQueueUrl("deadLetterQueueUrl")
     * .defaultEncryptionKey("defaultEncryptionKey")
     * .matching(MatchingProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .autoMerging(AutoMergingProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .conflictResolution(ConflictResolutionProperty.builder()
     * .conflictResolvingModel("conflictResolvingModel")
     * // the properties below are optional
     * .sourceName("sourceName")
     * .build())
     * .consolidation(ConsolidationProperty.builder()
     * .matchingAttributesList(List.of(List.of("matchingAttributesList")))
     * .build())
     * .minAllowedConfidenceScoreForMerging(123)
     * .build())
     * .exportingConfig(ExportingConfigProperty.builder()
     * .s3Exporting(S3ExportingConfigProperty.builder()
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .s3KeyName("s3KeyName")
     * .build())
     * .build())
     * .jobSchedule(JobScheduleProperty.builder()
     * .dayOfTheWeek("dayOfTheWeek")
     * .time("time")
     * .build())
     * .build())
     * .ruleBasedMatching(RuleBasedMatchingProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .attributeTypesSelector(AttributeTypesSelectorProperty.builder()
     * .attributeMatchingModel("attributeMatchingModel")
     * // the properties below are optional
     * .address(List.of("address"))
     * .emailAddress(List.of("emailAddress"))
     * .phoneNumber(List.of("phoneNumber"))
     * .build())
     * .conflictResolution(ConflictResolutionProperty.builder()
     * .conflictResolvingModel("conflictResolvingModel")
     * // the properties below are optional
     * .sourceName("sourceName")
     * .build())
     * .exportingConfig(ExportingConfigProperty.builder()
     * .s3Exporting(S3ExportingConfigProperty.builder()
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .s3KeyName("s3KeyName")
     * .build())
     * .build())
     * .matchingRules(List.of(MatchingRuleProperty.builder()
     * .rule(List.of("rule"))
     * .build()))
     * .maxAllowedRuleLevelForMatching(123)
     * .maxAllowedRuleLevelForMerging(123)
     * .status("status")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html)
     */
    public inline fun cfnDomain(
        scope: Construct,
        id: String,
        block: CfnDomainDsl.() -> Unit = {},
    ): CfnDomain {
        val builder = CfnDomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures information about the `AttributeTypesSelector` which rule-based identity
     * resolution uses to match profiles.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * AttributeTypesSelectorProperty attributeTypesSelectorProperty =
     * AttributeTypesSelectorProperty.builder()
     * .attributeMatchingModel("attributeMatchingModel")
     * // the properties below are optional
     * .address(List.of("address"))
     * .emailAddress(List.of("emailAddress"))
     * .phoneNumber(List.of("phoneNumber"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-attributetypesselector.html)
     */
    public inline fun cfnDomainAttributeTypesSelectorProperty(
        block: CfnDomainAttributeTypesSelectorPropertyDsl.() -> Unit = {}
    ): CfnDomain.AttributeTypesSelectorProperty {
        val builder = CfnDomainAttributeTypesSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information about the auto-merging process.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * AutoMergingProperty autoMergingProperty = AutoMergingProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .conflictResolution(ConflictResolutionProperty.builder()
     * .conflictResolvingModel("conflictResolvingModel")
     * // the properties below are optional
     * .sourceName("sourceName")
     * .build())
     * .consolidation(ConsolidationProperty.builder()
     * .matchingAttributesList(List.of(List.of("matchingAttributesList")))
     * .build())
     * .minAllowedConfidenceScoreForMerging(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-automerging.html)
     */
    public inline fun cfnDomainAutoMergingProperty(
        block: CfnDomainAutoMergingPropertyDsl.() -> Unit = {}
    ): CfnDomain.AutoMergingProperty {
        val builder = CfnDomainAutoMergingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines how the auto-merging process should resolve conflicts between different profiles.
     *
     * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
     * `ConflictResolution` specifies which `EmailAddress` should be used.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * ConflictResolutionProperty conflictResolutionProperty = ConflictResolutionProperty.builder()
     * .conflictResolvingModel("conflictResolvingModel")
     * // the properties below are optional
     * .sourceName("sourceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-conflictresolution.html)
     */
    public inline fun cfnDomainConflictResolutionProperty(
        block: CfnDomainConflictResolutionPropertyDsl.() -> Unit = {}
    ): CfnDomain.ConflictResolutionProperty {
        val builder = CfnDomainConflictResolutionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of matching attributes that represent matching criteria.
     *
     * If two profiles meet at least one of the requirements in the matching attributes list, they
     * will be merged.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * ConsolidationProperty consolidationProperty = ConsolidationProperty.builder()
     * .matchingAttributesList(List.of(List.of("matchingAttributesList")))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-consolidation.html)
     */
    public inline fun cfnDomainConsolidationProperty(
        block: CfnDomainConsolidationPropertyDsl.() -> Unit = {}
    ): CfnDomain.ConsolidationProperty {
        val builder = CfnDomainConsolidationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Usage-specific statistics about the domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * DomainStatsProperty domainStatsProperty = DomainStatsProperty.builder()
     * .meteringProfileCount(123)
     * .objectCount(123)
     * .profileCount(123)
     * .totalSize(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-domainstats.html)
     */
    public inline fun cfnDomainDomainStatsProperty(
        block: CfnDomainDomainStatsPropertyDsl.() -> Unit = {}
    ): CfnDomain.DomainStatsProperty {
        val builder = CfnDomainDomainStatsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information for exporting Identity Resolution results, for example, to an S3
     * bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * ExportingConfigProperty exportingConfigProperty = ExportingConfigProperty.builder()
     * .s3Exporting(S3ExportingConfigProperty.builder()
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .s3KeyName("s3KeyName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-exportingconfig.html)
     */
    public inline fun cfnDomainExportingConfigProperty(
        block: CfnDomainExportingConfigPropertyDsl.() -> Unit = {}
    ): CfnDomain.ExportingConfigProperty {
        val builder = CfnDomainExportingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The day and time when do you want to start the Identity Resolution Job every week.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * JobScheduleProperty jobScheduleProperty = JobScheduleProperty.builder()
     * .dayOfTheWeek("dayOfTheWeek")
     * .time("time")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-jobschedule.html)
     */
    public inline fun cfnDomainJobScheduleProperty(
        block: CfnDomainJobSchedulePropertyDsl.() -> Unit = {}
    ): CfnDomain.JobScheduleProperty {
        val builder = CfnDomainJobSchedulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The process of matching duplicate profiles.
     *
     * If `Matching = true` , Amazon Connect Customer Profiles starts a weekly batch process called
     * *Identity Resolution Job* . If you do not specify a date and time for the *Identity
     * Resolution Job* to run, by default it runs every Saturday at 12AM UTC to detect duplicate
     * profiles in your domains. After the *Identity Resolution Job* completes, use the `GetMatches`
     * API to return and review the results. Or, if you have configured `ExportingConfig` in the
     * `MatchingRequest` , you can download the results from S3.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * MatchingProperty matchingProperty = MatchingProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .autoMerging(AutoMergingProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .conflictResolution(ConflictResolutionProperty.builder()
     * .conflictResolvingModel("conflictResolvingModel")
     * // the properties below are optional
     * .sourceName("sourceName")
     * .build())
     * .consolidation(ConsolidationProperty.builder()
     * .matchingAttributesList(List.of(List.of("matchingAttributesList")))
     * .build())
     * .minAllowedConfidenceScoreForMerging(123)
     * .build())
     * .exportingConfig(ExportingConfigProperty.builder()
     * .s3Exporting(S3ExportingConfigProperty.builder()
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .s3KeyName("s3KeyName")
     * .build())
     * .build())
     * .jobSchedule(JobScheduleProperty.builder()
     * .dayOfTheWeek("dayOfTheWeek")
     * .time("time")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matching.html)
     */
    public inline fun cfnDomainMatchingProperty(
        block: CfnDomainMatchingPropertyDsl.() -> Unit = {}
    ): CfnDomain.MatchingProperty {
        val builder = CfnDomainMatchingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how the rule-based matching process should match profiles.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * MatchingRuleProperty matchingRuleProperty = MatchingRuleProperty.builder()
     * .rule(List.of("rule"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matchingrule.html)
     */
    public inline fun cfnDomainMatchingRuleProperty(
        block: CfnDomainMatchingRulePropertyDsl.() -> Unit = {}
    ): CfnDomain.MatchingRuleProperty {
        val builder = CfnDomainMatchingRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDomain`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
     * .defaultExpirationDays(123)
     * .domainName("domainName")
     * // the properties below are optional
     * .deadLetterQueueUrl("deadLetterQueueUrl")
     * .defaultEncryptionKey("defaultEncryptionKey")
     * .matching(MatchingProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .autoMerging(AutoMergingProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .conflictResolution(ConflictResolutionProperty.builder()
     * .conflictResolvingModel("conflictResolvingModel")
     * // the properties below are optional
     * .sourceName("sourceName")
     * .build())
     * .consolidation(ConsolidationProperty.builder()
     * .matchingAttributesList(List.of(List.of("matchingAttributesList")))
     * .build())
     * .minAllowedConfidenceScoreForMerging(123)
     * .build())
     * .exportingConfig(ExportingConfigProperty.builder()
     * .s3Exporting(S3ExportingConfigProperty.builder()
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .s3KeyName("s3KeyName")
     * .build())
     * .build())
     * .jobSchedule(JobScheduleProperty.builder()
     * .dayOfTheWeek("dayOfTheWeek")
     * .time("time")
     * .build())
     * .build())
     * .ruleBasedMatching(RuleBasedMatchingProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .attributeTypesSelector(AttributeTypesSelectorProperty.builder()
     * .attributeMatchingModel("attributeMatchingModel")
     * // the properties below are optional
     * .address(List.of("address"))
     * .emailAddress(List.of("emailAddress"))
     * .phoneNumber(List.of("phoneNumber"))
     * .build())
     * .conflictResolution(ConflictResolutionProperty.builder()
     * .conflictResolvingModel("conflictResolvingModel")
     * // the properties below are optional
     * .sourceName("sourceName")
     * .build())
     * .exportingConfig(ExportingConfigProperty.builder()
     * .s3Exporting(S3ExportingConfigProperty.builder()
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .s3KeyName("s3KeyName")
     * .build())
     * .build())
     * .matchingRules(List.of(MatchingRuleProperty.builder()
     * .rule(List.of("rule"))
     * .build()))
     * .maxAllowedRuleLevelForMatching(123)
     * .maxAllowedRuleLevelForMerging(123)
     * .status("status")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html)
     */
    public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
        val builder = CfnDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The process of matching duplicate profiles using Rule-Based matching.
     *
     * If `RuleBasedMatching = true` , Amazon Connect Customer Profiles will start to match and
     * merge your profiles according to your configuration in the `RuleBasedMatchingRequest` . You
     * can use the `ListRuleBasedMatches` and `GetSimilarProfiles` API to return and review the
     * results. Also, if you have configured `ExportingConfig` in the `RuleBasedMatchingRequest` ,
     * you can download the results from S3.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * RuleBasedMatchingProperty ruleBasedMatchingProperty = RuleBasedMatchingProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .attributeTypesSelector(AttributeTypesSelectorProperty.builder()
     * .attributeMatchingModel("attributeMatchingModel")
     * // the properties below are optional
     * .address(List.of("address"))
     * .emailAddress(List.of("emailAddress"))
     * .phoneNumber(List.of("phoneNumber"))
     * .build())
     * .conflictResolution(ConflictResolutionProperty.builder()
     * .conflictResolvingModel("conflictResolvingModel")
     * // the properties below are optional
     * .sourceName("sourceName")
     * .build())
     * .exportingConfig(ExportingConfigProperty.builder()
     * .s3Exporting(S3ExportingConfigProperty.builder()
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .s3KeyName("s3KeyName")
     * .build())
     * .build())
     * .matchingRules(List.of(MatchingRuleProperty.builder()
     * .rule(List.of("rule"))
     * .build()))
     * .maxAllowedRuleLevelForMatching(123)
     * .maxAllowedRuleLevelForMerging(123)
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-rulebasedmatching.html)
     */
    public inline fun cfnDomainRuleBasedMatchingProperty(
        block: CfnDomainRuleBasedMatchingPropertyDsl.() -> Unit = {}
    ): CfnDomain.RuleBasedMatchingProperty {
        val builder = CfnDomainRuleBasedMatchingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The S3 location where Identity Resolution Jobs write result files.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * S3ExportingConfigProperty s3ExportingConfigProperty = S3ExportingConfigProperty.builder()
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .s3KeyName("s3KeyName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-s3exportingconfig.html)
     */
    public inline fun cfnDomainS3ExportingConfigProperty(
        block: CfnDomainS3ExportingConfigPropertyDsl.() -> Unit = {}
    ): CfnDomain.S3ExportingConfigProperty {
        val builder = CfnDomainS3ExportingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnEventStream(
        scope: Construct,
        id: String,
        block: CfnEventStreamDsl.() -> Unit = {},
    ): CfnEventStream {
        val builder = CfnEventStreamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details regarding the Kinesis stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * DestinationDetailsProperty destinationDetailsProperty = DestinationDetailsProperty.builder()
     * .status("status")
     * .uri("uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventstream-destinationdetails.html)
     */
    public inline fun cfnEventStreamDestinationDetailsProperty(
        block: CfnEventStreamDestinationDetailsPropertyDsl.() -> Unit = {}
    ): CfnEventStream.DestinationDetailsProperty {
        val builder = CfnEventStreamDestinationDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEventStream`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * CfnEventStreamProps cfnEventStreamProps = CfnEventStreamProps.builder()
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
    public inline fun cfnEventStreamProps(
        block: CfnEventStreamPropsDsl.() -> Unit = {}
    ): CfnEventStreamProps {
        val builder = CfnEventStreamPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon Connect Customer Profiles Integration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * CfnIntegration cfnIntegration = CfnIntegration.Builder.create(this, "MyCfnIntegration")
     * .domainName("domainName")
     * // the properties below are optional
     * .flowDefinition(FlowDefinitionProperty.builder()
     * .flowName("flowName")
     * .kmsArn("kmsArn")
     * .sourceFlowConfig(SourceFlowConfigProperty.builder()
     * .connectorType("connectorType")
     * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
     * .marketo(MarketoSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .s3(S3SourcePropertiesProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .bucketPrefix("bucketPrefix")
     * .build())
     * .salesforce(SalesforceSourcePropertiesProperty.builder()
     * .object("object")
     * // the properties below are optional
     * .enableDynamicFieldUpdate(false)
     * .includeDeletedRecords(false)
     * .build())
     * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .zendesk(ZendeskSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .build())
     * // the properties below are optional
     * .connectorProfileName("connectorProfileName")
     * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
     * .datetimeTypeFieldName("datetimeTypeFieldName")
     * .build())
     * .build())
     * .tasks(List.of(TaskProperty.builder()
     * .sourceFields(List.of("sourceFields"))
     * .taskType("taskType")
     * // the properties below are optional
     * .connectorOperator(ConnectorOperatorProperty.builder()
     * .marketo("marketo")
     * .s3("s3")
     * .salesforce("salesforce")
     * .serviceNow("serviceNow")
     * .zendesk("zendesk")
     * .build())
     * .destinationField("destinationField")
     * .taskProperties(List.of(TaskPropertiesMapProperty.builder()
     * .operatorPropertyKey("operatorPropertyKey")
     * .property("property")
     * .build()))
     * .build()))
     * .triggerConfig(TriggerConfigProperty.builder()
     * .triggerType("triggerType")
     * // the properties below are optional
     * .triggerProperties(TriggerPropertiesProperty.builder()
     * .scheduled(ScheduledTriggerPropertiesProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * // the properties below are optional
     * .dataPullMode("dataPullMode")
     * .firstExecutionFrom(123)
     * .scheduleEndTime(123)
     * .scheduleOffset(123)
     * .scheduleStartTime(123)
     * .timezone("timezone")
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build())
     * .objectTypeName("objectTypeName")
     * .objectTypeNames(List.of(ObjectTypeMappingProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .uri("uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html)
     */
    public inline fun cfnIntegration(
        scope: Construct,
        id: String,
        block: CfnIntegrationDsl.() -> Unit = {},
    ): CfnIntegration {
        val builder = CfnIntegrationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The operation to be performed on the provided source fields.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * ConnectorOperatorProperty connectorOperatorProperty = ConnectorOperatorProperty.builder()
     * .marketo("marketo")
     * .s3("s3")
     * .salesforce("salesforce")
     * .serviceNow("serviceNow")
     * .zendesk("zendesk")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-connectoroperator.html)
     */
    public inline fun cfnIntegrationConnectorOperatorProperty(
        block: CfnIntegrationConnectorOperatorPropertyDsl.() -> Unit = {}
    ): CfnIntegration.ConnectorOperatorProperty {
        val builder = CfnIntegrationConnectorOperatorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configurations that control how Customer Profiles retrieves data from the source, Amazon
     * AppFlow.
     *
     * Customer Profiles uses this information to create an AppFlow flow on behalf of customers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * FlowDefinitionProperty flowDefinitionProperty = FlowDefinitionProperty.builder()
     * .flowName("flowName")
     * .kmsArn("kmsArn")
     * .sourceFlowConfig(SourceFlowConfigProperty.builder()
     * .connectorType("connectorType")
     * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
     * .marketo(MarketoSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .s3(S3SourcePropertiesProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .bucketPrefix("bucketPrefix")
     * .build())
     * .salesforce(SalesforceSourcePropertiesProperty.builder()
     * .object("object")
     * // the properties below are optional
     * .enableDynamicFieldUpdate(false)
     * .includeDeletedRecords(false)
     * .build())
     * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .zendesk(ZendeskSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .build())
     * // the properties below are optional
     * .connectorProfileName("connectorProfileName")
     * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
     * .datetimeTypeFieldName("datetimeTypeFieldName")
     * .build())
     * .build())
     * .tasks(List.of(TaskProperty.builder()
     * .sourceFields(List.of("sourceFields"))
     * .taskType("taskType")
     * // the properties below are optional
     * .connectorOperator(ConnectorOperatorProperty.builder()
     * .marketo("marketo")
     * .s3("s3")
     * .salesforce("salesforce")
     * .serviceNow("serviceNow")
     * .zendesk("zendesk")
     * .build())
     * .destinationField("destinationField")
     * .taskProperties(List.of(TaskPropertiesMapProperty.builder()
     * .operatorPropertyKey("operatorPropertyKey")
     * .property("property")
     * .build()))
     * .build()))
     * .triggerConfig(TriggerConfigProperty.builder()
     * .triggerType("triggerType")
     * // the properties below are optional
     * .triggerProperties(TriggerPropertiesProperty.builder()
     * .scheduled(ScheduledTriggerPropertiesProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * // the properties below are optional
     * .dataPullMode("dataPullMode")
     * .firstExecutionFrom(123)
     * .scheduleEndTime(123)
     * .scheduleOffset(123)
     * .scheduleStartTime(123)
     * .timezone("timezone")
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-flowdefinition.html)
     */
    public inline fun cfnIntegrationFlowDefinitionProperty(
        block: CfnIntegrationFlowDefinitionPropertyDsl.() -> Unit = {}
    ): CfnIntegration.FlowDefinitionProperty {
        val builder = CfnIntegrationFlowDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration used when importing incremental records from the source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * IncrementalPullConfigProperty incrementalPullConfigProperty =
     * IncrementalPullConfigProperty.builder()
     * .datetimeTypeFieldName("datetimeTypeFieldName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-incrementalpullconfig.html)
     */
    public inline fun cfnIntegrationIncrementalPullConfigProperty(
        block: CfnIntegrationIncrementalPullConfigPropertyDsl.() -> Unit = {}
    ): CfnIntegration.IncrementalPullConfigProperty {
        val builder = CfnIntegrationIncrementalPullConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties that are applied when Marketo is being used as a source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * MarketoSourcePropertiesProperty marketoSourcePropertiesProperty =
     * MarketoSourcePropertiesProperty.builder()
     * .object("object")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-marketosourceproperties.html)
     */
    public inline fun cfnIntegrationMarketoSourcePropertiesProperty(
        block: CfnIntegrationMarketoSourcePropertiesPropertyDsl.() -> Unit = {}
    ): CfnIntegration.MarketoSourcePropertiesProperty {
        val builder = CfnIntegrationMarketoSourcePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A map in which each key is an event type from an external application such as Segment or
     * Shopify, and each value is an `ObjectTypeName` (template) used to ingest the event.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * ObjectTypeMappingProperty objectTypeMappingProperty = ObjectTypeMappingProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-objecttypemapping.html)
     */
    public inline fun cfnIntegrationObjectTypeMappingProperty(
        block: CfnIntegrationObjectTypeMappingPropertyDsl.() -> Unit = {}
    ): CfnIntegration.ObjectTypeMappingProperty {
        val builder = CfnIntegrationObjectTypeMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIntegration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * CfnIntegrationProps cfnIntegrationProps = CfnIntegrationProps.builder()
     * .domainName("domainName")
     * // the properties below are optional
     * .flowDefinition(FlowDefinitionProperty.builder()
     * .flowName("flowName")
     * .kmsArn("kmsArn")
     * .sourceFlowConfig(SourceFlowConfigProperty.builder()
     * .connectorType("connectorType")
     * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
     * .marketo(MarketoSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .s3(S3SourcePropertiesProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .bucketPrefix("bucketPrefix")
     * .build())
     * .salesforce(SalesforceSourcePropertiesProperty.builder()
     * .object("object")
     * // the properties below are optional
     * .enableDynamicFieldUpdate(false)
     * .includeDeletedRecords(false)
     * .build())
     * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .zendesk(ZendeskSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .build())
     * // the properties below are optional
     * .connectorProfileName("connectorProfileName")
     * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
     * .datetimeTypeFieldName("datetimeTypeFieldName")
     * .build())
     * .build())
     * .tasks(List.of(TaskProperty.builder()
     * .sourceFields(List.of("sourceFields"))
     * .taskType("taskType")
     * // the properties below are optional
     * .connectorOperator(ConnectorOperatorProperty.builder()
     * .marketo("marketo")
     * .s3("s3")
     * .salesforce("salesforce")
     * .serviceNow("serviceNow")
     * .zendesk("zendesk")
     * .build())
     * .destinationField("destinationField")
     * .taskProperties(List.of(TaskPropertiesMapProperty.builder()
     * .operatorPropertyKey("operatorPropertyKey")
     * .property("property")
     * .build()))
     * .build()))
     * .triggerConfig(TriggerConfigProperty.builder()
     * .triggerType("triggerType")
     * // the properties below are optional
     * .triggerProperties(TriggerPropertiesProperty.builder()
     * .scheduled(ScheduledTriggerPropertiesProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * // the properties below are optional
     * .dataPullMode("dataPullMode")
     * .firstExecutionFrom(123)
     * .scheduleEndTime(123)
     * .scheduleOffset(123)
     * .scheduleStartTime(123)
     * .timezone("timezone")
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .build())
     * .objectTypeName("objectTypeName")
     * .objectTypeNames(List.of(ObjectTypeMappingProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .uri("uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-integration.html)
     */
    public inline fun cfnIntegrationProps(
        block: CfnIntegrationPropsDsl.() -> Unit = {}
    ): CfnIntegrationProps {
        val builder = CfnIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties that are applied when Amazon S3 is being used as the flow source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * S3SourcePropertiesProperty s3SourcePropertiesProperty = S3SourcePropertiesProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .bucketPrefix("bucketPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-s3sourceproperties.html)
     */
    public inline fun cfnIntegrationS3SourcePropertiesProperty(
        block: CfnIntegrationS3SourcePropertiesPropertyDsl.() -> Unit = {}
    ): CfnIntegration.S3SourcePropertiesProperty {
        val builder = CfnIntegrationS3SourcePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties that are applied when Salesforce is being used as a source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * SalesforceSourcePropertiesProperty salesforceSourcePropertiesProperty =
     * SalesforceSourcePropertiesProperty.builder()
     * .object("object")
     * // the properties below are optional
     * .enableDynamicFieldUpdate(false)
     * .includeDeletedRecords(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-salesforcesourceproperties.html)
     */
    public inline fun cfnIntegrationSalesforceSourcePropertiesProperty(
        block: CfnIntegrationSalesforceSourcePropertiesPropertyDsl.() -> Unit = {}
    ): CfnIntegration.SalesforceSourcePropertiesProperty {
        val builder = CfnIntegrationSalesforceSourcePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration details of a scheduled-trigger flow that you define.
     *
     * Currently, these settings only apply to the scheduled-trigger type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * ScheduledTriggerPropertiesProperty scheduledTriggerPropertiesProperty =
     * ScheduledTriggerPropertiesProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * // the properties below are optional
     * .dataPullMode("dataPullMode")
     * .firstExecutionFrom(123)
     * .scheduleEndTime(123)
     * .scheduleOffset(123)
     * .scheduleStartTime(123)
     * .timezone("timezone")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html)
     */
    public inline fun cfnIntegrationScheduledTriggerPropertiesProperty(
        block: CfnIntegrationScheduledTriggerPropertiesPropertyDsl.() -> Unit = {}
    ): CfnIntegration.ScheduledTriggerPropertiesProperty {
        val builder = CfnIntegrationScheduledTriggerPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties that are applied when ServiceNow is being used as a source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * ServiceNowSourcePropertiesProperty serviceNowSourcePropertiesProperty =
     * ServiceNowSourcePropertiesProperty.builder()
     * .object("object")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-servicenowsourceproperties.html)
     */
    public inline fun cfnIntegrationServiceNowSourcePropertiesProperty(
        block: CfnIntegrationServiceNowSourcePropertiesPropertyDsl.() -> Unit = {}
    ): CfnIntegration.ServiceNowSourcePropertiesProperty {
        val builder = CfnIntegrationServiceNowSourcePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the information that is required to query a particular Amazon AppFlow connector.
     *
     * Customer Profiles supports Salesforce, Zendesk, Marketo, ServiceNow and Amazon S3.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * SourceConnectorPropertiesProperty sourceConnectorPropertiesProperty =
     * SourceConnectorPropertiesProperty.builder()
     * .marketo(MarketoSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .s3(S3SourcePropertiesProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .bucketPrefix("bucketPrefix")
     * .build())
     * .salesforce(SalesforceSourcePropertiesProperty.builder()
     * .object("object")
     * // the properties below are optional
     * .enableDynamicFieldUpdate(false)
     * .includeDeletedRecords(false)
     * .build())
     * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .zendesk(ZendeskSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html)
     */
    public inline fun cfnIntegrationSourceConnectorPropertiesProperty(
        block: CfnIntegrationSourceConnectorPropertiesPropertyDsl.() -> Unit = {}
    ): CfnIntegration.SourceConnectorPropertiesProperty {
        val builder = CfnIntegrationSourceConnectorPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration that controls how Customer Profiles retrieves data from the source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * SourceFlowConfigProperty sourceFlowConfigProperty = SourceFlowConfigProperty.builder()
     * .connectorType("connectorType")
     * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
     * .marketo(MarketoSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .s3(S3SourcePropertiesProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .bucketPrefix("bucketPrefix")
     * .build())
     * .salesforce(SalesforceSourcePropertiesProperty.builder()
     * .object("object")
     * // the properties below are optional
     * .enableDynamicFieldUpdate(false)
     * .includeDeletedRecords(false)
     * .build())
     * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .zendesk(ZendeskSourcePropertiesProperty.builder()
     * .object("object")
     * .build())
     * .build())
     * // the properties below are optional
     * .connectorProfileName("connectorProfileName")
     * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
     * .datetimeTypeFieldName("datetimeTypeFieldName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceflowconfig.html)
     */
    public inline fun cfnIntegrationSourceFlowConfigProperty(
        block: CfnIntegrationSourceFlowConfigPropertyDsl.() -> Unit = {}
    ): CfnIntegration.SourceFlowConfigProperty {
        val builder = CfnIntegrationSourceFlowConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A map used to store task-related information.
     *
     * The execution service looks for particular information based on the `TaskType` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * TaskPropertiesMapProperty taskPropertiesMapProperty = TaskPropertiesMapProperty.builder()
     * .operatorPropertyKey("operatorPropertyKey")
     * .property("property")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-taskpropertiesmap.html)
     */
    public inline fun cfnIntegrationTaskPropertiesMapProperty(
        block: CfnIntegrationTaskPropertiesMapPropertyDsl.() -> Unit = {}
    ): CfnIntegration.TaskPropertiesMapProperty {
        val builder = CfnIntegrationTaskPropertiesMapPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Task` property type specifies the class for modeling different type of tasks.
     *
     * Task implementation varies based on the TaskType.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * TaskProperty taskProperty = TaskProperty.builder()
     * .sourceFields(List.of("sourceFields"))
     * .taskType("taskType")
     * // the properties below are optional
     * .connectorOperator(ConnectorOperatorProperty.builder()
     * .marketo("marketo")
     * .s3("s3")
     * .salesforce("salesforce")
     * .serviceNow("serviceNow")
     * .zendesk("zendesk")
     * .build())
     * .destinationField("destinationField")
     * .taskProperties(List.of(TaskPropertiesMapProperty.builder()
     * .operatorPropertyKey("operatorPropertyKey")
     * .property("property")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html)
     */
    public inline fun cfnIntegrationTaskProperty(
        block: CfnIntegrationTaskPropertyDsl.() -> Unit = {}
    ): CfnIntegration.TaskProperty {
        val builder = CfnIntegrationTaskPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * TriggerConfigProperty triggerConfigProperty = TriggerConfigProperty.builder()
     * .triggerType("triggerType")
     * // the properties below are optional
     * .triggerProperties(TriggerPropertiesProperty.builder()
     * .scheduled(ScheduledTriggerPropertiesProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * // the properties below are optional
     * .dataPullMode("dataPullMode")
     * .firstExecutionFrom(123)
     * .scheduleEndTime(123)
     * .scheduleOffset(123)
     * .scheduleStartTime(123)
     * .timezone("timezone")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-triggerconfig.html)
     */
    public inline fun cfnIntegrationTriggerConfigProperty(
        block: CfnIntegrationTriggerConfigPropertyDsl.() -> Unit = {}
    ): CfnIntegration.TriggerConfigProperty {
        val builder = CfnIntegrationTriggerConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration details that control the trigger for a flow.
     *
     * Currently, these settings only apply to the Scheduled trigger type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * TriggerPropertiesProperty triggerPropertiesProperty = TriggerPropertiesProperty.builder()
     * .scheduled(ScheduledTriggerPropertiesProperty.builder()
     * .scheduleExpression("scheduleExpression")
     * // the properties below are optional
     * .dataPullMode("dataPullMode")
     * .firstExecutionFrom(123)
     * .scheduleEndTime(123)
     * .scheduleOffset(123)
     * .scheduleStartTime(123)
     * .timezone("timezone")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-triggerproperties.html)
     */
    public inline fun cfnIntegrationTriggerPropertiesProperty(
        block: CfnIntegrationTriggerPropertiesPropertyDsl.() -> Unit = {}
    ): CfnIntegration.TriggerPropertiesProperty {
        val builder = CfnIntegrationTriggerPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties that are applied when using Zendesk as a flow source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * ZendeskSourcePropertiesProperty zendeskSourcePropertiesProperty =
     * ZendeskSourcePropertiesProperty.builder()
     * .object("object")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-zendesksourceproperties.html)
     */
    public inline fun cfnIntegrationZendeskSourcePropertiesProperty(
        block: CfnIntegrationZendeskSourcePropertiesPropertyDsl.() -> Unit = {}
    ): CfnIntegration.ZendeskSourcePropertiesProperty {
        val builder = CfnIntegrationZendeskSourcePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an Amazon Connect Customer Profiles Object Type Mapping.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * CfnObjectType cfnObjectType = CfnObjectType.Builder.create(this, "MyCfnObjectType")
     * .description("description")
     * .domainName("domainName")
     * .objectTypeName("objectTypeName")
     * // the properties below are optional
     * .allowProfileCreation(false)
     * .encryptionKey("encryptionKey")
     * .expirationDays(123)
     * .fields(List.of(FieldMapProperty.builder()
     * .name("name")
     * .objectTypeField(ObjectTypeFieldProperty.builder()
     * .contentType("contentType")
     * .source("source")
     * .target("target")
     * .build())
     * .build()))
     * .keys(List.of(KeyMapProperty.builder()
     * .name("name")
     * .objectTypeKeyList(List.of(ObjectTypeKeyProperty.builder()
     * .fieldNames(List.of("fieldNames"))
     * .standardIdentifiers(List.of("standardIdentifiers"))
     * .build()))
     * .build()))
     * .sourceLastUpdatedTimestampFormat("sourceLastUpdatedTimestampFormat")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .templateId("templateId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html)
     */
    public inline fun cfnObjectType(
        scope: Construct,
        id: String,
        block: CfnObjectTypeDsl.() -> Unit = {},
    ): CfnObjectType {
        val builder = CfnObjectTypeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A map of the name and ObjectType field.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * FieldMapProperty fieldMapProperty = FieldMapProperty.builder()
     * .name("name")
     * .objectTypeField(ObjectTypeFieldProperty.builder()
     * .contentType("contentType")
     * .source("source")
     * .target("target")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-fieldmap.html)
     */
    public inline fun cfnObjectTypeFieldMapProperty(
        block: CfnObjectTypeFieldMapPropertyDsl.() -> Unit = {}
    ): CfnObjectType.FieldMapProperty {
        val builder = CfnObjectTypeFieldMapPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A unique key map that can be used to map data to the profile.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * KeyMapProperty keyMapProperty = KeyMapProperty.builder()
     * .name("name")
     * .objectTypeKeyList(List.of(ObjectTypeKeyProperty.builder()
     * .fieldNames(List.of("fieldNames"))
     * .standardIdentifiers(List.of("standardIdentifiers"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-keymap.html)
     */
    public inline fun cfnObjectTypeKeyMapProperty(
        block: CfnObjectTypeKeyMapPropertyDsl.() -> Unit = {}
    ): CfnObjectType.KeyMapProperty {
        val builder = CfnObjectTypeKeyMapPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a field in a ProfileObjectType.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * ObjectTypeFieldProperty objectTypeFieldProperty = ObjectTypeFieldProperty.builder()
     * .contentType("contentType")
     * .source("source")
     * .target("target")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypefield.html)
     */
    public inline fun cfnObjectTypeObjectTypeFieldProperty(
        block: CfnObjectTypeObjectTypeFieldPropertyDsl.() -> Unit = {}
    ): CfnObjectType.ObjectTypeFieldProperty {
        val builder = CfnObjectTypeObjectTypeFieldPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that defines the Key element of a ProfileObject.
     *
     * A Key is a special element that can be used to search for a customer profile.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * ObjectTypeKeyProperty objectTypeKeyProperty = ObjectTypeKeyProperty.builder()
     * .fieldNames(List.of("fieldNames"))
     * .standardIdentifiers(List.of("standardIdentifiers"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypekey.html)
     */
    public inline fun cfnObjectTypeObjectTypeKeyProperty(
        block: CfnObjectTypeObjectTypeKeyPropertyDsl.() -> Unit = {}
    ): CfnObjectType.ObjectTypeKeyProperty {
        val builder = CfnObjectTypeObjectTypeKeyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnObjectType`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.customerprofiles.*;
     * CfnObjectTypeProps cfnObjectTypeProps = CfnObjectTypeProps.builder()
     * .description("description")
     * .domainName("domainName")
     * .objectTypeName("objectTypeName")
     * // the properties below are optional
     * .allowProfileCreation(false)
     * .encryptionKey("encryptionKey")
     * .expirationDays(123)
     * .fields(List.of(FieldMapProperty.builder()
     * .name("name")
     * .objectTypeField(ObjectTypeFieldProperty.builder()
     * .contentType("contentType")
     * .source("source")
     * .target("target")
     * .build())
     * .build()))
     * .keys(List.of(KeyMapProperty.builder()
     * .name("name")
     * .objectTypeKeyList(List.of(ObjectTypeKeyProperty.builder()
     * .fieldNames(List.of("fieldNames"))
     * .standardIdentifiers(List.of("standardIdentifiers"))
     * .build()))
     * .build()))
     * .sourceLastUpdatedTimestampFormat("sourceLastUpdatedTimestampFormat")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .templateId("templateId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-objecttype.html)
     */
    public inline fun cfnObjectTypeProps(
        block: CfnObjectTypePropsDsl.() -> Unit = {}
    ): CfnObjectTypeProps {
        val builder = CfnObjectTypePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
