n = int(input())
week_one  = input()
week_two = input()

counter = 0

week_one = [i for i in week_one]
week_two = [i for i in week_two]

c_in_one = [i for i,val in enumerate(week_one) if val=="C"]

c_in_two = [x for x,val in enumerate(week_two) if val=="C"]

for i in c_in_one:
    for x in c_in_two:
        if i == x:
            counter+=1

print(counter)
