q = int(input())
n = int(input())
dmoj = input()
peg = input()
dmoj = [int(a) for a in dmoj.split(" ")]
peg = [int(a) for a in peg.split(" ")]
dmoj = sorted(dmoj)
peg = sorted(peg)
counter = 0
if q == 1:
    for i in range(n):
        if dmoj[i] > peg[i]:
           counter += dmoj[i]
        else:
            counter += peg[i]
    print(counter)
else:
    for i in range(n):
        if dmoj[i] > peg[n-i-1]:
            counter += dmoj[i]
        else:
            counter += peg[n-i-1]
    print(counter)
