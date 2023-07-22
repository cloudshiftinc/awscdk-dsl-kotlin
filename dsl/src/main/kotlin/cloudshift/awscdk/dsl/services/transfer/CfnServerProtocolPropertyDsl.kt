@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.transfer.CfnServer

/**
 * Specifies the file transfer protocol or protocols over which your file transfer protocol client
 * can connect to your server's endpoint.
 *
 * The available protocols are:
 *
 * * `SFTP` (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
 * * `FTPS` (File Transfer Protocol Secure): File transfer with TLS encryption
 * * `FTP` (File Transfer Protocol): Unencrypted file transfer
 * * `AS2` (Applicability Statement 2): used for transporting structured business-to-business data
 *
 *
 * * If you select `FTPS` , you must choose a certificate stored in AWS Certificate Manager (ACM)
 * which is used to identify your server when clients connect to it over FTPS.
 * * If `Protocol` includes either `FTP` or `FTPS` , then the `EndpointType` must be `VPC` and the
 * `IdentityProviderType` must be either `AWS_DIRECTORY_SERVICE` , `AWS_LAMBDA` , or `API_GATEWAY` .
 * * If `Protocol` includes `FTP` , then `AddressAllocationIds` cannot be associated.
 * * If `Protocol` is set only to `SFTP` , the `EndpointType` can be set to `PUBLIC` and the
 * `IdentityProviderType` can be set any of the supported identity types: `SERVICE_MANAGED` ,
 * `AWS_DIRECTORY_SERVICE` , `AWS_LAMBDA` , or `API_GATEWAY` .
 * * If `Protocol` includes `AS2` , then the `EndpointType` must be `VPC` , and domain must be
 * Amazon S3.
 *
 *
 * The `Protocols` parameter is an array of `Protocol` strings.
 *
 * *Required* : No
 *
 * *Type* : String
 *
 * *Allowed values* : One or more of `SFTP` , `FTPS` , `FTP` , `AS2`
 *
 * Update requires: [No
 * interruption](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * ProtocolProperty protocolProperty = ProtocolProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-protocol.html)
 */
@CdkDslMarker
public class CfnServerProtocolPropertyDsl {
  private val cdkBuilder: CfnServer.ProtocolProperty.Builder = CfnServer.ProtocolProperty.builder()

  public fun build(): CfnServer.ProtocolProperty = cdkBuilder.build()
}
