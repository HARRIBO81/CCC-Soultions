set_up = ["A","B","C","D","E"]
b_list = []
n_list = []
while True:
    b = int(input())
    n = int(input())
    b_list.append(b)
    n_list.append(n)
    if b == 4 and n == 1:
        break

def one(list):
    list.append(list[0])
    list.remove(list[0])

def two(list):
    list.insert(0, list.pop())

def three(list):
    list[0],list[1] = list[1],list[0]


for ele in b_list:
    if ele == 1:
        e = b_list.index(ele)
        if n_list[e] == 1:
            one(set_up)
        elif n_list[e] == 2:
            for i in range(2):
                one(set_up)
        elif n_list[e] == 3:
            for i in range(3):
                one(set_up)
        elif n_list[e] == 4:
            for i in range(4):
                one(set_up)
        elif n_list[e] == 5:
            for i in range(5):
                one(set_up)
        elif n_list[e] == 6:
            for i in range(6):
                one(set_up)
        elif n_list[e] == 7:
            for i in range(7):
                one(set_up)
        elif n_list[e] == 8:
            for i in range(8):
                one(set_up)
        elif n_list[e] == 9:
            for i in range(9):
                one(set_up)
        elif n_list[e] == 10:
            for i in range(10):
                one(set_up)
    elif ele == 2:
        x = b_list.index(ele)
        if n_list[x] == 1:
            two(set_up)
        elif n_list[x] == 2:
            for i in range(2):
                two(set_up)
        elif n_list[x] == 3:
            for i in range(3):
                two(set_up)
        elif n_list[x] == 4:
            for i in range(4):
                two(set_up)
        elif n_list[x] == 5:
            for i in range(5):
                two(set_up)
        elif n_list[x] == 6:
            for i in range(6):
                two(set_up)
        elif n_list[x] == 7:
            for i in range(7):
                two(set_up)
        elif n_list[x] == 8:
            for i in range(8):
                two(set_up)
        elif n_list[x] == 9:
            for i in range(9):
                two(set_up)
        elif n_list[x] == 10:
            for i in range(10):
                two(set_up)
    elif ele == 3:
        y = b_list.index(ele)
        if n_list[y]%2==0:
            continue
        else:
            three(set_up)
for i in set_up:
    print(i,end=" ")
