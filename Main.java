import java.util.Scanner;
/**
 * Write a description of class WhileLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main (String[] args)
    {
        int num1 = (int)(Math.random()*20)+1;
        int count = 0;
        int sum =0;

        while(count < 50)
        {
            num1 = (int)(Math.random()*20)+1;
            sum+=num1; // sum = sum + num1;
            System.out.println(num1);
            count++; //count = count +1;
        }
        System.out.println("The sum is: = "+sum);

        Scanner input = new Scanner(System.in);
        int num2=0;
        System.out.println("please enter a number; press -99 to stop");
        num2 = input.nextInt();
        while(num2 != -99)
        {
            sum+=num2;
            System.out.println("please enter a number; press -99 to stop");
            num2 = input.nextInt();
        }
        System.out.println(sum);
        System.out.println("==============================");
        int counterNum =0;
        int stopValue = 10;
        while (counterNum < stopValue)
        {
          System.out.println((int)(Math.random()*20)+1);
          counterNum++;
        }
    }
}
