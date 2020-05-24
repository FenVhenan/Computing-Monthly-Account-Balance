
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Jessica Craw
 * This assignment is to show how much money you save after a six month period
 * with a user input of how much you initially saved.
 * The program will request an input from the user for their monthly saving
 * amount and from there we'll do the math.
 * The annual interest rate is 5% and we'll just have to divide it by 12.
 * I'm just worried about the amount after six months so I'll be skipping the
 * calculations to display the other months.
 */

public class ProgrammingAssignment2 {
    public static void main(String[] args){
        
        //bring in the new scanner and decimal format object
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");
        
        //Declare the variables
        
        double annualInterestRate = 0.05/12;
        double monthlySavingAmount;
        double firstMonth, secondMonth, thirdMonth, fourthMonth, fifthMonth, sixthMonth;
        
        //request input from user
        
        System.out.println("Enter the monthly saving amount: ");
        monthlySavingAmount = input.nextDouble();
        
        //math will be done here
        
        firstMonth = (monthlySavingAmount) * (1 + 0.00417);
        secondMonth = (monthlySavingAmount + firstMonth) * (1 + 0.00417);
        thirdMonth = (monthlySavingAmount + secondMonth) * (1 + 0.00417);
        fourthMonth = (monthlySavingAmount + thirdMonth) * (1 + 0.00417);
        fifthMonth = (monthlySavingAmount + fourthMonth) * (1 + 0.00417);
        sixthMonth = (monthlySavingAmount + fifthMonth) * (1 + 0.00417);
        
        //format the result so it is only two decimal places
        
        String format = df.format(sixthMonth);
        
        //display the result
        
        System.out.println("After the sixth month, the account value is $" + format);
    }
}
