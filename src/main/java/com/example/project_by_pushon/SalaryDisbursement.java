package com.example.project_by_pushon;

public class SalaryDisbursement {

    private String employeeId;
    private String employeeName;
    private double amount;
    private String paymentDate;
    private String status;

    public SalaryDisbursement(String employeeId, String employeeName, double amount, String paymentDate, String status) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.status = status;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SalaryDisbursement{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", amount=" + amount +
                ", paymentDate='" + paymentDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}