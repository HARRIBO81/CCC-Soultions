one = int(input())
two = int(input())
three = int(input())
four = int(input())

if two > one and three > two and four > three:
    print("Fish Rising")

elif four < three and three < two and two < one:
    print("Fish Diving")

elif one == two and one == three and one == four and two == three and two == four and three == four:
    print("Fish At Constant Depth")
else:
    print("No Fish")
