smelly_numbers = {}

for x in range(-1,-201,-1):
    for y in range (-200,201):
        smelly_numbers[(x,y)] = False

smelly_numbers[(-1,0)] = True
smelly_numbers[(-2,0)] = True
smelly_numbers[(-3,0)] = True
smelly_numbers[(-3,1)] = True
smelly_numbers[(-3,2)] = True
smelly_numbers[(-3,3)] = True
smelly_numbers[(-4,3)] = True
smelly_numbers[(-5,3)] = True
smelly_numbers[(-5,4)] = True
smelly_numbers[(-5,5)] = True
smelly_numbers[(-4,5)] = True
smelly_numbers[(-3,5)] = True
smelly_numbers[(-3,6)] = True
smelly_numbers[(-3,7)] = True
smelly_numbers[(-4,7)] = True
smelly_numbers[(-5,7)] = True
smelly_numbers[(-6,7)] = True
smelly_numbers[(-7,7)] = True
smelly_numbers[(-7,6)] = True
smelly_numbers[(-7,5)] = True
smelly_numbers[(-7,4)] = True
smelly_numbers[(-7,3)] = True
smelly_numbers[(-7,2)] = True
smelly_numbers[(-7,1)] = True
smelly_numbers[(-7,0)] = True
smelly_numbers[(-7,-1)] = True
smelly_numbers[(-6,-1)] = True
smelly_numbers[(-5,-1)] = True
line = input()
direction = line.split(" ")[0]
distance = int(line.split(" ")[1])

safe = True
x_axis = -5
y_axis = -1
while safe and direction != "q":
    y = 0
    x = 0
    if direction == "l":
        x = -1
    elif direction == "u":
        y = 1
    elif direction == "r":
        x = 1
    elif direction == "d":
        y = -1

    while distance > 0:
        x_axis = x_axis + y
        y_axis = y_axis + x
        if smelly_numbers[(x_axis,y_axis)]:
            safe = False
        else:
            smelly_numbers[(x_axis,y_axis)] = True
        distance = distance - 1

    if safe == True:
        print(y_axis, x_axis, "safe")
    elif safe == False:
        print (y_axis, x_axis, "DANGER")

    line = input()
    direction = line.split(" ")[0]
    distance = int(line.split(" ")[1])
