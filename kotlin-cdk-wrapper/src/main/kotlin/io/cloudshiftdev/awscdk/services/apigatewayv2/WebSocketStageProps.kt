@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties to initialize an instance of `WebSocketStage`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
 * Function connectHandler;
 * Function disconnectHandler;
 * Function defaultHandler;
 * WebSocketApi webSocketApi = WebSocketApi.Builder.create(this, "mywsapi")
 * .connectRouteOptions(WebSocketRouteOptions.builder().integration(new
 * WebSocketLambdaIntegration("ConnectIntegration", connectHandler)).build())
 * .disconnectRouteOptions(WebSocketRouteOptions.builder().integration(new
 * WebSocketLambdaIntegration("DisconnectIntegration", disconnectHandler)).build())
 * .defaultRouteOptions(WebSocketRouteOptions.builder().integration(new
 * WebSocketLambdaIntegration("DefaultIntegration", defaultHandler)).build())
 * .build();
 * WebSocketStage.Builder.create(this, "mystage")
 * .webSocketApi(webSocketApi)
 * .stageName("dev")
 * .autoDeploy(true)
 * .build();
 * ```
 */
public interface WebSocketStageProps : StageOptions {
  /**
   * The name of the stage.
   */
  public fun stageName(): String

  /**
   * The WebSocket API to which this stage is associated.
   */
  public fun webSocketApi(): IWebSocketApi

  /**
   * A builder for [WebSocketStageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoDeploy Whether updates to an API automatically trigger a new deployment.
     */
    public fun autoDeploy(autoDeploy: Boolean)

    /**
     * @param domainMapping The options for custom domain and api mapping.
     */
    public fun domainMapping(domainMapping: DomainMappingOptions)

    /**
     * @param domainMapping The options for custom domain and api mapping.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("406bdcf21400ec10838fdc26218f08a05a79d3b379e8874ebec4be40128050e8")
    public fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit)

    /**
     * @param stageName The name of the stage. 
     */
    public fun stageName(stageName: String)

    /**
     * @param throttle Throttle settings for the routes of this stage.
     */
    public fun throttle(throttle: ThrottleSettings)

    /**
     * @param throttle Throttle settings for the routes of this stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5309ced1e42a8d8106537ceb0de621a95e9ec10e7f984cbc78b156a71d5d7b3")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)

    /**
     * @param webSocketApi The WebSocket API to which this stage is associated. 
     */
    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps.builder()

    /**
     * @param autoDeploy Whether updates to an API automatically trigger a new deployment.
     */
    override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    /**
     * @param domainMapping The options for custom domain and api mapping.
     */
    override fun domainMapping(domainMapping: DomainMappingOptions) {
      cdkBuilder.domainMapping(domainMapping.let(DomainMappingOptions::unwrap))
    }

    /**
     * @param domainMapping The options for custom domain and api mapping.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("406bdcf21400ec10838fdc26218f08a05a79d3b379e8874ebec4be40128050e8")
    override fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit): Unit =
        domainMapping(DomainMappingOptions(domainMapping))

    /**
     * @param stageName The name of the stage. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * @param throttle Throttle settings for the routes of this stage.
     */
    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    /**
     * @param throttle Throttle settings for the routes of this stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5309ced1e42a8d8106537ceb0de621a95e9ec10e7f984cbc78b156a71d5d7b3")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    /**
     * @param webSocketApi The WebSocket API to which this stage is associated. 
     */
    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps,
  ) : CdkObject(cdkObject), WebSocketStageProps {
    /**
     * Whether updates to an API automatically trigger a new deployment.
     *
     * Default: false
     */
    override fun autoDeploy(): Boolean? = unwrap(this).getAutoDeploy()

    /**
     * The options for custom domain and api mapping.
     *
     * Default: - no custom domain and api mapping configuration
     */
    override fun domainMapping(): DomainMappingOptions? =
        unwrap(this).getDomainMapping()?.let(DomainMappingOptions::wrap)

    /**
     * The name of the stage.
     */
    override fun stageName(): String = unwrap(this).getStageName()

    /**
     * Throttle settings for the routes of this stage.
     *
     * Default: - no throttling configuration
     */
    override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)

    /**
     * The WebSocket API to which this stage is associated.
     */
    override fun webSocketApi(): IWebSocketApi =
        unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketStageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps):
        WebSocketStageProps = CdkObjectWrappers.wrap(cdkObject) as WebSocketStageProps

    internal fun unwrap(wrapped: WebSocketStageProps):
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps
  }
}
