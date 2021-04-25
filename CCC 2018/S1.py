foo = int(input())
villl = []

for i in range(foo):
    villl.append(int(input()))
    
villl.sort()
minimum = 2000000001

for i, x in enumerate(villl):
    if foo - 1 > i > 0:
        pre = villl[i - 1]
        fut = villl[i + 1]
        
        
        vil_size = (x - pre) / 2 + (fut - x) / 2
        if vil_size< minimum:
            minimum = vil_size
        
            
print(minimum)
