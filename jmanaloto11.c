//Joseph Manaloto
//Lab #11
//

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double calcHypo(double base, double height);

int main (void)
{
	double base;
	double height;
	double hypo;

	printf("Enter the base: ");
	scanf("%lf", &base);

	printf("Enter the height: ");
	scanf("%lf", &height);

	hypo = calcHypo(base, height);
	printf("Hypotenuse of the triangle is %lf \n", hypo);

	return EXIT_SUCCESS;
}

double calcHypo(double base, double height)
{
	double calc = sqrt(base*base + height*height);
	return calc;

}
