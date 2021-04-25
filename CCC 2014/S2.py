n = int(input())
first = input().split(" ")
second = input().split(" ")
partners = []
tuple_partner = []
for i in range(n):
    partners.append([first[i],second[i]])
for i in partners:
    i.sort()
for i in partners:
    tuple_partner.append(tuple(i))
if len(set(tuple_partner))*2 == n:
    print("good")
else:
    print("bad")
