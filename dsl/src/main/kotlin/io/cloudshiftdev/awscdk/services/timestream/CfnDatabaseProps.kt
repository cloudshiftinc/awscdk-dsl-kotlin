package io.cloudshiftdev.awscdk.services.timestream

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDatabaseProps {
  /**
   * The name of the Timestream database.
   *
   * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-databasename)
   */
  public fun databaseName(): String? = unwrap(this).getDatabaseName()

  /**
   * The identifier of the AWS KMS key used to encrypt the data stored in the database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The tags to add to the database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDatabaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param databaseName The name of the Timestream database.
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     */
    public fun databaseName(databaseName: String)

    /**
     * @param kmsKeyId The identifier of the AWS KMS key used to encrypt the data stored in the
     * database.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param tags The tags to add to the database.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the database.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.timestream.CfnDatabaseProps.Builder =
        software.amazon.awscdk.services.timestream.CfnDatabaseProps.builder()

    /**
     * @param databaseName The name of the Timestream database.
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param kmsKeyId The identifier of the AWS KMS key used to encrypt the data stored in the
     * database.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param tags The tags to add to the database.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to add to the database.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.timestream.CfnDatabaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.timestream.CfnDatabaseProps,
  ) : CdkObject(cdkObject), CfnDatabaseProps {
    /**
     * The name of the Timestream database.
     *
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-databasename)
     */
    override fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * The identifier of the AWS KMS key used to encrypt the data stored in the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The tags to add to the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-database.html#cfn-timestream-database-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatabaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnDatabaseProps):
        CfnDatabaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatabaseProps):
        software.amazon.awscdk.services.timestream.CfnDatabaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.timestream.CfnDatabaseProps
  }
}
