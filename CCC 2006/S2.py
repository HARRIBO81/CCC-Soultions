orginal = input()
cipher = input()
code = {}
for i in range(len(orginal)):
    code[cipher[i]] = orginal[i]
cipher = input()
plain = []
for char in cipher:
    plain.append(code.get(char, '.'))
print(''.join(plain))
