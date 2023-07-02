package EightPartEssay.Structure.TemplateMethod.Practice;

public abstract class Account {
    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    protected abstract String getAccountType();

    protected abstract double getInterestRate();

    public double calculateAmount(String accountType, String accountNumber) {
        // 从数据库拿数据（此处省略，直接返回固定数字）
        return 4567.00D;
    };

    public double calculateInterest() {
        String accountType = getAccountType();
        double interestRate = getInterestRate();
        double amount = calculateAmount(accountType, accountNumber);
        return amount * interestRate;
    }

}
