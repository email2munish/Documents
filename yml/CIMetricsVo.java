
package com.example;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "build_id",
    "artifact_id",
    "ci_date",
    "sqr_issues",
    "new_sqr_issues",
    "sqr_rating",
    "new_sqr_rating",
    "sqr_remediation_effort",
    "new_sqr_remediation_effort",
    "sqm_issues",
    "new_sqm_issues",
    "sqm_remediation_effort",
    "new_sqm_remediation_effort",
    "sqm_debt_ratio",
    "new_sqm_debt_ratio",
    "sqm_rating",
    "new_sqm_rating",
    "coverage",
    "new_coverage",
    "lines_to_cover",
    "new_lines_to_cover",
    "uncovered_lines",
    "new_uncovered_lines",
    "tests",
    "test_errors",
    "test_failures",
    "skipped_tests",
    "test_execution_time",
    "test_success_density",
    "duplicated_lines_density",
    "new_duplicated_lines_density",
    "duplicated_lines",
    "duplicated_blocks",
    "new_duplicated_blocks",
    "duplicated_files",
    "new_lines",
    "ncloc",
    "lines",
    "statements",
    "functions",
    "classes",
    "files",
    "comment_lines",
    "comment_lines_density",
    "complexity",
    "cognitive_complexity",
    "violations",
    "new_violations",
    "open_issues",
    "accepted_issues",
    "false_positive_issues",
    "software_quality_blocker_issues",
    "software_quality_high_issues",
    "software_quality_medium_issues",
    "software_quality_low_issues",
    "sast_issue_low",
    "sast_issue_medium",
    "sast_issue_high",
    "sast_issue_critical",
    "sast_issue_blocker",
    "sast_issue_total",
    "sca_issue_low",
    "sca_issue_medium",
    "sca_issue_high",
    "sca_issue_critical",
    "sca_issue_blocker",
    "sca_issue_total",
    "twist_vulnerabilities_low",
    "twist_vulnerabilities_medium",
    "twist_vulnerabilities_high",
    "twist_vulnerabilities_critical",
    "twist_vulnerabilities_blocker",
    "twist_vulnerabilities_total",
    "twist_compliance_low",
    "twist_compliance_medium",
    "twist_compliance_high",
    "twist_compliance_critical",
    "twist_compliance_blocker",
    "twist_compliance_total"
})
@Generated("jsonschema2pojo")
public class CIMetricsVo {

    @JsonProperty("build_id")
    private Integer buildId;
    @JsonProperty("artifact_id")
    private Integer artifactId;
    @JsonProperty("ci_date")
    private String ciDate;
    @JsonProperty("sqr_issues")
    private Integer sqrIssues;
    @JsonProperty("new_sqr_issues")
    private Integer newSqrIssues;
    @JsonProperty("sqr_rating")
    private String sqrRating;
    @JsonProperty("new_sqr_rating")
    private String newSqrRating;
    @JsonProperty("sqr_remediation_effort")
    private String sqrRemediationEffort;
    @JsonProperty("new_sqr_remediation_effort")
    private String newSqrRemediationEffort;
    @JsonProperty("sqm_issues")
    private Integer sqmIssues;
    @JsonProperty("new_sqm_issues")
    private Integer newSqmIssues;
    @JsonProperty("sqm_remediation_effort")
    private String sqmRemediationEffort;
    @JsonProperty("new_sqm_remediation_effort")
    private String newSqmRemediationEffort;
    @JsonProperty("sqm_debt_ratio")
    private String sqmDebtRatio;
    @JsonProperty("new_sqm_debt_ratio")
    private String newSqmDebtRatio;
    @JsonProperty("sqm_rating")
    private String sqmRating;
    @JsonProperty("new_sqm_rating")
    private String newSqmRating;
    @JsonProperty("coverage")
    private Integer coverage;
    @JsonProperty("new_coverage")
    private Integer newCoverage;
    @JsonProperty("lines_to_cover")
    private Integer linesToCover;
    @JsonProperty("new_lines_to_cover")
    private Integer newLinesToCover;
    @JsonProperty("uncovered_lines")
    private Integer uncoveredLines;
    @JsonProperty("new_uncovered_lines")
    private Integer newUncoveredLines;
    @JsonProperty("tests")
    private Integer tests;
    @JsonProperty("test_errors")
    private Integer testErrors;
    @JsonProperty("test_failures")
    private Integer testFailures;
    @JsonProperty("skipped_tests")
    private Integer skippedTests;
    @JsonProperty("test_execution_time")
    private Integer testExecutionTime;
    @JsonProperty("test_success_density")
    private Integer testSuccessDensity;
    @JsonProperty("duplicated_lines_density")
    private Integer duplicatedLinesDensity;
    @JsonProperty("new_duplicated_lines_density")
    private Integer newDuplicatedLinesDensity;
    @JsonProperty("duplicated_lines")
    private Integer duplicatedLines;
    @JsonProperty("duplicated_blocks")
    private Integer duplicatedBlocks;
    @JsonProperty("new_duplicated_blocks")
    private Integer newDuplicatedBlocks;
    @JsonProperty("duplicated_files")
    private Integer duplicatedFiles;
    @JsonProperty("new_lines")
    private Integer newLines;
    @JsonProperty("ncloc")
    private Integer ncloc;
    @JsonProperty("lines")
    private Integer lines;
    @JsonProperty("statements")
    private Integer statements;
    @JsonProperty("functions")
    private Integer functions;
    @JsonProperty("classes")
    private Integer classes;
    @JsonProperty("files")
    private Integer files;
    @JsonProperty("comment_lines")
    private Integer commentLines;
    @JsonProperty("comment_lines_density")
    private Integer commentLinesDensity;
    @JsonProperty("complexity")
    private Integer complexity;
    @JsonProperty("cognitive_complexity")
    private Integer cognitiveComplexity;
    @JsonProperty("violations")
    private Integer violations;
    @JsonProperty("new_violations")
    private Integer newViolations;
    @JsonProperty("open_issues")
    private Integer openIssues;
    @JsonProperty("accepted_issues")
    private Integer acceptedIssues;
    @JsonProperty("false_positive_issues")
    private Integer falsePositiveIssues;
    @JsonProperty("software_quality_blocker_issues")
    private Integer softwareQualityBlockerIssues;
    @JsonProperty("software_quality_high_issues")
    private Integer softwareQualityHighIssues;
    @JsonProperty("software_quality_medium_issues")
    private Integer softwareQualityMediumIssues;
    @JsonProperty("software_quality_low_issues")
    private Integer softwareQualityLowIssues;
    @JsonProperty("sast_issue_low")
    private Integer sastIssueLow;
    @JsonProperty("sast_issue_medium")
    private Integer sastIssueMedium;
    @JsonProperty("sast_issue_high")
    private Integer sastIssueHigh;
    @JsonProperty("sast_issue_critical")
    private Integer sastIssueCritical;
    @JsonProperty("sast_issue_blocker")
    private Integer sastIssueBlocker;
    @JsonProperty("sast_issue_total")
    private Integer sastIssueTotal;
    @JsonProperty("sca_issue_low")
    private Integer scaIssueLow;
    @JsonProperty("sca_issue_medium")
    private Integer scaIssueMedium;
    @JsonProperty("sca_issue_high")
    private Integer scaIssueHigh;
    @JsonProperty("sca_issue_critical")
    private Integer scaIssueCritical;
    @JsonProperty("sca_issue_blocker")
    private Integer scaIssueBlocker;
    @JsonProperty("sca_issue_total")
    private Integer scaIssueTotal;
    @JsonProperty("twist_vulnerabilities_low")
    private Integer twistVulnerabilitiesLow;
    @JsonProperty("twist_vulnerabilities_medium")
    private Integer twistVulnerabilitiesMedium;
    @JsonProperty("twist_vulnerabilities_high")
    private Integer twistVulnerabilitiesHigh;
    @JsonProperty("twist_vulnerabilities_critical")
    private Integer twistVulnerabilitiesCritical;
    @JsonProperty("twist_vulnerabilities_blocker")
    private Integer twistVulnerabilitiesBlocker;
    @JsonProperty("twist_vulnerabilities_total")
    private Integer twistVulnerabilitiesTotal;
    @JsonProperty("twist_compliance_low")
    private Integer twistComplianceLow;
    @JsonProperty("twist_compliance_medium")
    private Integer twistComplianceMedium;
    @JsonProperty("twist_compliance_high")
    private Integer twistComplianceHigh;
    @JsonProperty("twist_compliance_critical")
    private Integer twistComplianceCritical;
    @JsonProperty("twist_compliance_blocker")
    private Integer twistComplianceBlocker;
    @JsonProperty("twist_compliance_total")
    private Integer twistComplianceTotal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("build_id")
    public Integer getBuildId() {
        return buildId;
    }

    @JsonProperty("build_id")
    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    @JsonProperty("artifact_id")
    public Integer getArtifactId() {
        return artifactId;
    }

    @JsonProperty("artifact_id")
    public void setArtifactId(Integer artifactId) {
        this.artifactId = artifactId;
    }

    @JsonProperty("ci_date")
    public String getCiDate() {
        return ciDate;
    }

    @JsonProperty("ci_date")
    public void setCiDate(String ciDate) {
        this.ciDate = ciDate;
    }

    @JsonProperty("sqr_issues")
    public Integer getSqrIssues() {
        return sqrIssues;
    }

    @JsonProperty("sqr_issues")
    public void setSqrIssues(Integer sqrIssues) {
        this.sqrIssues = sqrIssues;
    }

    @JsonProperty("new_sqr_issues")
    public Integer getNewSqrIssues() {
        return newSqrIssues;
    }

    @JsonProperty("new_sqr_issues")
    public void setNewSqrIssues(Integer newSqrIssues) {
        this.newSqrIssues = newSqrIssues;
    }

    @JsonProperty("sqr_rating")
    public String getSqrRating() {
        return sqrRating;
    }

    @JsonProperty("sqr_rating")
    public void setSqrRating(String sqrRating) {
        this.sqrRating = sqrRating;
    }

    @JsonProperty("new_sqr_rating")
    public String getNewSqrRating() {
        return newSqrRating;
    }

    @JsonProperty("new_sqr_rating")
    public void setNewSqrRating(String newSqrRating) {
        this.newSqrRating = newSqrRating;
    }

    @JsonProperty("sqr_remediation_effort")
    public String getSqrRemediationEffort() {
        return sqrRemediationEffort;
    }

    @JsonProperty("sqr_remediation_effort")
    public void setSqrRemediationEffort(String sqrRemediationEffort) {
        this.sqrRemediationEffort = sqrRemediationEffort;
    }

    @JsonProperty("new_sqr_remediation_effort")
    public String getNewSqrRemediationEffort() {
        return newSqrRemediationEffort;
    }

    @JsonProperty("new_sqr_remediation_effort")
    public void setNewSqrRemediationEffort(String newSqrRemediationEffort) {
        this.newSqrRemediationEffort = newSqrRemediationEffort;
    }

    @JsonProperty("sqm_issues")
    public Integer getSqmIssues() {
        return sqmIssues;
    }

    @JsonProperty("sqm_issues")
    public void setSqmIssues(Integer sqmIssues) {
        this.sqmIssues = sqmIssues;
    }

    @JsonProperty("new_sqm_issues")
    public Integer getNewSqmIssues() {
        return newSqmIssues;
    }

    @JsonProperty("new_sqm_issues")
    public void setNewSqmIssues(Integer newSqmIssues) {
        this.newSqmIssues = newSqmIssues;
    }

    @JsonProperty("sqm_remediation_effort")
    public String getSqmRemediationEffort() {
        return sqmRemediationEffort;
    }

    @JsonProperty("sqm_remediation_effort")
    public void setSqmRemediationEffort(String sqmRemediationEffort) {
        this.sqmRemediationEffort = sqmRemediationEffort;
    }

    @JsonProperty("new_sqm_remediation_effort")
    public String getNewSqmRemediationEffort() {
        return newSqmRemediationEffort;
    }

    @JsonProperty("new_sqm_remediation_effort")
    public void setNewSqmRemediationEffort(String newSqmRemediationEffort) {
        this.newSqmRemediationEffort = newSqmRemediationEffort;
    }

    @JsonProperty("sqm_debt_ratio")
    public String getSqmDebtRatio() {
        return sqmDebtRatio;
    }

    @JsonProperty("sqm_debt_ratio")
    public void setSqmDebtRatio(String sqmDebtRatio) {
        this.sqmDebtRatio = sqmDebtRatio;
    }

    @JsonProperty("new_sqm_debt_ratio")
    public String getNewSqmDebtRatio() {
        return newSqmDebtRatio;
    }

    @JsonProperty("new_sqm_debt_ratio")
    public void setNewSqmDebtRatio(String newSqmDebtRatio) {
        this.newSqmDebtRatio = newSqmDebtRatio;
    }

    @JsonProperty("sqm_rating")
    public String getSqmRating() {
        return sqmRating;
    }

    @JsonProperty("sqm_rating")
    public void setSqmRating(String sqmRating) {
        this.sqmRating = sqmRating;
    }

    @JsonProperty("new_sqm_rating")
    public String getNewSqmRating() {
        return newSqmRating;
    }

    @JsonProperty("new_sqm_rating")
    public void setNewSqmRating(String newSqmRating) {
        this.newSqmRating = newSqmRating;
    }

    @JsonProperty("coverage")
    public Integer getCoverage() {
        return coverage;
    }

    @JsonProperty("coverage")
    public void setCoverage(Integer coverage) {
        this.coverage = coverage;
    }

    @JsonProperty("new_coverage")
    public Integer getNewCoverage() {
        return newCoverage;
    }

    @JsonProperty("new_coverage")
    public void setNewCoverage(Integer newCoverage) {
        this.newCoverage = newCoverage;
    }

    @JsonProperty("lines_to_cover")
    public Integer getLinesToCover() {
        return linesToCover;
    }

    @JsonProperty("lines_to_cover")
    public void setLinesToCover(Integer linesToCover) {
        this.linesToCover = linesToCover;
    }

    @JsonProperty("new_lines_to_cover")
    public Integer getNewLinesToCover() {
        return newLinesToCover;
    }

    @JsonProperty("new_lines_to_cover")
    public void setNewLinesToCover(Integer newLinesToCover) {
        this.newLinesToCover = newLinesToCover;
    }

    @JsonProperty("uncovered_lines")
    public Integer getUncoveredLines() {
        return uncoveredLines;
    }

    @JsonProperty("uncovered_lines")
    public void setUncoveredLines(Integer uncoveredLines) {
        this.uncoveredLines = uncoveredLines;
    }

    @JsonProperty("new_uncovered_lines")
    public Integer getNewUncoveredLines() {
        return newUncoveredLines;
    }

    @JsonProperty("new_uncovered_lines")
    public void setNewUncoveredLines(Integer newUncoveredLines) {
        this.newUncoveredLines = newUncoveredLines;
    }

    @JsonProperty("tests")
    public Integer getTests() {
        return tests;
    }

    @JsonProperty("tests")
    public void setTests(Integer tests) {
        this.tests = tests;
    }

    @JsonProperty("test_errors")
    public Integer getTestErrors() {
        return testErrors;
    }

    @JsonProperty("test_errors")
    public void setTestErrors(Integer testErrors) {
        this.testErrors = testErrors;
    }

    @JsonProperty("test_failures")
    public Integer getTestFailures() {
        return testFailures;
    }

    @JsonProperty("test_failures")
    public void setTestFailures(Integer testFailures) {
        this.testFailures = testFailures;
    }

    @JsonProperty("skipped_tests")
    public Integer getSkippedTests() {
        return skippedTests;
    }

    @JsonProperty("skipped_tests")
    public void setSkippedTests(Integer skippedTests) {
        this.skippedTests = skippedTests;
    }

    @JsonProperty("test_execution_time")
    public Integer getTestExecutionTime() {
        return testExecutionTime;
    }

    @JsonProperty("test_execution_time")
    public void setTestExecutionTime(Integer testExecutionTime) {
        this.testExecutionTime = testExecutionTime;
    }

    @JsonProperty("test_success_density")
    public Integer getTestSuccessDensity() {
        return testSuccessDensity;
    }

    @JsonProperty("test_success_density")
    public void setTestSuccessDensity(Integer testSuccessDensity) {
        this.testSuccessDensity = testSuccessDensity;
    }

    @JsonProperty("duplicated_lines_density")
    public Integer getDuplicatedLinesDensity() {
        return duplicatedLinesDensity;
    }

    @JsonProperty("duplicated_lines_density")
    public void setDuplicatedLinesDensity(Integer duplicatedLinesDensity) {
        this.duplicatedLinesDensity = duplicatedLinesDensity;
    }

    @JsonProperty("new_duplicated_lines_density")
    public Integer getNewDuplicatedLinesDensity() {
        return newDuplicatedLinesDensity;
    }

    @JsonProperty("new_duplicated_lines_density")
    public void setNewDuplicatedLinesDensity(Integer newDuplicatedLinesDensity) {
        this.newDuplicatedLinesDensity = newDuplicatedLinesDensity;
    }

    @JsonProperty("duplicated_lines")
    public Integer getDuplicatedLines() {
        return duplicatedLines;
    }

    @JsonProperty("duplicated_lines")
    public void setDuplicatedLines(Integer duplicatedLines) {
        this.duplicatedLines = duplicatedLines;
    }

    @JsonProperty("duplicated_blocks")
    public Integer getDuplicatedBlocks() {
        return duplicatedBlocks;
    }

    @JsonProperty("duplicated_blocks")
    public void setDuplicatedBlocks(Integer duplicatedBlocks) {
        this.duplicatedBlocks = duplicatedBlocks;
    }

    @JsonProperty("new_duplicated_blocks")
    public Integer getNewDuplicatedBlocks() {
        return newDuplicatedBlocks;
    }

    @JsonProperty("new_duplicated_blocks")
    public void setNewDuplicatedBlocks(Integer newDuplicatedBlocks) {
        this.newDuplicatedBlocks = newDuplicatedBlocks;
    }

    @JsonProperty("duplicated_files")
    public Integer getDuplicatedFiles() {
        return duplicatedFiles;
    }

    @JsonProperty("duplicated_files")
    public void setDuplicatedFiles(Integer duplicatedFiles) {
        this.duplicatedFiles = duplicatedFiles;
    }

    @JsonProperty("new_lines")
    public Integer getNewLines() {
        return newLines;
    }

    @JsonProperty("new_lines")
    public void setNewLines(Integer newLines) {
        this.newLines = newLines;
    }

    @JsonProperty("ncloc")
    public Integer getNcloc() {
        return ncloc;
    }

    @JsonProperty("ncloc")
    public void setNcloc(Integer ncloc) {
        this.ncloc = ncloc;
    }

    @JsonProperty("lines")
    public Integer getLines() {
        return lines;
    }

    @JsonProperty("lines")
    public void setLines(Integer lines) {
        this.lines = lines;
    }

    @JsonProperty("statements")
    public Integer getStatements() {
        return statements;
    }

    @JsonProperty("statements")
    public void setStatements(Integer statements) {
        this.statements = statements;
    }

    @JsonProperty("functions")
    public Integer getFunctions() {
        return functions;
    }

    @JsonProperty("functions")
    public void setFunctions(Integer functions) {
        this.functions = functions;
    }

    @JsonProperty("classes")
    public Integer getClasses() {
        return classes;
    }

    @JsonProperty("classes")
    public void setClasses(Integer classes) {
        this.classes = classes;
    }

    @JsonProperty("files")
    public Integer getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(Integer files) {
        this.files = files;
    }

    @JsonProperty("comment_lines")
    public Integer getCommentLines() {
        return commentLines;
    }

    @JsonProperty("comment_lines")
    public void setCommentLines(Integer commentLines) {
        this.commentLines = commentLines;
    }

    @JsonProperty("comment_lines_density")
    public Integer getCommentLinesDensity() {
        return commentLinesDensity;
    }

    @JsonProperty("comment_lines_density")
    public void setCommentLinesDensity(Integer commentLinesDensity) {
        this.commentLinesDensity = commentLinesDensity;
    }

    @JsonProperty("complexity")
    public Integer getComplexity() {
        return complexity;
    }

    @JsonProperty("complexity")
    public void setComplexity(Integer complexity) {
        this.complexity = complexity;
    }

    @JsonProperty("cognitive_complexity")
    public Integer getCognitiveComplexity() {
        return cognitiveComplexity;
    }

    @JsonProperty("cognitive_complexity")
    public void setCognitiveComplexity(Integer cognitiveComplexity) {
        this.cognitiveComplexity = cognitiveComplexity;
    }

    @JsonProperty("violations")
    public Integer getViolations() {
        return violations;
    }

    @JsonProperty("violations")
    public void setViolations(Integer violations) {
        this.violations = violations;
    }

    @JsonProperty("new_violations")
    public Integer getNewViolations() {
        return newViolations;
    }

    @JsonProperty("new_violations")
    public void setNewViolations(Integer newViolations) {
        this.newViolations = newViolations;
    }

    @JsonProperty("open_issues")
    public Integer getOpenIssues() {
        return openIssues;
    }

    @JsonProperty("open_issues")
    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    @JsonProperty("accepted_issues")
    public Integer getAcceptedIssues() {
        return acceptedIssues;
    }

    @JsonProperty("accepted_issues")
    public void setAcceptedIssues(Integer acceptedIssues) {
        this.acceptedIssues = acceptedIssues;
    }

    @JsonProperty("false_positive_issues")
    public Integer getFalsePositiveIssues() {
        return falsePositiveIssues;
    }

    @JsonProperty("false_positive_issues")
    public void setFalsePositiveIssues(Integer falsePositiveIssues) {
        this.falsePositiveIssues = falsePositiveIssues;
    }

    @JsonProperty("software_quality_blocker_issues")
    public Integer getSoftwareQualityBlockerIssues() {
        return softwareQualityBlockerIssues;
    }

    @JsonProperty("software_quality_blocker_issues")
    public void setSoftwareQualityBlockerIssues(Integer softwareQualityBlockerIssues) {
        this.softwareQualityBlockerIssues = softwareQualityBlockerIssues;
    }

    @JsonProperty("software_quality_high_issues")
    public Integer getSoftwareQualityHighIssues() {
        return softwareQualityHighIssues;
    }

    @JsonProperty("software_quality_high_issues")
    public void setSoftwareQualityHighIssues(Integer softwareQualityHighIssues) {
        this.softwareQualityHighIssues = softwareQualityHighIssues;
    }

    @JsonProperty("software_quality_medium_issues")
    public Integer getSoftwareQualityMediumIssues() {
        return softwareQualityMediumIssues;
    }

    @JsonProperty("software_quality_medium_issues")
    public void setSoftwareQualityMediumIssues(Integer softwareQualityMediumIssues) {
        this.softwareQualityMediumIssues = softwareQualityMediumIssues;
    }

    @JsonProperty("software_quality_low_issues")
    public Integer getSoftwareQualityLowIssues() {
        return softwareQualityLowIssues;
    }

    @JsonProperty("software_quality_low_issues")
    public void setSoftwareQualityLowIssues(Integer softwareQualityLowIssues) {
        this.softwareQualityLowIssues = softwareQualityLowIssues;
    }

    @JsonProperty("sast_issue_low")
    public Integer getSastIssueLow() {
        return sastIssueLow;
    }

    @JsonProperty("sast_issue_low")
    public void setSastIssueLow(Integer sastIssueLow) {
        this.sastIssueLow = sastIssueLow;
    }

    @JsonProperty("sast_issue_medium")
    public Integer getSastIssueMedium() {
        return sastIssueMedium;
    }

    @JsonProperty("sast_issue_medium")
    public void setSastIssueMedium(Integer sastIssueMedium) {
        this.sastIssueMedium = sastIssueMedium;
    }

    @JsonProperty("sast_issue_high")
    public Integer getSastIssueHigh() {
        return sastIssueHigh;
    }

    @JsonProperty("sast_issue_high")
    public void setSastIssueHigh(Integer sastIssueHigh) {
        this.sastIssueHigh = sastIssueHigh;
    }

    @JsonProperty("sast_issue_critical")
    public Integer getSastIssueCritical() {
        return sastIssueCritical;
    }

    @JsonProperty("sast_issue_critical")
    public void setSastIssueCritical(Integer sastIssueCritical) {
        this.sastIssueCritical = sastIssueCritical;
    }

    @JsonProperty("sast_issue_blocker")
    public Integer getSastIssueBlocker() {
        return sastIssueBlocker;
    }

    @JsonProperty("sast_issue_blocker")
    public void setSastIssueBlocker(Integer sastIssueBlocker) {
        this.sastIssueBlocker = sastIssueBlocker;
    }

    @JsonProperty("sast_issue_total")
    public Integer getSastIssueTotal() {
        return sastIssueTotal;
    }

    @JsonProperty("sast_issue_total")
    public void setSastIssueTotal(Integer sastIssueTotal) {
        this.sastIssueTotal = sastIssueTotal;
    }

    @JsonProperty("sca_issue_low")
    public Integer getScaIssueLow() {
        return scaIssueLow;
    }

    @JsonProperty("sca_issue_low")
    public void setScaIssueLow(Integer scaIssueLow) {
        this.scaIssueLow = scaIssueLow;
    }

    @JsonProperty("sca_issue_medium")
    public Integer getScaIssueMedium() {
        return scaIssueMedium;
    }

    @JsonProperty("sca_issue_medium")
    public void setScaIssueMedium(Integer scaIssueMedium) {
        this.scaIssueMedium = scaIssueMedium;
    }

    @JsonProperty("sca_issue_high")
    public Integer getScaIssueHigh() {
        return scaIssueHigh;
    }

    @JsonProperty("sca_issue_high")
    public void setScaIssueHigh(Integer scaIssueHigh) {
        this.scaIssueHigh = scaIssueHigh;
    }

    @JsonProperty("sca_issue_critical")
    public Integer getScaIssueCritical() {
        return scaIssueCritical;
    }

    @JsonProperty("sca_issue_critical")
    public void setScaIssueCritical(Integer scaIssueCritical) {
        this.scaIssueCritical = scaIssueCritical;
    }

    @JsonProperty("sca_issue_blocker")
    public Integer getScaIssueBlocker() {
        return scaIssueBlocker;
    }

    @JsonProperty("sca_issue_blocker")
    public void setScaIssueBlocker(Integer scaIssueBlocker) {
        this.scaIssueBlocker = scaIssueBlocker;
    }

    @JsonProperty("sca_issue_total")
    public Integer getScaIssueTotal() {
        return scaIssueTotal;
    }

    @JsonProperty("sca_issue_total")
    public void setScaIssueTotal(Integer scaIssueTotal) {
        this.scaIssueTotal = scaIssueTotal;
    }

    @JsonProperty("twist_vulnerabilities_low")
    public Integer getTwistVulnerabilitiesLow() {
        return twistVulnerabilitiesLow;
    }

    @JsonProperty("twist_vulnerabilities_low")
    public void setTwistVulnerabilitiesLow(Integer twistVulnerabilitiesLow) {
        this.twistVulnerabilitiesLow = twistVulnerabilitiesLow;
    }

    @JsonProperty("twist_vulnerabilities_medium")
    public Integer getTwistVulnerabilitiesMedium() {
        return twistVulnerabilitiesMedium;
    }

    @JsonProperty("twist_vulnerabilities_medium")
    public void setTwistVulnerabilitiesMedium(Integer twistVulnerabilitiesMedium) {
        this.twistVulnerabilitiesMedium = twistVulnerabilitiesMedium;
    }

    @JsonProperty("twist_vulnerabilities_high")
    public Integer getTwistVulnerabilitiesHigh() {
        return twistVulnerabilitiesHigh;
    }

    @JsonProperty("twist_vulnerabilities_high")
    public void setTwistVulnerabilitiesHigh(Integer twistVulnerabilitiesHigh) {
        this.twistVulnerabilitiesHigh = twistVulnerabilitiesHigh;
    }

    @JsonProperty("twist_vulnerabilities_critical")
    public Integer getTwistVulnerabilitiesCritical() {
        return twistVulnerabilitiesCritical;
    }

    @JsonProperty("twist_vulnerabilities_critical")
    public void setTwistVulnerabilitiesCritical(Integer twistVulnerabilitiesCritical) {
        this.twistVulnerabilitiesCritical = twistVulnerabilitiesCritical;
    }

    @JsonProperty("twist_vulnerabilities_blocker")
    public Integer getTwistVulnerabilitiesBlocker() {
        return twistVulnerabilitiesBlocker;
    }

    @JsonProperty("twist_vulnerabilities_blocker")
    public void setTwistVulnerabilitiesBlocker(Integer twistVulnerabilitiesBlocker) {
        this.twistVulnerabilitiesBlocker = twistVulnerabilitiesBlocker;
    }

    @JsonProperty("twist_vulnerabilities_total")
    public Integer getTwistVulnerabilitiesTotal() {
        return twistVulnerabilitiesTotal;
    }

    @JsonProperty("twist_vulnerabilities_total")
    public void setTwistVulnerabilitiesTotal(Integer twistVulnerabilitiesTotal) {
        this.twistVulnerabilitiesTotal = twistVulnerabilitiesTotal;
    }

    @JsonProperty("twist_compliance_low")
    public Integer getTwistComplianceLow() {
        return twistComplianceLow;
    }

    @JsonProperty("twist_compliance_low")
    public void setTwistComplianceLow(Integer twistComplianceLow) {
        this.twistComplianceLow = twistComplianceLow;
    }

    @JsonProperty("twist_compliance_medium")
    public Integer getTwistComplianceMedium() {
        return twistComplianceMedium;
    }

    @JsonProperty("twist_compliance_medium")
    public void setTwistComplianceMedium(Integer twistComplianceMedium) {
        this.twistComplianceMedium = twistComplianceMedium;
    }

    @JsonProperty("twist_compliance_high")
    public Integer getTwistComplianceHigh() {
        return twistComplianceHigh;
    }

    @JsonProperty("twist_compliance_high")
    public void setTwistComplianceHigh(Integer twistComplianceHigh) {
        this.twistComplianceHigh = twistComplianceHigh;
    }

    @JsonProperty("twist_compliance_critical")
    public Integer getTwistComplianceCritical() {
        return twistComplianceCritical;
    }

    @JsonProperty("twist_compliance_critical")
    public void setTwistComplianceCritical(Integer twistComplianceCritical) {
        this.twistComplianceCritical = twistComplianceCritical;
    }

    @JsonProperty("twist_compliance_blocker")
    public Integer getTwistComplianceBlocker() {
        return twistComplianceBlocker;
    }

    @JsonProperty("twist_compliance_blocker")
    public void setTwistComplianceBlocker(Integer twistComplianceBlocker) {
        this.twistComplianceBlocker = twistComplianceBlocker;
    }

    @JsonProperty("twist_compliance_total")
    public Integer getTwistComplianceTotal() {
        return twistComplianceTotal;
    }

    @JsonProperty("twist_compliance_total")
    public void setTwistComplianceTotal(Integer twistComplianceTotal) {
        this.twistComplianceTotal = twistComplianceTotal;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Example.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("buildId");
        sb.append('=');
        sb.append(((this.buildId == null)?"<null>":this.buildId));
        sb.append(',');
        sb.append("artifactId");
        sb.append('=');
        sb.append(((this.artifactId == null)?"<null>":this.artifactId));
        sb.append(',');
        sb.append("ciDate");
        sb.append('=');
        sb.append(((this.ciDate == null)?"<null>":this.ciDate));
        sb.append(',');
        sb.append("sqrIssues");
        sb.append('=');
        sb.append(((this.sqrIssues == null)?"<null>":this.sqrIssues));
        sb.append(',');
        sb.append("newSqrIssues");
        sb.append('=');
        sb.append(((this.newSqrIssues == null)?"<null>":this.newSqrIssues));
        sb.append(',');
        sb.append("sqrRating");
        sb.append('=');
        sb.append(((this.sqrRating == null)?"<null>":this.sqrRating));
        sb.append(',');
        sb.append("newSqrRating");
        sb.append('=');
        sb.append(((this.newSqrRating == null)?"<null>":this.newSqrRating));
        sb.append(',');
        sb.append("sqrRemediationEffort");
        sb.append('=');
        sb.append(((this.sqrRemediationEffort == null)?"<null>":this.sqrRemediationEffort));
        sb.append(',');
        sb.append("newSqrRemediationEffort");
        sb.append('=');
        sb.append(((this.newSqrRemediationEffort == null)?"<null>":this.newSqrRemediationEffort));
        sb.append(',');
        sb.append("sqmIssues");
        sb.append('=');
        sb.append(((this.sqmIssues == null)?"<null>":this.sqmIssues));
        sb.append(',');
        sb.append("newSqmIssues");
        sb.append('=');
        sb.append(((this.newSqmIssues == null)?"<null>":this.newSqmIssues));
        sb.append(',');
        sb.append("sqmRemediationEffort");
        sb.append('=');
        sb.append(((this.sqmRemediationEffort == null)?"<null>":this.sqmRemediationEffort));
        sb.append(',');
        sb.append("newSqmRemediationEffort");
        sb.append('=');
        sb.append(((this.newSqmRemediationEffort == null)?"<null>":this.newSqmRemediationEffort));
        sb.append(',');
        sb.append("sqmDebtRatio");
        sb.append('=');
        sb.append(((this.sqmDebtRatio == null)?"<null>":this.sqmDebtRatio));
        sb.append(',');
        sb.append("newSqmDebtRatio");
        sb.append('=');
        sb.append(((this.newSqmDebtRatio == null)?"<null>":this.newSqmDebtRatio));
        sb.append(',');
        sb.append("sqmRating");
        sb.append('=');
        sb.append(((this.sqmRating == null)?"<null>":this.sqmRating));
        sb.append(',');
        sb.append("newSqmRating");
        sb.append('=');
        sb.append(((this.newSqmRating == null)?"<null>":this.newSqmRating));
        sb.append(',');
        sb.append("coverage");
        sb.append('=');
        sb.append(((this.coverage == null)?"<null>":this.coverage));
        sb.append(',');
        sb.append("newCoverage");
        sb.append('=');
        sb.append(((this.newCoverage == null)?"<null>":this.newCoverage));
        sb.append(',');
        sb.append("linesToCover");
        sb.append('=');
        sb.append(((this.linesToCover == null)?"<null>":this.linesToCover));
        sb.append(',');
        sb.append("newLinesToCover");
        sb.append('=');
        sb.append(((this.newLinesToCover == null)?"<null>":this.newLinesToCover));
        sb.append(',');
        sb.append("uncoveredLines");
        sb.append('=');
        sb.append(((this.uncoveredLines == null)?"<null>":this.uncoveredLines));
        sb.append(',');
        sb.append("newUncoveredLines");
        sb.append('=');
        sb.append(((this.newUncoveredLines == null)?"<null>":this.newUncoveredLines));
        sb.append(',');
        sb.append("tests");
        sb.append('=');
        sb.append(((this.tests == null)?"<null>":this.tests));
        sb.append(',');
        sb.append("testErrors");
        sb.append('=');
        sb.append(((this.testErrors == null)?"<null>":this.testErrors));
        sb.append(',');
        sb.append("testFailures");
        sb.append('=');
        sb.append(((this.testFailures == null)?"<null>":this.testFailures));
        sb.append(',');
        sb.append("skippedTests");
        sb.append('=');
        sb.append(((this.skippedTests == null)?"<null>":this.skippedTests));
        sb.append(',');
        sb.append("testExecutionTime");
        sb.append('=');
        sb.append(((this.testExecutionTime == null)?"<null>":this.testExecutionTime));
        sb.append(',');
        sb.append("testSuccessDensity");
        sb.append('=');
        sb.append(((this.testSuccessDensity == null)?"<null>":this.testSuccessDensity));
        sb.append(',');
        sb.append("duplicatedLinesDensity");
        sb.append('=');
        sb.append(((this.duplicatedLinesDensity == null)?"<null>":this.duplicatedLinesDensity));
        sb.append(',');
        sb.append("newDuplicatedLinesDensity");
        sb.append('=');
        sb.append(((this.newDuplicatedLinesDensity == null)?"<null>":this.newDuplicatedLinesDensity));
        sb.append(',');
        sb.append("duplicatedLines");
        sb.append('=');
        sb.append(((this.duplicatedLines == null)?"<null>":this.duplicatedLines));
        sb.append(',');
        sb.append("duplicatedBlocks");
        sb.append('=');
        sb.append(((this.duplicatedBlocks == null)?"<null>":this.duplicatedBlocks));
        sb.append(',');
        sb.append("newDuplicatedBlocks");
        sb.append('=');
        sb.append(((this.newDuplicatedBlocks == null)?"<null>":this.newDuplicatedBlocks));
        sb.append(',');
        sb.append("duplicatedFiles");
        sb.append('=');
        sb.append(((this.duplicatedFiles == null)?"<null>":this.duplicatedFiles));
        sb.append(',');
        sb.append("newLines");
        sb.append('=');
        sb.append(((this.newLines == null)?"<null>":this.newLines));
        sb.append(',');
        sb.append("ncloc");
        sb.append('=');
        sb.append(((this.ncloc == null)?"<null>":this.ncloc));
        sb.append(',');
        sb.append("lines");
        sb.append('=');
        sb.append(((this.lines == null)?"<null>":this.lines));
        sb.append(',');
        sb.append("statements");
        sb.append('=');
        sb.append(((this.statements == null)?"<null>":this.statements));
        sb.append(',');
        sb.append("functions");
        sb.append('=');
        sb.append(((this.functions == null)?"<null>":this.functions));
        sb.append(',');
        sb.append("classes");
        sb.append('=');
        sb.append(((this.classes == null)?"<null>":this.classes));
        sb.append(',');
        sb.append("files");
        sb.append('=');
        sb.append(((this.files == null)?"<null>":this.files));
        sb.append(',');
        sb.append("commentLines");
        sb.append('=');
        sb.append(((this.commentLines == null)?"<null>":this.commentLines));
        sb.append(',');
        sb.append("commentLinesDensity");
        sb.append('=');
        sb.append(((this.commentLinesDensity == null)?"<null>":this.commentLinesDensity));
        sb.append(',');
        sb.append("complexity");
        sb.append('=');
        sb.append(((this.complexity == null)?"<null>":this.complexity));
        sb.append(',');
        sb.append("cognitiveComplexity");
        sb.append('=');
        sb.append(((this.cognitiveComplexity == null)?"<null>":this.cognitiveComplexity));
        sb.append(',');
        sb.append("violations");
        sb.append('=');
        sb.append(((this.violations == null)?"<null>":this.violations));
        sb.append(',');
        sb.append("newViolations");
        sb.append('=');
        sb.append(((this.newViolations == null)?"<null>":this.newViolations));
        sb.append(',');
        sb.append("openIssues");
        sb.append('=');
        sb.append(((this.openIssues == null)?"<null>":this.openIssues));
        sb.append(',');
        sb.append("acceptedIssues");
        sb.append('=');
        sb.append(((this.acceptedIssues == null)?"<null>":this.acceptedIssues));
        sb.append(',');
        sb.append("falsePositiveIssues");
        sb.append('=');
        sb.append(((this.falsePositiveIssues == null)?"<null>":this.falsePositiveIssues));
        sb.append(',');
        sb.append("softwareQualityBlockerIssues");
        sb.append('=');
        sb.append(((this.softwareQualityBlockerIssues == null)?"<null>":this.softwareQualityBlockerIssues));
        sb.append(',');
        sb.append("softwareQualityHighIssues");
        sb.append('=');
        sb.append(((this.softwareQualityHighIssues == null)?"<null>":this.softwareQualityHighIssues));
        sb.append(',');
        sb.append("softwareQualityMediumIssues");
        sb.append('=');
        sb.append(((this.softwareQualityMediumIssues == null)?"<null>":this.softwareQualityMediumIssues));
        sb.append(',');
        sb.append("softwareQualityLowIssues");
        sb.append('=');
        sb.append(((this.softwareQualityLowIssues == null)?"<null>":this.softwareQualityLowIssues));
        sb.append(',');
        sb.append("sastIssueLow");
        sb.append('=');
        sb.append(((this.sastIssueLow == null)?"<null>":this.sastIssueLow));
        sb.append(',');
        sb.append("sastIssueMedium");
        sb.append('=');
        sb.append(((this.sastIssueMedium == null)?"<null>":this.sastIssueMedium));
        sb.append(',');
        sb.append("sastIssueHigh");
        sb.append('=');
        sb.append(((this.sastIssueHigh == null)?"<null>":this.sastIssueHigh));
        sb.append(',');
        sb.append("sastIssueCritical");
        sb.append('=');
        sb.append(((this.sastIssueCritical == null)?"<null>":this.sastIssueCritical));
        sb.append(',');
        sb.append("sastIssueBlocker");
        sb.append('=');
        sb.append(((this.sastIssueBlocker == null)?"<null>":this.sastIssueBlocker));
        sb.append(',');
        sb.append("sastIssueTotal");
        sb.append('=');
        sb.append(((this.sastIssueTotal == null)?"<null>":this.sastIssueTotal));
        sb.append(',');
        sb.append("scaIssueLow");
        sb.append('=');
        sb.append(((this.scaIssueLow == null)?"<null>":this.scaIssueLow));
        sb.append(',');
        sb.append("scaIssueMedium");
        sb.append('=');
        sb.append(((this.scaIssueMedium == null)?"<null>":this.scaIssueMedium));
        sb.append(',');
        sb.append("scaIssueHigh");
        sb.append('=');
        sb.append(((this.scaIssueHigh == null)?"<null>":this.scaIssueHigh));
        sb.append(',');
        sb.append("scaIssueCritical");
        sb.append('=');
        sb.append(((this.scaIssueCritical == null)?"<null>":this.scaIssueCritical));
        sb.append(',');
        sb.append("scaIssueBlocker");
        sb.append('=');
        sb.append(((this.scaIssueBlocker == null)?"<null>":this.scaIssueBlocker));
        sb.append(',');
        sb.append("scaIssueTotal");
        sb.append('=');
        sb.append(((this.scaIssueTotal == null)?"<null>":this.scaIssueTotal));
        sb.append(',');
        sb.append("twistVulnerabilitiesLow");
        sb.append('=');
        sb.append(((this.twistVulnerabilitiesLow == null)?"<null>":this.twistVulnerabilitiesLow));
        sb.append(',');
        sb.append("twistVulnerabilitiesMedium");
        sb.append('=');
        sb.append(((this.twistVulnerabilitiesMedium == null)?"<null>":this.twistVulnerabilitiesMedium));
        sb.append(',');
        sb.append("twistVulnerabilitiesHigh");
        sb.append('=');
        sb.append(((this.twistVulnerabilitiesHigh == null)?"<null>":this.twistVulnerabilitiesHigh));
        sb.append(',');
        sb.append("twistVulnerabilitiesCritical");
        sb.append('=');
        sb.append(((this.twistVulnerabilitiesCritical == null)?"<null>":this.twistVulnerabilitiesCritical));
        sb.append(',');
        sb.append("twistVulnerabilitiesBlocker");
        sb.append('=');
        sb.append(((this.twistVulnerabilitiesBlocker == null)?"<null>":this.twistVulnerabilitiesBlocker));
        sb.append(',');
        sb.append("twistVulnerabilitiesTotal");
        sb.append('=');
        sb.append(((this.twistVulnerabilitiesTotal == null)?"<null>":this.twistVulnerabilitiesTotal));
        sb.append(',');
        sb.append("twistComplianceLow");
        sb.append('=');
        sb.append(((this.twistComplianceLow == null)?"<null>":this.twistComplianceLow));
        sb.append(',');
        sb.append("twistComplianceMedium");
        sb.append('=');
        sb.append(((this.twistComplianceMedium == null)?"<null>":this.twistComplianceMedium));
        sb.append(',');
        sb.append("twistComplianceHigh");
        sb.append('=');
        sb.append(((this.twistComplianceHigh == null)?"<null>":this.twistComplianceHigh));
        sb.append(',');
        sb.append("twistComplianceCritical");
        sb.append('=');
        sb.append(((this.twistComplianceCritical == null)?"<null>":this.twistComplianceCritical));
        sb.append(',');
        sb.append("twistComplianceBlocker");
        sb.append('=');
        sb.append(((this.twistComplianceBlocker == null)?"<null>":this.twistComplianceBlocker));
        sb.append(',');
        sb.append("twistComplianceTotal");
        sb.append('=');
        sb.append(((this.twistComplianceTotal == null)?"<null>":this.twistComplianceTotal));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.twistComplianceBlocker == null)? 0 :this.twistComplianceBlocker.hashCode()));
        result = ((result* 31)+((this.duplicatedLinesDensity == null)? 0 :this.duplicatedLinesDensity.hashCode()));
        result = ((result* 31)+((this.newSqrIssues == null)? 0 :this.newSqrIssues.hashCode()));
        result = ((result* 31)+((this.functions == null)? 0 :this.functions.hashCode()));
        result = ((result* 31)+((this.testFailures == null)? 0 :this.testFailures.hashCode()));
        result = ((result* 31)+((this.twistVulnerabilitiesCritical == null)? 0 :this.twistVulnerabilitiesCritical.hashCode()));
        result = ((result* 31)+((this.sastIssueTotal == null)? 0 :this.sastIssueTotal.hashCode()));
        result = ((result* 31)+((this.scaIssueHigh == null)? 0 :this.scaIssueHigh.hashCode()));
        result = ((result* 31)+((this.softwareQualityHighIssues == null)? 0 :this.softwareQualityHighIssues.hashCode()));
        result = ((result* 31)+((this.openIssues == null)? 0 :this.openIssues.hashCode()));
        result = ((result* 31)+((this.skippedTests == null)? 0 :this.skippedTests.hashCode()));
        result = ((result* 31)+((this.scaIssueCritical == null)? 0 :this.scaIssueCritical.hashCode()));
        result = ((result* 31)+((this.sqrRemediationEffort == null)? 0 :this.sqrRemediationEffort.hashCode()));
        result = ((result* 31)+((this.newSqrRating == null)? 0 :this.newSqrRating.hashCode()));
        result = ((result* 31)+((this.duplicatedLines == null)? 0 :this.duplicatedLines.hashCode()));
        result = ((result* 31)+((this.twistComplianceTotal == null)? 0 :this.twistComplianceTotal.hashCode()));
        result = ((result* 31)+((this.newSqmDebtRatio == null)? 0 :this.newSqmDebtRatio.hashCode()));
        result = ((result* 31)+((this.uncoveredLines == null)? 0 :this.uncoveredLines.hashCode()));
        result = ((result* 31)+((this.newSqmRemediationEffort == null)? 0 :this.newSqmRemediationEffort.hashCode()));
        result = ((result* 31)+((this.violations == null)? 0 :this.violations.hashCode()));
        result = ((result* 31)+((this.sastIssueBlocker == null)? 0 :this.sastIssueBlocker.hashCode()));
        result = ((result* 31)+((this.scaIssueMedium == null)? 0 :this.scaIssueMedium.hashCode()));
        result = ((result* 31)+((this.newUncoveredLines == null)? 0 :this.newUncoveredLines.hashCode()));
        result = ((result* 31)+((this.softwareQualityMediumIssues == null)? 0 :this.softwareQualityMediumIssues.hashCode()));
        result = ((result* 31)+((this.sqmIssues == null)? 0 :this.sqmIssues.hashCode()));
        result = ((result* 31)+((this.falsePositiveIssues == null)? 0 :this.falsePositiveIssues.hashCode()));
        result = ((result* 31)+((this.softwareQualityLowIssues == null)? 0 :this.softwareQualityLowIssues.hashCode()));
        result = ((result* 31)+((this.scaIssueTotal == null)? 0 :this.scaIssueTotal.hashCode()));
        result = ((result* 31)+((this.twistVulnerabilitiesHigh == null)? 0 :this.twistVulnerabilitiesHigh.hashCode()));
        result = ((result* 31)+((this.twistComplianceMedium == null)? 0 :this.twistComplianceMedium.hashCode()));
        result = ((result* 31)+((this.sqrRating == null)? 0 :this.sqrRating.hashCode()));
        result = ((result* 31)+((this.linesToCover == null)? 0 :this.linesToCover.hashCode()));
        result = ((result* 31)+((this.tests == null)? 0 :this.tests.hashCode()));
        result = ((result* 31)+((this.testSuccessDensity == null)? 0 :this.testSuccessDensity.hashCode()));
        result = ((result* 31)+((this.sastIssueHigh == null)? 0 :this.sastIssueHigh.hashCode()));
        result = ((result* 31)+((this.sastIssueMedium == null)? 0 :this.sastIssueMedium.hashCode()));
        result = ((result* 31)+((this.newLines == null)? 0 :this.newLines.hashCode()));
        result = ((result* 31)+((this.duplicatedFiles == null)? 0 :this.duplicatedFiles.hashCode()));
        result = ((result* 31)+((this.files == null)? 0 :this.files.hashCode()));
        result = ((result* 31)+((this.testExecutionTime == null)? 0 :this.testExecutionTime.hashCode()));
        result = ((result* 31)+((this.softwareQualityBlockerIssues == null)? 0 :this.softwareQualityBlockerIssues.hashCode()));
        result = ((result* 31)+((this.commentLines == null)? 0 :this.commentLines.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.commentLinesDensity == null)? 0 :this.commentLinesDensity.hashCode()));
        result = ((result* 31)+((this.complexity == null)? 0 :this.complexity.hashCode()));
        result = ((result* 31)+((this.newSqmIssues == null)? 0 :this.newSqmIssues.hashCode()));
        result = ((result* 31)+((this.newSqmRating == null)? 0 :this.newSqmRating.hashCode()));
        result = ((result* 31)+((this.classes == null)? 0 :this.classes.hashCode()));
        result = ((result* 31)+((this.twistComplianceLow == null)? 0 :this.twistComplianceLow.hashCode()));
        result = ((result* 31)+((this.statements == null)? 0 :this.statements.hashCode()));
        result = ((result* 31)+((this.twistVulnerabilitiesMedium == null)? 0 :this.twistVulnerabilitiesMedium.hashCode()));
        result = ((result* 31)+((this.ncloc == null)? 0 :this.ncloc.hashCode()));
        result = ((result* 31)+((this.twistComplianceCritical == null)? 0 :this.twistComplianceCritical.hashCode()));
        result = ((result* 31)+((this.newCoverage == null)? 0 :this.newCoverage.hashCode()));
        result = ((result* 31)+((this.artifactId == null)? 0 :this.artifactId.hashCode()));
        result = ((result* 31)+((this.twistVulnerabilitiesTotal == null)? 0 :this.twistVulnerabilitiesTotal.hashCode()));
        result = ((result* 31)+((this.lines == null)? 0 :this.lines.hashCode()));
        result = ((result* 31)+((this.duplicatedBlocks == null)? 0 :this.duplicatedBlocks.hashCode()));
        result = ((result* 31)+((this.coverage == null)? 0 :this.coverage.hashCode()));
        result = ((result* 31)+((this.newDuplicatedBlocks == null)? 0 :this.newDuplicatedBlocks.hashCode()));
        result = ((result* 31)+((this.ciDate == null)? 0 :this.ciDate.hashCode()));
        result = ((result* 31)+((this.newViolations == null)? 0 :this.newViolations.hashCode()));
        result = ((result* 31)+((this.sqmDebtRatio == null)? 0 :this.sqmDebtRatio.hashCode()));
        result = ((result* 31)+((this.testErrors == null)? 0 :this.testErrors.hashCode()));
        result = ((result* 31)+((this.newSqrRemediationEffort == null)? 0 :this.newSqrRemediationEffort.hashCode()));
        result = ((result* 31)+((this.sqmRating == null)? 0 :this.sqmRating.hashCode()));
        result = ((result* 31)+((this.acceptedIssues == null)? 0 :this.acceptedIssues.hashCode()));
        result = ((result* 31)+((this.buildId == null)? 0 :this.buildId.hashCode()));
        result = ((result* 31)+((this.sqrIssues == null)? 0 :this.sqrIssues.hashCode()));
        result = ((result* 31)+((this.cognitiveComplexity == null)? 0 :this.cognitiveComplexity.hashCode()));
        result = ((result* 31)+((this.sqmRemediationEffort == null)? 0 :this.sqmRemediationEffort.hashCode()));
        result = ((result* 31)+((this.twistVulnerabilitiesLow == null)? 0 :this.twistVulnerabilitiesLow.hashCode()));
        result = ((result* 31)+((this.newLinesToCover == null)? 0 :this.newLinesToCover.hashCode()));
        result = ((result* 31)+((this.newDuplicatedLinesDensity == null)? 0 :this.newDuplicatedLinesDensity.hashCode()));
        result = ((result* 31)+((this.sastIssueCritical == null)? 0 :this.sastIssueCritical.hashCode()));
        result = ((result* 31)+((this.twistComplianceHigh == null)? 0 :this.twistComplianceHigh.hashCode()));
        result = ((result* 31)+((this.scaIssueLow == null)? 0 :this.scaIssueLow.hashCode()));
        result = ((result* 31)+((this.sastIssueLow == null)? 0 :this.sastIssueLow.hashCode()));
        result = ((result* 31)+((this.scaIssueBlocker == null)? 0 :this.scaIssueBlocker.hashCode()));
        result = ((result* 31)+((this.twistVulnerabilitiesBlocker == null)? 0 :this.twistVulnerabilitiesBlocker.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Example) == false) {
            return false;
        }
        Example rhs = ((Example) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.twistComplianceBlocker == rhs.twistComplianceBlocker)||((this.twistComplianceBlocker!= null)&&this.twistComplianceBlocker.equals(rhs.twistComplianceBlocker)))&&((this.duplicatedLinesDensity == rhs.duplicatedLinesDensity)||((this.duplicatedLinesDensity!= null)&&this.duplicatedLinesDensity.equals(rhs.duplicatedLinesDensity))))&&((this.newSqrIssues == rhs.newSqrIssues)||((this.newSqrIssues!= null)&&this.newSqrIssues.equals(rhs.newSqrIssues))))&&((this.functions == rhs.functions)||((this.functions!= null)&&this.functions.equals(rhs.functions))))&&((this.testFailures == rhs.testFailures)||((this.testFailures!= null)&&this.testFailures.equals(rhs.testFailures))))&&((this.twistVulnerabilitiesCritical == rhs.twistVulnerabilitiesCritical)||((this.twistVulnerabilitiesCritical!= null)&&this.twistVulnerabilitiesCritical.equals(rhs.twistVulnerabilitiesCritical))))&&((this.sastIssueTotal == rhs.sastIssueTotal)||((this.sastIssueTotal!= null)&&this.sastIssueTotal.equals(rhs.sastIssueTotal))))&&((this.scaIssueHigh == rhs.scaIssueHigh)||((this.scaIssueHigh!= null)&&this.scaIssueHigh.equals(rhs.scaIssueHigh))))&&((this.softwareQualityHighIssues == rhs.softwareQualityHighIssues)||((this.softwareQualityHighIssues!= null)&&this.softwareQualityHighIssues.equals(rhs.softwareQualityHighIssues))))&&((this.openIssues == rhs.openIssues)||((this.openIssues!= null)&&this.openIssues.equals(rhs.openIssues))))&&((this.skippedTests == rhs.skippedTests)||((this.skippedTests!= null)&&this.skippedTests.equals(rhs.skippedTests))))&&((this.scaIssueCritical == rhs.scaIssueCritical)||((this.scaIssueCritical!= null)&&this.scaIssueCritical.equals(rhs.scaIssueCritical))))&&((this.sqrRemediationEffort == rhs.sqrRemediationEffort)||((this.sqrRemediationEffort!= null)&&this.sqrRemediationEffort.equals(rhs.sqrRemediationEffort))))&&((this.newSqrRating == rhs.newSqrRating)||((this.newSqrRating!= null)&&this.newSqrRating.equals(rhs.newSqrRating))))&&((this.duplicatedLines == rhs.duplicatedLines)||((this.duplicatedLines!= null)&&this.duplicatedLines.equals(rhs.duplicatedLines))))&&((this.twistComplianceTotal == rhs.twistComplianceTotal)||((this.twistComplianceTotal!= null)&&this.twistComplianceTotal.equals(rhs.twistComplianceTotal))))&&((this.newSqmDebtRatio == rhs.newSqmDebtRatio)||((this.newSqmDebtRatio!= null)&&this.newSqmDebtRatio.equals(rhs.newSqmDebtRatio))))&&((this.uncoveredLines == rhs.uncoveredLines)||((this.uncoveredLines!= null)&&this.uncoveredLines.equals(rhs.uncoveredLines))))&&((this.newSqmRemediationEffort == rhs.newSqmRemediationEffort)||((this.newSqmRemediationEffort!= null)&&this.newSqmRemediationEffort.equals(rhs.newSqmRemediationEffort))))&&((this.violations == rhs.violations)||((this.violations!= null)&&this.violations.equals(rhs.violations))))&&((this.sastIssueBlocker == rhs.sastIssueBlocker)||((this.sastIssueBlocker!= null)&&this.sastIssueBlocker.equals(rhs.sastIssueBlocker))))&&((this.scaIssueMedium == rhs.scaIssueMedium)||((this.scaIssueMedium!= null)&&this.scaIssueMedium.equals(rhs.scaIssueMedium))))&&((this.newUncoveredLines == rhs.newUncoveredLines)||((this.newUncoveredLines!= null)&&this.newUncoveredLines.equals(rhs.newUncoveredLines))))&&((this.softwareQualityMediumIssues == rhs.softwareQualityMediumIssues)||((this.softwareQualityMediumIssues!= null)&&this.softwareQualityMediumIssues.equals(rhs.softwareQualityMediumIssues))))&&((this.sqmIssues == rhs.sqmIssues)||((this.sqmIssues!= null)&&this.sqmIssues.equals(rhs.sqmIssues))))&&((this.falsePositiveIssues == rhs.falsePositiveIssues)||((this.falsePositiveIssues!= null)&&this.falsePositiveIssues.equals(rhs.falsePositiveIssues))))&&((this.softwareQualityLowIssues == rhs.softwareQualityLowIssues)||((this.softwareQualityLowIssues!= null)&&this.softwareQualityLowIssues.equals(rhs.softwareQualityLowIssues))))&&((this.scaIssueTotal == rhs.scaIssueTotal)||((this.scaIssueTotal!= null)&&this.scaIssueTotal.equals(rhs.scaIssueTotal))))&&((this.twistVulnerabilitiesHigh == rhs.twistVulnerabilitiesHigh)||((this.twistVulnerabilitiesHigh!= null)&&this.twistVulnerabilitiesHigh.equals(rhs.twistVulnerabilitiesHigh))))&&((this.twistComplianceMedium == rhs.twistComplianceMedium)||((this.twistComplianceMedium!= null)&&this.twistComplianceMedium.equals(rhs.twistComplianceMedium))))&&((this.sqrRating == rhs.sqrRating)||((this.sqrRating!= null)&&this.sqrRating.equals(rhs.sqrRating))))&&((this.linesToCover == rhs.linesToCover)||((this.linesToCover!= null)&&this.linesToCover.equals(rhs.linesToCover))))&&((this.tests == rhs.tests)||((this.tests!= null)&&this.tests.equals(rhs.tests))))&&((this.testSuccessDensity == rhs.testSuccessDensity)||((this.testSuccessDensity!= null)&&this.testSuccessDensity.equals(rhs.testSuccessDensity))))&&((this.sastIssueHigh == rhs.sastIssueHigh)||((this.sastIssueHigh!= null)&&this.sastIssueHigh.equals(rhs.sastIssueHigh))))&&((this.sastIssueMedium == rhs.sastIssueMedium)||((this.sastIssueMedium!= null)&&this.sastIssueMedium.equals(rhs.sastIssueMedium))))&&((this.newLines == rhs.newLines)||((this.newLines!= null)&&this.newLines.equals(rhs.newLines))))&&((this.duplicatedFiles == rhs.duplicatedFiles)||((this.duplicatedFiles!= null)&&this.duplicatedFiles.equals(rhs.duplicatedFiles))))&&((this.files == rhs.files)||((this.files!= null)&&this.files.equals(rhs.files))))&&((this.testExecutionTime == rhs.testExecutionTime)||((this.testExecutionTime!= null)&&this.testExecutionTime.equals(rhs.testExecutionTime))))&&((this.softwareQualityBlockerIssues == rhs.softwareQualityBlockerIssues)||((this.softwareQualityBlockerIssues!= null)&&this.softwareQualityBlockerIssues.equals(rhs.softwareQualityBlockerIssues))))&&((this.commentLines == rhs.commentLines)||((this.commentLines!= null)&&this.commentLines.equals(rhs.commentLines))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.commentLinesDensity == rhs.commentLinesDensity)||((this.commentLinesDensity!= null)&&this.commentLinesDensity.equals(rhs.commentLinesDensity))))&&((this.complexity == rhs.complexity)||((this.complexity!= null)&&this.complexity.equals(rhs.complexity))))&&((this.newSqmIssues == rhs.newSqmIssues)||((this.newSqmIssues!= null)&&this.newSqmIssues.equals(rhs.newSqmIssues))))&&((this.newSqmRating == rhs.newSqmRating)||((this.newSqmRating!= null)&&this.newSqmRating.equals(rhs.newSqmRating))))&&((this.classes == rhs.classes)||((this.classes!= null)&&this.classes.equals(rhs.classes))))&&((this.twistComplianceLow == rhs.twistComplianceLow)||((this.twistComplianceLow!= null)&&this.twistComplianceLow.equals(rhs.twistComplianceLow))))&&((this.statements == rhs.statements)||((this.statements!= null)&&this.statements.equals(rhs.statements))))&&((this.twistVulnerabilitiesMedium == rhs.twistVulnerabilitiesMedium)||((this.twistVulnerabilitiesMedium!= null)&&this.twistVulnerabilitiesMedium.equals(rhs.twistVulnerabilitiesMedium))))&&((this.ncloc == rhs.ncloc)||((this.ncloc!= null)&&this.ncloc.equals(rhs.ncloc))))&&((this.twistComplianceCritical == rhs.twistComplianceCritical)||((this.twistComplianceCritical!= null)&&this.twistComplianceCritical.equals(rhs.twistComplianceCritical))))&&((this.newCoverage == rhs.newCoverage)||((this.newCoverage!= null)&&this.newCoverage.equals(rhs.newCoverage))))&&((this.artifactId == rhs.artifactId)||((this.artifactId!= null)&&this.artifactId.equals(rhs.artifactId))))&&((this.twistVulnerabilitiesTotal == rhs.twistVulnerabilitiesTotal)||((this.twistVulnerabilitiesTotal!= null)&&this.twistVulnerabilitiesTotal.equals(rhs.twistVulnerabilitiesTotal))))&&((this.lines == rhs.lines)||((this.lines!= null)&&this.lines.equals(rhs.lines))))&&((this.duplicatedBlocks == rhs.duplicatedBlocks)||((this.duplicatedBlocks!= null)&&this.duplicatedBlocks.equals(rhs.duplicatedBlocks))))&&((this.coverage == rhs.coverage)||((this.coverage!= null)&&this.coverage.equals(rhs.coverage))))&&((this.newDuplicatedBlocks == rhs.newDuplicatedBlocks)||((this.newDuplicatedBlocks!= null)&&this.newDuplicatedBlocks.equals(rhs.newDuplicatedBlocks))))&&((this.ciDate == rhs.ciDate)||((this.ciDate!= null)&&this.ciDate.equals(rhs.ciDate))))&&((this.newViolations == rhs.newViolations)||((this.newViolations!= null)&&this.newViolations.equals(rhs.newViolations))))&&((this.sqmDebtRatio == rhs.sqmDebtRatio)||((this.sqmDebtRatio!= null)&&this.sqmDebtRatio.equals(rhs.sqmDebtRatio))))&&((this.testErrors == rhs.testErrors)||((this.testErrors!= null)&&this.testErrors.equals(rhs.testErrors))))&&((this.newSqrRemediationEffort == rhs.newSqrRemediationEffort)||((this.newSqrRemediationEffort!= null)&&this.newSqrRemediationEffort.equals(rhs.newSqrRemediationEffort))))&&((this.sqmRating == rhs.sqmRating)||((this.sqmRating!= null)&&this.sqmRating.equals(rhs.sqmRating))))&&((this.acceptedIssues == rhs.acceptedIssues)||((this.acceptedIssues!= null)&&this.acceptedIssues.equals(rhs.acceptedIssues))))&&((this.buildId == rhs.buildId)||((this.buildId!= null)&&this.buildId.equals(rhs.buildId))))&&((this.sqrIssues == rhs.sqrIssues)||((this.sqrIssues!= null)&&this.sqrIssues.equals(rhs.sqrIssues))))&&((this.cognitiveComplexity == rhs.cognitiveComplexity)||((this.cognitiveComplexity!= null)&&this.cognitiveComplexity.equals(rhs.cognitiveComplexity))))&&((this.sqmRemediationEffort == rhs.sqmRemediationEffort)||((this.sqmRemediationEffort!= null)&&this.sqmRemediationEffort.equals(rhs.sqmRemediationEffort))))&&((this.twistVulnerabilitiesLow == rhs.twistVulnerabilitiesLow)||((this.twistVulnerabilitiesLow!= null)&&this.twistVulnerabilitiesLow.equals(rhs.twistVulnerabilitiesLow))))&&((this.newLinesToCover == rhs.newLinesToCover)||((this.newLinesToCover!= null)&&this.newLinesToCover.equals(rhs.newLinesToCover))))&&((this.newDuplicatedLinesDensity == rhs.newDuplicatedLinesDensity)||((this.newDuplicatedLinesDensity!= null)&&this.newDuplicatedLinesDensity.equals(rhs.newDuplicatedLinesDensity))))&&((this.sastIssueCritical == rhs.sastIssueCritical)||((this.sastIssueCritical!= null)&&this.sastIssueCritical.equals(rhs.sastIssueCritical))))&&((this.twistComplianceHigh == rhs.twistComplianceHigh)||((this.twistComplianceHigh!= null)&&this.twistComplianceHigh.equals(rhs.twistComplianceHigh))))&&((this.scaIssueLow == rhs.scaIssueLow)||((this.scaIssueLow!= null)&&this.scaIssueLow.equals(rhs.scaIssueLow))))&&((this.sastIssueLow == rhs.sastIssueLow)||((this.sastIssueLow!= null)&&this.sastIssueLow.equals(rhs.sastIssueLow))))&&((this.scaIssueBlocker == rhs.scaIssueBlocker)||((this.scaIssueBlocker!= null)&&this.scaIssueBlocker.equals(rhs.scaIssueBlocker))))&&((this.twistVulnerabilitiesBlocker == rhs.twistVulnerabilitiesBlocker)||((this.twistVulnerabilitiesBlocker!= null)&&this.twistVulnerabilitiesBlocker.equals(rhs.twistVulnerabilitiesBlocker))));
    }

}
