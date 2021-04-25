string = input()
c = "bcdfghjklmnpqrstvwxyz"
cv = "aaeeeiiiiooooouuuuuuu"
nc = "cdfghjklmnpqrstvwxyzz"
nw = ""
for i in range(len(string)):
    ee = c.find(string[i])
    nw = nw+string[i]
    if ee >-1:
        nw = nw+cv[ee]+nc[ee]
print(nw)
