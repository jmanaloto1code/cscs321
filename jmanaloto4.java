//Joseph Manaloto
/*
 * csc321
 * lab#4
 * */
import java.util.Scanner;
public class jmanaloto4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Choose your stat that will give you more power");
		System.out.println("1. Strength");
		System.out.println("2. Defense");
		System.out.println("3. Magic");
		System.out.println("4. Summons");
		System.out.println("What is your choice: ");

		int choice = input.nextInt();

		if (choice == 1)
		{
			System.out.println("You have chosen strength in your journey. May your heart be your guiding key.");
		}
		else if(choice == 2)
		{
			System.out.println("You have chosen defense in your journey. May the shield guard you from darkness.");
		}
		else if(choice == 3)
		{
			System.out.println("You have chosen Magic in your journey. May the power of magic illuminate your path.");
		}
		else if(choice == 4)
		{
			System.out.println("You have chosen Summons in your journey. May your friends help you in your struggles.");
		}
		else
		{
			System.out.println("Invalid option.");
		}

	}
}
