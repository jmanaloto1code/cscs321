//Joseph Manaloto
//Midterm 1

import java.util.Scanner;

public class jmanalotoMidterm1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Choose a number between 10-20.");

		int choice = input.nextInt();

		if (choice == 15)
		{
			System.out.println("You have chosen the right number: " + choice );
		}
		else if( choice < 15)
		{
			System.out.println("You have picked "+ choice +" which is lower than the expected number. WRONG");
		}
		else if(choice > 15)
		{
			System.out.println("You have picked " + choice +" which was higher than the expected number. WRONG");
		}


	}
}
