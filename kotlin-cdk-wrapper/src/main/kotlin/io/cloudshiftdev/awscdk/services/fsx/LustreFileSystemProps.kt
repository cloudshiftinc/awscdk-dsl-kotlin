@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties specific to the Lustre version of the FSx file system.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Vpc vpc;
 * Bucket bucket;
 * Map&lt;String, Object&gt; lustreConfiguration = Map.of(
 * "deploymentType", LustreDeploymentType.SCRATCH_2,
 * "exportPath", bucket.s3UrlForObject(),
 * "importPath", bucket.s3UrlForObject(),
 * "autoImportPolicy", LustreAutoImportPolicy.NEW_CHANGED_DELETED);
 * LustreFileSystem fs = LustreFileSystem.Builder.create(this, "FsxLustreFileSystem")
 * .vpc(vpc)
 * .vpcSubnet(vpc.getPrivateSubnets()[0])
 * .storageCapacityGiB(1200)
 * .lustreConfiguration(lustreConfiguration)
 * .build();
 * ```
 */
public interface LustreFileSystemProps : FileSystemProps {
  /**
   * Additional configuration for FSx specific to Lustre.
   */
  public fun lustreConfiguration(): LustreConfiguration

  /**
   * The subnet that the file system will be accessible from.
   */
  public fun vpcSubnet(): ISubnet

  /**
   * A builder for [LustreFileSystemProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backupId The ID of the backup.
     * Specifies the backup to use if you're creating a file system from an existing backup.
     */
    public fun backupId(backupId: String)

    /**
     * @param kmsKey The KMS key used for encryption to protect your data at rest.
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param lustreConfiguration Additional configuration for FSx specific to Lustre. 
     */
    public fun lustreConfiguration(lustreConfiguration: LustreConfiguration)

    /**
     * @param lustreConfiguration Additional configuration for FSx specific to Lustre. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("484ff5adcf314819d4010e533d3d3c48fb4c65de704598e532a2dc08170a462b")
    public fun lustreConfiguration(lustreConfiguration: LustreConfiguration.Builder.() -> Unit)

    /**
     * @param removalPolicy Policy to apply when the file system is removed from the stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param securityGroup Security Group to assign to this file system.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param storageCapacityGiB The storage capacity of the file system being created. 
     * For Windows file systems, valid values are 32 GiB to 65,536 GiB.
     * For SCRATCH_1 deployment types, valid values are 1,200, 2,400, 3,600, then continuing in
     * increments of 3,600 GiB.
     * For SCRATCH_2 and PERSISTENT_1 types, valid values are 1,200, 2,400, then continuing in
     * increments of 2,400 GiB.
     */
    public fun storageCapacityGiB(storageCapacityGiB: Number)

    /**
     * @param vpc The VPC to launch the file system in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnet The subnet that the file system will be accessible from. 
     */
    public fun vpcSubnet(vpcSubnet: ISubnet)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.LustreFileSystemProps.Builder =
        software.amazon.awscdk.services.fsx.LustreFileSystemProps.builder()

    /**
     * @param backupId The ID of the backup.
     * Specifies the backup to use if you're creating a file system from an existing backup.
     */
    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    /**
     * @param kmsKey The KMS key used for encryption to protect your data at rest.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    /**
     * @param lustreConfiguration Additional configuration for FSx specific to Lustre. 
     */
    override fun lustreConfiguration(lustreConfiguration: LustreConfiguration) {
      cdkBuilder.lustreConfiguration(lustreConfiguration.let(LustreConfiguration::unwrap))
    }

    /**
     * @param lustreConfiguration Additional configuration for FSx specific to Lustre. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("484ff5adcf314819d4010e533d3d3c48fb4c65de704598e532a2dc08170a462b")
    override fun lustreConfiguration(lustreConfiguration: LustreConfiguration.Builder.() -> Unit):
        Unit = lustreConfiguration(LustreConfiguration(lustreConfiguration))

    /**
     * @param removalPolicy Policy to apply when the file system is removed from the stack.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param securityGroup Security Group to assign to this file system.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param storageCapacityGiB The storage capacity of the file system being created. 
     * For Windows file systems, valid values are 32 GiB to 65,536 GiB.
     * For SCRATCH_1 deployment types, valid values are 1,200, 2,400, 3,600, then continuing in
     * increments of 3,600 GiB.
     * For SCRATCH_2 and PERSISTENT_1 types, valid values are 1,200, 2,400, then continuing in
     * increments of 2,400 GiB.
     */
    override fun storageCapacityGiB(storageCapacityGiB: Number) {
      cdkBuilder.storageCapacityGiB(storageCapacityGiB)
    }

    /**
     * @param vpc The VPC to launch the file system in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnet The subnet that the file system will be accessible from. 
     */
    override fun vpcSubnet(vpcSubnet: ISubnet) {
      cdkBuilder.vpcSubnet(vpcSubnet.let(ISubnet::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.fsx.LustreFileSystemProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.fsx.LustreFileSystemProps,
  ) : CdkObject(cdkObject), LustreFileSystemProps {
    /**
     * The ID of the backup.
     *
     * Specifies the backup to use if you're creating a file system from an existing backup.
     *
     * Default: - no backup will be used.
     */
    override fun backupId(): String? = unwrap(this).getBackupId()

    /**
     * The KMS key used for encryption to protect your data at rest.
     *
     * Default: - the aws/fsx default KMS key for the AWS account being deployed into.
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * Additional configuration for FSx specific to Lustre.
     */
    override fun lustreConfiguration(): LustreConfiguration =
        unwrap(this).getLustreConfiguration().let(LustreConfiguration::wrap)

    /**
     * Policy to apply when the file system is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Security Group to assign to this file system.
     *
     * Default: - creates new security group which allows all outbound traffic.
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * The storage capacity of the file system being created.
     *
     * For Windows file systems, valid values are 32 GiB to 65,536 GiB.
     * For SCRATCH_1 deployment types, valid values are 1,200, 2,400, 3,600, then continuing in
     * increments of 3,600 GiB.
     * For SCRATCH_2 and PERSISTENT_1 types, valid values are 1,200, 2,400, then continuing in
     * increments of 2,400 GiB.
     */
    override fun storageCapacityGiB(): Number = unwrap(this).getStorageCapacityGiB()

    /**
     * The VPC to launch the file system in.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * The subnet that the file system will be accessible from.
     */
    override fun vpcSubnet(): ISubnet = unwrap(this).getVpcSubnet().let(ISubnet::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LustreFileSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.LustreFileSystemProps):
        LustreFileSystemProps = CdkObjectWrappers.wrap(cdkObject) as? LustreFileSystemProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LustreFileSystemProps):
        software.amazon.awscdk.services.fsx.LustreFileSystemProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.fsx.LustreFileSystemProps
  }
}
