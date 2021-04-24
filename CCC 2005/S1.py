def listToString(s):
    str1 = ""
    return (str1.join(s))
n = int(input())
for i in range(n):
    final_string = []
    string = input()
    for char in string:
        if char != "-":
            if char.isalpha() == True:
                if char == "A":
                    final_string.append("2")
                elif char == "B":
                    final_string.append("2")
                elif char == "C":
                    final_string.append("2")
                elif char == "D":
                    final_string.append("3")
                elif char == "E":
                    final_string.append("3")
                elif char == "F":
                    final_string.append("3")
                elif char == "G":
                    final_string.append("4")
                elif char == "H":
                    final_string.append("4")
                elif char == "I":
                    final_string.append("4")
                elif char == "J":
                    final_string.append("5")
                elif char == "K":
                    final_string.append("5")
                elif char == "L":
                    final_string.append("5")
                elif char == "M":
                    final_string.append("6")
                elif char == "N":
                    final_string.append("6")
                elif char == "O":
                    final_string.append("6")
                elif char == "P":
                    final_string.append("7")
                elif char == "Q":
                    final_string.append("7")
                elif char == "R":
                    final_string.append("7")
                elif char == "S":
                    final_string.append("7")
                elif char == "T":
                    final_string.append("8")
                elif char == "U":
                    final_string.append("8")
                elif char == "V":
                    final_string.append("8")
                elif char == "W":
                    final_string.append("9")
                elif char == "X":
                    final_string.append("9")
                elif char == "Y":
                    final_string.append("9")
                elif char == "Z":
                    final_string.append("9")
            else:
                final_string.append(char)
        else:
            continue
    print(listToString(list(''.join(l + '-' * (n == 2 or n == 5) for n, l in enumerate(final_string[:10])))))
