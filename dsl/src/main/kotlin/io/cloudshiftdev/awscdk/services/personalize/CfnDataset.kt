package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataset internal constructor(
  private val cdkObject: software.amazon.awscdk.services.personalize.CfnDataset,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrDatasetArn(): String = unwrap(this).getAttrDatasetArn()

  public open fun datasetGroupArn(): String = unwrap(this).getDatasetGroupArn()

  public open fun datasetGroupArn(`value`: String) {
    unwrap(this).setDatasetGroupArn(`value`)
  }

  public open fun datasetImportJob(): Any? = unwrap(this).getDatasetImportJob()

  public open fun datasetImportJob(`value`: IResolvable) {
    unwrap(this).setDatasetImportJob(`value`.let(IResolvable::unwrap))
  }

  public open fun datasetImportJob(`value`: DatasetImportJobProperty) {
    unwrap(this).setDatasetImportJob(`value`.let(DatasetImportJobProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8f15d07ac00955cce01882cc4201ca99e654195c75998b1ea270ffb9363fcfd8")
  public open fun datasetImportJob(`value`: DatasetImportJobProperty.Builder.() -> Unit): Unit =
      datasetImportJob(DatasetImportJobProperty(`value`))

  public open fun datasetType(): String = unwrap(this).getDatasetType()

  public open fun datasetType(`value`: String) {
    unwrap(this).setDatasetType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun schemaArn(): String = unwrap(this).getSchemaArn()

  public open fun schemaArn(`value`: String) {
    unwrap(this).setSchemaArn(`value`)
  }

  public interface Builder {
    public fun datasetGroupArn(datasetGroupArn: String) {
    }

    public fun datasetImportJob(datasetImportJob: IResolvable) {
    }

    public fun datasetImportJob(datasetImportJob: DatasetImportJobProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00047c50505b44a350b3b5aa2091fd9d26178e854fdd5befa5ed5863515933a6")
    public fun datasetImportJob(datasetImportJob: DatasetImportJobProperty.Builder.() -> Unit) {
    }

    public fun datasetType(datasetType: String) {
    }

    public fun name(name: String) {
    }

    public fun schemaArn(schemaArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnDataset.Builder =
        software.amazon.awscdk.services.personalize.CfnDataset.Builder.create(scope, id)

    public override fun datasetGroupArn(datasetGroupArn: String) {
      cdkBuilder.datasetGroupArn(datasetGroupArn)
    }

    public override fun datasetImportJob(datasetImportJob: IResolvable) {
      cdkBuilder.datasetImportJob(datasetImportJob.let(IResolvable::unwrap))
    }

    public override fun datasetImportJob(datasetImportJob: DatasetImportJobProperty) {
      cdkBuilder.datasetImportJob(datasetImportJob.let(DatasetImportJobProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00047c50505b44a350b3b5aa2091fd9d26178e854fdd5befa5ed5863515933a6")
    public override
        fun datasetImportJob(datasetImportJob: DatasetImportJobProperty.Builder.() -> Unit): Unit =
        datasetImportJob(DatasetImportJobProperty(datasetImportJob))

    public override fun datasetType(datasetType: String) {
      cdkBuilder.datasetType(datasetType)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun schemaArn(schemaArn: String) {
      cdkBuilder.schemaArn(schemaArn)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnDataset = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDataset): CfnDataset
        = CfnDataset(cdkObject)

    internal fun unwrap(wrapped: CfnDataset): software.amazon.awscdk.services.personalize.CfnDataset
        = wrapped.cdkObject
  }

  public interface DataSourceProperty {
    public fun dataLocation(): String? = unwrap(this).getDataLocation()

    public interface Builder {
      public fun dataLocation(dataLocation: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty.builder()

      public override fun dataLocation(dataLocation: String) {
        cdkBuilder.dataLocation(dataLocation)
      }

      public fun build(): software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty,
    ) : DataSourceProperty {
      public override fun dataLocation(): String? = unwrap(this).getDataLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty):
          DataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceProperty):
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DatasetImportJobProperty {
    public fun dataSource(): Any? = unwrap(this).getDataSource()

    public fun datasetArn(): String? = unwrap(this).getDatasetArn()

    public fun datasetImportJobArn(): String? = unwrap(this).getDatasetImportJobArn()

    public fun jobName(): String? = unwrap(this).getJobName()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public interface Builder {
      public fun dataSource(dataSource: Any) {
      }

      public fun datasetArn(datasetArn: String) {
      }

      public fun datasetImportJobArn(datasetImportJobArn: String) {
      }

      public fun jobName(jobName: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty.builder()

      public override fun dataSource(dataSource: Any) {
        cdkBuilder.dataSource(dataSource)
      }

      public override fun datasetArn(datasetArn: String) {
        cdkBuilder.datasetArn(datasetArn)
      }

      public override fun datasetImportJobArn(datasetImportJobArn: String) {
        cdkBuilder.datasetImportJobArn(datasetImportJobArn)
      }

      public override fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty,
    ) : DatasetImportJobProperty {
      public override fun dataSource(): Any? = unwrap(this).getDataSource()

      public override fun datasetArn(): String? = unwrap(this).getDatasetArn()

      public override fun datasetImportJobArn(): String? = unwrap(this).getDatasetImportJobArn()

      public override fun jobName(): String? = unwrap(this).getJobName()

      public override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetImportJobProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty):
          DatasetImportJobProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetImportJobProperty):
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
