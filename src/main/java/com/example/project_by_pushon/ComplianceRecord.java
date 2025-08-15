package com.example.project_by_pushon;

public class ComplianceRecord {

    private String recordId;
    private String recordType;
    private String status;
    private String issueDate;
    private String expiryDate;

    public ComplianceRecord(String recordId, String recordType, String status, String issueDate, String expiryDate) {
        this.recordId = recordId;
        this.recordType = recordType;
        this.status = status;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "ComplianceRecord{" +
                "recordId='" + recordId + '\'' +
                ", recordType='" + recordType + '\'' +
                ", status='" + status + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}