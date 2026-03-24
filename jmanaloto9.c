//Joseph Manaloto
//Lab #9

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main (void)
{
	srand(time(NULL));
	int i = 0;
	int guess;

	//this will guess between 1 to 20
	int answer = (rand() %20) + 1;

	//If number is out of range.
	
	//Actual guessing format.
	while(guess != answer)
	{
		printf("Guess the number between 1-20. ");
		scanf("%d", &guess);

		if(guess < 1 || guess > 20)
		{
			printf("Invalid range. Pick a number between 1-20. \n");
		}

		else if(guess > answer)
		{
			printf("Guess is incorrect, your guess is greater than the expected number. Your number is: %d ", guess);
		}
		else if(guess < answer)
		{
			printf("Guess is incorrect, your guess is less than the expected number. Your number is: %d ", guess);
		}
		else if(guess == answer)
		{
			for(i = 0; i < answer; i++)
			{
				printf("Guess is CORRECT!!!!!!!! Here's your w. \n");
			}
		}
	}

	return EXIT_SUCCESS;
}

