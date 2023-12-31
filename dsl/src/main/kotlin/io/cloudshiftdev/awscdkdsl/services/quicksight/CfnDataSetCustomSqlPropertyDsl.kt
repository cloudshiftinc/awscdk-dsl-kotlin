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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A physical table type built from the results of the custom SQL query.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomSqlProperty customSqlProperty = CustomSqlProperty.builder()
 * .columns(List.of(InputColumnProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .dataSourceArn("dataSourceArn")
 * .name("name")
 * .sqlQuery("sqlQuery")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-customsql.html)
 */
@CdkDslMarker
public class CfnDataSetCustomSqlPropertyDsl {
    private val cdkBuilder: CfnDataSet.CustomSqlProperty.Builder =
        CfnDataSet.CustomSqlProperty.builder()

    private val _columns: MutableList<Any> = mutableListOf()

    /** @param columns The column schema from the SQL query result set. */
    public fun columns(vararg columns: Any) {
        _columns.addAll(listOf(*columns))
    }

    /** @param columns The column schema from the SQL query result set. */
    public fun columns(columns: Collection<Any>) {
        _columns.addAll(columns)
    }

    /** @param columns The column schema from the SQL query result set. */
    public fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns)
    }

    /** @param dataSourceArn The Amazon Resource Name (ARN) of the data source. */
    public fun dataSourceArn(dataSourceArn: String) {
        cdkBuilder.dataSourceArn(dataSourceArn)
    }

    /** @param name A display name for the SQL query result. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param sqlQuery The SQL query. */
    public fun sqlQuery(sqlQuery: String) {
        cdkBuilder.sqlQuery(sqlQuery)
    }

    public fun build(): CfnDataSet.CustomSqlProperty {
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        return cdkBuilder.build()
    }
}
