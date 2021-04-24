key = input()
text = input()
ans = ""
id = 0
for i in range(len(text)):
    c = text[i]
    if c.isupper()==True:
        t = ord(key[id%len(key)]) - ord("A") + ord(c)
        if t > ord("Z"):
            t-=26
        ans += chr(t)
        id+=1
print(ans)
