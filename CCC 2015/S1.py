n = int(input())
inputs = []
for i in range(n):
    k = int(input())
    inputs.append(k)

list = []


for n in inputs:
    if n > 0:
        list.append(n)
    else:
        list.pop()

sum = 0
for i in range(len(list)):
    sum = sum + list[i]

print(sum)
