import java.util.*;

public class ProcessMortgage{
    public static void main(String[] args) {
        Mortgage mortgages[] = new Mortgage[1];
        double interesetRate;
        int mortgageNumber;
        String customerName;
        double mortgageAmount;
        int term;
        String mortgageType;

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER CURRENT INTEREST RATE: ");
        interesetRate = sc.nextDouble();
        sc.nextLine();

        for(int i = 0; i < mortgages.length; i++){
            System.out.print("MORTGAGE TYPE: PERSONAL / BUSINESS: ");
            mortgageType = sc.nextLine();

            while(!mortgageType.equalsIgnoreCase("Personal") && !mortgageType.equalsIgnoreCase("Business")){
                System.out.print("!!INVALID MORTGAGE TYPE!! PLEASE ENTER CORRECT OPTION: ");
                mortgageType = sc.nextLine();
            }
            System.out.print("MORTGAGE NUMBER: ");
            mortgageNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("CUSTOMER NAME: ");
            customerName = sc.nextLine();

            System.out.print("MORTGAGE AMOUNT: ");
            mortgageAmount = sc.nextDouble();

            System.out.print("TERM: ");
            term = sc.nextInt();
            sc.nextLine();

            if(mortgageType.equalsIgnoreCase("Personal"))
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, interesetRate, term);
            else
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, interesetRate, term);
        }
        System.out.println("DETAILS OF MORTGAGES: ");
        for(int i = 0; i < mortgages.length; i++){
            mortgages[i].getMortgageInfo();
            System.out.println("\n");
        }
        sc.close();
    }
}
