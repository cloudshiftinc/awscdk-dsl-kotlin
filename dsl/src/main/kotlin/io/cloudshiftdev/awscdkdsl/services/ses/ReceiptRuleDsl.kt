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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.IReceiptRule
import software.amazon.awscdk.services.ses.IReceiptRuleAction
import software.amazon.awscdk.services.ses.IReceiptRuleSet
import software.amazon.awscdk.services.ses.ReceiptRule
import software.amazon.awscdk.services.ses.TlsPolicy
import software.constructs.Construct

/**
 * A new receipt rule.
 *
 * Example:
 * ```
 * ReceiptRuleSet ruleSet = new ReceiptRuleSet(this, "RuleSet");
 * ReceiptRule awsRule = ruleSet.addRule("Aws", ReceiptRuleOptions.builder()
 * .recipients(List.of("aws.com"))
 * .build());
 * ```
 */
@CdkDslMarker
public class ReceiptRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ReceiptRule.Builder = ReceiptRule.Builder.create(scope, id)

    private val _actions: MutableList<IReceiptRuleAction> = mutableListOf()

    private val _recipients: MutableList<String> = mutableListOf()

    /**
     * An ordered list of actions to perform on messages that match at least one of the recipient
     * email addresses or domains specified in the receipt rule.
     *
     * Default: - No actions.
     *
     * @param actions An ordered list of actions to perform on messages that match at least one of
     *   the recipient email addresses or domains specified in the receipt rule.
     */
    public fun actions(vararg actions: IReceiptRuleAction) {
        _actions.addAll(listOf(*actions))
    }

    /**
     * An ordered list of actions to perform on messages that match at least one of the recipient
     * email addresses or domains specified in the receipt rule.
     *
     * Default: - No actions.
     *
     * @param actions An ordered list of actions to perform on messages that match at least one of
     *   the recipient email addresses or domains specified in the receipt rule.
     */
    public fun actions(actions: Collection<IReceiptRuleAction>) {
        _actions.addAll(actions)
    }

    /**
     * An existing rule after which the new rule will be placed.
     *
     * Default: - The new rule is inserted at the beginning of the rule list.
     *
     * @param after An existing rule after which the new rule will be placed.
     */
    public fun after(after: IReceiptRule) {
        cdkBuilder.after(after)
    }

    /**
     * Whether the rule is active.
     *
     * Default: true
     *
     * @param enabled Whether the rule is active.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * The name for the rule.
     *
     * Default: - A CloudFormation generated name.
     *
     * @param receiptRuleName The name for the rule.
     */
    public fun receiptRuleName(receiptRuleName: String) {
        cdkBuilder.receiptRuleName(receiptRuleName)
    }

    /**
     * The recipient domains and email addresses that the receipt rule applies to.
     *
     * Default: - Match all recipients under all verified domains.
     *
     * @param recipients The recipient domains and email addresses that the receipt rule applies to.
     */
    public fun recipients(vararg recipients: String) {
        _recipients.addAll(listOf(*recipients))
    }

    /**
     * The recipient domains and email addresses that the receipt rule applies to.
     *
     * Default: - Match all recipients under all verified domains.
     *
     * @param recipients The recipient domains and email addresses that the receipt rule applies to.
     */
    public fun recipients(recipients: Collection<String>) {
        _recipients.addAll(recipients)
    }

    /**
     * The name of the rule set that the receipt rule will be added to.
     *
     * @param ruleSet The name of the rule set that the receipt rule will be added to.
     */
    public fun ruleSet(ruleSet: IReceiptRuleSet) {
        cdkBuilder.ruleSet(ruleSet)
    }

    /**
     * Whether to scan for spam and viruses.
     *
     * Default: false
     *
     * @param scanEnabled Whether to scan for spam and viruses.
     */
    public fun scanEnabled(scanEnabled: Boolean) {
        cdkBuilder.scanEnabled(scanEnabled)
    }

    /**
     * Whether Amazon SES should require that incoming email is delivered over a connection
     * encrypted with Transport Layer Security (TLS).
     *
     * Default: - Optional which will not check for TLS.
     *
     * @param tlsPolicy Whether Amazon SES should require that incoming email is delivered over a
     *   connection encrypted with Transport Layer Security (TLS).
     */
    public fun tlsPolicy(tlsPolicy: TlsPolicy) {
        cdkBuilder.tlsPolicy(tlsPolicy)
    }

    public fun build(): ReceiptRule {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        if (_recipients.isNotEmpty()) cdkBuilder.recipients(_recipients)
        return cdkBuilder.build()
    }
}
