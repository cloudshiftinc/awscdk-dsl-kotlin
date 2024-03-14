package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HttpNamespace internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.servicediscovery.HttpNamespace,
) : Resource(cdkObject), IHttpNamespace {
  /**
   * Creates a service within the namespace.
   *
   * @param id 
   * @param props
   */
  public open fun createService(id: String): Service =
      unwrap(this).createService(id).let(Service::wrap)

  /**
   * Creates a service within the namespace.
   *
   * @param id 
   * @param props
   */
  public open fun createService(id: String, props: BaseServiceProps): Service =
      unwrap(this).createService(id, props.let(BaseServiceProps::unwrap)).let(Service::wrap)

  /**
   * Creates a service within the namespace.
   *
   * @param id 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fb888858122fa3a85636971962a67df3f3bb6614852ebf7280017950fa7efd3f")
  public open fun createService(id: String, props: BaseServiceProps.Builder.() -> Unit): Service =
      createService(id, BaseServiceProps(props))

  /**
   *
   */
  public open fun httpNamespaceArn(): String = unwrap(this).getHttpNamespaceArn()

  /**
   *
   */
  public open fun httpNamespaceId(): String = unwrap(this).getHttpNamespaceId()

  /**
   *
   */
  public open fun httpNamespaceName(): String = unwrap(this).getHttpNamespaceName()

  /**
   * Namespace Arn for the namespace.
   */
  public override fun namespaceArn(): String = unwrap(this).getNamespaceArn()

  /**
   * Namespace Id for the namespace.
   */
  public override fun namespaceId(): String = unwrap(this).getNamespaceId()

  /**
   * A name for the namespace.
   */
  public override fun namespaceName(): String = unwrap(this).getNamespaceName()

  /**
   * Type of the namespace.
   */
  public override fun type(): NamespaceType = unwrap(this).getType().let(NamespaceType::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicediscovery.HttpNamespace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the Namespace.
     *
     * Default: none
     *
     * @param description A description of the Namespace. 
     */
    public fun description(description: String)

    /**
     * A name for the Namespace.
     *
     * @param name A name for the Namespace. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.HttpNamespace.Builder =
        software.amazon.awscdk.services.servicediscovery.HttpNamespace.Builder.create(scope, id)

    /**
     * A description of the Namespace.
     *
     * Default: none
     *
     * @param description A description of the Namespace. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A name for the Namespace.
     *
     * @param name A name for the Namespace. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.HttpNamespace =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromHttpNamespaceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HttpNamespaceAttributes,
    ): IHttpNamespace =
        software.amazon.awscdk.services.servicediscovery.HttpNamespace.fromHttpNamespaceAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(HttpNamespaceAttributes::unwrap)).let(IHttpNamespace::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("591ffd6f65594fcb61995bd440aa1c82077bd128d07f7f2065c6e21c797fa9f8")
    public fun fromHttpNamespaceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HttpNamespaceAttributes.Builder.() -> Unit,
    ): IHttpNamespace = fromHttpNamespaceAttributes(scope, id, HttpNamespaceAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpNamespace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.HttpNamespace):
        HttpNamespace = HttpNamespace(cdkObject)

    internal fun unwrap(wrapped: HttpNamespace):
        software.amazon.awscdk.services.servicediscovery.HttpNamespace = wrapped.cdkObject
  }
}
