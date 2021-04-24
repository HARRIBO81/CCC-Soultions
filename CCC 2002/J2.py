words = []
while True:
       n = input()
       words.append(n)
       if n == "quit!":
              break

words.remove("quit!")

for i in words:
       if len(i) > 3:
              if i[-3] != "a" and i[-3] != "e" and i[-3] != "i" and i[-3] != "o" and i[-3] != "u" and i[-3] != "y" and i[-2:] == "or":
                     print((i[:-1] + "u" + i[-1:]))

              else:
                     print(i)

       else:
              print(i)
