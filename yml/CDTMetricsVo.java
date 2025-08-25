
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
    "env_level",
    "cd_date",
    "ct_date",
    "started_by",
    "approver",
    "deployment_Status",
    "total_tests",
    "passed_tests",
    "failed_tests",
    "notrun_tests",
    "tests_status",
    "tests_coverage",
    "code_coverage"
})
@Generated("jsonschema2pojo")
public class CDTMetricsVo {

    @JsonProperty("build_id")
    private Integer buildId;
    @JsonProperty("artifact_id")
    private Integer artifactId;
    @JsonProperty("env_level")
    private Integer envLevel;
    @JsonProperty("cd_date")
    private String cdDate;
    @JsonProperty("ct_date")
    private String ctDate;
    @JsonProperty("started_by")
    private String startedBy;
    @JsonProperty("approver")
    private String approver;
    @JsonProperty("deployment_Status")
    private String deploymentStatus;
    @JsonProperty("total_tests")
    private String totalTests;
    @JsonProperty("passed_tests")
    private String passedTests;
    @JsonProperty("failed_tests")
    private String failedTests;
    @JsonProperty("notrun_tests")
    private String notrunTests;
    @JsonProperty("tests_status")
    private String testsStatus;
    @JsonProperty("tests_coverage")
    private Integer testsCoverage;
    @JsonProperty("code_coverage")
    private Integer codeCoverage;
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

    @JsonProperty("env_level")
    public Integer getEnvLevel() {
        return envLevel;
    }

    @JsonProperty("env_level")
    public void setEnvLevel(Integer envLevel) {
        this.envLevel = envLevel;
    }

    @JsonProperty("cd_date")
    public String getCdDate() {
        return cdDate;
    }

    @JsonProperty("cd_date")
    public void setCdDate(String cdDate) {
        this.cdDate = cdDate;
    }

    @JsonProperty("ct_date")
    public String getCtDate() {
        return ctDate;
    }

    @JsonProperty("ct_date")
    public void setCtDate(String ctDate) {
        this.ctDate = ctDate;
    }

    @JsonProperty("started_by")
    public String getStartedBy() {
        return startedBy;
    }

    @JsonProperty("started_by")
    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    @JsonProperty("approver")
    public String getApprover() {
        return approver;
    }

    @JsonProperty("approver")
    public void setApprover(String approver) {
        this.approver = approver;
    }

    @JsonProperty("deployment_Status")
    public String getDeploymentStatus() {
        return deploymentStatus;
    }

    @JsonProperty("deployment_Status")
    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    @JsonProperty("total_tests")
    public String getTotalTests() {
        return totalTests;
    }

    @JsonProperty("total_tests")
    public void setTotalTests(String totalTests) {
        this.totalTests = totalTests;
    }

    @JsonProperty("passed_tests")
    public String getPassedTests() {
        return passedTests;
    }

    @JsonProperty("passed_tests")
    public void setPassedTests(String passedTests) {
        this.passedTests = passedTests;
    }

    @JsonProperty("failed_tests")
    public String getFailedTests() {
        return failedTests;
    }

    @JsonProperty("failed_tests")
    public void setFailedTests(String failedTests) {
        this.failedTests = failedTests;
    }

    @JsonProperty("notrun_tests")
    public String getNotrunTests() {
        return notrunTests;
    }

    @JsonProperty("notrun_tests")
    public void setNotrunTests(String notrunTests) {
        this.notrunTests = notrunTests;
    }

    @JsonProperty("tests_status")
    public String getTestsStatus() {
        return testsStatus;
    }

    @JsonProperty("tests_status")
    public void setTestsStatus(String testsStatus) {
        this.testsStatus = testsStatus;
    }

    @JsonProperty("tests_coverage")
    public Integer getTestsCoverage() {
        return testsCoverage;
    }

    @JsonProperty("tests_coverage")
    public void setTestsCoverage(Integer testsCoverage) {
        this.testsCoverage = testsCoverage;
    }

    @JsonProperty("code_coverage")
    public Integer getCodeCoverage() {
        return codeCoverage;
    }

    @JsonProperty("code_coverage")
    public void setCodeCoverage(Integer codeCoverage) {
        this.codeCoverage = codeCoverage;
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
        sb.append("envLevel");
        sb.append('=');
        sb.append(((this.envLevel == null)?"<null>":this.envLevel));
        sb.append(',');
        sb.append("cdDate");
        sb.append('=');
        sb.append(((this.cdDate == null)?"<null>":this.cdDate));
        sb.append(',');
        sb.append("ctDate");
        sb.append('=');
        sb.append(((this.ctDate == null)?"<null>":this.ctDate));
        sb.append(',');
        sb.append("startedBy");
        sb.append('=');
        sb.append(((this.startedBy == null)?"<null>":this.startedBy));
        sb.append(',');
        sb.append("approver");
        sb.append('=');
        sb.append(((this.approver == null)?"<null>":this.approver));
        sb.append(',');
        sb.append("deploymentStatus");
        sb.append('=');
        sb.append(((this.deploymentStatus == null)?"<null>":this.deploymentStatus));
        sb.append(',');
        sb.append("totalTests");
        sb.append('=');
        sb.append(((this.totalTests == null)?"<null>":this.totalTests));
        sb.append(',');
        sb.append("passedTests");
        sb.append('=');
        sb.append(((this.passedTests == null)?"<null>":this.passedTests));
        sb.append(',');
        sb.append("failedTests");
        sb.append('=');
        sb.append(((this.failedTests == null)?"<null>":this.failedTests));
        sb.append(',');
        sb.append("notrunTests");
        sb.append('=');
        sb.append(((this.notrunTests == null)?"<null>":this.notrunTests));
        sb.append(',');
        sb.append("testsStatus");
        sb.append('=');
        sb.append(((this.testsStatus == null)?"<null>":this.testsStatus));
        sb.append(',');
        sb.append("testsCoverage");
        sb.append('=');
        sb.append(((this.testsCoverage == null)?"<null>":this.testsCoverage));
        sb.append(',');
        sb.append("codeCoverage");
        sb.append('=');
        sb.append(((this.codeCoverage == null)?"<null>":this.codeCoverage));
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
        result = ((result* 31)+((this.approver == null)? 0 :this.approver.hashCode()));
        result = ((result* 31)+((this.passedTests == null)? 0 :this.passedTests.hashCode()));
        result = ((result* 31)+((this.startedBy == null)? 0 :this.startedBy.hashCode()));
        result = ((result* 31)+((this.failedTests == null)? 0 :this.failedTests.hashCode()));
        result = ((result* 31)+((this.envLevel == null)? 0 :this.envLevel.hashCode()));
        result = ((result* 31)+((this.buildId == null)? 0 :this.buildId.hashCode()));
        result = ((result* 31)+((this.notrunTests == null)? 0 :this.notrunTests.hashCode()));
        result = ((result* 31)+((this.ctDate == null)? 0 :this.ctDate.hashCode()));
        result = ((result* 31)+((this.totalTests == null)? 0 :this.totalTests.hashCode()));
        result = ((result* 31)+((this.testsCoverage == null)? 0 :this.testsCoverage.hashCode()));
        result = ((result* 31)+((this.deploymentStatus == null)? 0 :this.deploymentStatus.hashCode()));
        result = ((result* 31)+((this.testsStatus == null)? 0 :this.testsStatus.hashCode()));
        result = ((result* 31)+((this.artifactId == null)? 0 :this.artifactId.hashCode()));
        result = ((result* 31)+((this.codeCoverage == null)? 0 :this.codeCoverage.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cdDate == null)? 0 :this.cdDate.hashCode()));
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
        return (((((((((((((((((this.approver == rhs.approver)||((this.approver!= null)&&this.approver.equals(rhs.approver)))&&((this.passedTests == rhs.passedTests)||((this.passedTests!= null)&&this.passedTests.equals(rhs.passedTests))))&&((this.startedBy == rhs.startedBy)||((this.startedBy!= null)&&this.startedBy.equals(rhs.startedBy))))&&((this.failedTests == rhs.failedTests)||((this.failedTests!= null)&&this.failedTests.equals(rhs.failedTests))))&&((this.envLevel == rhs.envLevel)||((this.envLevel!= null)&&this.envLevel.equals(rhs.envLevel))))&&((this.buildId == rhs.buildId)||((this.buildId!= null)&&this.buildId.equals(rhs.buildId))))&&((this.notrunTests == rhs.notrunTests)||((this.notrunTests!= null)&&this.notrunTests.equals(rhs.notrunTests))))&&((this.ctDate == rhs.ctDate)||((this.ctDate!= null)&&this.ctDate.equals(rhs.ctDate))))&&((this.totalTests == rhs.totalTests)||((this.totalTests!= null)&&this.totalTests.equals(rhs.totalTests))))&&((this.testsCoverage == rhs.testsCoverage)||((this.testsCoverage!= null)&&this.testsCoverage.equals(rhs.testsCoverage))))&&((this.deploymentStatus == rhs.deploymentStatus)||((this.deploymentStatus!= null)&&this.deploymentStatus.equals(rhs.deploymentStatus))))&&((this.testsStatus == rhs.testsStatus)||((this.testsStatus!= null)&&this.testsStatus.equals(rhs.testsStatus))))&&((this.artifactId == rhs.artifactId)||((this.artifactId!= null)&&this.artifactId.equals(rhs.artifactId))))&&((this.codeCoverage == rhs.codeCoverage)||((this.codeCoverage!= null)&&this.codeCoverage.equals(rhs.codeCoverage))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cdDate == rhs.cdDate)||((this.cdDate!= null)&&this.cdDate.equals(rhs.cdDate))));
    }

}
