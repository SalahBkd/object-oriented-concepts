package com.salahbkd.mortgagecalculator.oop;

public class MortgageCalculator {
	private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;
    
	private int principal;
	private float annualInterest;
	private byte years;
	
	public MortgageCalculator(int principal, float annualInterest, byte years) {
		this.principal = principal;
		this.annualInterest = annualInterest;
		this.years = years;
	}
	
	public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double mortgage = this.principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
	}

	public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double balance = this.principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }
	
	public double[] getRemainingBalances() {
		double[] balances = new double[this.getNumberOfPayments()];
		for (short month = 1; month <= this.getNumberOfPayments(); month++) {
			balances[month-1] = this.calculateBalance(month);
        }
		return balances;
	}

	private int getNumberOfPayments() {
		return this.years * MONTHS_IN_YEAR;
	}
	
	private float getMonthlyInterest() {
		return this.annualInterest / PERCENT / MONTHS_IN_YEAR;
	}
	
}
