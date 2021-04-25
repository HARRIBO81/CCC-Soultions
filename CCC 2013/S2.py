import sys
raw_input = sys.stdin.readline
max_weight = int(raw_input())
n = int(raw_input())
weights = [0,0,0]
for i in range(n):
    x = int(raw_input())
    weights.append(x)
weights.append(max_weight+1)
counter= 0
index = 3
total = weights[0] + weights[1] + weights[2] + weights[3]
while total <= max_weight:
    counter += 1
    index += 1
    total = weights[index-3] + weights[index-2] + weights[index-1] + weights[index]
print(counter)
