def time1(string):
    counter = 0
    '''part one'''
    for i in range(len(string)):
        c = string[i]
        if c=="a" or c=="d" or c=="g" or c=="j" or c =="m" or c == "p" or c == "t" or c == "w":
            counter += 1
        elif c== "b" or c == "e" or c == "h" or c =="k" or c == "n" or c == "q" or c == "u" or c == "x":
            counter+=2
        elif c == "c" or c == "f" or c == "i" or c == "l" or c == "o" or c == "r" or c == "v" or c == "y":
            counter+=3
        else:
            counter += 4
    return counter
def time2(string):
    counter = 0
    for i in range(len(string)-1):
        c = string[i]
        d = string[i+1]
        if (c == "a" or c == "b" or c == "c") and (d == "a" or d == "b" or d == "c"):
            counter+=2
        elif (c=="d" or c=="e" or c =="f") and (d=="d" or d=="e" or d=="f"):
            counter += 2
        elif (c=="g"or c=="h" or c=="i") and (d=="g"or d=="h" or d=="i"):
            counter += 2
        elif (c=="j"or c=="k" or c=="l") and (d=="j"or d=="k" or d=="l"):
            counter+=2
        elif (c=="m"or c=="n" or c=="o") and (d=="m"or d=="n" or d=="o"):
            counter +=2
        elif (c=="p"or c=="q" or c=="r" or c=="s") and (d=="p"or d=="q" or d=="r" or d=="s"):
            counter+=2
        elif (c=="t"or c=="u" or c=="v") and (d=="t"or d=="u" or d=="v"):
            counter+=2
        elif (c=="w"or c=="x" or c=="y" or c=="z") and (d=="w"or d=="x" or d=="y" or d == "z"):
            counter+=2
    return counter
while True:
    string = input()
    if string == "halt":
        break
    print(time1(string)+time2(string))
