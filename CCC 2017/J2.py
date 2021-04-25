n = int(input())
k = int(input())

if k == 0:
    print(n)

elif k == 1:
    print(n + n*10)

elif k == 2:
    print(n+n*10+n*100)

elif k == 3:
    print(n+n*10+n*100+n*1000)

elif k == 4:
    print(n+n*10+n*100+n*1000+n*10000)

elif k == 5:
    print(n + n * 10 + n * 100 + n * 1000 + n * 10000 + n * 100000)
