@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject
import kotlin.Boolean
import kotlin.String

/**
 * `Artifacts` is a property of the
 * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
 * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * ArtifactsProperty artifactsProperty = ArtifactsProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .artifactIdentifier("artifactIdentifier")
 * .encryptionDisabled(false)
 * .location("location")
 * .name("name")
 * .namespaceType("namespaceType")
 * .overrideArtifactName(false)
 * .packaging("packaging")
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html)
 */
@CdkDslMarker
public class CfnProjectArtifactsPropertyDsl {
    private val cdkBuilder: CfnProject.ArtifactsProperty.Builder =
        CfnProject.ArtifactsProperty.builder()

    /**
     * @param artifactIdentifier An identifier for this artifact definition.
     */
    public fun artifactIdentifier(artifactIdentifier: String) {
        cdkBuilder.artifactIdentifier(artifactIdentifier)
    }

    /**
     * @param encryptionDisabled Set to true if you do not want your output artifacts encrypted.
     * This option is valid only if your artifacts type is Amazon Simple Storage Service (Amazon S3).
     * If this is set with another artifacts type, an `invalidInputException` is thrown.
     */
    public fun encryptionDisabled(encryptionDisabled: Boolean) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
    }

    /**
     * @param encryptionDisabled Set to true if you do not want your output artifacts encrypted.
     * This option is valid only if your artifacts type is Amazon Simple Storage Service (Amazon S3).
     * If this is set with another artifacts type, an `invalidInputException` is thrown.
     */
    public fun encryptionDisabled(encryptionDisabled: IResolvable) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
    }

    /**
     * @param location Information about the build output artifact location:.
     * * If `type` is set to `CODEPIPELINE` , AWS CodePipeline ignores this value if specified. This
     * is because CodePipeline manages its build output locations instead of CodeBuild .
     * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
     * output is produced.
     * * If `type` is set to `S3` , this is the name of the output bucket.
     *
     * If you specify `CODEPIPELINE` or `NO_ARTIFACTS` for the `Type` property, don't specify this
     * property. For all of the other types, you must specify this property.
     */
    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    /**
     * @param name Along with `path` and `namespaceType` , the pattern that AWS CodeBuild uses to name
     * and store the output artifact:.
     * * If `type` is set to `CODEPIPELINE` , AWS CodePipeline ignores this value if specified. This
     * is because CodePipeline manages its build output names instead of AWS CodeBuild .
     * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
     * output is produced.
     * * If `type` is set to `S3` , this is the name of the output artifact object. If you set the
     * name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.
     *
     * For example:
     *
     * * If `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and `name` is set
     * to `MyArtifact.zip` , then the output artifact is stored in `MyArtifacts/ *build-ID*
     * /MyArtifact.zip` .
     * * If `path` is empty, `namespaceType` is set to `NONE` , and `name` is set to " `/` ", the
     * output artifact is stored in the root of the output bucket.
     * * If `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and `name` is set
     * to " `/` ", the output artifact is stored in `MyArtifacts/ *build-ID*` .
     *
     * If you specify `CODEPIPELINE` or `NO_ARTIFACTS` for the `Type` property, don't specify this
     * property. For all of the other types, you must specify this property.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param namespaceType Along with `path` and `name` , the pattern that AWS CodeBuild uses to
     * determine the name and location to store the output artifact:  - If `type` is set to
     * `CODEPIPELINE` , CodePipeline ignores this value if specified.
     * This is because CodePipeline manages its build output names instead of AWS CodeBuild .
     *
     * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
     * output is produced.
     * * If `type` is set to `S3` , valid values include:
     * * `BUILD_ID` : Include the build ID in the location of the build output artifact.
     * * `NONE` : Do not include the build ID. This is the default if `namespaceType` is not
     * specified.
     *
     * For example, if `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and
     * `name` is set to `MyArtifact.zip` , the output artifact is stored in
     * `MyArtifacts/&lt;build-ID&gt;/MyArtifact.zip` .
     */
    public fun namespaceType(namespaceType: String) {
        cdkBuilder.namespaceType(namespaceType)
    }

    /**
     * @param overrideArtifactName If set to true a name specified in the buildspec file overrides the
     * artifact name.
     * The name specified in a buildspec file is calculated at build time and uses the Shell command
     * language. For example, you can append a date and time to your artifact name so that it is always
     * unique.
     */
    public fun overrideArtifactName(overrideArtifactName: Boolean) {
        cdkBuilder.overrideArtifactName(overrideArtifactName)
    }

    /**
     * @param overrideArtifactName If set to true a name specified in the buildspec file overrides the
     * artifact name.
     * The name specified in a buildspec file is calculated at build time and uses the Shell command
     * language. For example, you can append a date and time to your artifact name so that it is always
     * unique.
     */
    public fun overrideArtifactName(overrideArtifactName: IResolvable) {
        cdkBuilder.overrideArtifactName(overrideArtifactName)
    }

    /**
     * @param packaging The type of build output artifact to create:.
     * * If `type` is set to `CODEPIPELINE` , CodePipeline ignores this value if specified. This is
     * because CodePipeline manages its build output artifacts instead of AWS CodeBuild .
     * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
     * output is produced.
     * * If `type` is set to `S3` , valid values include:
     * * `NONE` : AWS CodeBuild creates in the output bucket a folder that contains the build output.
     * This is the default if `packaging` is not specified.
     * * `ZIP` : AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.
     */
    public fun packaging(packaging: String) {
        cdkBuilder.packaging(packaging)
    }

    /**
     * @param path Along with `namespaceType` and `name` , the pattern that AWS CodeBuild uses to name
     * and store the output artifact:.
     * * If `type` is set to `CODEPIPELINE` , CodePipeline ignores this value if specified. This is
     * because CodePipeline manages its build output names instead of AWS CodeBuild .
     * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
     * output is produced.
     * * If `type` is set to `S3` , this is the path to the output artifact. If `path` is not
     * specified, `path` is not used.
     *
     * For example, if `path` is set to `MyArtifacts` , `namespaceType` is set to `NONE` , and `name`
     * is set to `MyArtifact.zip` , the output artifact is stored in the output bucket at
     * `MyArtifacts/MyArtifact.zip` .
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param type The type of build output artifact. Valid values include:.
     * * `CODEPIPELINE` : The build project has build output generated through CodePipeline.
     *
     *
     * The `CODEPIPELINE` type is not supported for `secondaryArtifacts` .
     *
     *
     * * `NO_ARTIFACTS` : The build project does not produce any build output.
     * * `S3` : The build project stores build output in Amazon S3.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnProject.ArtifactsProperty = cdkBuilder.build()
}
