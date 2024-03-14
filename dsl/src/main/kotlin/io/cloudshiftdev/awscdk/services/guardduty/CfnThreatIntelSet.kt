package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnThreatIntelSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.guardduty.CfnThreatIntelSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A Boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
   */
  public open fun activate(): Any? = unwrap(this).getActivate()

  /**
   * A Boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
   */
  public open fun activate(`value`: Boolean) {
    unwrap(this).setActivate(`value`)
  }

  /**
   * A Boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
   */
  public open fun activate(`value`: IResolvable) {
    unwrap(this).setActivate(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The unique ID of the detector of the GuardDuty account that you want to create a threatIntelSet
   * for.
   */
  public open fun detectorId(): String? = unwrap(this).getDetectorId()

  /**
   * The unique ID of the detector of the GuardDuty account that you want to create a threatIntelSet
   * for.
   */
  public open fun detectorId(`value`: String) {
    unwrap(this).setDetectorId(`value`)
  }

  /**
   * The format of the file that contains the ThreatIntelSet.
   */
  public open fun format(): String = unwrap(this).getFormat()

  /**
   * The format of the file that contains the ThreatIntelSet.
   */
  public open fun format(`value`: String) {
    unwrap(this).setFormat(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The URI of the file that contains the ThreatIntelSet.
   */
  public open fun location(): String = unwrap(this).getLocation()

  /**
   * The URI of the file that contains the ThreatIntelSet.
   */
  public open fun location(`value`: String) {
    unwrap(this).setLocation(`value`)
  }

  /**
   * A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity
   * that involves IP addresses included in this ThreatIntelSet.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity
   * that involves IP addresses included in this ThreatIntelSet.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to be added to a new threat list resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to be added to a new threat list resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to be added to a new threat list resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.guardduty.CfnThreatIntelSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A Boolean value that indicates whether GuardDuty is to start using the uploaded
     * ThreatIntelSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-activate)
     * @param activate A Boolean value that indicates whether GuardDuty is to start using the
     * uploaded ThreatIntelSet. 
     */
    public fun activate(activate: Boolean)

    /**
     * A Boolean value that indicates whether GuardDuty is to start using the uploaded
     * ThreatIntelSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-activate)
     * @param activate A Boolean value that indicates whether GuardDuty is to start using the
     * uploaded ThreatIntelSet. 
     */
    public fun activate(activate: IResolvable)

    /**
     * The unique ID of the detector of the GuardDuty account that you want to create a
     * threatIntelSet for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-detectorid)
     * @param detectorId The unique ID of the detector of the GuardDuty account that you want to
     * create a threatIntelSet for. 
     */
    public fun detectorId(detectorId: String)

    /**
     * The format of the file that contains the ThreatIntelSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-format)
     * @param format The format of the file that contains the ThreatIntelSet. 
     */
    public fun format(format: String)

    /**
     * The URI of the file that contains the ThreatIntelSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-location)
     * @param location The URI of the file that contains the ThreatIntelSet. 
     */
    public fun location(location: String)

    /**
     * A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity
     * that involves IP addresses included in this ThreatIntelSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-name)
     * @param name A user-friendly ThreatIntelSet name displayed in all findings that are generated
     * by activity that involves IP addresses included in this ThreatIntelSet. 
     */
    public fun name(name: String)

    /**
     * The tags to be added to a new threat list resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-tags)
     * @param tags The tags to be added to a new threat list resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to be added to a new threat list resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-tags)
     * @param tags The tags to be added to a new threat list resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnThreatIntelSet.Builder =
        software.amazon.awscdk.services.guardduty.CfnThreatIntelSet.Builder.create(scope, id)

    /**
     * A Boolean value that indicates whether GuardDuty is to start using the uploaded
     * ThreatIntelSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-activate)
     * @param activate A Boolean value that indicates whether GuardDuty is to start using the
     * uploaded ThreatIntelSet. 
     */
    override fun activate(activate: Boolean) {
      cdkBuilder.activate(activate)
    }

    /**
     * A Boolean value that indicates whether GuardDuty is to start using the uploaded
     * ThreatIntelSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-activate)
     * @param activate A Boolean value that indicates whether GuardDuty is to start using the
     * uploaded ThreatIntelSet. 
     */
    override fun activate(activate: IResolvable) {
      cdkBuilder.activate(activate.let(IResolvable::unwrap))
    }

    /**
     * The unique ID of the detector of the GuardDuty account that you want to create a
     * threatIntelSet for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-detectorid)
     * @param detectorId The unique ID of the detector of the GuardDuty account that you want to
     * create a threatIntelSet for. 
     */
    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    /**
     * The format of the file that contains the ThreatIntelSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-format)
     * @param format The format of the file that contains the ThreatIntelSet. 
     */
    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    /**
     * The URI of the file that contains the ThreatIntelSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-location)
     * @param location The URI of the file that contains the ThreatIntelSet. 
     */
    override fun location(location: String) {
      cdkBuilder.location(location)
    }

    /**
     * A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity
     * that involves IP addresses included in this ThreatIntelSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-name)
     * @param name A user-friendly ThreatIntelSet name displayed in all findings that are generated
     * by activity that involves IP addresses included in this ThreatIntelSet. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags to be added to a new threat list resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-tags)
     * @param tags The tags to be added to a new threat list resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to be added to a new threat list resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html#cfn-guardduty-threatintelset-tags)
     * @param tags The tags to be added to a new threat list resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnThreatIntelSet =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnThreatIntelSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnThreatIntelSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnThreatIntelSet):
        CfnThreatIntelSet = CfnThreatIntelSet(cdkObject)

    internal fun unwrap(wrapped: CfnThreatIntelSet):
        software.amazon.awscdk.services.guardduty.CfnThreatIntelSet = wrapped.cdkObject
  }
}
