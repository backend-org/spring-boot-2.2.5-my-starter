package org.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "loan-properties")
public class LoanProperties {
    int minCarCostForLoanApprove;
    int minUserIncomeForLoanApprove;
    double maxApproveMultiplierOfCarCost;
    int maxApproveMultiplierOfCountOfMonthsIncome;
    String usersIncomeUri;

    public int getMinCarCostForLoanApprove() {
        return minCarCostForLoanApprove;
    }

    public void setMinCarCostForLoanApprove(int minCarCostForLoanApprove) {
        this.minCarCostForLoanApprove = minCarCostForLoanApprove;
    }

    public int getMinUserIncomeForLoanApprove() {
        return minUserIncomeForLoanApprove;
    }

    public void setMinUserIncomeForLoanApprove(int minUserIncomeForLoanApprove) {
        this.minUserIncomeForLoanApprove = minUserIncomeForLoanApprove;
    }

    public double getMaxApproveMultiplierOfCarCost() {
        return maxApproveMultiplierOfCarCost;
    }

    public void setMaxApproveMultiplierOfCarCost(double maxApproveMultiplierOfCarCost) {
        this.maxApproveMultiplierOfCarCost = maxApproveMultiplierOfCarCost;
    }

    public int getMaxApproveMultiplierOfCountOfMonthsIncome() {
        return maxApproveMultiplierOfCountOfMonthsIncome;
    }

    public void setMaxApproveMultiplierOfCountOfMonthsIncome(int maxApproveMultiplierOfCountOfMonthsIncome) {
        this.maxApproveMultiplierOfCountOfMonthsIncome = maxApproveMultiplierOfCountOfMonthsIncome;
    }

    public String getUsersIncomeUri() {
        return usersIncomeUri;
    }

    public void setUsersIncomeUri(String usersIncomeUri) {
        this.usersIncomeUri = usersIncomeUri;
    }
}
