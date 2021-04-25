top = [1,2]
bot = [3,4]

userinput = input()

for userinput in userinput:
    if userinput == "H":
        foo = top
        top = bot
        bot = foo
    elif userinput == "V":
        fooo = top[0]
        top[0] = top[1]
        top[1] = fooo
        foooo = bot[0]
        bot[0] = bot[1]
        bot[1] = foooo
for i in top:
    print(i,end=" ")
print()
for i in bot:
    print(i,end=" ")
