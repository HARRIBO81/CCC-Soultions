n = int(input())
m = int(input())
adjecitvs = []
nouns = []
for i in range(n):
    adjecitvs.append(input())
for i in range(m):
    nouns.append(input())
for i in adjecitvs:
    for j in nouns:
        print(i + " as " + j)
