@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.transfer.CfnServer

/**
 * The protocol settings that are configured for your server.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * ProtocolDetailsProperty protocolDetailsProperty = ProtocolDetailsProperty.builder()
 * .as2Transports(List.of("as2Transports"))
 * .passiveIp("passiveIp")
 * .setStatOption("setStatOption")
 * .tlsSessionResumptionMode("tlsSessionResumptionMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-protocoldetails.html)
 */
@CdkDslMarker
public class CfnServerProtocolDetailsPropertyDsl {
  private val cdkBuilder: CfnServer.ProtocolDetailsProperty.Builder =
      CfnServer.ProtocolDetailsProperty.builder()

  private val _as2Transports: MutableList<String> = mutableListOf()

  /**
   * @param as2Transports List of `As2Transport` objects.
   */
  public fun as2Transports(vararg as2Transports: String) {
    _as2Transports.addAll(listOf(*as2Transports))
  }

  /**
   * @param as2Transports List of `As2Transport` objects.
   */
  public fun as2Transports(as2Transports: Collection<String>) {
    _as2Transports.addAll(as2Transports)
  }

  /**
   * @param passiveIp Indicates passive mode, for FTP and FTPS protocols.
   * Enter a single IPv4 address, such as the public IP address of a firewall, router, or load
   * balancer. For example:
   *
   * `aws transfer update-server --protocol-details PassiveIp=0.0.0.0`
   *
   * Replace `0.0.0.0` in the example above with the actual IP address you want to use.
   *
   *
   * If you change the `PassiveIp` value, you must stop and then restart your Transfer Family server
   * for the change to take effect. For details on using passive mode (PASV) in a NAT environment, see
   * [Configuring your FTPS server behind a firewall or NAT with AWS Transfer
   * Family](https://docs.aws.amazon.com/storage/configuring-your-ftps-server-behind-a-firewall-or-nat-with-aws-transfer-family/)
   * .
   *
   *
   * *Special values*
   *
   * The `AUTO` and `0.0.0.0` are special values for the `PassiveIp` parameter. The value
   * `PassiveIp=AUTO` is assigned by default to FTP and FTPS type servers. In this case, the server
   * automatically responds with one of the endpoint IPs within the PASV response. `PassiveIp=0.0.0.0`
   * has a more unique application for its usage. For example, if you have a High Availability (HA)
   * Network Load Balancer (NLB) environment, where you have 3 subnets, you can only specify a single
   * IP address using the `PassiveIp` parameter. This reduces the effectiveness of having High
   * Availability. In this case, you can specify `PassiveIp=0.0.0.0` . This tells the client to use the
   * same IP address as the Control connection and utilize all AZs for their connections. Note,
   * however, that not all FTP clients support the `PassiveIp=0.0.0.0` response. FileZilla and WinSCP
   * do support it. If you are using other clients, check to see if your client supports the
   * `PassiveIp=0.0.0.0` response.
   */
  public fun passiveIp(passiveIp: String) {
    cdkBuilder.passiveIp(passiveIp)
  }

  /**
   * @param setStatOption Use the `SetStatOption` to ignore the error that is generated when the
   * client attempts to use `SETSTAT` on a file you are uploading to an S3 bucket.
   * Some SFTP file transfer clients can attempt to change the attributes of remote files, including
   * timestamp and permissions, using commands, such as `SETSTAT` when uploading the file. However,
   * these commands are not compatible with object storage systems, such as Amazon S3. Due to this
   * incompatibility, file uploads from these clients can result in errors even when the file is
   * otherwise successfully uploaded.
   *
   * Set the value to `ENABLE_NO_OP` to have the Transfer Family server ignore the `SETSTAT`
   * command, and upload files without needing to make any changes to your SFTP client. While the
   * `SetStatOption` `ENABLE_NO_OP` setting ignores the error, it does generate a log entry in Amazon
   * CloudWatch Logs, so you can determine when the client is making a `SETSTAT` call.
   *
   *
   * If you want to preserve the original timestamp for your file, and modify other file attributes
   * using `SETSTAT` , you can use Amazon EFS as backend storage with Transfer Family.
   */
  public fun setStatOption(setStatOption: String) {
    cdkBuilder.setStatOption(setStatOption)
  }

  /**
   * @param tlsSessionResumptionMode A property used with Transfer Family servers that use the FTPS
   * protocol.
   * TLS Session Resumption provides a mechanism to resume or share a negotiated secret key between
   * the control and data connection for an FTPS session. `TlsSessionResumptionMode` determines whether
   * or not the server resumes recent, negotiated sessions through a unique session ID. This property
   * is available during `CreateServer` and `UpdateServer` calls. If a `TlsSessionResumptionMode` value
   * is not specified during `CreateServer` , it is set to `ENFORCED` by default.
   *
   * * `DISABLED` : the server does not process TLS session resumption client requests and creates a
   * new TLS session for each request.
   * * `ENABLED` : the server processes and accepts clients that are performing TLS session
   * resumption. The server doesn't reject client data connections that do not perform the TLS session
   * resumption client processing.
   * * `ENFORCED` : the server processes and accepts clients that are performing TLS session
   * resumption. The server rejects client data connections that do not perform the TLS session
   * resumption client processing. Before you set the value to `ENFORCED` , test your clients.
   *
   *
   * Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session
   * resumption, you prevent any connections from FTPS clients that don't perform the protocol
   * negotiation. To determine whether or not you can use the `ENFORCED` value, you need to test your
   * clients.
   */
  public fun tlsSessionResumptionMode(tlsSessionResumptionMode: String) {
    cdkBuilder.tlsSessionResumptionMode(tlsSessionResumptionMode)
  }

  public fun build(): CfnServer.ProtocolDetailsProperty {
    if(_as2Transports.isNotEmpty()) cdkBuilder.as2Transports(_as2Transports)
    return cdkBuilder.build()
  }
}
