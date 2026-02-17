//Joseph Manaloto
//lab #5

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int a = 21;
	float b = 6.11;
	char c = 'C';
	double d = 7.25;

	printf("Variable value = %d, Address = %p \n",a,&a);
	printf("Float value = %.2f, Address = %p \n", b,&b);
	printf("Char value = %c, Address = %p \n", c,&c);
	printf("Double value = %.2f, Address = %p \n", d,&d);

	int num = 25;
	if(num >10)
	{
		printf("Number in-scope: %d \n", num);
	}
	
	printf("Yello, wuz goooddddddd.",num);
	
	int arrayNum[10] = {1,2,3,4,5,6,7,8,9,10};

	for(int i = 0; i<10;i++)
	{
		printf("Index %d: Value = %d,Address = %p \n", i, arrayNum[i], &arrayNum[i]);
	}




	return EXIT_SUCCESS;
}
