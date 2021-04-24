// NOTE: There are more optimal ways of solving this problem!

import math

start = int(input())
end = int(input())

def is_square(n):     // BINARY SEARCH METHOD
    if n < 0:
        return False
    if n == 0:
        return True
    x, y = 1, n
    while x + 1 < y:
        mid = (x+y)//2
        if mid**2 < n:
            x = mid
        else:
            y = mid
    return n == x**2 or n == (x+1)**2

def is_cube(n):
    cube_root = n**(1./3.)
    if round(cube_root) ** 3 == n:
        return True
    else:
        return False
cnt = 0

for i in range(start, end+1):
    if is_square(i)==True and is_cube(i)==True:
        cnt+=1

print(cnt)
