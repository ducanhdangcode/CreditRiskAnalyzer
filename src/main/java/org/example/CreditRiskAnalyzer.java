package org.example;

public class CreditRiskAnalyzer {
    public String determineStatus(double income, double debtRatio) {
        String status = "";
        if (income < 0 || income > 30 || debtRatio < 0 || debtRatio > 100) {
            status = "INVALID";
        } else if (income < 5 || debtRatio > 60) {
            status = "HIGH_RISK";
        } else if (income >= 5 && debtRatio >= 40) {
            status = "MEDIUM_RISK";
        } else {
            status = "LOW_RISK";
        }
        return status;
    }
}
