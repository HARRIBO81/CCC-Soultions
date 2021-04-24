x = int(input())
y = int(input())
x_lst = []
y_lst = []
counter = 0
for foo in range(y+1):
    x_lst.append(foo)
x_lst.remove(0)
for foo in range(x+1):
    y_lst.append(foo)
y_lst.remove(0)

for bruh in x_lst:
    for bruh2 in y_lst:
        if bruh+bruh2==10:
            counter+=1

if counter == 1:
    print("There is " + str(counter) + " way to get the sum 10.")
else:
    print("There are " + str(counter) + " ways to get the sum 10.")
