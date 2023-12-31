@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.eks.AlbScheme
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubernetesManifestProps

/**
 * Properties for KubernetesManifest.
 *
 * Example:
 * ```
 * Cluster cluster;
 * Map&lt;String, String&gt; appLabel = Map.of("app", "hello-kubernetes");
 * Map&lt;String, Object&gt; deployment = Map.of(
 * "apiVersion", "apps/v1",
 * "kind", "Deployment",
 * "metadata", Map.of("name", "hello-kubernetes"),
 * "spec", Map.of(
 * "replicas", 3,
 * "selector", Map.of("matchLabels", appLabel),
 * "template", Map.of(
 * "metadata", Map.of("labels", appLabel),
 * "spec", Map.of(
 * "containers", List.of(Map.of(
 * "name", "hello-kubernetes",
 * "image", "paulbouwer/hello-kubernetes:1.5",
 * "ports", List.of(Map.of("containerPort", 8080))))))));
 * Map&lt;String, Object&gt; service = Map.of(
 * "apiVersion", "v1",
 * "kind", "Service",
 * "metadata", Map.of("name", "hello-kubernetes"),
 * "spec", Map.of(
 * "type", "LoadBalancer",
 * "ports", List.of(Map.of("port", 80, "targetPort", 8080)),
 * "selector", appLabel));
 * // option 1: use a construct
 * // option 1: use a construct
 * KubernetesManifest.Builder.create(this, "hello-kub")
 * .cluster(cluster)
 * .manifest(List.of(deployment, service))
 * .build();
 * // or, option2: use `addManifest`
 * cluster.addManifest("hello-kub", service, deployment);
 * ```
 */
@CdkDslMarker
public class KubernetesManifestPropsDsl {
    private val cdkBuilder: KubernetesManifestProps.Builder = KubernetesManifestProps.builder()

    private val _manifest: MutableList<Map<String, Any>> = mutableListOf()

    /**
     * @param cluster The EKS cluster to apply this manifest to. [disable-awslint:ref-via-interface]
     */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * @param ingressAlb Automatically detect `Ingress` resources in the manifest and annotate them
     *   so they are picked up by an ALB Ingress Controller.
     */
    public fun ingressAlb(ingressAlb: Boolean) {
        cdkBuilder.ingressAlb(ingressAlb)
    }

    /**
     * @param ingressAlbScheme Specify the ALB scheme that should be applied to `Ingress` resources.
     *   Only applicable if `ingressAlb` is set to `true`.
     */
    public fun ingressAlbScheme(ingressAlbScheme: AlbScheme) {
        cdkBuilder.ingressAlbScheme(ingressAlbScheme)
    }

    /**
     * @param manifest The manifest to apply. Consists of any number of child resources.
     *
     * When the resources are created/updated, this manifest will be applied to the cluster through
     * `kubectl apply` and when the resources or the stack is deleted, the resources in the manifest
     * will be deleted through `kubectl delete`.
     */
    public fun manifest(vararg manifest: Map<String, Any>) {
        _manifest.addAll(listOf(*manifest))
    }

    /**
     * @param manifest The manifest to apply. Consists of any number of child resources.
     *
     * When the resources are created/updated, this manifest will be applied to the cluster through
     * `kubectl apply` and when the resources or the stack is deleted, the resources in the manifest
     * will be deleted through `kubectl delete`.
     */
    public fun manifest(manifest: Collection<Map<String, Any>>) {
        _manifest.addAll(manifest)
    }

    /**
     * @param overwrite Overwrite any existing resources. If this is set, we will use `kubectl
     *   apply` instead of `kubectl create` when the resource is created. Otherwise, if there is
     *   already a resource in the cluster with the same name, the operation will fail.
     */
    public fun overwrite(overwrite: Boolean) {
        cdkBuilder.overwrite(overwrite)
    }

    /**
     * @param prune When a resource is removed from a Kubernetes manifest, it no longer appears in
     *   the manifest, and there is no way to know that this resource needs to be deleted. To
     *   address this, `kubectl apply` has a `--prune` option which will query the cluster for all
     *   resources with a specific label and will remove all the labeld resources that are not part
     *   of the applied manifest. If this option is disabled and a resource is removed, it will
     *   become "orphaned" and will not be deleted from the cluster.
     *
     * When this option is enabled (default), the construct will inject a label to all Kubernetes
     * resources included in this manifest which will be used to prune resources when the manifest
     * changes via `kubectl apply --prune`.
     *
     * The label name will be `aws.cdk.eks/prune-&lt;ADDR&gt;` where `&lt;ADDR&gt;` is the 42-char
     * unique address of this construct in the construct tree. Value is empty.
     */
    public fun prune(prune: Boolean) {
        cdkBuilder.prune(prune)
    }

    /** @param skipValidation A flag to signify if the manifest validation should be skipped. */
    public fun skipValidation(skipValidation: Boolean) {
        cdkBuilder.skipValidation(skipValidation)
    }

    public fun build(): KubernetesManifestProps {
        if (_manifest.isNotEmpty()) cdkBuilder.manifest(_manifest)
        return cdkBuilder.build()
    }
}
