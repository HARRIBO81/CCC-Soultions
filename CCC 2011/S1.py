french = 0
english = 0
array = []
french_arr = []
english_arr = []
n = int(input())
for i in range(n):
    x = input()
    array.append(x)
counter = 0
for i in array:
    english_arr.append(i.count("t"))
    english_arr.append(i.count("T"))
    french_arr.append(i.count("s"))
    french_arr.count(i.count("S"))
if sum(english_arr) > sum(french_arr):
    print("English")
elif sum(english_arr) < sum(french_arr):
    print("French")
else:
    print("French")
