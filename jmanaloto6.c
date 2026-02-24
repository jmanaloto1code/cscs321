//Joseph Manaloto
//lab #5

#include <stdio.h>
#include <stdlib.h>
#include<math.h>

int main(void)
{
	int x =5;
	int y =4;
	double c =5;
	double v=4;
	int total1=0;
	double dtotal1=0;
	int total2=0;
	double dtotal2=0;
	int total3=0;
	double dtotal3=0;


	//x+y*x/y-x
	//-x-y/x*y+x
	//x+y-x/y
	
	total1 = x+y*x/y-x;
	total2 = -x-y/x*y+x;
	total3 = x+y-x/y;

	dtotal1 = c+v*c/v-c;
	dtotal2 = -c-v/c*v+c;
	dtotal3 = c+v-c/v;

	printf("total1: %d \n",total1);
	printf("dtotal1: %lf \n",dtotal1);
	printf("total2: %d \n",total2);
	printf("dtotal2: %lf \n",dtotal2);
	printf("total3: %d \n",total3);
	printf("dtotal3: %lf \n",dtotal3);

	return EXIT_SUCCESS;
}
