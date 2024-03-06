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

package io.cloudshiftdev.awscdkdsl.services.managedblockchain

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.managedblockchain.CfnAccessorProps

/**
 * Properties for defining a `CfnAccessor`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * CfnAccessorProps cfnAccessorProps = CfnAccessorProps.builder()
 * .accessorType("accessorType")
 * // the properties below are optional
 * .networkType("networkType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html)
 */
@CdkDslMarker
public class CfnAccessorPropsDsl {
    private val cdkBuilder: CfnAccessorProps.Builder = CfnAccessorProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param accessorType The type of the accessor.
     *
     * Currently, accessor type is restricted to `BILLING_TOKEN` .
     */
    public fun accessorType(accessorType: String) {
        cdkBuilder.accessorType(accessorType)
    }

    /**
     * @param networkType The blockchain network that the `Accessor` token is created for.
     *
     * We recommend using the appropriate `networkType` value for the blockchain network that you
     * are creating the `Accessor` token for. You cannot use the value `ETHEREUM_MAINNET_AND_GOERLI`
     * to specify a `networkType` for your Accessor token.
     *
     * The default value of `ETHEREUM_MAINNET_AND_GOERLI` is only applied:
     * * when the `CreateAccessor` action does not set a `networkType` .
     * * to all existing `Accessor` tokens that were created before the `networkType` property was
     *   introduced.
     */
    public fun networkType(networkType: String) {
        cdkBuilder.networkType(networkType)
    }

    /**
     * @param tags The tags assigned to the Accessor. For more information about tags, see
     *   [Tagging Resources](https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html)
     *   in the *Amazon Managed Blockchain Ethereum Developer Guide* , or
     *   [Tagging Resources](https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html)
     *   in the *Amazon Managed Blockchain Hyperledger Fabric Developer Guide* .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags assigned to the Accessor. For more information about tags, see
     *   [Tagging Resources](https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html)
     *   in the *Amazon Managed Blockchain Ethereum Developer Guide* , or
     *   [Tagging Resources](https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html)
     *   in the *Amazon Managed Blockchain Hyperledger Fabric Developer Guide* .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAccessorProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
