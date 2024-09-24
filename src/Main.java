public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000;
        double annualInterestRate = 0.17;

        double monthlyInterestRate = annualInterestRate / 12;

        double interestAfterMonth = balance * monthlyInterestRate;
        double balanceAfterMonth = balance * interestAfterMonth;

        double interestTwoMonths = balanceAfterMonth * monthlyInterestRate;
        double balanceTwoMonths = balanceAfterMonth * interestTwoMonths;

        System.out.println("Initial balance: ");
        System.out.println("Interest after 1 month: $" + interestAfterMonth);
        System.out.println("Balance after 1 month: $" + balanceAfterMonth);
        System.out.println("Interest after 2 months: $" + interestTwoMonths);
        System.out.println("Balance after 2 months: $" + balanceTwoMonths);

    }
}