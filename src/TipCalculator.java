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
        double totalTip=total-bill;
        System.out.printf("The total bill is $ %.2f %n",total);
        System.out.printf("The total tip is $ %.2f %n",totalTip);
        System.out.printf("Each person has to pay a tip of $ %.2f %n",(totalTip/people) );
        System.out.printf("Each person will have to pay a total of $ %.2f %n",perPerson);

    }
}
    //Your program should prompt the user for the following information:
        //Total bill
       // Tip Percentage (in a whole number, without the percentage sign)
        //Number of people in the party

       // Your program should then calculate the following information and display it to the user (this is slightly different than the information above):
       // The total tip amount
       // The total bill including tip
       // The tip per person
       // The total per person (bill and tip together)
