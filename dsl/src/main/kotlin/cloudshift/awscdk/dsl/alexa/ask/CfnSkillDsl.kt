@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.alexa.ask

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.alexa.ask.CfnSkill
import software.constructs.Construct
import kotlin.String

/**
 * The `Alexa::ASK::Skill` resource creates an Alexa skill that enables customers to access new
 * abilities.
 *
 * For more information about developing a skill, see the  .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.alexa.ask.*;
 * Object manifest;
 * CfnSkill cfnSkill = CfnSkill.Builder.create(this, "MyCfnSkill")
 * .authenticationConfiguration(AuthenticationConfigurationProperty.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .refreshToken("refreshToken")
 * .build())
 * .skillPackage(SkillPackageProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * // the properties below are optional
 * .overrides(OverridesProperty.builder()
 * .manifest(manifest)
 * .build())
 * .s3BucketRole("s3BucketRole")
 * .s3ObjectVersion("s3ObjectVersion")
 * .build())
 * .vendorId("vendorId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html)
 */
@CdkDslMarker
public class CfnSkillDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnSkill.Builder = CfnSkill.Builder.create(scope, id)

    /**
     * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
     *
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-authenticationconfiguration)
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service.
     */
    public fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    /**
     * Login with Amazon (LWA) configuration used to authenticate with the Alexa service.
     *
     * Only Login with Amazon clients created through the  are supported. The client ID, client
     * secret, and refresh token are required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-authenticationconfiguration)
     * @param authenticationConfiguration Login with Amazon (LWA) configuration used to authenticate
     * with the Alexa service.
     */
    public fun authenticationConfiguration(authenticationConfiguration: CfnSkill.AuthenticationConfigurationProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    /**
     * Configuration for the skill package that contains the components of the Alexa skill.
     *
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update the
     * skill. For more information about the skill package format, see the  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-skillpackage)
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill.
     */
    public fun skillPackage(skillPackage: IResolvable) {
        cdkBuilder.skillPackage(skillPackage)
    }

    /**
     * Configuration for the skill package that contains the components of the Alexa skill.
     *
     * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update the
     * skill. For more information about the skill package format, see the  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-skillpackage)
     * @param skillPackage Configuration for the skill package that contains the components of the
     * Alexa skill.
     */
    public fun skillPackage(skillPackage: CfnSkill.SkillPackageProperty) {
        cdkBuilder.skillPackage(skillPackage)
    }

    /**
     * The vendor ID associated with the Amazon developer account that will host the skill.
     *
     * Details for retrieving the vendor ID are in  . The provided LWA credentials must be linked to
     * the developer account associated with this vendor ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ask-skill.html#cfn-ask-skill-vendorid)
     * @param vendorId The vendor ID associated with the Amazon developer account that will host the
     * skill.
     */
    public fun vendorId(vendorId: String) {
        cdkBuilder.vendorId(vendorId)
    }

    public fun build(): CfnSkill = cdkBuilder.build()
}
