package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnConfiguredTableAssociationProps {
  /**
   * A unique identifier for the configured table to be associated to.
   *
   * Currently accepts a configured table ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableidentifier)
   */
  public fun configuredTableIdentifier(): String

  /**
   * A description of the configured table association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The unique ID for the membership this configured table association belongs to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-membershipidentifier)
   */
  public fun membershipIdentifier(): String

  /**
   * The name of the configured table association, in lowercase.
   *
   * The table is identified by this name when running protected queries against the underlying
   * data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-name)
   */
  public fun name(): String

  /**
   * The service will assume this role to access catalog metadata and query the table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-rolearn)
   */
  public fun roleArn(): String

  /**
   * An optional label that you can assign to a resource when you create it.
   *
   * Each tag consists of a key and an optional value, both of which you define. When you use
   * tagging, you can also use tag-based access control in IAM policies to control access to this
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnConfiguredTableAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuredTableIdentifier A unique identifier for the configured table to be
     * associated to. 
     * Currently accepts a configured table ID.
     */
    public fun configuredTableIdentifier(configuredTableIdentifier: String)

    /**
     * @param description A description of the configured table association.
     */
    public fun description(description: String)

    /**
     * @param membershipIdentifier The unique ID for the membership this configured table
     * association belongs to. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * @param name The name of the configured table association, in lowercase. 
     * The table is identified by this name when running protected queries against the underlying
     * data.
     */
    public fun name(name: String)

    /**
     * @param roleArn The service will assume this role to access catalog metadata and query the
     * table. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps.builder()

    /**
     * @param configuredTableIdentifier A unique identifier for the configured table to be
     * associated to. 
     * Currently accepts a configured table ID.
     */
    override fun configuredTableIdentifier(configuredTableIdentifier: String) {
      cdkBuilder.configuredTableIdentifier(configuredTableIdentifier)
    }

    /**
     * @param description A description of the configured table association.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param membershipIdentifier The unique ID for the membership this configured table
     * association belongs to. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * @param name The name of the configured table association, in lowercase. 
     * The table is identified by this name when running protected queries against the underlying
     * data.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The service will assume this role to access catalog metadata and query the
     * table. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps,
  ) : CdkObject(cdkObject), CfnConfiguredTableAssociationProps {
    /**
     * A unique identifier for the configured table to be associated to.
     *
     * Currently accepts a configured table ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableidentifier)
     */
    override fun configuredTableIdentifier(): String = unwrap(this).getConfiguredTableIdentifier()

    /**
     * A description of the configured table association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The unique ID for the membership this configured table association belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-membershipidentifier)
     */
    override fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

    /**
     * The name of the configured table association, in lowercase.
     *
     * The table is identified by this name when running protected queries against the underlying
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The service will assume this role to access catalog metadata and query the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfiguredTableAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps):
        CfnConfiguredTableAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfiguredTableAssociationProps):
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps
  }
}
