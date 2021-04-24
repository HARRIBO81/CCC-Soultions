word = input()

word = [a for a in str(word)]

target_letters = set(["I","O","S","H","Z","X","N"])

if set(word).issubset(target_letters):
    print("YES")
else:
    print("NO")
