// NOTE: There are more optimal ways of solving this problem!

import math

start = int(input())
end = int(input())

def is_square(n):
    square_root = math.sqrt(n)
    return ((square_root - math.floor(square_root))==0)

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
