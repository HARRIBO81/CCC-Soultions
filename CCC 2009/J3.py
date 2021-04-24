time = int(input())



print(time, "in Ottawa")


Victoria = time-300
if Victoria < 0:
    Victoria = (Victoria)+2400
    print(Victoria, "in Victoria")
elif Victoria > 0:
    print(time-300, "in Victoria")


Edmonton = time-200
if Edmonton < 0:
    Edmonton = (Edmonton)+2400
    print(Edmonton, "in Edmonton")
elif Edmonton > 0:
    print(time-200, "in Edmonton")

Winnipeg = time-100
if Winnipeg < 0:
    Winnipeg = (Winnipeg)+2400
    print(Winnipeg, "in Winnipeg")
elif Winnipeg > 0:
    print(time-100, "in Winnipeg")

print(time, "in Toronto")

halfix = time + 100
if halfix > 2360:
    halfix = (time+100)-2400
    print(halfix, "in Halifax")
elif halfix < 2360:
    print(time+100, "in Halifax")




Johns = time + 130
if Johns > 2360:
    Johns = (time+130)-2400
    print(Johns, "in St. John's")

elif Johns == 275:
    print("315" + " in St. John's")

elif Johns < 2360:
    print(time+130, "in St. John's")
