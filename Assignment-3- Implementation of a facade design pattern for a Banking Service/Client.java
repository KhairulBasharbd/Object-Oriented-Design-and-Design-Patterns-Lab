
public class Client {
    public static void main(String[] args) {
        BankingServiceFacade bankingService = new BankingServiceFacade();

        
        bankingService.depositToChecking(1000);
        bankingService.withdrawFromChecking(500);

        
        bankingService.depositToSavings(2000);
        bankingService.withdrawFromSavings(1000);

        bankingService.investInInvestmentAccount(5000);
        bankingService.withdrawFromInvestmentAccount(2000);
    }
}
