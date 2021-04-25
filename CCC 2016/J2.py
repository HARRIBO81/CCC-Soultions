data = []
for i in range(0,4):
    foo = list(map(int, input().split(" ")))
    data.append(foo)

if sum(data[0]) == sum(data[1]) and sum(data[0]) == sum(data[2]) and sum(data[0]) == sum(data[3]) and sum(data[1]) == sum(data[2]) and sum(data[1]) == sum(data[3]) and sum(data[2]) == sum(data[3]):
    if data[0][0] + data[1][0] + data[2][0] + data[3][0] == data[0][1] + data[1][1] + data[2][1] + data[3][1] and data[0][0] + data[1][0] + data[2][0] + data[3][0] == data[0][2] + data[1][2] + data[2][2] + data[3][2] and data[0][0] + data[1][0] + data[2][0] + data[3][0] == data[0][3] + data[1][3] + data[2][3] + data[3][3] and data[0][1] + data[1][1] + data[2][1] + data[3][1] == data[0][2] + data[1][2] + data[2][2] + data[3][2] and data[0][1] + data[1][1] + data[2][1] + data[3][1] == data[0][3] + data[1][3] + data[2][3] + data[3][3] and data[0][2] + data[1][2] + data[2][2] + data[3][2] == data[0][3] + data[1][3] + data[2][3] + data[3][3]:
        print("magic")
else:
    print("not magic")
