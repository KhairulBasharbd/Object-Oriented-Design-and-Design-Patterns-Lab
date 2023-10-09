// CheckingAccount.java


// SavingsAccount.java

// InvestmentAccount.java


// BankingServiceFacade.java

// Main.java
public class Main {
    public static void main(String[] args) {
        BankingServiceFacade bankingService = new BankingServiceFacade();

        // Deposit and withdraw from Checking Account
        bankingService.depositToChecking(1000);
        bankingService.withdrawFromChecking(500);

        // Deposit and withdraw from Savings Account
        bankingService.depositToSavings(2000);
        bankingService.withdrawFromSavings(1000);

        // Invest and withdraw from Investment Account
        bankingService.investInInvestmentAccount(5000);
        bankingService.withdrawFromInvestmentAccount(2000);
    }
}
