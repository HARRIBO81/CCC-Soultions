p = int(input())
g = int(input())
r = int(input())
o = int(input())
t = int(input())
cnt=0
e = []
for i in range(t+1):
    for j in range(t+1):
        for x in range(t+1):
            for y in range(t+1):
                if i * p + j * g + x * r + y * o ==t:
                    print("# of PINK is " + str(i),end=" ")
                    print("# of GREEN is " + str(j),end=" ")
                    print("# of RED is " + str(x),end=" ")
                    print("# of ORANGE is " + str(y))
                    cnt+=1
                    e.append(i+j+x+y)
print("Total combinations is "+str(cnt)+".")
print("Minimum number of tickets to print is "+str(min(e))+".")
