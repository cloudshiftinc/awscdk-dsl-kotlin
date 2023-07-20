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

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDocumentClassifierPropsDsl {
    private val cdkBuilder: CfnDocumentClassifierProps.Builder = CfnDocumentClassifierProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun dataAccessRoleArn(dataAccessRoleArn: String) {
        cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    public fun documentClassifierName(documentClassifierName: String) {
        cdkBuilder.documentClassifierName(documentClassifierName)
    }

    public fun inputDataConfig(inputDataConfig: IResolvable) {
        cdkBuilder.inputDataConfig(inputDataConfig)
    }

    public fun inputDataConfig(inputDataConfig: CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty) {
        cdkBuilder.inputDataConfig(inputDataConfig)
    }

    public fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
    }

    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun modelKmsKeyId(modelKmsKeyId: String) {
        cdkBuilder.modelKmsKeyId(modelKmsKeyId)
    }

    public fun modelPolicy(modelPolicy: String) {
        cdkBuilder.modelPolicy(modelPolicy)
    }

    public fun outputDataConfig(outputDataConfig: IResolvable) {
        cdkBuilder.outputDataConfig(outputDataConfig)
    }

    public fun outputDataConfig(outputDataConfig: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty) {
        cdkBuilder.outputDataConfig(outputDataConfig)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun versionName(versionName: String) {
        cdkBuilder.versionName(versionName)
    }

    public fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
    }

    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun vpcConfig(vpcConfig: CfnDocumentClassifier.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnDocumentClassifierProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
