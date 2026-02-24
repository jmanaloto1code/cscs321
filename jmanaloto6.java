//Joseph Manaloto
//lab#6


public class jmanaloto6
{
	public static void main (String[] args)
	{

	int x = 5;
	int y = 4;
	double c = 5;
	double v = 4;
	int total1 = 0;
	int total2 = 0;
	int total3 = 0;
	double dtotal1 = 0;
	double dtotal2 = 0;
	double dtotal3 = 0;

	total1 = (x+y*x/y-x);
	total2 = (-x-y/x*y+x);
	total3 = (x+y-x/y);

	dtotal1 = (c+v*c/v-c);
	dtotal2 = (-c-v/c*v+c);
	dtotal3 = (c+v-c/v);

	System.out.println("int total1: " + total1);
	System.out.println("int total2: " + total2);
	System.out.println("int total3: " + total3);

	System.out.println("double dtotal1: " + dtotal1);
	System.out.println("double dtotal2: " + dtotal2);
	System.out.println("double dtotal3: " + dtotal3);
	}
}
