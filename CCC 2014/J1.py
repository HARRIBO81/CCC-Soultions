one = int(input())
two = int(input())
three = int(input())


if one + two + three != 180:
    print("Error")
elif one == 60 and two == 60 and three == 60:
    print("Equilateral")
elif one + two + three == 180 and one == two or one == three or two == three:
    print("Isosceles")
elif one + two + three == 180 and one != two or one != three or two != three:
    print("Scalene")
