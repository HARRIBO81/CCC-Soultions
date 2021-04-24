n = int(input())
e = int(input())
counter = 0

for i in range(n,e+1):
    arr=[]
    for j in range(1,i+1):
        if i%j==0:
            arr.append(j)
    if len(arr) == 4:
        counter+=1
print("The number of RSA numbers between " + str(n) + " and " + str(e) + " is " + str(counter))
