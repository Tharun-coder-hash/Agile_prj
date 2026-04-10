
package com.devops;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoanEligibilityServiceTest {

    @Test
    void testEligibleUser() {
        assertEquals("Eligible",
            LoanEligibilityService.checkEligibility(30, 50000, 700));
    }

    @Test
    void testLowAge() {
        assertEquals("Not Eligible",
            LoanEligibilityService.checkEligibility(18, 50000, 700));
    }

    @Test
    void testLowSalary() {
        assertEquals("Not Eligible",
            LoanEligibilityService.checkEligibility(30, 20000, 700));
    }

    @Test
    void testLowCreditScore() {
        assertEquals("Not Eligible",
            LoanEligibilityService.checkEligibility(30, 50000, 600));
    }
}
