@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLogAnomalyDetector internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.CfnLogAnomalyDetector,
) : CfnResource(cdkObject), IInspectable {
  public open fun accountId(): String? = unwrap(this).getAccountId()

  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  public open fun anomalyVisibilityTime(): Number? = unwrap(this).getAnomalyVisibilityTime()

  public open fun anomalyVisibilityTime(`value`: Number) {
    unwrap(this).setAnomalyVisibilityTime(`value`)
  }

  public open fun attrAnomalyDetectorArn(): String = unwrap(this).getAttrAnomalyDetectorArn()

  public open fun attrAnomalyDetectorStatus(): String = unwrap(this).getAttrAnomalyDetectorStatus()

  public open fun attrCreationTimeStamp(): IResolvable =
      unwrap(this).getAttrCreationTimeStamp().let(IResolvable::wrap)

  public open fun attrLastModifiedTimeStamp(): IResolvable =
      unwrap(this).getAttrLastModifiedTimeStamp().let(IResolvable::wrap)

  public open fun detectorName(): String? = unwrap(this).getDetectorName()

  public open fun detectorName(`value`: String) {
    unwrap(this).setDetectorName(`value`)
  }

  public open fun evaluationFrequency(): String? = unwrap(this).getEvaluationFrequency()

  public open fun evaluationFrequency(`value`: String) {
    unwrap(this).setEvaluationFrequency(`value`)
  }

  public open fun filterPattern(): String? = unwrap(this).getFilterPattern()

  public open fun filterPattern(`value`: String) {
    unwrap(this).setFilterPattern(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun logGroupArnList(): List<String> = unwrap(this).getLogGroupArnList() ?: emptyList()

  public open fun logGroupArnList(`value`: List<String>) {
    unwrap(this).setLogGroupArnList(`value`)
  }

  public open fun logGroupArnList(vararg `value`: String): Unit = logGroupArnList(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun accountId(accountId: String)

    public fun anomalyVisibilityTime(anomalyVisibilityTime: Number)

    public fun detectorName(detectorName: String)

    public fun evaluationFrequency(evaluationFrequency: String)

    public fun filterPattern(filterPattern: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun logGroupArnList(logGroupArnList: List<String>)

    public fun logGroupArnList(vararg logGroupArnList: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnLogAnomalyDetector.Builder =
        software.amazon.awscdk.services.logs.CfnLogAnomalyDetector.Builder.create(scope, id)

    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    override fun anomalyVisibilityTime(anomalyVisibilityTime: Number) {
      cdkBuilder.anomalyVisibilityTime(anomalyVisibilityTime)
    }

    override fun detectorName(detectorName: String) {
      cdkBuilder.detectorName(detectorName)
    }

    override fun evaluationFrequency(evaluationFrequency: String) {
      cdkBuilder.evaluationFrequency(evaluationFrequency)
    }

    override fun filterPattern(filterPattern: String) {
      cdkBuilder.filterPattern(filterPattern)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun logGroupArnList(logGroupArnList: List<String>) {
      cdkBuilder.logGroupArnList(logGroupArnList)
    }

    override fun logGroupArnList(vararg logGroupArnList: String): Unit =
        logGroupArnList(logGroupArnList.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnLogAnomalyDetector =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnLogAnomalyDetector.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogAnomalyDetector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogAnomalyDetector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnLogAnomalyDetector):
        CfnLogAnomalyDetector = CfnLogAnomalyDetector(cdkObject)

    internal fun unwrap(wrapped: CfnLogAnomalyDetector):
        software.amazon.awscdk.services.logs.CfnLogAnomalyDetector = wrapped.cdkObject
  }
}
