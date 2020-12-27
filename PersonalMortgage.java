public class PersonalMortgage extends Mortgage{
    public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interesetRate, int term){
        super(mortgageNumber, customerName, mortgageAmount, (interesetRate+2), term);
    }
}
