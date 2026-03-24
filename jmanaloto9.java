//Joseph Manaloto
//csc321
//lab#5
//

import java.util.Scanner;
import java.util.Random;

public class jmanaloto9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int i = 0;
		int guess = 0;
		Random rand = new Random();

		int answer = rand.nextInt(20) + 1;

		while (guess != answer)
		{
			System.out.println("Pick a number between 1-20. ");
		if (input.hasNextInt())
		{
			guess = input.nextInt();
		
		if (guess < 1 || guess > 20)
		{
			System.out.println("Invalid range. Pick a number between 1-20. ");
		}
		else if (guess > answer)
		{
			System.out.println("Guess is incorrect, the number is greater than the answer: " + guess); 
		}
		else if (guess < answer)
		{
			System.out.println("Guess is incorrect, the number is lesser than the answer. " + guess);
		}
		else if ( guess == answer)
		{
			for (i=0; i< answer;i++)
			{
				System.out.println("Guess it correct!");
			}
		}
		}
		}


	}
}
