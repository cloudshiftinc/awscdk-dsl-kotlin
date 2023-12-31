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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.RdsDataSourceProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.rds.IServerlessCluster
import software.amazon.awscdk.services.secretsmanager.ISecret

/**
 * Properties for an AppSync RDS datasource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.rds.*;
 * import software.amazon.awscdk.services.secretsmanager.*;
 * GraphqlApi graphqlApi;
 * Role role;
 * Secret secret;
 * ServerlessCluster serverlessCluster;
 * RdsDataSourceProps rdsDataSourceProps = RdsDataSourceProps.builder()
 * .api(graphqlApi)
 * .secretStore(secret)
 * .serverlessCluster(serverlessCluster)
 * // the properties below are optional
 * .databaseName("databaseName")
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class RdsDataSourcePropsDsl {
    private val cdkBuilder: RdsDataSourceProps.Builder = RdsDataSourceProps.builder()

    /** @param api The API to attach this data source to. */
    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    /** @param databaseName The name of the database to use within the cluster. */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param description the description of the data source. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the data source. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param secretStore The secret containing the credentials for the database. */
    public fun secretStore(secretStore: ISecret) {
        cdkBuilder.secretStore(secretStore)
    }

    /**
     * @param serverlessCluster The serverless cluster to call to interact with this data source.
     */
    public fun serverlessCluster(serverlessCluster: IServerlessCluster) {
        cdkBuilder.serverlessCluster(serverlessCluster)
    }

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     *   source.
     */
    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    public fun build(): RdsDataSourceProps = cdkBuilder.build()
}
