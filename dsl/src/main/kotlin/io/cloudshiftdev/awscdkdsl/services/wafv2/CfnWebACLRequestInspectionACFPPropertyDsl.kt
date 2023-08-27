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

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * The criteria for inspecting account creation requests, used by the ACFP rule group to validate
 * and track account creation attempts.
 *
 * This is part of the `AWSManagedRulesACFPRuleSet` configuration in `ManagedRuleGroupConfig` .
 *
 * In these settings, you specify how your application accepts account creation attempts by
 * providing the request payload type and the names of the fields within the request body where the
 * username, password, email, and primary address and phone number fields are provided.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * RequestInspectionACFPProperty requestInspectionACFPProperty =
 * RequestInspectionACFPProperty.builder()
 * .payloadType("payloadType")
 * // the properties below are optional
 * .addressFields(List.of(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build()))
 * .emailField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .passwordField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .phoneNumberFields(List.of(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build()))
 * .usernameField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspectionacfp.html)
 */
@CdkDslMarker
public class CfnWebACLRequestInspectionACFPPropertyDsl {
    private val cdkBuilder: CfnWebACL.RequestInspectionACFPProperty.Builder =
        CfnWebACL.RequestInspectionACFPProperty.builder()

    private val _addressFields: MutableList<Any> = mutableListOf()

    private val _phoneNumberFields: MutableList<Any> = mutableListOf()

    /**
     * @param addressFields The names of the fields in the request payload that contain your
     *   customer's primary physical address. Order the address fields in the array exactly as they
     *   are ordered in the request payload.
     *
     * How you specify the address fields depends on the request inspection payload type.
     * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
     *   about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * For example, for the JSON payload `{ "form": { "primaryaddressline1": "THE_ADDRESS1",
     * "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }` , the
     * address field idenfiers are `/form/primaryaddressline1` , `/form/primaryaddressline2` , and
     * `/form/primaryaddressline3` .
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with input elements named `primaryaddressline1` ,
     * `primaryaddressline2` , and `primaryaddressline3` , the address fields identifiers are
     * `primaryaddressline1` , `primaryaddressline2` , and `primaryaddressline3` .
     */
    public fun addressFields(vararg addressFields: Any) {
        _addressFields.addAll(listOf(*addressFields))
    }

    /**
     * @param addressFields The names of the fields in the request payload that contain your
     *   customer's primary physical address. Order the address fields in the array exactly as they
     *   are ordered in the request payload.
     *
     * How you specify the address fields depends on the request inspection payload type.
     * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
     *   about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * For example, for the JSON payload `{ "form": { "primaryaddressline1": "THE_ADDRESS1",
     * "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }` , the
     * address field idenfiers are `/form/primaryaddressline1` , `/form/primaryaddressline2` , and
     * `/form/primaryaddressline3` .
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with input elements named `primaryaddressline1` ,
     * `primaryaddressline2` , and `primaryaddressline3` , the address fields identifiers are
     * `primaryaddressline1` , `primaryaddressline2` , and `primaryaddressline3` .
     */
    public fun addressFields(addressFields: Collection<Any>) {
        _addressFields.addAll(addressFields)
    }

    /**
     * @param addressFields The names of the fields in the request payload that contain your
     *   customer's primary physical address. Order the address fields in the array exactly as they
     *   are ordered in the request payload.
     *
     * How you specify the address fields depends on the request inspection payload type.
     * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
     *   about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * For example, for the JSON payload `{ "form": { "primaryaddressline1": "THE_ADDRESS1",
     * "primaryaddressline2": "THE_ADDRESS2", "primaryaddressline3": "THE_ADDRESS3" } }` , the
     * address field idenfiers are `/form/primaryaddressline1` , `/form/primaryaddressline2` , and
     * `/form/primaryaddressline3` .
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with input elements named `primaryaddressline1` ,
     * `primaryaddressline2` , and `primaryaddressline3` , the address fields identifiers are
     * `primaryaddressline1` , `primaryaddressline2` , and `primaryaddressline3` .
     */
    public fun addressFields(addressFields: IResolvable) {
        cdkBuilder.addressFields(addressFields)
    }

    /**
     * @param emailField The name of the field in the request payload that contains your customer's
     *   email. How you specify this depends on the request inspection payload type.
     * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
     *   JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * For example, for the JSON payload `{ "form": { "email": "THE_EMAIL" } }` , the email field
     * specification is `/form/email` .
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with the input element named `email1` , the email field
     * specification is `email1` .
     */
    public fun emailField(emailField: IResolvable) {
        cdkBuilder.emailField(emailField)
    }

    /**
     * @param emailField The name of the field in the request payload that contains your customer's
     *   email. How you specify this depends on the request inspection payload type.
     * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
     *   JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * For example, for the JSON payload `{ "form": { "email": "THE_EMAIL" } }` , the email field
     * specification is `/form/email` .
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with the input element named `email1` , the email field
     * specification is `email1` .
     */
    public fun emailField(emailField: CfnWebACL.FieldIdentifierProperty) {
        cdkBuilder.emailField(emailField)
    }

    /**
     * @param passwordField The name of the field in the request payload that contains your
     *   customer's password. How you specify this depends on the request inspection payload type.
     * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
     *   JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the password
     * field specification is `/form/password` .
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with the input element named `password1` , the password field
     * specification is `password1` .
     */
    public fun passwordField(passwordField: IResolvable) {
        cdkBuilder.passwordField(passwordField)
    }

    /**
     * @param passwordField The name of the field in the request payload that contains your
     *   customer's password. How you specify this depends on the request inspection payload type.
     * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
     *   JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the password
     * field specification is `/form/password` .
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with the input element named `password1` , the password field
     * specification is `password1` .
     */
    public fun passwordField(passwordField: CfnWebACL.FieldIdentifierProperty) {
        cdkBuilder.passwordField(passwordField)
    }

    /**
     * @param payloadType The payload type for your account creation endpoint, either JSON or form
     *   encoded.
     */
    public fun payloadType(payloadType: String) {
        cdkBuilder.payloadType(payloadType)
    }

    /**
     * @param phoneNumberFields The names of the fields in the request payload that contain your
     *   customer's primary phone number. Order the phone number fields in the array exactly as they
     *   are ordered in the request payload.
     *
     * How you specify the phone number fields depends on the request inspection payload type.
     * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
     *   about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * For example, for the JSON payload `{ "form": { "primaryphoneline1": "THE_PHONE1",
     * "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }` , the phone number
     * field identifiers are `/form/primaryphoneline1` , `/form/primaryphoneline2` , and
     * `/form/primaryphoneline3` .
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with input elements named `primaryphoneline1` ,
     * `primaryphoneline2` , and `primaryphoneline3` , the phone number field identifiers are
     * `primaryphoneline1` , `primaryphoneline2` , and `primaryphoneline3` .
     */
    public fun phoneNumberFields(vararg phoneNumberFields: Any) {
        _phoneNumberFields.addAll(listOf(*phoneNumberFields))
    }

    /**
     * @param phoneNumberFields The names of the fields in the request payload that contain your
     *   customer's primary phone number. Order the phone number fields in the array exactly as they
     *   are ordered in the request payload.
     *
     * How you specify the phone number fields depends on the request inspection payload type.
     * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
     *   about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * For example, for the JSON payload `{ "form": { "primaryphoneline1": "THE_PHONE1",
     * "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }` , the phone number
     * field identifiers are `/form/primaryphoneline1` , `/form/primaryphoneline2` , and
     * `/form/primaryphoneline3` .
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with input elements named `primaryphoneline1` ,
     * `primaryphoneline2` , and `primaryphoneline3` , the phone number field identifiers are
     * `primaryphoneline1` , `primaryphoneline2` , and `primaryphoneline3` .
     */
    public fun phoneNumberFields(phoneNumberFields: Collection<Any>) {
        _phoneNumberFields.addAll(phoneNumberFields)
    }

    /**
     * @param phoneNumberFields The names of the fields in the request payload that contain your
     *   customer's primary phone number. Order the phone number fields in the array exactly as they
     *   are ordered in the request payload.
     *
     * How you specify the phone number fields depends on the request inspection payload type.
     * * For JSON payloads, specify the field identifiers in JSON pointer syntax. For information
     *   about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * For example, for the JSON payload `{ "form": { "primaryphoneline1": "THE_PHONE1",
     * "primaryphoneline2": "THE_PHONE2", "primaryphoneline3": "THE_PHONE3" } }` , the phone number
     * field identifiers are `/form/primaryphoneline1` , `/form/primaryphoneline2` , and
     * `/form/primaryphoneline3` .
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with input elements named `primaryphoneline1` ,
     * `primaryphoneline2` , and `primaryphoneline3` , the phone number field identifiers are
     * `primaryphoneline1` , `primaryphoneline2` , and `primaryphoneline3` .
     */
    public fun phoneNumberFields(phoneNumberFields: IResolvable) {
        cdkBuilder.phoneNumberFields(phoneNumberFields)
    }

    /**
     * @param usernameField The name of the field in the request payload that contains your
     *   customer's username. How you specify this depends on the request inspection payload type.
     * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
     *   JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the username
     * field specification is `/form/username` .
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with the input element named `username1` , the username field
     * specification is `username1`
     */
    public fun usernameField(usernameField: IResolvable) {
        cdkBuilder.usernameField(usernameField)
    }

    /**
     * @param usernameField The name of the field in the request payload that contains your
     *   customer's username. How you specify this depends on the request inspection payload type.
     * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
     *   JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the username
     * field specification is `/form/username` .
     * * For form encoded payload types, use the HTML form names.
     *
     * For example, for an HTML form with the input element named `username1` , the username field
     * specification is `username1`
     */
    public fun usernameField(usernameField: CfnWebACL.FieldIdentifierProperty) {
        cdkBuilder.usernameField(usernameField)
    }

    public fun build(): CfnWebACL.RequestInspectionACFPProperty {
        if (_addressFields.isNotEmpty()) cdkBuilder.addressFields(_addressFields)
        if (_phoneNumberFields.isNotEmpty()) cdkBuilder.phoneNumberFields(_phoneNumberFields)
        return cdkBuilder.build()
    }
}
