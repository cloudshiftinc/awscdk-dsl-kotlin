package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDeploymentConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun computePlatform(): String? = unwrap(this).getComputePlatform()

  public open fun computePlatform(`value`: String) {
    unwrap(this).setComputePlatform(`value`)
  }

  public open fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

  public open fun deploymentConfigName(`value`: String) {
    unwrap(this).setDeploymentConfigName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun minimumHealthyHosts(): Any? = unwrap(this).getMinimumHealthyHosts()

  public open fun minimumHealthyHosts(`value`: IResolvable) {
    unwrap(this).setMinimumHealthyHosts(`value`.let(IResolvable::unwrap))
  }

  public open fun minimumHealthyHosts(`value`: MinimumHealthyHostsProperty) {
    unwrap(this).setMinimumHealthyHosts(`value`.let(MinimumHealthyHostsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c4c2b03df70ac5bf70aa2b05713337e53ec2648c4ac018e353ccf862f86ba8ef")
  public open fun minimumHealthyHosts(`value`: MinimumHealthyHostsProperty.Builder.() -> Unit): Unit
      = minimumHealthyHosts(MinimumHealthyHostsProperty(`value`))

  public open fun trafficRoutingConfig(): Any? = unwrap(this).getTrafficRoutingConfig()

  public open fun trafficRoutingConfig(`value`: IResolvable) {
    unwrap(this).setTrafficRoutingConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun trafficRoutingConfig(`value`: TrafficRoutingConfigProperty) {
    unwrap(this).setTrafficRoutingConfig(`value`.let(TrafficRoutingConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d964922def4bec56fa9cdc91c31b1b3b18c2104796e96ee04cc8ac02b6f4ca62")
  public open fun trafficRoutingConfig(`value`: TrafficRoutingConfigProperty.Builder.() -> Unit):
      Unit = trafficRoutingConfig(TrafficRoutingConfigProperty(`value`))

  public open fun zonalConfig(): Any? = unwrap(this).getZonalConfig()

  public open fun zonalConfig(`value`: IResolvable) {
    unwrap(this).setZonalConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun zonalConfig(`value`: ZonalConfigProperty) {
    unwrap(this).setZonalConfig(`value`.let(ZonalConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5ab885da9610db1d6963b24bdbfbc7779b060021c581adc938401cd8cd86ec2")
  public open fun zonalConfig(`value`: ZonalConfigProperty.Builder.() -> Unit): Unit =
      zonalConfig(ZonalConfigProperty(`value`))

  public interface Builder {
    public fun computePlatform(computePlatform: String) {
    }

    public fun deploymentConfigName(deploymentConfigName: String) {
    }

    public fun minimumHealthyHosts(minimumHealthyHosts: IResolvable) {
    }

    public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHostsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbc1c3a565260c5d54a5ad16a4e966843b6eb67b2b603b17bf971baae214889a")
    public
        fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHostsProperty.Builder.() -> Unit) {
    }

    public fun trafficRoutingConfig(trafficRoutingConfig: IResolvable) {
    }

    public fun trafficRoutingConfig(trafficRoutingConfig: TrafficRoutingConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6a790552c956f9a592a991f15d33e1a0de868fca97a9c3d960b1627e58e3eed")
    public
        fun trafficRoutingConfig(trafficRoutingConfig: TrafficRoutingConfigProperty.Builder.() -> Unit) {
    }

    public fun zonalConfig(zonalConfig: IResolvable) {
    }

    public fun zonalConfig(zonalConfig: ZonalConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82e38925318ba0657ddb028e58cbf24d5850549facc89820c13454720ce7d59a")
    public fun zonalConfig(zonalConfig: ZonalConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.Builder.create(scope, id)

    public override fun computePlatform(computePlatform: String) {
      cdkBuilder.computePlatform(computePlatform)
    }

    public override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public override fun minimumHealthyHosts(minimumHealthyHosts: IResolvable) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(IResolvable::unwrap))
    }

    public override fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHostsProperty) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(MinimumHealthyHostsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbc1c3a565260c5d54a5ad16a4e966843b6eb67b2b603b17bf971baae214889a")
    public override
        fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHostsProperty.Builder.() -> Unit):
        Unit = minimumHealthyHosts(MinimumHealthyHostsProperty(minimumHealthyHosts))

    public override fun trafficRoutingConfig(trafficRoutingConfig: IResolvable) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(IResolvable::unwrap))
    }

    public override fun trafficRoutingConfig(trafficRoutingConfig: TrafficRoutingConfigProperty) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(TrafficRoutingConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6a790552c956f9a592a991f15d33e1a0de868fca97a9c3d960b1627e58e3eed")
    public override
        fun trafficRoutingConfig(trafficRoutingConfig: TrafficRoutingConfigProperty.Builder.() -> Unit):
        Unit = trafficRoutingConfig(TrafficRoutingConfigProperty(trafficRoutingConfig))

    public override fun zonalConfig(zonalConfig: IResolvable) {
      cdkBuilder.zonalConfig(zonalConfig.let(IResolvable::unwrap))
    }

    public override fun zonalConfig(zonalConfig: ZonalConfigProperty) {
      cdkBuilder.zonalConfig(zonalConfig.let(ZonalConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82e38925318ba0657ddb028e58cbf24d5850549facc89820c13454720ce7d59a")
    public override fun zonalConfig(zonalConfig: ZonalConfigProperty.Builder.() -> Unit): Unit =
        zonalConfig(ZonalConfigProperty(zonalConfig))

    public fun build(): software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeploymentConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeploymentConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig):
        CfnDeploymentConfig = CfnDeploymentConfig(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig = wrapped.cdkObject
  }

  public interface ZonalConfigProperty {
    public fun firstZoneMonitorDurationInSeconds(): Number? =
        unwrap(this).getFirstZoneMonitorDurationInSeconds()

    public fun minimumHealthyHostsPerZone(): Any? = unwrap(this).getMinimumHealthyHostsPerZone()

    public fun monitorDurationInSeconds(): Number? = unwrap(this).getMonitorDurationInSeconds()

    public interface Builder {
      public fun firstZoneMonitorDurationInSeconds(firstZoneMonitorDurationInSeconds: Number) {
      }

      public fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: IResolvable) {
      }

      public
          fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZoneProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87ea626ac55620d1f14ed70d11d4095a689636449fcbd66960aef032eaead7b5")
      public
          fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZoneProperty.Builder.() -> Unit) {
      }

      public fun monitorDurationInSeconds(monitorDurationInSeconds: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty.builder()

      public override
          fun firstZoneMonitorDurationInSeconds(firstZoneMonitorDurationInSeconds: Number) {
        cdkBuilder.firstZoneMonitorDurationInSeconds(firstZoneMonitorDurationInSeconds)
      }

      public override fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: IResolvable) {
        cdkBuilder.minimumHealthyHostsPerZone(minimumHealthyHostsPerZone.let(IResolvable::unwrap))
      }

      public override
          fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZoneProperty) {
        cdkBuilder.minimumHealthyHostsPerZone(minimumHealthyHostsPerZone.let(MinimumHealthyHostsPerZoneProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87ea626ac55620d1f14ed70d11d4095a689636449fcbd66960aef032eaead7b5")
      public override
          fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZoneProperty.Builder.() -> Unit):
          Unit =
          minimumHealthyHostsPerZone(MinimumHealthyHostsPerZoneProperty(minimumHealthyHostsPerZone))

      public override fun monitorDurationInSeconds(monitorDurationInSeconds: Number) {
        cdkBuilder.monitorDurationInSeconds(monitorDurationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty,
    ) : ZonalConfigProperty {
      public override fun firstZoneMonitorDurationInSeconds(): Number? =
          unwrap(this).getFirstZoneMonitorDurationInSeconds()

      public override fun minimumHealthyHostsPerZone(): Any? =
          unwrap(this).getMinimumHealthyHostsPerZone()

      public override fun monitorDurationInSeconds(): Number? =
          unwrap(this).getMonitorDurationInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ZonalConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty):
          ZonalConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZonalConfigProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.ZonalConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MinimumHealthyHostsProperty {
    public fun type(): String

    public fun `value`(): Number

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty,
    ) : MinimumHealthyHostsProperty {
      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MinimumHealthyHostsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty):
          MinimumHealthyHostsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MinimumHealthyHostsProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MinimumHealthyHostsPerZoneProperty {
    public fun type(): String

    public fun `value`(): Number

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty,
    ) : MinimumHealthyHostsPerZoneProperty {
      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MinimumHealthyHostsPerZoneProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty):
          MinimumHealthyHostsPerZoneProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MinimumHealthyHostsPerZoneProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TrafficRoutingConfigProperty {
    public fun timeBasedCanary(): Any? = unwrap(this).getTimeBasedCanary()

    public fun timeBasedLinear(): Any? = unwrap(this).getTimeBasedLinear()

    public fun type(): String

    public interface Builder {
      public fun timeBasedCanary(timeBasedCanary: IResolvable) {
      }

      public fun timeBasedCanary(timeBasedCanary: TimeBasedCanaryProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32115ce6e20e117c8f464c1a8cda6c2d27b8944c439b7ad12d2637c1b9038c35")
      public fun timeBasedCanary(timeBasedCanary: TimeBasedCanaryProperty.Builder.() -> Unit) {
      }

      public fun timeBasedLinear(timeBasedLinear: IResolvable) {
      }

      public fun timeBasedLinear(timeBasedLinear: TimeBasedLinearProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ed05caad02b178f12e9a278512f7f6967e67dc19d57dcbdc419a042bcafa27f")
      public fun timeBasedLinear(timeBasedLinear: TimeBasedLinearProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty.builder()

      public override fun timeBasedCanary(timeBasedCanary: IResolvable) {
        cdkBuilder.timeBasedCanary(timeBasedCanary.let(IResolvable::unwrap))
      }

      public override fun timeBasedCanary(timeBasedCanary: TimeBasedCanaryProperty) {
        cdkBuilder.timeBasedCanary(timeBasedCanary.let(TimeBasedCanaryProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32115ce6e20e117c8f464c1a8cda6c2d27b8944c439b7ad12d2637c1b9038c35")
      public override
          fun timeBasedCanary(timeBasedCanary: TimeBasedCanaryProperty.Builder.() -> Unit): Unit =
          timeBasedCanary(TimeBasedCanaryProperty(timeBasedCanary))

      public override fun timeBasedLinear(timeBasedLinear: IResolvable) {
        cdkBuilder.timeBasedLinear(timeBasedLinear.let(IResolvable::unwrap))
      }

      public override fun timeBasedLinear(timeBasedLinear: TimeBasedLinearProperty) {
        cdkBuilder.timeBasedLinear(timeBasedLinear.let(TimeBasedLinearProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ed05caad02b178f12e9a278512f7f6967e67dc19d57dcbdc419a042bcafa27f")
      public override
          fun timeBasedLinear(timeBasedLinear: TimeBasedLinearProperty.Builder.() -> Unit): Unit =
          timeBasedLinear(TimeBasedLinearProperty(timeBasedLinear))

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty,
    ) : TrafficRoutingConfigProperty {
      public override fun timeBasedCanary(): Any? = unwrap(this).getTimeBasedCanary()

      public override fun timeBasedLinear(): Any? = unwrap(this).getTimeBasedLinear()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrafficRoutingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty):
          TrafficRoutingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrafficRoutingConfigProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TrafficRoutingConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TimeBasedLinearProperty {
    public fun linearInterval(): Number

    public fun linearPercentage(): Number

    public interface Builder {
      public fun linearInterval(linearInterval: Number) {
      }

      public fun linearPercentage(linearPercentage: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty.builder()

      public override fun linearInterval(linearInterval: Number) {
        cdkBuilder.linearInterval(linearInterval)
      }

      public override fun linearPercentage(linearPercentage: Number) {
        cdkBuilder.linearPercentage(linearPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty,
    ) : TimeBasedLinearProperty {
      public override fun linearInterval(): Number = unwrap(this).getLinearInterval()

      public override fun linearPercentage(): Number = unwrap(this).getLinearPercentage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimeBasedLinearProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty):
          TimeBasedLinearProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeBasedLinearProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedLinearProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TimeBasedCanaryProperty {
    public fun canaryInterval(): Number

    public fun canaryPercentage(): Number

    public interface Builder {
      public fun canaryInterval(canaryInterval: Number) {
      }

      public fun canaryPercentage(canaryPercentage: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty.Builder
          =
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty.builder()

      public override fun canaryInterval(canaryInterval: Number) {
        cdkBuilder.canaryInterval(canaryInterval)
      }

      public override fun canaryPercentage(canaryPercentage: Number) {
        cdkBuilder.canaryPercentage(canaryPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty,
    ) : TimeBasedCanaryProperty {
      public override fun canaryInterval(): Number = unwrap(this).getCanaryInterval()

      public override fun canaryPercentage(): Number = unwrap(this).getCanaryPercentage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimeBasedCanaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty):
          TimeBasedCanaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeBasedCanaryProperty):
          software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig.TimeBasedCanaryProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
