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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when Salesforce is being used as a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SalesforceSourcePropertiesProperty salesforceSourcePropertiesProperty =
 * SalesforceSourcePropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .dataTransferApi("dataTransferApi")
 * .enableDynamicFieldUpdate(false)
 * .includeDeletedRecords(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-salesforcesourceproperties.html)
 */
@CdkDslMarker
public class CfnFlowSalesforceSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.SalesforceSourcePropertiesProperty.Builder =
        CfnFlow.SalesforceSourcePropertiesProperty.builder()

    /**
     * @param dataTransferApi Specifies which Salesforce API is used by Amazon AppFlow when your
     *   flow transfers data from Salesforce.
     * * **AUTOMATIC** - The default. Amazon AppFlow selects which API to use based on the number of
     *   records that your flow transfers from Salesforce. If your flow transfers fewer than
     *   1,000,000 records, Amazon AppFlow uses Salesforce REST API. If your flow transfers
     *   1,000,000 records or more, Amazon AppFlow uses Salesforce Bulk API 2.0.
     *
     * Each of these Salesforce APIs structures data differently. If Amazon AppFlow selects the API
     * automatically, be aware that, for recurring flows, the data output might vary from one flow
     * run to the next. For example, if a flow runs daily, it might use REST API on one day to
     * transfer 900,000 records, and it might use Bulk API 2.0 on the next day to transfer 1,100,000
     * records. For each of these flow runs, the respective Salesforce API formats the data
     * differently. Some of the differences include how dates are formatted and null values are
     * represented. Also, Bulk API 2.0 doesn't transfer Salesforce compound fields.
     *
     * By choosing this option, you optimize flow performance for both small and large data
     * transfers, but the tradeoff is inconsistent formatting in the output.
     * * **BULKV2** - Amazon AppFlow uses only Salesforce Bulk API 2.0. This API runs asynchronous
     *   data transfers, and it's optimal for large sets of data. By choosing this option, you
     *   ensure that your flow writes consistent output, but you optimize performance only for large
     *   data transfers.
     *
     * Note that Bulk API 2.0 does not transfer Salesforce compound fields.
     * * **REST_SYNC** - Amazon AppFlow uses only Salesforce REST API. By choosing this option, you
     *   ensure that your flow writes consistent output, but you decrease performance for large data
     *   transfers that are better suited for Bulk API 2.0. In some cases, if your flow attempts to
     *   transfer a vary large set of data, it might fail wituh a timed out error.
     */
    public fun dataTransferApi(dataTransferApi: String) {
        cdkBuilder.dataTransferApi(dataTransferApi)
    }

    /**
     * @param enableDynamicFieldUpdate The flag that enables dynamic fetching of new (recently
     *   added) fields in the Salesforce objects while running a flow.
     */
    public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: Boolean) {
        cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate)
    }

    /**
     * @param enableDynamicFieldUpdate The flag that enables dynamic fetching of new (recently
     *   added) fields in the Salesforce objects while running a flow.
     */
    public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: IResolvable) {
        cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate)
    }

    /**
     * @param includeDeletedRecords Indicates whether Amazon AppFlow includes deleted files in the
     *   flow run.
     */
    public fun includeDeletedRecords(includeDeletedRecords: Boolean) {
        cdkBuilder.includeDeletedRecords(includeDeletedRecords)
    }

    /**
     * @param includeDeletedRecords Indicates whether Amazon AppFlow includes deleted files in the
     *   flow run.
     */
    public fun includeDeletedRecords(includeDeletedRecords: IResolvable) {
        cdkBuilder.includeDeletedRecords(includeDeletedRecords)
    }

    /** @param object The object specified in the Salesforce flow source. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.SalesforceSourcePropertiesProperty = cdkBuilder.build()
}
