public abstract class Mortgage implements MortgageConstants{
    private int mortgageNumber;
    private String customerName;
    private double mortgageAmount;
    private double interesetRate;
    private int term;

    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, double interesetRate, int term){
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;

        if(mortgageAmount > maxMortgageAmount){
            this.mortgageAmount = maxMortgageAmount;
        }else {
            this.mortgageAmount = mortgageAmount;
        }
        this.interesetRate = interesetRate;

        if(term != shortTerm && term != mediumTerm && term != longTerm){
            this.term = shortTerm;
        }else {
            this.term = term;
        }
    }

    public void getMortgageInfo(){
        System.out.println("BANK NAME: "+bankName);
        System.out.println("MORTGAGE NUMBER: "+mortgageNumber);
        System.out.println("CUSTOMER NAME: "+customerName);
        System.out.println("MORTGAGE AMOUNT: "+mortgageAmount);
        System.out.println("INTEREST RATE: "+interesetRate);
        System.out.println("TERM: "+term);

        double amountOwed = mortgageAmount + (mortgageAmount*interesetRate*term)/100;
        System.out.println("TOTAL AMOUNT OWED AFTER: "+term+" YEARS: "+amountOwed);
    }
}