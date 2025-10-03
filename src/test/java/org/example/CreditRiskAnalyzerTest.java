package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditRiskAnalyzerTest {
    @Test
    void TestRisk01() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("INVALID", analyzer.determineStatus(-20, 100));
    }

    @Test
    void TestRisk02() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("INVALID", analyzer.determineStatus(200, 100));
    }

    @Test
    void TestRisk03() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("INVALID", analyzer.determineStatus(20, -20));
    }

    @Test
    void TestRisk04() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("INVALID", analyzer.determineStatus(20, 200));
    }

    @Test
    void TestRisk05() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("HIGH_RISK", analyzer.determineStatus(3, 20));
    }

    @Test
    void TestRisk06() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("HIGH_RISK", analyzer.determineStatus(30, 70));
    }

    @Test
    void TestRisk07() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("LOW_RISK", analyzer.determineStatus(30, 30));
    }

    @Test
    void TestRisk08() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("MEDIUM_RISK", analyzer.determineStatus(30, 55));
    }
}