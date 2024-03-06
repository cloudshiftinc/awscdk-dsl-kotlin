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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
 *
 * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * MetadataCatalogConfigProperty metadataCatalogConfigProperty =
 * MetadataCatalogConfigProperty.builder()
 * .glueDataCatalog(GlueDataCatalogProperty.builder()
 * .databaseName("databaseName")
 * .roleArn("roleArn")
 * .tablePrefix("tablePrefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-metadatacatalogconfig.html)
 */
@CdkDslMarker
public class CfnFlowMetadataCatalogConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.MetadataCatalogConfigProperty.Builder =
        CfnFlow.MetadataCatalogConfigProperty.builder()

    /**
     * @param glueDataCatalog Specifies the configuration that Amazon AppFlow uses when it catalogs
     *   your data with the AWS Glue Data Catalog .
     */
    public fun glueDataCatalog(glueDataCatalog: IResolvable) {
        cdkBuilder.glueDataCatalog(glueDataCatalog)
    }

    /**
     * @param glueDataCatalog Specifies the configuration that Amazon AppFlow uses when it catalogs
     *   your data with the AWS Glue Data Catalog .
     */
    public fun glueDataCatalog(glueDataCatalog: CfnFlow.GlueDataCatalogProperty) {
        cdkBuilder.glueDataCatalog(glueDataCatalog)
    }

    public fun build(): CfnFlow.MetadataCatalogConfigProperty = cdkBuilder.build()
}
