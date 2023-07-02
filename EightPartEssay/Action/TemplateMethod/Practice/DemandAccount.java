package EightPartEssay.Structure.TemplateMethod.Practice;

/**
 * 活期账户
 */
public class DemandAccount extends Account {

    @Override
    public String getAccountType() {
        return "活期";
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getAccountType'");
    }

    @Override
    public double getInterestRate() {
        return 3.14D;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getInterestRate'");
    }

}
