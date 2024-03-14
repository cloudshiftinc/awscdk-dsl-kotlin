package io.cloudshiftdev.awscdk.services.inspectorv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFilter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun filterAction(): String = unwrap(this).getFilterAction()

  public open fun filterAction(`value`: String) {
    unwrap(this).setFilterAction(`value`)
  }

  public open fun filterCriteria(): Any = unwrap(this).getFilterCriteria()

  public open fun filterCriteria(`value`: IResolvable) {
    unwrap(this).setFilterCriteria(`value`.let(IResolvable::unwrap))
  }

  public open fun filterCriteria(`value`: FilterCriteriaProperty) {
    unwrap(this).setFilterCriteria(`value`.let(FilterCriteriaProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("41cc6a6ce31e8508d155dca5666682632b24e1e61f7240c349164ebb1d7035be")
  public open fun filterCriteria(`value`: FilterCriteriaProperty.Builder.() -> Unit): Unit =
      filterCriteria(FilterCriteriaProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun filterAction(filterAction: String) {
    }

    public fun filterCriteria(filterCriteria: IResolvable) {
    }

    public fun filterCriteria(filterCriteria: FilterCriteriaProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08f854474ba06437298904554fca2e2184655e6e921c8d82158da279150a1794")
    public fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.inspectorv2.CfnFilter.Builder =
        software.amazon.awscdk.services.inspectorv2.CfnFilter.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun filterAction(filterAction: String) {
      cdkBuilder.filterAction(filterAction)
    }

    public override fun filterCriteria(filterCriteria: IResolvable) {
      cdkBuilder.filterCriteria(filterCriteria.let(IResolvable::unwrap))
    }

    public override fun filterCriteria(filterCriteria: FilterCriteriaProperty) {
      cdkBuilder.filterCriteria(filterCriteria.let(FilterCriteriaProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08f854474ba06437298904554fca2e2184655e6e921c8d82158da279150a1794")
    public override fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit):
        Unit = filterCriteria(FilterCriteriaProperty(filterCriteria))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilter = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter): CfnFilter =
        CfnFilter(cdkObject)

    internal fun unwrap(wrapped: CfnFilter): software.amazon.awscdk.services.inspectorv2.CfnFilter =
        wrapped.cdkObject
  }

  public interface NumberFilterProperty {
    public fun lowerInclusive(): Number? = unwrap(this).getLowerInclusive()

    public fun upperInclusive(): Number? = unwrap(this).getUpperInclusive()

    public interface Builder {
      public fun lowerInclusive(lowerInclusive: Number) {
      }

      public fun upperInclusive(upperInclusive: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty.builder()

      public override fun lowerInclusive(lowerInclusive: Number) {
        cdkBuilder.lowerInclusive(lowerInclusive)
      }

      public override fun upperInclusive(upperInclusive: Number) {
        cdkBuilder.upperInclusive(upperInclusive)
      }

      public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty,
    ) : NumberFilterProperty {
      public override fun lowerInclusive(): Number? = unwrap(this).getLowerInclusive()

      public override fun upperInclusive(): Number? = unwrap(this).getUpperInclusive()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NumberFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty):
          NumberFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NumberFilterProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.NumberFilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FilterCriteriaProperty {
    public fun awsAccountId(): Any? = unwrap(this).getAwsAccountId()

    public fun componentId(): Any? = unwrap(this).getComponentId()

    public fun componentType(): Any? = unwrap(this).getComponentType()

    public fun ec2InstanceImageId(): Any? = unwrap(this).getEc2InstanceImageId()

    public fun ec2InstanceSubnetId(): Any? = unwrap(this).getEc2InstanceSubnetId()

    public fun ec2InstanceVpcId(): Any? = unwrap(this).getEc2InstanceVpcId()

    public fun ecrImageArchitecture(): Any? = unwrap(this).getEcrImageArchitecture()

    public fun ecrImageHash(): Any? = unwrap(this).getEcrImageHash()

    public fun ecrImagePushedAt(): Any? = unwrap(this).getEcrImagePushedAt()

    public fun ecrImageRegistry(): Any? = unwrap(this).getEcrImageRegistry()

    public fun ecrImageRepositoryName(): Any? = unwrap(this).getEcrImageRepositoryName()

    public fun ecrImageTags(): Any? = unwrap(this).getEcrImageTags()

    public fun findingArn(): Any? = unwrap(this).getFindingArn()

    public fun findingStatus(): Any? = unwrap(this).getFindingStatus()

    public fun findingType(): Any? = unwrap(this).getFindingType()

    public fun firstObservedAt(): Any? = unwrap(this).getFirstObservedAt()

    public fun inspectorScore(): Any? = unwrap(this).getInspectorScore()

    public fun lastObservedAt(): Any? = unwrap(this).getLastObservedAt()

    public fun networkProtocol(): Any? = unwrap(this).getNetworkProtocol()

    public fun portRange(): Any? = unwrap(this).getPortRange()

    public fun relatedVulnerabilities(): Any? = unwrap(this).getRelatedVulnerabilities()

    public fun resourceId(): Any? = unwrap(this).getResourceId()

    public fun resourceTags(): Any? = unwrap(this).getResourceTags()

    public fun resourceType(): Any? = unwrap(this).getResourceType()

    public fun severity(): Any? = unwrap(this).getSeverity()

    public fun title(): Any? = unwrap(this).getTitle()

    public fun updatedAt(): Any? = unwrap(this).getUpdatedAt()

    public fun vendorSeverity(): Any? = unwrap(this).getVendorSeverity()

    public fun vulnerabilityId(): Any? = unwrap(this).getVulnerabilityId()

    public fun vulnerabilitySource(): Any? = unwrap(this).getVulnerabilitySource()

    public fun vulnerablePackages(): Any? = unwrap(this).getVulnerablePackages()

    public interface Builder {
      public fun awsAccountId(awsAccountId: IResolvable) {
      }

      public fun awsAccountId(awsAccountId: List<Any>) {
      }

      public fun componentId(componentId: IResolvable) {
      }

      public fun componentId(componentId: List<Any>) {
      }

      public fun componentType(componentType: IResolvable) {
      }

      public fun componentType(componentType: List<Any>) {
      }

      public fun ec2InstanceImageId(ec2InstanceImageId: IResolvable) {
      }

      public fun ec2InstanceImageId(ec2InstanceImageId: List<Any>) {
      }

      public fun ec2InstanceSubnetId(ec2InstanceSubnetId: IResolvable) {
      }

      public fun ec2InstanceSubnetId(ec2InstanceSubnetId: List<Any>) {
      }

      public fun ec2InstanceVpcId(ec2InstanceVpcId: IResolvable) {
      }

      public fun ec2InstanceVpcId(ec2InstanceVpcId: List<Any>) {
      }

      public fun ecrImageArchitecture(ecrImageArchitecture: IResolvable) {
      }

      public fun ecrImageArchitecture(ecrImageArchitecture: List<Any>) {
      }

      public fun ecrImageHash(ecrImageHash: IResolvable) {
      }

      public fun ecrImageHash(ecrImageHash: List<Any>) {
      }

      public fun ecrImagePushedAt(ecrImagePushedAt: IResolvable) {
      }

      public fun ecrImagePushedAt(ecrImagePushedAt: List<Any>) {
      }

      public fun ecrImageRegistry(ecrImageRegistry: IResolvable) {
      }

      public fun ecrImageRegistry(ecrImageRegistry: List<Any>) {
      }

      public fun ecrImageRepositoryName(ecrImageRepositoryName: IResolvable) {
      }

      public fun ecrImageRepositoryName(ecrImageRepositoryName: List<Any>) {
      }

      public fun ecrImageTags(ecrImageTags: IResolvable) {
      }

      public fun ecrImageTags(ecrImageTags: List<Any>) {
      }

      public fun findingArn(findingArn: IResolvable) {
      }

      public fun findingArn(findingArn: List<Any>) {
      }

      public fun findingStatus(findingStatus: IResolvable) {
      }

      public fun findingStatus(findingStatus: List<Any>) {
      }

      public fun findingType(findingType: IResolvable) {
      }

      public fun findingType(findingType: List<Any>) {
      }

      public fun firstObservedAt(firstObservedAt: IResolvable) {
      }

      public fun firstObservedAt(firstObservedAt: List<Any>) {
      }

      public fun inspectorScore(inspectorScore: IResolvable) {
      }

      public fun inspectorScore(inspectorScore: List<Any>) {
      }

      public fun lastObservedAt(lastObservedAt: IResolvable) {
      }

      public fun lastObservedAt(lastObservedAt: List<Any>) {
      }

      public fun networkProtocol(networkProtocol: IResolvable) {
      }

      public fun networkProtocol(networkProtocol: List<Any>) {
      }

      public fun portRange(portRange: IResolvable) {
      }

      public fun portRange(portRange: List<Any>) {
      }

      public fun relatedVulnerabilities(relatedVulnerabilities: IResolvable) {
      }

      public fun relatedVulnerabilities(relatedVulnerabilities: List<Any>) {
      }

      public fun resourceId(resourceId: IResolvable) {
      }

      public fun resourceId(resourceId: List<Any>) {
      }

      public fun resourceTags(resourceTags: IResolvable) {
      }

      public fun resourceTags(resourceTags: List<Any>) {
      }

      public fun resourceType(resourceType: IResolvable) {
      }

      public fun resourceType(resourceType: List<Any>) {
      }

      public fun severity(severity: IResolvable) {
      }

      public fun severity(severity: List<Any>) {
      }

      public fun title(title: IResolvable) {
      }

      public fun title(title: List<Any>) {
      }

      public fun updatedAt(updatedAt: IResolvable) {
      }

      public fun updatedAt(updatedAt: List<Any>) {
      }

      public fun vendorSeverity(vendorSeverity: IResolvable) {
      }

      public fun vendorSeverity(vendorSeverity: List<Any>) {
      }

      public fun vulnerabilityId(vulnerabilityId: IResolvable) {
      }

      public fun vulnerabilityId(vulnerabilityId: List<Any>) {
      }

      public fun vulnerabilitySource(vulnerabilitySource: IResolvable) {
      }

      public fun vulnerabilitySource(vulnerabilitySource: List<Any>) {
      }

      public fun vulnerablePackages(vulnerablePackages: IResolvable) {
      }

      public fun vulnerablePackages(vulnerablePackages: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty.builder()

      public override fun awsAccountId(awsAccountId: IResolvable) {
        cdkBuilder.awsAccountId(awsAccountId.let(IResolvable::unwrap))
      }

      public override fun awsAccountId(awsAccountId: List<Any>) {
        cdkBuilder.awsAccountId(awsAccountId)
      }

      public override fun componentId(componentId: IResolvable) {
        cdkBuilder.componentId(componentId.let(IResolvable::unwrap))
      }

      public override fun componentId(componentId: List<Any>) {
        cdkBuilder.componentId(componentId)
      }

      public override fun componentType(componentType: IResolvable) {
        cdkBuilder.componentType(componentType.let(IResolvable::unwrap))
      }

      public override fun componentType(componentType: List<Any>) {
        cdkBuilder.componentType(componentType)
      }

      public override fun ec2InstanceImageId(ec2InstanceImageId: IResolvable) {
        cdkBuilder.ec2InstanceImageId(ec2InstanceImageId.let(IResolvable::unwrap))
      }

      public override fun ec2InstanceImageId(ec2InstanceImageId: List<Any>) {
        cdkBuilder.ec2InstanceImageId(ec2InstanceImageId)
      }

      public override fun ec2InstanceSubnetId(ec2InstanceSubnetId: IResolvable) {
        cdkBuilder.ec2InstanceSubnetId(ec2InstanceSubnetId.let(IResolvable::unwrap))
      }

      public override fun ec2InstanceSubnetId(ec2InstanceSubnetId: List<Any>) {
        cdkBuilder.ec2InstanceSubnetId(ec2InstanceSubnetId)
      }

      public override fun ec2InstanceVpcId(ec2InstanceVpcId: IResolvable) {
        cdkBuilder.ec2InstanceVpcId(ec2InstanceVpcId.let(IResolvable::unwrap))
      }

      public override fun ec2InstanceVpcId(ec2InstanceVpcId: List<Any>) {
        cdkBuilder.ec2InstanceVpcId(ec2InstanceVpcId)
      }

      public override fun ecrImageArchitecture(ecrImageArchitecture: IResolvable) {
        cdkBuilder.ecrImageArchitecture(ecrImageArchitecture.let(IResolvable::unwrap))
      }

      public override fun ecrImageArchitecture(ecrImageArchitecture: List<Any>) {
        cdkBuilder.ecrImageArchitecture(ecrImageArchitecture)
      }

      public override fun ecrImageHash(ecrImageHash: IResolvable) {
        cdkBuilder.ecrImageHash(ecrImageHash.let(IResolvable::unwrap))
      }

      public override fun ecrImageHash(ecrImageHash: List<Any>) {
        cdkBuilder.ecrImageHash(ecrImageHash)
      }

      public override fun ecrImagePushedAt(ecrImagePushedAt: IResolvable) {
        cdkBuilder.ecrImagePushedAt(ecrImagePushedAt.let(IResolvable::unwrap))
      }

      public override fun ecrImagePushedAt(ecrImagePushedAt: List<Any>) {
        cdkBuilder.ecrImagePushedAt(ecrImagePushedAt)
      }

      public override fun ecrImageRegistry(ecrImageRegistry: IResolvable) {
        cdkBuilder.ecrImageRegistry(ecrImageRegistry.let(IResolvable::unwrap))
      }

      public override fun ecrImageRegistry(ecrImageRegistry: List<Any>) {
        cdkBuilder.ecrImageRegistry(ecrImageRegistry)
      }

      public override fun ecrImageRepositoryName(ecrImageRepositoryName: IResolvable) {
        cdkBuilder.ecrImageRepositoryName(ecrImageRepositoryName.let(IResolvable::unwrap))
      }

      public override fun ecrImageRepositoryName(ecrImageRepositoryName: List<Any>) {
        cdkBuilder.ecrImageRepositoryName(ecrImageRepositoryName)
      }

      public override fun ecrImageTags(ecrImageTags: IResolvable) {
        cdkBuilder.ecrImageTags(ecrImageTags.let(IResolvable::unwrap))
      }

      public override fun ecrImageTags(ecrImageTags: List<Any>) {
        cdkBuilder.ecrImageTags(ecrImageTags)
      }

      public override fun findingArn(findingArn: IResolvable) {
        cdkBuilder.findingArn(findingArn.let(IResolvable::unwrap))
      }

      public override fun findingArn(findingArn: List<Any>) {
        cdkBuilder.findingArn(findingArn)
      }

      public override fun findingStatus(findingStatus: IResolvable) {
        cdkBuilder.findingStatus(findingStatus.let(IResolvable::unwrap))
      }

      public override fun findingStatus(findingStatus: List<Any>) {
        cdkBuilder.findingStatus(findingStatus)
      }

      public override fun findingType(findingType: IResolvable) {
        cdkBuilder.findingType(findingType.let(IResolvable::unwrap))
      }

      public override fun findingType(findingType: List<Any>) {
        cdkBuilder.findingType(findingType)
      }

      public override fun firstObservedAt(firstObservedAt: IResolvable) {
        cdkBuilder.firstObservedAt(firstObservedAt.let(IResolvable::unwrap))
      }

      public override fun firstObservedAt(firstObservedAt: List<Any>) {
        cdkBuilder.firstObservedAt(firstObservedAt)
      }

      public override fun inspectorScore(inspectorScore: IResolvable) {
        cdkBuilder.inspectorScore(inspectorScore.let(IResolvable::unwrap))
      }

      public override fun inspectorScore(inspectorScore: List<Any>) {
        cdkBuilder.inspectorScore(inspectorScore)
      }

      public override fun lastObservedAt(lastObservedAt: IResolvable) {
        cdkBuilder.lastObservedAt(lastObservedAt.let(IResolvable::unwrap))
      }

      public override fun lastObservedAt(lastObservedAt: List<Any>) {
        cdkBuilder.lastObservedAt(lastObservedAt)
      }

      public override fun networkProtocol(networkProtocol: IResolvable) {
        cdkBuilder.networkProtocol(networkProtocol.let(IResolvable::unwrap))
      }

      public override fun networkProtocol(networkProtocol: List<Any>) {
        cdkBuilder.networkProtocol(networkProtocol)
      }

      public override fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange.let(IResolvable::unwrap))
      }

      public override fun portRange(portRange: List<Any>) {
        cdkBuilder.portRange(portRange)
      }

      public override fun relatedVulnerabilities(relatedVulnerabilities: IResolvable) {
        cdkBuilder.relatedVulnerabilities(relatedVulnerabilities.let(IResolvable::unwrap))
      }

      public override fun relatedVulnerabilities(relatedVulnerabilities: List<Any>) {
        cdkBuilder.relatedVulnerabilities(relatedVulnerabilities)
      }

      public override fun resourceId(resourceId: IResolvable) {
        cdkBuilder.resourceId(resourceId.let(IResolvable::unwrap))
      }

      public override fun resourceId(resourceId: List<Any>) {
        cdkBuilder.resourceId(resourceId)
      }

      public override fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
      }

      public override fun resourceTags(resourceTags: List<Any>) {
        cdkBuilder.resourceTags(resourceTags)
      }

      public override fun resourceType(resourceType: IResolvable) {
        cdkBuilder.resourceType(resourceType.let(IResolvable::unwrap))
      }

      public override fun resourceType(resourceType: List<Any>) {
        cdkBuilder.resourceType(resourceType)
      }

      public override fun severity(severity: IResolvable) {
        cdkBuilder.severity(severity.let(IResolvable::unwrap))
      }

      public override fun severity(severity: List<Any>) {
        cdkBuilder.severity(severity)
      }

      public override fun title(title: IResolvable) {
        cdkBuilder.title(title.let(IResolvable::unwrap))
      }

      public override fun title(title: List<Any>) {
        cdkBuilder.title(title)
      }

      public override fun updatedAt(updatedAt: IResolvable) {
        cdkBuilder.updatedAt(updatedAt.let(IResolvable::unwrap))
      }

      public override fun updatedAt(updatedAt: List<Any>) {
        cdkBuilder.updatedAt(updatedAt)
      }

      public override fun vendorSeverity(vendorSeverity: IResolvable) {
        cdkBuilder.vendorSeverity(vendorSeverity.let(IResolvable::unwrap))
      }

      public override fun vendorSeverity(vendorSeverity: List<Any>) {
        cdkBuilder.vendorSeverity(vendorSeverity)
      }

      public override fun vulnerabilityId(vulnerabilityId: IResolvable) {
        cdkBuilder.vulnerabilityId(vulnerabilityId.let(IResolvable::unwrap))
      }

      public override fun vulnerabilityId(vulnerabilityId: List<Any>) {
        cdkBuilder.vulnerabilityId(vulnerabilityId)
      }

      public override fun vulnerabilitySource(vulnerabilitySource: IResolvable) {
        cdkBuilder.vulnerabilitySource(vulnerabilitySource.let(IResolvable::unwrap))
      }

      public override fun vulnerabilitySource(vulnerabilitySource: List<Any>) {
        cdkBuilder.vulnerabilitySource(vulnerabilitySource)
      }

      public override fun vulnerablePackages(vulnerablePackages: IResolvable) {
        cdkBuilder.vulnerablePackages(vulnerablePackages.let(IResolvable::unwrap))
      }

      public override fun vulnerablePackages(vulnerablePackages: List<Any>) {
        cdkBuilder.vulnerablePackages(vulnerablePackages)
      }

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty,
    ) : FilterCriteriaProperty {
      public override fun awsAccountId(): Any? = unwrap(this).getAwsAccountId()

      public override fun componentId(): Any? = unwrap(this).getComponentId()

      public override fun componentType(): Any? = unwrap(this).getComponentType()

      public override fun ec2InstanceImageId(): Any? = unwrap(this).getEc2InstanceImageId()

      public override fun ec2InstanceSubnetId(): Any? = unwrap(this).getEc2InstanceSubnetId()

      public override fun ec2InstanceVpcId(): Any? = unwrap(this).getEc2InstanceVpcId()

      public override fun ecrImageArchitecture(): Any? = unwrap(this).getEcrImageArchitecture()

      public override fun ecrImageHash(): Any? = unwrap(this).getEcrImageHash()

      public override fun ecrImagePushedAt(): Any? = unwrap(this).getEcrImagePushedAt()

      public override fun ecrImageRegistry(): Any? = unwrap(this).getEcrImageRegistry()

      public override fun ecrImageRepositoryName(): Any? = unwrap(this).getEcrImageRepositoryName()

      public override fun ecrImageTags(): Any? = unwrap(this).getEcrImageTags()

      public override fun findingArn(): Any? = unwrap(this).getFindingArn()

      public override fun findingStatus(): Any? = unwrap(this).getFindingStatus()

      public override fun findingType(): Any? = unwrap(this).getFindingType()

      public override fun firstObservedAt(): Any? = unwrap(this).getFirstObservedAt()

      public override fun inspectorScore(): Any? = unwrap(this).getInspectorScore()

      public override fun lastObservedAt(): Any? = unwrap(this).getLastObservedAt()

      public override fun networkProtocol(): Any? = unwrap(this).getNetworkProtocol()

      public override fun portRange(): Any? = unwrap(this).getPortRange()

      public override fun relatedVulnerabilities(): Any? = unwrap(this).getRelatedVulnerabilities()

      public override fun resourceId(): Any? = unwrap(this).getResourceId()

      public override fun resourceTags(): Any? = unwrap(this).getResourceTags()

      public override fun resourceType(): Any? = unwrap(this).getResourceType()

      public override fun severity(): Any? = unwrap(this).getSeverity()

      public override fun title(): Any? = unwrap(this).getTitle()

      public override fun updatedAt(): Any? = unwrap(this).getUpdatedAt()

      public override fun vendorSeverity(): Any? = unwrap(this).getVendorSeverity()

      public override fun vulnerabilityId(): Any? = unwrap(this).getVulnerabilityId()

      public override fun vulnerabilitySource(): Any? = unwrap(this).getVulnerabilitySource()

      public override fun vulnerablePackages(): Any? = unwrap(this).getVulnerablePackages()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty):
          FilterCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterCriteriaProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.FilterCriteriaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DateFilterProperty {
    public fun endInclusive(): Number? = unwrap(this).getEndInclusive()

    public fun startInclusive(): Number? = unwrap(this).getStartInclusive()

    public interface Builder {
      public fun endInclusive(endInclusive: Number) {
      }

      public fun startInclusive(startInclusive: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty.builder()

      public override fun endInclusive(endInclusive: Number) {
        cdkBuilder.endInclusive(endInclusive)
      }

      public override fun startInclusive(startInclusive: Number) {
        cdkBuilder.startInclusive(startInclusive)
      }

      public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty,
    ) : DateFilterProperty {
      public override fun endInclusive(): Number? = unwrap(this).getEndInclusive()

      public override fun startInclusive(): Number? = unwrap(this).getStartInclusive()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DateFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty):
          DateFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateFilterProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.DateFilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PackageFilterProperty {
    public fun architecture(): Any? = unwrap(this).getArchitecture()

    public fun epoch(): Any? = unwrap(this).getEpoch()

    public fun name(): Any? = unwrap(this).getName()

    public fun release(): Any? = unwrap(this).getRelease()

    public fun sourceLayerHash(): Any? = unwrap(this).getSourceLayerHash()

    public fun version(): Any? = unwrap(this).getVersion()

    public interface Builder {
      public fun architecture(architecture: IResolvable) {
      }

      public fun architecture(architecture: StringFilterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e41e0efcde2fee5e85dcca2dd10dd1f812ef4c3256616a41e1439ad4dbe06369")
      public fun architecture(architecture: StringFilterProperty.Builder.() -> Unit) {
      }

      public fun epoch(epoch: IResolvable) {
      }

      public fun epoch(epoch: NumberFilterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91a37ef05a7394d45e35142d71d779861fb1367645df5ef0d2a865d0dcb7cb64")
      public fun epoch(epoch: NumberFilterProperty.Builder.() -> Unit) {
      }

      public fun name(name: IResolvable) {
      }

      public fun name(name: StringFilterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c4a1ddf4552f0bed377ff0fe7710c1286653bc5a382a2e2bd32d52bf0334e58a")
      public fun name(name: StringFilterProperty.Builder.() -> Unit) {
      }

      public fun release(release: IResolvable) {
      }

      public fun release(release: StringFilterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9fd74b0bc06670d4201aff5c055291fda7425f666b5a97083937fb9668c0d8c")
      public fun release(release: StringFilterProperty.Builder.() -> Unit) {
      }

      public fun sourceLayerHash(sourceLayerHash: IResolvable) {
      }

      public fun sourceLayerHash(sourceLayerHash: StringFilterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("098e3d951d4bdc7c46fccdcee88664e4e900a0284195fe680536266cf4f89e98")
      public fun sourceLayerHash(sourceLayerHash: StringFilterProperty.Builder.() -> Unit) {
      }

      public fun version(version: IResolvable) {
      }

      public fun version(version: StringFilterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7225fb18487ca5a2f0a0ac71bedf4bc41c3609f81185b01c540d7d54ce379c04")
      public fun version(version: StringFilterProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty.builder()

      public override fun architecture(architecture: IResolvable) {
        cdkBuilder.architecture(architecture.let(IResolvable::unwrap))
      }

      public override fun architecture(architecture: StringFilterProperty) {
        cdkBuilder.architecture(architecture.let(StringFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e41e0efcde2fee5e85dcca2dd10dd1f812ef4c3256616a41e1439ad4dbe06369")
      public override fun architecture(architecture: StringFilterProperty.Builder.() -> Unit): Unit
          = architecture(StringFilterProperty(architecture))

      public override fun epoch(epoch: IResolvable) {
        cdkBuilder.epoch(epoch.let(IResolvable::unwrap))
      }

      public override fun epoch(epoch: NumberFilterProperty) {
        cdkBuilder.epoch(epoch.let(NumberFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91a37ef05a7394d45e35142d71d779861fb1367645df5ef0d2a865d0dcb7cb64")
      public override fun epoch(epoch: NumberFilterProperty.Builder.() -> Unit): Unit =
          epoch(NumberFilterProperty(epoch))

      public override fun name(name: IResolvable) {
        cdkBuilder.name(name.let(IResolvable::unwrap))
      }

      public override fun name(name: StringFilterProperty) {
        cdkBuilder.name(name.let(StringFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c4a1ddf4552f0bed377ff0fe7710c1286653bc5a382a2e2bd32d52bf0334e58a")
      public override fun name(name: StringFilterProperty.Builder.() -> Unit): Unit =
          name(StringFilterProperty(name))

      public override fun release(release: IResolvable) {
        cdkBuilder.release(release.let(IResolvable::unwrap))
      }

      public override fun release(release: StringFilterProperty) {
        cdkBuilder.release(release.let(StringFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9fd74b0bc06670d4201aff5c055291fda7425f666b5a97083937fb9668c0d8c")
      public override fun release(release: StringFilterProperty.Builder.() -> Unit): Unit =
          release(StringFilterProperty(release))

      public override fun sourceLayerHash(sourceLayerHash: IResolvable) {
        cdkBuilder.sourceLayerHash(sourceLayerHash.let(IResolvable::unwrap))
      }

      public override fun sourceLayerHash(sourceLayerHash: StringFilterProperty) {
        cdkBuilder.sourceLayerHash(sourceLayerHash.let(StringFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("098e3d951d4bdc7c46fccdcee88664e4e900a0284195fe680536266cf4f89e98")
      public override fun sourceLayerHash(sourceLayerHash: StringFilterProperty.Builder.() -> Unit):
          Unit = sourceLayerHash(StringFilterProperty(sourceLayerHash))

      public override fun version(version: IResolvable) {
        cdkBuilder.version(version.let(IResolvable::unwrap))
      }

      public override fun version(version: StringFilterProperty) {
        cdkBuilder.version(version.let(StringFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7225fb18487ca5a2f0a0ac71bedf4bc41c3609f81185b01c540d7d54ce379c04")
      public override fun version(version: StringFilterProperty.Builder.() -> Unit): Unit =
          version(StringFilterProperty(version))

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty,
    ) : PackageFilterProperty {
      public override fun architecture(): Any? = unwrap(this).getArchitecture()

      public override fun epoch(): Any? = unwrap(this).getEpoch()

      public override fun name(): Any? = unwrap(this).getName()

      public override fun release(): Any? = unwrap(this).getRelease()

      public override fun sourceLayerHash(): Any? = unwrap(this).getSourceLayerHash()

      public override fun version(): Any? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PackageFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty):
          PackageFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PackageFilterProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PackageFilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PortRangeFilterProperty {
    public fun beginInclusive(): Number? = unwrap(this).getBeginInclusive()

    public fun endInclusive(): Number? = unwrap(this).getEndInclusive()

    public interface Builder {
      public fun beginInclusive(beginInclusive: Number) {
      }

      public fun endInclusive(endInclusive: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty.builder()

      public override fun beginInclusive(beginInclusive: Number) {
        cdkBuilder.beginInclusive(beginInclusive)
      }

      public override fun endInclusive(endInclusive: Number) {
        cdkBuilder.endInclusive(endInclusive)
      }

      public fun build():
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty,
    ) : PortRangeFilterProperty {
      public override fun beginInclusive(): Number? = unwrap(this).getBeginInclusive()

      public override fun endInclusive(): Number? = unwrap(this).getEndInclusive()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PortRangeFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty):
          PortRangeFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortRangeFilterProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.PortRangeFilterProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface StringFilterProperty {
    public fun comparison(): String

    public fun `value`(): String

    public interface Builder {
      public fun comparison(comparison: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty.builder()

      public override fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty,
    ) : StringFilterProperty {
      public override fun comparison(): String = unwrap(this).getComparison()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StringFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty):
          StringFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StringFilterProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.StringFilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MapFilterProperty {
    public fun comparison(): String

    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun comparison(comparison: String) {
      }

      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty.Builder =
          software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty.builder()

      public override fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
      }

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty,
    ) : MapFilterProperty {
      public override fun comparison(): String = unwrap(this).getComparison()

      public override fun key(): String? = unwrap(this).getKey()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MapFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty):
          MapFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MapFilterProperty):
          software.amazon.awscdk.services.inspectorv2.CfnFilter.MapFilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
