@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplicationReferenceDataSourceV2 internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun referenceDataSource(): Any = unwrap(this).getReferenceDataSource()

  public open fun referenceDataSource(`value`: IResolvable) {
    unwrap(this).setReferenceDataSource(`value`.let(IResolvable::unwrap))
  }

  public open fun referenceDataSource(`value`: ReferenceDataSourceProperty) {
    unwrap(this).setReferenceDataSource(`value`.let(ReferenceDataSourceProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1c998c97750f5e2de757179b682d329c914a5f64e2ec0e381647a2841cc6c25")
  public open fun referenceDataSource(`value`: ReferenceDataSourceProperty.Builder.() -> Unit): Unit
      = referenceDataSource(ReferenceDataSourceProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun referenceDataSource(referenceDataSource: IResolvable)

    public fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4d3cd708ed3508a9898619a52e0df1b1ae1c31cb02154951c4c82ed6a11e562")
    public
        fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.Builder
        =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.Builder.create(scope,
        id)

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun referenceDataSource(referenceDataSource: IResolvable) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(IResolvable::unwrap))
    }

    override fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(ReferenceDataSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4d3cd708ed3508a9898619a52e0df1b1ae1c31cb02154951c4c82ed6a11e562")
    override
        fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty.Builder.() -> Unit):
        Unit = referenceDataSource(ReferenceDataSourceProperty(referenceDataSource))

    public fun build():
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2 =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationReferenceDataSourceV2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationReferenceDataSourceV2(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2):
        CfnApplicationReferenceDataSourceV2 = CfnApplicationReferenceDataSourceV2(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationReferenceDataSourceV2):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2 =
        wrapped.cdkObject
  }

  public interface ReferenceSchemaProperty {
    public fun recordColumns(): Any

    public fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

    public fun recordFormat(): Any

    @CdkDslMarker
    public interface Builder {
      public fun recordColumns(recordColumns: IResolvable)

      public fun recordColumns(recordColumns: List<Any>)

      public fun recordColumns(vararg recordColumns: Any)

      public fun recordEncoding(recordEncoding: String)

      public fun recordFormat(recordFormat: IResolvable)

      public fun recordFormat(recordFormat: RecordFormatProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde604734a23a49df990e10c9bee2231c25e647050edeb6e8abcb6f6b01b38c0")
      public fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.builder()

      override fun recordColumns(recordColumns: IResolvable) {
        cdkBuilder.recordColumns(recordColumns.let(IResolvable::unwrap))
      }

      override fun recordColumns(recordColumns: List<Any>) {
        cdkBuilder.recordColumns(recordColumns)
      }

      override fun recordColumns(vararg recordColumns: Any): Unit =
          recordColumns(recordColumns.toList())

      override fun recordEncoding(recordEncoding: String) {
        cdkBuilder.recordEncoding(recordEncoding)
      }

      override fun recordFormat(recordFormat: IResolvable) {
        cdkBuilder.recordFormat(recordFormat.let(IResolvable::unwrap))
      }

      override fun recordFormat(recordFormat: RecordFormatProperty) {
        cdkBuilder.recordFormat(recordFormat.let(RecordFormatProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde604734a23a49df990e10c9bee2231c25e647050edeb6e8abcb6f6b01b38c0")
      override fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit): Unit =
          recordFormat(RecordFormatProperty(recordFormat))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty,
    ) : CdkObject(cdkObject), ReferenceSchemaProperty {
      override fun recordColumns(): Any = unwrap(this).getRecordColumns()

      override fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

      override fun recordFormat(): Any = unwrap(this).getRecordFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty):
          ReferenceSchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceSchemaProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty
    }
  }

  public interface CSVMappingParametersProperty {
    public fun recordColumnDelimiter(): String

    public fun recordRowDelimiter(): String

    @CdkDslMarker
    public interface Builder {
      public fun recordColumnDelimiter(recordColumnDelimiter: String)

      public fun recordRowDelimiter(recordRowDelimiter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.builder()

      override fun recordColumnDelimiter(recordColumnDelimiter: String) {
        cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
      }

      override fun recordRowDelimiter(recordRowDelimiter: String) {
        cdkBuilder.recordRowDelimiter(recordRowDelimiter)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty,
    ) : CdkObject(cdkObject), CSVMappingParametersProperty {
      override fun recordColumnDelimiter(): String = unwrap(this).getRecordColumnDelimiter()

      override fun recordRowDelimiter(): String = unwrap(this).getRecordRowDelimiter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CSVMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty):
          CSVMappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CSVMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty
    }
  }

  public interface JSONMappingParametersProperty {
    public fun recordRowPath(): String

    @CdkDslMarker
    public interface Builder {
      public fun recordRowPath(recordRowPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.builder()

      override fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty,
    ) : CdkObject(cdkObject), JSONMappingParametersProperty {
      override fun recordRowPath(): String = unwrap(this).getRecordRowPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JSONMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty):
          JSONMappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JSONMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty
    }
  }

  public interface S3ReferenceDataSourceProperty {
    public fun bucketArn(): String

    public fun fileKey(): String

    @CdkDslMarker
    public interface Builder {
      public fun bucketArn(bucketArn: String)

      public fun fileKey(fileKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.builder()

      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      override fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty,
    ) : CdkObject(cdkObject), S3ReferenceDataSourceProperty {
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      override fun fileKey(): String = unwrap(this).getFileKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ReferenceDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty):
          S3ReferenceDataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ReferenceDataSourceProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty
    }
  }

  public interface RecordFormatProperty {
    public fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

    public fun recordFormatType(): String

    @CdkDslMarker
    public interface Builder {
      public fun mappingParameters(mappingParameters: IResolvable)

      public fun mappingParameters(mappingParameters: MappingParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9355f01168aa04c8b14aaddc97622ba12495bb03768ec9fc390df24b14aef14a")
      public fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit)

      public fun recordFormatType(recordFormatType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.builder()

      override fun mappingParameters(mappingParameters: IResolvable) {
        cdkBuilder.mappingParameters(mappingParameters.let(IResolvable::unwrap))
      }

      override fun mappingParameters(mappingParameters: MappingParametersProperty) {
        cdkBuilder.mappingParameters(mappingParameters.let(MappingParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9355f01168aa04c8b14aaddc97622ba12495bb03768ec9fc390df24b14aef14a")
      override
          fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit):
          Unit = mappingParameters(MappingParametersProperty(mappingParameters))

      override fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty,
    ) : CdkObject(cdkObject), RecordFormatProperty {
      override fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

      override fun recordFormatType(): String = unwrap(this).getRecordFormatType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty):
          RecordFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordFormatProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty
    }
  }

  public interface MappingParametersProperty {
    public fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

    public fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()

    @CdkDslMarker
    public interface Builder {
      public fun csvMappingParameters(csvMappingParameters: IResolvable)

      public fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("925d695c2fe01427163b2c300c24fcc668c27e71a5c3f6d287630e5fb1477594")
      public
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit)

      public fun jsonMappingParameters(jsonMappingParameters: IResolvable)

      public fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d4fdf5c4a50f602ccf3d8f3d812889594e2d6b1fa5f37e30afb96e6876f2016")
      public
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.builder()

      override fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(IResolvable::unwrap))
      }

      override fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(CSVMappingParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("925d695c2fe01427163b2c300c24fcc668c27e71a5c3f6d287630e5fb1477594")
      override
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit):
          Unit = csvMappingParameters(CSVMappingParametersProperty(csvMappingParameters))

      override fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(IResolvable::unwrap))
      }

      override fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(JSONMappingParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d4fdf5c4a50f602ccf3d8f3d812889594e2d6b1fa5f37e30afb96e6876f2016")
      override
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit):
          Unit = jsonMappingParameters(JSONMappingParametersProperty(jsonMappingParameters))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty,
    ) : CdkObject(cdkObject), MappingParametersProperty {
      override fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

      override fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty):
          MappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty
    }
  }

  public interface RecordColumnProperty {
    public fun mapping(): String? = unwrap(this).getMapping()

    public fun name(): String

    public fun sqlType(): String

    @CdkDslMarker
    public interface Builder {
      public fun mapping(mapping: String)

      public fun name(name: String)

      public fun sqlType(sqlType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.builder()

      override fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun sqlType(sqlType: String) {
        cdkBuilder.sqlType(sqlType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty,
    ) : CdkObject(cdkObject), RecordColumnProperty {
      override fun mapping(): String? = unwrap(this).getMapping()

      override fun name(): String = unwrap(this).getName()

      override fun sqlType(): String = unwrap(this).getSqlType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty):
          RecordColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordColumnProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty
    }
  }

  public interface ReferenceDataSourceProperty {
    public fun referenceSchema(): Any

    public fun s3ReferenceDataSource(): Any? = unwrap(this).getS3ReferenceDataSource()

    public fun tableName(): String? = unwrap(this).getTableName()

    @CdkDslMarker
    public interface Builder {
      public fun referenceSchema(referenceSchema: IResolvable)

      public fun referenceSchema(referenceSchema: ReferenceSchemaProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e005b0c8ced29c3853d670709c7e4289adc0ca163eb47ca8a50835e6cfef344")
      public fun referenceSchema(referenceSchema: ReferenceSchemaProperty.Builder.() -> Unit)

      public fun s3ReferenceDataSource(s3ReferenceDataSource: IResolvable)

      public fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67c2f5ac9cbcd62e0a00fdeaecc7ac564b1438977587ec098dd438aef8293556")
      public
          fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty.Builder.() -> Unit)

      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.builder()

      override fun referenceSchema(referenceSchema: IResolvable) {
        cdkBuilder.referenceSchema(referenceSchema.let(IResolvable::unwrap))
      }

      override fun referenceSchema(referenceSchema: ReferenceSchemaProperty) {
        cdkBuilder.referenceSchema(referenceSchema.let(ReferenceSchemaProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e005b0c8ced29c3853d670709c7e4289adc0ca163eb47ca8a50835e6cfef344")
      override fun referenceSchema(referenceSchema: ReferenceSchemaProperty.Builder.() -> Unit):
          Unit = referenceSchema(ReferenceSchemaProperty(referenceSchema))

      override fun s3ReferenceDataSource(s3ReferenceDataSource: IResolvable) {
        cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource.let(IResolvable::unwrap))
      }

      override fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty) {
        cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource.let(S3ReferenceDataSourceProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67c2f5ac9cbcd62e0a00fdeaecc7ac564b1438977587ec098dd438aef8293556")
      override
          fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty.Builder.() -> Unit):
          Unit = s3ReferenceDataSource(S3ReferenceDataSourceProperty(s3ReferenceDataSource))

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty,
    ) : CdkObject(cdkObject), ReferenceDataSourceProperty {
      override fun referenceSchema(): Any = unwrap(this).getReferenceSchema()

      override fun s3ReferenceDataSource(): Any? = unwrap(this).getS3ReferenceDataSource()

      override fun tableName(): String? = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty):
          ReferenceDataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceDataSourceProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty
    }
  }
}
