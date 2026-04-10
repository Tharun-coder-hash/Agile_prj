package com.devops;

public class LoanEligibilityService {

    public static String checkEligibility(int age, double salary, int creditScore) {

        if (age < 21) return "Not Eligible";
        if (salary < 25000) return "Not Eligible";
        if (creditScore < 650) return "Not Eligible";

        return "Eligible";
    }

    public static void main(String[] args) {
        System.out.println("Loan Eligibility Service Running...");
    }
}
