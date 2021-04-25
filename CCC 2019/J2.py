n = int(input())
fortnite_array = []
for i in range(n):
    eee = input()
    fortnite_array.append(eee.split(" "))

for i in fortnite_array:
    print(int(i[0]) * i[1])
