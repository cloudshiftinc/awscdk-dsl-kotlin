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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDatabase
import software.amazon.awscdk.services.glue.CfnDatabaseProps

/**
 * Properties for defining a `CfnDatabase`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object parameters;
 * CfnDatabaseProps cfnDatabaseProps = CfnDatabaseProps.builder()
 * .catalogId("catalogId")
 * .databaseInput(DatabaseInputProperty.builder()
 * .createTableDefaultPermissions(List.of(PrincipalPrivilegesProperty.builder()
 * .permissions(List.of("permissions"))
 * .principal(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build())
 * .build()))
 * .description("description")
 * .federatedDatabase(FederatedDatabaseProperty.builder()
 * .connectionName("connectionName")
 * .identifier("identifier")
 * .build())
 * .locationUri("locationUri")
 * .name("name")
 * .parameters(parameters)
 * .targetDatabase(DatabaseIdentifierProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .region("region")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html)
 */
@CdkDslMarker
public class CfnDatabasePropsDsl {
    private val cdkBuilder: CfnDatabaseProps.Builder = CfnDatabaseProps.builder()

    /**
     * @param catalogId The AWS account ID for the account in which to create the catalog object.
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId`
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /** @param databaseInput The metadata for the database. */
    public fun databaseInput(databaseInput: IResolvable) {
        cdkBuilder.databaseInput(databaseInput)
    }

    /** @param databaseInput The metadata for the database. */
    public fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty) {
        cdkBuilder.databaseInput(databaseInput)
    }

    public fun build(): CfnDatabaseProps = cdkBuilder.build()
}
