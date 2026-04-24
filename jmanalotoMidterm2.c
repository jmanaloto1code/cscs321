//Joseph Manaloto
//Midterm #2

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void printingNameLoop(int input);

int main(void)
{
	int input;
	printf("Enter a number: ");
	scanf("%d", &input);
	printingNameLoop(input);

	return EXIT_SUCCESS;

}

void printingNameLoop(int input)
{
	for(int i = 0;i<6;i++)
	{
		printf("Manaloto%d\n", input);

	}
}
