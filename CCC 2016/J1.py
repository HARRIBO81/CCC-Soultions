one = input()
two = input()
three = input()
four = input()
five = input()
six = input()

w = one.count("W") + two.count("W") + three.count("W") + four.count("W") + five.count("W") + six.count("W")

if w == 5 or w ==6:
    print("1")

elif w == 3 or w == 4:
    print("2")

elif w == 1 or w == 2:
    print("3")

elif w == 0:
    print("-1")
