@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarconnections

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSyncConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codestarconnections.*;
 * CfnSyncConfigurationProps cfnSyncConfigurationProps = CfnSyncConfigurationProps.builder()
 * .branch("branch")
 * .configFile("configFile")
 * .repositoryLinkId("repositoryLinkId")
 * .resourceName("resourceName")
 * .roleArn("roleArn")
 * .syncType("syncType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html)
 */
public interface CfnSyncConfigurationProps {
  /**
   * The branch associated with a specific sync configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-branch)
   */
  public fun branch(): String

  /**
   * The file path to the configuration file associated with a specific sync configuration.
   *
   * The path should point to an actual file in the sync configurations linked repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-configfile)
   */
  public fun configFile(): String

  /**
   * The ID of the repository link associated with a specific sync configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-repositorylinkid)
   */
  public fun repositoryLinkId(): String

  /**
   * The name of the connection resource associated with a specific sync configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-resourcename)
   */
  public fun resourceName(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM role associated with a specific sync configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-rolearn)
   */
  public fun roleArn(): String

  /**
   * The type of sync for a specific sync configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-synctype)
   */
  public fun syncType(): String

  /**
   * A builder for [CfnSyncConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param branch The branch associated with a specific sync configuration. 
     */
    public fun branch(branch: String)

    /**
     * @param configFile The file path to the configuration file associated with a specific sync
     * configuration. 
     * The path should point to an actual file in the sync configurations linked repository.
     */
    public fun configFile(configFile: String)

    /**
     * @param repositoryLinkId The ID of the repository link associated with a specific sync
     * configuration. 
     */
    public fun repositoryLinkId(repositoryLinkId: String)

    /**
     * @param resourceName The name of the connection resource associated with a specific sync
     * configuration. 
     */
    public fun resourceName(resourceName: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role associated with a specific sync
     * configuration. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param syncType The type of sync for a specific sync configuration. 
     */
    public fun syncType(syncType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps.Builder =
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps.builder()

    /**
     * @param branch The branch associated with a specific sync configuration. 
     */
    override fun branch(branch: String) {
      cdkBuilder.branch(branch)
    }

    /**
     * @param configFile The file path to the configuration file associated with a specific sync
     * configuration. 
     * The path should point to an actual file in the sync configurations linked repository.
     */
    override fun configFile(configFile: String) {
      cdkBuilder.configFile(configFile)
    }

    /**
     * @param repositoryLinkId The ID of the repository link associated with a specific sync
     * configuration. 
     */
    override fun repositoryLinkId(repositoryLinkId: String) {
      cdkBuilder.repositoryLinkId(repositoryLinkId)
    }

    /**
     * @param resourceName The name of the connection resource associated with a specific sync
     * configuration. 
     */
    override fun resourceName(resourceName: String) {
      cdkBuilder.resourceName(resourceName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role associated with a specific sync
     * configuration. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param syncType The type of sync for a specific sync configuration. 
     */
    override fun syncType(syncType: String) {
      cdkBuilder.syncType(syncType)
    }

    public fun build():
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps,
  ) : CdkObject(cdkObject), CfnSyncConfigurationProps {
    /**
     * The branch associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-branch)
     */
    override fun branch(): String = unwrap(this).getBranch()

    /**
     * The file path to the configuration file associated with a specific sync configuration.
     *
     * The path should point to an actual file in the sync configurations linked repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-configfile)
     */
    override fun configFile(): String = unwrap(this).getConfigFile()

    /**
     * The ID of the repository link associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-repositorylinkid)
     */
    override fun repositoryLinkId(): String = unwrap(this).getRepositoryLinkId()

    /**
     * The name of the connection resource associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-resourcename)
     */
    override fun resourceName(): String = unwrap(this).getResourceName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The type of sync for a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-synctype)
     */
    override fun syncType(): String = unwrap(this).getSyncType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSyncConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps):
        CfnSyncConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as CfnSyncConfigurationProps

    internal fun unwrap(wrapped: CfnSyncConfigurationProps):
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps
  }
}
