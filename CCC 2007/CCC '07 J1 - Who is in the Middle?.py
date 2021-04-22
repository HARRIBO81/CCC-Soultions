sum = 0
n = int(input())
k = int(input())
x = int(input())

if n < k and n > x or n < x and n > k:
    print(n)

elif k < n and k > x or k < x and k > n:
    print(k)

else:
    print(x)

   
