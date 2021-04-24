import sys
raw_input = sys.stdin.readline
inputs = []
weathers = []
citys = []
while True:
    n = raw_input()
    inputs.append(n)
    if n.split(" ")[0] == "Waterloo":
        break
for ele in inputs:
    weathers.append(int(ele.split(" ")[1]))
    citys.append(ele.split(" ")[0])
min = min(weathers)
e = weathers.index(min)
print(citys[e])
