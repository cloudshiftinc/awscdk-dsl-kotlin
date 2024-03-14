package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface VirtualNodeBaseProps {
  public fun accessLog(): AccessLog? = unwrap(this).getAccessLog()?.let(AccessLog::wrap)

  public fun backendDefaults(): BackendDefaults? =
      unwrap(this).getBackendDefaults()?.let(BackendDefaults::wrap)

  public fun backends(): List<Backend> = unwrap(this).getBackends()?.map(Backend::wrap) ?:
      emptyList()

  public fun listeners(): List<VirtualNodeListener> =
      unwrap(this).getListeners()?.map(VirtualNodeListener::wrap) ?: emptyList()

  public fun serviceDiscovery(): ServiceDiscovery? =
      unwrap(this).getServiceDiscovery()?.let(ServiceDiscovery::wrap)

  public fun virtualNodeName(): String? = unwrap(this).getVirtualNodeName()

  public interface Builder {
    public fun accessLog(accessLog: AccessLog) {
    }

    public fun backendDefaults(backendDefaults: BackendDefaults) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f27f52f1a61b325e09aeeb9cc5b3b56911be4380660857da24f790913fcc40e1")
    public fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit) {
    }

    public fun backends(backends: List<Backend>) {
    }

    public fun listeners(listeners: List<VirtualNodeListener>) {
    }

    public fun serviceDiscovery(serviceDiscovery: ServiceDiscovery) {
    }

    public fun virtualNodeName(virtualNodeName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps.Builder =
        software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps.builder()

    public override fun accessLog(accessLog: AccessLog) {
      cdkBuilder.accessLog(accessLog.let(AccessLog::unwrap))
    }

    public override fun backendDefaults(backendDefaults: BackendDefaults) {
      cdkBuilder.backendDefaults(backendDefaults.let(BackendDefaults::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f27f52f1a61b325e09aeeb9cc5b3b56911be4380660857da24f790913fcc40e1")
    public override fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit): Unit =
        backendDefaults(BackendDefaults(backendDefaults))

    public override fun backends(backends: List<Backend>) {
      cdkBuilder.backends(backends.map(Backend::unwrap))
    }

    public override fun listeners(listeners: List<VirtualNodeListener>) {
      cdkBuilder.listeners(listeners.map(VirtualNodeListener::unwrap))
    }

    public override fun serviceDiscovery(serviceDiscovery: ServiceDiscovery) {
      cdkBuilder.serviceDiscovery(serviceDiscovery.let(ServiceDiscovery::unwrap))
    }

    public override fun virtualNodeName(virtualNodeName: String) {
      cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps,
  ) : VirtualNodeBaseProps {
    public override fun accessLog(): AccessLog? = unwrap(this).getAccessLog()?.let(AccessLog::wrap)

    public override fun backendDefaults(): BackendDefaults? =
        unwrap(this).getBackendDefaults()?.let(BackendDefaults::wrap)

    public override fun backends(): List<Backend> = unwrap(this).getBackends()?.map(Backend::wrap)
        ?: emptyList()

    public override fun listeners(): List<VirtualNodeListener> =
        unwrap(this).getListeners()?.map(VirtualNodeListener::wrap) ?: emptyList()

    public override fun serviceDiscovery(): ServiceDiscovery? =
        unwrap(this).getServiceDiscovery()?.let(ServiceDiscovery::wrap)

    public override fun virtualNodeName(): String? = unwrap(this).getVirtualNodeName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualNodeBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps):
        VirtualNodeBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualNodeBaseProps):
        software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps = (wrapped as
        Wrapper).cdkObject
  }
}
