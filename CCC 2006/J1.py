burger = int(input())
side = int(input())
drink = int(input())
dessert = int(input())

total = 0

if burger == 1:
    total += 461
elif burger == 2:
    total += 431
elif burger == 3:
    total += 420
elif burger == 4:
    total += 0


if side == 1:
    total += 100
elif side == 2:
    total += 57
elif side == 3:
    total += 70
elif side == 4:
    total += 0

if drink == 1:
    total += 130
elif drink == 2:
    total += 160
elif drink == 3:
    total += 118
elif drink == 4:
    total += 0



if dessert == 1:
    total += 167
elif dessert == 2:
    total += 266
elif dessert == 3:
    total += 75
elif dessert == 4:
    total += 0


print("Your total Calorie count is " + str(total) + ".")
