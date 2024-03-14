package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class FargateProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.FargateProfile,
) : CloudshiftdevConstructsConstruct(cdkObject), ITaggable {
  /**
   * The full Amazon Resource Name (ARN) of the Fargate profile.
   */
  public open fun fargateProfileArn(): String = unwrap(this).getFargateProfileArn()

  /**
   * The name of the Fargate profile.
   */
  public open fun fargateProfileName(): String = unwrap(this).getFargateProfileName()

  /**
   * The pod execution role to use for pods that match the selectors in the Fargate profile.
   *
   * The pod execution role allows Fargate infrastructure to
   * register with your cluster as a node, and it provides read access to Amazon
   * ECR image repositories.
   */
  public open fun podExecutionRole(): IRole = unwrap(this).getPodExecutionRole().let(IRole::wrap)

  /**
   * Resource tags.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.FargateProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The EKS cluster to apply the Fargate profile to.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The EKS cluster to apply the Fargate profile to. 
     */
    public fun cluster(cluster: Cluster)

    /**
     * The name of the Fargate profile.
     *
     * Default: - generated
     *
     * @param fargateProfileName The name of the Fargate profile. 
     */
    public fun fargateProfileName(fargateProfileName: String)

    /**
     * The pod execution role to use for pods that match the selectors in the Fargate profile.
     *
     * The pod execution role allows Fargate infrastructure to
     * register with your cluster as a node, and it provides read access to Amazon
     * ECR image repositories.
     *
     * Default: - a role will be automatically created
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html)
     * @param podExecutionRole The pod execution role to use for pods that match the selectors in
     * the Fargate profile. 
     */
    public fun podExecutionRole(podExecutionRole: IRole)

    /**
     * The selectors to match for pods to use this Fargate profile.
     *
     * Each selector
     * must have an associated namespace. Optionally, you can also specify labels
     * for a namespace.
     *
     * At least one selector is required and you may specify up to five selectors.
     *
     * @param selectors The selectors to match for pods to use this Fargate profile. 
     */
    public fun selectors(selectors: List<Selector>)

    /**
     * The selectors to match for pods to use this Fargate profile.
     *
     * Each selector
     * must have an associated namespace. Optionally, you can also specify labels
     * for a namespace.
     *
     * At least one selector is required and you may specify up to five selectors.
     *
     * @param selectors The selectors to match for pods to use this Fargate profile. 
     */
    public fun selectors(vararg selectors: Selector)

    /**
     * Select which subnets to launch your pods into.
     *
     * At this time, pods running
     * on Fargate are not assigned public IP addresses, so only private subnets
     * (with no direct route to an Internet Gateway) are allowed.
     *
     * You must specify the VPC to customize the subnet selection
     *
     * Default: - all private subnets of the VPC are selected.
     *
     * @param subnetSelection Select which subnets to launch your pods into. 
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * Select which subnets to launch your pods into.
     *
     * At this time, pods running
     * on Fargate are not assigned public IP addresses, so only private subnets
     * (with no direct route to an Internet Gateway) are allowed.
     *
     * You must specify the VPC to customize the subnet selection
     *
     * Default: - all private subnets of the VPC are selected.
     *
     * @param subnetSelection Select which subnets to launch your pods into. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("964b86d8391ae05d92196e9d2077e0c2bc9560ddb541e530f5cf186af05d4cae")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * The VPC from which to select subnets to launch your pods into.
     *
     * By default, all private subnets are selected. You can customize this using
     * `subnetSelection`.
     *
     * Default: - all private subnets used by the EKS cluster
     *
     * @param vpc The VPC from which to select subnets to launch your pods into. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.FargateProfile.Builder =
        software.amazon.awscdk.services.eks.FargateProfile.Builder.create(scope, id)

    /**
     * The EKS cluster to apply the Fargate profile to.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The EKS cluster to apply the Fargate profile to. 
     */
    override fun cluster(cluster: Cluster) {
      cdkBuilder.cluster(cluster.let(Cluster::unwrap))
    }

    /**
     * The name of the Fargate profile.
     *
     * Default: - generated
     *
     * @param fargateProfileName The name of the Fargate profile. 
     */
    override fun fargateProfileName(fargateProfileName: String) {
      cdkBuilder.fargateProfileName(fargateProfileName)
    }

    /**
     * The pod execution role to use for pods that match the selectors in the Fargate profile.
     *
     * The pod execution role allows Fargate infrastructure to
     * register with your cluster as a node, and it provides read access to Amazon
     * ECR image repositories.
     *
     * Default: - a role will be automatically created
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html)
     * @param podExecutionRole The pod execution role to use for pods that match the selectors in
     * the Fargate profile. 
     */
    override fun podExecutionRole(podExecutionRole: IRole) {
      cdkBuilder.podExecutionRole(podExecutionRole.let(IRole::unwrap))
    }

    /**
     * The selectors to match for pods to use this Fargate profile.
     *
     * Each selector
     * must have an associated namespace. Optionally, you can also specify labels
     * for a namespace.
     *
     * At least one selector is required and you may specify up to five selectors.
     *
     * @param selectors The selectors to match for pods to use this Fargate profile. 
     */
    override fun selectors(selectors: List<Selector>) {
      cdkBuilder.selectors(selectors.map(Selector::unwrap))
    }

    /**
     * The selectors to match for pods to use this Fargate profile.
     *
     * Each selector
     * must have an associated namespace. Optionally, you can also specify labels
     * for a namespace.
     *
     * At least one selector is required and you may specify up to five selectors.
     *
     * @param selectors The selectors to match for pods to use this Fargate profile. 
     */
    override fun selectors(vararg selectors: Selector): Unit = selectors(selectors.toList())

    /**
     * Select which subnets to launch your pods into.
     *
     * At this time, pods running
     * on Fargate are not assigned public IP addresses, so only private subnets
     * (with no direct route to an Internet Gateway) are allowed.
     *
     * You must specify the VPC to customize the subnet selection
     *
     * Default: - all private subnets of the VPC are selected.
     *
     * @param subnetSelection Select which subnets to launch your pods into. 
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    /**
     * Select which subnets to launch your pods into.
     *
     * At this time, pods running
     * on Fargate are not assigned public IP addresses, so only private subnets
     * (with no direct route to an Internet Gateway) are allowed.
     *
     * You must specify the VPC to customize the subnet selection
     *
     * Default: - all private subnets of the VPC are selected.
     *
     * @param subnetSelection Select which subnets to launch your pods into. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("964b86d8391ae05d92196e9d2077e0c2bc9560ddb541e530f5cf186af05d4cae")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * The VPC from which to select subnets to launch your pods into.
     *
     * By default, all private subnets are selected. You can customize this using
     * `subnetSelection`.
     *
     * Default: - all private subnets used by the EKS cluster
     *
     * @param vpc The VPC from which to select subnets to launch your pods into. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.FargateProfile = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FargateProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FargateProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.FargateProfile): FargateProfile
        = FargateProfile(cdkObject)

    internal fun unwrap(wrapped: FargateProfile): software.amazon.awscdk.services.eks.FargateProfile
        = wrapped.cdkObject
  }
}
