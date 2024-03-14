package io.cloudshiftdev.awscdk.services.m2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.m2.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

  public open fun attrApplicationId(): String = unwrap(this).getAttrApplicationId()

  public open fun definition(): Any = unwrap(this).getDefinition()

  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable::unwrap))
  }

  public open fun definition(`value`: DefinitionProperty) {
    unwrap(this).setDefinition(`value`.let(DefinitionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9b624843a9cb8af2a215c414f7f610338f96e0608902203990c9eb54c8ad8952")
  public open fun definition(`value`: DefinitionProperty.Builder.() -> Unit): Unit =
      definition(DefinitionProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun engineType(): String = unwrap(this).getEngineType()

  public open fun engineType(`value`: String) {
    unwrap(this).setEngineType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun definition(definition: IResolvable) {
    }

    public fun definition(definition: DefinitionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa07a797264e8a049043822049769f620ab982b21b833a0a72617a2a86d9255c")
    public fun definition(definition: DefinitionProperty.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun engineType(engineType: String) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    public fun name(name: String) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.m2.CfnApplication.Builder =
        software.amazon.awscdk.services.m2.CfnApplication.Builder.create(scope, id)

    public override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    public override fun definition(definition: DefinitionProperty) {
      cdkBuilder.definition(definition.let(DefinitionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa07a797264e8a049043822049769f620ab982b21b833a0a72617a2a86d9255c")
    public override fun definition(definition: DefinitionProperty.Builder.() -> Unit): Unit =
        definition(DefinitionProperty(definition))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.m2.CfnApplication = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnApplication): CfnApplication
        = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication): software.amazon.awscdk.services.m2.CfnApplication
        = wrapped.cdkObject
  }

  public interface DefinitionProperty {
    public fun content(): String? = unwrap(this).getContent()

    public fun s3Location(): String? = unwrap(this).getS3Location()

    public interface Builder {
      public fun content(content: String) {
      }

      public fun s3Location(s3Location: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.m2.CfnApplication.DefinitionProperty.Builder =
          software.amazon.awscdk.services.m2.CfnApplication.DefinitionProperty.builder()

      public override fun content(content: String) {
        cdkBuilder.content(content)
      }

      public override fun s3Location(s3Location: String) {
        cdkBuilder.s3Location(s3Location)
      }

      public fun build(): software.amazon.awscdk.services.m2.CfnApplication.DefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.m2.CfnApplication.DefinitionProperty,
    ) : DefinitionProperty {
      public override fun content(): String? = unwrap(this).getContent()

      public override fun s3Location(): String? = unwrap(this).getS3Location()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnApplication.DefinitionProperty):
          DefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefinitionProperty):
          software.amazon.awscdk.services.m2.CfnApplication.DefinitionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
