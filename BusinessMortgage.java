public class BusinessMortgage extends Mortgage{
    public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interesetRate, int term){
        super(mortgageNumber, customerName, mortgageAmount, (interesetRate+1), term);
    }
}