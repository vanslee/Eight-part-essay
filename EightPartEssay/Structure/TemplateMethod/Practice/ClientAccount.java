package EightPartEssay.Structure.TemplateMethod.Practice;

public class ClientAccount {
    public static void main(String[] args) {
        Account dAccount = new DemandAccount();
        FiexedAccount fiexedAccount = new FiexedAccount();
        System.out.println(dAccount.calculateInterest());
        System.out.println(fiexedAccount.calculateInterest());
    }

}
