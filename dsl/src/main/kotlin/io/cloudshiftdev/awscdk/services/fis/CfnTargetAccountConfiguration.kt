package io.cloudshiftdev.awscdk.services.fis

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTargetAccountConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun accountId(): String = unwrap(this).getAccountId()

  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun experimentTemplateId(): String = unwrap(this).getExperimentTemplateId()

  public open fun experimentTemplateId(`value`: String) {
    unwrap(this).setExperimentTemplateId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public interface Builder {
    public fun accountId(accountId: String) {
    }

    public fun description(description: String) {
    }

    public fun experimentTemplateId(experimentTemplateId: String) {
    }

    public fun roleArn(roleArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration.Builder =
        software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration.Builder.create(scope, id)

    public override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun experimentTemplateId(experimentTemplateId: String) {
      cdkBuilder.experimentTemplateId(experimentTemplateId)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTargetAccountConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTargetAccountConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration):
        CfnTargetAccountConfiguration = CfnTargetAccountConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnTargetAccountConfiguration):
        software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration = wrapped.cdkObject
  }
}
