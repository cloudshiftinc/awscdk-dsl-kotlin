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

package io.cloudshiftdev.awscdkdsl.services.secretsmanager

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.secretsmanager.CfnSecret
import software.constructs.Construct

/**
 * Creates a new secret.
 *
 * A *secret* can be a password, a set of credentials such as a user name and password, an OAuth
 * token, or other secret information that you store in an encrypted form in Secrets Manager.
 *
 * For Amazon RDS master user credentials, see
 * [AWS::RDS::DBCluster MasterUserSecret](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-masterusersecret.html)
 * .
 *
 * To retrieve a secret in a CloudFormation template, use a *dynamic reference* . For more
 * information, see
 * [Retrieve a secret in an AWS CloudFormation resource](https://docs.aws.amazon.com/secretsmanager/latest/userguide/cfn-example_reference-secret.html)
 * .
 *
 * A common scenario is to first create a secret with `GenerateSecretString` , which generates a
 * password, and then use a dynamic reference to retrieve the username and password from the secret
 * to use as credentials for a new database. See the example *Creating a Redshift cluster and a
 * secret for the admin credentials* .
 *
 * For information about creating a secret in the console, see
 * [Create a secret](https://docs.aws.amazon.com/secretsmanager/latest/userguide/manage_create-basic-secret.html)
 * . For information about creating a secret using the CLI or SDK, see
 * [CreateSecret](https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html)
 * .
 *
 * For information about retrieving a secret in code, see
 * [Retrieve secrets from Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/retrieving-secrets.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * CfnSecret cfnSecret = CfnSecret.Builder.create(this, "MyCfnSecret")
 * .description("description")
 * .generateSecretString(GenerateSecretStringProperty.builder()
 * .excludeCharacters("excludeCharacters")
 * .excludeLowercase(false)
 * .excludeNumbers(false)
 * .excludePunctuation(false)
 * .excludeUppercase(false)
 * .generateStringKey("generateStringKey")
 * .includeSpace(false)
 * .passwordLength(123)
 * .requireEachIncludedType(false)
 * .secretStringTemplate("secretStringTemplate")
 * .build())
 * .kmsKeyId("kmsKeyId")
 * .name("name")
 * .replicaRegions(List.of(ReplicaRegionProperty.builder()
 * .region("region")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build()))
 * .secretString("secretString")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html)
 */
@CdkDslMarker
public class CfnSecretDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSecret.Builder = CfnSecret.Builder.create(scope, id)

    private val _replicaRegions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description of the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-description)
     *
     * @param description The description of the secret.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A structure that specifies how to generate a password to encrypt and store in the secret.
     *
     * To include a specific string in the secret, use `SecretString` instead. If you omit both
     * `GenerateSecretString` and `SecretString` , you create an empty secret. When you make a
     * change to this property, a new secret version is created.
     *
     * We recommend that you specify the maximum length and include every character type that the
     * system you are generating a password for can support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-generatesecretstring)
     *
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     *   and store in the secret.
     */
    public fun generateSecretString(generateSecretString: IResolvable) {
        cdkBuilder.generateSecretString(generateSecretString)
    }

    /**
     * A structure that specifies how to generate a password to encrypt and store in the secret.
     *
     * To include a specific string in the secret, use `SecretString` instead. If you omit both
     * `GenerateSecretString` and `SecretString` , you create an empty secret. When you make a
     * change to this property, a new secret version is created.
     *
     * We recommend that you specify the maximum length and include every character type that the
     * system you are generating a password for can support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-generatesecretstring)
     *
     * @param generateSecretString A structure that specifies how to generate a password to encrypt
     *   and store in the secret.
     */
    public fun generateSecretString(generateSecretString: CfnSecret.GenerateSecretStringProperty) {
        cdkBuilder.generateSecretString(generateSecretString)
    }

    /**
     * The ARN, key ID, or alias of the AWS KMS key that Secrets Manager uses to encrypt the secret
     * value in the secret.
     *
     * An alias is always prefixed by `alias/` , for example `alias/aws/secretsmanager` . For more
     * information, see
     * [About aliases](https://docs.aws.amazon.com/kms/latest/developerguide/alias-about.html) .
     *
     * To use a AWS KMS key in a different account, use the key ARN or the alias ARN.
     *
     * If you don't specify this value, then Secrets Manager uses the key `aws/secretsmanager` . If
     * that key doesn't yet exist, then Secrets Manager creates it for you automatically the first
     * time it encrypts the secret value.
     *
     * If the secret is in a different AWS account from the credentials calling the API, then you
     * can't use `aws/secretsmanager` to encrypt the secret, and you must create and use a customer
     * managed AWS KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-kmskeyid)
     *
     * @param kmsKeyId The ARN, key ID, or alias of the AWS KMS key that Secrets Manager uses to
     *   encrypt the secret value in the secret.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The name of the new secret.
     *
     * The secret name can contain ASCII letters, numbers, and the following characters: /_+=.&#64;-
     *
     * Do not end your secret name with a hyphen followed by six characters. If you do so, you risk
     * confusion and unexpected results when searching for a secret by partial ARN. Secrets Manager
     * automatically adds a hyphen and six random characters after the secret name at the end of the
     * ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-name)
     *
     * @param name The name of the new secret.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-replicaregions)
     *
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     *   replica secret.
     */
    public fun replicaRegions(vararg replicaRegions: Any) {
        _replicaRegions.addAll(listOf(*replicaRegions))
    }

    /**
     * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-replicaregions)
     *
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     *   replica secret.
     */
    public fun replicaRegions(replicaRegions: Collection<Any>) {
        _replicaRegions.addAll(replicaRegions)
    }

    /**
     * A custom type that specifies a `Region` and the `KmsKeyId` for a replica secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-replicaregions)
     *
     * @param replicaRegions A custom type that specifies a `Region` and the `KmsKeyId` for a
     *   replica secret.
     */
    public fun replicaRegions(replicaRegions: IResolvable) {
        cdkBuilder.replicaRegions(replicaRegions)
    }

    /**
     * The text to encrypt and store in the secret.
     *
     * We recommend you use a JSON structure of key/value pairs for your secret value. To generate a
     * random password, use `GenerateSecretString` instead. If you omit both `GenerateSecretString`
     * and `SecretString` , you create an empty secret. When you make a change to this property, a
     * new secret version is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-secretstring)
     *
     * @param secretString The text to encrypt and store in the secret.
     */
    public fun secretString(secretString: String) {
        cdkBuilder.secretString(secretString)
    }

    /**
     * A list of tags to attach to the secret.
     *
     * Each tag is a key and value pair of strings in a JSON text string, for example:
     *
     * `[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]`
     *
     * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag
     * from one with key "abc".
     *
     * If you check tags in permissions policies as part of your security strategy, then adding or
     * removing a tag can change permissions. If the completion of this operation would result in
     * you losing your permissions for this secret, then Secrets Manager blocks the operation and
     * returns an `Access Denied` error. For more information, see
     * [Control access to secrets using tags](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac)
     * and
     * [Limit access to identities with tags that match secrets' tags](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2)
     * .
     *
     * For information about how to format a JSON parameter for the various command line tool
     * environments, see
     * [Using JSON for Parameters](https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json)
     * . If your command-line tool or SDK requires quotation marks around the parameter, you should
     * use single quotes to avoid confusion with the double quotes required in the JSON text.
     *
     * The following restrictions apply to tags:
     * * Maximum number of tags per secret: 50
     * * Maximum key length: 127 Unicode characters in UTF-8
     * * Maximum value length: 255 Unicode characters in UTF-8
     * * Tag keys and values are case sensitive.
     * * Do not use the `aws:` prefix in your tag names or values because AWS reserves it for AWS
     *   use. You can't edit or delete tag names or values with this prefix. Tags with this prefix
     *   do not count against your tags per secret limit.
     * * If you use your tagging schema across multiple services and resources, other services might
     *   have restrictions on allowed characters. Generally allowed characters: letters, spaces, and
     *   numbers representable in UTF-8, plus the following special characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-tags)
     *
     * @param tags A list of tags to attach to the secret.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tags to attach to the secret.
     *
     * Each tag is a key and value pair of strings in a JSON text string, for example:
     *
     * `[{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]`
     *
     * Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag
     * from one with key "abc".
     *
     * If you check tags in permissions policies as part of your security strategy, then adding or
     * removing a tag can change permissions. If the completion of this operation would result in
     * you losing your permissions for this secret, then Secrets Manager blocks the operation and
     * returns an `Access Denied` error. For more information, see
     * [Control access to secrets using tags](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#tag-secrets-abac)
     * and
     * [Limit access to identities with tags that match secrets' tags](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html#auth-and-access_tags2)
     * .
     *
     * For information about how to format a JSON parameter for the various command line tool
     * environments, see
     * [Using JSON for Parameters](https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json)
     * . If your command-line tool or SDK requires quotation marks around the parameter, you should
     * use single quotes to avoid confusion with the double quotes required in the JSON text.
     *
     * The following restrictions apply to tags:
     * * Maximum number of tags per secret: 50
     * * Maximum key length: 127 Unicode characters in UTF-8
     * * Maximum value length: 255 Unicode characters in UTF-8
     * * Tag keys and values are case sensitive.
     * * Do not use the `aws:` prefix in your tag names or values because AWS reserves it for AWS
     *   use. You can't edit or delete tag names or values with this prefix. Tags with this prefix
     *   do not count against your tags per secret limit.
     * * If you use your tagging schema across multiple services and resources, other services might
     *   have restrictions on allowed characters. Generally allowed characters: letters, spaces, and
     *   numbers representable in UTF-8, plus the following special characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secret.html#cfn-secretsmanager-secret-tags)
     *
     * @param tags A list of tags to attach to the secret.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSecret {
        if (_replicaRegions.isNotEmpty()) cdkBuilder.replicaRegions(_replicaRegions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
