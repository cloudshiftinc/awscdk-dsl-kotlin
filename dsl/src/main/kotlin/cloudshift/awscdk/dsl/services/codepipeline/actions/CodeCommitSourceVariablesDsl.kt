@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables
import kotlin.String

@CdkDslMarker
public class CodeCommitSourceVariablesDsl {
    private val cdkBuilder: CodeCommitSourceVariables.Builder = CodeCommitSourceVariables.builder()

    public fun authorDate(authorDate: String) {
        cdkBuilder.authorDate(authorDate)
    }

    public fun branchName(branchName: String) {
        cdkBuilder.branchName(branchName)
    }

    public fun commitId(commitId: String) {
        cdkBuilder.commitId(commitId)
    }

    public fun commitMessage(commitMessage: String) {
        cdkBuilder.commitMessage(commitMessage)
    }

    public fun committerDate(committerDate: String) {
        cdkBuilder.committerDate(committerDate)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): CodeCommitSourceVariables = cdkBuilder.build()
}
