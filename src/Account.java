import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private double currentAccountBalance=0;
    private double savingsAccountBalance=0;
    private int customerNumber;
    private int pinNumber;

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0,00");
    Scanner scanner = new Scanner(System.in);

    public Account(double currentAccountBalance, double savingsAccountBalance, int customerNumber, int pinNumber) {
        this.currentAccountBalance = currentAccountBalance;
        this.savingsAccountBalance = savingsAccountBalance;
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
    }

    public Account() {

    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public Double getCurrentAccountBalance() {
        return currentAccountBalance;
    }

    public void setCurrentAccountBalance(double currentAccountBalance) {
        this.currentAccountBalance = currentAccountBalance;
    }

    public Double getSavingsAccountBalance() {
        return savingsAccountBalance;
    }

    public void setSavingsAccountBalance(double savingsAccountBalance) {
        this.savingsAccountBalance = savingsAccountBalance;
    }


    public double calcCurrentWithdraw(double amount){
        currentAccountBalance = (currentAccountBalance-amount);
        return  currentAccountBalance;
    }
    public double calcSavingsWithdraw(double amount){
        savingsAccountBalance = (savingsAccountBalance-amount);
        return  savingsAccountBalance;
    }

    public double calcCurrentDeposit(double amount){
        currentAccountBalance = (currentAccountBalance+amount);
        return currentAccountBalance;
    }
    public double calcSavingsDeposit(double amount){
        savingsAccountBalance = (savingsAccountBalance+amount);
        return savingsAccountBalance;
    }

    public void getCurrentAccountWithdrawal(){
        System.out.println("Current Account Balance: "+ moneyFormat.format(currentAccountBalance));
        System.out.println("Amount you want to withdraw: ");
        double amount = scanner.nextDouble();

        if(currentAccountBalance-amount>=0) {
            calcCurrentWithdraw(amount);
            System.out.println("New Balance Current: " + currentAccountBalance);
        }else
            System.out.println("Balance cannot be negative ");

    }

    public void getSavingsAccountWithdrawal(){
        System.out.println("Savings Account Balance: "+ moneyFormat.format(savingsAccountBalance));
        System.out.println("Amount you want to withdraw: ");
        double amount = scanner.nextDouble();

        if(savingsAccountBalance-amount>=0) {
            calcSavingsWithdraw(amount);
            System.out.println("New Balance Savings: " + savingsAccountBalance);
        }else
            System.out.println("Balance cannot be negative ");

    }

    public void getCurrentAccountDeposite(){
        System.out.println("Current Account Balance: "+ moneyFormat.format(currentAccountBalance));
        System.out.println("Amount you want to Deposite: ");
        double amount = scanner.nextDouble();

            calcCurrentDeposit(amount);
            System.out.println("New Balance Current: " + currentAccountBalance);

    }

    public void getSavingsAccountDeposite(){
        System.out.println("Savings Account Balance: "+ moneyFormat.format(savingsAccountBalance));
        System.out.println("Amount you want to deposite: ");
        double amount = scanner.nextDouble();

        calcSavingsDeposit(amount);
        System.out.println("New Balance Savings : " + savingsAccountBalance);

    }



}
