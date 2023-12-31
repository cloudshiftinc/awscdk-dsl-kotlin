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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Represents options that specify how and where in the AWS Glue Data Catalog DataBrew writes the
 * output generated by recipe jobs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * DataCatalogOutputProperty dataCatalogOutputProperty = DataCatalogOutputProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * // the properties below are optional
 * .catalogId("catalogId")
 * .databaseOptions(DatabaseTableOutputOptionsProperty.builder()
 * .tableName("tableName")
 * // the properties below are optional
 * .tempDirectory(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .key("key")
 * .build())
 * .build())
 * .overwrite(false)
 * .s3Options(S3TableOutputOptionsProperty.builder()
 * .location(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .key("key")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-datacatalogoutput.html)
 */
@CdkDslMarker
public class CfnJobDataCatalogOutputPropertyDsl {
    private val cdkBuilder: CfnJob.DataCatalogOutputProperty.Builder =
        CfnJob.DataCatalogOutputProperty.builder()

    /**
     * @param catalogId The unique identifier of the AWS account that holds the Data Catalog that
     *   stores the data.
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /** @param databaseName The name of a database in the Data Catalog. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param databaseOptions Represents options that specify how and where DataBrew writes the
     *   database output generated by recipe jobs.
     */
    public fun databaseOptions(databaseOptions: IResolvable) {
        cdkBuilder.databaseOptions(databaseOptions)
    }

    /**
     * @param databaseOptions Represents options that specify how and where DataBrew writes the
     *   database output generated by recipe jobs.
     */
    public fun databaseOptions(databaseOptions: CfnJob.DatabaseTableOutputOptionsProperty) {
        cdkBuilder.databaseOptions(databaseOptions)
    }

    /**
     * @param overwrite A value that, if true, means that any data in the location specified for
     *   output is overwritten with new output. Not supported with DatabaseOptions.
     */
    public fun overwrite(overwrite: Boolean) {
        cdkBuilder.overwrite(overwrite)
    }

    /**
     * @param overwrite A value that, if true, means that any data in the location specified for
     *   output is overwritten with new output. Not supported with DatabaseOptions.
     */
    public fun overwrite(overwrite: IResolvable) {
        cdkBuilder.overwrite(overwrite)
    }

    /**
     * @param s3Options Represents options that specify how and where DataBrew writes the Amazon S3
     *   output generated by recipe jobs.
     */
    public fun s3Options(s3Options: IResolvable) {
        cdkBuilder.s3Options(s3Options)
    }

    /**
     * @param s3Options Represents options that specify how and where DataBrew writes the Amazon S3
     *   output generated by recipe jobs.
     */
    public fun s3Options(s3Options: CfnJob.S3TableOutputOptionsProperty) {
        cdkBuilder.s3Options(s3Options)
    }

    /** @param tableName The name of a table in the Data Catalog. */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnJob.DataCatalogOutputProperty = cdkBuilder.build()
}
