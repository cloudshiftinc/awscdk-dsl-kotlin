package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnMountTargetProps {
  /**
   * The ID of the file system for which to create the mount target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid)
   */
  public fun fileSystemId(): String

  /**
   * Valid IPv4 address within the address range of the specified subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress)
   */
  public fun ipAddress(): String? = unwrap(this).getIpAddress()

  /**
   * Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
   *
   * These must be for the same VPC as subnet specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
   */
  public fun securityGroups(): List<String>

  /**
   * The ID of the subnet to add the mount target in.
   *
   * For One Zone file systems, use the subnet that is associated with the file system's
   * Availability Zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid)
   */
  public fun subnetId(): String

  /**
   * A builder for [CfnMountTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fileSystemId The ID of the file system for which to create the mount target. 
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * @param ipAddress Valid IPv4 address within the address range of the specified subnet.
     */
    public fun ipAddress(ipAddress: String)

    /**
     * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` . 
     * These must be for the same VPC as subnet specified.
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` . 
     * These must be for the same VPC as subnet specified.
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * @param subnetId The ID of the subnet to add the mount target in. 
     * For One Zone file systems, use the subnet that is associated with the file system's
     * Availability Zone.
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder =
        software.amazon.awscdk.services.efs.CfnMountTargetProps.builder()

    /**
     * @param fileSystemId The ID of the file system for which to create the mount target. 
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * @param ipAddress Valid IPv4 address within the address range of the specified subnet.
     */
    override fun ipAddress(ipAddress: String) {
      cdkBuilder.ipAddress(ipAddress)
    }

    /**
     * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` . 
     * These must be for the same VPC as subnet specified.
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` . 
     * These must be for the same VPC as subnet specified.
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param subnetId The ID of the subnet to add the mount target in. 
     * For One Zone file systems, use the subnet that is associated with the file system's
     * Availability Zone.
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.efs.CfnMountTargetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.CfnMountTargetProps,
  ) : CdkObject(cdkObject), CfnMountTargetProps {
    /**
     * The ID of the file system for which to create the mount target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid)
     */
    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    /**
     * Valid IPv4 address within the address range of the specified subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress)
     */
    override fun ipAddress(): String? = unwrap(this).getIpAddress()

    /**
     * Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
     *
     * These must be for the same VPC as subnet specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
     */
    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

    /**
     * The ID of the subnet to add the mount target in.
     *
     * For One Zone file systems, use the subnet that is associated with the file system's
     * Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMountTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnMountTargetProps):
        CfnMountTargetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMountTargetProps):
        software.amazon.awscdk.services.efs.CfnMountTargetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.efs.CfnMountTargetProps
  }
}
