a = int(input())
b = int(input())
counter = 1
while True:
    counter+=1
    c=a-b
    a =b
    b =c

    if a < 0 or b < 0:
        break
print(counter)
