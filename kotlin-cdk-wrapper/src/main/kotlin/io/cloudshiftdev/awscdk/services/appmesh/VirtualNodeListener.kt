@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class VirtualNodeListener internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeListener,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct): VirtualNodeListenerConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(VirtualNodeListenerConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeListener,
  ) : VirtualNodeListener(cdkObject)

  public companion object {
    public fun grpc(): VirtualNodeListener =
        software.amazon.awscdk.services.appmesh.VirtualNodeListener.grpc().let(VirtualNodeListener::wrap)

    public fun grpc(props: GrpcVirtualNodeListenerOptions): VirtualNodeListener =
        software.amazon.awscdk.services.appmesh.VirtualNodeListener.grpc(props.let(GrpcVirtualNodeListenerOptions::unwrap)).let(VirtualNodeListener::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb2b1f6fa7d1da90ae696046c02e92e450882306a98ab609e33360fd00536c4e")
    public fun grpc(props: GrpcVirtualNodeListenerOptions.Builder.() -> Unit): VirtualNodeListener =
        grpc(GrpcVirtualNodeListenerOptions(props))

    public fun http(): VirtualNodeListener =
        software.amazon.awscdk.services.appmesh.VirtualNodeListener.http().let(VirtualNodeListener::wrap)

    public fun http(props: HttpVirtualNodeListenerOptions): VirtualNodeListener =
        software.amazon.awscdk.services.appmesh.VirtualNodeListener.http(props.let(HttpVirtualNodeListenerOptions::unwrap)).let(VirtualNodeListener::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e2d9f1b7d7b158ad06f93bf4615ab89ac79fcbe878d94f847cd8a67b356eb62")
    public fun http(props: HttpVirtualNodeListenerOptions.Builder.() -> Unit): VirtualNodeListener =
        http(HttpVirtualNodeListenerOptions(props))

    public fun http2(): VirtualNodeListener =
        software.amazon.awscdk.services.appmesh.VirtualNodeListener.http2().let(VirtualNodeListener::wrap)

    public fun http2(props: Http2VirtualNodeListenerOptions): VirtualNodeListener =
        software.amazon.awscdk.services.appmesh.VirtualNodeListener.http2(props.let(Http2VirtualNodeListenerOptions::unwrap)).let(VirtualNodeListener::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57c7a14ecaa8d8e9473f6f6860f61be4a80d973601121707040b97e466a3dadb")
    public fun http2(props: Http2VirtualNodeListenerOptions.Builder.() -> Unit): VirtualNodeListener
        = http2(Http2VirtualNodeListenerOptions(props))

    public fun tcp(): VirtualNodeListener =
        software.amazon.awscdk.services.appmesh.VirtualNodeListener.tcp().let(VirtualNodeListener::wrap)

    public fun tcp(props: TcpVirtualNodeListenerOptions): VirtualNodeListener =
        software.amazon.awscdk.services.appmesh.VirtualNodeListener.tcp(props.let(TcpVirtualNodeListenerOptions::unwrap)).let(VirtualNodeListener::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("583a731564779daad1b152d5ac253d03f994ca7cd5e701de6280fe666f2284b5")
    public fun tcp(props: TcpVirtualNodeListenerOptions.Builder.() -> Unit): VirtualNodeListener =
        tcp(TcpVirtualNodeListenerOptions(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeListener):
        VirtualNodeListener = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualNodeListener):
        software.amazon.awscdk.services.appmesh.VirtualNodeListener = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualNodeListener
  }
}