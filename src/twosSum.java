import java.util.Scanner;
public class twosSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        if(number % 2 == 0){
            sum += number;
            System.out.print("Divisible by 2 and the sum is: "+ sum);
        }
        else{
            System.out.print("The number is not divisible by 2 therefore you cannot find sum of 2 ");

        }

    }
}
