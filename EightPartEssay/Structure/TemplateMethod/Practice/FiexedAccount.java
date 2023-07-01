package EightPartEssay.Structure.TemplateMethod.Practice;

public class FiexedAccount extends Account {

    @Override
    public String getAccountType() {
        return "死期";
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getAccountType'");
    }

    @Override
    public double getInterestRate() {
        return 5.16D;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getInterestRate'");
    }

}
