brief_cases = [100,500,1000,5000,10000,25000,50000,100000,500000,1000000]
remove_list = []

n = int(input())
for i in range(n):
    e = int(input())
    remove_list.append(brief_cases[e-1])
    
for i in remove_list:
    brief_cases.remove(i)
    
deal = int(input())
avarage = 0

for i in brief_cases:
    avarage+=i
avarage/=len(brief_cases)
if deal > avarage:
    print("deal")
else:
    print("no deal")
