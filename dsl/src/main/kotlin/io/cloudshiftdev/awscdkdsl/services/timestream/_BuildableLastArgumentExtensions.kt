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

package io.cloudshiftdev.awscdkdsl.services.timestream

import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnScheduledQuery
import software.amazon.awscdk.services.timestream.CfnTable

/** Configuration for error reporting. */
public inline fun CfnScheduledQuery.setErrorReportConfiguration(
    block: CfnScheduledQueryErrorReportConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnScheduledQueryErrorReportConfigurationPropertyDsl()
    builder.apply(block)
    return setErrorReportConfiguration(builder.build())
}

/** Notification configuration for the scheduled query. */
public inline fun CfnScheduledQuery.setNotificationConfiguration(
    block: CfnScheduledQueryNotificationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnScheduledQueryNotificationConfigurationPropertyDsl()
    builder.apply(block)
    return setNotificationConfiguration(builder.build())
}

/** Schedule configuration. */
public inline fun CfnScheduledQuery.setScheduleConfiguration(
    block: CfnScheduledQueryScheduleConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnScheduledQueryScheduleConfigurationPropertyDsl()
    builder.apply(block)
    return setScheduleConfiguration(builder.build())
}

/** Scheduled query target store configuration. */
public inline fun CfnScheduledQuery.setTargetConfiguration(
    block: CfnScheduledQueryTargetConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnScheduledQueryTargetConfigurationPropertyDsl()
    builder.apply(block)
    return setTargetConfiguration(builder.build())
}

/** The schema of the table. */
public inline fun CfnTable.setSchema(block: CfnTableSchemaPropertyDsl.() -> Unit = {}) {
    val builder = CfnTableSchemaPropertyDsl()
    builder.apply(block)
    return setSchema(builder.build())
}
