#Joseph Manaloto
#lab 8

#input w/ prompt message
userinput = input("Enter an integer between 0-9: ")
x = int(userinput)
if (x == 5):
    print("You pick the right number!, which was ",x)
elif(x > 5):
    print("The number you pick is: ",x," is wrong, and should be lower.")
else:
    print("The number you pick is: ",x,"is wrong, and should be higher.")

#python loop for saying
for i in range(5):
    print("With great power comes great responsibility.")

#this will be a while loop
y=4
while (y > 0):
    print("My favorite food is donuts.")
    y=y-1

