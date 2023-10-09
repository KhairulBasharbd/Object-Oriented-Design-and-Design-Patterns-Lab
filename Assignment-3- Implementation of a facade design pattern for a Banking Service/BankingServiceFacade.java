
public class BankingServiceFacade {
    private CheckingAccount checkingAccount;
    private SavingsAccount savingsAccount;
    private InvestmentAccount investmentAccount;

    public BankingServiceFacade() {
        checkingAccount = new CheckingAccount();
        savingsAccount = new SavingsAccount();
        investmentAccount = new InvestmentAccount();
    }

    public void depositToChecking(double amount) {
        checkingAccount.deposit(amount);
    }

    public void withdrawFromChecking(double amount) {
        checkingAccount.withdraw(amount);
    }

    public void depositToSavings(double amount) {
        savingsAccount.deposit(amount);
    }

    public void withdrawFromSavings(double amount) {
        savingsAccount.withdraw(amount);
    }

    public void investInInvestmentAccount(double amount) {
        investmentAccount.invest(amount);
    }

    public void withdrawFromInvestmentAccount(double amount) {
        investmentAccount.withdraw(amount);
    }
}
