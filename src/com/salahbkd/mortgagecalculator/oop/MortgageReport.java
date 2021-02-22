package com.salahbkd.mortgagecalculator.oop;

import java.text.NumberFormat;

public class MortgageReport {

	private MortgageCalculator mortgageCalculator;
	private final NumberFormat currency;
			
	public MortgageReport(MortgageCalculator mortgageCalculator) {
		this.mortgageCalculator = mortgageCalculator;
		this.currency = NumberFormat.getCurrencyInstance();
	}

	public void printMortgage() {
        double mortgage = mortgageCalculator.calculateMortgage();
		String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
	
	public void printPaymentSchedule() {
		System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        double[] balances = mortgageCalculator.getRemainingBalances();
        for(double balance : balances)
            System.out.println(currency.format(balance));
    }
}
