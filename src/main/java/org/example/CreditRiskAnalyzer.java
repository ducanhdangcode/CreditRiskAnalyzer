package org.example;

public class CreditRiskAnalyzer {
    public String determineStatus(double income, double debtRatio) {
        if (income < 0 || income > 30 || debtRatio < 0 || debtRatio > 100) {
            return "INVALID";
        } else if (income < 5 || debtRatio > 60) {
            return "HIGH_RISK";
        } else if (income >= 5 && debtRatio >= 40) {
            return "MEDIUM_RISK";
        } else {
            return "LOW_RISK";
        }
    }
}
