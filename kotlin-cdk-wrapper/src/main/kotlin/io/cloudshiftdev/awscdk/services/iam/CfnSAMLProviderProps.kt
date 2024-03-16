@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSAMLProvider`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * CfnSAMLProviderProps cfnSAMLProviderProps = CfnSAMLProviderProps.builder()
 * .samlMetadataDocument("samlMetadataDocument")
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html)
 */
public interface CfnSAMLProviderProps {
  /**
   * The name of the provider to create.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document
   * includes the issuer's name, expiration information, and keys that can be used to validate the SAML
   * authentication response (assertions) that are received from the IdP. You must generate the
   * metadata document using the identity management software that is used as your organization's IdP.
   *
   * For more information, see [About SAML 2.0-based
   * federation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html) in the
   * *IAM User Guide*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-samlmetadatadocument)
   */
  public fun samlMetadataDocument(): String

  /**
   * A list of tags that you want to attach to the new IAM SAML provider.
   *
   * Each tag consists of a key name and an associated value. For more information about tagging,
   * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
   * *IAM User Guide* .
   *
   *
   * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the
   * entire request fails and the resource is not created.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSAMLProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the provider to create.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun name(name: String)

    /**
     * @param samlMetadataDocument An XML document generated by an identity provider (IdP) that
     * supports SAML 2.0. The document includes the issuer's name, expiration information, and keys
     * that can be used to validate the SAML authentication response (assertions) that are received
     * from the IdP. You must generate the metadata document using the identity management software
     * that is used as your organization's IdP. 
     * For more information, see [About SAML 2.0-based
     * federation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html) in
     * the *IAM User Guide*
     */
    public fun samlMetadataDocument(samlMetadataDocument: String)

    /**
     * @param tags A list of tags that you want to attach to the new IAM SAML provider.
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags that you want to attach to the new IAM SAML provider.
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnSAMLProviderProps.Builder =
        software.amazon.awscdk.services.iam.CfnSAMLProviderProps.builder()

    /**
     * @param name The name of the provider to create.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param samlMetadataDocument An XML document generated by an identity provider (IdP) that
     * supports SAML 2.0. The document includes the issuer's name, expiration information, and keys
     * that can be used to validate the SAML authentication response (assertions) that are received
     * from the IdP. You must generate the metadata document using the identity management software
     * that is used as your organization's IdP. 
     * For more information, see [About SAML 2.0-based
     * federation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html) in
     * the *IAM User Guide*
     */
    override fun samlMetadataDocument(samlMetadataDocument: String) {
      cdkBuilder.samlMetadataDocument(samlMetadataDocument)
    }

    /**
     * @param tags A list of tags that you want to attach to the new IAM SAML provider.
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags that you want to attach to the new IAM SAML provider.
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnSAMLProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnSAMLProviderProps,
  ) : CdkObject(cdkObject), CfnSAMLProviderProps {
    /**
     * The name of the provider to create.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document
     * includes the issuer's name, expiration information, and keys that can be used to validate the
     * SAML authentication response (assertions) that are received from the IdP. You must generate the
     * metadata document using the identity management software that is used as your organization's
     * IdP.
     *
     * For more information, see [About SAML 2.0-based
     * federation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html) in
     * the *IAM User Guide*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-samlmetadatadocument)
     */
    override fun samlMetadataDocument(): String = unwrap(this).getSamlMetadataDocument()

    /**
     * A list of tags that you want to attach to the new IAM SAML provider.
     *
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-samlprovider.html#cfn-iam-samlprovider-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSAMLProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnSAMLProviderProps):
        CfnSAMLProviderProps = CdkObjectWrappers.wrap(cdkObject) as CfnSAMLProviderProps

    internal fun unwrap(wrapped: CfnSAMLProviderProps):
        software.amazon.awscdk.services.iam.CfnSAMLProviderProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.CfnSAMLProviderProps
  }
}
