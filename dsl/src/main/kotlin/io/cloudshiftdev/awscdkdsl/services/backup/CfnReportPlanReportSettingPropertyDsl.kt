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

package io.cloudshiftdev.awscdkdsl.services.backup

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.backup.CfnReportPlan

/**
 * Contains detailed information about a report setting.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * ReportSettingProperty reportSettingProperty = ReportSettingProperty.builder()
 * .reportTemplate("reportTemplate")
 * // the properties below are optional
 * .accounts(List.of("accounts"))
 * .frameworkArns(List.of("frameworkArns"))
 * .organizationUnits(List.of("organizationUnits"))
 * .regions(List.of("regions"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportsetting.html)
 */
@CdkDslMarker
public class CfnReportPlanReportSettingPropertyDsl {
    private val cdkBuilder: CfnReportPlan.ReportSettingProperty.Builder =
        CfnReportPlan.ReportSettingProperty.builder()

    private val _accounts: MutableList<String> = mutableListOf()

    private val _frameworkArns: MutableList<String> = mutableListOf()

    private val _organizationUnits: MutableList<String> = mutableListOf()

    private val _regions: MutableList<String> = mutableListOf()

    /** @param accounts These are the accounts to be included in the report. */
    public fun accounts(vararg accounts: String) {
        _accounts.addAll(listOf(*accounts))
    }

    /** @param accounts These are the accounts to be included in the report. */
    public fun accounts(accounts: Collection<String>) {
        _accounts.addAll(accounts)
    }

    /** @param frameworkArns The Amazon Resource Names (ARNs) of the frameworks a report covers. */
    public fun frameworkArns(vararg frameworkArns: String) {
        _frameworkArns.addAll(listOf(*frameworkArns))
    }

    /** @param frameworkArns The Amazon Resource Names (ARNs) of the frameworks a report covers. */
    public fun frameworkArns(frameworkArns: Collection<String>) {
        _frameworkArns.addAll(frameworkArns)
    }

    /** @param organizationUnits These are the Organizational Units to be included in the report. */
    public fun organizationUnits(vararg organizationUnits: String) {
        _organizationUnits.addAll(listOf(*organizationUnits))
    }

    /** @param organizationUnits These are the Organizational Units to be included in the report. */
    public fun organizationUnits(organizationUnits: Collection<String>) {
        _organizationUnits.addAll(organizationUnits)
    }

    /** @param regions These are the Regions to be included in the report. */
    public fun regions(vararg regions: String) {
        _regions.addAll(listOf(*regions))
    }

    /** @param regions These are the Regions to be included in the report. */
    public fun regions(regions: Collection<String>) {
        _regions.addAll(regions)
    }

    /**
     * @param reportTemplate Identifies the report template for the report. Reports are built using
     *   a report template. The report templates are:. `RESOURCE_COMPLIANCE_REPORT |
     *   CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT`
     */
    public fun reportTemplate(reportTemplate: String) {
        cdkBuilder.reportTemplate(reportTemplate)
    }

    public fun build(): CfnReportPlan.ReportSettingProperty {
        if (_accounts.isNotEmpty()) cdkBuilder.accounts(_accounts)
        if (_frameworkArns.isNotEmpty()) cdkBuilder.frameworkArns(_frameworkArns)
        if (_organizationUnits.isNotEmpty()) cdkBuilder.organizationUnits(_organizationUnits)
        if (_regions.isNotEmpty()) cdkBuilder.regions(_regions)
        return cdkBuilder.build()
    }
}
