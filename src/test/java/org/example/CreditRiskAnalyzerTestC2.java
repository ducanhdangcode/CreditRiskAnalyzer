package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditRiskAnalyzerTestC2 {
    @Test
    void TestRisk01() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("INVALID", analyzer.determineStatus(100, 50));
    }

    @Test
    void TestRisk02() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("HIGH_RISK", analyzer.determineStatus(3, 40));
    }

    @Test
    void TestRisk03() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("MEDIUM_RISK", analyzer.determineStatus(10, 55));
    }

    @Test
    void TestRisk04() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("LOW_RISK", analyzer.determineStatus(10, 35));
    }
}
