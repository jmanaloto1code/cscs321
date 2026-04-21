#Joseph Manaloto
#Lab 12

def calcRectangle(base,height):
    x = base * height
    return x

b = int(input("Enter the base of the rectangle: "))
h = int(input("Enter the height of the rectangle: "))

area = calcRectangle(b,h)

print("Area of rectangle is ", area)

def calcCircle(radius):
    x = 3.14 * radius ** 2
    return x

r = int(input("Enter the radius of the circle: "))

area = calcCircle(r)

print("Area of circle is ", area)


