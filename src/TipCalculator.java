import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter bill in dollars and cents:");
        double bill=input.nextDouble();
        //asks for bill before tip
        System.out.println("How many people are in your party?");
        int people=input.nextInt();
        System.out.println("How much would you like to tip?");
        double percentTip=input.nextDouble();
        percentTip/=100;
        //divide by 100 to add to 1 and multiply by total
        double total=(1+percentTip)*bill;
        //get bill with tip
        double perPerson=total/people;
        //what each person has to pay
        //I need to figure out tip per person and rounding up.
        System.out.println("The total bill is $"+total);
        System.out.println("Each person has to pay a tip of $");
        System.out.println("Each person will have to pay a total of $"+perPerson+".");

    }
}
