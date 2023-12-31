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

package io.cloudshiftdev.awscdkdsl.services.opensearchservice

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain
import software.constructs.Construct

/**
 * The AWS::OpenSearchService::Domain resource creates an Amazon OpenSearch Service domain.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * Object accessPolicies;
 * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
 * .accessPolicies(accessPolicies)
 * .advancedOptions(Map.of(
 * "advancedOptionsKey", "advancedOptions"))
 * .advancedSecurityOptions(AdvancedSecurityOptionsInputProperty.builder()
 * .anonymousAuthDisableDate("anonymousAuthDisableDate")
 * .anonymousAuthEnabled(false)
 * .enabled(false)
 * .internalUserDatabaseEnabled(false)
 * .masterUserOptions(MasterUserOptionsProperty.builder()
 * .masterUserArn("masterUserArn")
 * .masterUserName("masterUserName")
 * .masterUserPassword("masterUserPassword")
 * .build())
 * .samlOptions(SAMLOptionsProperty.builder()
 * .enabled(false)
 * .idp(IdpProperty.builder()
 * .entityId("entityId")
 * .metadataContent("metadataContent")
 * .build())
 * .masterBackendRole("masterBackendRole")
 * .masterUserName("masterUserName")
 * .rolesKey("rolesKey")
 * .sessionTimeoutMinutes(123)
 * .subjectKey("subjectKey")
 * .build())
 * .build())
 * .clusterConfig(ClusterConfigProperty.builder()
 * .dedicatedMasterCount(123)
 * .dedicatedMasterEnabled(false)
 * .dedicatedMasterType("dedicatedMasterType")
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .multiAzWithStandbyEnabled(false)
 * .warmCount(123)
 * .warmEnabled(false)
 * .warmType("warmType")
 * .zoneAwarenessConfig(ZoneAwarenessConfigProperty.builder()
 * .availabilityZoneCount(123)
 * .build())
 * .zoneAwarenessEnabled(false)
 * .build())
 * .cognitoOptions(CognitoOptionsProperty.builder()
 * .enabled(false)
 * .identityPoolId("identityPoolId")
 * .roleArn("roleArn")
 * .userPoolId("userPoolId")
 * .build())
 * .domainArn("domainArn")
 * .domainEndpointOptions(DomainEndpointOptionsProperty.builder()
 * .customEndpoint("customEndpoint")
 * .customEndpointCertificateArn("customEndpointCertificateArn")
 * .customEndpointEnabled(false)
 * .enforceHttps(false)
 * .tlsSecurityPolicy("tlsSecurityPolicy")
 * .build())
 * .domainName("domainName")
 * .ebsOptions(EBSOptionsProperty.builder()
 * .ebsEnabled(false)
 * .iops(123)
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .encryptionAtRestOptions(EncryptionAtRestOptionsProperty.builder()
 * .enabled(false)
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .engineVersion("engineVersion")
 * .logPublishingOptions(Map.of(
 * "logPublishingOptionsKey", LogPublishingOptionProperty.builder()
 * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
 * .enabled(false)
 * .build()))
 * .nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty.builder()
 * .enabled(false)
 * .build())
 * .offPeakWindowOptions(OffPeakWindowOptionsProperty.builder()
 * .enabled(false)
 * .offPeakWindow(OffPeakWindowProperty.builder()
 * .windowStartTime(WindowStartTimeProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build())
 * .build())
 * .build())
 * .snapshotOptions(SnapshotOptionsProperty.builder()
 * .automatedSnapshotStartHour(123)
 * .build())
 * .softwareUpdateOptions(SoftwareUpdateOptionsProperty.builder()
 * .autoSoftwareUpdateEnabled(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcOptions(VPCOptionsProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
 */
@CdkDslMarker
public class CfnDomainDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access
     * the OpenSearch Service domain and their permissions.
     *
     * For more information, see
     * [Configuring access policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-accesspolicies)
     *
     * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
     *   specifies who can access the OpenSearch Service domain and their permissions.
     */
    public fun accessPolicies(accessPolicies: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(accessPolicies)
        cdkBuilder.accessPolicies(builder.map)
    }

    /**
     * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access
     * the OpenSearch Service domain and their permissions.
     *
     * For more information, see
     * [Configuring access policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-accesspolicies)
     *
     * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
     *   specifies who can access the OpenSearch Service domain and their permissions.
     */
    public fun accessPolicies(accessPolicies: Any) {
        cdkBuilder.accessPolicies(accessPolicies)
    }

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see
     * [AdvancedOptions](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateDomain.html#API_CreateDomain_RequestBody)
     * in the OpenSearch Service API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedoptions)
     *
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
     */
    public fun advancedOptions(advancedOptions: Map<String, String>) {
        cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see
     * [AdvancedOptions](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateDomain.html#API_CreateDomain_RequestBody)
     * in the OpenSearch Service API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedoptions)
     *
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain.
     */
    public fun advancedOptions(advancedOptions: IResolvable) {
        cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * Specifies options for fine-grained access control and SAML authentication.
     *
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedsecurityoptions)
     *
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     *   authentication.
     */
    public fun advancedSecurityOptions(advancedSecurityOptions: IResolvable) {
        cdkBuilder.advancedSecurityOptions(advancedSecurityOptions)
    }

    /**
     * Specifies options for fine-grained access control and SAML authentication.
     *
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedsecurityoptions)
     *
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     *   authentication.
     */
    public fun advancedSecurityOptions(
        advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty
    ) {
        cdkBuilder.advancedSecurityOptions(advancedSecurityOptions)
    }

    /**
     * Container for the cluster configuration of a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-clusterconfig)
     *
     * @param clusterConfig Container for the cluster configuration of a domain.
     */
    public fun clusterConfig(clusterConfig: IResolvable) {
        cdkBuilder.clusterConfig(clusterConfig)
    }

    /**
     * Container for the cluster configuration of a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-clusterconfig)
     *
     * @param clusterConfig Container for the cluster configuration of a domain.
     */
    public fun clusterConfig(clusterConfig: CfnDomain.ClusterConfigProperty) {
        cdkBuilder.clusterConfig(clusterConfig)
    }

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-cognitooptions)
     *
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     *   OpenSearch Dashboards.
     */
    public fun cognitoOptions(cognitoOptions: IResolvable) {
        cdkBuilder.cognitoOptions(cognitoOptions)
    }

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-cognitooptions)
     *
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     *   OpenSearch Dashboards.
     */
    public fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty) {
        cdkBuilder.cognitoOptions(cognitoOptions)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainarn)
     *
     * @param domainArn
     */
    public fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
    }

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainendpointoptions)
     *
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     *   whether to require HTTPS for all traffic or whether to use a custom endpoint rather than
     *   the default endpoint.
     */
    public fun domainEndpointOptions(domainEndpointOptions: IResolvable) {
        cdkBuilder.domainEndpointOptions(domainEndpointOptions)
    }

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainendpointoptions)
     *
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     *   whether to require HTTPS for all traffic or whether to use a custom endpoint rather than
     *   the default endpoint.
     */
    public fun domainEndpointOptions(
        domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty
    ) {
        cdkBuilder.domainEndpointOptions(domainEndpointOptions)
    }

    /**
     * A name for the OpenSearch Service domain.
     *
     * The name must have a minimum length of 3 and a maximum length of 28. If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID for the domain name.
     * For more information, see
     * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * Required when creating a new domain.
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainname)
     *
     * @param domainName A name for the OpenSearch Service domain.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see
     * [EBS volume size limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ebsoptions)
     *
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     *   are attached to data nodes in the OpenSearch Service domain.
     */
    public fun ebsOptions(ebsOptions: IResolvable) {
        cdkBuilder.ebsOptions(ebsOptions)
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see
     * [EBS volume size limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ebsoptions)
     *
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     *   are attached to data nodes in the OpenSearch Service domain.
     */
    public fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty) {
        cdkBuilder.ebsOptions(ebsOptions)
    }

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
     *
     * See
     * [Encryption of data at rest for Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-encryptionatrestoptions)
     *
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     *   AWS KMS key to use.
     */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
        cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
    }

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
     *
     * See
     * [Encryption of data at rest for Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-encryptionatrestoptions)
     *
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     *   AWS KMS key to use.
     */
    public fun encryptionAtRestOptions(
        encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty
    ) {
        cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
    }

    /**
     * The version of OpenSearch to use.
     *
     * The value must be in the format `OpenSearch_X.Y` or `Elasticsearch_X.Y` . If not specified,
     * the latest version of OpenSearch is used. For information about the versions that OpenSearch
     * Service supports, see
     * [Supported versions of OpenSearch and Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * If you set the
     * [EnableVersionUpgrade](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * update policy to `true` , you can update `EngineVersion` without interruption. When
     * `EnableVersionUpgrade` is set to `false` , or is not specified, updating `EngineVersion`
     * results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-engineversion)
     *
     * @param engineVersion The version of OpenSearch to use.
     */
    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-logpublishingoptions)
     *
     * @param logPublishingOptions An object with one or more of the following keys:
     *   `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending
     *   on the types of logs you want to publish.
     */
    public fun logPublishingOptions(logPublishingOptions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(logPublishingOptions)
        cdkBuilder.logPublishingOptions(builder.map)
    }

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-logpublishingoptions)
     *
     * @param logPublishingOptions An object with one or more of the following keys:
     *   `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending
     *   on the types of logs you want to publish.
     */
    public fun logPublishingOptions(logPublishingOptions: Map<String, Any>) {
        cdkBuilder.logPublishingOptions(logPublishingOptions)
    }

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-logpublishingoptions)
     *
     * @param logPublishingOptions An object with one or more of the following keys:
     *   `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending
     *   on the types of logs you want to publish.
     */
    public fun logPublishingOptions(logPublishingOptions: IResolvable) {
        cdkBuilder.logPublishingOptions(logPublishingOptions)
    }

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See
     * [Node-to-node encryption for Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-nodetonodeencryptionoptions)
     *
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled.
     */
    public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable) {
        cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions)
    }

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See
     * [Node-to-node encryption for Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-nodetonodeencryptionoptions)
     *
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled.
     */
    public fun nodeToNodeEncryptionOptions(
        nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty
    ) {
        cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions)
    }

    /**
     * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
     * configuration changes on the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-offpeakwindowoptions)
     *
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     *   Service can perform mandatory configuration changes on the domain.
     */
    public fun offPeakWindowOptions(offPeakWindowOptions: IResolvable) {
        cdkBuilder.offPeakWindowOptions(offPeakWindowOptions)
    }

    /**
     * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
     * configuration changes on the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-offpeakwindowoptions)
     *
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     *   Service can perform mandatory configuration changes on the domain.
     */
    public fun offPeakWindowOptions(offPeakWindowOptions: CfnDomain.OffPeakWindowOptionsProperty) {
        cdkBuilder.offPeakWindowOptions(offPeakWindowOptions)
    }

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-snapshotoptions)
     *
     * @param snapshotOptions *DEPRECATED* .
     */
    public fun snapshotOptions(snapshotOptions: IResolvable) {
        cdkBuilder.snapshotOptions(snapshotOptions)
    }

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-snapshotoptions)
     *
     * @param snapshotOptions *DEPRECATED* .
     */
    public fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty) {
        cdkBuilder.snapshotOptions(snapshotOptions)
    }

    /**
     * Options for configuring service software updates for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-softwareupdateoptions)
     *
     * @param softwareUpdateOptions Options for configuring service software updates for a domain.
     */
    public fun softwareUpdateOptions(softwareUpdateOptions: IResolvable) {
        cdkBuilder.softwareUpdateOptions(softwareUpdateOptions)
    }

    /**
     * Options for configuring service software updates for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-softwareupdateoptions)
     *
     * @param softwareUpdateOptions Options for configuring service software updates for a domain.
     */
    public fun softwareUpdateOptions(
        softwareUpdateOptions: CfnDomain.SoftwareUpdateOptionsProperty
    ) {
        cdkBuilder.softwareUpdateOptions(softwareUpdateOptions)
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-tags)
     *
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     *   Service domain.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-tags)
     *
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     *   Service domain.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see
     * [Launching your Amazon OpenSearch Service domains within a VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-vpcoptions)
     *
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     *   domain.
     */
    public fun vpcOptions(vpcOptions: IResolvable) {
        cdkBuilder.vpcOptions(vpcOptions)
    }

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see
     * [Launching your Amazon OpenSearch Service domains within a VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-vpcoptions)
     *
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     *   domain.
     */
    public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty) {
        cdkBuilder.vpcOptions(vpcOptions)
    }

    public fun build(): CfnDomain {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
