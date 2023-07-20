@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDomainDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun accessPolicies(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.accessPolicies(builder.map)
    }

    public fun accessPolicies(accessPolicies: Any) {
        cdkBuilder.accessPolicies(accessPolicies)
    }

    public fun advancedOptions(advancedOptions: Map<String, String>) {
        cdkBuilder.advancedOptions(advancedOptions)
    }

    public fun advancedOptions(advancedOptions: IResolvable) {
        cdkBuilder.advancedOptions(advancedOptions)
    }

    public fun advancedSecurityOptions(advancedSecurityOptions: IResolvable) {
        cdkBuilder.advancedSecurityOptions(advancedSecurityOptions)
    }

    public fun advancedSecurityOptions(advancedSecurityOptions: CfnDomain.AdvancedSecurityOptionsInputProperty) {
        cdkBuilder.advancedSecurityOptions(advancedSecurityOptions)
    }

    public fun clusterConfig(clusterConfig: IResolvable) {
        cdkBuilder.clusterConfig(clusterConfig)
    }

    public fun clusterConfig(clusterConfig: CfnDomain.ClusterConfigProperty) {
        cdkBuilder.clusterConfig(clusterConfig)
    }

    public fun cognitoOptions(cognitoOptions: IResolvable) {
        cdkBuilder.cognitoOptions(cognitoOptions)
    }

    public fun cognitoOptions(cognitoOptions: CfnDomain.CognitoOptionsProperty) {
        cdkBuilder.cognitoOptions(cognitoOptions)
    }

    public fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
    }

    public fun domainEndpointOptions(domainEndpointOptions: IResolvable) {
        cdkBuilder.domainEndpointOptions(domainEndpointOptions)
    }

    public fun domainEndpointOptions(domainEndpointOptions: CfnDomain.DomainEndpointOptionsProperty) {
        cdkBuilder.domainEndpointOptions(domainEndpointOptions)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun ebsOptions(ebsOptions: IResolvable) {
        cdkBuilder.ebsOptions(ebsOptions)
    }

    public fun ebsOptions(ebsOptions: CfnDomain.EBSOptionsProperty) {
        cdkBuilder.ebsOptions(ebsOptions)
    }

    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
        cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
    }

    public fun encryptionAtRestOptions(encryptionAtRestOptions: CfnDomain.EncryptionAtRestOptionsProperty) {
        cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions)
    }

    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    public fun logPublishingOptions(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.logPublishingOptions(builder.map)
    }

    public fun logPublishingOptions(logPublishingOptions: Map<String, Any>) {
        cdkBuilder.logPublishingOptions(logPublishingOptions)
    }

    public fun logPublishingOptions(logPublishingOptions: IResolvable) {
        cdkBuilder.logPublishingOptions(logPublishingOptions)
    }

    public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable) {
        cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions)
    }

    public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: CfnDomain.NodeToNodeEncryptionOptionsProperty) {
        cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions)
    }

    public fun offPeakWindowOptions(offPeakWindowOptions: IResolvable) {
        cdkBuilder.offPeakWindowOptions(offPeakWindowOptions)
    }

    public fun offPeakWindowOptions(offPeakWindowOptions: CfnDomain.OffPeakWindowOptionsProperty) {
        cdkBuilder.offPeakWindowOptions(offPeakWindowOptions)
    }

    public fun snapshotOptions(snapshotOptions: IResolvable) {
        cdkBuilder.snapshotOptions(snapshotOptions)
    }

    public fun snapshotOptions(snapshotOptions: CfnDomain.SnapshotOptionsProperty) {
        cdkBuilder.snapshotOptions(snapshotOptions)
    }

    public fun softwareUpdateOptions(softwareUpdateOptions: IResolvable) {
        cdkBuilder.softwareUpdateOptions(softwareUpdateOptions)
    }

    public fun softwareUpdateOptions(softwareUpdateOptions: CfnDomain.SoftwareUpdateOptionsProperty) {
        cdkBuilder.softwareUpdateOptions(softwareUpdateOptions)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun vpcOptions(vpcOptions: IResolvable) {
        cdkBuilder.vpcOptions(vpcOptions)
    }

    public fun vpcOptions(vpcOptions: CfnDomain.VPCOptionsProperty) {
        cdkBuilder.vpcOptions(vpcOptions)
    }

    public fun build(): CfnDomain {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
