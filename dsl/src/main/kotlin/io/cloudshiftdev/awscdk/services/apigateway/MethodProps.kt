package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface MethodProps {
  /**
   * The HTTP method ("GET", "POST", "PUT", ...) that clients use to call this method.
   */
  public fun httpMethod(): String

  /**
   * The backend system that the method calls when it receives a request.
   *
   * Default: - a new `MockIntegration`.
   */
  public fun integration(): Integration? = unwrap(this).getIntegration()?.let(Integration::wrap)

  /**
   * Method options.
   *
   * Default: - No options.
   */
  public fun options(): MethodOptions? = unwrap(this).getOptions()?.let(MethodOptions::wrap)

  /**
   * The resource this method is associated with.
   *
   * For root resource methods,
   * specify the `RestApi` object.
   */
  public fun resource(): IResource

  /**
   * A builder for [MethodProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param httpMethod The HTTP method ("GET", "POST", "PUT", ...) that clients use to call this
     * method. 
     */
    public fun httpMethod(httpMethod: String)

    /**
     * @param integration The backend system that the method calls when it receives a request.
     */
    public fun integration(integration: Integration)

    /**
     * @param integration The backend system that the method calls when it receives a request.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5108ff710e19a195cb56f29d5def6664d839cf58232826a03a4dd5c6235375f")
    public fun integration(integration: Integration.Builder.() -> Unit)

    /**
     * @param options Method options.
     */
    public fun options(options: MethodOptions)

    /**
     * @param options Method options.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8ad60445e59bcbb249426551bb34a748c2c01b2d61c9646fc47fad69913633d")
    public fun options(options: MethodOptions.Builder.() -> Unit)

    /**
     * @param resource The resource this method is associated with. 
     * For root resource methods,
     * specify the `RestApi` object.
     */
    public fun resource(resource: IResource)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.MethodProps.Builder =
        software.amazon.awscdk.services.apigateway.MethodProps.builder()

    /**
     * @param httpMethod The HTTP method ("GET", "POST", "PUT", ...) that clients use to call this
     * method. 
     */
    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * @param integration The backend system that the method calls when it receives a request.
     */
    override fun integration(integration: Integration) {
      cdkBuilder.integration(integration.let(Integration::unwrap))
    }

    /**
     * @param integration The backend system that the method calls when it receives a request.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5108ff710e19a195cb56f29d5def6664d839cf58232826a03a4dd5c6235375f")
    override fun integration(integration: Integration.Builder.() -> Unit): Unit =
        integration(Integration(integration))

    /**
     * @param options Method options.
     */
    override fun options(options: MethodOptions) {
      cdkBuilder.options(options.let(MethodOptions::unwrap))
    }

    /**
     * @param options Method options.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8ad60445e59bcbb249426551bb34a748c2c01b2d61c9646fc47fad69913633d")
    override fun options(options: MethodOptions.Builder.() -> Unit): Unit =
        options(MethodOptions(options))

    /**
     * @param resource The resource this method is associated with. 
     * For root resource methods,
     * specify the `RestApi` object.
     */
    override fun resource(resource: IResource) {
      cdkBuilder.resource(resource.let(IResource::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.MethodProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.MethodProps,
  ) : CdkObject(cdkObject), MethodProps {
    /**
     * The HTTP method ("GET", "POST", "PUT", ...) that clients use to call this method.
     */
    override fun httpMethod(): String = unwrap(this).getHttpMethod()

    /**
     * The backend system that the method calls when it receives a request.
     *
     * Default: - a new `MockIntegration`.
     */
    override fun integration(): Integration? = unwrap(this).getIntegration()?.let(Integration::wrap)

    /**
     * Method options.
     *
     * Default: - No options.
     */
    override fun options(): MethodOptions? = unwrap(this).getOptions()?.let(MethodOptions::wrap)

    /**
     * The resource this method is associated with.
     *
     * For root resource methods,
     * specify the `RestApi` object.
     */
    override fun resource(): IResource = unwrap(this).getResource().let(IResource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MethodProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.MethodProps):
        MethodProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MethodProps):
        software.amazon.awscdk.services.apigateway.MethodProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.MethodProps
  }
}
