def unique(s):
    uchars = set()
    for c in s:
        if c in uchars:
            return False
        uchars.add(c)
    return True
n = int(input())+1
while unique(str(n)) == False:
    if unique(str(n)) == False:
        n+=1
    else:
        break
print(n)
