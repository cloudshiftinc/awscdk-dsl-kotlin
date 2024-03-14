package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ConfigSetProps {
  /**
   * The definitions of each config set.
   */
  public fun configSets(): Map<String, List<String>>

  /**
   * The sets of configs to pick from.
   */
  public fun configs(): Map<String, InitConfig>

  /**
   * A builder for [ConfigSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configSets The definitions of each config set. 
     */
    public fun configSets(configSets: Map<String, List<String>>)

    /**
     * @param configs The sets of configs to pick from. 
     */
    public fun configs(configs: Map<String, InitConfig>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ConfigSetProps.Builder =
        software.amazon.awscdk.services.ec2.ConfigSetProps.builder()

    /**
     * @param configSets The definitions of each config set. 
     */
    override fun configSets(configSets: Map<String, List<String>>) {
      cdkBuilder.configSets(configSets)
    }

    /**
     * @param configs The sets of configs to pick from. 
     */
    override fun configs(configs: Map<String, InitConfig>) {
      cdkBuilder.configs(configs.mapValues{InitConfig.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.ec2.ConfigSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ConfigSetProps,
  ) : CdkObject(cdkObject), ConfigSetProps {
    /**
     * The definitions of each config set.
     */
    override fun configSets(): Map<String, List<String>> = unwrap(this).getConfigSets() ?:
        emptyMap()

    /**
     * The sets of configs to pick from.
     */
    override fun configs(): Map<String, InitConfig> =
        unwrap(this).getConfigs().mapValues{InitConfig.wrap(it.value)}
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConfigSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ConfigSetProps): ConfigSetProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigSetProps): software.amazon.awscdk.services.ec2.ConfigSetProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ConfigSetProps
  }
}
