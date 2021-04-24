daytime = int(input())
evening = int(input())
weekend = int(input())

if daytime < 100:
    a_daytime = 0
else:
    a_daytime = (daytime-100) * 0.25
a_evening = 0.15*evening
a_weekend = 0.20*weekend

if daytime < 250:
    b_daytime = 0
else:
    b_daytime = (daytime-250) * 0.45
b_evening = 0.35*evening
b_weekend = 0.25*weekend

print("Plan A costs " + str(round(a_daytime + a_evening + a_weekend, 2)))
print("Plan B costs " + str(round(b_daytime + b_evening + b_weekend, 2)))
if round(a_daytime + a_evening + a_weekend,2) < round(b_weekend + b_evening + b_daytime,2):
    print("Plan A is cheapest.")
elif round(a_weekend + a_evening + a_daytime,2) > round(b_daytime + b_evening + b_weekend,2):
    print("Plan B is cheapest.")
else:
    print("Plan A and B are the same price.")
