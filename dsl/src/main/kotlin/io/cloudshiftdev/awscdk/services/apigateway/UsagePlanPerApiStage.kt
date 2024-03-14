package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.Unit
import kotlin.collections.List

public interface UsagePlanPerApiStage {
  public fun api(): IRestApi? = unwrap(this).getApi()?.let(IRestApi::wrap)

  public fun stage(): Stage? = unwrap(this).getStage()?.let(Stage::wrap)

  public fun throttle(): List<ThrottlingPerMethod> =
      unwrap(this).getThrottle()?.map(ThrottlingPerMethod::wrap) ?: emptyList()

  public interface Builder {
    public fun api(api: IRestApi) {
    }

    public fun stage(stage: Stage) {
    }

    public fun throttle(throttle: List<ThrottlingPerMethod>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage.Builder
        = software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage.builder()

    public override fun api(api: IRestApi) {
      cdkBuilder.api(api.let(IRestApi::unwrap))
    }

    public override fun stage(stage: Stage) {
      cdkBuilder.stage(stage.let(Stage::unwrap))
    }

    public override fun throttle(throttle: List<ThrottlingPerMethod>) {
      cdkBuilder.throttle(throttle.map(ThrottlingPerMethod::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage,
  ) : UsagePlanPerApiStage {
    public override fun api(): IRestApi? = unwrap(this).getApi()?.let(IRestApi::wrap)

    public override fun stage(): Stage? = unwrap(this).getStage()?.let(Stage::wrap)

    public override fun throttle(): List<ThrottlingPerMethod> =
        unwrap(this).getThrottle()?.map(ThrottlingPerMethod::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): UsagePlanPerApiStage {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage):
        UsagePlanPerApiStage = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UsagePlanPerApiStage):
        software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage = (wrapped as
        Wrapper).cdkObject
  }
}
