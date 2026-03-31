//Joseph Manaloto
//lab10
import java.util.Scanner;
public class jmanaloto10
{
	public static void main(String [] args)
	{
		double radius = 0;
		double height = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of cylinder: ");
		radius = input.nextDouble();

		System.out.println("Enter the height of cylinder: ");
		height = input.nextDouble();

		//Calls the method
		double volume = area(radius, height);

		System.out.println("Volume: " + volume);
		input.close();
	}

	static double area(double r, double h)
	{
		double result = h*3.14*r*r;

		return result;
	}
}
